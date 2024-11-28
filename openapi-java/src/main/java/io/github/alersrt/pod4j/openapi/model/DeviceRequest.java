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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.JSON;
import jakarta.validation.Valid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Used by GPU device drivers.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T01:29:49.168634544+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class DeviceRequest {
    public static final String SERIALIZED_NAME_CAPABILITIES = "Capabilities";
    public static final String SERIALIZED_NAME_COUNT = "Count";
    public static final String SERIALIZED_NAME_DEVICE_I_DS = "DeviceIDs";
    public static final String SERIALIZED_NAME_DRIVER = "Driver";
    public static final String SERIALIZED_NAME_OPTIONS = "Options";
    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("Capabilities");
        openapiFields.add("Count");
        openapiFields.add("DeviceIDs");
        openapiFields.add("Driver");
        openapiFields.add("Options");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    @SerializedName(SERIALIZED_NAME_CAPABILITIES)
    private List<List<String>> capabilities = new ArrayList<>();
    @SerializedName(SERIALIZED_NAME_COUNT)
    private Long count;
    @SerializedName(SERIALIZED_NAME_DEVICE_I_DS)
    private List<String> deviceIDs = new ArrayList<>();
    @SerializedName(SERIALIZED_NAME_DRIVER)
    private String driver;
    @SerializedName(SERIALIZED_NAME_OPTIONS)
    private Map<String, String> options = new HashMap<>();

    public DeviceRequest() {
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DeviceRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeviceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceRequest is not found in the empty JSON string", DeviceRequest.openapiRequiredFields));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DeviceRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeviceRequest` properties. JSON: %s", entry.getKey(), jsonElement));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("Capabilities") != null && !jsonObj.get("Capabilities").isJsonNull() && !jsonObj.get("Capabilities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Capabilities` to be an array in the JSON string but got `%s`", jsonObj.get("Capabilities").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("DeviceIDs") != null && !jsonObj.get("DeviceIDs").isJsonNull() && !jsonObj.get("DeviceIDs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `DeviceIDs` to be an array in the JSON string but got `%s`", jsonObj.get("DeviceIDs").toString()));
        }
        if ((jsonObj.get("Driver") != null && !jsonObj.get("Driver").isJsonNull()) && !jsonObj.get("Driver").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Driver").toString()));
        }
    }

    /**
     * Create an instance of DeviceRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeviceRequest
     * @throws IOException if the JSON string is invalid with respect to DeviceRequest
     */
    public static DeviceRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeviceRequest.class);
    }

    public DeviceRequest capabilities(List<List<String>> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public DeviceRequest addCapabilitiesItem(List<String> capabilitiesItem) {
        if (this.capabilities == null) {
            this.capabilities = new ArrayList<>();
        }
        this.capabilities.add(capabilitiesItem);
        return this;
    }

    /**
     * Get capabilities
     *
     * @return capabilities
     */
    @jakarta.annotation.Nullable
    @Valid

    public List<List<String>> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<List<String>> capabilities) {
        this.capabilities = capabilities;
    }

    public DeviceRequest count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     *
     * @return count
     */
    @jakarta.annotation.Nullable

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public DeviceRequest deviceIDs(List<String> deviceIDs) {
        this.deviceIDs = deviceIDs;
        return this;
    }

    public DeviceRequest addDeviceIDsItem(String deviceIDsItem) {
        if (this.deviceIDs == null) {
            this.deviceIDs = new ArrayList<>();
        }
        this.deviceIDs.add(deviceIDsItem);
        return this;
    }

    /**
     * Get deviceIDs
     *
     * @return deviceIDs
     */
    @jakarta.annotation.Nullable

    public List<String> getDeviceIDs() {
        return deviceIDs;
    }

    public void setDeviceIDs(List<String> deviceIDs) {
        this.deviceIDs = deviceIDs;
    }

    public DeviceRequest driver(String driver) {
        this.driver = driver;
        return this;
    }

    /**
     * Get driver
     *
     * @return driver
     */
    @jakarta.annotation.Nullable

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public DeviceRequest options(Map<String, String> options) {
        this.options = options;
        return this;
    }

    public DeviceRequest putOptionsItem(String key, String optionsItem) {
        if (this.options == null) {
            this.options = new HashMap<>();
        }
        this.options.put(key, optionsItem);
        return this;
    }

    /**
     * Get options
     *
     * @return options
     */
    @jakarta.annotation.Nullable

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceRequest deviceRequest = (DeviceRequest) o;
        return Objects.equals(this.capabilities, deviceRequest.capabilities) &&
                Objects.equals(this.count, deviceRequest.count) &&
                Objects.equals(this.deviceIDs, deviceRequest.deviceIDs) &&
                Objects.equals(this.driver, deviceRequest.driver) &&
                Objects.equals(this.options, deviceRequest.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capabilities, count, deviceIDs, driver, options);
    }

    @Override
    public String toString() {
        String sb = "class DeviceRequest {\n" +
                "    capabilities: " + toIndentedString(capabilities) + "\n" +
                "    count: " + toIndentedString(count) + "\n" +
                "    deviceIDs: " + toIndentedString(deviceIDs) + "\n" +
                "    driver: " + toIndentedString(driver) + "\n" +
                "    options: " + toIndentedString(options) + "\n" +
                "}";
        return sb;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert an instance of DeviceRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeviceRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeviceRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeviceRequest> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(DeviceRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<DeviceRequest>() {
                @Override
                public void write(JsonWriter out, DeviceRequest value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public DeviceRequest read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }
}

