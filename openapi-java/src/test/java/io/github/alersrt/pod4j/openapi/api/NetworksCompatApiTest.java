/*
 * supports a RESTful API for the Libpod library
 * This documentation describes the Podman v2.x+ RESTful API. It consists of a Docker-compatible API and a Libpod API providing support for Podman’s unique features such as pods.  To start the service and keep it running for 5,000 seconds (-t 0 runs forever):  podman system service -t 5000 &  You can then use cURL on the socket using requests documented below.  NOTE: if you install the package podman-docker, it will create a symbolic link for /run/docker.sock to /run/podman/podman.sock  NOTE: Some fields in the API response JSON are encoded as omitempty, which means that if said field has a zero value, they will not be encoded in the API response. This is a feature to help reduce the size of the JSON responses returned via the API.  NOTE: Due to the limitations of [go-swagger](https://github.com/go-swagger/go-swagger), some field values that have a complex type show up as null in the docs as well as in the API responses. This is because the zero value for the field type is null. The field description in the docs will state what type the field is expected to be for such cases.  See podman-system-service(1) for more information.  Quick Examples:  'podman info'  curl --unix-socket /run/podman/podman.sock http://d/v5.0.0/libpod/info  'podman pull quay.io/containers/podman'  curl -XPOST --unix-socket /run/podman/podman.sock -v 'http://d/v5.0.0/images/create?fromImage=quay.io%2Fcontainers%2Fpodman'  'podman list images'  curl --unix-socket /run/podman/podman.sock -v 'http://d/v5.0.0/libpod/images/json' | jq
 *
 * The version of the OpenAPI document: 5.0.0
 * Contact: podman@lists.podman.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.alersrt.pod4j.openapi.api;

import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.model.ConnectOptions;
import io.github.alersrt.pod4j.openapi.model.CreateRequest;
import io.github.alersrt.pod4j.openapi.model.DisconnectOptions;
import io.github.alersrt.pod4j.openapi.model.ErrorModel;
import io.github.alersrt.pod4j.openapi.model.Inspect;
import io.github.alersrt.pod4j.openapi.model.NetworkCreate201Response;
import io.github.alersrt.pod4j.openapi.model.NetworkPrune200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * API tests for NetworksCompatApi
 */
@Disabled
public class NetworksCompatApiTest {

    private final NetworksCompatApi api = new NetworksCompatApi();


    /**
     * Connect container to network
     *
     * Connect a container to a network
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkConnectTest() throws ApiException {
        String name = null;
        ConnectOptions create = null;

        api.networkConnect(name, create);

        // TODO: test validations
    }

    /**
     * Create network
     *
     * Create a network configuration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkCreateTest() throws ApiException {
        CreateRequest create = null;
        NetworkCreate201Response response =
                api.networkCreate(create);
        
        // TODO: test validations
    }

    /**
     * Remove a network
     *
     * Remove a network
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkDeleteTest() throws ApiException {
        String name = null;

        api.networkDelete(name);

        // TODO: test validations
    }

    /**
     * Disconnect container from network
     *
     * Disconnect a container from a network
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkDisconnectTest() throws ApiException {
        String name = null;
        DisconnectOptions create = null;

        api.networkDisconnect(name, create);

        // TODO: test validations
    }

    /**
     * Inspect a network
     *
     * Display low level configuration network
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkInspectTest() throws ApiException {
        String name = null;
        Boolean verbose = null;
        String scope = null;
        Inspect response =
                api.networkInspect(name, verbose, scope);
        
        // TODO: test validations
    }

    /**
     * List networks
     *
     * Display summary of network configurations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkListTest() throws ApiException {
        String filters = null;
        List<Inspect> response =
                api.networkList(filters);
        
        // TODO: test validations
    }

    /**
     * Delete unused networks
     *
     * Remove networks that do not have containers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkPruneTest() throws ApiException {
        String filters = null;
        NetworkPrune200Response response =
                api.networkPrune(filters);
        
        // TODO: test validations
    }

}
