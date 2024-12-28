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
import io.github.alersrt.pod4j.openapi.model.LinuxDevice;
import io.github.alersrt.pod4j.openapi.model.LinuxDeviceCgroup;
import io.github.alersrt.pod4j.openapi.model.LinuxIntelRdt;
import io.github.alersrt.pod4j.openapi.model.LinuxPersonality;
import io.github.alersrt.pod4j.openapi.model.LinuxResources;
import io.github.alersrt.pod4j.openapi.model.LinuxThrottleDevice;
import io.github.alersrt.pod4j.openapi.model.LinuxWeightDevice;
import io.github.alersrt.pod4j.openapi.model.LogConfigLibpod;
import io.github.alersrt.pod4j.openapi.model.Mount;
import io.github.alersrt.pod4j.openapi.model.NamedVolume;
import io.github.alersrt.pod4j.openapi.model.Namespace;
import io.github.alersrt.pod4j.openapi.model.OverlayVolume;
import io.github.alersrt.pod4j.openapi.model.POSIXRlimit;
import io.github.alersrt.pod4j.openapi.model.PerNetworkOptions;
import io.github.alersrt.pod4j.openapi.model.PortMapping;
import io.github.alersrt.pod4j.openapi.model.Schema2HealthConfig;
import io.github.alersrt.pod4j.openapi.model.Secret;
import io.github.alersrt.pod4j.openapi.model.StartupHealthCheck;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for SpecGenerator
 */
public class SpecGeneratorTest {
    private final SpecGenerator model = new SpecGenerator();

    /**
     * Model tests for SpecGenerator
     */
    @Test
    public void testSpecGenerator() {
        // TODO: test SpecGenerator
    }

    /**
     * Test the property 'networks'
     */
    @Test
    public void networksTest() {
        // TODO: test networks
    }

    /**
     * Test the property 'annotations'
     */
    @Test
    public void annotationsTest() {
        // TODO: test annotations
    }

    /**
     * Test the property 'apparmorProfile'
     */
    @Test
    public void apparmorProfileTest() {
        // TODO: test apparmorProfile
    }

    /**
     * Test the property 'baseHostsFile'
     */
    @Test
    public void baseHostsFileTest() {
        // TODO: test baseHostsFile
    }

    /**
     * Test the property 'capAdd'
     */
    @Test
    public void capAddTest() {
        // TODO: test capAdd
    }

    /**
     * Test the property 'capDrop'
     */
    @Test
    public void capDropTest() {
        // TODO: test capDrop
    }

    /**
     * Test the property 'cgroupParent'
     */
    @Test
    public void cgroupParentTest() {
        // TODO: test cgroupParent
    }

    /**
     * Test the property 'cgroupns'
     */
    @Test
    public void cgroupnsTest() {
        // TODO: test cgroupns
    }

    /**
     * Test the property 'cgroupsMode'
     */
    @Test
    public void cgroupsModeTest() {
        // TODO: test cgroupsMode
    }

    /**
     * Test the property 'chrootDirectories'
     */
    @Test
    public void chrootDirectoriesTest() {
        // TODO: test chrootDirectories
    }

    /**
     * Test the property 'cniNetworks'
     */
    @Test
    public void cniNetworksTest() {
        // TODO: test cniNetworks
    }

    /**
     * Test the property 'command'
     */
    @Test
    public void commandTest() {
        // TODO: test command
    }

    /**
     * Test the property 'conmonPidFile'
     */
    @Test
    public void conmonPidFileTest() {
        // TODO: test conmonPidFile
    }

    /**
     * Test the property 'containerCreateCommand'
     */
    @Test
    public void containerCreateCommandTest() {
        // TODO: test containerCreateCommand
    }

    /**
     * Test the property 'createWorkingDir'
     */
    @Test
    public void createWorkingDirTest() {
        // TODO: test createWorkingDir
    }

