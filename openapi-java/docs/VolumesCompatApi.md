# VolumesCompatApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**volumeCreate**](VolumesCompatApi.md#volumeCreate) | **POST** /volumes/create | Create a volume |
| [**volumeCreateWithHttpInfo**](VolumesCompatApi.md#volumeCreateWithHttpInfo) | **POST** /volumes/create | Create a volume |
| [**volumeDelete**](VolumesCompatApi.md#volumeDelete) | **DELETE** /volumes/{name} | Remove volume |
| [**volumeDeleteWithHttpInfo**](VolumesCompatApi.md#volumeDeleteWithHttpInfo) | **DELETE** /volumes/{name} | Remove volume |
| [**volumeInspect**](VolumesCompatApi.md#volumeInspect) | **GET** /volumes/{name} | Inspect volume |
| [**volumeInspectWithHttpInfo**](VolumesCompatApi.md#volumeInspectWithHttpInfo) | **GET** /volumes/{name} | Inspect volume |
| [**volumeList**](VolumesCompatApi.md#volumeList) | **GET** /volumes | List volumes |
| [**volumeListWithHttpInfo**](VolumesCompatApi.md#volumeListWithHttpInfo) | **GET** /volumes | List volumes |
| [**volumePrune**](VolumesCompatApi.md#volumePrune) | **POST** /volumes/prune | Prune volumes |
| [**volumePruneWithHttpInfo**](VolumesCompatApi.md#volumePruneWithHttpInfo) | **POST** /volumes/prune | Prune volumes |



## volumeCreate

> Volume volumeCreate(create)

Create a volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesCompatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
        VolumeCreate create = new VolumeCreate(); // VolumeCreate | attributes for creating a volume. Note: If a volume by the same name exists, a 201 response with that volume's information will be generated. 
        try {
            Volume result = apiInstance.volumeCreate(create);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesCompatApi#volumeCreate");
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
| **create** | [**VolumeCreate**](VolumeCreate.md)| attributes for creating a volume. Note: If a volume by the same name exists, a 201 response with that volume&#39;s information will be generated.  | [optional] |

### Return type

[**Volume**](Volume.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | This response definition is used for both the create and inspect endpoints |  -  |
| **500** | Internal server error |  -  |

## volumeCreateWithHttpInfo

> ApiResponse<Volume> volumeCreate volumeCreateWithHttpInfo(create)

Create a volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesCompatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
        VolumeCreate create = new VolumeCreate(); // VolumeCreate | attributes for creating a volume. Note: If a volume by the same name exists, a 201 response with that volume's information will be generated. 
        try {
            ApiResponse<Volume> response = apiInstance.volumeCreateWithHttpInfo(create);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesCompatApi#volumeCreate");
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
| **create** | [**VolumeCreate**](VolumeCreate.md)| attributes for creating a volume. Note: If a volume by the same name exists, a 201 response with that volume&#39;s information will be generated.  | [optional] |

### Return type

ApiResponse<[**Volume**](Volume.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | This response definition is used for both the create and inspect endpoints |  -  |
| **500** | Internal server error |  -  |


## volumeDelete

> void volumeDelete(name, force)

Remove volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesCompatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the volume
        Boolean force = true; // Boolean | Force removal of the volume. This actually only causes errors due to the names volume not being found to be suppressed, which is the behaviour Docker implements. 
        try {
            apiInstance.volumeDelete(name, force);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesCompatApi#volumeDelete");
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
| **force** | **Boolean**| Force removal of the volume. This actually only causes errors due to the names volume not being found to be suppressed, which is the behaviour Docker implements.  | [optional] |

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

## volumeDeleteWithHttpInfo

> ApiResponse<Void> volumeDelete volumeDeleteWithHttpInfo(name, force)

Remove volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesCompatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the volume
        Boolean force = true; // Boolean | Force removal of the volume. This actually only causes errors due to the names volume not being found to be suppressed, which is the behaviour Docker implements. 
        try {
            ApiResponse<Void> response = apiInstance.volumeDeleteWithHttpInfo(name, force);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesCompatApi#volumeDelete");
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
| **force** | **Boolean**| Force removal of the volume. This actually only causes errors due to the names volume not being found to be suppressed, which is the behaviour Docker implements.  | [optional] |

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


## volumeInspect

> Volume volumeInspect(name)

Inspect volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesCompatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the volume
        try {
            Volume result = apiInstance.volumeInspect(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesCompatApi#volumeInspect");
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

[**Volume**](Volume.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response definition is used for both the create and inspect endpoints |  -  |
| **500** | Internal server error |  -  |

## volumeInspectWithHttpInfo

> ApiResponse<Volume> volumeInspect volumeInspectWithHttpInfo(name)

Inspect volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesCompatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the volume
        try {
            ApiResponse<Volume> response = apiInstance.volumeInspectWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesCompatApi#volumeInspect");
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

ApiResponse<[**Volume**](Volume.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response definition is used for both the create and inspect endpoints |  -  |
| **500** | Internal server error |  -  |


## volumeList

> ListResponse volumeList(filters)

List volumes

Returns a list of volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesCompatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of the filters (a map[string][]string) to process on the volumes list. Available filters:   - driver=<volume-driver-name> Matches volumes based on their driver.   - label=<key> or label=<key>:<value> Matches volumes based on the presence of a label alone or a label and a value.   - name=<volume-name> Matches all of volume name.   - `until=<timestamp>` List volumes created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.  Note:   The boolean `dangling` filter is not yet implemented for this endpoint. 
        try {
            ListResponse result = apiInstance.volumeList(filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesCompatApi#volumeList");
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
| **filters** | **String**| JSON encoded value of the filters (a map[string][]string) to process on the volumes list. Available filters:   - driver&#x3D;&lt;volume-driver-name&gt; Matches volumes based on their driver.   - label&#x3D;&lt;key&gt; or label&#x3D;&lt;key&gt;:&lt;value&gt; Matches volumes based on the presence of a label alone or a label and a value.   - name&#x3D;&lt;volume-name&gt; Matches all of volume name.   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; List volumes created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.  Note:   The boolean &#x60;dangling&#x60; filter is not yet implemented for this endpoint.  | [optional] |

### Return type

[**ListResponse**](ListResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume List |  -  |
| **500** | Internal server error |  -  |

## volumeListWithHttpInfo

> ApiResponse<ListResponse> volumeList volumeListWithHttpInfo(filters)

List volumes

Returns a list of volume

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesCompatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of the filters (a map[string][]string) to process on the volumes list. Available filters:   - driver=<volume-driver-name> Matches volumes based on their driver.   - label=<key> or label=<key>:<value> Matches volumes based on the presence of a label alone or a label and a value.   - name=<volume-name> Matches all of volume name.   - `until=<timestamp>` List volumes created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.  Note:   The boolean `dangling` filter is not yet implemented for this endpoint. 
        try {
            ApiResponse<ListResponse> response = apiInstance.volumeListWithHttpInfo(filters);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesCompatApi#volumeList");
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
| **filters** | **String**| JSON encoded value of the filters (a map[string][]string) to process on the volumes list. Available filters:   - driver&#x3D;&lt;volume-driver-name&gt; Matches volumes based on their driver.   - label&#x3D;&lt;key&gt; or label&#x3D;&lt;key&gt;:&lt;value&gt; Matches volumes based on the presence of a label alone or a label and a value.   - name&#x3D;&lt;volume-name&gt; Matches all of volume name.   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; List volumes created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.  Note:   The boolean &#x60;dangling&#x60; filter is not yet implemented for this endpoint.  | [optional] |

### Return type

ApiResponse<[**ListResponse**](ListResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume List |  -  |
| **500** | Internal server error |  -  |


## volumePrune

> PruneReport volumePrune(filters)

Prune volumes

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesCompatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of filters (a map[string][]string) to match volumes against before pruning. Available filters:   - `until=<timestamp>` Prune volumes created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune volumes with (or without, in case `label!=...` is used) the specified labels. 
        try {
            PruneReport result = apiInstance.volumePrune(filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesCompatApi#volumePrune");
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

[**PruneReport**](PruneReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume prune |  -  |
| **500** | Internal server error |  -  |

## volumePruneWithHttpInfo

> ApiResponse<PruneReport> volumePrune volumePruneWithHttpInfo(filters)

Prune volumes

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.VolumesCompatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of filters (a map[string][]string) to match volumes against before pruning. Available filters:   - `until=<timestamp>` Prune volumes created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune volumes with (or without, in case `label!=...` is used) the specified labels. 
        try {
            ApiResponse<PruneReport> response = apiInstance.volumePruneWithHttpInfo(filters);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesCompatApi#volumePrune");
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

ApiResponse<[**PruneReport**](PruneReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume prune |  -  |
| **500** | Internal server error |  -  |

