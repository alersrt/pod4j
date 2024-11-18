package io.github.alersrt.pod4j;



public class Main {
    public static void main(String[] args) throws ApiException {
        var apiClient = Configuration.getDefaultApiClient()
                .setBasePath("http+unix://run/user/1000/podman/podman.sock");
        var pods = new PodsApi(apiClient);
        pods.podListLibpod("").forEach(System.out::println);

        System.out.println("Hello world!");
    }
}