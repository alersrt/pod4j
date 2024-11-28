package io.github.alersrt.pod4j;


import io.github.alersrt.pod4j.openapi.ApiException;

import java.io.IOException;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) throws ApiException, IOException {
        var podman = new Podman("/var/run/user/1000/podman/podman.sock");
        podman.start(Paths.get("common/src/main/resources/nginx.yaml").toAbsolutePath().toString());
        podman.stop(Paths.get("common/src/main/resources/nginx.yaml").toAbsolutePath().toString());
    }
}
