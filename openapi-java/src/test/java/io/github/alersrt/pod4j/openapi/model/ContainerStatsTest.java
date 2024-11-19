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

import org.junit.jupiter.api.Test;

/** Model tests for ContainerStats */
public class ContainerStatsTest {
    private final ContainerStats model = new ContainerStats();

    /** Model tests for ContainerStats */
    @Test
    public void testContainerStats() {
        // TODO: test ContainerStats
    }

    /** Test the property 'avgCPU' */
    @Test
    public void avgCPUTest() {
        // TODO: test avgCPU
    }

    /** Test the property 'blockInput' */
    @Test
    public void blockInputTest() {
        // TODO: test blockInput
    }

    /** Test the property 'blockOutput' */
    @Test
    public void blockOutputTest() {
        // TODO: test blockOutput
    }

    /** Test the property 'CPU' */
    @Test
    public void CPUTest() {
        // TODO: test CPU
    }

    /** Test the property 'cpUNano' */
    @Test
    public void cpUNanoTest() {
        // TODO: test cpUNano
    }

    /** Test the property 'cpUSystemNano' */
    @Test
    public void cpUSystemNanoTest() {
        // TODO: test cpUSystemNano
    }

    /** Test the property 'containerID' */
    @Test
    public void containerIDTest() {
        // TODO: test containerID
    }

    /** Test the property 'duration' */
    @Test
    public void durationTest() {
        // TODO: test duration
    }

    /** Test the property 'memLimit' */
    @Test
    public void memLimitTest() {
        // TODO: test memLimit
    }

    /** Test the property 'memPerc' */
    @Test
    public void memPercTest() {
        // TODO: test memPerc
    }

    /** Test the property 'memUsage' */
    @Test
    public void memUsageTest() {
        // TODO: test memUsage
    }

    /** Test the property 'name' */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /** Test the property 'network' */
    @Test
    public void networkTest() {
        // TODO: test network
    }

    /** Test the property 'piDs' */
    @Test
    public void piDsTest() {
        // TODO: test piDs
    }

    /** Test the property 'perCPU' */
    @Test
    public void perCPUTest() {
        // TODO: test perCPU
    }

    /** Test the property 'systemNano' */
    @Test
    public void systemNanoTest() {
        // TODO: test systemNano
    }

    /** Test the property 'upTime' */
    @Test
    public void upTimeTest() {
        // TODO: test upTime
    }
}
