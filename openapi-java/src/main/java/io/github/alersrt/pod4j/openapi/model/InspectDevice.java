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
 * InspectDevice
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class InspectDevice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CGROUP_PERMISSIONS = "CgroupPermissions";
  @SerializedName(SERIALIZED_NAME_CGROUP_PERMISSIONS)
  private String cgroupPermissions;

  public static final String SERIALIZED_NAME_PATH_IN_CONTAINER = "PathInContainer";
  @SerializedName(SERIALIZED_NAME_PATH_IN_CONTAINER)
  private String pathInContainer;

  public static final String SERIALIZED_NAME_PATH_ON_HOST = "PathOnHost";
  @SerializedName(SERIALIZED_NAME_PATH_ON_HOST)
  private String pathOnHost;

  public InspectDevice() {
  }

  public InspectDevice cgroupPermissions(String cgroupPermissions) {
    this.cgroupPermissions = cgroupPermissions;
    return this;
  }

  /**
   * CgroupPermissions is the permissions of the mounted device. Presently not populated. TODO.
   * @return cgroupPermissions
   */
  @jakarta.annotation.Nullable

  public String getCgroupPermissions() {
    return cgroupPermissions;
  }

  public void setCgroupPermissions(String cgroupPermissions) {
    this.cgroupPermissions = cgroupPermissions;
  }


  public InspectDevice pathInContainer(String pathInContainer) {
    this.pathInContainer = pathInContainer;
    return this;
  }

  /**
   * PathInContainer is the path of the device within the container.
   * @return pathInContainer
   */
  @jakarta.annotation.Nullable

  public String getPathInContainer() {
    return pathInContainer;
  }

  public void setPathInContainer(String pathInContainer) {
    this.pathInContainer = pathInContainer;
  }


  public InspectDevice pathOnHost(String pathOnHost) {
    this.pathOnHost = pathOnHost;
    return this;
  }

  /**
   * PathOnHost is the path of the device on the host.
   * @return pathOnHost
   */
  @jakarta.annotation.Nullable

  public String getPathOnHost() {
    return pathOnHost;
  }

  public void setPathOnHost(String pathOnHost) {
    this.pathOnHost = pathOnHost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectDevice inspectDevice = (InspectDevice) o;
    return Objects.equals(this.cgroupPermissions, inspectDevice.cgroupPermissions) &&
        Objects.equals(this.pathInContainer, inspectDevice.pathInContainer) &&
        Objects.equals(this.pathOnHost, inspectDevice.pathOnHost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cgroupPermissions, pathInContainer, pathOnHost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectDevice {\n");
    sb.append("    cgroupPermissions: ").append(toIndentedString(cgroupPermissions)).append("\n");
    sb.append("    pathInContainer: ").append(toIndentedString(pathInContainer)).append("\n");
    sb.append("    pathOnHost: ").append(toIndentedString(pathOnHost)).append("\n");
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
    openapiFields.add("CgroupPermissions");
    openapiFields.add("PathInContainer");
    openapiFields.add("PathOnHost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InspectDevice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InspectDevice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectDevice is not found in the empty JSON string", InspectDevice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InspectDevice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectDevice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CgroupPermissions") != null && !jsonObj.get("CgroupPermissions").isJsonNull()) && !jsonObj.get("CgroupPermissions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CgroupPermissions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CgroupPermissions").toString()));
      }
      if ((jsonObj.get("PathInContainer") != null && !jsonObj.get("PathInContainer").isJsonNull()) && !jsonObj.get("PathInContainer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PathInContainer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PathInContainer").toString()));
      }
      if ((jsonObj.get("PathOnHost") != null && !jsonObj.get("PathOnHost").isJsonNull()) && !jsonObj.get("PathOnHost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PathOnHost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PathOnHost").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectDevice>() {
           @Override
           public void write(JsonWriter out, InspectDevice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectDevice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InspectDevice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InspectDevice
   * @throws IOException if the JSON string is invalid with respect to InspectDevice
   */
  public static InspectDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectDevice.class);
  }

  /**
   * Convert an instance of InspectDevice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

