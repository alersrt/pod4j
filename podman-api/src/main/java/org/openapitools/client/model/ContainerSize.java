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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ContainerSize holds the size of the container&#39;s root filesystem and top read-write layer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T16:02:35.210602253+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class ContainerSize {
  public static final String SERIALIZED_NAME_ROOT_FS_SIZE = "rootFsSize";
  @SerializedName(SERIALIZED_NAME_ROOT_FS_SIZE)
  private Long rootFsSize;

  public static final String SERIALIZED_NAME_RW_SIZE = "rwSize";
  @SerializedName(SERIALIZED_NAME_RW_SIZE)
  private Long rwSize;

  public ContainerSize() {
  }

  public ContainerSize rootFsSize(Long rootFsSize) {
    this.rootFsSize = rootFsSize;
    return this;
  }

  /**
   * Get rootFsSize
   * @return rootFsSize
   */
  @javax.annotation.Nullable
  public Long getRootFsSize() {
    return rootFsSize;
  }

  public void setRootFsSize(Long rootFsSize) {
    this.rootFsSize = rootFsSize;
  }


  public ContainerSize rwSize(Long rwSize) {
    this.rwSize = rwSize;
    return this;
  }

  /**
   * Get rwSize
   * @return rwSize
   */
  @javax.annotation.Nullable
  public Long getRwSize() {
    return rwSize;
  }

  public void setRwSize(Long rwSize) {
    this.rwSize = rwSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerSize containerSize = (ContainerSize) o;
    return Objects.equals(this.rootFsSize, containerSize.rootFsSize) &&
        Objects.equals(this.rwSize, containerSize.rwSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootFsSize, rwSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerSize {\n");
    sb.append("    rootFsSize: ").append(toIndentedString(rootFsSize)).append("\n");
    sb.append("    rwSize: ").append(toIndentedString(rwSize)).append("\n");
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
    openapiFields.add("rootFsSize");
    openapiFields.add("rwSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerSize
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerSize.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerSize is not found in the empty JSON string", ContainerSize.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerSize.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerSize` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerSize.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerSize' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerSize> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerSize.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerSize>() {
           @Override
           public void write(JsonWriter out, ContainerSize value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerSize read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerSize given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerSize
   * @throws IOException if the JSON string is invalid with respect to ContainerSize
   */
  public static ContainerSize fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerSize.class);
  }

  /**
   * Convert an instance of ContainerSize to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

