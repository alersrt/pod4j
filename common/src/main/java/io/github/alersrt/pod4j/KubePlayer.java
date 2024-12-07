package io.github.alersrt.pod4j;

import io.github.alersrt.pod4j.exceptions.PodmanException;
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.api.PodsApi;
import io.github.alersrt.pod4j.openapi.model.PlayKubeReport;
import okhttp3.OkHttpClient;
import okhttp3.unixdomainsockets.UnixDomainSocketFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Work with /kube/play API.
 */
public class KubePlayer implements GenericContainer {

    private final ApiClient api;
    private final String yamlPath;

    private final List<ServiceBinding> servicesBindings = new ArrayList<>();

    /**
     * Creates player with specified path for k8s YAML specification.
     * The socket path is autodetected via {@code PODMAN_SOCKET} environment variable.
     *
     * @param yamlPath path to k8s YAML specification.
     * @throws PodmanException if {@link #yamlPath} is empty or error during initialization is happened.
     */
    public KubePlayer(String yamlPath) throws PodmanException {
        this(System.getenv(Constants.ENV_PODMAN_SOCKET), yamlPath);
    }

    /**
     * Creates player with specified paths for socket file and k8s YAML specification.
     * The socket path is autodetected via {@code PODMAN_SOCKET} environment variable.
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
    }

    @Override
    public KubePlayer withExposedService(String serviceName, int exposedPort) throws PodmanException {
        final Predicate<ServiceBinding> isBindingExist = serviceBinding -> Objects.equals(serviceBinding.getServiceName(), serviceName)
                && Objects.equals(serviceBinding.getExposedPort(), exposedPort);

        if (!servicesBindings.isEmpty() && servicesBindings.stream().anyMatch(isBindingExist)) {
            throw new PodmanException("Binging[serviceName=%s, exposedPort=%d] already exists".formatted(serviceName, exposedPort));
        }

        final String mappedHost = "localhost"; // TODO: need to think how to get the proper hostname.
        final int mappedPort = findFreePort();

        servicesBindings.add(new ServiceBinding(serviceName, mappedHost, exposedPort, mappedPort));
        return this;
    }

    @Override
    public void start() throws PodmanException {
        final var podsApi = new PodsApi(this.api);

        String yaml = null;
        try {
            yaml = readFile(this.yamlPath);
        } catch (IOException e) {
            throw new PodmanException(e);
        }

        PlayKubeReport report = null;
        try {
            report = podsApi.playKubeLibpod()
                    .publishPorts(servicesBindings.stream().map(serviceBinding -> "%d:%d".formatted(serviceBinding.getMappedPort(), serviceBinding.getExposedPort())).collect(Collectors.toList()))
                    .wait(true)
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
            yaml = readFile(this.yamlPath);
        } catch (IOException e) {
            throw new PodmanException(e);
        }
        try {
            pods.playKubeDownLibpod()
                    .force(true)
                    .request(yaml)
                    .execute();
        } catch (ApiException e) {
            throw new RuntimeException(e);
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

    private int findFreePort() throws PodmanException {
        Integer result = null;
        for (int port : IntStream.range(34400, 34500).toArray()) {
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                if (serverSocket != null && serverSocket.getLocalPort() == port) {
                    result = port;
                    break;
                }
            } catch (IOException ignored) {
            }
        }

        if (result == null) {
            throw new PodmanException("There is no free port");
        }

        return result;
    }

    private String readFile(String filename) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
}
