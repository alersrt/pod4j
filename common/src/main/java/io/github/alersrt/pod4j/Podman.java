package io.github.alersrt.pod4j;

import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.api.PodsApi;
import okhttp3.OkHttpClient;
import okhttp3.unixdomainsockets.UnixDomainSocketFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Podman {

    private final ApiClient api;

    public Podman(String socketPath) {
        var socketFile = new File(socketPath);
        var httpClient = new OkHttpClient.Builder()
                .socketFactory(new UnixDomainSocketFactory(socketFile))
                .build();
        this.api = new ApiClient()
                .setHttpClient(httpClient)
                .setBasePath("http://localhost/v5.0.0");
    }

    public void start(String yamlPath) throws ApiException, IOException {
        final var pods = new PodsApi(api);
        String yaml = readFile(yamlPath);
        pods.playKubeLibpod(
                null,
                null,
                null,
                null,
                null,
                false,
                false,
                null,
                false,
                true,
                true,
                true,
                null,
                null,
                false,
                null,
                true,
                false,
                yaml
        );
    }

    public void stop(String yamlPath) throws ApiException, IOException {
        final var pods = new PodsApi(api);
        String yaml = readFile(yamlPath);
        pods.playKubeDownLibpod(true, yaml);
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
