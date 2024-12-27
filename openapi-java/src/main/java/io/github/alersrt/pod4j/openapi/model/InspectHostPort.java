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
 * InspectHostPort provides information on a port on the host that a container&#39;s port is bound to.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T23:15:58.977038016+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class InspectHostPort implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_HOST_IP = "HostIp";
  @SerializedName(SERIALIZED_NAME_HOST_IP)
  private String hostIp;

  public static final String SERIALIZED_NAME_HOST_PORT = "HostPort";
  @SerializedName(SERIALIZED_NAME_HOST_PORT)
  private String hostPort;

  public InspectHostPort() {
  }

  public InspectHostPort hostIp(String hostIp) {
    this.hostIp = hostIp;
    return this;
  }

  /**
   * IP on the host we are bound to. \&quot;\&quot; if not specified (binding to all IPs).
   * @return hostIp
   */
  @jakarta.annotation.Nullable

  public String getHostIp() {
    return hostIp;
  }

  public void setHostIp(String hostIp) {
    this.hostIp = hostIp;
  }


  public InspectHostPort hostPort(String hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  /**
   * Port on the host we are bound to. No special formatting - just an integer stuffed into a string.
   * @return hostPort
   */
  @jakarta.annotation.Nullable

  public String getHostPort() {
    return hostPort;
  }

  public void setHostPort(String hostPort) {
    this.hostPort = hostPort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectHostPort inspectHostPort = (InspectHostPort) o;
    return Objects.equals(this.hostIp, inspectHostPort.hostIp) &&
        Objects.equals(this.hostPort, inspectHostPort.hostPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostIp, hostPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectHostPort {\n");
    sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
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
    openapiFields.add("HostIp");
    openapiFields.add("HostPort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InspectHostPort
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InspectHostPort.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectHostPort is not found in the empty JSON string", InspectHostPort.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InspectHostPort.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectHostPort` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("HostIp") != null && !jsonObj.get("HostIp").isJsonNull()) && !jsonObj.get("HostIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HostIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HostIp").toString()));
      }
      if ((jsonObj.get("HostPort") != null && !jsonObj.get("HostPort").isJsonNull()) && !jsonObj.get("HostPort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HostPort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HostPort").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectHostPort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectHostPort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectHostPort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectHostPort.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectHostPort>() {
           @Override
           public void write(JsonWriter out, InspectHostPort value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectHostPort read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InspectHostPort given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InspectHostPort
   * @throws IOException if the JSON string is invalid with respect to InspectHostPort
   */
  public static InspectHostPort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectHostPort.class);
  }

  /**
   * Convert an instance of InspectHostPort to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

