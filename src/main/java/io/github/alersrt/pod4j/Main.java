package io.github.alersrt.pod4j;


import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.api.ImagesApi;
import io.github.alersrt.pod4j.openapi.api.PodsApi;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.unixdomainsockets.UnixDomainSocketFactory;

import java.io.File;
import java.net.UnixDomainSocketAddress;
import java.net.http.HttpClient;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ApiException {
        var socketFile = new File("/run/user/1000/podman/podman.sock");
        var httpClient = new OkHttpClient.Builder()
                .socketFactory(new UnixDomainSocketFactory(socketFile))
                .protocols(List.of(Protocol.H2_PRIOR_KNOWLEDGE))
                .build();

        var apiClient = new ApiClient(httpClient).setBasePath("http://d/v5.0.0/libpod/");
        var imagesApi = new ImagesApi(apiClient);
        imagesApi.imageListLibpod(true, null).forEach(System.out::println);

        System.out.println("Hello world!");
    }
}