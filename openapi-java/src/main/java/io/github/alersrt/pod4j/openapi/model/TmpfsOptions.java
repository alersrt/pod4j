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
 * TmpfsOptions
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T22:01:10.352312929+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class TmpfsOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MODE = "Mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<List<String>> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_SIZE_BYTES = "SizeBytes";
  @SerializedName(SERIALIZED_NAME_SIZE_BYTES)
  private Long sizeBytes;

  public TmpfsOptions() {
  }

  public TmpfsOptions mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  /**
   * The bits have the same definition on all systems, so that information about files can be moved from one system to another portably. Not all bits apply to all systems. The only required bit is [ModeDir] for directories.
   * @return mode
   */
  @jakarta.annotation.Nullable

  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public TmpfsOptions options(List<List<String>> options) {
    this.options = options;
    return this;
  }

  public TmpfsOptions addOptionsItem(List<String> optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Options to be passed to the tmpfs mount. An array of arrays. Flag options should be provided as 1-length arrays. Other types should be provided as 2-length arrays, where the first item is the key and the second the value.
   * @return options
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<List<String>> getOptions() {
    return options;
  }

  public void setOptions(List<List<String>> options) {
    this.options = options;
  }


  public TmpfsOptions sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * Size sets the size of the tmpfs, in bytes.  This will be converted to an operating system specific value depending on the host. For example, on linux, it will be converted to use a &#39;k&#39;, &#39;m&#39; or &#39;g&#39; syntax. BSD, though not widely supported with docker, uses a straight byte value.  Percentages are not supported.
   * @return sizeBytes
   */
  @jakarta.annotation.Nullable

  public Long getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmpfsOptions tmpfsOptions = (TmpfsOptions) o;
    return Objects.equals(this.mode, tmpfsOptions.mode) &&
        Objects.equals(this.options, tmpfsOptions.options) &&
        Objects.equals(this.sizeBytes, tmpfsOptions.sizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, options, sizeBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmpfsOptions {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
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
    openapiFields.add("Mode");
    openapiFields.add("Options");
    openapiFields.add("SizeBytes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TmpfsOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TmpfsOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TmpfsOptions is not found in the empty JSON string", TmpfsOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TmpfsOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TmpfsOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Options") != null && !jsonObj.get("Options").isJsonNull() && !jsonObj.get("Options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Options` to be an array in the JSON string but got `%s`", jsonObj.get("Options").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TmpfsOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TmpfsOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TmpfsOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TmpfsOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<TmpfsOptions>() {
           @Override
           public void write(JsonWriter out, TmpfsOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TmpfsOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TmpfsOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TmpfsOptions
   * @throws IOException if the JSON string is invalid with respect to TmpfsOptions
   */
  public static TmpfsOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TmpfsOptions.class);
  }

  /**
   * Convert an instance of TmpfsOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

