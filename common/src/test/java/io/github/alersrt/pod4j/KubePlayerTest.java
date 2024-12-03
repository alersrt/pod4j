package io.github.alersrt.pod4j;

import io.github.alersrt.pod4j.openapi.ApiException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class KubePlayerTest {

    @Test
    void startStop() throws IOException, ApiException {
        /*------ Arranges ------*/
        var testedUnit = new KubePlayer(
                "/var/run/user/1000/podman/podman.sock",
                Paths.get("src/main/resources/nginx.yaml").toAbsolutePath().toString()
        );

        /*------ Actions ------*/
        testedUnit.start();
        testedUnit.stop();

        /*------ Asserts ------*/
    }
}