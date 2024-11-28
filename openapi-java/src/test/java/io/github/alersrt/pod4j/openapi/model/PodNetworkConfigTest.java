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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.alersrt.pod4j.openapi.model.Namespace;
import io.github.alersrt.pod4j.openapi.model.PerNetworkOptions;
import io.github.alersrt.pod4j.openapi.model.PortMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for PodNetworkConfig
 */
class PodNetworkConfigTest {
    private final PodNetworkConfig model = new PodNetworkConfig();

    /**
     * Model tests for PodNetworkConfig
     */
    @Test
    void testPodNetworkConfig() {
        // TODO: test PodNetworkConfig
    }

    /**
     * Test the property 'networks'
     */
    @Test
    void networksTest() {
        // TODO: test networks
    }

    /**
     * Test the property 'cniNetworks'
     */
    @Test
    void cniNetworksTest() {
        // TODO: test cniNetworks
    }

    /**
     * Test the property 'dnsOption'
     */
    @Test
    void dnsOptionTest() {
        // TODO: test dnsOption
    }

    /**
     * Test the property 'dnsSearch'
     */
    @Test
    void dnsSearchTest() {
        // TODO: test dnsSearch
    }

    /**
     * Test the property 'dnsServer'
     */
    @Test
    void dnsServerTest() {
        // TODO: test dnsServer
    }

    /**
     * Test the property 'hostadd'
     */
    @Test
    void hostaddTest() {
        // TODO: test hostadd
    }

    /**
     * Test the property 'netns'
     */
    @Test
    void netnsTest() {
        // TODO: test netns
    }

    /**
     * Test the property 'networkOptions'
     */
    @Test
    void networkOptionsTest() {
        // TODO: test networkOptions
    }

    /**
     * Test the property 'noManageHosts'
     */
    @Test
    void noManageHostsTest() {
        // TODO: test noManageHosts
    }

    /**
     * Test the property 'noManageResolvConf'
     */
    @Test
    void noManageResolvConfTest() {
        // TODO: test noManageResolvConf
    }

    /**
     * Test the property 'portmappings'
     */
    @Test
    void portmappingsTest() {
        // TODO: test portmappings
    }

}
