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


package io.github.alersrt.pod4j.openapi.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.model.EndpointIPAMConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for EndpointSettings
 */
public class EndpointSettingsTest {
    private final EndpointSettings model = new EndpointSettings();

    /**
     * Model tests for EndpointSettings
     */
    @Test
    public void testEndpointSettings() {
        // TODO: test EndpointSettings
    }

    /**
     * Test the property 'aliases'
     */
    @Test
    public void aliasesTest() {
        // TODO: test aliases
    }

    /**
     * Test the property 'dnSNames'
     */
    @Test
    public void dnSNamesTest() {
        // TODO: test dnSNames
    }

    /**
     * Test the property 'driverOpts'
     */
    @Test
    public void driverOptsTest() {
        // TODO: test driverOpts
    }

    /**
     * Test the property 'endpointID'
     */
    @Test
    public void endpointIDTest() {
        // TODO: test endpointID
    }

    /**
     * Test the property 'gateway'
     */
    @Test
    public void gatewayTest() {
        // TODO: test gateway
    }

    /**
     * Test the property 'globalIPv6Address'
     */
    @Test
    public void globalIPv6AddressTest() {
        // TODO: test globalIPv6Address
    }

    /**
     * Test the property 'globalIPv6PrefixLen'
     */
    @Test
    public void globalIPv6PrefixLenTest() {
        // TODO: test globalIPv6PrefixLen
    }

    /**
     * Test the property 'ipAMConfig'
     */
    @Test
    public void ipAMConfigTest() {
        // TODO: test ipAMConfig
    }

    /**
     * Test the property 'ipAddress'
     */
    @Test
    public void ipAddressTest() {
        // TODO: test ipAddress
    }

    /**
     * Test the property 'ipPrefixLen'
     */
    @Test
    public void ipPrefixLenTest() {
        // TODO: test ipPrefixLen
    }

    /**
     * Test the property 'ipv6Gateway'
     */
    @Test
    public void ipv6GatewayTest() {
        // TODO: test ipv6Gateway
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

    /**
     * Test the property 'macAddress'
     */
    @Test
    public void macAddressTest() {
        // TODO: test macAddress
    }

    /**
     * Test the property 'networkID'
     */
    @Test
    public void networkIDTest() {
        // TODO: test networkID
    }

}
