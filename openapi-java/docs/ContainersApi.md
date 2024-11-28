# ContainersApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**containerAttachLibpod**](ContainersApi.md#containerAttachLibpod) | **POST** /libpod/containers/{name}/attach | Attach to a container |
| [**containerAttachLibpodWithHttpInfo**](ContainersApi.md#containerAttachLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/attach | Attach to a container |
| [**containerChangesLibpod**](ContainersApi.md#containerChangesLibpod) | **GET** /libpod/containers/{name}/changes | Report on changes to container&#39;s filesystem; adds, deletes or modifications. |
| [**containerChangesLibpodWithHttpInfo**](ContainersApi.md#containerChangesLibpodWithHttpInfo) | **GET** /libpod/containers/{name}/changes | Report on changes to container&#39;s filesystem; adds, deletes or modifications. |
| [**containerCheckpointLibpod**](ContainersApi.md#containerCheckpointLibpod) | **POST** /libpod/containers/{name}/checkpoint | Checkpoint a container |
| [**containerCheckpointLibpodWithHttpInfo**](ContainersApi.md#containerCheckpointLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/checkpoint | Checkpoint a container |
| [**containerCreateLibpod**](ContainersApi.md#containerCreateLibpod) | **POST** /libpod/containers/create | Create a container |
| [**containerCreateLibpodWithHttpInfo**](ContainersApi.md#containerCreateLibpodWithHttpInfo) | **POST** /libpod/containers/create | Create a container |
| [**containerDeleteLibpod**](ContainersApi.md#containerDeleteLibpod) | **DELETE** /libpod/containers/{name} | Delete container |
| [**containerDeleteLibpodWithHttpInfo**](ContainersApi.md#containerDeleteLibpodWithHttpInfo) | **DELETE** /libpod/containers/{name} | Delete container |
| [**containerExistsLibpod**](ContainersApi.md#containerExistsLibpod) | **GET** /libpod/containers/{name}/exists | Check if container exists |
| [**containerExistsLibpodWithHttpInfo**](ContainersApi.md#containerExistsLibpodWithHttpInfo) | **GET** /libpod/containers/{name}/exists | Check if container exists |
| [**containerExportLibpod**](ContainersApi.md#containerExportLibpod) | **GET** /libpod/containers/{name}/export | Export a container |
| [**containerExportLibpodWithHttpInfo**](ContainersApi.md#containerExportLibpodWithHttpInfo) | **GET** /libpod/containers/{name}/export | Export a container |
| [**containerHealthcheckLibpod**](ContainersApi.md#containerHealthcheckLibpod) | **GET** /libpod/containers/{name}/healthcheck | Run a container&#39;s healthcheck |
| [**containerHealthcheckLibpodWithHttpInfo**](ContainersApi.md#containerHealthcheckLibpodWithHttpInfo) | **GET** /libpod/containers/{name}/healthcheck | Run a container&#39;s healthcheck |
| [**containerInitLibpod**](ContainersApi.md#containerInitLibpod) | **POST** /libpod/containers/{name}/init | Initialize a container |
| [**containerInitLibpodWithHttpInfo**](ContainersApi.md#containerInitLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/init | Initialize a container |
| [**containerInspectLibpod**](ContainersApi.md#containerInspectLibpod) | **GET** /libpod/containers/{name}/json | Inspect container |
| [**containerInspectLibpodWithHttpInfo**](ContainersApi.md#containerInspectLibpodWithHttpInfo) | **GET** /libpod/containers/{name}/json | Inspect container |
| [**containerKillLibpod**](ContainersApi.md#containerKillLibpod) | **POST** /libpod/containers/{name}/kill | Kill container |
| [**containerKillLibpodWithHttpInfo**](ContainersApi.md#containerKillLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/kill | Kill container |
| [**containerListLibpod**](ContainersApi.md#containerListLibpod) | **GET** /libpod/containers/json | List containers |
| [**containerListLibpodWithHttpInfo**](ContainersApi.md#containerListLibpodWithHttpInfo) | **GET** /libpod/containers/json | List containers |
| [**containerLogsLibpod**](ContainersApi.md#containerLogsLibpod) | **GET** /libpod/containers/{name}/logs | Get container logs |
| [**containerLogsLibpodWithHttpInfo**](ContainersApi.md#containerLogsLibpodWithHttpInfo) | **GET** /libpod/containers/{name}/logs | Get container logs |
| [**containerMountLibpod**](ContainersApi.md#containerMountLibpod) | **POST** /libpod/containers/{name}/mount | Mount a container |
| [**containerMountLibpodWithHttpInfo**](ContainersApi.md#containerMountLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/mount | Mount a container |
| [**containerPauseLibpod**](ContainersApi.md#containerPauseLibpod) | **POST** /libpod/containers/{name}/pause | Pause a container |
| [**containerPauseLibpodWithHttpInfo**](ContainersApi.md#containerPauseLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/pause | Pause a container |
| [**containerPruneLibpod**](ContainersApi.md#containerPruneLibpod) | **POST** /libpod/containers/prune | Delete stopped containers |
| [**containerPruneLibpodWithHttpInfo**](ContainersApi.md#containerPruneLibpodWithHttpInfo) | **POST** /libpod/containers/prune | Delete stopped containers |
| [**containerRenameLibpod**](ContainersApi.md#containerRenameLibpod) | **POST** /libpod/containers/{name}/rename | Rename an existing container |
| [**containerRenameLibpodWithHttpInfo**](ContainersApi.md#containerRenameLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/rename | Rename an existing container |
| [**containerResizeLibpod**](ContainersApi.md#containerResizeLibpod) | **POST** /libpod/containers/{name}/resize | Resize a container&#39;s TTY |
| [**containerResizeLibpodWithHttpInfo**](ContainersApi.md#containerResizeLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/resize | Resize a container&#39;s TTY |
| [**containerRestartLibpod**](ContainersApi.md#containerRestartLibpod) | **POST** /libpod/containers/{name}/restart | Restart a container |
| [**containerRestartLibpodWithHttpInfo**](ContainersApi.md#containerRestartLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/restart | Restart a container |
| [**containerRestoreLibpod**](ContainersApi.md#containerRestoreLibpod) | **POST** /libpod/containers/{name}/restore | Restore a container |
| [**containerRestoreLibpodWithHttpInfo**](ContainersApi.md#containerRestoreLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/restore | Restore a container |
| [**containerShowMountedLibpod**](ContainersApi.md#containerShowMountedLibpod) | **GET** /libpod/containers/showmounted | Show mounted containers |
| [**containerShowMountedLibpodWithHttpInfo**](ContainersApi.md#containerShowMountedLibpodWithHttpInfo) | **GET** /libpod/containers/showmounted | Show mounted containers |
| [**containerStartLibpod**](ContainersApi.md#containerStartLibpod) | **POST** /libpod/containers/{name}/start | Start a container |
| [**containerStartLibpodWithHttpInfo**](ContainersApi.md#containerStartLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/start | Start a container |
| [**containerStatsLibpod**](ContainersApi.md#containerStatsLibpod) | **GET** /libpod/containers/{name}/stats | Get stats for a container |
| [**containerStatsLibpodWithHttpInfo**](ContainersApi.md#containerStatsLibpodWithHttpInfo) | **GET** /libpod/containers/{name}/stats | Get stats for a container |
| [**containerStopLibpod**](ContainersApi.md#containerStopLibpod) | **POST** /libpod/containers/{name}/stop | Stop a container |
| [**containerStopLibpodWithHttpInfo**](ContainersApi.md#containerStopLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/stop | Stop a container |
| [**containerTopLibpod**](ContainersApi.md#containerTopLibpod) | **GET** /libpod/containers/{name}/top | List processes |
| [**containerTopLibpodWithHttpInfo**](ContainersApi.md#containerTopLibpodWithHttpInfo) | **GET** /libpod/containers/{name}/top | List processes |
| [**containerUnmountLibpod**](ContainersApi.md#containerUnmountLibpod) | **POST** /libpod/containers/{name}/unmount | Unmount a container |
| [**containerUnmountLibpodWithHttpInfo**](ContainersApi.md#containerUnmountLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/unmount | Unmount a container |
| [**containerUnpauseLibpod**](ContainersApi.md#containerUnpauseLibpod) | **POST** /libpod/containers/{name}/unpause | Unpause Container |
| [**containerUnpauseLibpodWithHttpInfo**](ContainersApi.md#containerUnpauseLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/unpause | Unpause Container |
| [**containerUpdateLibpod**](ContainersApi.md#containerUpdateLibpod) | **POST** /libpod/containers/{name}/update | Update an existing containers cgroup configuration |
| [**containerUpdateLibpodWithHttpInfo**](ContainersApi.md#containerUpdateLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/update | Update an existing containers cgroup configuration |
| [**containerWaitLibpod**](ContainersApi.md#containerWaitLibpod) | **POST** /libpod/containers/{name}/wait | Wait on a container |
| [**containerWaitLibpodWithHttpInfo**](ContainersApi.md#containerWaitLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/wait | Wait on a container |
| [**containersStatsAllLibpod**](ContainersApi.md#containersStatsAllLibpod) | **GET** /libpod/containers/stats | Get stats for one or more containers |
| [**containersStatsAllLibpodWithHttpInfo**](ContainersApi.md#containersStatsAllLibpodWithHttpInfo) | **GET** /libpod/containers/stats | Get stats for one or more containers |
| [**generateKubeLibpod**](ContainersApi.md#generateKubeLibpod) | **GET** /libpod/generate/kube | Generate a Kubernetes YAML file. |
| [**generateKubeLibpodWithHttpInfo**](ContainersApi.md#generateKubeLibpodWithHttpInfo) | **GET** /libpod/generate/kube | Generate a Kubernetes YAML file. |
| [**generateSystemdLibpod**](ContainersApi.md#generateSystemdLibpod) | **GET** /libpod/generate/{name}/systemd | Generate Systemd Units |
| [**generateSystemdLibpodWithHttpInfo**](ContainersApi.md#generateSystemdLibpodWithHttpInfo) | **GET** /libpod/generate/{name}/systemd | Generate Systemd Units |
| [**imageCommitLibpod**](ContainersApi.md#imageCommitLibpod) | **POST** /libpod/commit | Commit |
| [**imageCommitLibpodWithHttpInfo**](ContainersApi.md#imageCommitLibpodWithHttpInfo) | **POST** /libpod/commit | Commit |
| [**kubeApplyLibpod**](ContainersApi.md#kubeApplyLibpod) | **POST** /libpod/kube/apply | Apply a podman workload or Kubernetes YAML file. |
| [**kubeApplyLibpodWithHttpInfo**](ContainersApi.md#kubeApplyLibpodWithHttpInfo) | **POST** /libpod/kube/apply | Apply a podman workload or Kubernetes YAML file. |
| [**playKubeDownLibpod**](ContainersApi.md#playKubeDownLibpod) | **DELETE** /libpod/play/kube | Remove resources created from kube play |
| [**playKubeDownLibpodWithHttpInfo**](ContainersApi.md#playKubeDownLibpodWithHttpInfo) | **DELETE** /libpod/play/kube | Remove resources created from kube play |
| [**playKubeLibpod**](ContainersApi.md#playKubeLibpod) | **POST** /libpod/play/kube | Play a Kubernetes YAML file. |
| [**playKubeLibpodWithHttpInfo**](ContainersApi.md#playKubeLibpodWithHttpInfo) | **POST** /libpod/play/kube | Play a Kubernetes YAML file. |
| [**putContainerArchiveLibpod**](ContainersApi.md#putContainerArchiveLibpod) | **PUT** /libpod/containers/{name}/archive | Copy files into a container |
| [**putContainerArchiveLibpodWithHttpInfo**](ContainersApi.md#putContainerArchiveLibpodWithHttpInfo) | **PUT** /libpod/containers/{name}/archive | Copy files into a container |



## containerAttachLibpod

> void containerAttachLibpod(name, detachKeys, logs, stream, stdout, stderr, stdin)

Attach to a container

Attach to a container to read its output or send it input. You can attach to the same container multiple times and you can reattach to containers that have been detached.  ### Hijacking  This endpoint hijacks the HTTP connection to transport &#x60;stdin&#x60;, &#x60;stdout&#x60;, and &#x60;stderr&#x60; on the same socket.  This is the response from the service for an attach request:  &#x60;&#x60;&#x60; HTTP/1.1 200 OK Content-Type: application/vnd.docker.raw-stream  [STREAM] &#x60;&#x60;&#x60;  After the headers and two new lines, the TCP connection can now be used for raw, bidirectional communication between the client and server.  To inform potential proxies about connection hijacking, the client can also optionally send connection upgrade headers.  For example, the client sends this request to upgrade the connection:  &#x60;&#x60;&#x60; POST /v4.6.0/libpod/containers/16253994b7c4/attach?stream&#x3D;1&amp;stdout&#x3D;1 HTTP/1.1 Upgrade: tcp Connection: Upgrade &#x60;&#x60;&#x60;  The service will respond with a &#x60;101 UPGRADED&#x60; response, and will similarly follow with the raw stream:  &#x60;&#x60;&#x60; HTTP/1.1 101 UPGRADED Content-Type: application/vnd.docker.raw-stream Connection: Upgrade Upgrade: tcp  [STREAM] &#x60;&#x60;&#x60;  ### Stream format  When the TTY setting is disabled for the container, the HTTP Content-Type header is set to application/vnd.docker.multiplexed-stream (starting with v4.7.0, previously application/vnd.docker.raw-stream was always used) and the stream over the hijacked connected is multiplexed to separate out &#x60;stdout&#x60; and &#x60;stderr&#x60;. The stream consists of a series of frames, each containing a header and a payload.  The header contains the information about the output stream type and the size of the payload. It is encoded on the first eight bytes like this:  &#x60;&#x60;&#x60;go header :&#x3D; [8]byte{STREAM_TYPE, 0, 0, 0, SIZE1, SIZE2, SIZE3, SIZE4} &#x60;&#x60;&#x60;  &#x60;STREAM_TYPE&#x60; can be:  - 0: &#x60;stdin&#x60; (is written on &#x60;stdout&#x60;) - 1: &#x60;stdout&#x60; - 2: &#x60;stderr&#x60;  &#x60;SIZE1, SIZE2, SIZE3, SIZE4&#x60; are the four bytes of the &#x60;uint32&#x60; size encoded as big endian.  Following the header is the payload, which contains the specified number of bytes as written in the size.  The simplest way to implement this protocol is the following:  1. Read 8 bytes. 2. Choose &#x60;stdout&#x60; or &#x60;stderr&#x60; depending on the first byte. 3. Extract the frame size from the last four bytes. 4. Read the extracted size and output it on the correct output. 5. Goto 1.  ### Stream format when using a TTY  When the TTY setting is enabled for the container, the stream is not multiplexed. The data exchanged over the hijacked connection is simply the raw data from the process PTY and client&#39;s &#x60;stdin&#x60;. 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        String detachKeys = "detachKeys_example"; // String | keys to use for detaching from the container
        Boolean logs = true; // Boolean | Stream all logs from the container across the connection. Happens before streaming attach (if requested). At least one of logs or stream must be set
        Boolean stream = true; // Boolean | Attach to the container. If unset, and logs is set, only the container's logs will be sent. At least one of stream or logs must be set
        Boolean stdout = true; // Boolean | Attach to container STDOUT
        Boolean stderr = true; // Boolean | Attach to container STDERR
        Boolean stdin = true; // Boolean | Attach to container STDIN
        try {
            apiInstance.containerAttachLibpod(name, detachKeys, logs, stream, stdout, stderr, stdin);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerAttachLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **detachKeys** | **String**| keys to use for detaching from the container | [optional] |
| **logs** | **Boolean**| Stream all logs from the container across the connection. Happens before streaming attach (if requested). At least one of logs or stream must be set | [optional] |
| **stream** | **Boolean**| Attach to the container. If unset, and logs is set, only the container&#39;s logs will be sent. At least one of stream or logs must be set | [optional] [default to true] |
| **stdout** | **Boolean**| Attach to container STDOUT | [optional] |
| **stderr** | **Boolean**| Attach to container STDERR | [optional] |
| **stdin** | **Boolean**| Attach to container STDIN | [optional] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **101** | No error, connection has been hijacked for transporting streams. |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerAttachLibpodWithHttpInfo

> ApiResponse<Void> containerAttachLibpod containerAttachLibpodWithHttpInfo(name, detachKeys, logs, stream, stdout, stderr, stdin)

Attach to a container

Attach to a container to read its output or send it input. You can attach to the same container multiple times and you can reattach to containers that have been detached.  ### Hijacking  This endpoint hijacks the HTTP connection to transport &#x60;stdin&#x60;, &#x60;stdout&#x60;, and &#x60;stderr&#x60; on the same socket.  This is the response from the service for an attach request:  &#x60;&#x60;&#x60; HTTP/1.1 200 OK Content-Type: application/vnd.docker.raw-stream  [STREAM] &#x60;&#x60;&#x60;  After the headers and two new lines, the TCP connection can now be used for raw, bidirectional communication between the client and server.  To inform potential proxies about connection hijacking, the client can also optionally send connection upgrade headers.  For example, the client sends this request to upgrade the connection:  &#x60;&#x60;&#x60; POST /v4.6.0/libpod/containers/16253994b7c4/attach?stream&#x3D;1&amp;stdout&#x3D;1 HTTP/1.1 Upgrade: tcp Connection: Upgrade &#x60;&#x60;&#x60;  The service will respond with a &#x60;101 UPGRADED&#x60; response, and will similarly follow with the raw stream:  &#x60;&#x60;&#x60; HTTP/1.1 101 UPGRADED Content-Type: application/vnd.docker.raw-stream Connection: Upgrade Upgrade: tcp  [STREAM] &#x60;&#x60;&#x60;  ### Stream format  When the TTY setting is disabled for the container, the HTTP Content-Type header is set to application/vnd.docker.multiplexed-stream (starting with v4.7.0, previously application/vnd.docker.raw-stream was always used) and the stream over the hijacked connected is multiplexed to separate out &#x60;stdout&#x60; and &#x60;stderr&#x60;. The stream consists of a series of frames, each containing a header and a payload.  The header contains the information about the output stream type and the size of the payload. It is encoded on the first eight bytes like this:  &#x60;&#x60;&#x60;go header :&#x3D; [8]byte{STREAM_TYPE, 0, 0, 0, SIZE1, SIZE2, SIZE3, SIZE4} &#x60;&#x60;&#x60;  &#x60;STREAM_TYPE&#x60; can be:  - 0: &#x60;stdin&#x60; (is written on &#x60;stdout&#x60;) - 1: &#x60;stdout&#x60; - 2: &#x60;stderr&#x60;  &#x60;SIZE1, SIZE2, SIZE3, SIZE4&#x60; are the four bytes of the &#x60;uint32&#x60; size encoded as big endian.  Following the header is the payload, which contains the specified number of bytes as written in the size.  The simplest way to implement this protocol is the following:  1. Read 8 bytes. 2. Choose &#x60;stdout&#x60; or &#x60;stderr&#x60; depending on the first byte. 3. Extract the frame size from the last four bytes. 4. Read the extracted size and output it on the correct output. 5. Goto 1.  ### Stream format when using a TTY  When the TTY setting is enabled for the container, the stream is not multiplexed. The data exchanged over the hijacked connection is simply the raw data from the process PTY and client&#39;s &#x60;stdin&#x60;. 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        String detachKeys = "detachKeys_example"; // String | keys to use for detaching from the container
        Boolean logs = true; // Boolean | Stream all logs from the container across the connection. Happens before streaming attach (if requested). At least one of logs or stream must be set
        Boolean stream = true; // Boolean | Attach to the container. If unset, and logs is set, only the container's logs will be sent. At least one of stream or logs must be set
        Boolean stdout = true; // Boolean | Attach to container STDOUT
        Boolean stderr = true; // Boolean | Attach to container STDERR
        Boolean stdin = true; // Boolean | Attach to container STDIN
        try {
            ApiResponse<Void> response = apiInstance.containerAttachLibpodWithHttpInfo(name, detachKeys, logs, stream, stdout, stderr, stdin);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerAttachLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **detachKeys** | **String**| keys to use for detaching from the container | [optional] |
| **logs** | **Boolean**| Stream all logs from the container across the connection. Happens before streaming attach (if requested). At least one of logs or stream must be set | [optional] |
| **stream** | **Boolean**| Attach to the container. If unset, and logs is set, only the container&#39;s logs will be sent. At least one of stream or logs must be set | [optional] [default to true] |
| **stdout** | **Boolean**| Attach to container STDOUT | [optional] |
| **stderr** | **Boolean**| Attach to container STDERR | [optional] |
| **stdin** | **Boolean**| Attach to container STDIN | [optional] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **101** | No error, connection has been hijacked for transporting streams. |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerChangesLibpod

> void containerChangesLibpod(name, parent, diffType)

Report on changes to container&#39;s filesystem; adds, deletes or modifications.

Returns which files in a container&#39;s filesystem have been added, deleted, or modified. The Kind of modification can be one of:  0: Modified 1: Added 2: Deleted 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or id of the container
        String parent = "parent_example"; // String | specify a second layer which is used to compare against it instead of the parent layer
        String diffType = "all"; // String | select what you want to match, default is all
        try {
            apiInstance.containerChangesLibpod(name, parent, diffType);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerChangesLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or id of the container | |
| **parent** | **String**| specify a second layer which is used to compare against it instead of the parent layer | [optional] |
| **diffType** | **String**| select what you want to match, default is all | [optional] [enum: all, container, image] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Changes |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerChangesLibpodWithHttpInfo

> ApiResponse<Void> containerChangesLibpod containerChangesLibpodWithHttpInfo(name, parent, diffType)

Report on changes to container&#39;s filesystem; adds, deletes or modifications.

Returns which files in a container&#39;s filesystem have been added, deleted, or modified. The Kind of modification can be one of:  0: Modified 1: Added 2: Deleted 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or id of the container
        String parent = "parent_example"; // String | specify a second layer which is used to compare against it instead of the parent layer
        String diffType = "all"; // String | select what you want to match, default is all
        try {
            ApiResponse<Void> response = apiInstance.containerChangesLibpodWithHttpInfo(name, parent, diffType);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerChangesLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or id of the container | |
| **parent** | **String**| specify a second layer which is used to compare against it instead of the parent layer | [optional] |
| **diffType** | **String**| select what you want to match, default is all | [optional] [enum: all, container, image] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Changes |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerCheckpointLibpod

> void containerCheckpointLibpod(name, keep, leaveRunning, tcpEstablished, export, ignoreRootFS, ignoreVolumes, preCheckpoint, withPrevious, fileLocks, printStats)

Checkpoint a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Boolean keep = true; // Boolean | keep all temporary checkpoint files
        Boolean leaveRunning = true; // Boolean | leave the container running after writing checkpoint to disk
        Boolean tcpEstablished = true; // Boolean | checkpoint a container with established TCP connections
        Boolean export = true; // Boolean | export the checkpoint image to a tar.gz
        Boolean ignoreRootFS = true; // Boolean | do not include root file-system changes when exporting. can only be used with export
        Boolean ignoreVolumes = true; // Boolean | do not include associated volumes. can only be used with export
        Boolean preCheckpoint = true; // Boolean | dump the container's memory information only, leaving the container running. only works on runc 1.0-rc or higher
        Boolean withPrevious = true; // Boolean | check out the container with previous criu image files in pre-dump. only works on runc 1.0-rc or higher
        Boolean fileLocks = true; // Boolean | checkpoint a container with filelocks
        Boolean printStats = true; // Boolean | add checkpoint statistics to the returned CheckpointReport
        try {
            apiInstance.containerCheckpointLibpod(name, keep, leaveRunning, tcpEstablished, export, ignoreRootFS, ignoreVolumes, preCheckpoint, withPrevious, fileLocks, printStats);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerCheckpointLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **keep** | **Boolean**| keep all temporary checkpoint files | [optional] |
| **leaveRunning** | **Boolean**| leave the container running after writing checkpoint to disk | [optional] |
| **tcpEstablished** | **Boolean**| checkpoint a container with established TCP connections | [optional] |
| **export** | **Boolean**| export the checkpoint image to a tar.gz | [optional] |
| **ignoreRootFS** | **Boolean**| do not include root file-system changes when exporting. can only be used with export | [optional] |
| **ignoreVolumes** | **Boolean**| do not include associated volumes. can only be used with export | [optional] |
| **preCheckpoint** | **Boolean**| dump the container&#39;s memory information only, leaving the container running. only works on runc 1.0-rc or higher | [optional] |
| **withPrevious** | **Boolean**| check out the container with previous criu image files in pre-dump. only works on runc 1.0-rc or higher | [optional] |
| **fileLocks** | **Boolean**| checkpoint a container with filelocks | [optional] |
| **printStats** | **Boolean**| add checkpoint statistics to the returned CheckpointReport | [optional] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | tarball is returned in body if exported |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerCheckpointLibpodWithHttpInfo

> ApiResponse<Void> containerCheckpointLibpod containerCheckpointLibpodWithHttpInfo(name, keep, leaveRunning, tcpEstablished, export, ignoreRootFS, ignoreVolumes, preCheckpoint, withPrevious, fileLocks, printStats)

Checkpoint a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Boolean keep = true; // Boolean | keep all temporary checkpoint files
        Boolean leaveRunning = true; // Boolean | leave the container running after writing checkpoint to disk
        Boolean tcpEstablished = true; // Boolean | checkpoint a container with established TCP connections
        Boolean export = true; // Boolean | export the checkpoint image to a tar.gz
        Boolean ignoreRootFS = true; // Boolean | do not include root file-system changes when exporting. can only be used with export
        Boolean ignoreVolumes = true; // Boolean | do not include associated volumes. can only be used with export
        Boolean preCheckpoint = true; // Boolean | dump the container's memory information only, leaving the container running. only works on runc 1.0-rc or higher
        Boolean withPrevious = true; // Boolean | check out the container with previous criu image files in pre-dump. only works on runc 1.0-rc or higher
        Boolean fileLocks = true; // Boolean | checkpoint a container with filelocks
        Boolean printStats = true; // Boolean | add checkpoint statistics to the returned CheckpointReport
        try {
            ApiResponse<Void> response = apiInstance.containerCheckpointLibpodWithHttpInfo(name, keep, leaveRunning, tcpEstablished, export, ignoreRootFS, ignoreVolumes, preCheckpoint, withPrevious, fileLocks, printStats);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerCheckpointLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **keep** | **Boolean**| keep all temporary checkpoint files | [optional] |
| **leaveRunning** | **Boolean**| leave the container running after writing checkpoint to disk | [optional] |
| **tcpEstablished** | **Boolean**| checkpoint a container with established TCP connections | [optional] |
| **export** | **Boolean**| export the checkpoint image to a tar.gz | [optional] |
| **ignoreRootFS** | **Boolean**| do not include root file-system changes when exporting. can only be used with export | [optional] |
| **ignoreVolumes** | **Boolean**| do not include associated volumes. can only be used with export | [optional] |
| **preCheckpoint** | **Boolean**| dump the container&#39;s memory information only, leaving the container running. only works on runc 1.0-rc or higher | [optional] |
| **withPrevious** | **Boolean**| check out the container with previous criu image files in pre-dump. only works on runc 1.0-rc or higher | [optional] |
| **fileLocks** | **Boolean**| checkpoint a container with filelocks | [optional] |
| **printStats** | **Boolean**| add checkpoint statistics to the returned CheckpointReport | [optional] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | tarball is returned in body if exported |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerCreateLibpod

> ContainerCreateResponse containerCreateLibpod(create)

Create a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        SpecGenerator create = new SpecGenerator(); // SpecGenerator | attributes for creating a container
        try {
            ContainerCreateResponse result = apiInstance.containerCreateLibpod(create);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerCreateLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **create** | [**SpecGenerator**](SpecGenerator.md)| attributes for creating a container | |

### Return type

[**ContainerCreateResponse**](ContainerCreateResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create container |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

## containerCreateLibpodWithHttpInfo

> ApiResponse<ContainerCreateResponse> containerCreateLibpod containerCreateLibpodWithHttpInfo(create)

Create a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        SpecGenerator create = new SpecGenerator(); // SpecGenerator | attributes for creating a container
        try {
            ApiResponse<ContainerCreateResponse> response = apiInstance.containerCreateLibpodWithHttpInfo(create);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerCreateLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **create** | [**SpecGenerator**](SpecGenerator.md)| attributes for creating a container | |

### Return type

ApiResponse<[**ContainerCreateResponse**](ContainerCreateResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create container |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |


## containerDeleteLibpod

> List<LibpodContainersRmReport> containerDeleteLibpod(name, depend, force, ignore, timeout, v)

Delete container

Delete container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Boolean depend = true; // Boolean | additionally remove containers that depend on the container to be removed
        Boolean force = true; // Boolean | force stop container if running
        Boolean ignore = true; // Boolean | ignore errors when the container to be removed does not existxo
        Integer timeout = 10; // Integer | number of seconds to wait before killing container when force removing
        Boolean v = true; // Boolean | delete volumes
        try {
            List<LibpodContainersRmReport> result = apiInstance.containerDeleteLibpod(name, depend, force, ignore, timeout, v);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerDeleteLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **depend** | **Boolean**| additionally remove containers that depend on the container to be removed | [optional] |
| **force** | **Boolean**| force stop container if running | [optional] |
| **ignore** | **Boolean**| ignore errors when the container to be removed does not existxo | [optional] |
| **timeout** | **Integer**| number of seconds to wait before killing container when force removing | [optional] [default to 10] |
| **v** | **Boolean**| delete volumes | [optional] |

### Return type

[**List&lt;LibpodContainersRmReport&gt;**](LibpodContainersRmReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Remove Containers |  -  |
| **204** | no error |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

## containerDeleteLibpodWithHttpInfo

> ApiResponse<List<LibpodContainersRmReport>> containerDeleteLibpod containerDeleteLibpodWithHttpInfo(name, depend, force, ignore, timeout, v)

Delete container

Delete container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Boolean depend = true; // Boolean | additionally remove containers that depend on the container to be removed
        Boolean force = true; // Boolean | force stop container if running
        Boolean ignore = true; // Boolean | ignore errors when the container to be removed does not existxo
        Integer timeout = 10; // Integer | number of seconds to wait before killing container when force removing
        Boolean v = true; // Boolean | delete volumes
        try {
            ApiResponse<List<LibpodContainersRmReport>> response = apiInstance.containerDeleteLibpodWithHttpInfo(name, depend, force, ignore, timeout, v);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerDeleteLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **depend** | **Boolean**| additionally remove containers that depend on the container to be removed | [optional] |
| **force** | **Boolean**| force stop container if running | [optional] |
| **ignore** | **Boolean**| ignore errors when the container to be removed does not existxo | [optional] |
| **timeout** | **Integer**| number of seconds to wait before killing container when force removing | [optional] [default to 10] |
| **v** | **Boolean**| delete volumes | [optional] |

### Return type

ApiResponse<[**List&lt;LibpodContainersRmReport&gt;**](LibpodContainersRmReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Remove Containers |  -  |
| **204** | no error |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |


## containerExistsLibpod

> void containerExistsLibpod(name)

Check if container exists

Quick way to determine if a container exists by name or ID

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            apiInstance.containerExistsLibpod(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerExistsLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | container exists |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerExistsLibpodWithHttpInfo

> ApiResponse<Void> containerExistsLibpod containerExistsLibpodWithHttpInfo(name)

Check if container exists

Quick way to determine if a container exists by name or ID

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            ApiResponse<Void> response = apiInstance.containerExistsLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerExistsLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | container exists |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerExportLibpod

> void containerExportLibpod(name)

Export a container

Export the contents of a container as a tarball.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            apiInstance.containerExportLibpod(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerExportLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | tarball is returned in body |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerExportLibpodWithHttpInfo

> ApiResponse<Void> containerExportLibpod containerExportLibpodWithHttpInfo(name)

Export a container

Export the contents of a container as a tarball.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            ApiResponse<Void> response = apiInstance.containerExportLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerExportLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | tarball is returned in body |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerHealthcheckLibpod

> HealthCheckResults containerHealthcheckLibpod(name)

Run a container&#39;s healthcheck

Execute the defined healthcheck and return information about the results

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            HealthCheckResults result = apiInstance.containerHealthcheckLibpod(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerHealthcheckLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type

[**HealthCheckResults**](HealthCheckResults.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Healthcheck Results |  -  |
| **404** | No such container |  -  |
| **409** | container has no healthcheck or is not running |  -  |
| **500** | Internal server error |  -  |

## containerHealthcheckLibpodWithHttpInfo

> ApiResponse<HealthCheckResults> containerHealthcheckLibpod containerHealthcheckLibpodWithHttpInfo(name)

Run a container&#39;s healthcheck

Execute the defined healthcheck and return information about the results

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            ApiResponse<HealthCheckResults> response = apiInstance.containerHealthcheckLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerHealthcheckLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type

ApiResponse<[**HealthCheckResults**](HealthCheckResults.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Healthcheck Results |  -  |
| **404** | No such container |  -  |
| **409** | container has no healthcheck or is not running |  -  |
| **500** | Internal server error |  -  |


## containerInitLibpod

> void containerInitLibpod(name)

Initialize a container

Performs all tasks necessary for initializing the container but does not start the container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            apiInstance.containerInitLibpod(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerInitLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **304** | container already initialized |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerInitLibpodWithHttpInfo

> ApiResponse<Void> containerInitLibpod containerInitLibpodWithHttpInfo(name)

Initialize a container

Performs all tasks necessary for initializing the container but does not start the container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            ApiResponse<Void> response = apiInstance.containerInitLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerInitLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **304** | container already initialized |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerInspectLibpod

> InspectContainerData containerInspectLibpod(name, size)

Inspect container

Return low-level information about a container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Boolean size = true; // Boolean | display filesystem usage
        try {
            InspectContainerData result = apiInstance.containerInspectLibpod(name, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerInspectLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **size** | **Boolean**| display filesystem usage | [optional] |

### Return type

[**InspectContainerData**](InspectContainerData.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inspect container |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerInspectLibpodWithHttpInfo

> ApiResponse<InspectContainerData> containerInspectLibpod containerInspectLibpodWithHttpInfo(name, size)

Inspect container

Return low-level information about a container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Boolean size = true; // Boolean | display filesystem usage
        try {
            ApiResponse<InspectContainerData> response = apiInstance.containerInspectLibpodWithHttpInfo(name, size);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerInspectLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **size** | **Boolean**| display filesystem usage | [optional] |

### Return type

ApiResponse<[**InspectContainerData**](InspectContainerData.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inspect container |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerKillLibpod

> void containerKillLibpod(name, signal)

Kill container

send a signal to a container, defaults to killing the container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        String signal = "SIGKILL"; // String | signal to be sent to container, either by integer or SIG_ name
        try {
            apiInstance.containerKillLibpod(name, signal);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerKillLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **signal** | **String**| signal to be sent to container, either by integer or SIG_ name | [optional] [default to SIGKILL] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

## containerKillLibpodWithHttpInfo

> ApiResponse<Void> containerKillLibpod containerKillLibpodWithHttpInfo(name, signal)

Kill container

send a signal to a container, defaults to killing the container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        String signal = "SIGKILL"; // String | signal to be sent to container, either by integer or SIG_ name
        try {
            ApiResponse<Void> response = apiInstance.containerKillLibpodWithHttpInfo(name, signal);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerKillLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **signal** | **String**| signal to be sent to container, either by integer or SIG_ name | [optional] [default to SIGKILL] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |


## containerListLibpod

> List<ListContainer> containerListLibpod(all, limit, namespace, pod, size, sync, filters)

List containers

Returns a list of containers

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        Boolean all = false; // Boolean | Return all containers. By default, only running containers are shown
        Integer limit = 56; // Integer | Return this number of most recently created containers, including non-running ones.
        Boolean namespace = false; // Boolean | Include namespace information
        Boolean pod = false; // Boolean | Ignored. Previously included details on pod name and ID that are currently included by default.
        Boolean size = false; // Boolean | Return the size of container as fields SizeRw and SizeRootFs.
        Boolean sync = false; // Boolean | Sync container state with OCI runtime
        String filters = "filters_example"; // String | A JSON encoded value of the filters (a `map[string][]string`) to process on the containers list. Available filters: - `ancestor`=(`<image-name>[:<tag>]`, `<image id>`, or `<image@digest>`) - `before`=(`<container id>` or `<container name>`) - `expose`=(`<port>[/<proto>]` or `<startport-endport>/[<proto>]`) - `exited=<int>` containers with exit code of `<int>` - `health`=(`starting`, `healthy`, `unhealthy` or `none`) - `id=<ID>` a container's ID - `is-task`=(`true` or `false`) - `label`=(`key` or `\"key=value\"`) of a container label - `name=<name>` a container's name - `network`=(`<network id>` or `<network name>`) - `pod`=(`<pod id>` or `<pod name>`) - `publish`=(`<port>[/<proto>]` or `<startport-endport>/[<proto>]`) - `since`=(`<container id>` or `<container name>`) - `status`=(`created`, `restarting`, `running`, `removing`, `paused`, `exited` or `dead`) - `volume`=(`<volume name>` or `<mount point destination>`) 
        try {
            List<ListContainer> result = apiInstance.containerListLibpod(all, limit, namespace, pod, size, sync, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerListLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **all** | **Boolean**| Return all containers. By default, only running containers are shown | [optional] [default to false] |
| **limit** | **Integer**| Return this number of most recently created containers, including non-running ones. | [optional] |
| **namespace** | **Boolean**| Include namespace information | [optional] [default to false] |
| **pod** | **Boolean**| Ignored. Previously included details on pod name and ID that are currently included by default. | [optional] [default to false] |
| **size** | **Boolean**| Return the size of container as fields SizeRw and SizeRootFs. | [optional] [default to false] |
| **sync** | **Boolean**| Sync container state with OCI runtime | [optional] [default to false] |
| **filters** | **String**| A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the containers list. Available filters: - &#x60;ancestor&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;, &#x60;&lt;image id&gt;&#x60;, or &#x60;&lt;image@digest&gt;&#x60;) - &#x60;before&#x60;&#x3D;(&#x60;&lt;container id&gt;&#x60; or &#x60;&lt;container name&gt;&#x60;) - &#x60;expose&#x60;&#x3D;(&#x60;&lt;port&gt;[/&lt;proto&gt;]&#x60; or &#x60;&lt;startport-endport&gt;/[&lt;proto&gt;]&#x60;) - &#x60;exited&#x3D;&lt;int&gt;&#x60; containers with exit code of &#x60;&lt;int&gt;&#x60; - &#x60;health&#x60;&#x3D;(&#x60;starting&#x60;, &#x60;healthy&#x60;, &#x60;unhealthy&#x60; or &#x60;none&#x60;) - &#x60;id&#x3D;&lt;ID&gt;&#x60; a container&#39;s ID - &#x60;is-task&#x60;&#x3D;(&#x60;true&#x60; or &#x60;false&#x60;) - &#x60;label&#x60;&#x3D;(&#x60;key&#x60; or &#x60;\&quot;key&#x3D;value\&quot;&#x60;) of a container label - &#x60;name&#x3D;&lt;name&gt;&#x60; a container&#39;s name - &#x60;network&#x60;&#x3D;(&#x60;&lt;network id&gt;&#x60; or &#x60;&lt;network name&gt;&#x60;) - &#x60;pod&#x60;&#x3D;(&#x60;&lt;pod id&gt;&#x60; or &#x60;&lt;pod name&gt;&#x60;) - &#x60;publish&#x60;&#x3D;(&#x60;&lt;port&gt;[/&lt;proto&gt;]&#x60; or &#x60;&lt;startport-endport&gt;/[&lt;proto&gt;]&#x60;) - &#x60;since&#x60;&#x3D;(&#x60;&lt;container id&gt;&#x60; or &#x60;&lt;container name&gt;&#x60;) - &#x60;status&#x60;&#x3D;(&#x60;created&#x60;, &#x60;restarting&#x60;, &#x60;running&#x60;, &#x60;removing&#x60;, &#x60;paused&#x60;, &#x60;exited&#x60; or &#x60;dead&#x60;) - &#x60;volume&#x60;&#x3D;(&#x60;&lt;volume name&gt;&#x60; or &#x60;&lt;mount point destination&gt;&#x60;)  | [optional] |

### Return type

[**List&lt;ListContainer&gt;**](ListContainer.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Containers |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

## containerListLibpodWithHttpInfo

> ApiResponse<List<ListContainer>> containerListLibpod containerListLibpodWithHttpInfo(all, limit, namespace, pod, size, sync, filters)

List containers

Returns a list of containers

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        Boolean all = false; // Boolean | Return all containers. By default, only running containers are shown
        Integer limit = 56; // Integer | Return this number of most recently created containers, including non-running ones.
        Boolean namespace = false; // Boolean | Include namespace information
        Boolean pod = false; // Boolean | Ignored. Previously included details on pod name and ID that are currently included by default.
        Boolean size = false; // Boolean | Return the size of container as fields SizeRw and SizeRootFs.
        Boolean sync = false; // Boolean | Sync container state with OCI runtime
        String filters = "filters_example"; // String | A JSON encoded value of the filters (a `map[string][]string`) to process on the containers list. Available filters: - `ancestor`=(`<image-name>[:<tag>]`, `<image id>`, or `<image@digest>`) - `before`=(`<container id>` or `<container name>`) - `expose`=(`<port>[/<proto>]` or `<startport-endport>/[<proto>]`) - `exited=<int>` containers with exit code of `<int>` - `health`=(`starting`, `healthy`, `unhealthy` or `none`) - `id=<ID>` a container's ID - `is-task`=(`true` or `false`) - `label`=(`key` or `\"key=value\"`) of a container label - `name=<name>` a container's name - `network`=(`<network id>` or `<network name>`) - `pod`=(`<pod id>` or `<pod name>`) - `publish`=(`<port>[/<proto>]` or `<startport-endport>/[<proto>]`) - `since`=(`<container id>` or `<container name>`) - `status`=(`created`, `restarting`, `running`, `removing`, `paused`, `exited` or `dead`) - `volume`=(`<volume name>` or `<mount point destination>`) 
        try {
            ApiResponse<List<ListContainer>> response = apiInstance.containerListLibpodWithHttpInfo(all, limit, namespace, pod, size, sync, filters);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerListLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **all** | **Boolean**| Return all containers. By default, only running containers are shown | [optional] [default to false] |
| **limit** | **Integer**| Return this number of most recently created containers, including non-running ones. | [optional] |
| **namespace** | **Boolean**| Include namespace information | [optional] [default to false] |
| **pod** | **Boolean**| Ignored. Previously included details on pod name and ID that are currently included by default. | [optional] [default to false] |
| **size** | **Boolean**| Return the size of container as fields SizeRw and SizeRootFs. | [optional] [default to false] |
| **sync** | **Boolean**| Sync container state with OCI runtime | [optional] [default to false] |
| **filters** | **String**| A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the containers list. Available filters: - &#x60;ancestor&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;, &#x60;&lt;image id&gt;&#x60;, or &#x60;&lt;image@digest&gt;&#x60;) - &#x60;before&#x60;&#x3D;(&#x60;&lt;container id&gt;&#x60; or &#x60;&lt;container name&gt;&#x60;) - &#x60;expose&#x60;&#x3D;(&#x60;&lt;port&gt;[/&lt;proto&gt;]&#x60; or &#x60;&lt;startport-endport&gt;/[&lt;proto&gt;]&#x60;) - &#x60;exited&#x3D;&lt;int&gt;&#x60; containers with exit code of &#x60;&lt;int&gt;&#x60; - &#x60;health&#x60;&#x3D;(&#x60;starting&#x60;, &#x60;healthy&#x60;, &#x60;unhealthy&#x60; or &#x60;none&#x60;) - &#x60;id&#x3D;&lt;ID&gt;&#x60; a container&#39;s ID - &#x60;is-task&#x60;&#x3D;(&#x60;true&#x60; or &#x60;false&#x60;) - &#x60;label&#x60;&#x3D;(&#x60;key&#x60; or &#x60;\&quot;key&#x3D;value\&quot;&#x60;) of a container label - &#x60;name&#x3D;&lt;name&gt;&#x60; a container&#39;s name - &#x60;network&#x60;&#x3D;(&#x60;&lt;network id&gt;&#x60; or &#x60;&lt;network name&gt;&#x60;) - &#x60;pod&#x60;&#x3D;(&#x60;&lt;pod id&gt;&#x60; or &#x60;&lt;pod name&gt;&#x60;) - &#x60;publish&#x60;&#x3D;(&#x60;&lt;port&gt;[/&lt;proto&gt;]&#x60; or &#x60;&lt;startport-endport&gt;/[&lt;proto&gt;]&#x60;) - &#x60;since&#x60;&#x3D;(&#x60;&lt;container id&gt;&#x60; or &#x60;&lt;container name&gt;&#x60;) - &#x60;status&#x60;&#x3D;(&#x60;created&#x60;, &#x60;restarting&#x60;, &#x60;running&#x60;, &#x60;removing&#x60;, &#x60;paused&#x60;, &#x60;exited&#x60; or &#x60;dead&#x60;) - &#x60;volume&#x60;&#x3D;(&#x60;&lt;volume name&gt;&#x60; or &#x60;&lt;mount point destination&gt;&#x60;)  | [optional] |

### Return type

ApiResponse<[**List&lt;ListContainer&gt;**](ListContainer.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Containers |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |


## containerLogsLibpod

> void containerLogsLibpod(name, follow, stdout, stderr, since, until, timestamps, tail)

Get container logs

Get stdout and stderr logs from a container.  The stream format is the same as described in the attach endpoint. 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Boolean follow = true; // Boolean | Keep connection after returning logs.
        Boolean stdout = true; // Boolean | Return logs from stdout
        Boolean stderr = true; // Boolean | Return logs from stderr
        String since = "since_example"; // String | Only return logs since this time, as a UNIX timestamp
        String until = "until_example"; // String | Only return logs before this time, as a UNIX timestamp
        Boolean timestamps = false; // Boolean | Add timestamps to every log line
        String tail = "all"; // String | Only return this number of log lines from the end of the logs
        try {
            apiInstance.containerLogsLibpod(name, follow, stdout, stderr, since, until, timestamps, tail);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerLogsLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **follow** | **Boolean**| Keep connection after returning logs. | [optional] |
| **stdout** | **Boolean**| Return logs from stdout | [optional] |
| **stderr** | **Boolean**| Return logs from stderr | [optional] |
| **since** | **String**| Only return logs since this time, as a UNIX timestamp | [optional] |
| **until** | **String**| Only return logs before this time, as a UNIX timestamp | [optional] |
| **timestamps** | **Boolean**| Add timestamps to every log line | [optional] [default to false] |
| **tail** | **String**| Only return this number of log lines from the end of the logs | [optional] [default to all] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | logs returned as a stream in response body. |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerLogsLibpodWithHttpInfo

> ApiResponse<Void> containerLogsLibpod containerLogsLibpodWithHttpInfo(name, follow, stdout, stderr, since, until, timestamps, tail)

Get container logs

Get stdout and stderr logs from a container.  The stream format is the same as described in the attach endpoint. 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Boolean follow = true; // Boolean | Keep connection after returning logs.
        Boolean stdout = true; // Boolean | Return logs from stdout
        Boolean stderr = true; // Boolean | Return logs from stderr
        String since = "since_example"; // String | Only return logs since this time, as a UNIX timestamp
        String until = "until_example"; // String | Only return logs before this time, as a UNIX timestamp
        Boolean timestamps = false; // Boolean | Add timestamps to every log line
        String tail = "all"; // String | Only return this number of log lines from the end of the logs
        try {
            ApiResponse<Void> response = apiInstance.containerLogsLibpodWithHttpInfo(name, follow, stdout, stderr, since, until, timestamps, tail);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerLogsLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **follow** | **Boolean**| Keep connection after returning logs. | [optional] |
| **stdout** | **Boolean**| Return logs from stdout | [optional] |
| **stderr** | **Boolean**| Return logs from stderr | [optional] |
| **since** | **String**| Only return logs since this time, as a UNIX timestamp | [optional] |
| **until** | **String**| Only return logs before this time, as a UNIX timestamp | [optional] |
| **timestamps** | **Boolean**| Add timestamps to every log line | [optional] [default to false] |
| **tail** | **String**| Only return this number of log lines from the end of the logs | [optional] [default to all] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | logs returned as a stream in response body. |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerMountLibpod

> String containerMountLibpod(name)

Mount a container

Mount a container to the filesystem

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            String result = apiInstance.containerMountLibpod(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerMountLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type

**String**


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | mounted container |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerMountLibpodWithHttpInfo

> ApiResponse<String> containerMountLibpod containerMountLibpodWithHttpInfo(name)

Mount a container

Mount a container to the filesystem

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            ApiResponse<String> response = apiInstance.containerMountLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerMountLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type

ApiResponse<**String**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | mounted container |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerPauseLibpod

> void containerPauseLibpod(name)

Pause a container

Use the cgroups freezer to suspend all processes in a container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            apiInstance.containerPauseLibpod(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerPauseLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerPauseLibpodWithHttpInfo

> ApiResponse<Void> containerPauseLibpod containerPauseLibpodWithHttpInfo(name)

Pause a container

Use the cgroups freezer to suspend all processes in a container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            ApiResponse<Void> response = apiInstance.containerPauseLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerPauseLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerPruneLibpod

> List<ContainersPruneReportLibpod> containerPruneLibpod(filters)

Delete stopped containers

Remove containers not in use

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String filters = "filters_example"; // String | Filters to process on the prune list, encoded as JSON (a `map[string][]string`).  Available filters:  - `until=<timestamp>` Prune containers created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.  - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune containers with (or without, in case `label!=...` is used) the specified labels. 
        try {
            List<ContainersPruneReportLibpod> result = apiInstance.containerPruneLibpod(filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerPruneLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filters** | **String**| Filters to process on the prune list, encoded as JSON (a &#x60;map[string][]string&#x60;).  Available filters:  - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune containers created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.  - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune containers with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  | [optional] |

### Return type

[**List&lt;ContainersPruneReportLibpod&gt;**](ContainersPruneReportLibpod.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prune Containers |  -  |
| **500** | Internal server error |  -  |

## containerPruneLibpodWithHttpInfo

> ApiResponse<List<ContainersPruneReportLibpod>> containerPruneLibpod containerPruneLibpodWithHttpInfo(filters)

Delete stopped containers

Remove containers not in use

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String filters = "filters_example"; // String | Filters to process on the prune list, encoded as JSON (a `map[string][]string`).  Available filters:  - `until=<timestamp>` Prune containers created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.  - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune containers with (or without, in case `label!=...` is used) the specified labels. 
        try {
            ApiResponse<List<ContainersPruneReportLibpod>> response = apiInstance.containerPruneLibpodWithHttpInfo(filters);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerPruneLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filters** | **String**| Filters to process on the prune list, encoded as JSON (a &#x60;map[string][]string&#x60;).  Available filters:  - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune containers created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.  - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune containers with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  | [optional] |

### Return type

ApiResponse<[**List&lt;ContainersPruneReportLibpod&gt;**](ContainersPruneReportLibpod.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prune Containers |  -  |
| **500** | Internal server error |  -  |


## containerRenameLibpod

> void containerRenameLibpod(name, name2)

Rename an existing container

Change the name of an existing container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | Full or partial ID or full name of the container to rename
        String name2 = "name_example"; // String | New name for the container
        try {
            apiInstance.containerRenameLibpod(name, name2);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerRenameLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Full or partial ID or full name of the container to rename | |
| **name2** | **String**| New name for the container | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

## containerRenameLibpodWithHttpInfo

> ApiResponse<Void> containerRenameLibpod containerRenameLibpodWithHttpInfo(name, name2)

Rename an existing container

Change the name of an existing container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | Full or partial ID or full name of the container to rename
        String name2 = "name_example"; // String | New name for the container
        try {
            ApiResponse<Void> response = apiInstance.containerRenameLibpodWithHttpInfo(name, name2);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerRenameLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Full or partial ID or full name of the container to rename | |
| **name2** | **String**| New name for the container | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |


## containerResizeLibpod

> Object containerResizeLibpod(name, h, w)

Resize a container&#39;s TTY

Resize the terminal attached to a container (for use with Attach).

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Integer h = 56; // Integer | Height to set for the terminal, in characters
        Integer w = 56; // Integer | Width to set for the terminal, in characters
        try {
            Object result = apiInstance.containerResizeLibpod(name, h, w);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerResizeLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **h** | **Integer**| Height to set for the terminal, in characters | [optional] |
| **w** | **Integer**| Width to set for the terminal, in characters | [optional] |

### Return type

**Object**


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

## containerResizeLibpodWithHttpInfo

> ApiResponse<Object> containerResizeLibpod containerResizeLibpodWithHttpInfo(name, h, w)

Resize a container&#39;s TTY

Resize the terminal attached to a container (for use with Attach).

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Integer h = 56; // Integer | Height to set for the terminal, in characters
        Integer w = 56; // Integer | Width to set for the terminal, in characters
        try {
            ApiResponse<Object> response = apiInstance.containerResizeLibpodWithHttpInfo(name, h, w);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerResizeLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **h** | **Integer**| Height to set for the terminal, in characters | [optional] |
| **w** | **Integer**| Width to set for the terminal, in characters | [optional] |

### Return type

ApiResponse<**Object**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |


## containerRestartLibpod

> void containerRestartLibpod(name, t)

Restart a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Integer t = 10; // Integer | number of seconds to wait before killing container
        try {
            apiInstance.containerRestartLibpod(name, t);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerRestartLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **t** | **Integer**| number of seconds to wait before killing container | [optional] [default to 10] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerRestartLibpodWithHttpInfo

> ApiResponse<Void> containerRestartLibpod containerRestartLibpodWithHttpInfo(name, t)

Restart a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Integer t = 10; // Integer | number of seconds to wait before killing container
        try {
            ApiResponse<Void> response = apiInstance.containerRestartLibpodWithHttpInfo(name, t);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerRestartLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **t** | **Integer**| number of seconds to wait before killing container | [optional] [default to 10] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerRestoreLibpod

> void containerRestoreLibpod(name, name2, keep, tcpEstablished, _import, ignoreRootFS, ignoreVolumes, ignoreStaticIP, ignoreStaticMAC, fileLocks, printStats, pod)

Restore a container

Restore a container from a checkpoint.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or id of the container
        String name2 = "name_example"; // String | the name of the container when restored from a tar. can only be used with import
        Boolean keep = true; // Boolean | keep all temporary checkpoint files
        Boolean tcpEstablished = true; // Boolean | checkpoint a container with established TCP connections
        Boolean _import = true; // Boolean | import the restore from a checkpoint tar.gz
        Boolean ignoreRootFS = true; // Boolean | do not include root file-system changes when exporting. can only be used with import
        Boolean ignoreVolumes = true; // Boolean | do not restore associated volumes. can only be used with import
        Boolean ignoreStaticIP = true; // Boolean | ignore IP address if set statically
        Boolean ignoreStaticMAC = true; // Boolean | ignore MAC address if set statically
        Boolean fileLocks = true; // Boolean | restore a container with file locks
        Boolean printStats = true; // Boolean | add restore statistics to the returned RestoreReport
        String pod = "pod_example"; // String | pod to restore into
        try {
            apiInstance.containerRestoreLibpod(name, name2, keep, tcpEstablished, _import, ignoreRootFS, ignoreVolumes, ignoreStaticIP, ignoreStaticMAC, fileLocks, printStats, pod);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerRestoreLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or id of the container | |
| **name2** | **String**| the name of the container when restored from a tar. can only be used with import | [optional] |
| **keep** | **Boolean**| keep all temporary checkpoint files | [optional] |
| **tcpEstablished** | **Boolean**| checkpoint a container with established TCP connections | [optional] |
| **_import** | **Boolean**| import the restore from a checkpoint tar.gz | [optional] |
| **ignoreRootFS** | **Boolean**| do not include root file-system changes when exporting. can only be used with import | [optional] |
| **ignoreVolumes** | **Boolean**| do not restore associated volumes. can only be used with import | [optional] |
| **ignoreStaticIP** | **Boolean**| ignore IP address if set statically | [optional] |
| **ignoreStaticMAC** | **Boolean**| ignore MAC address if set statically | [optional] |
| **fileLocks** | **Boolean**| restore a container with file locks | [optional] |
| **printStats** | **Boolean**| add restore statistics to the returned RestoreReport | [optional] |
| **pod** | **String**| pod to restore into | [optional] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | tarball is returned in body if exported |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerRestoreLibpodWithHttpInfo

> ApiResponse<Void> containerRestoreLibpod containerRestoreLibpodWithHttpInfo(name, name2, keep, tcpEstablished, _import, ignoreRootFS, ignoreVolumes, ignoreStaticIP, ignoreStaticMAC, fileLocks, printStats, pod)

Restore a container

Restore a container from a checkpoint.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or id of the container
        String name2 = "name_example"; // String | the name of the container when restored from a tar. can only be used with import
        Boolean keep = true; // Boolean | keep all temporary checkpoint files
        Boolean tcpEstablished = true; // Boolean | checkpoint a container with established TCP connections
        Boolean _import = true; // Boolean | import the restore from a checkpoint tar.gz
        Boolean ignoreRootFS = true; // Boolean | do not include root file-system changes when exporting. can only be used with import
        Boolean ignoreVolumes = true; // Boolean | do not restore associated volumes. can only be used with import
        Boolean ignoreStaticIP = true; // Boolean | ignore IP address if set statically
        Boolean ignoreStaticMAC = true; // Boolean | ignore MAC address if set statically
        Boolean fileLocks = true; // Boolean | restore a container with file locks
        Boolean printStats = true; // Boolean | add restore statistics to the returned RestoreReport
        String pod = "pod_example"; // String | pod to restore into
        try {
            ApiResponse<Void> response = apiInstance.containerRestoreLibpodWithHttpInfo(name, name2, keep, tcpEstablished, _import, ignoreRootFS, ignoreVolumes, ignoreStaticIP, ignoreStaticMAC, fileLocks, printStats, pod);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerRestoreLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or id of the container | |
| **name2** | **String**| the name of the container when restored from a tar. can only be used with import | [optional] |
| **keep** | **Boolean**| keep all temporary checkpoint files | [optional] |
| **tcpEstablished** | **Boolean**| checkpoint a container with established TCP connections | [optional] |
| **_import** | **Boolean**| import the restore from a checkpoint tar.gz | [optional] |
| **ignoreRootFS** | **Boolean**| do not include root file-system changes when exporting. can only be used with import | [optional] |
| **ignoreVolumes** | **Boolean**| do not restore associated volumes. can only be used with import | [optional] |
| **ignoreStaticIP** | **Boolean**| ignore IP address if set statically | [optional] |
| **ignoreStaticMAC** | **Boolean**| ignore MAC address if set statically | [optional] |
| **fileLocks** | **Boolean**| restore a container with file locks | [optional] |
| **printStats** | **Boolean**| add restore statistics to the returned RestoreReport | [optional] |
| **pod** | **String**| pod to restore into | [optional] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | tarball is returned in body if exported |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerShowMountedLibpod

> Map<String, String> containerShowMountedLibpod()

Show mounted containers

Lists all mounted containers mount points

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        try {
            Map<String, String> result = apiInstance.containerShowMountedLibpod();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerShowMountedLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Map&lt;String, String&gt;**


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | mounted containers |  -  |
| **500** | Internal server error |  -  |

## containerShowMountedLibpodWithHttpInfo

> ApiResponse<Map<String, String>> containerShowMountedLibpod containerShowMountedLibpodWithHttpInfo()

Show mounted containers

Lists all mounted containers mount points

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        try {
            ApiResponse<Map<String, String>> response = apiInstance.containerShowMountedLibpodWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerShowMountedLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<**Map&lt;String, String&gt;**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | mounted containers |  -  |
| **500** | Internal server error |  -  |


## containerStartLibpod

> void containerStartLibpod(name, detachKeys)

Start a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        String detachKeys = "ctrl-p,ctrl-q"; // String | Override the key sequence for detaching a container. Format is a single character [a-Z] or ctrl-<value> where <value> is one of: a-z, @, ^, [, , or _.
        try {
            apiInstance.containerStartLibpod(name, detachKeys);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerStartLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **detachKeys** | **String**| Override the key sequence for detaching a container. Format is a single character [a-Z] or ctrl-&lt;value&gt; where &lt;value&gt; is one of: a-z, @, ^, [, , or _. | [optional] [default to ctrl-p,ctrl-q] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **304** | Container already started |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerStartLibpodWithHttpInfo

> ApiResponse<Void> containerStartLibpod containerStartLibpodWithHttpInfo(name, detachKeys)

Start a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        String detachKeys = "ctrl-p,ctrl-q"; // String | Override the key sequence for detaching a container. Format is a single character [a-Z] or ctrl-<value> where <value> is one of: a-z, @, ^, [, , or _.
        try {
            ApiResponse<Void> response = apiInstance.containerStartLibpodWithHttpInfo(name, detachKeys);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerStartLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **detachKeys** | **String**| Override the key sequence for detaching a container. Format is a single character [a-Z] or ctrl-&lt;value&gt; where &lt;value&gt; is one of: a-z, @, ^, [, , or _. | [optional] [default to ctrl-p,ctrl-q] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **304** | Container already started |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerStatsLibpod

> void containerStatsLibpod(name, stream)

Get stats for a container

DEPRECATED. This endpoint will be removed with the next major release. Please use /libpod/containers/stats instead.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Boolean stream = true; // Boolean | Stream the output
        try {
            apiInstance.containerStatsLibpod(name, stream);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerStatsLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **stream** | **Boolean**| Stream the output | [optional] [default to true] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

## containerStatsLibpodWithHttpInfo

> ApiResponse<Void> containerStatsLibpod containerStatsLibpodWithHttpInfo(name, stream)

Get stats for a container

DEPRECATED. This endpoint will be removed with the next major release. Please use /libpod/containers/stats instead.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Boolean stream = true; // Boolean | Stream the output
        try {
            ApiResponse<Void> response = apiInstance.containerStatsLibpodWithHttpInfo(name, stream);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerStatsLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **stream** | **Boolean**| Stream the output | [optional] [default to true] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |


## containerStopLibpod

> void containerStopLibpod(name, timeout, ignore)

Stop a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Integer timeout = 10; // Integer | number of seconds to wait before killing container
        Boolean ignore = false; // Boolean | do not return error if container is already stopped
        try {
            apiInstance.containerStopLibpod(name, timeout, ignore);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerStopLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **timeout** | **Integer**| number of seconds to wait before killing container | [optional] [default to 10] |
| **ignore** | **Boolean**| do not return error if container is already stopped | [optional] [default to false] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **304** | Container already stopped |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerStopLibpodWithHttpInfo

> ApiResponse<Void> containerStopLibpod containerStopLibpodWithHttpInfo(name, timeout, ignore)

Stop a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        Integer timeout = 10; // Integer | number of seconds to wait before killing container
        Boolean ignore = false; // Boolean | do not return error if container is already stopped
        try {
            ApiResponse<Void> response = apiInstance.containerStopLibpodWithHttpInfo(name, timeout, ignore);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerStopLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **timeout** | **Integer**| number of seconds to wait before killing container | [optional] [default to 10] |
| **ignore** | **Boolean**| do not return error if container is already stopped | [optional] [default to false] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **304** | Container already stopped |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerTopLibpod

> ContainerTopOKBody containerTopLibpod(name, stream, delay, psArgs)

List processes

List processes running inside a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | Name of container to query for processes (As of version 1.xx)
        Boolean stream = true; // Boolean | when true, repeatedly stream the latest output (As of version 4.0)
        Integer delay = 5; // Integer | if streaming, delay in seconds between updates. Must be >1. (As of version 4.0)
        List<String> psArgs = Arrays.asList(); // List<String> | arguments to pass to ps such as aux. 
        try {
            ContainerTopOKBody result = apiInstance.containerTopLibpod(name, stream, delay, psArgs);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerTopLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Name of container to query for processes (As of version 1.xx) | |
| **stream** | **Boolean**| when true, repeatedly stream the latest output (As of version 4.0) | [optional] |
| **delay** | **Integer**| if streaming, delay in seconds between updates. Must be &gt;1. (As of version 4.0) | [optional] [default to 5] |
| **psArgs** | [**List&lt;String&gt;**](String.md)| arguments to pass to ps such as aux.  | [optional] |

### Return type

[**ContainerTopOKBody**](ContainerTopOKBody.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List processes in container |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerTopLibpodWithHttpInfo

> ApiResponse<ContainerTopOKBody> containerTopLibpod containerTopLibpodWithHttpInfo(name, stream, delay, psArgs)

List processes

List processes running inside a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | Name of container to query for processes (As of version 1.xx)
        Boolean stream = true; // Boolean | when true, repeatedly stream the latest output (As of version 4.0)
        Integer delay = 5; // Integer | if streaming, delay in seconds between updates. Must be >1. (As of version 4.0)
        List<String> psArgs = Arrays.asList(); // List<String> | arguments to pass to ps such as aux. 
        try {
            ApiResponse<ContainerTopOKBody> response = apiInstance.containerTopLibpodWithHttpInfo(name, stream, delay, psArgs);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerTopLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Name of container to query for processes (As of version 1.xx) | |
| **stream** | **Boolean**| when true, repeatedly stream the latest output (As of version 4.0) | [optional] |
| **delay** | **Integer**| if streaming, delay in seconds between updates. Must be &gt;1. (As of version 4.0) | [optional] [default to 5] |
| **psArgs** | [**List&lt;String&gt;**](String.md)| arguments to pass to ps such as aux.  | [optional] |

### Return type

ApiResponse<[**ContainerTopOKBody**](ContainerTopOKBody.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List processes in container |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerUnmountLibpod

> void containerUnmountLibpod(name)

Unmount a container

Unmount a container from the filesystem

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            apiInstance.containerUnmountLibpod(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerUnmountLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | ok |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerUnmountLibpodWithHttpInfo

> ApiResponse<Void> containerUnmountLibpod containerUnmountLibpodWithHttpInfo(name)

Unmount a container

Unmount a container from the filesystem

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            ApiResponse<Void> response = apiInstance.containerUnmountLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerUnmountLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | ok |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerUnpauseLibpod

> void containerUnpauseLibpod(name)

Unpause Container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            apiInstance.containerUnpauseLibpod(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerUnpauseLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerUnpauseLibpodWithHttpInfo

> ApiResponse<Void> containerUnpauseLibpod containerUnpauseLibpodWithHttpInfo(name)

Unpause Container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        try {
            ApiResponse<Void> response = apiInstance.containerUnpauseLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerUnpauseLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerUpdateLibpod

> void containerUpdateLibpod(name, restartPolicy, restartRetries, config)

Update an existing containers cgroup configuration

Update an existing containers cgroup configuration.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | Full or partial ID or full name of the container to update
        String restartPolicy = "restartPolicy_example"; // String | New restart policy for the container.
        Integer restartRetries = 56; // Integer | New amount of retries for the container's restart policy. Only allowed if restartPolicy is set to on-failure
        UpdateEntities config = new UpdateEntities(); // UpdateEntities | attributes for updating the container
        try {
            apiInstance.containerUpdateLibpod(name, restartPolicy, restartRetries, config);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerUpdateLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Full or partial ID or full name of the container to update | |
| **restartPolicy** | **String**| New restart policy for the container. | [optional] |
| **restartRetries** | **Integer**| New amount of retries for the container&#39;s restart policy. Only allowed if restartPolicy is set to on-failure | [optional] |
| **config** | [**UpdateEntities**](UpdateEntities.md)| attributes for updating the container | [optional] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerUpdateLibpodWithHttpInfo

> ApiResponse<Void> containerUpdateLibpod containerUpdateLibpodWithHttpInfo(name, restartPolicy, restartRetries, config)

Update an existing containers cgroup configuration

Update an existing containers cgroup configuration.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | Full or partial ID or full name of the container to update
        String restartPolicy = "restartPolicy_example"; // String | New restart policy for the container.
        Integer restartRetries = 56; // Integer | New amount of retries for the container's restart policy. Only allowed if restartPolicy is set to on-failure
        UpdateEntities config = new UpdateEntities(); // UpdateEntities | attributes for updating the container
        try {
            ApiResponse<Void> response = apiInstance.containerUpdateLibpodWithHttpInfo(name, restartPolicy, restartRetries, config);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerUpdateLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Full or partial ID or full name of the container to update | |
| **restartPolicy** | **String**| New restart policy for the container. | [optional] |
| **restartRetries** | **Integer**| New amount of retries for the container&#39;s restart policy. Only allowed if restartPolicy is set to on-failure | [optional] |
| **config** | [**UpdateEntities**](UpdateEntities.md)| attributes for updating the container | [optional] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containerWaitLibpod

> Integer containerWaitLibpod(name, condition, interval)

Wait on a container

Wait on a container to meet a given condition

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        List<String> condition = Arrays.asList(); // List<String> | Conditions to wait for. If no condition provided the 'exited' condition is assumed.
        String interval = "250ms"; // String | Time Interval to wait before polling for completion.
        try {
            Integer result = apiInstance.containerWaitLibpod(name, condition, interval);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerWaitLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **condition** | [**List&lt;String&gt;**](String.md)| Conditions to wait for. If no condition provided the &#39;exited&#39; condition is assumed. | [optional] [enum: configured, created, exited, healthy, initialized, paused, removing, running, stopped, stopping, unhealthy] |
| **interval** | **String**| Time Interval to wait before polling for completion. | [optional] [default to 250ms] |

### Return type

**Integer**


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status code |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containerWaitLibpodWithHttpInfo

> ApiResponse<Integer> containerWaitLibpod containerWaitLibpodWithHttpInfo(name, condition, interval)

Wait on a container

Wait on a container to meet a given condition

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the container
        List<String> condition = Arrays.asList(); // List<String> | Conditions to wait for. If no condition provided the 'exited' condition is assumed.
        String interval = "250ms"; // String | Time Interval to wait before polling for completion.
        try {
            ApiResponse<Integer> response = apiInstance.containerWaitLibpodWithHttpInfo(name, condition, interval);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containerWaitLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **condition** | [**List&lt;String&gt;**](String.md)| Conditions to wait for. If no condition provided the &#39;exited&#39; condition is assumed. | [optional] [enum: configured, created, exited, healthy, initialized, paused, removing, running, stopped, stopping, unhealthy] |
| **interval** | **String**| Time Interval to wait before polling for completion. | [optional] [default to 250ms] |

### Return type

ApiResponse<**Integer**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status code |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## containersStatsAllLibpod

> ContainerStats containersStatsAllLibpod(containers, stream, interval)

Get stats for one or more containers

Return a live stream of resource usage statistics of one or more container. If no container is specified, the statistics of all containers are returned.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        List<String> containers = Arrays.asList(); // List<String> | names or IDs of containers
        Boolean stream = true; // Boolean | Stream the output
        Integer interval = 5; // Integer | Time in seconds between stats reports
        try {
            ContainerStats result = apiInstance.containersStatsAllLibpod(containers, stream, interval);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containersStatsAllLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **containers** | [**List&lt;String&gt;**](String.md)| names or IDs of containers | [optional] |
| **stream** | **Boolean**| Stream the output | [optional] [default to true] |
| **interval** | **Integer**| Time in seconds between stats reports | [optional] [default to 5] |

### Return type

[**ContainerStats**](ContainerStats.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get stats for one or more containers |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## containersStatsAllLibpodWithHttpInfo

> ApiResponse<ContainerStats> containersStatsAllLibpod containersStatsAllLibpodWithHttpInfo(containers, stream, interval)

Get stats for one or more containers

Return a live stream of resource usage statistics of one or more container. If no container is specified, the statistics of all containers are returned.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        List<String> containers = Arrays.asList(); // List<String> | names or IDs of containers
        Boolean stream = true; // Boolean | Stream the output
        Integer interval = 5; // Integer | Time in seconds between stats reports
        try {
            ApiResponse<ContainerStats> response = apiInstance.containersStatsAllLibpodWithHttpInfo(containers, stream, interval);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#containersStatsAllLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **containers** | [**List&lt;String&gt;**](String.md)| names or IDs of containers | [optional] |
| **stream** | **Boolean**| Stream the output | [optional] [default to true] |
| **interval** | **Integer**| Time in seconds between stats reports | [optional] [default to 5] |

### Return type

ApiResponse<[**ContainerStats**](ContainerStats.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get stats for one or more containers |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |


## generateKubeLibpod

> File generateKubeLibpod(names, service, type, replicas, noTrunc, podmanOnly)

Generate a Kubernetes YAML file.

Generate Kubernetes YAML based on a pod or container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        List<String> names = Arrays.asList(); // List<String> | Name or ID of the container or pod.
        Boolean service = false; // Boolean | Generate YAML for a Kubernetes service object.
        String type = "pod"; // String | Generate YAML for the given Kubernetes kind.
        Integer replicas = 0; // Integer | Set the replica number for Deployment kind.
        Boolean noTrunc = false; // Boolean | don't truncate annotations to the Kubernetes maximum length of 63 characters
        Boolean podmanOnly = false; // Boolean | add podman-only reserved annotations in generated YAML file (cannot be used by Kubernetes)
        try {
            File result = apiInstance.generateKubeLibpod(names, service, type, replicas, noTrunc, podmanOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#generateKubeLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **names** | [**List&lt;String&gt;**](String.md)| Name or ID of the container or pod. | |
| **service** | **Boolean**| Generate YAML for a Kubernetes service object. | [optional] [default to false] |
| **type** | **String**| Generate YAML for the given Kubernetes kind. | [optional] [default to pod] |
| **replicas** | **Integer**| Set the replica number for Deployment kind. | [optional] [default to 0] |
| **noTrunc** | **Boolean**| don&#39;t truncate annotations to the Kubernetes maximum length of 63 characters | [optional] [default to false] |
| **podmanOnly** | **Boolean**| add podman-only reserved annotations in generated YAML file (cannot be used by Kubernetes) | [optional] [default to false] |

### Return type

[**File**](File.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/vnd.yaml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kubernetes YAML file describing pod |  -  |
| **500** | Internal server error |  -  |

## generateKubeLibpodWithHttpInfo

> ApiResponse<File> generateKubeLibpod generateKubeLibpodWithHttpInfo(names, service, type, replicas, noTrunc, podmanOnly)

Generate a Kubernetes YAML file.

Generate Kubernetes YAML based on a pod or container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        List<String> names = Arrays.asList(); // List<String> | Name or ID of the container or pod.
        Boolean service = false; // Boolean | Generate YAML for a Kubernetes service object.
        String type = "pod"; // String | Generate YAML for the given Kubernetes kind.
        Integer replicas = 0; // Integer | Set the replica number for Deployment kind.
        Boolean noTrunc = false; // Boolean | don't truncate annotations to the Kubernetes maximum length of 63 characters
        Boolean podmanOnly = false; // Boolean | add podman-only reserved annotations in generated YAML file (cannot be used by Kubernetes)
        try {
            ApiResponse<File> response = apiInstance.generateKubeLibpodWithHttpInfo(names, service, type, replicas, noTrunc, podmanOnly);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#generateKubeLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **names** | [**List&lt;String&gt;**](String.md)| Name or ID of the container or pod. | |
| **service** | **Boolean**| Generate YAML for a Kubernetes service object. | [optional] [default to false] |
| **type** | **String**| Generate YAML for the given Kubernetes kind. | [optional] [default to pod] |
| **replicas** | **Integer**| Set the replica number for Deployment kind. | [optional] [default to 0] |
| **noTrunc** | **Boolean**| don&#39;t truncate annotations to the Kubernetes maximum length of 63 characters | [optional] [default to false] |
| **podmanOnly** | **Boolean**| add podman-only reserved annotations in generated YAML file (cannot be used by Kubernetes) | [optional] [default to false] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/vnd.yaml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kubernetes YAML file describing pod |  -  |
| **500** | Internal server error |  -  |


## generateSystemdLibpod

> Map<String, String> generateSystemdLibpod(name, useName, _new, noHeader, startTimeout, stopTimeout, restartPolicy, containerPrefix, podPrefix, separator, restartSec, wants, after, requires, additionalEnvVariables)

Generate Systemd Units

Generate Systemd Units based on a pod or container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | Name or ID of the container or pod.
        Boolean useName = false; // Boolean | Use container/pod names instead of IDs.
        Boolean _new = false; // Boolean | Create a new container instead of starting an existing one.
        Boolean noHeader = false; // Boolean | Do not generate the header including the Podman version and the timestamp.
        Integer startTimeout = 0; // Integer | Start timeout in seconds.
        Integer stopTimeout = 10; // Integer | Stop timeout in seconds.
        String restartPolicy = "no"; // String | Systemd restart-policy.
        String containerPrefix = "container"; // String | Systemd unit name prefix for containers.
        String podPrefix = "pod"; // String | Systemd unit name prefix for pods.
        String separator = "-"; // String | Systemd unit name separator between name/id and prefix.
        Integer restartSec = 0; // Integer | Configures the time to sleep before restarting a service.
        List<String> wants = Arrays.asList(); // List<String> | Systemd Wants list for the container or pods.
        List<String> after = Arrays.asList(); // List<String> | Systemd After list for the container or pods.
        List<String> requires = Arrays.asList(); // List<String> | Systemd Requires list for the container or pods.
        List<String> additionalEnvVariables = Arrays.asList(); // List<String> | Set environment variables to the systemd unit files.
        try {
            Map<String, String> result = apiInstance.generateSystemdLibpod(name, useName, _new, noHeader, startTimeout, stopTimeout, restartPolicy, containerPrefix, podPrefix, separator, restartSec, wants, after, requires, additionalEnvVariables);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#generateSystemdLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Name or ID of the container or pod. | |
| **useName** | **Boolean**| Use container/pod names instead of IDs. | [optional] [default to false] |
| **_new** | **Boolean**| Create a new container instead of starting an existing one. | [optional] [default to false] |
| **noHeader** | **Boolean**| Do not generate the header including the Podman version and the timestamp. | [optional] [default to false] |
| **startTimeout** | **Integer**| Start timeout in seconds. | [optional] [default to 0] |
| **stopTimeout** | **Integer**| Stop timeout in seconds. | [optional] [default to 10] |
| **restartPolicy** | **String**| Systemd restart-policy. | [optional] [default to on-failure] [enum: no, on-success, on-failure, on-abnormal, on-watchdog, on-abort, always] |
| **containerPrefix** | **String**| Systemd unit name prefix for containers. | [optional] [default to container] |
| **podPrefix** | **String**| Systemd unit name prefix for pods. | [optional] [default to pod] |
| **separator** | **String**| Systemd unit name separator between name/id and prefix. | [optional] [default to -] |
| **restartSec** | **Integer**| Configures the time to sleep before restarting a service. | [optional] [default to 0] |
| **wants** | [**List&lt;String&gt;**](String.md)| Systemd Wants list for the container or pods. | [optional] |
| **after** | [**List&lt;String&gt;**](String.md)| Systemd After list for the container or pods. | [optional] |
| **requires** | [**List&lt;String&gt;**](String.md)| Systemd Requires list for the container or pods. | [optional] |
| **additionalEnvVariables** | [**List&lt;String&gt;**](String.md)| Set environment variables to the systemd unit files. | [optional] |

### Return type

**Map&lt;String, String&gt;**


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **500** | Internal server error |  -  |

## generateSystemdLibpodWithHttpInfo

> ApiResponse<Map<String, String>> generateSystemdLibpod generateSystemdLibpodWithHttpInfo(name, useName, _new, noHeader, startTimeout, stopTimeout, restartPolicy, containerPrefix, podPrefix, separator, restartSec, wants, after, requires, additionalEnvVariables)

Generate Systemd Units

Generate Systemd Units based on a pod or container.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | Name or ID of the container or pod.
        Boolean useName = false; // Boolean | Use container/pod names instead of IDs.
        Boolean _new = false; // Boolean | Create a new container instead of starting an existing one.
        Boolean noHeader = false; // Boolean | Do not generate the header including the Podman version and the timestamp.
        Integer startTimeout = 0; // Integer | Start timeout in seconds.
        Integer stopTimeout = 10; // Integer | Stop timeout in seconds.
        String restartPolicy = "no"; // String | Systemd restart-policy.
        String containerPrefix = "container"; // String | Systemd unit name prefix for containers.
        String podPrefix = "pod"; // String | Systemd unit name prefix for pods.
        String separator = "-"; // String | Systemd unit name separator between name/id and prefix.
        Integer restartSec = 0; // Integer | Configures the time to sleep before restarting a service.
        List<String> wants = Arrays.asList(); // List<String> | Systemd Wants list for the container or pods.
        List<String> after = Arrays.asList(); // List<String> | Systemd After list for the container or pods.
        List<String> requires = Arrays.asList(); // List<String> | Systemd Requires list for the container or pods.
        List<String> additionalEnvVariables = Arrays.asList(); // List<String> | Set environment variables to the systemd unit files.
        try {
            ApiResponse<Map<String, String>> response = apiInstance.generateSystemdLibpodWithHttpInfo(name, useName, _new, noHeader, startTimeout, stopTimeout, restartPolicy, containerPrefix, podPrefix, separator, restartSec, wants, after, requires, additionalEnvVariables);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#generateSystemdLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Name or ID of the container or pod. | |
| **useName** | **Boolean**| Use container/pod names instead of IDs. | [optional] [default to false] |
| **_new** | **Boolean**| Create a new container instead of starting an existing one. | [optional] [default to false] |
| **noHeader** | **Boolean**| Do not generate the header including the Podman version and the timestamp. | [optional] [default to false] |
| **startTimeout** | **Integer**| Start timeout in seconds. | [optional] [default to 0] |
| **stopTimeout** | **Integer**| Stop timeout in seconds. | [optional] [default to 10] |
| **restartPolicy** | **String**| Systemd restart-policy. | [optional] [default to on-failure] [enum: no, on-success, on-failure, on-abnormal, on-watchdog, on-abort, always] |
| **containerPrefix** | **String**| Systemd unit name prefix for containers. | [optional] [default to container] |
| **podPrefix** | **String**| Systemd unit name prefix for pods. | [optional] [default to pod] |
| **separator** | **String**| Systemd unit name separator between name/id and prefix. | [optional] [default to -] |
| **restartSec** | **Integer**| Configures the time to sleep before restarting a service. | [optional] [default to 0] |
| **wants** | [**List&lt;String&gt;**](String.md)| Systemd Wants list for the container or pods. | [optional] |
| **after** | [**List&lt;String&gt;**](String.md)| Systemd After list for the container or pods. | [optional] |
| **requires** | [**List&lt;String&gt;**](String.md)| Systemd Requires list for the container or pods. | [optional] |
| **additionalEnvVariables** | [**List&lt;String&gt;**](String.md)| Set environment variables to the systemd unit files. | [optional] |

### Return type

ApiResponse<**Map&lt;String, String&gt;**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **500** | Internal server error |  -  |


## imageCommitLibpod

> void imageCommitLibpod(container, author, changes, comment, format, pause, squash, repo, stream, tag)

Commit

Create a new image from a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String container = "container_example"; // String | the name or ID of a container
        String author = "author_example"; // String | author of the image
        List<String> changes = Arrays.asList(); // List<String> | instructions to apply while committing in Dockerfile format (i.e. \"CMD=/bin/foo\")
        String comment = "comment_example"; // String | commit message
        String format = "format_example"; // String | format of the image manifest and metadata (default \"oci\")
        Boolean pause = true; // Boolean | pause the container before committing it
        Boolean squash = true; // Boolean | squash the container before committing it
        String repo = "repo_example"; // String | the repository name for the created image
        Boolean stream = true; // Boolean | output from commit process
        String tag = "tag_example"; // String | tag name for the created image
        try {
            apiInstance.imageCommitLibpod(container, author, changes, comment, format, pause, squash, repo, stream, tag);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#imageCommitLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **container** | **String**| the name or ID of a container | |
| **author** | **String**| author of the image | [optional] |
| **changes** | [**List&lt;String&gt;**](String.md)| instructions to apply while committing in Dockerfile format (i.e. \&quot;CMD&#x3D;/bin/foo\&quot;) | [optional] |
| **comment** | **String**| commit message | [optional] |
| **format** | **String**| format of the image manifest and metadata (default \&quot;oci\&quot;) | [optional] |
| **pause** | **Boolean**| pause the container before committing it | [optional] |
| **squash** | **Boolean**| squash the container before committing it | [optional] |
| **repo** | **String**| the repository name for the created image | [optional] |
| **stream** | **Boolean**| output from commit process | [optional] |
| **tag** | **String**| tag name for the created image | [optional] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | no error |  -  |
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

## imageCommitLibpodWithHttpInfo

> ApiResponse<Void> imageCommitLibpod imageCommitLibpodWithHttpInfo(container, author, changes, comment, format, pause, squash, repo, stream, tag)

Commit

Create a new image from a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String container = "container_example"; // String | the name or ID of a container
        String author = "author_example"; // String | author of the image
        List<String> changes = Arrays.asList(); // List<String> | instructions to apply while committing in Dockerfile format (i.e. \"CMD=/bin/foo\")
        String comment = "comment_example"; // String | commit message
        String format = "format_example"; // String | format of the image manifest and metadata (default \"oci\")
        Boolean pause = true; // Boolean | pause the container before committing it
        Boolean squash = true; // Boolean | squash the container before committing it
        String repo = "repo_example"; // String | the repository name for the created image
        Boolean stream = true; // Boolean | output from commit process
        String tag = "tag_example"; // String | tag name for the created image
        try {
            ApiResponse<Void> response = apiInstance.imageCommitLibpodWithHttpInfo(container, author, changes, comment, format, pause, squash, repo, stream, tag);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#imageCommitLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **container** | **String**| the name or ID of a container | |
| **author** | **String**| author of the image | [optional] |
| **changes** | [**List&lt;String&gt;**](String.md)| instructions to apply while committing in Dockerfile format (i.e. \&quot;CMD&#x3D;/bin/foo\&quot;) | [optional] |
| **comment** | **String**| commit message | [optional] |
| **format** | **String**| format of the image manifest and metadata (default \&quot;oci\&quot;) | [optional] |
| **pause** | **Boolean**| pause the container before committing it | [optional] |
| **squash** | **Boolean**| squash the container before committing it | [optional] |
| **repo** | **String**| the repository name for the created image | [optional] |
| **stream** | **Boolean**| output from commit process | [optional] |
| **tag** | **String**| tag name for the created image | [optional] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | no error |  -  |
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |


## kubeApplyLibpod

> File kubeApplyLibpod(caCertFile, kubeConfig, namespace, service, _file, request)

Apply a podman workload or Kubernetes YAML file.

Deploy a podman container, pod, volume, or Kubernetes yaml to a Kubernetes cluster.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String caCertFile = "caCertFile_example"; // String | Path to the CA cert file for the Kubernetes cluster.
        String kubeConfig = "kubeConfig_example"; // String | Path to the kubeconfig file for the Kubernetes cluster.
        String namespace = "namespace_example"; // String | The namespace to deploy the workload to on the Kubernetes cluster.
        Boolean service = true; // Boolean | Create a service object for the container being deployed.
        String _file = "_file_example"; // String | Path to the Kubernetes yaml file to deploy.
        String request = "request_example"; // String | Kubernetes YAML file.
        try {
            File result = apiInstance.kubeApplyLibpod(caCertFile, kubeConfig, namespace, service, _file, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#kubeApplyLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **caCertFile** | **String**| Path to the CA cert file for the Kubernetes cluster. | [optional] |
| **kubeConfig** | **String**| Path to the kubeconfig file for the Kubernetes cluster. | [optional] |
| **namespace** | **String**| The namespace to deploy the workload to on the Kubernetes cluster. | [optional] |
| **service** | **Boolean**| Create a service object for the container being deployed. | [optional] |
| **_file** | **String**| Path to the Kubernetes yaml file to deploy. | [optional] |
| **request** | **String**| Kubernetes YAML file. | [optional] |

### Return type

[**File**](File.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kubernetes YAML file successfully deployed to cluster |  -  |
| **500** | Internal server error |  -  |

## kubeApplyLibpodWithHttpInfo

> ApiResponse<File> kubeApplyLibpod kubeApplyLibpodWithHttpInfo(caCertFile, kubeConfig, namespace, service, _file, request)

Apply a podman workload or Kubernetes YAML file.

Deploy a podman container, pod, volume, or Kubernetes yaml to a Kubernetes cluster.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String caCertFile = "caCertFile_example"; // String | Path to the CA cert file for the Kubernetes cluster.
        String kubeConfig = "kubeConfig_example"; // String | Path to the kubeconfig file for the Kubernetes cluster.
        String namespace = "namespace_example"; // String | The namespace to deploy the workload to on the Kubernetes cluster.
        Boolean service = true; // Boolean | Create a service object for the container being deployed.
        String _file = "_file_example"; // String | Path to the Kubernetes yaml file to deploy.
        String request = "request_example"; // String | Kubernetes YAML file.
        try {
            ApiResponse<File> response = apiInstance.kubeApplyLibpodWithHttpInfo(caCertFile, kubeConfig, namespace, service, _file, request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#kubeApplyLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **caCertFile** | **String**| Path to the CA cert file for the Kubernetes cluster. | [optional] |
| **kubeConfig** | **String**| Path to the kubeconfig file for the Kubernetes cluster. | [optional] |
| **namespace** | **String**| The namespace to deploy the workload to on the Kubernetes cluster. | [optional] |
| **service** | **Boolean**| Create a service object for the container being deployed. | [optional] |
| **_file** | **String**| Path to the Kubernetes yaml file to deploy. | [optional] |
| **request** | **String**| Kubernetes YAML file. | [optional] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kubernetes YAML file successfully deployed to cluster |  -  |
| **500** | Internal server error |  -  |


## playKubeDownLibpod

> PlayKubeReport playKubeDownLibpod(contentType, force, request)

Remove resources created from kube play

Tears down pods, secrets, and volumes defined in a YAML file

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String contentType = "plain/text"; // String | 
        Boolean force = false; // Boolean | Remove volumes.
        String request = "request_example"; // String | Kubernetes YAML file.
        try {
            PlayKubeReport result = apiInstance.playKubeDownLibpod(contentType, force, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#playKubeDownLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | [optional] [default to plain/text] [enum: plain/text, application/x-tar] |
| **force** | **Boolean**| Remove volumes. | [optional] [default to false] |
| **request** | **String**| Kubernetes YAML file. | [optional] |

### Return type

[**PlayKubeReport**](PlayKubeReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | PlayKube response |  -  |
| **500** | Internal server error |  -  |

## playKubeDownLibpodWithHttpInfo

> ApiResponse<PlayKubeReport> playKubeDownLibpod playKubeDownLibpodWithHttpInfo(contentType, force, request)

Remove resources created from kube play

Tears down pods, secrets, and volumes defined in a YAML file

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String contentType = "plain/text"; // String | 
        Boolean force = false; // Boolean | Remove volumes.
        String request = "request_example"; // String | Kubernetes YAML file.
        try {
            ApiResponse<PlayKubeReport> response = apiInstance.playKubeDownLibpodWithHttpInfo(contentType, force, request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#playKubeDownLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | [optional] [default to plain/text] [enum: plain/text, application/x-tar] |
| **force** | **Boolean**| Remove volumes. | [optional] [default to false] |
| **request** | **String**| Kubernetes YAML file. | [optional] |

### Return type

ApiResponse<[**PlayKubeReport**](PlayKubeReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | PlayKube response |  -  |
| **500** | Internal server error |  -  |


## playKubeLibpod

> PlayKubeReport playKubeLibpod(contentType, annotations, logDriver, logOptions, network, noHosts, noTrunc, publishPorts, publishAllPorts, replace, serviceContainer, start, staticIPs, staticMACs, tlsVerify, userns, wait, build, request)

Play a Kubernetes YAML file.

Create and run pods based on a Kubernetes YAML file.  ### Content-Type  Then endpoint support two Content-Type  - &#x60;plain/text&#x60; for yaml format  - &#x60;application/x-tar&#x60; for sending context(s) required for building images  #### Tar format  The tar format must contain a &#x60;play.yaml&#x60; file at the root that will be used. If the file format requires context to build an image, it uses the image name and check for corresponding folder.  For example, the client sends a tar file with the following structure:  &#x60;&#x60;&#x60; └── content.tar  ├── play.yaml  └── foobar/      └── Containerfile &#x60;&#x60;&#x60;  The &#x60;play.yaml&#x60; is the following, the &#x60;foobar&#x60; image means we are looking for a context with this name. &#x60;&#x60;&#x60; apiVersion: v1 kind: Pod metadata: name: demo-build-remote spec: containers:  - name: container    image: foobar &#x60;&#x60;&#x60; 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String contentType = "plain/text"; // String | 
        String annotations = "annotations_example"; // String | JSON encoded value of annotations (a map[string]string).
        String logDriver = "logDriver_example"; // String | Logging driver for the containers in the pod.
        List<String> logOptions = Arrays.asList(); // List<String> | logging driver options
        List<String> network = Arrays.asList(); // List<String> | USe the network mode or specify an array of networks.
        Boolean noHosts = false; // Boolean | do not setup /etc/hosts file in container
        Boolean noTrunc = false; // Boolean | use annotations that are not truncated to the Kubernetes maximum length of 63 characters
        List<String> publishPorts = Arrays.asList(); // List<String> | publish a container's port, or a range of ports, to the host
        Boolean publishAllPorts = true; // Boolean | Whether to publish all ports defined in the K8S YAML file (containerPort, hostPort), if false only hostPort will be published
        Boolean replace = false; // Boolean | replace existing pods and containers
        Boolean serviceContainer = false; // Boolean | Starts a service container before all pods.
        Boolean start = true; // Boolean | Start the pod after creating it.
        List<String> staticIPs = Arrays.asList(); // List<String> | Static IPs used for the pods.
        List<String> staticMACs = Arrays.asList(); // List<String> | Static MACs used for the pods.
        Boolean tlsVerify = true; // Boolean | Require HTTPS and verify signatures when contacting registries.
        String userns = "userns_example"; // String | Set the user namespace mode for the pods.
        Boolean wait = false; // Boolean | Clean up all objects created when a SIGTERM is received or pods exit.
        Boolean build = true; // Boolean | Build the images with corresponding context.
        String request = "request_example"; // String | Kubernetes YAML file.
        try {
            PlayKubeReport result = apiInstance.playKubeLibpod(contentType, annotations, logDriver, logOptions, network, noHosts, noTrunc, publishPorts, publishAllPorts, replace, serviceContainer, start, staticIPs, staticMACs, tlsVerify, userns, wait, build, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#playKubeLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | [optional] [default to plain/text] [enum: plain/text, application/x-tar] |
| **annotations** | **String**| JSON encoded value of annotations (a map[string]string). | [optional] |
| **logDriver** | **String**| Logging driver for the containers in the pod. | [optional] |
| **logOptions** | [**List&lt;String&gt;**](String.md)| logging driver options | [optional] |
| **network** | [**List&lt;String&gt;**](String.md)| USe the network mode or specify an array of networks. | [optional] |
| **noHosts** | **Boolean**| do not setup /etc/hosts file in container | [optional] [default to false] |
| **noTrunc** | **Boolean**| use annotations that are not truncated to the Kubernetes maximum length of 63 characters | [optional] [default to false] |
| **publishPorts** | [**List&lt;String&gt;**](String.md)| publish a container&#39;s port, or a range of ports, to the host | [optional] |
| **publishAllPorts** | **Boolean**| Whether to publish all ports defined in the K8S YAML file (containerPort, hostPort), if false only hostPort will be published | [optional] |
| **replace** | **Boolean**| replace existing pods and containers | [optional] [default to false] |
| **serviceContainer** | **Boolean**| Starts a service container before all pods. | [optional] [default to false] |
| **start** | **Boolean**| Start the pod after creating it. | [optional] [default to true] |
| **staticIPs** | [**List&lt;String&gt;**](String.md)| Static IPs used for the pods. | [optional] |
| **staticMACs** | [**List&lt;String&gt;**](String.md)| Static MACs used for the pods. | [optional] |
| **tlsVerify** | **Boolean**| Require HTTPS and verify signatures when contacting registries. | [optional] [default to true] |
| **userns** | **String**| Set the user namespace mode for the pods. | [optional] |
| **wait** | **Boolean**| Clean up all objects created when a SIGTERM is received or pods exit. | [optional] [default to false] |
| **build** | **Boolean**| Build the images with corresponding context. | [optional] |
| **request** | **String**| Kubernetes YAML file. | [optional] |

### Return type

[**PlayKubeReport**](PlayKubeReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | PlayKube response |  -  |
| **500** | Internal server error |  -  |

## playKubeLibpodWithHttpInfo

> ApiResponse<PlayKubeReport> playKubeLibpod playKubeLibpodWithHttpInfo(contentType, annotations, logDriver, logOptions, network, noHosts, noTrunc, publishPorts, publishAllPorts, replace, serviceContainer, start, staticIPs, staticMACs, tlsVerify, userns, wait, build, request)

Play a Kubernetes YAML file.

Create and run pods based on a Kubernetes YAML file.  ### Content-Type  Then endpoint support two Content-Type  - &#x60;plain/text&#x60; for yaml format  - &#x60;application/x-tar&#x60; for sending context(s) required for building images  #### Tar format  The tar format must contain a &#x60;play.yaml&#x60; file at the root that will be used. If the file format requires context to build an image, it uses the image name and check for corresponding folder.  For example, the client sends a tar file with the following structure:  &#x60;&#x60;&#x60; └── content.tar  ├── play.yaml  └── foobar/      └── Containerfile &#x60;&#x60;&#x60;  The &#x60;play.yaml&#x60; is the following, the &#x60;foobar&#x60; image means we are looking for a context with this name. &#x60;&#x60;&#x60; apiVersion: v1 kind: Pod metadata: name: demo-build-remote spec: containers:  - name: container    image: foobar &#x60;&#x60;&#x60; 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String contentType = "plain/text"; // String | 
        String annotations = "annotations_example"; // String | JSON encoded value of annotations (a map[string]string).
        String logDriver = "logDriver_example"; // String | Logging driver for the containers in the pod.
        List<String> logOptions = Arrays.asList(); // List<String> | logging driver options
        List<String> network = Arrays.asList(); // List<String> | USe the network mode or specify an array of networks.
        Boolean noHosts = false; // Boolean | do not setup /etc/hosts file in container
        Boolean noTrunc = false; // Boolean | use annotations that are not truncated to the Kubernetes maximum length of 63 characters
        List<String> publishPorts = Arrays.asList(); // List<String> | publish a container's port, or a range of ports, to the host
        Boolean publishAllPorts = true; // Boolean | Whether to publish all ports defined in the K8S YAML file (containerPort, hostPort), if false only hostPort will be published
        Boolean replace = false; // Boolean | replace existing pods and containers
        Boolean serviceContainer = false; // Boolean | Starts a service container before all pods.
        Boolean start = true; // Boolean | Start the pod after creating it.
        List<String> staticIPs = Arrays.asList(); // List<String> | Static IPs used for the pods.
        List<String> staticMACs = Arrays.asList(); // List<String> | Static MACs used for the pods.
        Boolean tlsVerify = true; // Boolean | Require HTTPS and verify signatures when contacting registries.
        String userns = "userns_example"; // String | Set the user namespace mode for the pods.
        Boolean wait = false; // Boolean | Clean up all objects created when a SIGTERM is received or pods exit.
        Boolean build = true; // Boolean | Build the images with corresponding context.
        String request = "request_example"; // String | Kubernetes YAML file.
        try {
            ApiResponse<PlayKubeReport> response = apiInstance.playKubeLibpodWithHttpInfo(contentType, annotations, logDriver, logOptions, network, noHosts, noTrunc, publishPorts, publishAllPorts, replace, serviceContainer, start, staticIPs, staticMACs, tlsVerify, userns, wait, build, request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#playKubeLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | [optional] [default to plain/text] [enum: plain/text, application/x-tar] |
| **annotations** | **String**| JSON encoded value of annotations (a map[string]string). | [optional] |
| **logDriver** | **String**| Logging driver for the containers in the pod. | [optional] |
| **logOptions** | [**List&lt;String&gt;**](String.md)| logging driver options | [optional] |
| **network** | [**List&lt;String&gt;**](String.md)| USe the network mode or specify an array of networks. | [optional] |
| **noHosts** | **Boolean**| do not setup /etc/hosts file in container | [optional] [default to false] |
| **noTrunc** | **Boolean**| use annotations that are not truncated to the Kubernetes maximum length of 63 characters | [optional] [default to false] |
| **publishPorts** | [**List&lt;String&gt;**](String.md)| publish a container&#39;s port, or a range of ports, to the host | [optional] |
| **publishAllPorts** | **Boolean**| Whether to publish all ports defined in the K8S YAML file (containerPort, hostPort), if false only hostPort will be published | [optional] |
| **replace** | **Boolean**| replace existing pods and containers | [optional] [default to false] |
| **serviceContainer** | **Boolean**| Starts a service container before all pods. | [optional] [default to false] |
| **start** | **Boolean**| Start the pod after creating it. | [optional] [default to true] |
| **staticIPs** | [**List&lt;String&gt;**](String.md)| Static IPs used for the pods. | [optional] |
| **staticMACs** | [**List&lt;String&gt;**](String.md)| Static MACs used for the pods. | [optional] |
| **tlsVerify** | **Boolean**| Require HTTPS and verify signatures when contacting registries. | [optional] [default to true] |
| **userns** | **String**| Set the user namespace mode for the pods. | [optional] |
| **wait** | **Boolean**| Clean up all objects created when a SIGTERM is received or pods exit. | [optional] [default to false] |
| **build** | **Boolean**| Build the images with corresponding context. | [optional] |
| **request** | **String**| Kubernetes YAML file. | [optional] |

### Return type

ApiResponse<[**PlayKubeReport**](PlayKubeReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | PlayKube response |  -  |
| **500** | Internal server error |  -  |


## putContainerArchiveLibpod

> void putContainerArchiveLibpod(name, path, pause, request)

Copy files into a container

Copy a tar archive of files into a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | container name or id
        String path = "path_example"; // String | Path to a directory in the container to extract
        Boolean pause = true; // Boolean | pause the container while copying (defaults to true)
        String request = "request_example"; // String | tarfile of files to copy into the container
        try {
            apiInstance.putContainerArchiveLibpod(name, path, pause, request);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#putContainerArchiveLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| container name or id | |
| **path** | **String**| Path to a directory in the container to extract | |
| **pause** | **Boolean**| pause the container while copying (defaults to true) | [optional] [default to true] |
| **request** | **String**| tarfile of files to copy into the container | [optional] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **400** | Bad parameter in request |  -  |
| **403** | the container rootfs is read-only |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

## putContainerArchiveLibpodWithHttpInfo

> ApiResponse<Void> putContainerArchiveLibpod putContainerArchiveLibpodWithHttpInfo(name, path, pause, request)

Copy files into a container

Copy a tar archive of files into a container

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ContainersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ContainersApi apiInstance = new ContainersApi(defaultClient);
        String name = "name_example"; // String | container name or id
        String path = "path_example"; // String | Path to a directory in the container to extract
        Boolean pause = true; // Boolean | pause the container while copying (defaults to true)
        String request = "request_example"; // String | tarfile of files to copy into the container
        try {
            ApiResponse<Void> response = apiInstance.putContainerArchiveLibpodWithHttpInfo(name, path, pause, request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContainersApi#putContainerArchiveLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| container name or id | |
| **path** | **String**| Path to a directory in the container to extract | |
| **pause** | **Boolean**| pause the container while copying (defaults to true) | [optional] [default to true] |
| **request** | **String**| tarfile of files to copy into the container | [optional] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **400** | Bad parameter in request |  -  |
| **403** | the container rootfs is read-only |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

