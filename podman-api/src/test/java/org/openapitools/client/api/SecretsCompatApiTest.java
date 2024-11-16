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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ErrorModel;
import org.openapitools.client.model.SecretCreate;
import org.openapitools.client.model.SecretCreateLibpod201Response;
import org.openapitools.client.model.SecretDeleteLibpod404Response;
import org.openapitools.client.model.SecretInfoReportCompat;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecretsCompatApi
 */
@Disabled
public class SecretsCompatApiTest {

    private final SecretsCompatApi api = new SecretsCompatApi();

    /**
     * Create a secret
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void secretCreateTest() throws ApiException {
        SecretCreate create = null;
        SecretCreateLibpod201Response response = api.secretCreate(create);
        // TODO: test validations
    }

    /**
     * Remove secret
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void secretDeleteTest() throws ApiException {
        String name = null;
        api.secretDelete(name);
        // TODO: test validations
    }

    /**
     * Inspect secret
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void secretInspectTest() throws ApiException {
        String name = null;
        SecretInfoReportCompat response = api.secretInspect(name);
        // TODO: test validations
    }

    /**
     * List secrets
     *
     * Returns a list of secrets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void secretListTest() throws ApiException {
        String filters = null;
        List<SecretInfoReportCompat> response = api.secretList(filters);
        // TODO: test validations
    }

}
