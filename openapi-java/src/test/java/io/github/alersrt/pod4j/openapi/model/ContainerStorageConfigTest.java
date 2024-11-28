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

/**
 * Model tests for ContainerStorageConfig
 */
public class ContainerStorageConfigTest {
    private final ContainerStorageConfig model = new ContainerStorageConfig();

    /**
     * Model tests for ContainerStorageConfig
     */
    @Test
    public void testContainerStorageConfig() {
        // TODO: test ContainerStorageConfig
    }

    /**
     * Test the property 'chrootDirectories'
     */
    @Test
    public void chrootDirectoriesTest() {
        // TODO: test chrootDirectories
    }

    /**
     * Test the property 'createWorkingDir'
     */
    @Test
    public void createWorkingDirTest() {
        // TODO: test createWorkingDir
    }

    /**
     * Test the property 'deviceCgroupRule'
     */
    @Test
    public void deviceCgroupRuleTest() {
        // TODO: test deviceCgroupRule
    }

    /**
     * Test the property 'devices'
     */
    @Test
    public void devicesTest() {
        // TODO: test devices
    }

    /**
     * Test the property 'devicesFrom'
     */
    @Test
    public void devicesFromTest() {
        // TODO: test devicesFrom
    }

    /**
     * Test the property 'hostDeviceList'
     */
    @Test
    public void hostDeviceListTest() {
        // TODO: test hostDeviceList
    }

    /**
     * Test the property 'image'
     */
    @Test
    public void imageTest() {
        // TODO: test image
    }

    /**
     * Test the property 'imageArch'
     */
    @Test
    public void imageArchTest() {
        // TODO: test imageArch
    }

    /**
     * Test the property 'imageOs'
     */
    @Test
    public void imageOsTest() {
        // TODO: test imageOs
    }

    /**
     * Test the property 'imageVariant'
     */
    @Test
    public void imageVariantTest() {
        // TODO: test imageVariant
    }

    /**
     * Test the property 'imageVolumeMode'
     */
    @Test
    public void imageVolumeModeTest() {
        // TODO: test imageVolumeMode
    }

    /**
     * Test the property 'imageVolumes'
     */
    @Test
    public void imageVolumesTest() {
        // TODO: test imageVolumes
    }

    /**
     * Test the property 'init'
     */
    @Test
    public void initTest() {
        // TODO: test init
    }

    /**
     * Test the property 'initPath'
     */
    @Test
    public void initPathTest() {
        // TODO: test initPath
    }

    /**
     * Test the property 'ipcns'
     */
    @Test
    public void ipcnsTest() {
        // TODO: test ipcns
    }

    /**
     * Test the property 'mounts'
     */
    @Test
    public void mountsTest() {
        // TODO: test mounts
    }

    /**
     * Test the property 'overlayVolumes'
     */
    @Test
    public void overlayVolumesTest() {
        // TODO: test overlayVolumes
    }

    /**
     * Test the property 'rawImageName'
     */
    @Test
    public void rawImageNameTest() {
        // TODO: test rawImageName
    }

    /**
     * Test the property 'rootfs'
     */
    @Test
    public void rootfsTest() {
        // TODO: test rootfs
    }

    /**
     * Test the property 'rootfsMapping'
     */
    @Test
    public void rootfsMappingTest() {
        // TODO: test rootfsMapping
    }

    /**
     * Test the property 'rootfsOverlay'
     */
    @Test
    public void rootfsOverlayTest() {
        // TODO: test rootfsOverlay
    }

    /**
     * Test the property 'rootfsPropagation'
     */
    @Test
    public void rootfsPropagationTest() {
        // TODO: test rootfsPropagation
    }

    /**
     * Test the property 'secrets'
     */
    @Test
    public void secretsTest() {
        // TODO: test secrets
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
     * Test the property 'storageOpts'
     */
    @Test
    public void storageOptsTest() {
        // TODO: test storageOpts
    }

    /**
     * Test the property '_volatile'
     */
    @Test
    public void _volatileTest() {
        // TODO: test _volatile
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

    /**
     * Test the property 'workDir'
     */
    @Test
    public void workDirTest() {
        // TODO: test workDir
    }

}
