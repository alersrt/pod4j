# ExecApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**containerExecLibpod**](ExecApi.md#containerExecLibpod) | **POST** /libpod/containers/{name}/exec | Create an exec instance |
| [**containerExecLibpodWithHttpInfo**](ExecApi.md#containerExecLibpodWithHttpInfo) | **POST** /libpod/containers/{name}/exec | Create an exec instance |
| [**execInspectLibpod**](ExecApi.md#execInspectLibpod) | **GET** /libpod/exec/{id}/json | Inspect an exec instance |
| [**execInspectLibpodWithHttpInfo**](ExecApi.md#execInspectLibpodWithHttpInfo) | **GET** /libpod/exec/{id}/json | Inspect an exec instance |
| [**execResizeLibpod**](ExecApi.md#execResizeLibpod) | **POST** /libpod/exec/{id}/resize | Resize an exec instance |
| [**execResizeLibpodWithHttpInfo**](ExecApi.md#execResizeLibpodWithHttpInfo) | **POST** /libpod/exec/{id}/resize | Resize an exec instance |
| [**execStartLibpod**](ExecApi.md#execStartLibpod) | **POST** /libpod/exec/{id}/start | Start an exec instance |
| [**execStartLibpodWithHttpInfo**](ExecApi.md#execStartLibpodWithHttpInfo) | **POST** /libpod/exec/{id}/start | Start an exec instance |



## containerExecLibpod

> void containerExecLibpod(name, control)

Create an exec instance

Create an exec session to run a command inside a running container. Exec sessions will be automatically removed 5 minutes after they exit.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ExecApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ExecApi apiInstance = new ExecApi(defaultClient);
        String name = "name_example"; // String | name of container
        ContainerExecRequest control = new ContainerExecRequest(); // ContainerExecRequest | Attributes for create
        try {
            apiInstance.containerExecLibpod(name, control);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecApi#containerExecLibpod");
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
| **name** | **String**| name of container | |
| **control** | [**ContainerExecRequest**](ContainerExecRequest.md)| Attributes for create | [optional] |

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
| **201** | no error |  -  |
| **404** | No such container |  -  |
| **409** | container is paused |  -  |
| **500** | Internal server error |  -  |

## containerExecLibpodWithHttpInfo

> ApiResponse<Void> containerExecLibpod containerExecLibpodWithHttpInfo(name, control)

Create an exec instance

Create an exec session to run a command inside a running container. Exec sessions will be automatically removed 5 minutes after they exit.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ExecApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ExecApi apiInstance = new ExecApi(defaultClient);
        String name = "name_example"; // String | name of container
        ContainerExecRequest control = new ContainerExecRequest(); // ContainerExecRequest | Attributes for create
        try {
            ApiResponse<Void> response = apiInstance.containerExecLibpodWithHttpInfo(name, control);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecApi#containerExecLibpod");
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
| **name** | **String**| name of container | |
| **control** | [**ContainerExecRequest**](ContainerExecRequest.md)| Attributes for create | [optional] |

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
| **201** | no error |  -  |
| **404** | No such container |  -  |
| **409** | container is paused |  -  |
| **500** | Internal server error |  -  |


## execInspectLibpod

> void execInspectLibpod(id)

Inspect an exec instance

Return low-level information about an exec instance.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ExecApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ExecApi apiInstance = new ExecApi(defaultClient);
        String id = "id_example"; // String | Exec instance ID
        try {
            apiInstance.execInspectLibpod(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecApi#execInspectLibpod");
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
| **id** | **String**| Exec instance ID | |

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
| **404** | No such exec instance |  -  |
| **500** | Internal server error |  -  |

## execInspectLibpodWithHttpInfo

> ApiResponse<Void> execInspectLibpod execInspectLibpodWithHttpInfo(id)

Inspect an exec instance

Return low-level information about an exec instance.

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ExecApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ExecApi apiInstance = new ExecApi(defaultClient);
        String id = "id_example"; // String | Exec instance ID
        try {
            ApiResponse<Void> response = apiInstance.execInspectLibpodWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecApi#execInspectLibpod");
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
| **id** | **String**| Exec instance ID | |

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
| **404** | No such exec instance |  -  |
| **500** | Internal server error |  -  |


## execResizeLibpod

> void execResizeLibpod(id, h, w)

Resize an exec instance

Resize the TTY session used by an exec instance. This endpoint only works if tty was specified as part of creating and starting the exec instance. 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ExecApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ExecApi apiInstance = new ExecApi(defaultClient);
        String id = "id_example"; // String | Exec instance ID
        Integer h = 56; // Integer | Height of the TTY session in characters
        Integer w = 56; // Integer | Width of the TTY session in characters
        try {
            apiInstance.execResizeLibpod(id, h, w);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecApi#execResizeLibpod");
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
| **id** | **String**| Exec instance ID | |
| **h** | **Integer**| Height of the TTY session in characters | [optional] |
| **w** | **Integer**| Width of the TTY session in characters | [optional] |

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
| **404** | No such exec instance |  -  |
| **500** | Internal server error |  -  |

## execResizeLibpodWithHttpInfo

> ApiResponse<Void> execResizeLibpod execResizeLibpodWithHttpInfo(id, h, w)

Resize an exec instance

Resize the TTY session used by an exec instance. This endpoint only works if tty was specified as part of creating and starting the exec instance. 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ExecApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ExecApi apiInstance = new ExecApi(defaultClient);
        String id = "id_example"; // String | Exec instance ID
        Integer h = 56; // Integer | Height of the TTY session in characters
        Integer w = 56; // Integer | Width of the TTY session in characters
        try {
            ApiResponse<Void> response = apiInstance.execResizeLibpodWithHttpInfo(id, h, w);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecApi#execResizeLibpod");
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
| **id** | **String**| Exec instance ID | |
| **h** | **Integer**| Height of the TTY session in characters | [optional] |
| **w** | **Integer**| Width of the TTY session in characters | [optional] |

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
| **404** | No such exec instance |  -  |
| **500** | Internal server error |  -  |


## execStartLibpod

> void execStartLibpod(id, control)

Start an exec instance

Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command. The stream format is the same as the attach endpoint. 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ExecApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ExecApi apiInstance = new ExecApi(defaultClient);
        String id = "id_example"; // String | Exec instance ID
        ExecStartLibpodRequest control = new ExecStartLibpodRequest(); // ExecStartLibpodRequest | Attributes for start
        try {
            apiInstance.execStartLibpod(id, control);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecApi#execStartLibpod");
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
| **id** | **String**| Exec instance ID | |
| **control** | [**ExecStartLibpodRequest**](ExecStartLibpodRequest.md)| Attributes for start | [optional] |

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
| **404** | No such exec instance |  -  |
| **409** | container is not running. |  -  |
| **500** | Internal server error |  -  |

## execStartLibpodWithHttpInfo

> ApiResponse<Void> execStartLibpod execStartLibpodWithHttpInfo(id, control)

Start an exec instance

Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command. The stream format is the same as the attach endpoint. 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ExecApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ExecApi apiInstance = new ExecApi(defaultClient);
        String id = "id_example"; // String | Exec instance ID
        ExecStartLibpodRequest control = new ExecStartLibpodRequest(); // ExecStartLibpodRequest | Attributes for start
        try {
            ApiResponse<Void> response = apiInstance.execStartLibpodWithHttpInfo(id, control);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecApi#execStartLibpod");
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
| **id** | **String**| Exec instance ID | |
| **control** | [**ExecStartLibpodRequest**](ExecStartLibpodRequest.md)| Attributes for start | [optional] |

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
| **404** | No such exec instance |  -  |
| **409** | container is not running. |  -  |
| **500** | Internal server error |  -  |

