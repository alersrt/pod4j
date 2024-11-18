package io.github.alersrt.pod4j;


import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.api.ImagesApi;
import okhttp3.OkHttpClient;
import okhttp3.unixdomainsockets.UnixDomainSocketFactory;

import java.io.File;

public class Main {
    public static void main(String[] args) throws ApiException {
        var socketFile = new File("/run/user/1000/podman/podman.sock");
        var httpClient = new OkHttpClient.Builder()
                .socketFactory(new UnixDomainSocketFactory(socketFile))
                .build();

        var apiClient = new ApiClient(httpClient).setBasePath("http://d/v5.0.0");
        var imagesApi = new ImagesApi(apiClient);
        imagesApi.imageListLibpod(true, null).forEach(System.out::println);

        System.out.println("Hello world!");
    }
}