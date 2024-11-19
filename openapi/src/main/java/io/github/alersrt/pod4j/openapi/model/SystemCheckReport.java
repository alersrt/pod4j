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
import java.util.HashMap;
import java.util.List;
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
 * SystemCheckReport provides a report of what a storage consistency check found, and if we removed anything that was damaged, what we removed.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class SystemCheckReport {
  public static final String SERIALIZED_NAME_CONTAINERS = "Containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Map<String, List<String>> containers = new HashMap<>();

  public static final String SERIALIZED_NAME_ERRORS = "Errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Boolean errors;

  public static final String SERIALIZED_NAME_IMAGES = "Images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private Map<String, List<String>> images = new HashMap<>();

  public static final String SERIALIZED_NAME_LAYERS = "Layers";
  @SerializedName(SERIALIZED_NAME_LAYERS)
  private Map<String, List<String>> layers = new HashMap<>();

  public static final String SERIALIZED_NAME_RO_IMAGES = "ROImages";
  @SerializedName(SERIALIZED_NAME_RO_IMAGES)
  private Map<String, List<String>> roImages = new HashMap<>();

  public static final String SERIALIZED_NAME_RO_LAYERS = "ROLayers";
  @SerializedName(SERIALIZED_NAME_RO_LAYERS)
  private Map<String, List<String>> roLayers = new HashMap<>();

  public static final String SERIALIZED_NAME_REMOVED_CONTAINERS = "RemovedContainers";
  @SerializedName(SERIALIZED_NAME_REMOVED_CONTAINERS)
  private Map<String, String> removedContainers = new HashMap<>();

  public static final String SERIALIZED_NAME_REMOVED_IMAGES = "RemovedImages";
  @SerializedName(SERIALIZED_NAME_REMOVED_IMAGES)
  private Map<String, List<String>> removedImages = new HashMap<>();

  public static final String SERIALIZED_NAME_REMOVED_LAYERS = "RemovedLayers";
  @SerializedName(SERIALIZED_NAME_REMOVED_LAYERS)
  private List<String> removedLayers = new ArrayList<>();

  public SystemCheckReport() {
  }

  public SystemCheckReport containers(Map<String, List<String>> containers) {
    this.containers = containers;
    return this;
  }

  public SystemCheckReport putContainersItem(String key, List<String> containersItem) {
    if (this.containers == null) {
      this.containers = new HashMap<>();
    }
    this.containers.put(key, containersItem);
    return this;
  }

  /**
   * Get containers
   * @return containers
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getContainers() {
    return containers;
  }

  public void setContainers(Map<String, List<String>> containers) {
    this.containers = containers;
  }


  public SystemCheckReport errors(Boolean errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @javax.annotation.Nullable
  public Boolean getErrors() {
    return errors;
  }

  public void setErrors(Boolean errors) {
    this.errors = errors;
  }


  public SystemCheckReport images(Map<String, List<String>> images) {
    this.images = images;
    return this;
  }

  public SystemCheckReport putImagesItem(String key, List<String> imagesItem) {
    if (this.images == null) {
      this.images = new HashMap<>();
    }
    this.images.put(key, imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getImages() {
    return images;
  }

  public void setImages(Map<String, List<String>> images) {
    this.images = images;
  }


  public SystemCheckReport layers(Map<String, List<String>> layers) {
    this.layers = layers;
    return this;
  }

  public SystemCheckReport putLayersItem(String key, List<String> layersItem) {
    if (this.layers == null) {
      this.layers = new HashMap<>();
    }
    this.layers.put(key, layersItem);
    return this;
  }

  /**
   * Get layers
   * @return layers
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getLayers() {
    return layers;
  }

  public void setLayers(Map<String, List<String>> layers) {
    this.layers = layers;
  }


  public SystemCheckReport roImages(Map<String, List<String>> roImages) {
    this.roImages = roImages;
    return this;
  }

  public SystemCheckReport putRoImagesItem(String key, List<String> roImagesItem) {
    if (this.roImages == null) {
      this.roImages = new HashMap<>();
    }
    this.roImages.put(key, roImagesItem);
    return this;
  }

  /**
   * Get roImages
   * @return roImages
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getRoImages() {
    return roImages;
  }

  public void setRoImages(Map<String, List<String>> roImages) {
    this.roImages = roImages;
  }


  public SystemCheckReport roLayers(Map<String, List<String>> roLayers) {
    this.roLayers = roLayers;
    return this;
  }

  public SystemCheckReport putRoLayersItem(String key, List<String> roLayersItem) {
    if (this.roLayers == null) {
      this.roLayers = new HashMap<>();
    }
    this.roLayers.put(key, roLayersItem);
    return this;
  }

  /**
   * Get roLayers
   * @return roLayers
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getRoLayers() {
    return roLayers;
  }

  public void setRoLayers(Map<String, List<String>> roLayers) {
    this.roLayers = roLayers;
  }


  public SystemCheckReport removedContainers(Map<String, String> removedContainers) {
    this.removedContainers = removedContainers;
    return this;
  }

  public SystemCheckReport putRemovedContainersItem(String key, String removedContainersItem) {
    if (this.removedContainers == null) {
      this.removedContainers = new HashMap<>();
    }
    this.removedContainers.put(key, removedContainersItem);
    return this;
  }

  /**
   * Get removedContainers
   * @return removedContainers
   */
  @javax.annotation.Nullable
  public Map<String, String> getRemovedContainers() {
    return removedContainers;
  }

  public void setRemovedContainers(Map<String, String> removedContainers) {
    this.removedContainers = removedContainers;
  }


  public SystemCheckReport removedImages(Map<String, List<String>> removedImages) {
    this.removedImages = removedImages;
    return this;
  }

  public SystemCheckReport putRemovedImagesItem(String key, List<String> removedImagesItem) {
    if (this.removedImages == null) {
      this.removedImages = new HashMap<>();
    }
    this.removedImages.put(key, removedImagesItem);
    return this;
  }

  /**
   * Get removedImages
   * @return removedImages
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getRemovedImages() {
    return removedImages;
  }

  public void setRemovedImages(Map<String, List<String>> removedImages) {
    this.removedImages = removedImages;
  }


  public SystemCheckReport removedLayers(List<String> removedLayers) {
    this.removedLayers = removedLayers;
    return this;
  }

  public SystemCheckReport addRemovedLayersItem(String removedLayersItem) {
    if (this.removedLayers == null) {
      this.removedLayers = new ArrayList<>();
    }
    this.removedLayers.add(removedLayersItem);
    return this;
  }

  /**
   * Get removedLayers
   * @return removedLayers
   */
  @javax.annotation.Nullable
  public List<String> getRemovedLayers() {
    return removedLayers;
  }

  public void setRemovedLayers(List<String> removedLayers) {
    this.removedLayers = removedLayers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemCheckReport systemCheckReport = (SystemCheckReport) o;
    return Objects.equals(this.containers, systemCheckReport.containers) &&
        Objects.equals(this.errors, systemCheckReport.errors) &&
        Objects.equals(this.images, systemCheckReport.images) &&
        Objects.equals(this.layers, systemCheckReport.layers) &&
        Objects.equals(this.roImages, systemCheckReport.roImages) &&
        Objects.equals(this.roLayers, systemCheckReport.roLayers) &&
        Objects.equals(this.removedContainers, systemCheckReport.removedContainers) &&
        Objects.equals(this.removedImages, systemCheckReport.removedImages) &&
        Objects.equals(this.removedLayers, systemCheckReport.removedLayers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, errors, images, layers, roImages, roLayers, removedContainers, removedImages, removedLayers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemCheckReport {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    roImages: ").append(toIndentedString(roImages)).append("\n");
    sb.append("    roLayers: ").append(toIndentedString(roLayers)).append("\n");
    sb.append("    removedContainers: ").append(toIndentedString(removedContainers)).append("\n");
    sb.append("    removedImages: ").append(toIndentedString(removedImages)).append("\n");
    sb.append("    removedLayers: ").append(toIndentedString(removedLayers)).append("\n");
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
    openapiFields.add("Errors");
    openapiFields.add("Images");
    openapiFields.add("Layers");
    openapiFields.add("ROImages");
    openapiFields.add("ROLayers");
    openapiFields.add("RemovedContainers");
    openapiFields.add("RemovedImages");
    openapiFields.add("RemovedLayers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SystemCheckReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SystemCheckReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SystemCheckReport is not found in the empty JSON string", SystemCheckReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SystemCheckReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SystemCheckReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("RemovedLayers") != null && !jsonObj.get("RemovedLayers").isJsonNull() && !jsonObj.get("RemovedLayers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RemovedLayers` to be an array in the JSON string but got `%s`", jsonObj.get("RemovedLayers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SystemCheckReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SystemCheckReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SystemCheckReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SystemCheckReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SystemCheckReport>() {
           @Override
           public void write(JsonWriter out, SystemCheckReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SystemCheckReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SystemCheckReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SystemCheckReport
   * @throws IOException if the JSON string is invalid with respect to SystemCheckReport
   */
  public static SystemCheckReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SystemCheckReport.class);
  }

  /**
   * Convert an instance of SystemCheckReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

