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

public class KubePlayer {

    private final ApiClient api;
    private final String yamlPath;

    private PlayKubeReport report = null;

    public KubePlayer(String yamlPath) throws PodmanException {
        this(System.getenv(Constants.ENV_PODMAN_SOCKET), yamlPath);
    }

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

    public void start() throws ApiException, IOException {
        final var pods = new PodsApi(this.api);
        String yaml = readFile(this.yamlPath);
        this.report = pods.playKubeLibpod()
                .request(yaml)
                .execute();

        if (this.report == null || this.report.getPods() == null || this.report.getPods().isEmpty()) {
            throw new PodmanException("There is no related pods");
        }
        if (this.report.getPods().size() > 1) {
            throw new PodmanException("There should be only one pod");
        }
    }

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
