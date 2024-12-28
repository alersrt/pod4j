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


package io.github.alersrt.pod4j.openapi.api;

import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.model.ErrorModel;
import java.io.File;
import io.github.alersrt.pod4j.openapi.model.HistoryResponse;
import io.github.alersrt.pod4j.openapi.model.ImageBuildLibpod200Response;
import io.github.alersrt.pod4j.openapi.model.ImageData;
import io.github.alersrt.pod4j.openapi.model.ImageImportReport;
import io.github.alersrt.pod4j.openapi.model.ImageLoadReport;
import io.github.alersrt.pod4j.openapi.model.ImageSearch200Response;
import io.github.alersrt.pod4j.openapi.model.ImageTreeReport;
import io.github.alersrt.pod4j.openapi.model.LibpodImageSummary;
import io.github.alersrt.pod4j.openapi.model.LibpodImagesPullReport;
import io.github.alersrt.pod4j.openapi.model.LibpodImagesRemoveReport;
import io.github.alersrt.pod4j.openapi.model.PruneReport;
import io.github.alersrt.pod4j.openapi.model.ScpReport;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * API tests for ImagesApi
 */
@Disabled
public class ImagesApiTest {

    private final ImagesApi api = new ImagesApi();

    /**
     * Create image
     *
     * Build an image from the given Dockerfile(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageBuildLibpodTest() throws ApiException {
        String dockerfile = null;
        String t = null;
        Boolean allplatforms = null;
        String extrahosts = null;
        Boolean nohosts = null;
        String remote = null;
        Boolean q = null;
        Boolean compatvolumes = null;
        Boolean nocache = null;
        String cachefrom = null;
        Boolean pull = null;
        Boolean rm = null;
        Boolean forcerm = null;
        Integer memory = null;
        Integer memswap = null;
        Integer cpushares = null;
        String cpusetcpus = null;
        Integer cpuperiod = null;
        Integer cpuquota = null;
        String buildargs = null;
        Integer shmsize = null;
        Boolean squash = null;
        String labels = null;
        List<String> layerLabel = null;
        Boolean layers = null;
        String networkmode = null;
        String platform = null;
        String target = null;
        String outputs = null;
        Boolean httpproxy = null;
        List<String> unsetenv = null;
        List<String> unsetlabel = null;
        List<String> volume = null;
        ImageBuildLibpod200Response response = api.imageBuildLibpod()
                .dockerfile(dockerfile)
                .t(t)
                .allplatforms(allplatforms)
                .extrahosts(extrahosts)
                .nohosts(nohosts)
                .remote(remote)
                .q(q)
                .compatvolumes(compatvolumes)
                .nocache(nocache)
                .cachefrom(cachefrom)
                .pull(pull)
                .rm(rm)
                .forcerm(forcerm)
                .memory(memory)
                .memswap(memswap)
                .cpushares(cpushares)
                .cpusetcpus(cpusetcpus)
                .cpuperiod(cpuperiod)
                .cpuquota(cpuquota)
                .buildargs(buildargs)
                .shmsize(shmsize)
                .squash(squash)
                .labels(labels)
                .layerLabel(layerLabel)
                .layers(layers)
                .networkmode(networkmode)
                .platform(platform)
                .target(target)
                .outputs(outputs)
                .httpproxy(httpproxy)
                .unsetenv(unsetenv)
                .unsetlabel(unsetlabel)
                .volume(volume)
                .execute();
        // TODO: test validations
    }

    /**
     * Report on changes to images&#39;s filesystem; adds, deletes or modifications.
     *
     * Returns which files in an image&#39;s filesystem have been added, deleted, or modified. The Kind of modification can be one of:  0: Modified 1: Added 2: Deleted 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageChangesLibpodTest() throws ApiException {
        String name = null;
        String parent = null;
        String diffType = null;
        api.imageChangesLibpod(name)
                .parent(parent)
                .diffType(diffType)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove one or more images from the storage.
     *
     * Remove one or more images from the storage.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageDeleteAllLibpodTest() throws ApiException {
        List<String> images = null;
        Boolean all = null;
        Boolean force = null;
        Boolean ignore = null;
        Boolean lookupManifest = null;
        LibpodImagesRemoveReport response = api.imageDeleteAllLibpod()
                .images(images)
                .all(all)
                .force(force)
                .ignore(ignore)
                .lookupManifest(lookupManifest)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove an image from the local storage.
     *
     * Remove an image from the local storage.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageDeleteLibpodTest() throws ApiException {
        String name = null;
        Boolean force = null;
        LibpodImagesRemoveReport response = api.imageDeleteLibpod(name)
                .force(force)
                .execute();
        // TODO: test validations
    }

    /**
     * Image exists
     *
     * Check if image exists in local store
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageExistsLibpodTest() throws ApiException {
        String name = null;
        api.imageExistsLibpod(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Export multiple images
     *
     * Export multiple images into a single object. Only &#x60;docker-archive&#x60; is currently supported.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageExportLibpodTest() throws ApiException {
        String format = null;
        List<String> references = null;
        Boolean compress = null;
        Boolean ociAcceptUncompressedLayers = null;
        File response = api.imageExportLibpod()
                .format(format)
                .references(references)
                .compress(compress)
                .ociAcceptUncompressedLayers(ociAcceptUncompressedLayers)
                .execute();
        // TODO: test validations
    }

    /**
     * Export an image
     *
     * Export an image
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageGetLibpodTest() throws ApiException {
        String name = null;
        String format = null;
        Boolean compress = null;
        File response = api.imageGetLibpod(name)
                .format(format)
                .compress(compress)
                .execute();
        // TODO: test validations
    }

    /**
     * History of an image
     *
     * Return parent layers of an image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageHistoryLibpodTest() throws ApiException {
        String name = null;
        HistoryResponse response = api.imageHistoryLibpod(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Import image
     *
     * Import a previously exported tarball as an image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageImportLibpodTest() throws ApiException {
        File upload = null;
        String contentType = null;
        List<String> changes = null;
        String message = null;
        String reference = null;
        String url = null;
        ImageImportReport response = api.imageImportLibpod(upload)
                .contentType(contentType)
                .changes(changes)
                .message(message)
                .reference(reference)
                .url(url)
                .execute();
        // TODO: test validations
    }

    /**
     * Inspect an image
     *
     * Obtain low-level information about an image
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageInspectLibpodTest() throws ApiException {
        String name = null;
        ImageData response = api.imageInspectLibpod(name)
                .execute();
        // TODO: test validations
    }

    /**
     * List Images
     *
     * Returns a list of images on the server
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageListLibpodTest() throws ApiException {
        Boolean all = null;
        String filters = null;
        List<LibpodImageSummary> response = api.imageListLibpod()
                .all(all)
                .filters(filters)
                .execute();
        // TODO: test validations
    }

    /**
     * Load image
     *
     * Load an image (oci-archive or docker-archive) stream.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageLoadLibpodTest() throws ApiException {
        String upload = null;
        ImageLoadReport response = api.imageLoadLibpod(upload)
                .execute();
        // TODO: test validations
    }

    /**
     * Prune unused images
     *
     * Remove images that are not being used by a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imagePruneLibpodTest() throws ApiException {
        Boolean all = null;
        Boolean external = null;
        Boolean buildcache = null;
        String filters = null;
        List<PruneReport> response = api.imagePruneLibpod()
                .all(all)
                .external(external)
                .buildcache(buildcache)
                .filters(filters)
                .execute();
        // TODO: test validations
    }

    /**
     * Pull images
     *
     * Pull one or more images from a container registry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imagePullLibpodTest() throws ApiException {
        String reference = null;
        Boolean quiet = null;
        Boolean compatMode = null;
        String arch = null;
        String OS = null;
        String variant = null;
        String policy = null;
        Boolean tlsVerify = null;
        Boolean allTags = null;
        String xRegistryAuth = null;
        LibpodImagesPullReport response = api.imagePullLibpod()
                .reference(reference)
                .quiet(quiet)
                .compatMode(compatMode)
                .arch(arch)
                .OS(OS)
                .variant(variant)
                .policy(policy)
                .tlsVerify(tlsVerify)
                .allTags(allTags)
                .xRegistryAuth(xRegistryAuth)
                .execute();
        // TODO: test validations
    }

    /**
     * Push Image
     *
     * Push an image to a container registry
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imagePushLibpodTest() throws ApiException {
        String name = null;
        String destination = null;
        Boolean forceCompressionFormat = null;
        String compressionFormat = null;
        Integer compressionLevel = null;
        Boolean tlsVerify = null;
        Boolean quiet = null;
        String format = null;
        Boolean all = null;
        Boolean removeSignatures = null;
        Integer retry = null;
        String retryDelay = null;
        String xRegistryAuth = null;
        File response = api.imagePushLibpod(name)
                .destination(destination)
                .forceCompressionFormat(forceCompressionFormat)
                .compressionFormat(compressionFormat)
                .compressionLevel(compressionLevel)
                .tlsVerify(tlsVerify)
                .quiet(quiet)
                .format(format)
                .all(all)
                .removeSignatures(removeSignatures)
                .retry(retry)
                .retryDelay(retryDelay)
                .xRegistryAuth(xRegistryAuth)
                .execute();
        // TODO: test validations
    }

    /**
     * Resolve an image (short) name
     *
     * Resolve the passed image name to a list of fully-qualified images referring to container registries.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageResolveLibpodTest() throws ApiException {
        String name = null;
        api.imageResolveLibpod(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Copy an image from one host to another
     *
     * Copy an image from one host to another
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageScpLibpodTest() throws ApiException {
        String name = null;
        String destination = null;
        Boolean quiet = null;
        ScpReport response = api.imageScpLibpod(name)
                .destination(destination)
                .quiet(quiet)
                .execute();
        // TODO: test validations
    }

    /**
     * Search images
     *
     * Search registries for images
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageSearchLibpodTest() throws ApiException {
        String term = null;
        Integer limit = null;
        String filters = null;
        Boolean tlsVerify = null;
        Boolean listTags = null;
        ImageSearch200Response response = api.imageSearchLibpod()
                .term(term)
                .limit(limit)
                .filters(filters)
                .tlsVerify(tlsVerify)
                .listTags(listTags)
                .execute();
        // TODO: test validations
    }

    /**
     * Tag an image
     *
     * Tag an image so that it becomes part of a repository.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageTagLibpodTest() throws ApiException {
        String name = null;
        String repo = null;
        String tag = null;
        api.imageTagLibpod(name)
                .repo(repo)
                .tag(tag)
                .execute();
        // TODO: test validations
    }

    /**
     * Image tree
     *
     * Retrieve the image tree for the provided image name or ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageTreeLibpodTest() throws ApiException {
        String name = null;
        Boolean whatrequires = null;
        ImageTreeReport response = api.imageTreeLibpod(name)
                .whatrequires(whatrequires)
                .execute();
        // TODO: test validations
    }

    /**
     * Untag an image
     *
     * Untag an image. If not repo and tag are specified, all tags are removed from the image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageUntagLibpodTest() throws ApiException {
        String name = null;
        String repo = null;
        String tag = null;
        api.imageUntagLibpod(name)
                .repo(repo)
                .tag(tag)
                .execute();
        // TODO: test validations
    }

}
