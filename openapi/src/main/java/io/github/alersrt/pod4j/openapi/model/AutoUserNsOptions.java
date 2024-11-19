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
 * AutoUserNsOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class AutoUserNsOptions {
  public static final String SERIALIZED_NAME_ADDITIONAL_G_I_D_MAPPINGS = "AdditionalGIDMappings";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_G_I_D_MAPPINGS)
  private List<IDMap> additionalGIDMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_U_I_D_MAPPINGS = "AdditionalUIDMappings";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_U_I_D_MAPPINGS)
  private List<IDMap> additionalUIDMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUP_FILE = "GroupFile";
  @SerializedName(SERIALIZED_NAME_GROUP_FILE)
  private String groupFile;

  public static final String SERIALIZED_NAME_INITIAL_SIZE = "InitialSize";
  @SerializedName(SERIALIZED_NAME_INITIAL_SIZE)
  private Integer initialSize;

  public static final String SERIALIZED_NAME_PASSWD_FILE = "PasswdFile";
  @SerializedName(SERIALIZED_NAME_PASSWD_FILE)
  private String passwdFile;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public AutoUserNsOptions() {
  }

  public AutoUserNsOptions additionalGIDMappings(List<IDMap> additionalGIDMappings) {
    this.additionalGIDMappings = additionalGIDMappings;
    return this;
  }

  public AutoUserNsOptions addAdditionalGIDMappingsItem(IDMap additionalGIDMappingsItem) {
    if (this.additionalGIDMappings == null) {
      this.additionalGIDMappings = new ArrayList<>();
    }
    this.additionalGIDMappings.add(additionalGIDMappingsItem);
    return this;
  }

  /**
   * AdditionalGIDMappings specified additional GID mappings to include in the generated user namespace.
   * @return additionalGIDMappings
   */
  @javax.annotation.Nullable
  public List<IDMap> getAdditionalGIDMappings() {
    return additionalGIDMappings;
  }

  public void setAdditionalGIDMappings(List<IDMap> additionalGIDMappings) {
    this.additionalGIDMappings = additionalGIDMappings;
  }


  public AutoUserNsOptions additionalUIDMappings(List<IDMap> additionalUIDMappings) {
    this.additionalUIDMappings = additionalUIDMappings;
    return this;
  }

  public AutoUserNsOptions addAdditionalUIDMappingsItem(IDMap additionalUIDMappingsItem) {
    if (this.additionalUIDMappings == null) {
      this.additionalUIDMappings = new ArrayList<>();
    }
    this.additionalUIDMappings.add(additionalUIDMappingsItem);
    return this;
  }

  /**
   * AdditionalUIDMappings specified additional UID mappings to include in the generated user namespace.
   * @return additionalUIDMappings
   */
  @javax.annotation.Nullable
  public List<IDMap> getAdditionalUIDMappings() {
    return additionalUIDMappings;
  }

  public void setAdditionalUIDMappings(List<IDMap> additionalUIDMappings) {
    this.additionalUIDMappings = additionalUIDMappings;
  }


  public AutoUserNsOptions groupFile(String groupFile) {
    this.groupFile = groupFile;
    return this;
  }

  /**
   * GroupFile to use if the container uses a volume.
   * @return groupFile
   */
  @javax.annotation.Nullable
  public String getGroupFile() {
    return groupFile;
  }

  public void setGroupFile(String groupFile) {
    this.groupFile = groupFile;
  }


  public AutoUserNsOptions initialSize(Integer initialSize) {
    this.initialSize = initialSize;
    return this;
  }

  /**
   * InitialSize defines the minimum size for the user namespace. The created user namespace will have at least this size.
   * @return initialSize
   */
  @javax.annotation.Nullable
  public Integer getInitialSize() {
    return initialSize;
  }

  public void setInitialSize(Integer initialSize) {
    this.initialSize = initialSize;
  }


  public AutoUserNsOptions passwdFile(String passwdFile) {
    this.passwdFile = passwdFile;
    return this;
  }

  /**
   * PasswdFile to use if the container uses a volume.
   * @return passwdFile
   */
  @javax.annotation.Nullable
  public String getPasswdFile() {
    return passwdFile;
  }

  public void setPasswdFile(String passwdFile) {
    this.passwdFile = passwdFile;
  }


  public AutoUserNsOptions size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Size defines the size for the user namespace.  If it is set to a value bigger than 0, the user namespace will have exactly this size. If it is not set, some heuristics will be used to find its size.
   * @return size
   */
  @javax.annotation.Nullable
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoUserNsOptions autoUserNsOptions = (AutoUserNsOptions) o;
    return Objects.equals(this.additionalGIDMappings, autoUserNsOptions.additionalGIDMappings) &&
        Objects.equals(this.additionalUIDMappings, autoUserNsOptions.additionalUIDMappings) &&
        Objects.equals(this.groupFile, autoUserNsOptions.groupFile) &&
        Objects.equals(this.initialSize, autoUserNsOptions.initialSize) &&
        Objects.equals(this.passwdFile, autoUserNsOptions.passwdFile) &&
        Objects.equals(this.size, autoUserNsOptions.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalGIDMappings, additionalUIDMappings, groupFile, initialSize, passwdFile, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoUserNsOptions {\n");
    sb.append("    additionalGIDMappings: ").append(toIndentedString(additionalGIDMappings)).append("\n");
    sb.append("    additionalUIDMappings: ").append(toIndentedString(additionalUIDMappings)).append("\n");
    sb.append("    groupFile: ").append(toIndentedString(groupFile)).append("\n");
    sb.append("    initialSize: ").append(toIndentedString(initialSize)).append("\n");
    sb.append("    passwdFile: ").append(toIndentedString(passwdFile)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("AdditionalGIDMappings");
    openapiFields.add("AdditionalUIDMappings");
    openapiFields.add("GroupFile");
    openapiFields.add("InitialSize");
    openapiFields.add("PasswdFile");
    openapiFields.add("Size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AutoUserNsOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutoUserNsOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoUserNsOptions is not found in the empty JSON string", AutoUserNsOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AutoUserNsOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoUserNsOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("AdditionalGIDMappings") != null && !jsonObj.get("AdditionalGIDMappings").isJsonNull()) {
        JsonArray jsonArrayadditionalGIDMappings = jsonObj.getAsJsonArray("AdditionalGIDMappings");
        if (jsonArrayadditionalGIDMappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("AdditionalGIDMappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `AdditionalGIDMappings` to be an array in the JSON string but got `%s`", jsonObj.get("AdditionalGIDMappings").toString()));
          }

          // validate the optional field `AdditionalGIDMappings` (array)
          for (int i = 0; i < jsonArrayadditionalGIDMappings.size(); i++) {
            IDMap.validateJsonElement(jsonArrayadditionalGIDMappings.get(i));
          };
        }
      }
      if (jsonObj.get("AdditionalUIDMappings") != null && !jsonObj.get("AdditionalUIDMappings").isJsonNull()) {
        JsonArray jsonArrayadditionalUIDMappings = jsonObj.getAsJsonArray("AdditionalUIDMappings");
        if (jsonArrayadditionalUIDMappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("AdditionalUIDMappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `AdditionalUIDMappings` to be an array in the JSON string but got `%s`", jsonObj.get("AdditionalUIDMappings").toString()));
          }

          // validate the optional field `AdditionalUIDMappings` (array)
          for (int i = 0; i < jsonArrayadditionalUIDMappings.size(); i++) {
            IDMap.validateJsonElement(jsonArrayadditionalUIDMappings.get(i));
          };
        }
      }
      if ((jsonObj.get("GroupFile") != null && !jsonObj.get("GroupFile").isJsonNull()) && !jsonObj.get("GroupFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupFile").toString()));
      }
      if ((jsonObj.get("PasswdFile") != null && !jsonObj.get("PasswdFile").isJsonNull()) && !jsonObj.get("PasswdFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PasswdFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PasswdFile").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoUserNsOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoUserNsOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoUserNsOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoUserNsOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoUserNsOptions>() {
           @Override
           public void write(JsonWriter out, AutoUserNsOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoUserNsOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AutoUserNsOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AutoUserNsOptions
   * @throws IOException if the JSON string is invalid with respect to AutoUserNsOptions
   */
  public static AutoUserNsOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoUserNsOptions.class);
  }

  /**
   * Convert an instance of AutoUserNsOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

