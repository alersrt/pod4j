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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for HealthcheckConfig
 */
public class HealthcheckConfigTest {
    private final HealthcheckConfig model = new HealthcheckConfig();

    /**
     * Model tests for HealthcheckConfig
     */
    @Test
    public void testHealthcheckConfig() {
        // TODO: test HealthcheckConfig
    }

    /**
     * Test the property 'interval'
     */
    @Test
    public void intervalTest() {
        // TODO: test interval
    }

    /**
     * Test the property 'retries'
     */
    @Test
    public void retriesTest() {
        // TODO: test retries
    }

    /**
     * Test the property 'startInterval'
     */
    @Test
    public void startIntervalTest() {
        // TODO: test startInterval
    }

    /**
     * Test the property 'startPeriod'
     */
    @Test
    public void startPeriodTest() {
        // TODO: test startPeriod
    }

    /**
     * Test the property 'test'
     */
    @Test
    public void testTest() {
        // TODO: test test
    }

    /**
     * Test the property 'timeout'
     */
    @Test
    public void timeoutTest() {
        // TODO: test timeout
    }

}
