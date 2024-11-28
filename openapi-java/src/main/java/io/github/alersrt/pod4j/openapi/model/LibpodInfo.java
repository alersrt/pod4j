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
import io.github.alersrt.pod4j.openapi.model.HostInfo;
import io.github.alersrt.pod4j.openapi.model.Plugins;
import io.github.alersrt.pod4j.openapi.model.StoreInfo;
import io.github.alersrt.pod4j.openapi.model.Version;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * Info is the overall struct that describes the host system running libpod/podman
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T15:23:24.636316917+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class LibpodInfo {
  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private HostInfo host;

  public static final String SERIALIZED_NAME_PLUGINS = "plugins";
  @SerializedName(SERIALIZED_NAME_PLUGINS)
  private Plugins plugins;

  public static final String SERIALIZED_NAME_REGISTRIES = "registries";
  @SerializedName(SERIALIZED_NAME_REGISTRIES)
  private Map<String, Object> registries = new HashMap<>();

  public static final String SERIALIZED_NAME_STORE = "store";
  @SerializedName(SERIALIZED_NAME_STORE)
  private StoreInfo store;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public LibpodInfo() {
  }

  public LibpodInfo host(HostInfo host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
   */
  @javax.annotation.Nullable
  public HostInfo getHost() {
    return host;
  }

  public void setHost(HostInfo host) {
    this.host = host;
  }


  public LibpodInfo plugins(Plugins plugins) {
    this.plugins = plugins;
    return this;
  }

  /**
   * Get plugins
   * @return plugins
   */
  @javax.annotation.Nullable
  public Plugins getPlugins() {
    return plugins;
  }

  public void setPlugins(Plugins plugins) {
    this.plugins = plugins;
  }


  public LibpodInfo registries(Map<String, Object> registries) {
    this.registries = registries;
    return this;
  }

  public LibpodInfo putRegistriesItem(String key, Object registriesItem) {
    if (this.registries == null) {
      this.registries = new HashMap<>();
    }
    this.registries.put(key, registriesItem);
    return this;
  }

  /**
   * Get registries
   * @return registries
   */
  @javax.annotation.Nullable
  public Map<String, Object> getRegistries() {
    return registries;
  }

  public void setRegistries(Map<String, Object> registries) {
    this.registries = registries;
  }


  public LibpodInfo store(StoreInfo store) {
    this.store = store;
    return this;
  }

  /**
   * Get store
   * @return store
   */
  @javax.annotation.Nullable
  public StoreInfo getStore() {
    return store;
  }

  public void setStore(StoreInfo store) {
    this.store = store;
  }


  public LibpodInfo version(Version version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibpodInfo libpodInfo = (LibpodInfo) o;
    return Objects.equals(this.host, libpodInfo.host) &&
        Objects.equals(this.plugins, libpodInfo.plugins) &&
        Objects.equals(this.registries, libpodInfo.registries) &&
        Objects.equals(this.store, libpodInfo.store) &&
        Objects.equals(this.version, libpodInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, plugins, registries, store, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibpodInfo {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    registries: ").append(toIndentedString(registries)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("host");
    openapiFields.add("plugins");
    openapiFields.add("registries");
    openapiFields.add("store");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LibpodInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LibpodInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LibpodInfo is not found in the empty JSON string", LibpodInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LibpodInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LibpodInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `host`
      if (jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) {
        HostInfo.validateJsonElement(jsonObj.get("host"));
      }
      // validate the optional field `plugins`
      if (jsonObj.get("plugins") != null && !jsonObj.get("plugins").isJsonNull()) {
        Plugins.validateJsonElement(jsonObj.get("plugins"));
      }
      // validate the optional field `store`
      if (jsonObj.get("store") != null && !jsonObj.get("store").isJsonNull()) {
        StoreInfo.validateJsonElement(jsonObj.get("store"));
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        Version.validateJsonElement(jsonObj.get("version"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LibpodInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LibpodInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LibpodInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LibpodInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<LibpodInfo>() {
           @Override
           public void write(JsonWriter out, LibpodInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LibpodInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LibpodInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LibpodInfo
   * @throws IOException if the JSON string is invalid with respect to LibpodInfo
   */
  public static LibpodInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LibpodInfo.class);
  }

  /**
   * Convert an instance of LibpodInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

