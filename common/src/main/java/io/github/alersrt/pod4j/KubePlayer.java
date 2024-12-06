package io.github.alersrt.pod4j;

import io.github.alersrt.pod4j.exceptions.PodmanException;
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;
import io.github.alersrt.pod4j.openapi.api.PodsApi;
import io.github.alersrt.pod4j.openapi.model.PlayKubeReport;
import okhttp3.OkHttpClient;
import okhttp3.unixdomainsockets.UnixDomainSocketFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Work with /kube/play API.
 */
public class KubePlayer {

    private final ApiClient api;
    private final String yamlPath;

    private final Map<String, ServiceBinding> portsBindings = new HashMap<>();
    private PlayKubeReport report = null;

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

    /**
     * Specify service for expose.
     *
     * @param serviceName name of service to expose.
     * @param exposedPort port to expose.
     * @return player with exposed services.
     */
    public KubePlayer withExposedService(String serviceName, int exposedPort) {
        portsBindings.put(serviceName, new ServiceBinding(
                serviceName,
                "", //TODO
                exposedPort,
                12 //TODO
        ));
        return this;
    }

    /**
     * Creates the pod and immediately starts it. All created resources will be
     * cleared out when a SIGTERM is received or pods exit.
     *
     * @throws ApiException
     * @throws IOException
     */
    public void start() throws ApiException, IOException {
        final var podsApi = new PodsApi(this.api);
        final var containersApi = new ContainersApi(this.api);

        String yaml = readFile(this.yamlPath);
        this.report = podsApi.playKubeLibpod()
                .wait(true)
                .start(true)
                .request(yaml)
                .execute();

        if (this.report == null || this.report.getPods() == null || this.report.getPods().isEmpty()) {
            throw new PodmanException("There is no related pods");
        }
        if (this.report.getPods().size() > 1) {
            throw new PodmanException("There should be only one pod");
        }

        //TODO
//        for (PlayKubePod playKubePod : this.report.getPods()) {
//            var podInfo = podsApi.podInspectLibpod(playKubePod.getID()).execute();
//            podInfo.getInfraConfig().getPortBindings()
//            for (String playKubeContainer : playKubePod.getContainers()) {
//                containersApi.ins
//            }
//        }
    }

    /**
     * Stops the pod with clearing created volumes.
     *
     * @throws ApiException
     * @throws IOException
     */
    public void stop() throws ApiException, IOException {
        final var pods = new PodsApi(this.api);
        String yaml = readFile(this.yamlPath);
        pods.playKubeDownLibpod()
                .force(true)
                .request(yaml)
                .execute();
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
