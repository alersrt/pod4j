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
import io.github.alersrt.pod4j.openapi.model.AutoUserNsOptions;
import io.github.alersrt.pod4j.openapi.model.IDMap;
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
 * IDMappingOptions are used for specifying how ID mapping should be set up for a layer or container.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T19:32:04.765618819+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class IDMappingOptions {
  public static final String SERIALIZED_NAME_AUTO_USER_NS = "AutoUserNs";
  @SerializedName(SERIALIZED_NAME_AUTO_USER_NS)
  private Boolean autoUserNs;

  public static final String SERIALIZED_NAME_AUTO_USER_NS_OPTS = "AutoUserNsOpts";
  @SerializedName(SERIALIZED_NAME_AUTO_USER_NS_OPTS)
  private AutoUserNsOptions autoUserNsOpts;

  public static final String SERIALIZED_NAME_GI_D_MAP = "GIDMap";
  @SerializedName(SERIALIZED_NAME_GI_D_MAP)
  private List<IDMap> giDMap = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOST_G_I_D_MAPPING = "HostGIDMapping";
  @SerializedName(SERIALIZED_NAME_HOST_G_I_D_MAPPING)
  private Boolean hostGIDMapping;

  public static final String SERIALIZED_NAME_HOST_U_I_D_MAPPING = "HostUIDMapping";
  @SerializedName(SERIALIZED_NAME_HOST_U_I_D_MAPPING)
  private Boolean hostUIDMapping;

  public static final String SERIALIZED_NAME_UI_D_MAP = "UIDMap";
  @SerializedName(SERIALIZED_NAME_UI_D_MAP)
  private List<IDMap> uiDMap = new ArrayList<>();

  public IDMappingOptions() {
  }

  public IDMappingOptions autoUserNs(Boolean autoUserNs) {
    this.autoUserNs = autoUserNs;
    return this;
  }

  /**
   * Get autoUserNs
   * @return autoUserNs
   */
  @javax.annotation.Nullable
  public Boolean getAutoUserNs() {
    return autoUserNs;
  }

  public void setAutoUserNs(Boolean autoUserNs) {
    this.autoUserNs = autoUserNs;
  }


  public IDMappingOptions autoUserNsOpts(AutoUserNsOptions autoUserNsOpts) {
    this.autoUserNsOpts = autoUserNsOpts;
    return this;
  }

  /**
   * Get autoUserNsOpts
   * @return autoUserNsOpts
   */
  @javax.annotation.Nullable
  public AutoUserNsOptions getAutoUserNsOpts() {
    return autoUserNsOpts;
  }

  public void setAutoUserNsOpts(AutoUserNsOptions autoUserNsOpts) {
    this.autoUserNsOpts = autoUserNsOpts;
  }


  public IDMappingOptions giDMap(List<IDMap> giDMap) {
    this.giDMap = giDMap;
    return this;
  }

  public IDMappingOptions addGiDMapItem(IDMap giDMapItem) {
    if (this.giDMap == null) {
      this.giDMap = new ArrayList<>();
    }
    this.giDMap.add(giDMapItem);
    return this;
  }

  /**
   * Get giDMap
   * @return giDMap
   */
  @javax.annotation.Nullable
  public List<IDMap> getGiDMap() {
    return giDMap;
  }

  public void setGiDMap(List<IDMap> giDMap) {
    this.giDMap = giDMap;
  }


  public IDMappingOptions hostGIDMapping(Boolean hostGIDMapping) {
    this.hostGIDMapping = hostGIDMapping;
    return this;
  }

  /**
   * Get hostGIDMapping
   * @return hostGIDMapping
   */
  @javax.annotation.Nullable
  public Boolean getHostGIDMapping() {
    return hostGIDMapping;
  }

  public void setHostGIDMapping(Boolean hostGIDMapping) {
    this.hostGIDMapping = hostGIDMapping;
  }


  public IDMappingOptions hostUIDMapping(Boolean hostUIDMapping) {
    this.hostUIDMapping = hostUIDMapping;
    return this;
  }

  /**
   * UIDMap and GIDMap are used for setting up a layer&#39;s root filesystem for use inside of a user namespace where ID mapping is being used. If HostUIDMapping/HostGIDMapping is true, no mapping of the respective type will be used.  Otherwise, if UIDMap and/or GIDMap contain at least one mapping, one or both will be used.  By default, if neither of those conditions apply, if the layer has a parent layer, the parent layer&#39;s mapping will be used, and if it does not have a parent layer, the mapping which was passed to the Store object when it was initialized will be used.
   * @return hostUIDMapping
   */
  @javax.annotation.Nullable
  public Boolean getHostUIDMapping() {
    return hostUIDMapping;
  }

  public void setHostUIDMapping(Boolean hostUIDMapping) {
    this.hostUIDMapping = hostUIDMapping;
  }


  public IDMappingOptions uiDMap(List<IDMap> uiDMap) {
    this.uiDMap = uiDMap;
    return this;
  }

  public IDMappingOptions addUiDMapItem(IDMap uiDMapItem) {
    if (this.uiDMap == null) {
      this.uiDMap = new ArrayList<>();
    }
    this.uiDMap.add(uiDMapItem);
    return this;
  }

  /**
   * Get uiDMap
   * @return uiDMap
   */
  @javax.annotation.Nullable
  public List<IDMap> getUiDMap() {
    return uiDMap;
  }

  public void setUiDMap(List<IDMap> uiDMap) {
    this.uiDMap = uiDMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IDMappingOptions idMappingOptions = (IDMappingOptions) o;
    return Objects.equals(this.autoUserNs, idMappingOptions.autoUserNs) &&
        Objects.equals(this.autoUserNsOpts, idMappingOptions.autoUserNsOpts) &&
        Objects.equals(this.giDMap, idMappingOptions.giDMap) &&
        Objects.equals(this.hostGIDMapping, idMappingOptions.hostGIDMapping) &&
        Objects.equals(this.hostUIDMapping, idMappingOptions.hostUIDMapping) &&
        Objects.equals(this.uiDMap, idMappingOptions.uiDMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoUserNs, autoUserNsOpts, giDMap, hostGIDMapping, hostUIDMapping, uiDMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IDMappingOptions {\n");
    sb.append("    autoUserNs: ").append(toIndentedString(autoUserNs)).append("\n");
    sb.append("    autoUserNsOpts: ").append(toIndentedString(autoUserNsOpts)).append("\n");
    sb.append("    giDMap: ").append(toIndentedString(giDMap)).append("\n");
    sb.append("    hostGIDMapping: ").append(toIndentedString(hostGIDMapping)).append("\n");
    sb.append("    hostUIDMapping: ").append(toIndentedString(hostUIDMapping)).append("\n");
    sb.append("    uiDMap: ").append(toIndentedString(uiDMap)).append("\n");
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
    openapiFields.add("AutoUserNs");
    openapiFields.add("AutoUserNsOpts");
    openapiFields.add("GIDMap");
    openapiFields.add("HostGIDMapping");
    openapiFields.add("HostUIDMapping");
    openapiFields.add("UIDMap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IDMappingOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IDMappingOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IDMappingOptions is not found in the empty JSON string", IDMappingOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IDMappingOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IDMappingOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AutoUserNsOpts`
      if (jsonObj.get("AutoUserNsOpts") != null && !jsonObj.get("AutoUserNsOpts").isJsonNull()) {
        AutoUserNsOptions.validateJsonElement(jsonObj.get("AutoUserNsOpts"));
      }
      if (jsonObj.get("GIDMap") != null && !jsonObj.get("GIDMap").isJsonNull()) {
        JsonArray jsonArraygiDMap = jsonObj.getAsJsonArray("GIDMap");
        if (jsonArraygiDMap != null) {
          // ensure the json data is an array
          if (!jsonObj.get("GIDMap").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `GIDMap` to be an array in the JSON string but got `%s`", jsonObj.get("GIDMap").toString()));
          }

          // validate the optional field `GIDMap` (array)
          for (int i = 0; i < jsonArraygiDMap.size(); i++) {
            IDMap.validateJsonElement(jsonArraygiDMap.get(i));
          };
        }
      }
      if (jsonObj.get("UIDMap") != null && !jsonObj.get("UIDMap").isJsonNull()) {
        JsonArray jsonArrayuiDMap = jsonObj.getAsJsonArray("UIDMap");
        if (jsonArrayuiDMap != null) {
          // ensure the json data is an array
          if (!jsonObj.get("UIDMap").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `UIDMap` to be an array in the JSON string but got `%s`", jsonObj.get("UIDMap").toString()));
          }

          // validate the optional field `UIDMap` (array)
          for (int i = 0; i < jsonArrayuiDMap.size(); i++) {
            IDMap.validateJsonElement(jsonArrayuiDMap.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IDMappingOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IDMappingOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IDMappingOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IDMappingOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<IDMappingOptions>() {
           @Override
           public void write(JsonWriter out, IDMappingOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IDMappingOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IDMappingOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IDMappingOptions
   * @throws IOException if the JSON string is invalid with respect to IDMappingOptions
   */
  public static IDMappingOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IDMappingOptions.class);
  }

  /**
   * Convert an instance of IDMappingOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

