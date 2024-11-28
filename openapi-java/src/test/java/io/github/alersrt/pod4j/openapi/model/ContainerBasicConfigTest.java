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
 * Model tests for ContainerBasicConfig
 */
public class ContainerBasicConfigTest {
    private final ContainerBasicConfig model = new ContainerBasicConfig();

    /**
     * Model tests for ContainerBasicConfig
     */
    @Test
    public void testContainerBasicConfig() {
        // TODO: test ContainerBasicConfig
    }

    /**
     * Test the property 'annotations'
     */
    @Test
    public void annotationsTest() {
        // TODO: test annotations
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
     * Test the property 'dependencyContainers'
     */
    @Test
    public void dependencyContainersTest() {
        // TODO: test dependencyContainers
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
     * Test the property 'groupEntry'
     */
    @Test
    public void groupEntryTest() {
        // TODO: test groupEntry
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
     * Test the property 'initContainerType'
     */
    @Test
    public void initContainerTypeTest() {
        // TODO: test initContainerType
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
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'ociRuntime'
     */
    @Test
    public void ociRuntimeTest() {
        // TODO: test ociRuntime
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
     * Test the property 'sdnotifyMode'
     */
    @Test
    public void sdnotifyModeTest() {
        // TODO: test sdnotifyMode
    }

    /**
     * Test the property 'secretEnv'
     */
    @Test
    public void secretEnvTest() {
        // TODO: test secretEnv
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
     * Test the property 'utsns'
     */
    @Test
    public void utsnsTest() {
        // TODO: test utsns
    }

}
