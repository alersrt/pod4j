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
import io.github.alersrt.pod4j.openapi.model.Container;
import io.github.alersrt.pod4j.openapi.model.ContainerCreateResponse;
import io.github.alersrt.pod4j.openapi.model.ContainerJSON;
import io.github.alersrt.pod4j.openapi.model.ContainerTopOKBody;
import io.github.alersrt.pod4j.openapi.model.ContainerWait200Response;
import io.github.alersrt.pod4j.openapi.model.ContainersPruneReport;
import io.github.alersrt.pod4j.openapi.model.CreateContainerConfig;
import io.github.alersrt.pod4j.openapi.model.ErrorModel;
import java.io.File;
import io.github.alersrt.pod4j.openapi.model.UpdateConfig;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContainersCompatApi
 */
@Disabled
public class ContainersCompatApiTest {

    private final ContainersCompatApi api = new ContainersCompatApi();

    /**
     * Get files from a container
     *
     * Get a tar archive of files from a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerArchiveTest() throws ApiException {
        String name = null;
        String path = null;
        File response = api.containerArchive(name, path);
        // TODO: test validations
    }

    /**
     * Copy files from a container
     *
     * Copy a tar archive of files from a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerArchiveLibpodTest() throws ApiException {
        String name = null;
        String path = null;
        String rename = null;
        File response = api.containerArchiveLibpod(name, path, rename);
        // TODO: test validations
    }

    /**
     * Attach to a container
     *
     * Attach to a container to read its output or send it input. You can attach to the same container multiple times and you can reattach to containers that have been detached.  It uses the same stream format as docker, see the libpod attach endpoint for a description of the format. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerAttachTest() throws ApiException {
        String name = null;
        String detachKeys = null;
        Boolean logs = null;
        Boolean stream = null;
        Boolean stdout = null;
        Boolean stderr = null;
        Boolean stdin = null;
        api.containerAttach(name, detachKeys, logs, stream, stdout, stderr, stdin);
        // TODO: test validations
    }

    /**
     * Report on changes to container&#39;s filesystem; adds, deletes or modifications.
     *
     * Returns which files in a container&#39;s filesystem have been added, deleted, or modified. The Kind of modification can be one of:  0: Modified 1: Added 2: Deleted 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerChangesLibpodTest() throws ApiException {
        String name = null;
        String parent = null;
        String diffType = null;
        api.containerChangesLibpod(name, parent, diffType);
        // TODO: test validations
    }

    /**
     * Create a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerCreateTest() throws ApiException {
        CreateContainerConfig body = null;
        String name = null;
        ContainerCreateResponse response = api.containerCreate(body, name);
        // TODO: test validations
    }

    /**
     * Remove a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerDeleteTest() throws ApiException {
        String name = null;
        Boolean force = null;
        Boolean v = null;
        Boolean link = null;
        api.containerDelete(name, force, v, link);
        // TODO: test validations
    }

    /**
     * Export a container
     *
     * Export the contents of a container as a tarball.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerExportTest() throws ApiException {
        String name = null;
        api.containerExport(name);
        // TODO: test validations
    }

    /**
     * Inspect container
     *
     * Return low-level information about a container.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerInspectTest() throws ApiException {
        String name = null;
        Boolean size = null;
        ContainerJSON response = api.containerInspect(name, size);
        // TODO: test validations
    }

    /**
     * Kill container
     *
     * Signal to send to the container as an integer or string (e.g. SIGINT)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerKillTest() throws ApiException {
        String name = null;
        Boolean all = null;
        String signal = null;
        api.containerKill(name, all, signal);
        // TODO: test validations
    }

    /**
     * List containers
     *
     * Returns a list of containers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerListTest() throws ApiException {
        Boolean all = null;
        Boolean external = null;
        Integer limit = null;
        Boolean size = null;
        String filters = null;
        List<Container> response = api.containerList(all, external, limit, size, filters);
        // TODO: test validations
    }

    /**
     * Get container logs
     *
     * Get stdout and stderr logs from a container.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerLogsTest() throws ApiException {
        String name = null;
        Boolean follow = null;
        Boolean stdout = null;
        Boolean stderr = null;
        String since = null;
        String until = null;
        Boolean timestamps = null;
        String tail = null;
        api.containerLogs(name, follow, stdout, stderr, since, until, timestamps, tail);
        // TODO: test validations
    }

    /**
     * Pause container
     *
     * Use the cgroups freezer to suspend all processes in a container.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerPauseTest() throws ApiException {
        String name = null;
        api.containerPause(name);
        // TODO: test validations
    }

    /**
     * Delete stopped containers
     *
     * Remove containers not in use
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerPruneTest() throws ApiException {
        String filters = null;
        List<ContainersPruneReport> response = api.containerPrune(filters);
        // TODO: test validations
    }

    /**
     * Rename an existing container
     *
     * Change the name of an existing container.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerRenameTest() throws ApiException {
        String name = null;
        String name2 = null;
        api.containerRename(name, name2);
        // TODO: test validations
    }

    /**
     * Resize a container&#39;s TTY
     *
     * Resize the terminal attached to a container (for use with Attach).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerResizeTest() throws ApiException {
        String name = null;
        Integer h = null;
        Integer w = null;
        Boolean running = null;
        Object response = api.containerResize(name, h, w, running);
        // TODO: test validations
    }

    /**
     * Restart container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerRestartTest() throws ApiException {
        String name = null;
        Integer t = null;
        api.containerRestart(name, t);
        // TODO: test validations
    }

    /**
     * Start a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerStartTest() throws ApiException {
        String name = null;
        String detachKeys = null;
        api.containerStart(name, detachKeys);
        // TODO: test validations
    }

    /**
     * Get stats for a container
     *
     * This returns a live stream of a container’s resource usage statistics.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerStatsTest() throws ApiException {
        String name = null;
        Boolean stream = null;
        Boolean oneShot = null;
        Object response = api.containerStats(name, stream, oneShot);
        // TODO: test validations
    }

    /**
     * Stop a container
     *
     * Stop a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerStopTest() throws ApiException {
        String name = null;
        Integer t = null;
        api.containerStop(name, t);
        // TODO: test validations
    }

    /**
     * List processes running inside a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerTopTest() throws ApiException {
        String name = null;
        String psArgs = null;
        ContainerTopOKBody response = api.containerTop(name, psArgs);
        // TODO: test validations
    }

    /**
     * Unpause container
     *
     * Resume a paused container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerUnpauseTest() throws ApiException {
        String name = null;
        api.containerUnpause(name);
        // TODO: test validations
    }

    /**
     * Update configuration of an existing container
     *
     * Change configuration settings for an existing container without requiring recreation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerUpdateTest() throws ApiException {
        String name = null;
        UpdateConfig resources = null;
        api.containerUpdate(name, resources);
        // TODO: test validations
    }

    /**
     * Wait on a container
     *
     * Block until a container stops or given condition is met.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerWaitTest() throws ApiException {
        String name = null;
        String condition = null;
        String interval = null;
        ContainerWait200Response response = api.containerWait(name, condition, interval);
        // TODO: test validations
    }

    /**
     * New Image
     *
     * Create a new image from a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageCommitTest() throws ApiException {
        String container = null;
        String repo = null;
        String tag = null;
        String comment = null;
        String author = null;
        Boolean pause = null;
        String changes = null;
        Boolean squash = null;
        api.imageCommit(container, repo, tag, comment, author, pause, changes, squash);
        // TODO: test validations
    }

    /**
     * Put files into a container
     *
     * Put a tar archive of files into a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putContainerArchiveTest() throws ApiException {
        String name = null;
        String path = null;
        String noOverwriteDirNonDir = null;
        String copyUIDGID = null;
        String request = null;
        api.putContainerArchive(name, path, noOverwriteDirNonDir, copyUIDGID, request);
        // TODO: test validations
    }

}
