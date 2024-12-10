package io.github.alersrt.pod4j;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

class KubePlayerTest {

    @Test
    void startStop() throws Exception {
        /*------ Arranges ------*/
        final String socketPath = "/var/run/user/1000/podman/podman.sock";
        final String yamlPath = Paths.get("src/test/resources/").toAbsolutePath().toString();

        final String serviceName = "nginx";
        final int exposedPort = 80;

        var client = new OkHttpClient.Builder().build();

        try (var testedUnit = new KubePlayer(socketPath, yamlPath).withExposedService(serviceName, exposedPort)) {

            /*------ Actions ------*/
            testedUnit.start();

            var mappedPort = testedUnit.getMappedPort(serviceName, exposedPort);
            var result = client
                    .newCall(new Request.Builder().url("http://localhost:%d".formatted(mappedPort)).build())
                    .execute();
            testedUnit.stop();

            /*------ Asserts ------*/
            Assertions.assertNotEquals(mappedPort, exposedPort);
            Assertions.assertTrue(result.isSuccessful());
        }
    }
}