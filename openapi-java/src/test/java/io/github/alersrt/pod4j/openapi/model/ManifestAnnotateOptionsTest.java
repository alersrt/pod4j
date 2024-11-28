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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ManifestAnnotateOptions
 */
class ManifestAnnotateOptionsTest {
    private final ManifestAnnotateOptions model = new ManifestAnnotateOptions();

    /**
     * Model tests for ManifestAnnotateOptions
     */
    @Test
    void testManifestAnnotateOptions() {
        // TODO: test ManifestAnnotateOptions
    }

    /**
     * Test the property 'annotation'
     */
    @Test
    void annotationTest() {
        // TODO: test annotation
    }

    /**
     * Test the property 'annotations'
     */
    @Test
    void annotationsTest() {
        // TODO: test annotations
    }

    /**
     * Test the property 'arch'
     */
    @Test
    void archTest() {
        // TODO: test arch
    }

    /**
     * Test the property 'features'
     */
    @Test
    void featuresTest() {
        // TODO: test features
    }

    /**
     * Test the property 'indexAnnotation'
     */
    @Test
    void indexAnnotationTest() {
        // TODO: test indexAnnotation
    }

    /**
     * Test the property 'indexAnnotations'
     */
    @Test
    void indexAnnotationsTest() {
        // TODO: test indexAnnotations
    }

    /**
     * Test the property 'os'
     */
    @Test
    void osTest() {
        // TODO: test os
    }

    /**
     * Test the property 'osFeatures'
     */
    @Test
    void osFeaturesTest() {
        // TODO: test osFeatures
    }

    /**
     * Test the property 'osVersion'
     */
    @Test
    void osVersionTest() {
        // TODO: test osVersion
    }

    /**
     * Test the property 'subject'
     */
    @Test
    void subjectTest() {
        // TODO: test subject
    }

    /**
     * Test the property 'variant'
     */
    @Test
    void variantTest() {
        // TODO: test variant
    }

}
