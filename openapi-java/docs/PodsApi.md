# PodsApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateKubeLibpod**](PodsApi.md#generateKubeLibpod) | **GET** /libpod/generate/kube | Generate a Kubernetes YAML file. |
| [**generateKubeLibpodWithHttpInfo**](PodsApi.md#generateKubeLibpodWithHttpInfo) | **GET** /libpod/generate/kube | Generate a Kubernetes YAML file. |
| [**generateSystemdLibpod**](PodsApi.md#generateSystemdLibpod) | **GET** /libpod/generate/{name}/systemd | Generate Systemd Units |
| [**generateSystemdLibpodWithHttpInfo**](PodsApi.md#generateSystemdLibpodWithHttpInfo) | **GET** /libpod/generate/{name}/systemd | Generate Systemd Units |
| [**kubeApplyLibpod**](PodsApi.md#kubeApplyLibpod) | **POST** /libpod/kube/apply | Apply a podman workload or Kubernetes YAML file. |
| [**kubeApplyLibpodWithHttpInfo**](PodsApi.md#kubeApplyLibpodWithHttpInfo) | **POST** /libpod/kube/apply | Apply a podman workload or Kubernetes YAML file. |
| [**playKubeDownLibpod**](PodsApi.md#playKubeDownLibpod) | **DELETE** /libpod/play/kube | Remove resources created from kube play |
| [**playKubeDownLibpodWithHttpInfo**](PodsApi.md#playKubeDownLibpodWithHttpInfo) | **DELETE** /libpod/play/kube | Remove resources created from kube play |
| [**playKubeLibpod**](PodsApi.md#playKubeLibpod) | **POST** /libpod/play/kube | Play a Kubernetes YAML file. |
| [**playKubeLibpodWithHttpInfo**](PodsApi.md#playKubeLibpodWithHttpInfo) | **POST** /libpod/play/kube | Play a Kubernetes YAML file. |
| [**podCreateLibpod**](PodsApi.md#podCreateLibpod) | **POST** /libpod/pods/create | Create a pod |
| [**podCreateLibpodWithHttpInfo**](PodsApi.md#podCreateLibpodWithHttpInfo) | **POST** /libpod/pods/create | Create a pod |
| [**podDeleteLibpod**](PodsApi.md#podDeleteLibpod) | **DELETE** /libpod/pods/{name} | Remove pod |
| [**podDeleteLibpodWithHttpInfo**](PodsApi.md#podDeleteLibpodWithHttpInfo) | **DELETE** /libpod/pods/{name} | Remove pod |
| [**podExistsLibpod**](PodsApi.md#podExistsLibpod) | **GET** /libpod/pods/{name}/exists | Pod exists |
| [**podExistsLibpodWithHttpInfo**](PodsApi.md#podExistsLibpodWithHttpInfo) | **GET** /libpod/pods/{name}/exists | Pod exists |
| [**podInspectLibpod**](PodsApi.md#podInspectLibpod) | **GET** /libpod/pods/{name}/json | Inspect pod |
| [**podInspectLibpodWithHttpInfo**](PodsApi.md#podInspectLibpodWithHttpInfo) | **GET** /libpod/pods/{name}/json | Inspect pod |
| [**podKillLibpod**](PodsApi.md#podKillLibpod) | **POST** /libpod/pods/{name}/kill | Kill a pod |
| [**podKillLibpodWithHttpInfo**](PodsApi.md#podKillLibpodWithHttpInfo) | **POST** /libpod/pods/{name}/kill | Kill a pod |
| [**podListLibpod**](PodsApi.md#podListLibpod) | **GET** /libpod/pods/json | List pods |
| [**podListLibpodWithHttpInfo**](PodsApi.md#podListLibpodWithHttpInfo) | **GET** /libpod/pods/json | List pods |
| [**podPauseLibpod**](PodsApi.md#podPauseLibpod) | **POST** /libpod/pods/{name}/pause | Pause a pod |
| [**podPauseLibpodWithHttpInfo**](PodsApi.md#podPauseLibpodWithHttpInfo) | **POST** /libpod/pods/{name}/pause | Pause a pod |
| [**podPruneLibpod**](PodsApi.md#podPruneLibpod) | **POST** /libpod/pods/prune | Prune unused pods |
| [**podPruneLibpodWithHttpInfo**](PodsApi.md#podPruneLibpodWithHttpInfo) | **POST** /libpod/pods/prune | Prune unused pods |
| [**podRestartLibpod**](PodsApi.md#podRestartLibpod) | **POST** /libpod/pods/{name}/restart | Restart a pod |
| [**podRestartLibpodWithHttpInfo**](PodsApi.md#podRestartLibpodWithHttpInfo) | **POST** /libpod/pods/{name}/restart | Restart a pod |
| [**podStartLibpod**](PodsApi.md#podStartLibpod) | **POST** /libpod/pods/{name}/start | Start a pod |
| [**podStartLibpodWithHttpInfo**](PodsApi.md#podStartLibpodWithHttpInfo) | **POST** /libpod/pods/{name}/start | Start a pod |
| [**podStatsAllLibpod**](PodsApi.md#podStatsAllLibpod) | **GET** /libpod/pods/stats | Statistics for one or more pods |
| [**podStatsAllLibpodWithHttpInfo**](PodsApi.md#podStatsAllLibpodWithHttpInfo) | **GET** /libpod/pods/stats | Statistics for one or more pods |
| [**podStopLibpod**](PodsApi.md#podStopLibpod) | **POST** /libpod/pods/{name}/stop | Stop a pod |
| [**podStopLibpodWithHttpInfo**](PodsApi.md#podStopLibpodWithHttpInfo) | **POST** /libpod/pods/{name}/stop | Stop a pod |
| [**podTopLibpod**](PodsApi.md#podTopLibpod) | **GET** /libpod/pods/{name}/top | List processes |
| [**podTopLibpodWithHttpInfo**](PodsApi.md#podTopLibpodWithHttpInfo) | **GET** /libpod/pods/{name}/top | List processes |
| [**podUnpauseLibpod**](PodsApi.md#podUnpauseLibpod) | **POST** /libpod/pods/{name}/unpause | Unpause a pod |
| [**podUnpauseLibpodWithHttpInfo**](PodsApi.md#podUnpauseLibpodWithHttpInfo) | **POST** /libpod/pods/{name}/unpause | Unpause a pod |



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
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
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
            System.err.println("Exception when calling PodsApi#generateKubeLibpod");
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
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
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
            System.err.println("Exception when calling PodsApi#generateKubeLibpod");
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
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
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
            System.err.println("Exception when calling PodsApi#generateSystemdLibpod");
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
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
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
            System.err.println("Exception when calling PodsApi#generateSystemdLibpod");
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
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
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
            System.err.println("Exception when calling PodsApi#kubeApplyLibpod");
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
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
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
            System.err.println("Exception when calling PodsApi#kubeApplyLibpod");
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
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String contentType = "plain/text"; // String | 
        Boolean force = false; // Boolean | Remove volumes.
        String request = "request_example"; // String | Kubernetes YAML file.
        try {
            PlayKubeReport result = apiInstance.playKubeDownLibpod(contentType, force, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#playKubeDownLibpod");
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
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String contentType = "plain/text"; // String | 
        Boolean force = false; // Boolean | Remove volumes.
        String request = "request_example"; // String | Kubernetes YAML file.
        try {
            ApiResponse<PlayKubeReport> response = apiInstance.playKubeDownLibpodWithHttpInfo(contentType, force, request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#playKubeDownLibpod");
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
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
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
            System.err.println("Exception when calling PodsApi#playKubeLibpod");
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
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
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
            System.err.println("Exception when calling PodsApi#playKubeLibpod");
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


## podCreateLibpod

> IdResponse podCreateLibpod(create)

Create a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        PodSpecGenerator create = new PodSpecGenerator(); // PodSpecGenerator | attributes for creating a pod
        try {
            IdResponse result = apiInstance.podCreateLibpod(create);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podCreateLibpod");
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
| **create** | [**PodSpecGenerator**](PodSpecGenerator.md)| attributes for creating a pod | [optional] |

### Return type

[**IdResponse**](IdResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Bad parameter in request |  -  |
| **409** | status conflict |  -  |
| **500** | Internal server error |  -  |

## podCreateLibpodWithHttpInfo

> ApiResponse<IdResponse> podCreateLibpod podCreateLibpodWithHttpInfo(create)

Create a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        PodSpecGenerator create = new PodSpecGenerator(); // PodSpecGenerator | attributes for creating a pod
        try {
            ApiResponse<IdResponse> response = apiInstance.podCreateLibpodWithHttpInfo(create);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podCreateLibpod");
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
| **create** | [**PodSpecGenerator**](PodSpecGenerator.md)| attributes for creating a pod | [optional] |

### Return type

ApiResponse<[**IdResponse**](IdResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Bad parameter in request |  -  |
| **409** | status conflict |  -  |
| **500** | Internal server error |  -  |


## podDeleteLibpod

> PodRmReport podDeleteLibpod(name, force)

Remove pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        Boolean force = true; // Boolean | force removal of a running pod by first stopping all containers, then removing all containers in the pod
        try {
            PodRmReport result = apiInstance.podDeleteLibpod(name, force);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podDeleteLibpod");
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
| **name** | **String**| the name or ID of the pod | |
| **force** | **Boolean**| force removal of a running pod by first stopping all containers, then removing all containers in the pod | [optional] |

### Return type

[**PodRmReport**](PodRmReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rm pod |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such pod |  -  |
| **500** | Internal server error |  -  |

## podDeleteLibpodWithHttpInfo

> ApiResponse<PodRmReport> podDeleteLibpod podDeleteLibpodWithHttpInfo(name, force)

Remove pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        Boolean force = true; // Boolean | force removal of a running pod by first stopping all containers, then removing all containers in the pod
        try {
            ApiResponse<PodRmReport> response = apiInstance.podDeleteLibpodWithHttpInfo(name, force);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podDeleteLibpod");
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
| **name** | **String**| the name or ID of the pod | |
| **force** | **Boolean**| force removal of a running pod by first stopping all containers, then removing all containers in the pod | [optional] |

### Return type

ApiResponse<[**PodRmReport**](PodRmReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rm pod |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such pod |  -  |
| **500** | Internal server error |  -  |


## podExistsLibpod

> void podExistsLibpod(name)

Pod exists

Check if a pod exists by name or ID

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            apiInstance.podExistsLibpod(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podExistsLibpod");
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
| **name** | **String**| the name or ID of the pod | |

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
| **204** | pod exists |  -  |
| **404** | No such pod |  -  |
| **500** | Internal server error |  -  |

## podExistsLibpodWithHttpInfo

> ApiResponse<Void> podExistsLibpod podExistsLibpodWithHttpInfo(name)

Pod exists

Check if a pod exists by name or ID

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            ApiResponse<Void> response = apiInstance.podExistsLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podExistsLibpod");
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
| **name** | **String**| the name or ID of the pod | |

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
| **204** | pod exists |  -  |
| **404** | No such pod |  -  |
| **500** | Internal server error |  -  |


## podInspectLibpod

> InspectPodData podInspectLibpod(name)

Inspect pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            InspectPodData result = apiInstance.podInspectLibpod(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podInspectLibpod");
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
| **name** | **String**| the name or ID of the pod | |

### Return type

[**InspectPodData**](InspectPodData.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inspect pod |  -  |
| **404** | No such pod |  -  |
| **500** | Internal server error |  -  |

## podInspectLibpodWithHttpInfo

> ApiResponse<InspectPodData> podInspectLibpod podInspectLibpodWithHttpInfo(name)

Inspect pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            ApiResponse<InspectPodData> response = apiInstance.podInspectLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podInspectLibpod");
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
| **name** | **String**| the name or ID of the pod | |

### Return type

ApiResponse<[**InspectPodData**](InspectPodData.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inspect pod |  -  |
| **404** | No such pod |  -  |
| **500** | Internal server error |  -  |


## podKillLibpod

> PodKillReport podKillLibpod(name, signal)

Kill a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        String signal = "SIGKILL"; // String | signal to be sent to pod
        try {
            PodKillReport result = apiInstance.podKillLibpod(name, signal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podKillLibpod");
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
| **name** | **String**| the name or ID of the pod | |
| **signal** | **String**| signal to be sent to pod | [optional] [default to SIGKILL] |

### Return type

[**PodKillReport**](PodKillReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kill Pod |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such pod |  -  |
| **409** | Kill Pod |  -  |
| **500** | Internal server error |  -  |

## podKillLibpodWithHttpInfo

> ApiResponse<PodKillReport> podKillLibpod podKillLibpodWithHttpInfo(name, signal)

Kill a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        String signal = "SIGKILL"; // String | signal to be sent to pod
        try {
            ApiResponse<PodKillReport> response = apiInstance.podKillLibpodWithHttpInfo(name, signal);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podKillLibpod");
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
| **name** | **String**| the name or ID of the pod | |
| **signal** | **String**| signal to be sent to pod | [optional] [default to SIGKILL] |

### Return type

ApiResponse<[**PodKillReport**](PodKillReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kill Pod |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such pod |  -  |
| **409** | Kill Pod |  -  |
| **500** | Internal server error |  -  |


## podListLibpod

> List<ListPodsReport> podListLibpod(filters)

List pods

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of the filters (a map[string][]string) to process on the pods list. Available filters:   - `id=<pod-id>` Matches all of pod id.   - `label=<key>` or `label=<key>:<value>` Matches pods based on the presence of a label alone or a label and a value.   - `name=<pod-name>` Matches all of pod name.   - `until=<timestamp>` List pods created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `status=<pod-status>` Pod's status: `stopped`, `running`, `paused`, `exited`, `dead`, `created`, `degraded`.   - `network=<pod-network>` Name or full ID of network.   - `ctr-names=<pod-ctr-names>` Container name within the pod.   - `ctr-ids=<pod-ctr-ids>` Container ID within the pod.   - `ctr-status=<pod-ctr-status>` Container status within the pod.   - `ctr-number=<pod-ctr-number>` Number of containers in the pod. 
        try {
            List<ListPodsReport> result = apiInstance.podListLibpod(filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podListLibpod");
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
| **filters** | **String**| JSON encoded value of the filters (a map[string][]string) to process on the pods list. Available filters:   - &#x60;id&#x3D;&lt;pod-id&gt;&#x60; Matches all of pod id.   - &#x60;label&#x3D;&lt;key&gt;&#x60; or &#x60;label&#x3D;&lt;key&gt;:&lt;value&gt;&#x60; Matches pods based on the presence of a label alone or a label and a value.   - &#x60;name&#x3D;&lt;pod-name&gt;&#x60; Matches all of pod name.   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; List pods created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.   - &#x60;status&#x3D;&lt;pod-status&gt;&#x60; Pod&#39;s status: &#x60;stopped&#x60;, &#x60;running&#x60;, &#x60;paused&#x60;, &#x60;exited&#x60;, &#x60;dead&#x60;, &#x60;created&#x60;, &#x60;degraded&#x60;.   - &#x60;network&#x3D;&lt;pod-network&gt;&#x60; Name or full ID of network.   - &#x60;ctr-names&#x3D;&lt;pod-ctr-names&gt;&#x60; Container name within the pod.   - &#x60;ctr-ids&#x3D;&lt;pod-ctr-ids&gt;&#x60; Container ID within the pod.   - &#x60;ctr-status&#x3D;&lt;pod-ctr-status&gt;&#x60; Container status within the pod.   - &#x60;ctr-number&#x3D;&lt;pod-ctr-number&gt;&#x60; Number of containers in the pod.  | [optional] |

### Return type

[**List&lt;ListPodsReport&gt;**](ListPodsReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List pods |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

## podListLibpodWithHttpInfo

> ApiResponse<List<ListPodsReport>> podListLibpod podListLibpodWithHttpInfo(filters)

List pods

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of the filters (a map[string][]string) to process on the pods list. Available filters:   - `id=<pod-id>` Matches all of pod id.   - `label=<key>` or `label=<key>:<value>` Matches pods based on the presence of a label alone or a label and a value.   - `name=<pod-name>` Matches all of pod name.   - `until=<timestamp>` List pods created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `status=<pod-status>` Pod's status: `stopped`, `running`, `paused`, `exited`, `dead`, `created`, `degraded`.   - `network=<pod-network>` Name or full ID of network.   - `ctr-names=<pod-ctr-names>` Container name within the pod.   - `ctr-ids=<pod-ctr-ids>` Container ID within the pod.   - `ctr-status=<pod-ctr-status>` Container status within the pod.   - `ctr-number=<pod-ctr-number>` Number of containers in the pod. 
        try {
            ApiResponse<List<ListPodsReport>> response = apiInstance.podListLibpodWithHttpInfo(filters);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podListLibpod");
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
| **filters** | **String**| JSON encoded value of the filters (a map[string][]string) to process on the pods list. Available filters:   - &#x60;id&#x3D;&lt;pod-id&gt;&#x60; Matches all of pod id.   - &#x60;label&#x3D;&lt;key&gt;&#x60; or &#x60;label&#x3D;&lt;key&gt;:&lt;value&gt;&#x60; Matches pods based on the presence of a label alone or a label and a value.   - &#x60;name&#x3D;&lt;pod-name&gt;&#x60; Matches all of pod name.   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; List pods created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.   - &#x60;status&#x3D;&lt;pod-status&gt;&#x60; Pod&#39;s status: &#x60;stopped&#x60;, &#x60;running&#x60;, &#x60;paused&#x60;, &#x60;exited&#x60;, &#x60;dead&#x60;, &#x60;created&#x60;, &#x60;degraded&#x60;.   - &#x60;network&#x3D;&lt;pod-network&gt;&#x60; Name or full ID of network.   - &#x60;ctr-names&#x3D;&lt;pod-ctr-names&gt;&#x60; Container name within the pod.   - &#x60;ctr-ids&#x3D;&lt;pod-ctr-ids&gt;&#x60; Container ID within the pod.   - &#x60;ctr-status&#x3D;&lt;pod-ctr-status&gt;&#x60; Container status within the pod.   - &#x60;ctr-number&#x3D;&lt;pod-ctr-number&gt;&#x60; Number of containers in the pod.  | [optional] |

### Return type

ApiResponse<[**List&lt;ListPodsReport&gt;**](ListPodsReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List pods |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |


## podPauseLibpod

> PodPauseReport podPauseLibpod(name)

Pause a pod

Pause a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            PodPauseReport result = apiInstance.podPauseLibpod(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podPauseLibpod");
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
| **name** | **String**| the name or ID of the pod | |

### Return type

[**PodPauseReport**](PodPauseReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pause pod |  -  |
| **404** | No such pod |  -  |
| **409** | Pause pod |  -  |
| **500** | Internal server error |  -  |

## podPauseLibpodWithHttpInfo

> ApiResponse<PodPauseReport> podPauseLibpod podPauseLibpodWithHttpInfo(name)

Pause a pod

Pause a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            ApiResponse<PodPauseReport> response = apiInstance.podPauseLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podPauseLibpod");
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
| **name** | **String**| the name or ID of the pod | |

### Return type

ApiResponse<[**PodPauseReport**](PodPauseReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pause pod |  -  |
| **404** | No such pod |  -  |
| **409** | Pause pod |  -  |
| **500** | Internal server error |  -  |


## podPruneLibpod

> PodPruneReport podPruneLibpod()

Prune unused pods

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        try {
            PodPruneReport result = apiInstance.podPruneLibpod();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podPruneLibpod");
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

[**PodPruneReport**](PodPruneReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prune pod |  -  |
| **400** | Bad parameter in request |  -  |
| **409** | pod already exists |  -  |
| **500** | Internal server error |  -  |

## podPruneLibpodWithHttpInfo

> ApiResponse<PodPruneReport> podPruneLibpod podPruneLibpodWithHttpInfo()

Prune unused pods

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        try {
            ApiResponse<PodPruneReport> response = apiInstance.podPruneLibpodWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podPruneLibpod");
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

ApiResponse<[**PodPruneReport**](PodPruneReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prune pod |  -  |
| **400** | Bad parameter in request |  -  |
| **409** | pod already exists |  -  |
| **500** | Internal server error |  -  |


## podRestartLibpod

> PodRestartReport podRestartLibpod(name)

Restart a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            PodRestartReport result = apiInstance.podRestartLibpod(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podRestartLibpod");
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
| **name** | **String**| the name or ID of the pod | |

### Return type

[**PodRestartReport**](PodRestartReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Restart pod |  -  |
| **404** | No such pod |  -  |
| **409** | Restart pod |  -  |
| **500** | Internal server error |  -  |

## podRestartLibpodWithHttpInfo

> ApiResponse<PodRestartReport> podRestartLibpod podRestartLibpodWithHttpInfo(name)

Restart a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            ApiResponse<PodRestartReport> response = apiInstance.podRestartLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podRestartLibpod");
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
| **name** | **String**| the name or ID of the pod | |

### Return type

ApiResponse<[**PodRestartReport**](PodRestartReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Restart pod |  -  |
| **404** | No such pod |  -  |
| **409** | Restart pod |  -  |
| **500** | Internal server error |  -  |


## podStartLibpod

> PodStartReport podStartLibpod(name)

Start a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            PodStartReport result = apiInstance.podStartLibpod(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podStartLibpod");
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
| **name** | **String**| the name or ID of the pod | |

### Return type

[**PodStartReport**](PodStartReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start pod |  -  |
| **304** | Pod already started |  -  |
| **404** | No such pod |  -  |
| **409** | Start pod |  -  |
| **500** | Internal server error |  -  |

## podStartLibpodWithHttpInfo

> ApiResponse<PodStartReport> podStartLibpod podStartLibpodWithHttpInfo(name)

Start a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            ApiResponse<PodStartReport> response = apiInstance.podStartLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podStartLibpod");
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
| **name** | **String**| the name or ID of the pod | |

### Return type

ApiResponse<[**PodStartReport**](PodStartReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start pod |  -  |
| **304** | Pod already started |  -  |
| **404** | No such pod |  -  |
| **409** | Start pod |  -  |
| **500** | Internal server error |  -  |


## podStatsAllLibpod

> List<PodStatsReport> podStatsAllLibpod(all, namesOrIDs)

Statistics for one or more pods

Display a live stream of resource usage statistics for the containers in one or more pods

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        Boolean all = true; // Boolean | Provide statistics for all running pods.
        List<String> namesOrIDs = Arrays.asList(); // List<String> | Names or IDs of pods.
        try {
            List<PodStatsReport> result = apiInstance.podStatsAllLibpod(all, namesOrIDs);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podStatsAllLibpod");
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
| **all** | **Boolean**| Provide statistics for all running pods. | [optional] |
| **namesOrIDs** | [**List&lt;String&gt;**](String.md)| Names or IDs of pods. | [optional] |

### Return type

[**List&lt;PodStatsReport&gt;**](PodStatsReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pod Statistics |  -  |
| **404** | No such pod |  -  |
| **500** | Internal server error |  -  |

## podStatsAllLibpodWithHttpInfo

> ApiResponse<List<PodStatsReport>> podStatsAllLibpod podStatsAllLibpodWithHttpInfo(all, namesOrIDs)

Statistics for one or more pods

Display a live stream of resource usage statistics for the containers in one or more pods

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        Boolean all = true; // Boolean | Provide statistics for all running pods.
        List<String> namesOrIDs = Arrays.asList(); // List<String> | Names or IDs of pods.
        try {
            ApiResponse<List<PodStatsReport>> response = apiInstance.podStatsAllLibpodWithHttpInfo(all, namesOrIDs);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podStatsAllLibpod");
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
| **all** | **Boolean**| Provide statistics for all running pods. | [optional] |
| **namesOrIDs** | [**List&lt;String&gt;**](String.md)| Names or IDs of pods. | [optional] |

### Return type

ApiResponse<[**List&lt;PodStatsReport&gt;**](PodStatsReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pod Statistics |  -  |
| **404** | No such pod |  -  |
| **500** | Internal server error |  -  |


## podStopLibpod

> PodStopReport podStopLibpod(name, t)

Stop a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        Integer t = 56; // Integer | timeout
        try {
            PodStopReport result = apiInstance.podStopLibpod(name, t);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podStopLibpod");
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
| **name** | **String**| the name or ID of the pod | |
| **t** | **Integer**| timeout | [optional] |

### Return type

[**PodStopReport**](PodStopReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stop pod |  -  |
| **304** | Pod already stopped |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such pod |  -  |
| **409** | Stop pod |  -  |
| **500** | Internal server error |  -  |

## podStopLibpodWithHttpInfo

> ApiResponse<PodStopReport> podStopLibpod podStopLibpodWithHttpInfo(name, t)

Stop a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        Integer t = 56; // Integer | timeout
        try {
            ApiResponse<PodStopReport> response = apiInstance.podStopLibpodWithHttpInfo(name, t);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podStopLibpod");
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
| **name** | **String**| the name or ID of the pod | |
| **t** | **Integer**| timeout | [optional] |

### Return type

ApiResponse<[**PodStopReport**](PodStopReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stop pod |  -  |
| **304** | Pod already stopped |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such pod |  -  |
| **409** | Stop pod |  -  |
| **500** | Internal server error |  -  |


## podTopLibpod

> PodTopOKBody podTopLibpod(name, stream, delay, psArgs)

List processes

List processes running inside a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | Name of pod to query for processes
        Boolean stream = true; // Boolean | when true, repeatedly stream the latest output (As of version 4.0)
        Integer delay = 5; // Integer | if streaming, delay in seconds between updates. Must be >1. (As of version 4.0)
        String psArgs = "psArgs_example"; // String | arguments to pass to ps such as aux. 
        try {
            PodTopOKBody result = apiInstance.podTopLibpod(name, stream, delay, psArgs);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podTopLibpod");
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
| **name** | **String**| Name of pod to query for processes | |
| **stream** | **Boolean**| when true, repeatedly stream the latest output (As of version 4.0) | [optional] |
| **delay** | **Integer**| if streaming, delay in seconds between updates. Must be &gt;1. (As of version 4.0) | [optional] [default to 5] |
| **psArgs** | **String**| arguments to pass to ps such as aux.  | [optional] |

### Return type

[**PodTopOKBody**](PodTopOKBody.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List processes in pod |  -  |
| **404** | No such pod |  -  |
| **500** | Internal server error |  -  |

## podTopLibpodWithHttpInfo

> ApiResponse<PodTopOKBody> podTopLibpod podTopLibpodWithHttpInfo(name, stream, delay, psArgs)

List processes

List processes running inside a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | Name of pod to query for processes
        Boolean stream = true; // Boolean | when true, repeatedly stream the latest output (As of version 4.0)
        Integer delay = 5; // Integer | if streaming, delay in seconds between updates. Must be >1. (As of version 4.0)
        String psArgs = "psArgs_example"; // String | arguments to pass to ps such as aux. 
        try {
            ApiResponse<PodTopOKBody> response = apiInstance.podTopLibpodWithHttpInfo(name, stream, delay, psArgs);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podTopLibpod");
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
| **name** | **String**| Name of pod to query for processes | |
| **stream** | **Boolean**| when true, repeatedly stream the latest output (As of version 4.0) | [optional] |
| **delay** | **Integer**| if streaming, delay in seconds between updates. Must be &gt;1. (As of version 4.0) | [optional] [default to 5] |
| **psArgs** | **String**| arguments to pass to ps such as aux.  | [optional] |

### Return type

ApiResponse<[**PodTopOKBody**](PodTopOKBody.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List processes in pod |  -  |
| **404** | No such pod |  -  |
| **500** | Internal server error |  -  |


## podUnpauseLibpod

> PodUnpauseReport podUnpauseLibpod(name)

Unpause a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            PodUnpauseReport result = apiInstance.podUnpauseLibpod(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podUnpauseLibpod");
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
| **name** | **String**| the name or ID of the pod | |

### Return type

[**PodUnpauseReport**](PodUnpauseReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Unpause pod |  -  |
| **404** | No such pod |  -  |
| **409** | Unpause pod |  -  |
| **500** | Internal server error |  -  |

## podUnpauseLibpodWithHttpInfo

> ApiResponse<PodUnpauseReport> podUnpauseLibpod podUnpauseLibpodWithHttpInfo(name)

Unpause a pod

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.PodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        PodsApi apiInstance = new PodsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the pod
        try {
            ApiResponse<PodUnpauseReport> response = apiInstance.podUnpauseLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PodsApi#podUnpauseLibpod");
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
| **name** | **String**| the name or ID of the pod | |

### Return type

ApiResponse<[**PodUnpauseReport**](PodUnpauseReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Unpause pod |  -  |
| **404** | No such pod |  -  |
| **409** | Unpause pod |  -  |
| **500** | Internal server error |  -  |

