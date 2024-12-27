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
import java.io.IOException;
import java.util.Arrays;
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
 * InspectBlkioThrottleDevice holds information about a speed cap for a device node. This cap applies to a specific operation (read, write, etc) on the given node.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T02:16:23.826374396+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class InspectBlkioThrottleDevice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RATE = "Rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Integer rate;

  public InspectBlkioThrottleDevice() {
  }

  public InspectBlkioThrottleDevice path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path is the path to the device this applies to.
   * @return path
   */
  @jakarta.annotation.Nullable

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public InspectBlkioThrottleDevice rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate is the maximum rate. It is in either bytes per second or iops per second, determined by where it is used - documentation will indicate which is appropriate.
   * @return rate
   */
  @jakarta.annotation.Nullable

  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectBlkioThrottleDevice inspectBlkioThrottleDevice = (InspectBlkioThrottleDevice) o;
    return Objects.equals(this.path, inspectBlkioThrottleDevice.path) &&
        Objects.equals(this.rate, inspectBlkioThrottleDevice.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectBlkioThrottleDevice {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
    openapiFields.add("Path");
    openapiFields.add("Rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InspectBlkioThrottleDevice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InspectBlkioThrottleDevice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectBlkioThrottleDevice is not found in the empty JSON string", InspectBlkioThrottleDevice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InspectBlkioThrottleDevice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectBlkioThrottleDevice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonNull()) && !jsonObj.get("Path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectBlkioThrottleDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectBlkioThrottleDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectBlkioThrottleDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectBlkioThrottleDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectBlkioThrottleDevice>() {
           @Override
           public void write(JsonWriter out, InspectBlkioThrottleDevice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectBlkioThrottleDevice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InspectBlkioThrottleDevice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InspectBlkioThrottleDevice
   * @throws IOException if the JSON string is invalid with respect to InspectBlkioThrottleDevice
   */
  public static InspectBlkioThrottleDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectBlkioThrottleDevice.class);
  }

  /**
   * Convert an instance of InspectBlkioThrottleDevice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

