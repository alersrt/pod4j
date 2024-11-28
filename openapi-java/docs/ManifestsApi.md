# ManifestsApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**manifestAddLibpod**](ManifestsApi.md#manifestAddLibpod) | **POST** /libpod/manifests/{name}/add | Add image |
| [**manifestAddLibpodWithHttpInfo**](ManifestsApi.md#manifestAddLibpodWithHttpInfo) | **POST** /libpod/manifests/{name}/add | Add image |
| [**manifestCreateLibpod**](ManifestsApi.md#manifestCreateLibpod) | **POST** /libpod/manifests/{name} | Create |
| [**manifestCreateLibpodWithHttpInfo**](ManifestsApi.md#manifestCreateLibpodWithHttpInfo) | **POST** /libpod/manifests/{name} | Create |
| [**manifestDeleteLibpod**](ManifestsApi.md#manifestDeleteLibpod) | **DELETE** /libpod/manifests/{name} | Delete manifest list |
| [**manifestDeleteLibpodWithHttpInfo**](ManifestsApi.md#manifestDeleteLibpodWithHttpInfo) | **DELETE** /libpod/manifests/{name} | Delete manifest list |
| [**manifestExistsLibpod**](ManifestsApi.md#manifestExistsLibpod) | **GET** /libpod/manifests/{name}/exists | Exists |
| [**manifestExistsLibpodWithHttpInfo**](ManifestsApi.md#manifestExistsLibpodWithHttpInfo) | **GET** /libpod/manifests/{name}/exists | Exists |
| [**manifestInspectLibpod**](ManifestsApi.md#manifestInspectLibpod) | **GET** /libpod/manifests/{name}/json | Inspect |
| [**manifestInspectLibpodWithHttpInfo**](ManifestsApi.md#manifestInspectLibpodWithHttpInfo) | **GET** /libpod/manifests/{name}/json | Inspect |
| [**manifestModifyLibpod**](ManifestsApi.md#manifestModifyLibpod) | **PUT** /libpod/manifests/{name} | Modify manifest list |
| [**manifestModifyLibpodWithHttpInfo**](ManifestsApi.md#manifestModifyLibpodWithHttpInfo) | **PUT** /libpod/manifests/{name} | Modify manifest list |
| [**manifestPushLibpod**](ManifestsApi.md#manifestPushLibpod) | **POST** /libpod/manifests/{name}/registry/{destination} | Push manifest list to registry |
| [**manifestPushLibpodWithHttpInfo**](ManifestsApi.md#manifestPushLibpodWithHttpInfo) | **POST** /libpod/manifests/{name}/registry/{destination} | Push manifest list to registry |
| [**manifestPushV3Libpod**](ManifestsApi.md#manifestPushV3Libpod) | **POST** /libpod/manifests/{name}/push | Push manifest to registry |
| [**manifestPushV3LibpodWithHttpInfo**](ManifestsApi.md#manifestPushV3LibpodWithHttpInfo) | **POST** /libpod/manifests/{name}/push | Push manifest to registry |



## manifestAddLibpod

> IdResponse manifestAddLibpod(name, options)

Add image

Add an image to a manifest list  Deprecated: As of 4.0.0 use ManifestModifyLibpod instead 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest
        ManifestAddOptions options = new ManifestAddOptions(); // ManifestAddOptions | options for creating a manifest
        try {
            IdResponse result = apiInstance.manifestAddLibpod(name, options);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestAddLibpod");
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
| **name** | **String**| the name or ID of the manifest | |
| **options** | [**ManifestAddOptions**](ManifestAddOptions.md)| options for creating a manifest | [optional] |

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
| **200** |  |  -  |
| **404** | No such manifest |  -  |
| **409** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

## manifestAddLibpodWithHttpInfo

> ApiResponse<IdResponse> manifestAddLibpod manifestAddLibpodWithHttpInfo(name, options)

Add image

Add an image to a manifest list  Deprecated: As of 4.0.0 use ManifestModifyLibpod instead 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest
        ManifestAddOptions options = new ManifestAddOptions(); // ManifestAddOptions | options for creating a manifest
        try {
            ApiResponse<IdResponse> response = apiInstance.manifestAddLibpodWithHttpInfo(name, options);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestAddLibpod");
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
| **name** | **String**| the name or ID of the manifest | |
| **options** | [**ManifestAddOptions**](ManifestAddOptions.md)| options for creating a manifest | [optional] |

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
| **200** |  |  -  |
| **404** | No such manifest |  -  |
| **409** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |


## manifestCreateLibpod

> IdResponse manifestCreateLibpod(name, images, all, amend, options)

Create

Create a manifest list

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | manifest list or index name to create
        String images = "images_example"; // String | One or more names of an image or a manifest list. Repeat parameter as needed.  Support for multiple images, as of version 4.0.0 Alias of `image` is support for compatibility with < 4.0.0 Response status code is 200 with < 4.0.0 for compatibility 
        Boolean all = true; // Boolean | add all contents if given list
        Boolean amend = true; // Boolean | modify an existing list if one with the desired name already exists
        ManifestModifyOptions options = new ManifestModifyOptions(); // ManifestModifyOptions | options for new manifest
        try {
            IdResponse result = apiInstance.manifestCreateLibpod(name, images, all, amend, options);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestCreateLibpod");
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
| **name** | **String**| manifest list or index name to create | |
| **images** | **String**| One or more names of an image or a manifest list. Repeat parameter as needed.  Support for multiple images, as of version 4.0.0 Alias of &#x60;image&#x60; is support for compatibility with &lt; 4.0.0 Response status code is 200 with &lt; 4.0.0 for compatibility  | |
| **all** | **Boolean**| add all contents if given list | [optional] |
| **amend** | **Boolean**| modify an existing list if one with the desired name already exists | [optional] |
| **options** | [**ManifestModifyOptions**](ManifestModifyOptions.md)| options for new manifest | [optional] |

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
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

## manifestCreateLibpodWithHttpInfo

> ApiResponse<IdResponse> manifestCreateLibpod manifestCreateLibpodWithHttpInfo(name, images, all, amend, options)

Create

Create a manifest list

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | manifest list or index name to create
        String images = "images_example"; // String | One or more names of an image or a manifest list. Repeat parameter as needed.  Support for multiple images, as of version 4.0.0 Alias of `image` is support for compatibility with < 4.0.0 Response status code is 200 with < 4.0.0 for compatibility 
        Boolean all = true; // Boolean | add all contents if given list
        Boolean amend = true; // Boolean | modify an existing list if one with the desired name already exists
        ManifestModifyOptions options = new ManifestModifyOptions(); // ManifestModifyOptions | options for new manifest
        try {
            ApiResponse<IdResponse> response = apiInstance.manifestCreateLibpodWithHttpInfo(name, images, all, amend, options);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestCreateLibpod");
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
| **name** | **String**| manifest list or index name to create | |
| **images** | **String**| One or more names of an image or a manifest list. Repeat parameter as needed.  Support for multiple images, as of version 4.0.0 Alias of &#x60;image&#x60; is support for compatibility with &lt; 4.0.0 Response status code is 200 with &lt; 4.0.0 for compatibility  | |
| **all** | **Boolean**| add all contents if given list | [optional] |
| **amend** | **Boolean**| modify an existing list if one with the desired name already exists | [optional] |
| **options** | [**ManifestModifyOptions**](ManifestModifyOptions.md)| options for new manifest | [optional] |

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
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |


## manifestDeleteLibpod

> LibpodImagesRemoveReport manifestDeleteLibpod(name)

Delete manifest list

Delete named manifest list  As of v4.0.0 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | The name or ID of the  list to be deleted
        try {
            LibpodImagesRemoveReport result = apiInstance.manifestDeleteLibpod(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestDeleteLibpod");
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
| **name** | **String**| The name or ID of the  list to be deleted | |

### Return type

[**LibpodImagesRemoveReport**](LibpodImagesRemoveReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Remove |  -  |
| **404** | No such manifest |  -  |
| **500** | Internal server error |  -  |

## manifestDeleteLibpodWithHttpInfo

> ApiResponse<LibpodImagesRemoveReport> manifestDeleteLibpod manifestDeleteLibpodWithHttpInfo(name)

Delete manifest list

Delete named manifest list  As of v4.0.0 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | The name or ID of the  list to be deleted
        try {
            ApiResponse<LibpodImagesRemoveReport> response = apiInstance.manifestDeleteLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestDeleteLibpod");
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
| **name** | **String**| The name or ID of the  list to be deleted | |

### Return type

ApiResponse<[**LibpodImagesRemoveReport**](LibpodImagesRemoveReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Remove |  -  |
| **404** | No such manifest |  -  |
| **500** | Internal server error |  -  |


## manifestExistsLibpod

> void manifestExistsLibpod(name)

Exists

Check if manifest list exists  Note: There is no contract that the manifest list will exist for a follow-on operation 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest list
        try {
            apiInstance.manifestExistsLibpod(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestExistsLibpod");
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
| **name** | **String**| the name or ID of the manifest list | |

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
| **204** | manifest list exists |  -  |
| **404** | No such manifest |  -  |
| **500** | Internal server error |  -  |

## manifestExistsLibpodWithHttpInfo

> ApiResponse<Void> manifestExistsLibpod manifestExistsLibpodWithHttpInfo(name)

Exists

Check if manifest list exists  Note: There is no contract that the manifest list will exist for a follow-on operation 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest list
        try {
            ApiResponse<Void> response = apiInstance.manifestExistsLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestExistsLibpod");
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
| **name** | **String**| the name or ID of the manifest list | |

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
| **204** | manifest list exists |  -  |
| **404** | No such manifest |  -  |
| **500** | Internal server error |  -  |


## manifestInspectLibpod

> Schema2ListPublic manifestInspectLibpod(name, tlsVerify)

Inspect

Display attributes of given manifest list

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest list
        Boolean tlsVerify = true; // Boolean | Require HTTPS and verify signatures when contacting registries.
        try {
            Schema2ListPublic result = apiInstance.manifestInspectLibpod(name, tlsVerify);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestInspectLibpod");
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
| **name** | **String**| the name or ID of the manifest list | |
| **tlsVerify** | **Boolean**| Require HTTPS and verify signatures when contacting registries. | [optional] [default to true] |

### Return type

[**Schema2ListPublic**](Schema2ListPublic.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inspect Manifest |  -  |
| **404** | No such manifest |  -  |
| **500** | Internal server error |  -  |

## manifestInspectLibpodWithHttpInfo

> ApiResponse<Schema2ListPublic> manifestInspectLibpod manifestInspectLibpodWithHttpInfo(name, tlsVerify)

Inspect

Display attributes of given manifest list

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest list
        Boolean tlsVerify = true; // Boolean | Require HTTPS and verify signatures when contacting registries.
        try {
            ApiResponse<Schema2ListPublic> response = apiInstance.manifestInspectLibpodWithHttpInfo(name, tlsVerify);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestInspectLibpod");
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
| **name** | **String**| the name or ID of the manifest list | |
| **tlsVerify** | **Boolean**| Require HTTPS and verify signatures when contacting registries. | [optional] [default to true] |

### Return type

ApiResponse<[**Schema2ListPublic**](Schema2ListPublic.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inspect Manifest |  -  |
| **404** | No such manifest |  -  |
| **500** | Internal server error |  -  |


## manifestModifyLibpod

> ManifestModifyReport manifestModifyLibpod(name, options, tlsVerify)

Modify manifest list

Add/Remove an image(s) to a manifest list  Note: operations are not atomic when multiple Images are provided.  As of v4.0.0 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest
        ManifestModifyOptions options = new ManifestModifyOptions(); // ManifestModifyOptions | options for mutating a manifest
        Boolean tlsVerify = true; // Boolean | Require HTTPS and verify signatures when contacting registries.
        try {
            ManifestModifyReport result = apiInstance.manifestModifyLibpod(name, options, tlsVerify);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestModifyLibpod");
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
| **name** | **String**| the name or ID of the manifest | |
| **options** | [**ManifestModifyOptions**](ManifestModifyOptions.md)| options for mutating a manifest | |
| **tlsVerify** | **Boolean**| Require HTTPS and verify signatures when contacting registries. | [optional] [default to true] |

### Return type

[**ManifestModifyReport**](ManifestModifyReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such manifest |  -  |
| **409** | Operation had partial success, both Images and Errors may have members |  -  |
| **500** | Internal server error |  -  |

## manifestModifyLibpodWithHttpInfo

> ApiResponse<ManifestModifyReport> manifestModifyLibpod manifestModifyLibpodWithHttpInfo(name, options, tlsVerify)

Modify manifest list

Add/Remove an image(s) to a manifest list  Note: operations are not atomic when multiple Images are provided.  As of v4.0.0 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest
        ManifestModifyOptions options = new ManifestModifyOptions(); // ManifestModifyOptions | options for mutating a manifest
        Boolean tlsVerify = true; // Boolean | Require HTTPS and verify signatures when contacting registries.
        try {
            ApiResponse<ManifestModifyReport> response = apiInstance.manifestModifyLibpodWithHttpInfo(name, options, tlsVerify);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestModifyLibpod");
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
| **name** | **String**| the name or ID of the manifest | |
| **options** | [**ManifestModifyOptions**](ManifestModifyOptions.md)| options for mutating a manifest | |
| **tlsVerify** | **Boolean**| Require HTTPS and verify signatures when contacting registries. | [optional] [default to true] |

### Return type

ApiResponse<[**ManifestModifyReport**](ManifestModifyReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such manifest |  -  |
| **409** | Operation had partial success, both Images and Errors may have members |  -  |
| **500** | Internal server error |  -  |


## manifestPushLibpod

> IdResponse manifestPushLibpod(name, destination, addCompression, forceCompressionFormat, all, tlsVerify, quiet)

Push manifest list to registry

Push a manifest list or image index to the named registry  As of v4.0.0 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest list
        String destination = "destination_example"; // String | the registry for the manifest list
        List<String> addCompression = Arrays.asList(); // List<String> | add existing instances with requested compression algorithms to manifest list
        Boolean forceCompressionFormat = false; // Boolean | Enforce compressing the layers with the specified --compression and do not reuse differently compressed blobs on the registry.
        Boolean all = true; // Boolean | push all images
        Boolean tlsVerify = true; // Boolean | Require HTTPS and verify signatures when contacting registries.
        Boolean quiet = true; // Boolean | silences extra stream data on push
        try {
            IdResponse result = apiInstance.manifestPushLibpod(name, destination, addCompression, forceCompressionFormat, all, tlsVerify, quiet);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestPushLibpod");
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
| **name** | **String**| the name or ID of the manifest list | |
| **destination** | **String**| the registry for the manifest list | |
| **addCompression** | [**List&lt;String&gt;**](String.md)| add existing instances with requested compression algorithms to manifest list | [optional] |
| **forceCompressionFormat** | **Boolean**| Enforce compressing the layers with the specified --compression and do not reuse differently compressed blobs on the registry. | [optional] [default to false] |
| **all** | **Boolean**| push all images | [optional] [default to true] |
| **tlsVerify** | **Boolean**| Require HTTPS and verify signatures when contacting registries. | [optional] [default to true] |
| **quiet** | **Boolean**| silences extra stream data on push | [optional] [default to true] |

### Return type

[**IdResponse**](IdResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such manifest |  -  |
| **500** | Internal server error |  -  |

## manifestPushLibpodWithHttpInfo

> ApiResponse<IdResponse> manifestPushLibpod manifestPushLibpodWithHttpInfo(name, destination, addCompression, forceCompressionFormat, all, tlsVerify, quiet)

Push manifest list to registry

Push a manifest list or image index to the named registry  As of v4.0.0 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest list
        String destination = "destination_example"; // String | the registry for the manifest list
        List<String> addCompression = Arrays.asList(); // List<String> | add existing instances with requested compression algorithms to manifest list
        Boolean forceCompressionFormat = false; // Boolean | Enforce compressing the layers with the specified --compression and do not reuse differently compressed blobs on the registry.
        Boolean all = true; // Boolean | push all images
        Boolean tlsVerify = true; // Boolean | Require HTTPS and verify signatures when contacting registries.
        Boolean quiet = true; // Boolean | silences extra stream data on push
        try {
            ApiResponse<IdResponse> response = apiInstance.manifestPushLibpodWithHttpInfo(name, destination, addCompression, forceCompressionFormat, all, tlsVerify, quiet);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestPushLibpod");
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
| **name** | **String**| the name or ID of the manifest list | |
| **destination** | **String**| the registry for the manifest list | |
| **addCompression** | [**List&lt;String&gt;**](String.md)| add existing instances with requested compression algorithms to manifest list | [optional] |
| **forceCompressionFormat** | **Boolean**| Enforce compressing the layers with the specified --compression and do not reuse differently compressed blobs on the registry. | [optional] [default to false] |
| **all** | **Boolean**| push all images | [optional] [default to true] |
| **tlsVerify** | **Boolean**| Require HTTPS and verify signatures when contacting registries. | [optional] [default to true] |
| **quiet** | **Boolean**| silences extra stream data on push | [optional] [default to true] |

### Return type

ApiResponse<[**IdResponse**](IdResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such manifest |  -  |
| **500** | Internal server error |  -  |


## manifestPushV3Libpod

> IdResponse manifestPushV3Libpod(name, destination, all)

Push manifest to registry

Push a manifest list or image index to a registry  Deprecated: As of 4.0.0 use ManifestPushLibpod instead 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest
        String destination = "destination_example"; // String | the destination for the manifest
        Boolean all = true; // Boolean | push all images
        try {
            IdResponse result = apiInstance.manifestPushV3Libpod(name, destination, all);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestPushV3Libpod");
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
| **name** | **String**| the name or ID of the manifest | |
| **destination** | **String**| the destination for the manifest | |
| **all** | **Boolean**| push all images | [optional] |

### Return type

[**IdResponse**](IdResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such manifest |  -  |
| **500** | Internal server error |  -  |

## manifestPushV3LibpodWithHttpInfo

> ApiResponse<IdResponse> manifestPushV3Libpod manifestPushV3LibpodWithHttpInfo(name, destination, all)

Push manifest to registry

Push a manifest list or image index to a registry  Deprecated: As of 4.0.0 use ManifestPushLibpod instead 

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.ManifestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        ManifestsApi apiInstance = new ManifestsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the manifest
        String destination = "destination_example"; // String | the destination for the manifest
        Boolean all = true; // Boolean | push all images
        try {
            ApiResponse<IdResponse> response = apiInstance.manifestPushV3LibpodWithHttpInfo(name, destination, all);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestsApi#manifestPushV3Libpod");
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
| **name** | **String**| the name or ID of the manifest | |
| **destination** | **String**| the destination for the manifest | |
| **all** | **Boolean**| push all images | [optional] |

### Return type

ApiResponse<[**IdResponse**](IdResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such manifest |  -  |
| **500** | Internal server error |  -  |

