# VolumesApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**volumeCreateLibpod**](VolumesApi.md#volumeCreateLibpod) | **POST** /libpod/volumes/create | Create a volume |
| [**volumeCreateLibpodWithHttpInfo**](VolumesApi.md#volumeCreateLibpodWithHttpInfo) | **POST** /libpod/volumes/create | Create a volume |
| [**volumeDeleteLibpod**](VolumesApi.md#volumeDeleteLibpod) | **DELETE** /libpod/volumes/{name} | Remove volume |
| [**volumeDeleteLibpodWithHttpInfo**](VolumesApi.md#volumeDeleteLibpodWithHttpInfo) | **DELETE** /libpod/volumes/{name} | Remove volume |
| [**volumeExistsLibpod**](VolumesApi.md#volumeExistsLibpod) | **GET** /libpod/volumes/{name}/exists | Volume exists |
| [**volumeExistsLibpodWithHttpInfo**](VolumesApi.md#volumeExistsLibpodWithHttpInfo) | **GET** /libpod/volumes/{name}/exists | Volume exists |
| [**volumeInspectLibpod**](VolumesApi.md#volumeInspectLibpod) | **GET** /libpod/volumes/{name}/json | Inspect volume |
| [**volumeInspectLibpodWithHttpInfo**](VolumesApi.md#volumeInspectLibpodWithHttpInfo) | **GET** /libpod/volumes/{name}/json | Inspect volume |
| [**volumeListLibpod**](VolumesApi.md#volumeListLibpod) | **GET** /libpod/volumes/json | List volumes |
| [**volumeListLibpodWithHttpInfo**](VolumesApi.md#volumeListLibpodWithHttpInfo) | **GET** /libpod/volumes/json | List volumes |
| [**volumePruneLibpod**](VolumesApi.md#volumePruneLibpod) | **POST** /libpod/volumes/prune | Prune volumes |
| [**volumePruneLibpodWithHttpInfo**](VolumesApi.md#volumePruneLibpodWithHttpInfo) | **POST** /libpod/volumes/prune | Prune volumes |



## volumeCreateLibpod

> VolumeConfigResponse volumeCreateLibpod(create)

Create a volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        VolumeCreateOptions create = new VolumeCreateOptions(); // VolumeCreateOptions | attributes for creating a volume
        try {
            VolumeConfigResponse result = apiInstance.volumeCreateLibpod(create);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeCreateLibpod");
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
| **create** | [**VolumeCreateOptions**](VolumeCreateOptions.md)| attributes for creating a volume | [optional] |

### Return type

[**VolumeConfigResponse**](VolumeConfigResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Volume details |  -  |
| **500** | Internal server error |  -  |

## volumeCreateLibpodWithHttpInfo

> ApiResponse<VolumeConfigResponse> volumeCreateLibpod volumeCreateLibpodWithHttpInfo(create)

Create a volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        VolumeCreateOptions create = new VolumeCreateOptions(); // VolumeCreateOptions | attributes for creating a volume
        try {
            ApiResponse<VolumeConfigResponse> response = apiInstance.volumeCreateLibpodWithHttpInfo(create);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeCreateLibpod");
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
| **create** | [**VolumeCreateOptions**](VolumeCreateOptions.md)| attributes for creating a volume | [optional] |

### Return type

ApiResponse<[**VolumeConfigResponse**](VolumeConfigResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Volume details |  -  |
| **500** | Internal server error |  -  |


## volumeDeleteLibpod

> void volumeDeleteLibpod(name, force)

Remove volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the volume
        Boolean force = true; // Boolean | force removal
        try {
            apiInstance.volumeDeleteLibpod(name, force);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeDeleteLibpod");
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
| **name** | **String**| the name or ID of the volume | |
| **force** | **Boolean**| force removal | [optional] |

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
| **404** | No such volume |  -  |
| **409** | Volume is in use and cannot be removed |  -  |
| **500** | Internal server error |  -  |

## volumeDeleteLibpodWithHttpInfo

> ApiResponse<Void> volumeDeleteLibpod volumeDeleteLibpodWithHttpInfo(name, force)

Remove volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the volume
        Boolean force = true; // Boolean | force removal
        try {
            ApiResponse<Void> response = apiInstance.volumeDeleteLibpodWithHttpInfo(name, force);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeDeleteLibpod");
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
| **name** | **String**| the name or ID of the volume | |
| **force** | **Boolean**| force removal | [optional] |

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
| **404** | No such volume |  -  |
| **409** | Volume is in use and cannot be removed |  -  |
| **500** | Internal server error |  -  |


## volumeExistsLibpod

> void volumeExistsLibpod(name)

Volume exists

Check if a volume exists

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String name = "name_example"; // String | the name of the volume
        try {
            apiInstance.volumeExistsLibpod(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeExistsLibpod");
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
| **name** | **String**| the name of the volume | |

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
| **204** | volume exists |  -  |
| **404** | No such volume |  -  |
| **500** | Internal server error |  -  |

## volumeExistsLibpodWithHttpInfo

> ApiResponse<Void> volumeExistsLibpod volumeExistsLibpodWithHttpInfo(name)

Volume exists

Check if a volume exists

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String name = "name_example"; // String | the name of the volume
        try {
            ApiResponse<Void> response = apiInstance.volumeExistsLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeExistsLibpod");
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
| **name** | **String**| the name of the volume | |

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
| **204** | volume exists |  -  |
| **404** | No such volume |  -  |
| **500** | Internal server error |  -  |


## volumeInspectLibpod

> VolumeConfigResponse volumeInspectLibpod(name)

Inspect volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the volume
        try {
            VolumeConfigResponse result = apiInstance.volumeInspectLibpod(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeInspectLibpod");
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
| **name** | **String**| the name or ID of the volume | |

### Return type

[**VolumeConfigResponse**](VolumeConfigResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume details |  -  |
| **404** | No such volume |  -  |
| **500** | Internal server error |  -  |

## volumeInspectLibpodWithHttpInfo

> ApiResponse<VolumeConfigResponse> volumeInspectLibpod volumeInspectLibpodWithHttpInfo(name)

Inspect volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the volume
        try {
            ApiResponse<VolumeConfigResponse> response = apiInstance.volumeInspectLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeInspectLibpod");
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
| **name** | **String**| the name or ID of the volume | |

### Return type

ApiResponse<[**VolumeConfigResponse**](VolumeConfigResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume details |  -  |
| **404** | No such volume |  -  |
| **500** | Internal server error |  -  |


## volumeListLibpod

> List<VolumeConfigResponse> volumeListLibpod(filters)

List volumes

Returns a list of volumes

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of the filters (a map[string][]string) to process on the volumes list. Available filters:   - driver=<volume-driver-name> Matches volumes based on their driver.   - label=<key> or label=<key>:<value> Matches volumes based on the presence of a label alone or a label and a value.   - name=<volume-name> Matches all of volume name.   - opt=<driver-option> Matches a storage driver options   - `until=<timestamp>` List volumes created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time. 
        try {
            List<VolumeConfigResponse> result = apiInstance.volumeListLibpod(filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeListLibpod");
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
| **filters** | **String**| JSON encoded value of the filters (a map[string][]string) to process on the volumes list. Available filters:   - driver&#x3D;&lt;volume-driver-name&gt; Matches volumes based on their driver.   - label&#x3D;&lt;key&gt; or label&#x3D;&lt;key&gt;:&lt;value&gt; Matches volumes based on the presence of a label alone or a label and a value.   - name&#x3D;&lt;volume-name&gt; Matches all of volume name.   - opt&#x3D;&lt;driver-option&gt; Matches a storage driver options   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; List volumes created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.  | [optional] |

### Return type

[**List&lt;VolumeConfigResponse&gt;**](VolumeConfigResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume list |  -  |
| **500** | Internal server error |  -  |

## volumeListLibpodWithHttpInfo

> ApiResponse<List<VolumeConfigResponse>> volumeListLibpod volumeListLibpodWithHttpInfo(filters)

List volumes

Returns a list of volumes

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of the filters (a map[string][]string) to process on the volumes list. Available filters:   - driver=<volume-driver-name> Matches volumes based on their driver.   - label=<key> or label=<key>:<value> Matches volumes based on the presence of a label alone or a label and a value.   - name=<volume-name> Matches all of volume name.   - opt=<driver-option> Matches a storage driver options   - `until=<timestamp>` List volumes created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time. 
        try {
            ApiResponse<List<VolumeConfigResponse>> response = apiInstance.volumeListLibpodWithHttpInfo(filters);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeListLibpod");
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
| **filters** | **String**| JSON encoded value of the filters (a map[string][]string) to process on the volumes list. Available filters:   - driver&#x3D;&lt;volume-driver-name&gt; Matches volumes based on their driver.   - label&#x3D;&lt;key&gt; or label&#x3D;&lt;key&gt;:&lt;value&gt; Matches volumes based on the presence of a label alone or a label and a value.   - name&#x3D;&lt;volume-name&gt; Matches all of volume name.   - opt&#x3D;&lt;driver-option&gt; Matches a storage driver options   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; List volumes created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.  | [optional] |

### Return type

ApiResponse<[**List&lt;VolumeConfigResponse&gt;**](VolumeConfigResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume list |  -  |
| **500** | Internal server error |  -  |


## volumePruneLibpod

> List<PruneReport> volumePruneLibpod(filters)

Prune volumes

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of filters (a map[string][]string) to match volumes against before pruning. Available filters:   - `until=<timestamp>` Prune volumes created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune volumes with (or without, in case `label!=...` is used) the specified labels. 
        try {
            List<PruneReport> result = apiInstance.volumePruneLibpod(filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumePruneLibpod");
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
| **filters** | **String**| JSON encoded value of filters (a map[string][]string) to match volumes against before pruning. Available filters:   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune volumes created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.   - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune volumes with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  | [optional] |

### Return type

[**List&lt;PruneReport&gt;**](PruneReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume Prune |  -  |
| **500** | Internal server error |  -  |

## volumePruneLibpodWithHttpInfo

> ApiResponse<List<PruneReport>> volumePruneLibpod volumePruneLibpodWithHttpInfo(filters)

Prune volumes

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of filters (a map[string][]string) to match volumes against before pruning. Available filters:   - `until=<timestamp>` Prune volumes created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune volumes with (or without, in case `label!=...` is used) the specified labels. 
        try {
            ApiResponse<List<PruneReport>> response = apiInstance.volumePruneLibpodWithHttpInfo(filters);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumePruneLibpod");
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
| **filters** | **String**| JSON encoded value of filters (a map[string][]string) to match volumes against before pruning. Available filters:   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune volumes created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.   - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune volumes with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  | [optional] |

### Return type

ApiResponse<[**List&lt;PruneReport&gt;**](PruneReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume Prune |  -  |
| **500** | Internal server error |  -  |

