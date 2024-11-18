package io.github.alersrt.pod4j;

import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Main {
    public static void main(String[] args) throws ApiException {
        var apiClient = Configuration.getDefaultApiClient()
                .setBasePath("http+unix://run/user/1000/podman/podman.sock");
        var pods = new PodsApi(apiClient);
        pods.podListLibpod("").forEach(System.out::println);

        System.out.println("Hello world!");
    }
}