    /**
     * Test the property 'dependencyContainers'
     */
    @Test
    public void dependencyContainersTest() {
        // TODO: test dependencyContainers
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
     * Test the property 'entrypoint'
     */
    @Test
    public void entrypointTest() {
        // TODO: test entrypoint
    }

    /**
     * Test the property 'env'
     */
    @Test
    public void envTest() {
        // TODO: test env
    }

    /**
     * Test the property 'envHost'
     */
    @Test
    public void envHostTest() {
        // TODO: test envHost
    }

    /**
     * Test the property 'envmerge'
     */
    @Test
    public void envmergeTest() {
        // TODO: test envmerge
    }

    /**
     * Test the property 'expose'
     */
    @Test
    public void exposeTest() {
        // TODO: test expose
    }

    /**
     * Test the property 'groupEntry'
     */
    @Test
    public void groupEntryTest() {
        // TODO: test groupEntry
    }

    /**
     * Test the property 'groups'
     */
    @Test
    public void groupsTest() {
        // TODO: test groups
    }

    /**
     * Test the property 'healthCheckOnFailureAction'
     */
    @Test
    public void healthCheckOnFailureActionTest() {
        // TODO: test healthCheckOnFailureAction
    }

    /**
     * Test the property 'healthLogDestination'
     */
    @Test
    public void healthLogDestinationTest() {
        // TODO: test healthLogDestination
    }

    /**
     * Test the property 'healthMaxLogCount'
     */
    @Test
    public void healthMaxLogCountTest() {
        // TODO: test healthMaxLogCount
    }

    /**
     * Test the property 'healthMaxLogSize'
     */
    @Test
    public void healthMaxLogSizeTest() {
        // TODO: test healthMaxLogSize
    }

    /**
     * Test the property 'healthconfig'
     */
    @Test
    public void healthconfigTest() {
        // TODO: test healthconfig
    }

    /**
     * Test the property 'hostDeviceList'
     */
    @Test
    public void hostDeviceListTest() {
        // TODO: test hostDeviceList
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
     * Test the property 'hostusers'
     */
    @Test
    public void hostusersTest() {
        // TODO: test hostusers
    }

    /**
     * Test the property 'httpproxy'
     */
    @Test
    public void httpproxyTest() {
        // TODO: test httpproxy
    }

    /**
     * Test the property 'idmappings'
     */
    @Test
    public void idmappingsTest() {
        // TODO: test idmappings
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
     * Test the property 'initContainerType'
     */
    @Test
    public void initContainerTypeTest() {
        // TODO: test initContainerType
    }

    /**
     * Test the property 'initPath'
     */
    @Test
    public void initPathTest() {
        // TODO: test initPath
    }

    /**
     * Test the property 'intelRdt'
     */
    @Test
    public void intelRdtTest() {
        // TODO: test intelRdt
    }

    /**
     * Test the property 'ipcns'
     */
    @Test
    public void ipcnsTest() {
        // TODO: test ipcns
    }

    /**
     * Test the property 'labelNested'
     */
    @Test
    public void labelNestedTest() {
        // TODO: test labelNested
    }

    /**
     * Test the property 'labels'
     */
    @Test
    public void labelsTest() {
        // TODO: test labels
    }

    /**
     * Test the property 'logConfiguration'
     */
    @Test
    public void logConfigurationTest() {
        // TODO: test logConfiguration
    }

    /**
     * Test the property 'managePassword'
     */
    @Test
    public void managePasswordTest() {
        // TODO: test managePassword
    }

    /**
     * Test the property 'mask'
     */
    @Test
    public void maskTest() {
        // TODO: test mask
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
     * Test the property 'noNewPrivileges'
     */
    @Test
    public void noNewPrivilegesTest() {
        // TODO: test noNewPrivileges
    }

    /**
     * Test the property 'ociRuntime'
     */
    @Test
    public void ociRuntimeTest() {
        // TODO: test ociRuntime
    }

    /**
     * Test the property 'oomScoreAdj'
     */
    @Test
    public void oomScoreAdjTest() {
        // TODO: test oomScoreAdj
    }

    /**
     * Test the property 'overlayVolumes'
     */
    @Test
    public void overlayVolumesTest() {
        // TODO: test overlayVolumes
    }

    /**
     * Test the property 'passwdEntry'
     */
    @Test
    public void passwdEntryTest() {
        // TODO: test passwdEntry
    }

    /**
     * Test the property 'personality'
     */
    @Test
    public void personalityTest() {
        // TODO: test personality
    }

    /**
     * Test the property 'pidns'
     */
    @Test
    public void pidnsTest() {
        // TODO: test pidns
    }

    /**
     * Test the property 'pod'
     */
    @Test
    public void podTest() {
        // TODO: test pod
    }

    /**
     * Test the property 'portmappings'
     */
    @Test
    public void portmappingsTest() {
        // TODO: test portmappings
    }

    /**
     * Test the property 'privileged'
     */
    @Test
    public void privilegedTest() {
        // TODO: test privileged
    }

    /**
     * Test the property 'procfsOpts'
     */
    @Test
    public void procfsOptsTest() {
        // TODO: test procfsOpts
    }

    /**
     * Test the property 'publishImagePorts'
     */
    @Test
    public void publishImagePortsTest() {
        // TODO: test publishImagePorts
    }

    /**
     * Test the property 'rLimits'
     */
    @Test
    public void rLimitsTest() {
        // TODO: test rLimits
    }

    /**
     * Test the property 'rawImageName'
     */
    @Test
    public void rawImageNameTest() {
        // TODO: test rawImageName
    }

    /**
     * Test the property 'readOnlyFilesystem'
     */
    @Test
    public void readOnlyFilesystemTest() {
        // TODO: test readOnlyFilesystem
    }

    /**
     * Test the property 'readWriteTmpfs'
     */
    @Test
    public void readWriteTmpfsTest() {
        // TODO: test readWriteTmpfs
    }

    /**
     * Test the property 'remove'
     */
    @Test
    public void removeTest() {
        // TODO: test remove
    }

    /**
     * Test the property 'removeImage'
     */
    @Test
    public void removeImageTest() {
        // TODO: test removeImage
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
     * Test the property 'sdnotifyMode'
     */
    @Test
    public void sdnotifyModeTest() {
        // TODO: test sdnotifyMode
    }

    /**
     * Test the property 'seccompPolicy'
     */
    @Test
    public void seccompPolicyTest() {
        // TODO: test seccompPolicy
    }

    /**
     * Test the property 'seccompProfilePath'
     */
    @Test
    public void seccompProfilePathTest() {
        // TODO: test seccompProfilePath
    }

    /**
     * Test the property 'secretEnv'
     */
    @Test
    public void secretEnvTest() {
        // TODO: test secretEnv
    }

    /**
     * Test the property 'secrets'
     */
    @Test
    public void secretsTest() {
        // TODO: test secrets
    }

    /**
     * Test the property 'selinuxOpts'
     */
    @Test
    public void selinuxOptsTest() {
        // TODO: test selinuxOpts
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
     * Test the property 'startupHealthConfig'
     */
    @Test
    public void startupHealthConfigTest() {
        // TODO: test startupHealthConfig
    }

    /**
     * Test the property 'stdin'
     */
    @Test
    public void stdinTest() {
        // TODO: test stdin
    }

    /**
     * Test the property 'stopSignal'
     */
    @Test
    public void stopSignalTest() {
        // TODO: test stopSignal
    }

    /**
     * Test the property 'stopTimeout'
     */
    @Test
    public void stopTimeoutTest() {
        // TODO: test stopTimeout
    }

    /**
     * Test the property 'storageOpts'
     */
    @Test
    public void storageOptsTest() {
        // TODO: test storageOpts
    }

    /**
     * Test the property 'sysctl'
     */
    @Test
    public void sysctlTest() {
        // TODO: test sysctl
    }

    /**
     * Test the property 'systemd'
     */
    @Test
    public void systemdTest() {
        // TODO: test systemd
    }

    /**
     * Test the property 'terminal'
     */
    @Test
    public void terminalTest() {
        // TODO: test terminal
    }

    /**
     * Test the property 'throttleReadBpsDevice'
     */
    @Test
    public void throttleReadBpsDeviceTest() {
        // TODO: test throttleReadBpsDevice
    }

    /**
     * Test the property 'throttleReadIOPSDevice'
     */
    @Test
    public void throttleReadIOPSDeviceTest() {
        // TODO: test throttleReadIOPSDevice
    }

    /**
     * Test the property 'throttleWriteBpsDevice'
     */
    @Test
    public void throttleWriteBpsDeviceTest() {
        // TODO: test throttleWriteBpsDevice
    }

    /**
     * Test the property 'throttleWriteIOPSDevice'
     */
    @Test
    public void throttleWriteIOPSDeviceTest() {
        // TODO: test throttleWriteIOPSDevice
    }

    /**
     * Test the property 'timeout'
     */
    @Test
    public void timeoutTest() {
        // TODO: test timeout
    }

    /**
     * Test the property 'timezone'
     */
    @Test
    public void timezoneTest() {
        // TODO: test timezone
    }

    /**
     * Test the property 'umask'
     */
    @Test
    public void umaskTest() {
        // TODO: test umask
    }

    /**
     * Test the property 'unified'
     */
    @Test
    public void unifiedTest() {
        // TODO: test unified
    }

    /**
     * Test the property 'unmask'
     */
    @Test
    public void unmaskTest() {
        // TODO: test unmask
    }

    /**
     * Test the property 'unsetenv'
     */
    @Test
    public void unsetenvTest() {
        // TODO: test unsetenv
    }

    /**
     * Test the property 'unsetenvall'
     */
    @Test
    public void unsetenvallTest() {
        // TODO: test unsetenvall
    }

    /**
     * Test the property 'useImageHosts'
     */
    @Test
    public void useImageHostsTest() {
        // TODO: test useImageHosts
    }

    /**
     * Test the property 'useImageResolveConf'
     */
    @Test
    public void useImageResolveConfTest() {
        // TODO: test useImageResolveConf
    }

    /**
     * Test the property 'user'
     */
    @Test
    public void userTest() {
        // TODO: test user
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
     * Test the property 'weightDevice'
     */
    @Test
    public void weightDeviceTest() {
        // TODO: test weightDevice
    }

    /**
     * Test the property 'workDir'
     */
    @Test
    public void workDirTest() {
        // TODO: test workDir
    }

}