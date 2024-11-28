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
import io.github.alersrt.pod4j.openapi.model.IDMappingOptions;
import io.github.alersrt.pod4j.openapi.model.ImageVolume;
import io.github.alersrt.pod4j.openapi.model.LinuxResources;
import io.github.alersrt.pod4j.openapi.model.LinuxThrottleDevice;
import io.github.alersrt.pod4j.openapi.model.Mount;
import io.github.alersrt.pod4j.openapi.model.NamedVolume;
import io.github.alersrt.pod4j.openapi.model.Namespace;
import io.github.alersrt.pod4j.openapi.model.OverlayVolume;
import io.github.alersrt.pod4j.openapi.model.PerNetworkOptions;
import io.github.alersrt.pod4j.openapi.model.PortMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for PodSpecGenerator
 */
public class PodSpecGeneratorTest {
    private final PodSpecGenerator model = new PodSpecGenerator();

    /**
     * Model tests for PodSpecGenerator
     */
    @Test
    public void testPodSpecGenerator() {
        // TODO: test PodSpecGenerator
    }

    /**
     * Test the property 'networks'
     */
    @Test
    public void networksTest() {
        // TODO: test networks
    }

    /**
     * Test the property 'cgroupParent'
     */
    @Test
    public void cgroupParentTest() {
        // TODO: test cgroupParent
    }

    /**
     * Test the property 'cniNetworks'
     */
    @Test
    public void cniNetworksTest() {
        // TODO: test cniNetworks
    }

    /**
     * Test the property 'cpuPeriod'
     */
    @Test
    public void cpuPeriodTest() {
        // TODO: test cpuPeriod
    }

    /**
     * Test the property 'cpuQuota'
     */
    @Test
    public void cpuQuotaTest() {
        // TODO: test cpuQuota
    }

    /**
     * Test the property 'dnsOption'
     */
    @Test
    public void dnsOptionTest() {
        // TODO: test dnsOption
    }

    /**
     * Test the property 'dnsSearch'
     */
    @Test
    public void dnsSearchTest() {
        // TODO: test dnsSearch
    }

    /**
     * Test the property 'dnsServer'
     */
    @Test
    public void dnsServerTest() {
        // TODO: test dnsServer
    }

    /**
     * Test the property 'exitPolicy'
     */
    @Test
    public void exitPolicyTest() {
        // TODO: test exitPolicy
    }

    /**
     * Test the property 'hostadd'
     */
    @Test
    public void hostaddTest() {
        // TODO: test hostadd
    }

    /**
     * Test the property 'hostname'
     */
    @Test
    public void hostnameTest() {
        // TODO: test hostname
    }

    /**
     * Test the property 'idmappings'
     */
    @Test
    public void idmappingsTest() {
        // TODO: test idmappings
    }

    /**
     * Test the property 'imageVolumes'
     */
    @Test
    public void imageVolumesTest() {
        // TODO: test imageVolumes
    }

    /**
     * Test the property 'infraCommand'
     */
    @Test
    public void infraCommandTest() {
        // TODO: test infraCommand
    }

    /**
     * Test the property 'infraConmonPidFile'
     */
    @Test
    public void infraConmonPidFileTest() {
        // TODO: test infraConmonPidFile
    }

    /**
     * Test the property 'infraImage'
     */
    @Test
    public void infraImageTest() {
        // TODO: test infraImage
    }

    /**
     * Test the property 'infraName'
     */
    @Test
    public void infraNameTest() {
        // TODO: test infraName
    }

    /**
     * Test the property 'ipcns'
     */
    @Test
    public void ipcnsTest() {
        // TODO: test ipcns
    }

    /**
     * Test the property 'labels'
     */
    @Test
    public void labelsTest() {
        // TODO: test labels
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
     * Test the property 'netns'
     */
    @Test
    public void netnsTest() {
        // TODO: test netns
    }

    /**
     * Test the property 'networkOptions'
     */
    @Test
    public void networkOptionsTest() {
        // TODO: test networkOptions
    }

    /**
     * Test the property 'noInfra'
     */
    @Test
    public void noInfraTest() {
        // TODO: test noInfra
    }

    /**
     * Test the property 'noManageHosts'
     */
    @Test
    public void noManageHostsTest() {
        // TODO: test noManageHosts
    }

    /**
     * Test the property 'noManageResolvConf'
     */
    @Test
    public void noManageResolvConfTest() {
        // TODO: test noManageResolvConf
    }

    /**
     * Test the property 'overlayVolumes'
     */
    @Test
    public void overlayVolumesTest() {
        // TODO: test overlayVolumes
    }

    /**
     * Test the property 'pidns'
     */
    @Test
    public void pidnsTest() {
        // TODO: test pidns
    }

    /**
     * Test the property 'podCreateCommand'
     */
    @Test
    public void podCreateCommandTest() {
        // TODO: test podCreateCommand
    }

    /**
     * Test the property 'podDevices'
     */
    @Test
    public void podDevicesTest() {
        // TODO: test podDevices
    }

    /**
     * Test the property 'portmappings'
     */
    @Test
    public void portmappingsTest() {
        // TODO: test portmappings
    }

    /**
     * Test the property 'resourceLimits'
     */
    @Test
    public void resourceLimitsTest() {
        // TODO: test resourceLimits
    }

    /**
     * Test the property 'restartPolicy'
     */
    @Test
    public void restartPolicyTest() {
        // TODO: test restartPolicy
    }

    /**
     * Test the property 'restartTries'
     */
    @Test
    public void restartTriesTest() {
        // TODO: test restartTries
    }

    /**
     * Test the property 'securityOpt'
     */
    @Test
    public void securityOptTest() {
        // TODO: test securityOpt
    }

    /**
     * Test the property 'serviceContainerID'
     */
    @Test
    public void serviceContainerIDTest() {
        // TODO: test serviceContainerID
    }

    /**
     * Test the property 'shareParent'
     */
    @Test
    public void shareParentTest() {
        // TODO: test shareParent
    }

    /**
     * Test the property 'sharedNamespaces'
     */
    @Test
    public void sharedNamespacesTest() {
        // TODO: test sharedNamespaces
    }

    /**
     * Test the property 'shmSize'
     */
    @Test
    public void shmSizeTest() {
        // TODO: test shmSize
    }

    /**
     * Test the property 'shmSizeSystemd'
     */
    @Test
    public void shmSizeSystemdTest() {
        // TODO: test shmSizeSystemd
    }

    /**
     * Test the property 'sysctl'
     */
    @Test
    public void sysctlTest() {
        // TODO: test sysctl
    }

    /**
     * Test the property 'throttleReadBpsDevice'
     */
    @Test
    public void throttleReadBpsDeviceTest() {
        // TODO: test throttleReadBpsDevice
    }

    /**
     * Test the property 'userns'
     */
    @Test
    public void usernsTest() {
        // TODO: test userns
    }

    /**
     * Test the property 'utsns'
     */
    @Test
    public void utsnsTest() {
        // TODO: test utsns
    }

    /**
     * Test the property 'volumes'
     */
    @Test
    public void volumesTest() {
        // TODO: test volumes
    }

    /**
     * Test the property 'volumesFrom'
     */
    @Test
    public void volumesFromTest() {
        // TODO: test volumesFrom
    }

}
