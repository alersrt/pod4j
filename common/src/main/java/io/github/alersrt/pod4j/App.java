package io.github.alersrt.pod4j;


import io.github.alersrt.pod4j.openapi.ApiException;

import java.io.IOException;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        var podman = new KubePlayer(
                "/var/run/user/1000/podman/podman.sock",
                Paths.get("common/src/main/resources/nginx.yaml").toAbsolutePath().toString()
        );
        podman.start();
        System.out.println(podman.getMappedPort("nginx", "80"));
        podman.stop();
    }
}
