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
import io.github.alersrt.pod4j.openapi.model.DisconnectOptions;
import io.github.alersrt.pod4j.openapi.model.Network;
import io.github.alersrt.pod4j.openapi.model.NetworkConnectOptions;
import io.github.alersrt.pod4j.openapi.model.NetworkCreateLibpod;
import io.github.alersrt.pod4j.openapi.model.NetworkInspectReport;
import io.github.alersrt.pod4j.openapi.model.NetworkPruneReport;
import io.github.alersrt.pod4j.openapi.model.NetworkRmReport;
import io.github.alersrt.pod4j.openapi.model.NetworkUpdateOptions;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for NetworksApi */
@Disabled
public class NetworksApiTest {

    private final NetworksApi api = new NetworksApi();

    /**
     * Connect container to network
     *
     * <p>Connect a container to a network.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkConnectLibpodTest() throws ApiException {
        String name = null;
        NetworkConnectOptions create = null;
        api.networkConnectLibpod(name, create);
        // TODO: test validations
    }

    /**
     * Create network
     *
     * <p>Create a new network configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkCreateLibpodTest() throws ApiException {
        NetworkCreateLibpod create = null;
        Network response = api.networkCreateLibpod(create);
        // TODO: test validations
    }

    /**
     * Remove a network
     *
     * <p>Remove a configured network
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkDeleteLibpodTest() throws ApiException {
        String name = null;
        Boolean force = null;
        List<NetworkRmReport> response = api.networkDeleteLibpod(name, force);
        // TODO: test validations
    }

    /**
     * Disconnect container from network
     *
     * <p>Disconnect a container from a network.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkDisconnectLibpodTest() throws ApiException {
        String name = null;
        DisconnectOptions create = null;
        api.networkDisconnectLibpod(name, create);
        // TODO: test validations
    }

    /**
     * Network exists
     *
     * <p>Check if network exists
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkExistsLibpodTest() throws ApiException {
        String name = null;
        api.networkExistsLibpod(name);
        // TODO: test validations
    }

    /**
     * Inspect a network
     *
     * <p>Display configuration for a network.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkInspectLibpodTest() throws ApiException {
        String name = null;
        NetworkInspectReport response = api.networkInspectLibpod(name);
        // TODO: test validations
    }

    /**
     * List networks
     *
     * <p>Display summary of network configurations. - In a 200 response, all of the fields named
     * Bytes are returned as a Base64 encoded string.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkListLibpodTest() throws ApiException {
        String filters = null;
        List<Network> response = api.networkListLibpod(filters);
        // TODO: test validations
    }

    /**
     * Delete unused networks
     *
     * <p>Remove networks that do not have containers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkPruneLibpodTest() throws ApiException {
        String filters = null;
        List<NetworkPruneReport> response = api.networkPruneLibpod(filters);
        // TODO: test validations
    }

    /**
     * Update existing podman network
     *
     * <p>Update existing podman network
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkUpdateLibpodTest() throws ApiException {
        String name = null;
        NetworkUpdateOptions update = null;
        api.networkUpdateLibpod(name, update);
        // TODO: test validations
    }
}
