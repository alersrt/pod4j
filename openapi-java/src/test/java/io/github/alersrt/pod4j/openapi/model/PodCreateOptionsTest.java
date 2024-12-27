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
import io.github.alersrt.pod4j.openapi.model.NetOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for PodCreateOptions
 */
public class PodCreateOptionsTest {
    private final PodCreateOptions model = new PodCreateOptions();

    /**
     * Model tests for PodCreateOptions
     */
    @Test
    public void testPodCreateOptions() {
        // TODO: test PodCreateOptions
    }

    /**
     * Test the property 'cgroupParent'
     */
    @Test
    public void cgroupParentTest() {
        // TODO: test cgroupParent
    }

    /**
     * Test the property 'containerCommand'
     */
    @Test
    public void containerCommandTest() {
        // TODO: test containerCommand
    }

    /**
     * Test the property 'containerConmonPidfile'
     */
    @Test
    public void containerConmonPidfileTest() {
        // TODO: test containerConmonPidfile
    }

    /**
     * Test the property 'containerName'
     */
    @Test
    public void containerNameTest() {
        // TODO: test containerName
    }

    /**
     * Test the property 'cpus'
     */
    @Test
    public void cpusTest() {
        // TODO: test cpus
    }

    /**
     * Test the property 'cpusetCpus'
     */
    @Test
    public void cpusetCpusTest() {
        // TODO: test cpusetCpus
    }

    /**
     * Test the property 'createCommand'
     */
    @Test
    public void createCommandTest() {
        // TODO: test createCommand
    }

    /**
     * Test the property 'deviceReadBps'
     */
    @Test
    public void deviceReadBpsTest() {
        // TODO: test deviceReadBps
    }

    /**
     * Test the property 'devices'
     */
    @Test
    public void devicesTest() {
        // TODO: test devices
    }

    /**
     * Test the property 'exitPolicy'
     */
    @Test
    public void exitPolicyTest() {
        // TODO: test exitPolicy
    }

    /**
     * Test the property 'hostname'
     */
    @Test
    public void hostnameTest() {
        // TODO: test hostname
    }

    /**
     * Test the property 'infra'
     */
    @Test
    public void infraTest() {
        // TODO: test infra
    }

    /**
     * Test the property 'infraImage'
     */
    @Test
    public void infraImageTest() {
        // TODO: test infraImage
    }

    /**
     * Test the property 'ipc'
     */
    @Test
    public void ipcTest() {
        // TODO: test ipc
    }

    /**
     * Test the property 'labels'
     */
    @Test
    public void labelsTest() {
        // TODO: test labels
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'net'
     */
    @Test
    public void netTest() {
        // TODO: test net
    }

    /**
     * Test the property 'pid'
     */
    @Test
    public void pidTest() {
        // TODO: test pid
    }

    /**
     * Test the property 'restart'
     */
    @Test
    public void restartTest() {
        // TODO: test restart
    }

    /**
     * Test the property 'securityOpt'
     */
    @Test
    public void securityOptTest() {
        // TODO: test securityOpt
    }

    /**
     * Test the property 'share'
     */
    @Test
    public void shareTest() {
        // TODO: test share
    }

    /**
     * Test the property 'shareParent'
     */
    @Test
    public void shareParentTest() {
        // TODO: test shareParent
    }

    /**
     * Test the property 'sysctl'
     */
    @Test
    public void sysctlTest() {
        // TODO: test sysctl
    }

    /**
     * Test the property 'uts'
     */
    @Test
    public void utsTest() {
        // TODO: test uts
    }

    /**
     * Test the property 'volume'
     */
    @Test
    public void volumeTest() {
        // TODO: test volume
    }

    /**
     * Test the property 'volumesFrom'
     */
    @Test
    public void volumesFromTest() {
        // TODO: test volumesFrom
    }

}
