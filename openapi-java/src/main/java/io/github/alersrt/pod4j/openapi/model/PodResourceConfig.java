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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.model.LinuxResources;
import io.github.alersrt.pod4j.openapi.model.LinuxThrottleDevice;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.alersrt.pod4j.openapi.JSON;

/**
 * PodResourceConfig
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T23:04:06.361421791+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class PodResourceConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CPU_PERIOD = "cpu_period";
  @SerializedName(SERIALIZED_NAME_CPU_PERIOD)
  private Integer cpuPeriod;

  public static final String SERIALIZED_NAME_CPU_QUOTA = "cpu_quota";
  @SerializedName(SERIALIZED_NAME_CPU_QUOTA)
  private Long cpuQuota;

  public static final String SERIALIZED_NAME_RESOURCE_LIMITS = "resource_limits";
  @SerializedName(SERIALIZED_NAME_RESOURCE_LIMITS)
  private LinuxResources resourceLimits;

  public static final String SERIALIZED_NAME_THROTTLE_READ_BPS_DEVICE = "throttleReadBpsDevice";
  @SerializedName(SERIALIZED_NAME_THROTTLE_READ_BPS_DEVICE)
  private Map<String, LinuxThrottleDevice> throttleReadBpsDevice = new HashMap<>();

  public PodResourceConfig() {
  }

  public PodResourceConfig cpuPeriod(Integer cpuPeriod) {
    this.cpuPeriod = cpuPeriod;
    return this;
  }

  /**
   * CPU period of the cpuset, determined by --cpus
   * @return cpuPeriod
   */
  @jakarta.annotation.Nullable

  public Integer getCpuPeriod() {
    return cpuPeriod;
  }

  public void setCpuPeriod(Integer cpuPeriod) {
    this.cpuPeriod = cpuPeriod;
  }


  public PodResourceConfig cpuQuota(Long cpuQuota) {
    this.cpuQuota = cpuQuota;
    return this;
  }

  /**
   * CPU quota of the cpuset, determined by --cpus
   * @return cpuQuota
   */
  @jakarta.annotation.Nullable

  public Long getCpuQuota() {
    return cpuQuota;
  }

  public void setCpuQuota(Long cpuQuota) {
    this.cpuQuota = cpuQuota;
  }


  public PodResourceConfig resourceLimits(LinuxResources resourceLimits) {
    this.resourceLimits = resourceLimits;
    return this;
  }

  /**
   * Get resourceLimits
   * @return resourceLimits
   */
  @jakarta.annotation.Nullable
  @Valid

  public LinuxResources getResourceLimits() {
    return resourceLimits;
  }

  public void setResourceLimits(LinuxResources resourceLimits) {
    this.resourceLimits = resourceLimits;
  }


  public PodResourceConfig throttleReadBpsDevice(Map<String, LinuxThrottleDevice> throttleReadBpsDevice) {
    this.throttleReadBpsDevice = throttleReadBpsDevice;
    return this;
  }

  public PodResourceConfig putThrottleReadBpsDeviceItem(String key, LinuxThrottleDevice throttleReadBpsDeviceItem) {
    if (this.throttleReadBpsDevice == null) {
      this.throttleReadBpsDevice = new HashMap<>();
    }
    this.throttleReadBpsDevice.put(key, throttleReadBpsDeviceItem);
    return this;
  }

  /**
   * ThrottleReadBpsDevice contains the rate at which the devices in the pod can be read from/accessed
   * @return throttleReadBpsDevice
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, LinuxThrottleDevice> getThrottleReadBpsDevice() {
    return throttleReadBpsDevice;
  }

  public void setThrottleReadBpsDevice(Map<String, LinuxThrottleDevice> throttleReadBpsDevice) {
    this.throttleReadBpsDevice = throttleReadBpsDevice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodResourceConfig podResourceConfig = (PodResourceConfig) o;
    return Objects.equals(this.cpuPeriod, podResourceConfig.cpuPeriod) &&
        Objects.equals(this.cpuQuota, podResourceConfig.cpuQuota) &&
        Objects.equals(this.resourceLimits, podResourceConfig.resourceLimits) &&
        Objects.equals(this.throttleReadBpsDevice, podResourceConfig.throttleReadBpsDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuPeriod, cpuQuota, resourceLimits, throttleReadBpsDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodResourceConfig {\n");
    sb.append("    cpuPeriod: ").append(toIndentedString(cpuPeriod)).append("\n");
    sb.append("    cpuQuota: ").append(toIndentedString(cpuQuota)).append("\n");
    sb.append("    resourceLimits: ").append(toIndentedString(resourceLimits)).append("\n");
    sb.append("    throttleReadBpsDevice: ").append(toIndentedString(throttleReadBpsDevice)).append("\n");
    sb.append("}");
    return sb.toString();
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cpu_period");
    openapiFields.add("cpu_quota");
    openapiFields.add("resource_limits");
    openapiFields.add("throttleReadBpsDevice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PodResourceConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PodResourceConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PodResourceConfig is not found in the empty JSON string", PodResourceConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PodResourceConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PodResourceConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `resource_limits`
      if (jsonObj.get("resource_limits") != null && !jsonObj.get("resource_limits").isJsonNull()) {
        LinuxResources.validateJsonElement(jsonObj.get("resource_limits"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PodResourceConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PodResourceConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PodResourceConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PodResourceConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<PodResourceConfig>() {
           @Override
           public void write(JsonWriter out, PodResourceConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PodResourceConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PodResourceConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PodResourceConfig
   * @throws IOException if the JSON string is invalid with respect to PodResourceConfig
   */
  public static PodResourceConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PodResourceConfig.class);
  }

  /**
   * Convert an instance of PodResourceConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

