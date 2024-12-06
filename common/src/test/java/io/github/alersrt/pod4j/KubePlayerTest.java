package io.github.alersrt.pod4j;

import io.github.alersrt.pod4j.openapi.ApiException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

class KubePlayerTest {

    @Test
    void startStop() throws IOException, ApiException, InterruptedException {
        /*------ Arranges ------*/
        var testedUnit = new KubePlayer(
                "/var/run/user/1000/podman/podman.sock",
                Paths.get("src/test/resources/nginx.yaml").toAbsolutePath().toString()
        );

        /*------ Actions ------*/
        testedUnit.start();
        TimeUnit.SECONDS.sleep(60);
        testedUnit.stop();

        /*------ Asserts ------*/
    }
}