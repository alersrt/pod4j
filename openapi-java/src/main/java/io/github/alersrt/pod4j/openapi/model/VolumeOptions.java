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
import io.github.alersrt.pod4j.openapi.model.Driver;
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
 * VolumeOptions
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T22:01:10.352312929+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class VolumeOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DRIVER_CONFIG = "DriverConfig";
  @SerializedName(SERIALIZED_NAME_DRIVER_CONFIG)
  private Driver driverConfig;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_NO_COPY = "NoCopy";
  @SerializedName(SERIALIZED_NAME_NO_COPY)
  private Boolean noCopy;

  public static final String SERIALIZED_NAME_SUBPATH = "Subpath";
  @SerializedName(SERIALIZED_NAME_SUBPATH)
  private String subpath;

  public VolumeOptions() {
  }

  public VolumeOptions driverConfig(Driver driverConfig) {
    this.driverConfig = driverConfig;
    return this;
  }

  /**
   * Get driverConfig
   * @return driverConfig
   */
  @jakarta.annotation.Nullable
  @Valid

  public Driver getDriverConfig() {
    return driverConfig;
  }

  public void setDriverConfig(Driver driverConfig) {
    this.driverConfig = driverConfig;
  }


  public VolumeOptions labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public VolumeOptions putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public VolumeOptions noCopy(Boolean noCopy) {
    this.noCopy = noCopy;
    return this;
  }

  /**
   * Get noCopy
   * @return noCopy
   */
  @jakarta.annotation.Nullable

  public Boolean getNoCopy() {
    return noCopy;
  }

  public void setNoCopy(Boolean noCopy) {
    this.noCopy = noCopy;
  }


  public VolumeOptions subpath(String subpath) {
    this.subpath = subpath;
    return this;
  }

  /**
   * Get subpath
   * @return subpath
   */
  @jakarta.annotation.Nullable

  public String getSubpath() {
    return subpath;
  }

  public void setSubpath(String subpath) {
    this.subpath = subpath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeOptions volumeOptions = (VolumeOptions) o;
    return Objects.equals(this.driverConfig, volumeOptions.driverConfig) &&
        Objects.equals(this.labels, volumeOptions.labels) &&
        Objects.equals(this.noCopy, volumeOptions.noCopy) &&
        Objects.equals(this.subpath, volumeOptions.subpath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverConfig, labels, noCopy, subpath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeOptions {\n");
    sb.append("    driverConfig: ").append(toIndentedString(driverConfig)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    noCopy: ").append(toIndentedString(noCopy)).append("\n");
    sb.append("    subpath: ").append(toIndentedString(subpath)).append("\n");
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
    openapiFields.add("DriverConfig");
    openapiFields.add("Labels");
    openapiFields.add("NoCopy");
    openapiFields.add("Subpath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VolumeOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VolumeOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VolumeOptions is not found in the empty JSON string", VolumeOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VolumeOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VolumeOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DriverConfig`
      if (jsonObj.get("DriverConfig") != null && !jsonObj.get("DriverConfig").isJsonNull()) {
        Driver.validateJsonElement(jsonObj.get("DriverConfig"));
      }
      if ((jsonObj.get("Subpath") != null && !jsonObj.get("Subpath").isJsonNull()) && !jsonObj.get("Subpath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subpath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subpath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VolumeOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VolumeOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VolumeOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VolumeOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<VolumeOptions>() {
           @Override
           public void write(JsonWriter out, VolumeOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VolumeOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VolumeOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VolumeOptions
   * @throws IOException if the JSON string is invalid with respect to VolumeOptions
   */
  public static VolumeOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VolumeOptions.class);
  }

  /**
   * Convert an instance of VolumeOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

