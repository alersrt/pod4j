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
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * SystemDfImageReport describes an image for use with df
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T19:12:58.552824144+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class SystemDfImageReport {
  public static final String SERIALIZED_NAME_CONTAINERS = "Containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Long containers;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_IMAGE_I_D = "ImageID";
  @SerializedName(SERIALIZED_NAME_IMAGE_I_D)
  private String imageID;

  public static final String SERIALIZED_NAME_REPOSITORY = "Repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_SHARED_SIZE = "SharedSize";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
  private Long sharedSize;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_TAG = "Tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE = "UniqueSize";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
  private Long uniqueSize;

  public SystemDfImageReport() {
  }

  public SystemDfImageReport containers(Long containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Get containers
   * @return containers
   */
  @javax.annotation.Nullable
  public Long getContainers() {
    return containers;
  }

  public void setContainers(Long containers) {
    this.containers = containers;
  }


  public SystemDfImageReport created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public SystemDfImageReport imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

  /**
   * Get imageID
   * @return imageID
   */
  @javax.annotation.Nullable
  public String getImageID() {
    return imageID;
  }

  public void setImageID(String imageID) {
    this.imageID = imageID;
  }


  public SystemDfImageReport repository(String repository) {
    this.repository = repository;
    return this;
  }

  /**
   * Get repository
   * @return repository
   */
  @javax.annotation.Nullable
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }


  public SystemDfImageReport sharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
    return this;
  }

  /**
   * Get sharedSize
   * @return sharedSize
   */
  @javax.annotation.Nullable
  public Long getSharedSize() {
    return sharedSize;
  }

  public void setSharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
  }


  public SystemDfImageReport size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public SystemDfImageReport tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public SystemDfImageReport uniqueSize(Long uniqueSize) {
    this.uniqueSize = uniqueSize;
    return this;
  }

  /**
   * Get uniqueSize
   * @return uniqueSize
   */
  @javax.annotation.Nullable
  public Long getUniqueSize() {
    return uniqueSize;
  }

  public void setUniqueSize(Long uniqueSize) {
    this.uniqueSize = uniqueSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemDfImageReport systemDfImageReport = (SystemDfImageReport) o;
    return Objects.equals(this.containers, systemDfImageReport.containers) &&
        Objects.equals(this.created, systemDfImageReport.created) &&
        Objects.equals(this.imageID, systemDfImageReport.imageID) &&
        Objects.equals(this.repository, systemDfImageReport.repository) &&
        Objects.equals(this.sharedSize, systemDfImageReport.sharedSize) &&
        Objects.equals(this.size, systemDfImageReport.size) &&
        Objects.equals(this.tag, systemDfImageReport.tag) &&
        Objects.equals(this.uniqueSize, systemDfImageReport.uniqueSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, created, imageID, repository, sharedSize, size, tag, uniqueSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDfImageReport {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
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
    openapiFields.add("Containers");
    openapiFields.add("Created");
    openapiFields.add("ImageID");
    openapiFields.add("Repository");
    openapiFields.add("SharedSize");
    openapiFields.add("Size");
    openapiFields.add("Tag");
    openapiFields.add("UniqueSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SystemDfImageReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SystemDfImageReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SystemDfImageReport is not found in the empty JSON string", SystemDfImageReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SystemDfImageReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SystemDfImageReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ImageID") != null && !jsonObj.get("ImageID").isJsonNull()) && !jsonObj.get("ImageID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ImageID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ImageID").toString()));
      }
      if ((jsonObj.get("Repository") != null && !jsonObj.get("Repository").isJsonNull()) && !jsonObj.get("Repository").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Repository` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Repository").toString()));
      }
      if ((jsonObj.get("Tag") != null && !jsonObj.get("Tag").isJsonNull()) && !jsonObj.get("Tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SystemDfImageReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SystemDfImageReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SystemDfImageReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SystemDfImageReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SystemDfImageReport>() {
           @Override
           public void write(JsonWriter out, SystemDfImageReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SystemDfImageReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SystemDfImageReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SystemDfImageReport
   * @throws IOException if the JSON string is invalid with respect to SystemDfImageReport
   */
  public static SystemDfImageReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SystemDfImageReport.class);
  }

  /**
   * Convert an instance of SystemDfImageReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

