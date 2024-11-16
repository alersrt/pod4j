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


package org.openapitools.client.model;

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
import org.openapitools.client.model.ImagePropertiesSize;
import org.openapitools.client.model.Platform;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ImageProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T18:07:05.610979114+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class ImageProperties {
  public static final String SERIALIZED_NAME_CONTAINERS = "Containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<String> containers = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLATFORM = "Platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Platform platform;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private ImagePropertiesSize size;

  public ImageProperties() {
  }

  public ImageProperties containers(List<String> containers) {
    this.containers = containers;
    return this;
  }

  public ImageProperties addContainersItem(String containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

  /**
   * Containers is an array containing the IDs of the containers that are using this image.
   * @return containers
   */
  @javax.annotation.Nonnull
  public List<String> getContainers() {
    return containers;
  }

  public void setContainers(List<String> containers) {
    this.containers = containers;
  }


  public ImageProperties platform(Platform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  @javax.annotation.Nonnull
  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }


  public ImageProperties size(ImagePropertiesSize size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable
  public ImagePropertiesSize getSize() {
    return size;
  }

  public void setSize(ImagePropertiesSize size) {
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
    ImageProperties imageProperties = (ImageProperties) o;
    return Objects.equals(this.containers, imageProperties.containers) &&
        Objects.equals(this.platform, imageProperties.platform) &&
        Objects.equals(this.size, imageProperties.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, platform, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageProperties {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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
    openapiFields.add("Containers");
    openapiFields.add("Platform");
    openapiFields.add("Size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Containers");
    openapiRequiredFields.add("Platform");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImageProperties
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImageProperties.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImageProperties is not found in the empty JSON string", ImageProperties.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImageProperties.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImageProperties` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImageProperties.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("Containers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Containers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Containers` to be an array in the JSON string but got `%s`", jsonObj.get("Containers").toString()));
      }
      // validate the required field `Platform`
      Platform.validateJsonElement(jsonObj.get("Platform"));
      // validate the optional field `Size`
      if (jsonObj.get("Size") != null && !jsonObj.get("Size").isJsonNull()) {
        ImagePropertiesSize.validateJsonElement(jsonObj.get("Size"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImageProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImageProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImageProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImageProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<ImageProperties>() {
           @Override
           public void write(JsonWriter out, ImageProperties value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImageProperties read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImageProperties given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImageProperties
   * @throws IOException if the JSON string is invalid with respect to ImageProperties
   */
  public static ImageProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageProperties.class);
  }

  /**
   * Convert an instance of ImageProperties to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

