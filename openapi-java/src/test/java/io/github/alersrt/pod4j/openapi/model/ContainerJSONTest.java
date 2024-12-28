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
import io.github.alersrt.pod4j.openapi.model.Config;
import io.github.alersrt.pod4j.openapi.model.ContainerNode;
import io.github.alersrt.pod4j.openapi.model.ContainerState;
import io.github.alersrt.pod4j.openapi.model.GraphDriverData;
import io.github.alersrt.pod4j.openapi.model.HostConfig;
import io.github.alersrt.pod4j.openapi.model.MountPoint;
import io.github.alersrt.pod4j.openapi.model.NetworkSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ContainerJSON
 */
public class ContainerJSONTest {
    private final ContainerJSON model = new ContainerJSON();

    /**
     * Model tests for ContainerJSON
     */
    @Test
    public void testContainerJSON() {
        // TODO: test ContainerJSON
    }

    /**
     * Test the property 'appArmorProfile'
     */
    @Test
    public void appArmorProfileTest() {
        // TODO: test appArmorProfile
    }

    /**
     * Test the property 'args'
     */
    @Test
    public void argsTest() {
        // TODO: test args
    }

    /**
     * Test the property 'config'
     */
    @Test
    public void configTest() {
        // TODO: test config
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'driver'
     */
    @Test
    public void driverTest() {
        // TODO: test driver
    }

    /**
     * Test the property 'execIDs'
     */
    @Test
    public void execIDsTest() {
        // TODO: test execIDs
    }

    /**
     * Test the property 'graphDriver'
     */
    @Test
    public void graphDriverTest() {
        // TODO: test graphDriver
    }

    /**
     * Test the property 'hostConfig'
     */
    @Test
    public void hostConfigTest() {
        // TODO: test hostConfig
    }

    /**
     * Test the property 'hostnamePath'
     */
    @Test
    public void hostnamePathTest() {
        // TODO: test hostnamePath
    }

    /**
     * Test the property 'hostsPath'
     */
    @Test
    public void hostsPathTest() {
        // TODO: test hostsPath
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'image'
     */
    @Test
    public void imageTest() {
        // TODO: test image
    }

    /**
     * Test the property 'logPath'
     */
    @Test
    public void logPathTest() {
        // TODO: test logPath
    }

    /**
     * Test the property 'mountLabel'
     */
    @Test
    public void mountLabelTest() {
        // TODO: test mountLabel
    }

    /**
     * Test the property 'mounts'
     */
    @Test
    public void mountsTest() {
        // TODO: test mounts
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'networkSettings'
     */
    @Test
    public void networkSettingsTest() {
        // TODO: test networkSettings
    }

    /**
     * Test the property 'node'
     */
    @Test
    public void nodeTest() {
        // TODO: test node
    }

    /**
     * Test the property 'path'
     */
    @Test
    public void pathTest() {
        // TODO: test path
    }

    /**
     * Test the property 'platform'
     */
    @Test
    public void platformTest() {
        // TODO: test platform
    }

    /**
     * Test the property 'processLabel'
     */
    @Test
    public void processLabelTest() {
        // TODO: test processLabel
    }

    /**
     * Test the property 'resolvConfPath'
     */
    @Test
    public void resolvConfPathTest() {
        // TODO: test resolvConfPath
    }

    /**
     * Test the property 'restartCount'
     */
    @Test
    public void restartCountTest() {
        // TODO: test restartCount
    }

    /**
     * Test the property 'sizeRootFs'
     */
    @Test
    public void sizeRootFsTest() {
        // TODO: test sizeRootFs
    }

    /**
     * Test the property 'sizeRw'
     */
    @Test
    public void sizeRwTest() {
        // TODO: test sizeRw
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

}