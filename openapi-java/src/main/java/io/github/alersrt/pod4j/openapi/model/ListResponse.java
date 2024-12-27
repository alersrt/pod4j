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
import io.github.alersrt.pod4j.openapi.model.Volume;
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
 * Volume list response
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T23:15:58.977038016+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ListResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VOLUMES = "Volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<@Valid Volume> volumes = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "Warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<String> warnings = new ArrayList<>();

  public ListResponse() {
  }

  public ListResponse volumes(List<@Valid Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public ListResponse addVolumesItem(Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * List of volumes
   * @return volumes
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<@Valid Volume> volumes) {
    this.volumes = volumes;
  }


  public ListResponse warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ListResponse addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Warnings that occurred when fetching the list of volumes.
   * @return warnings
   */
  @jakarta.annotation.Nullable

  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResponse listResponse = (ListResponse) o;
    return Objects.equals(this.volumes, listResponse.volumes) &&
        Objects.equals(this.warnings, listResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumes, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResponse {\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("Volumes");
    openapiFields.add("Warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListResponse is not found in the empty JSON string", ListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Volumes") != null && !jsonObj.get("Volumes").isJsonNull()) {
        JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("Volumes");
        if (jsonArrayvolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Volumes` to be an array in the JSON string but got `%s`", jsonObj.get("Volumes").toString()));
          }

          // validate the optional field `Volumes` (array)
          for (int i = 0; i < jsonArrayvolumes.size(); i++) {
            Volume.validateJsonElement(jsonArrayvolumes.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Warnings") != null && !jsonObj.get("Warnings").isJsonNull() && !jsonObj.get("Warnings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Warnings` to be an array in the JSON string but got `%s`", jsonObj.get("Warnings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListResponse>() {
           @Override
           public void write(JsonWriter out, ListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListResponse
   * @throws IOException if the JSON string is invalid with respect to ListResponse
   */
  public static ListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListResponse.class);
  }

  /**
   * Convert an instance of ListResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

