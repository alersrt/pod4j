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
 * SystemDfVolumeReport describes a volume and its size
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T03:11:38.353612246+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class SystemDfVolumeReport implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Long links;

  public static final String SERIALIZED_NAME_RECLAIMABLE_SIZE = "ReclaimableSize";
  @SerializedName(SERIALIZED_NAME_RECLAIMABLE_SIZE)
  private Long reclaimableSize;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "VolumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;

  public SystemDfVolumeReport() {
  }

  public SystemDfVolumeReport links(Long links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @jakarta.annotation.Nullable

  public Long getLinks() {
    return links;
  }

  public void setLinks(Long links) {
    this.links = links;
  }


  public SystemDfVolumeReport reclaimableSize(Long reclaimableSize) {
    this.reclaimableSize = reclaimableSize;
    return this;
  }

  /**
   * Get reclaimableSize
   * @return reclaimableSize
   */
  @jakarta.annotation.Nullable

  public Long getReclaimableSize() {
    return reclaimableSize;
  }

  public void setReclaimableSize(Long reclaimableSize) {
    this.reclaimableSize = reclaimableSize;
  }


  public SystemDfVolumeReport size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @jakarta.annotation.Nullable

  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public SystemDfVolumeReport volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  /**
   * Get volumeName
   * @return volumeName
   */
  @jakarta.annotation.Nullable

  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemDfVolumeReport systemDfVolumeReport = (SystemDfVolumeReport) o;
    return Objects.equals(this.links, systemDfVolumeReport.links) &&
        Objects.equals(this.reclaimableSize, systemDfVolumeReport.reclaimableSize) &&
        Objects.equals(this.size, systemDfVolumeReport.size) &&
        Objects.equals(this.volumeName, systemDfVolumeReport.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, reclaimableSize, size, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDfVolumeReport {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    reclaimableSize: ").append(toIndentedString(reclaimableSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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
    openapiFields.add("Links");
    openapiFields.add("ReclaimableSize");
    openapiFields.add("Size");
    openapiFields.add("VolumeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SystemDfVolumeReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SystemDfVolumeReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SystemDfVolumeReport is not found in the empty JSON string", SystemDfVolumeReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SystemDfVolumeReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SystemDfVolumeReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("VolumeName") != null && !jsonObj.get("VolumeName").isJsonNull()) && !jsonObj.get("VolumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VolumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VolumeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SystemDfVolumeReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SystemDfVolumeReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SystemDfVolumeReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SystemDfVolumeReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SystemDfVolumeReport>() {
           @Override
           public void write(JsonWriter out, SystemDfVolumeReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SystemDfVolumeReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SystemDfVolumeReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SystemDfVolumeReport
   * @throws IOException if the JSON string is invalid with respect to SystemDfVolumeReport
   */
  public static SystemDfVolumeReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SystemDfVolumeReport.class);
  }

  /**
   * Convert an instance of SystemDfVolumeReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

