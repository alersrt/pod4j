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
import io.github.alersrt.pod4j.openapi.model.CPUUsage;
import io.github.alersrt.pod4j.openapi.model.ConmonInfo;
import io.github.alersrt.pod4j.openapi.model.DistributionInfo;
import io.github.alersrt.pod4j.openapi.model.IDMappings;
import io.github.alersrt.pod4j.openapi.model.NetworkInfo;
import io.github.alersrt.pod4j.openapi.model.OCIRuntimeInfo;
import io.github.alersrt.pod4j.openapi.model.PastaInfo;
import io.github.alersrt.pod4j.openapi.model.RemoteSocket;
import io.github.alersrt.pod4j.openapi.model.SecurityInfo;
import io.github.alersrt.pod4j.openapi.model.SlirpInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for HostInfo
 */
public class HostInfoTest {
    private final HostInfo model = new HostInfo();

    /**
     * Model tests for HostInfo
     */
    @Test
    public void testHostInfo() {
        // TODO: test HostInfo
    }

    /**
     * Test the property 'arch'
     */
    @Test
    public void archTest() {
        // TODO: test arch
    }

    /**
     * Test the property 'buildahVersion'
     */
    @Test
    public void buildahVersionTest() {
        // TODO: test buildahVersion
    }

    /**
     * Test the property 'cgroupControllers'
     */
    @Test
    public void cgroupControllersTest() {
        // TODO: test cgroupControllers
    }

    /**
     * Test the property 'cgroupManager'
     */
    @Test
    public void cgroupManagerTest() {
        // TODO: test cgroupManager
    }

    /**
     * Test the property 'cgroupVersion'
     */
    @Test
    public void cgroupVersionTest() {
        // TODO: test cgroupVersion
    }

    /**
     * Test the property 'conmon'
     */
    @Test
    public void conmonTest() {
        // TODO: test conmon
    }

    /**
     * Test the property 'cpuUtilization'
     */
    @Test
    public void cpuUtilizationTest() {
        // TODO: test cpuUtilization
    }

    /**
     * Test the property 'cpus'
     */
    @Test
    public void cpusTest() {
        // TODO: test cpus
    }

    /**
     * Test the property 'databaseBackend'
     */
    @Test
    public void databaseBackendTest() {
        // TODO: test databaseBackend
    }

    /**
     * Test the property 'distribution'
     */
    @Test
    public void distributionTest() {
        // TODO: test distribution
    }

    /**
     * Test the property 'eventLogger'
     */
    @Test
    public void eventLoggerTest() {
        // TODO: test eventLogger
    }

    /**
     * Test the property 'freeLocks'
     */
    @Test
    public void freeLocksTest() {
        // TODO: test freeLocks
    }

    /**
     * Test the property 'hostname'
     */
    @Test
    public void hostnameTest() {
        // TODO: test hostname
    }

    /**
     * Test the property 'idMappings'
     */
    @Test
    public void idMappingsTest() {
        // TODO: test idMappings
    }

    /**
     * Test the property 'kernel'
     */
    @Test
    public void kernelTest() {
        // TODO: test kernel
    }

    /**
     * Test the property 'linkmode'
     */
    @Test
    public void linkmodeTest() {
        // TODO: test linkmode
    }

    /**
     * Test the property 'logDriver'
     */
    @Test
    public void logDriverTest() {
        // TODO: test logDriver
    }

    /**
     * Test the property 'memFree'
     */
    @Test
    public void memFreeTest() {
        // TODO: test memFree
    }

    /**
     * Test the property 'memTotal'
     */
    @Test
    public void memTotalTest() {
        // TODO: test memTotal
    }

    /**
     * Test the property 'networkBackend'
     */
    @Test
    public void networkBackendTest() {
        // TODO: test networkBackend
    }

    /**
     * Test the property 'networkBackendInfo'
     */
    @Test
    public void networkBackendInfoTest() {
        // TODO: test networkBackendInfo
    }

    /**
     * Test the property 'ociRuntime'
     */
    @Test
    public void ociRuntimeTest() {
        // TODO: test ociRuntime
    }

    /**
     * Test the property 'os'
     */
    @Test
    public void osTest() {
        // TODO: test os
    }

    /**
     * Test the property 'pasta'
     */
    @Test
    public void pastaTest() {
        // TODO: test pasta
    }

    /**
     * Test the property 'remoteSocket'
     */
    @Test
    public void remoteSocketTest() {
        // TODO: test remoteSocket
    }

    /**
     * Test the property 'rootlessNetworkCmd'
     */
    @Test
    public void rootlessNetworkCmdTest() {
        // TODO: test rootlessNetworkCmd
    }

    /**
     * Test the property 'runtimeInfo'
     */
    @Test
    public void runtimeInfoTest() {
        // TODO: test runtimeInfo
    }

    /**
     * Test the property 'security'
     */
    @Test
    public void securityTest() {
        // TODO: test security
    }

    /**
     * Test the property 'serviceIsRemote'
     */
    @Test
    public void serviceIsRemoteTest() {
        // TODO: test serviceIsRemote
    }

    /**
     * Test the property 'slirp4netns'
     */
    @Test
    public void slirp4netnsTest() {
        // TODO: test slirp4netns
    }

    /**
     * Test the property 'swapFree'
     */
    @Test
    public void swapFreeTest() {
        // TODO: test swapFree
    }

    /**
     * Test the property 'swapTotal'
     */
    @Test
    public void swapTotalTest() {
        // TODO: test swapTotal
    }

    /**
     * Test the property 'uptime'
     */
    @Test
    public void uptimeTest() {
        // TODO: test uptime
    }

    /**
     * Test the property 'variant'
     */
    @Test
    public void variantTest() {
        // TODO: test variant
    }

}
