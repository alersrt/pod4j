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
 * Task carries the information about one backend task
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T22:01:10.352312929+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Task implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ENDPOINT_I_D = "EndpointID";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_I_D)
  private String endpointID;

  public static final String SERIALIZED_NAME_ENDPOINT_I_P = "EndpointIP";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_I_P)
  private String endpointIP;

  public static final String SERIALIZED_NAME_INFO = "Info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private Map<String, String> info = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public Task() {
  }

  public Task endpointID(String endpointID) {
    this.endpointID = endpointID;
    return this;
  }

  /**
   * Get endpointID
   * @return endpointID
   */
  @jakarta.annotation.Nullable

  public String getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }


  public Task endpointIP(String endpointIP) {
    this.endpointIP = endpointIP;
    return this;
  }

  /**
   * Get endpointIP
   * @return endpointIP
   */
  @jakarta.annotation.Nullable

  public String getEndpointIP() {
    return endpointIP;
  }

  public void setEndpointIP(String endpointIP) {
    this.endpointIP = endpointIP;
  }


  public Task info(Map<String, String> info) {
    this.info = info;
    return this;
  }

  public Task putInfoItem(String key, String infoItem) {
    if (this.info == null) {
      this.info = new HashMap<>();
    }
    this.info.put(key, infoItem);
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getInfo() {
    return info;
  }

  public void setInfo(Map<String, String> info) {
    this.info = info;
  }


  public Task name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nullable

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.endpointID, task.endpointID) &&
        Objects.equals(this.endpointIP, task.endpointIP) &&
        Objects.equals(this.info, task.info) &&
        Objects.equals(this.name, task.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointID, endpointIP, info, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    endpointIP: ").append(toIndentedString(endpointIP)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("EndpointID");
    openapiFields.add("EndpointIP");
    openapiFields.add("Info");
    openapiFields.add("Name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Task
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Task.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Task is not found in the empty JSON string", Task.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Task.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Task` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("EndpointID") != null && !jsonObj.get("EndpointID").isJsonNull()) && !jsonObj.get("EndpointID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EndpointID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EndpointID").toString()));
      }
      if ((jsonObj.get("EndpointIP") != null && !jsonObj.get("EndpointIP").isJsonNull()) && !jsonObj.get("EndpointIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EndpointIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EndpointIP").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Task.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Task' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Task> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Task.class));

       return (TypeAdapter<T>) new TypeAdapter<Task>() {
           @Override
           public void write(JsonWriter out, Task value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Task read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Task given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Task
   * @throws IOException if the JSON string is invalid with respect to Task
   */
  public static Task fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Task.class);
  }

  /**
   * Convert an instance of Task to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

