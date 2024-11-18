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
import io.github.alersrt.pod4j.openapi.model.ContainerCreateResponse;
import io.github.alersrt.pod4j.openapi.model.ContainerStats;
import io.github.alersrt.pod4j.openapi.model.ContainerTopOKBody;
import io.github.alersrt.pod4j.openapi.model.ContainersPruneReportLibpod;
import io.github.alersrt.pod4j.openapi.model.ErrorModel;
import java.io.File;
import io.github.alersrt.pod4j.openapi.model.HealthCheckResults;
import io.github.alersrt.pod4j.openapi.model.InspectContainerData;
import io.github.alersrt.pod4j.openapi.model.LibpodContainersRmReport;
import io.github.alersrt.pod4j.openapi.model.ListContainer;
import io.github.alersrt.pod4j.openapi.model.PlayKubeReport;
import io.github.alersrt.pod4j.openapi.model.SpecGenerator;
import io.github.alersrt.pod4j.openapi.model.UpdateEntities;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContainersApi
 */
@Disabled
public class ContainersApiTest {

    private final ContainersApi api = new ContainersApi();

    /**
     * Attach to a container
     *
     * Attach to a container to read its output or send it input. You can attach to the same container multiple times and you can reattach to containers that have been detached.  ### Hijacking  This endpoint hijacks the HTTP connection to transport &#x60;stdin&#x60;, &#x60;stdout&#x60;, and &#x60;stderr&#x60; on the same socket.  This is the response from the service for an attach request:  &#x60;&#x60;&#x60; HTTP/1.1 200 OK Content-Type: application/vnd.docker.raw-stream  [STREAM] &#x60;&#x60;&#x60;  After the headers and two new lines, the TCP connection can now be used for raw, bidirectional communication between the client and server.  To inform potential proxies about connection hijacking, the client can also optionally send connection upgrade headers.  For example, the client sends this request to upgrade the connection:  &#x60;&#x60;&#x60; POST /v4.6.0/libpod/containers/16253994b7c4/attach?stream&#x3D;1&amp;stdout&#x3D;1 HTTP/1.1 Upgrade: tcp Connection: Upgrade &#x60;&#x60;&#x60;  The service will respond with a &#x60;101 UPGRADED&#x60; response, and will similarly follow with the raw stream:  &#x60;&#x60;&#x60; HTTP/1.1 101 UPGRADED Content-Type: application/vnd.docker.raw-stream Connection: Upgrade Upgrade: tcp  [STREAM] &#x60;&#x60;&#x60;  ### Stream format  When the TTY setting is disabled for the container, the HTTP Content-Type header is set to application/vnd.docker.multiplexed-stream (starting with v4.7.0, previously application/vnd.docker.raw-stream was always used) and the stream over the hijacked connected is multiplexed to separate out &#x60;stdout&#x60; and &#x60;stderr&#x60;. The stream consists of a series of frames, each containing a header and a payload.  The header contains the information about the output stream type and the size of the payload. It is encoded on the first eight bytes like this:  &#x60;&#x60;&#x60;go header :&#x3D; [8]byte{STREAM_TYPE, 0, 0, 0, SIZE1, SIZE2, SIZE3, SIZE4} &#x60;&#x60;&#x60;  &#x60;STREAM_TYPE&#x60; can be:  - 0: &#x60;stdin&#x60; (is written on &#x60;stdout&#x60;) - 1: &#x60;stdout&#x60; - 2: &#x60;stderr&#x60;  &#x60;SIZE1, SIZE2, SIZE3, SIZE4&#x60; are the four bytes of the &#x60;uint32&#x60; size encoded as big endian.  Following the header is the payload, which contains the specified number of bytes as written in the size.  The simplest way to implement this protocol is the following:  1. Read 8 bytes. 2. Choose &#x60;stdout&#x60; or &#x60;stderr&#x60; depending on the first byte. 3. Extract the frame size from the last four bytes. 4. Read the extracted size and output it on the correct output. 5. Goto 1.  ### Stream format when using a TTY  When the TTY setting is enabled for the container, the stream is not multiplexed. The data exchanged over the hijacked connection is simply the raw data from the process PTY and client&#39;s &#x60;stdin&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerAttachLibpodTest() throws ApiException {
        String name = null;
        String detachKeys = null;
        Boolean logs = null;
        Boolean stream = null;
        Boolean stdout = null;
        Boolean stderr = null;
        Boolean stdin = null;
        api.containerAttachLibpod(name, detachKeys, logs, stream, stdout, stderr, stdin);
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
     * Checkpoint a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerCheckpointLibpodTest() throws ApiException {
        String name = null;
        Boolean keep = null;
        Boolean leaveRunning = null;
        Boolean tcpEstablished = null;
        Boolean export = null;
        Boolean ignoreRootFS = null;
        Boolean ignoreVolumes = null;
        Boolean preCheckpoint = null;
        Boolean withPrevious = null;
        Boolean fileLocks = null;
        Boolean printStats = null;
        api.containerCheckpointLibpod(name, keep, leaveRunning, tcpEstablished, export, ignoreRootFS, ignoreVolumes, preCheckpoint, withPrevious, fileLocks, printStats);
        // TODO: test validations
    }

    /**
     * Create a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerCreateLibpodTest() throws ApiException {
        SpecGenerator create = null;
        ContainerCreateResponse response = api.containerCreateLibpod(create);
        // TODO: test validations
    }

    /**
     * Delete container
     *
     * Delete container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerDeleteLibpodTest() throws ApiException {
        String name = null;
        Boolean depend = null;
        Boolean force = null;
        Boolean ignore = null;
        Integer timeout = null;
        Boolean v = null;
        List<LibpodContainersRmReport> response = api.containerDeleteLibpod(name, depend, force, ignore, timeout, v);
        // TODO: test validations
    }

    /**
     * Check if container exists
     *
     * Quick way to determine if a container exists by name or ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerExistsLibpodTest() throws ApiException {
        String name = null;
        api.containerExistsLibpod(name);
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
    public void containerExportLibpodTest() throws ApiException {
        String name = null;
        api.containerExportLibpod(name);
        // TODO: test validations
    }

    /**
     * Run a container&#39;s healthcheck
     *
     * Execute the defined healthcheck and return information about the results
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerHealthcheckLibpodTest() throws ApiException {
        String name = null;
        HealthCheckResults response = api.containerHealthcheckLibpod(name);
        // TODO: test validations
    }

    /**
     * Initialize a container
     *
     * Performs all tasks necessary for initializing the container but does not start the container.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerInitLibpodTest() throws ApiException {
        String name = null;
        api.containerInitLibpod(name);
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
    public void containerInspectLibpodTest() throws ApiException {
        String name = null;
        Boolean size = null;
        InspectContainerData response = api.containerInspectLibpod(name, size);
        // TODO: test validations
    }

    /**
     * Kill container
     *
     * send a signal to a container, defaults to killing the container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerKillLibpodTest() throws ApiException {
        String name = null;
        String signal = null;
        api.containerKillLibpod(name, signal);
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
    public void containerListLibpodTest() throws ApiException {
        Boolean all = null;
        Integer limit = null;
        Boolean namespace = null;
        Boolean pod = null;
        Boolean size = null;
        Boolean sync = null;
        String filters = null;
        List<ListContainer> response = api.containerListLibpod(all, limit, namespace, pod, size, sync, filters);
        // TODO: test validations
    }

    /**
     * Get container logs
     *
     * Get stdout and stderr logs from a container.  The stream format is the same as described in the attach endpoint. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerLogsLibpodTest() throws ApiException {
        String name = null;
        Boolean follow = null;
        Boolean stdout = null;
        Boolean stderr = null;
        String since = null;
        String until = null;
        Boolean timestamps = null;
        String tail = null;
        api.containerLogsLibpod(name, follow, stdout, stderr, since, until, timestamps, tail);
        // TODO: test validations
    }

    /**
     * Mount a container
     *
     * Mount a container to the filesystem
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerMountLibpodTest() throws ApiException {
        String name = null;
        String response = api.containerMountLibpod(name);
        // TODO: test validations
    }

    /**
     * Pause a container
     *
     * Use the cgroups freezer to suspend all processes in a container.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerPauseLibpodTest() throws ApiException {
        String name = null;
        api.containerPauseLibpod(name);
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
    public void containerPruneLibpodTest() throws ApiException {
        String filters = null;
        List<ContainersPruneReportLibpod> response = api.containerPruneLibpod(filters);
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
    public void containerRenameLibpodTest() throws ApiException {
        String name = null;
        String name2 = null;
        api.containerRenameLibpod(name, name2);
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
    public void containerResizeLibpodTest() throws ApiException {
        String name = null;
        Integer h = null;
        Integer w = null;
        Object response = api.containerResizeLibpod(name, h, w);
        // TODO: test validations
    }

    /**
     * Restart a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerRestartLibpodTest() throws ApiException {
        String name = null;
        Integer t = null;
        api.containerRestartLibpod(name, t);
        // TODO: test validations
    }

    /**
     * Restore a container
     *
     * Restore a container from a checkpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerRestoreLibpodTest() throws ApiException {
        String name = null;
        String name2 = null;
        Boolean keep = null;
        Boolean tcpEstablished = null;
        Boolean _import = null;
        Boolean ignoreRootFS = null;
        Boolean ignoreVolumes = null;
        Boolean ignoreStaticIP = null;
        Boolean ignoreStaticMAC = null;
        Boolean fileLocks = null;
        Boolean printStats = null;
        String pod = null;
        api.containerRestoreLibpod(name, name2, keep, tcpEstablished, _import, ignoreRootFS, ignoreVolumes, ignoreStaticIP, ignoreStaticMAC, fileLocks, printStats, pod);
        // TODO: test validations
    }

    /**
     * Show mounted containers
     *
     * Lists all mounted containers mount points
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerShowMountedLibpodTest() throws ApiException {
        Map<String, String> response = api.containerShowMountedLibpod();
        // TODO: test validations
    }

    /**
     * Start a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerStartLibpodTest() throws ApiException {
        String name = null;
        String detachKeys = null;
        api.containerStartLibpod(name, detachKeys);
        // TODO: test validations
    }

    /**
     * Get stats for a container
     *
     * DEPRECATED. This endpoint will be removed with the next major release. Please use /libpod/containers/stats instead.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerStatsLibpodTest() throws ApiException {
        String name = null;
        Boolean stream = null;
        api.containerStatsLibpod(name, stream);
        // TODO: test validations
    }

    /**
     * Stop a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerStopLibpodTest() throws ApiException {
        String name = null;
        Integer timeout = null;
        Boolean ignore = null;
        api.containerStopLibpod(name, timeout, ignore);
        // TODO: test validations
    }

    /**
     * List processes
     *
     * List processes running inside a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerTopLibpodTest() throws ApiException {
        String name = null;
        Boolean stream = null;
        Integer delay = null;
        List<String> psArgs = null;
        ContainerTopOKBody response = api.containerTopLibpod(name, stream, delay, psArgs);
        // TODO: test validations
    }

    /**
     * Unmount a container
     *
     * Unmount a container from the filesystem
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerUnmountLibpodTest() throws ApiException {
        String name = null;
        api.containerUnmountLibpod(name);
        // TODO: test validations
    }

    /**
     * Unpause Container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerUnpauseLibpodTest() throws ApiException {
        String name = null;
        api.containerUnpauseLibpod(name);
        // TODO: test validations
    }

    /**
     * Update an existing containers cgroup configuration
     *
     * Update an existing containers cgroup configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerUpdateLibpodTest() throws ApiException {
        String name = null;
        String restartPolicy = null;
        Integer restartRetries = null;
        UpdateEntities config = null;
        api.containerUpdateLibpod(name, restartPolicy, restartRetries, config);
        // TODO: test validations
    }

    /**
     * Wait on a container
     *
     * Wait on a container to meet a given condition
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containerWaitLibpodTest() throws ApiException {
        String name = null;
        List<String> condition = null;
        String interval = null;
        Integer response = api.containerWaitLibpod(name, condition, interval);
        // TODO: test validations
    }

    /**
     * Get stats for one or more containers
     *
     * Return a live stream of resource usage statistics of one or more container. If no container is specified, the statistics of all containers are returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void containersStatsAllLibpodTest() throws ApiException {
        List<String> containers = null;
        Boolean stream = null;
        Integer interval = null;
        ContainerStats response = api.containersStatsAllLibpod(containers, stream, interval);
        // TODO: test validations
    }

    /**
     * Generate a Kubernetes YAML file.
     *
     * Generate Kubernetes YAML based on a pod or container.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateKubeLibpodTest() throws ApiException {
        List<String> names = null;
        Boolean service = null;
        String type = null;
        Integer replicas = null;
        Boolean noTrunc = null;
        Boolean podmanOnly = null;
        File response = api.generateKubeLibpod(names, service, type, replicas, noTrunc, podmanOnly);
        // TODO: test validations
    }

    /**
     * Generate Systemd Units
     *
     * Generate Systemd Units based on a pod or container.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateSystemdLibpodTest() throws ApiException {
        String name = null;
        Boolean useName = null;
        Boolean _new = null;
        Boolean noHeader = null;
        Integer startTimeout = null;
        Integer stopTimeout = null;
        String restartPolicy = null;
        String containerPrefix = null;
        String podPrefix = null;
        String separator = null;
        Integer restartSec = null;
        List<String> wants = null;
        List<String> after = null;
        List<String> requires = null;
        List<String> additionalEnvVariables = null;
        Map<String, String> response = api.generateSystemdLibpod(name, useName, _new, noHeader, startTimeout, stopTimeout, restartPolicy, containerPrefix, podPrefix, separator, restartSec, wants, after, requires, additionalEnvVariables);
        // TODO: test validations
    }

    /**
     * Commit
     *
     * Create a new image from a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageCommitLibpodTest() throws ApiException {
        String container = null;
        String author = null;
        List<String> changes = null;
        String comment = null;
        String format = null;
        Boolean pause = null;
        Boolean squash = null;
        String repo = null;
        Boolean stream = null;
        String tag = null;
        api.imageCommitLibpod(container, author, changes, comment, format, pause, squash, repo, stream, tag);
        // TODO: test validations
    }

    /**
     * Apply a podman workload or Kubernetes YAML file.
     *
     * Deploy a podman container, pod, volume, or Kubernetes yaml to a Kubernetes cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void kubeApplyLibpodTest() throws ApiException {
        String caCertFile = null;
        String kubeConfig = null;
        String namespace = null;
        Boolean service = null;
        String _file = null;
        String request = null;
        File response = api.kubeApplyLibpod(caCertFile, kubeConfig, namespace, service, _file, request);
        // TODO: test validations
    }

    /**
     * Remove resources created from kube play
     *
     * Tears down pods, secrets, and volumes defined in a YAML file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void playKubeDownLibpodTest() throws ApiException {
        Boolean force = null;
        PlayKubeReport response = api.playKubeDownLibpod(force);
        // TODO: test validations
    }

    /**
     * Play a Kubernetes YAML file.
     *
     * Create and run pods based on a Kubernetes YAML file.  ### Content-Type  Then endpoint support two Content-Type  - &#x60;plain/text&#x60; for yaml format  - &#x60;application/x-tar&#x60; for sending context(s) required for building images  #### Tar format  The tar format must contain a &#x60;play.yaml&#x60; file at the root that will be used. If the file format requires context to build an image, it uses the image name and check for corresponding folder.  For example, the client sends a tar file with the following structure:  &#x60;&#x60;&#x60; └── content.tar  ├── play.yaml  └── foobar/      └── Containerfile &#x60;&#x60;&#x60;  The &#x60;play.yaml&#x60; is the following, the &#x60;foobar&#x60; image means we are looking for a context with this name. &#x60;&#x60;&#x60; apiVersion: v1 kind: Pod metadata: name: demo-build-remote spec: containers:  - name: container    image: foobar &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void playKubeLibpodTest() throws ApiException {
        String contentType = null;
        String annotations = null;
        String logDriver = null;
        List<String> logOptions = null;
        List<String> network = null;
        Boolean noHosts = null;
        Boolean noTrunc = null;
        List<String> publishPorts = null;
        Boolean publishAllPorts = null;
        Boolean replace = null;
        Boolean serviceContainer = null;
        Boolean start = null;
        List<String> staticIPs = null;
        List<String> staticMACs = null;
        Boolean tlsVerify = null;
        String userns = null;
        Boolean wait = null;
        Boolean build = null;
        String request = null;
        PlayKubeReport response = api.playKubeLibpod(contentType, annotations, logDriver, logOptions, network, noHosts, noTrunc, publishPorts, publishAllPorts, replace, serviceContainer, start, staticIPs, staticMACs, tlsVerify, userns, wait, build, request);
        // TODO: test validations
    }

    /**
     * Copy files into a container
     *
     * Copy a tar archive of files into a container
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putContainerArchiveLibpodTest() throws ApiException {
        String name = null;
        String path = null;
        Boolean pause = null;
        String request = null;
        api.putContainerArchiveLibpod(name, path, pause, request);
        // TODO: test validations
    }

}
