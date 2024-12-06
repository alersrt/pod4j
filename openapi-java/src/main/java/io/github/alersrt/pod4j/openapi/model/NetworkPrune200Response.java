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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * NetworkPrune200Response
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T22:01:10.352312929+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class NetworkPrune200Response implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NETWORKS_DELETED = "NetworksDeleted";
  @SerializedName(SERIALIZED_NAME_NETWORKS_DELETED)
  private List<String> networksDeleted = new ArrayList<>();

  public NetworkPrune200Response() {
  }

  public NetworkPrune200Response networksDeleted(List<String> networksDeleted) {
    this.networksDeleted = networksDeleted;
    return this;
  }

  public NetworkPrune200Response addNetworksDeletedItem(String networksDeletedItem) {
    if (this.networksDeleted == null) {
      this.networksDeleted = new ArrayList<>();
    }
    this.networksDeleted.add(networksDeletedItem);
    return this;
  }

  /**
   * Get networksDeleted
   * @return networksDeleted
   */
  @jakarta.annotation.Nullable

  public List<String> getNetworksDeleted() {
    return networksDeleted;
  }

  public void setNetworksDeleted(List<String> networksDeleted) {
    this.networksDeleted = networksDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkPrune200Response networkPrune200Response = (NetworkPrune200Response) o;
    return Objects.equals(this.networksDeleted, networkPrune200Response.networksDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networksDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkPrune200Response {\n");
    sb.append("    networksDeleted: ").append(toIndentedString(networksDeleted)).append("\n");
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
    openapiFields.add("NetworksDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NetworkPrune200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetworkPrune200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkPrune200Response is not found in the empty JSON string", NetworkPrune200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetworkPrune200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetworkPrune200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("NetworksDeleted") != null && !jsonObj.get("NetworksDeleted").isJsonNull() && !jsonObj.get("NetworksDeleted").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetworksDeleted` to be an array in the JSON string but got `%s`", jsonObj.get("NetworksDeleted").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkPrune200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkPrune200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkPrune200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkPrune200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkPrune200Response>() {
           @Override
           public void write(JsonWriter out, NetworkPrune200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkPrune200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NetworkPrune200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NetworkPrune200Response
   * @throws IOException if the JSON string is invalid with respect to NetworkPrune200Response
   */
  public static NetworkPrune200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkPrune200Response.class);
  }

  /**
   * Convert an instance of NetworkPrune200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

