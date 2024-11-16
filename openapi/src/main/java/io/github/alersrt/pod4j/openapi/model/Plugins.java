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
 * Plugins
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T19:12:58.552824144+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Plugins {
  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private List<String> authorization = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOG = "log";
  @SerializedName(SERIALIZED_NAME_LOG)
  private List<String> log = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private List<String> network = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private List<String> volume = new ArrayList<>();

  public Plugins() {
  }

  public Plugins authorization(List<String> authorization) {
    this.authorization = authorization;
    return this;
  }

  public Plugins addAuthorizationItem(String authorizationItem) {
    if (this.authorization == null) {
      this.authorization = new ArrayList<>();
    }
    this.authorization.add(authorizationItem);
    return this;
  }

  /**
   * Authorization is provided for compatibility, will always be nil as Podman has no daemon
   * @return authorization
   */
  @javax.annotation.Nullable
  public List<String> getAuthorization() {
    return authorization;
  }

  public void setAuthorization(List<String> authorization) {
    this.authorization = authorization;
  }


  public Plugins log(List<String> log) {
    this.log = log;
    return this;
  }

  public Plugins addLogItem(String logItem) {
    if (this.log == null) {
      this.log = new ArrayList<>();
    }
    this.log.add(logItem);
    return this;
  }

  /**
   * Get log
   * @return log
   */
  @javax.annotation.Nullable
  public List<String> getLog() {
    return log;
  }

  public void setLog(List<String> log) {
    this.log = log;
  }


  public Plugins network(List<String> network) {
    this.network = network;
    return this;
  }

  public Plugins addNetworkItem(String networkItem) {
    if (this.network == null) {
      this.network = new ArrayList<>();
    }
    this.network.add(networkItem);
    return this;
  }

  /**
   * Get network
   * @return network
   */
  @javax.annotation.Nullable
  public List<String> getNetwork() {
    return network;
  }

  public void setNetwork(List<String> network) {
    this.network = network;
  }


  public Plugins volume(List<String> volume) {
    this.volume = volume;
    return this;
  }

  public Plugins addVolumeItem(String volumeItem) {
    if (this.volume == null) {
      this.volume = new ArrayList<>();
    }
    this.volume.add(volumeItem);
    return this;
  }

  /**
   * Get volume
   * @return volume
   */
  @javax.annotation.Nullable
  public List<String> getVolume() {
    return volume;
  }

  public void setVolume(List<String> volume) {
    this.volume = volume;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plugins plugins = (Plugins) o;
    return Objects.equals(this.authorization, plugins.authorization) &&
        Objects.equals(this.log, plugins.log) &&
        Objects.equals(this.network, plugins.network) &&
        Objects.equals(this.volume, plugins.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorization, log, network, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plugins {\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
    openapiFields.add("authorization");
    openapiFields.add("log");
    openapiFields.add("network");
    openapiFields.add("volume");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Plugins
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Plugins.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Plugins is not found in the empty JSON string", Plugins.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Plugins.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Plugins` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("authorization") != null && !jsonObj.get("authorization").isJsonNull() && !jsonObj.get("authorization").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization` to be an array in the JSON string but got `%s`", jsonObj.get("authorization").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("log") != null && !jsonObj.get("log").isJsonNull() && !jsonObj.get("log").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `log` to be an array in the JSON string but got `%s`", jsonObj.get("log").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull() && !jsonObj.get("network").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be an array in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("volume") != null && !jsonObj.get("volume").isJsonNull() && !jsonObj.get("volume").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume` to be an array in the JSON string but got `%s`", jsonObj.get("volume").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Plugins.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Plugins' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Plugins> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Plugins.class));

       return (TypeAdapter<T>) new TypeAdapter<Plugins>() {
           @Override
           public void write(JsonWriter out, Plugins value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Plugins read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Plugins given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Plugins
   * @throws IOException if the JSON string is invalid with respect to Plugins
   */
  public static Plugins fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Plugins.class);
  }

  /**
   * Convert an instance of Plugins to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
