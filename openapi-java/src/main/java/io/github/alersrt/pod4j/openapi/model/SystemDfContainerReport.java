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
 * SystemDfContainerReport describes a container for use with df
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T22:01:10.352312929+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class SystemDfContainerReport implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COMMAND = "Command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTAINER_I_D = "ContainerID";
  @SerializedName(SERIALIZED_NAME_CONTAINER_I_D)
  private String containerID;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_IMAGE = "Image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_LOCAL_VOLUMES = "LocalVolumes";
  @SerializedName(SERIALIZED_NAME_LOCAL_VOLUMES)
  private Long localVolumes;

  public static final String SERIALIZED_NAME_NAMES = "Names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private String names;

  public static final String SERIALIZED_NAME_RW_SIZE = "RWSize";
  @SerializedName(SERIALIZED_NAME_RW_SIZE)
  private Long rwSize;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public SystemDfContainerReport() {
  }

  public SystemDfContainerReport command(List<String> command) {
    this.command = command;
    return this;
  }

  public SystemDfContainerReport addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

  /**
   * Get command
   * @return command
   */
  @jakarta.annotation.Nullable

  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }


  public SystemDfContainerReport containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  /**
   * Get containerID
   * @return containerID
   */
  @jakarta.annotation.Nullable

  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }


  public SystemDfContainerReport created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @jakarta.annotation.Nullable
  @Valid

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public SystemDfContainerReport image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @jakarta.annotation.Nullable

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public SystemDfContainerReport localVolumes(Long localVolumes) {
    this.localVolumes = localVolumes;
    return this;
  }

  /**
   * Get localVolumes
   * @return localVolumes
   */
  @jakarta.annotation.Nullable

  public Long getLocalVolumes() {
    return localVolumes;
  }

  public void setLocalVolumes(Long localVolumes) {
    this.localVolumes = localVolumes;
  }


  public SystemDfContainerReport names(String names) {
    this.names = names;
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @jakarta.annotation.Nullable

  public String getNames() {
    return names;
  }

  public void setNames(String names) {
    this.names = names;
  }


  public SystemDfContainerReport rwSize(Long rwSize) {
    this.rwSize = rwSize;
    return this;
  }

  /**
   * Get rwSize
   * @return rwSize
   */
  @jakarta.annotation.Nullable

  public Long getRwSize() {
    return rwSize;
  }

  public void setRwSize(Long rwSize) {
    this.rwSize = rwSize;
  }


  public SystemDfContainerReport size(Long size) {
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


  public SystemDfContainerReport status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @jakarta.annotation.Nullable

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemDfContainerReport systemDfContainerReport = (SystemDfContainerReport) o;
    return Objects.equals(this.command, systemDfContainerReport.command) &&
        Objects.equals(this.containerID, systemDfContainerReport.containerID) &&
        Objects.equals(this.created, systemDfContainerReport.created) &&
        Objects.equals(this.image, systemDfContainerReport.image) &&
        Objects.equals(this.localVolumes, systemDfContainerReport.localVolumes) &&
        Objects.equals(this.names, systemDfContainerReport.names) &&
        Objects.equals(this.rwSize, systemDfContainerReport.rwSize) &&
        Objects.equals(this.size, systemDfContainerReport.size) &&
        Objects.equals(this.status, systemDfContainerReport.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, containerID, created, image, localVolumes, names, rwSize, size, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDfContainerReport {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    localVolumes: ").append(toIndentedString(localVolumes)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    rwSize: ").append(toIndentedString(rwSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("Command");
    openapiFields.add("ContainerID");
    openapiFields.add("Created");
    openapiFields.add("Image");
    openapiFields.add("LocalVolumes");
    openapiFields.add("Names");
    openapiFields.add("RWSize");
    openapiFields.add("Size");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SystemDfContainerReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SystemDfContainerReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SystemDfContainerReport is not found in the empty JSON string", SystemDfContainerReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SystemDfContainerReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SystemDfContainerReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Command") != null && !jsonObj.get("Command").isJsonNull() && !jsonObj.get("Command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Command` to be an array in the JSON string but got `%s`", jsonObj.get("Command").toString()));
      }
      if ((jsonObj.get("ContainerID") != null && !jsonObj.get("ContainerID").isJsonNull()) && !jsonObj.get("ContainerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ContainerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ContainerID").toString()));
      }
      if ((jsonObj.get("Image") != null && !jsonObj.get("Image").isJsonNull()) && !jsonObj.get("Image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Image").toString()));
      }
      if ((jsonObj.get("Names") != null && !jsonObj.get("Names").isJsonNull()) && !jsonObj.get("Names").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Names` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Names").toString()));
      }
      if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SystemDfContainerReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SystemDfContainerReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SystemDfContainerReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SystemDfContainerReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SystemDfContainerReport>() {
           @Override
           public void write(JsonWriter out, SystemDfContainerReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SystemDfContainerReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SystemDfContainerReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SystemDfContainerReport
   * @throws IOException if the JSON string is invalid with respect to SystemDfContainerReport
   */
  public static SystemDfContainerReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SystemDfContainerReport.class);
  }

  /**
   * Convert an instance of SystemDfContainerReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

