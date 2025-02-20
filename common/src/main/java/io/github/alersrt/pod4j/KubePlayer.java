package io.github.alersrt.pod4j;

import io.github.alersrt.pod4j.exceptions.PodmanException;
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.api.PodsApi;
import io.github.alersrt.pod4j.openapi.api.SystemApi;
import io.github.alersrt.pod4j.openapi.model.LibpodInfo;
import io.github.alersrt.pod4j.openapi.model.PlayKubeReport;
import okhttp3.OkHttpClient;
import okhttp3.unixdomainsockets.UnixDomainSocketFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;


/**
 * Work with /kube/play API.
 */
public class KubePlayer implements GenericContainer {

    private final ApiClient api;
    private final String yamlPath;
    private final String hostname;

    private final List<ServiceBinding> servicesBindings = new ArrayList<>();

    private boolean doCleanup = true;

    /**
     * Creates player with specified path for k8s YAML specification. The socket path is autodetected via {@code PODMAN_SOCKET} environment
     * variable.
     *
     * @param yamlPath path to k8s YAML specification.
     * @throws PodmanException if {@link #yamlPath} is empty or error during initialization is happened.
     */
    public KubePlayer(String yamlPath) throws PodmanException {
        this(System.getenv(Constants.ENV_PODMAN_SOCKET), yamlPath);
    }

    /**
     * Creates player with specified paths for socket file and k8s YAML specification. The socket path is autodetected via
     * {@code PODMAN_SOCKET} environment variable.
     *
     * @param socketPath path to socket file.
     * @param yamlPath   path to k8s YAML specification.
     * @throws PodmanException if {@link #yamlPath} is empty or error during initialization is happened.
     */
    public KubePlayer(String socketPath, String yamlPath) throws PodmanException {
        if (socketPath == null || socketPath.isEmpty()) {
            throw new PodmanException("Environment variable " + Constants.ENV_PODMAN_SOCKET + " is not set");
        }

        var socketFile = new File(socketPath);
        var httpClient = new OkHttpClient.Builder()
                .socketFactory(new UnixDomainSocketFactory(socketFile))
                .build();
        this.api = new ApiClient()
                .setHttpClient(httpClient)
                .setBasePath("http://localhost/v5.0.0");

        this.yamlPath = yamlPath;

        final SystemApi systemApi = new SystemApi(this.api);

        LibpodInfo libpodInfo = null;
        try {
            libpodInfo = systemApi.systemInfoLibpod().execute();
        } catch (ApiException ex) {
            throw new PodmanException("Doesn't initialized", ex);
        }
        this.hostname = libpodInfo.getHost().getHostname();

        Runtime.getRuntime().addShutdownHook(new Thread(this::stop));
    }

    @Override
    public KubePlayer withExposedService(String serviceName,
                                         int exposedPort) throws PodmanException {
        final Predicate<ServiceBinding> isBindingExist = serviceBinding -> Objects.equals(serviceBinding.getServiceName(), serviceName)
                && Objects.equals(serviceBinding.getExposedPort(), exposedPort);

        if (!servicesBindings.isEmpty() && servicesBindings.stream().anyMatch(isBindingExist)) {
            throw new PodmanException("Binging[serviceName=%s, exposedPort=%d] already exists".formatted(serviceName, exposedPort));
        }

        final int mappedPort = Utils.findFreePort();

        servicesBindings.add(new ServiceBinding(serviceName, this.hostname, exposedPort, mappedPort));
        return this;
    }

    @Override
    public KubePlayer withCleanup(boolean doCleanup) {
        this.doCleanup = doCleanup;
        return this;
    }

    @Override
    public void start() throws PodmanException {
        final var podsApi = new PodsApi(this.api);

        String yaml = null;
        try {
            yaml = Utils.readYaml(this.yamlPath);
        } catch (IOException e) {
            throw new PodmanException(e);
        }

        PlayKubeReport report = null;
        try {
            report = podsApi.playKubeLibpod()
                    .publishPorts(servicesBindings.stream()
                            .map(serviceBinding -> "%d:%d".formatted(
                                    serviceBinding.getMappedPort(),
                                    serviceBinding.getExposedPort()
                            ))
                            .toList())
                    .wait(this.doCleanup)
                    .start(true)
                    .request(yaml)
                    .execute();
        } catch (ApiException e) {
            throw new PodmanException(e);
        }

        if (report == null || report.getPods() == null || report.getPods().isEmpty()) {
            throw new PodmanException("There is no related pods");
        }
    }

    @Override
    public void stop() throws PodmanException {
        final var pods = new PodsApi(this.api);

        String yaml = null;
        try {
            yaml = Utils.readYaml(this.yamlPath);
        } catch (IOException e) {
            throw new PodmanException(e);
        }

        try {
            pods.playKubeDownLibpod()
                    .force(true)
                    .request(yaml)
                    .execute();
        } catch (ApiException e) {
            throw new PodmanException(e);
        }
    }

    @Override
    public String getMappedHost(String serviceName, int exposedPort) {
        final Predicate<ServiceBinding> isBindingExist = serviceBinding -> Objects.equals(serviceBinding.getServiceName(), serviceName)
                && Objects.equals(serviceBinding.getExposedPort(), exposedPort);
        return this.servicesBindings
                .stream()
                .filter(isBindingExist)
                .map(ServiceBinding::getMappedHost)
                .findAny()
                .orElse(null);
    }

    @Override
    public int getMappedPort(String serviceName, int exposedPort) throws PodmanException {
        final Predicate<ServiceBinding> isBindingExist = serviceBinding -> Objects.equals(serviceBinding.getServiceName(), serviceName)
                && Objects.equals(serviceBinding.getExposedPort(), exposedPort);
        return this.servicesBindings
                .stream()
                .filter(isBindingExist)
                .map(ServiceBinding::getMappedPort)
                .findAny()
                .orElseThrow(() -> new PodmanException("Here is no mapped port"));
    }
}
