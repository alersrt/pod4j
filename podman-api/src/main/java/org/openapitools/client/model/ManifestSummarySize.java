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
 * Size is the size information of the content related to this manifest. Note: These sizes only take the locally available content into account.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T16:02:35.210602253+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class ManifestSummarySize {
  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Long content;

  public static final String SERIALIZED_NAME_TOTAL = "Total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public ManifestSummarySize() {
  }

  public ManifestSummarySize content(Long content) {
    this.content = content;
    return this;
  }

  /**
   * Content is the size (in bytes) of all the locally present content in the content store (e.g. image config, layers) referenced by this manifest and its children. This only includes blobs in the content store.
   * @return content
   */
  @javax.annotation.Nullable
  public Long getContent() {
    return content;
  }

  public void setContent(Long content) {
    this.content = content;
  }


  public ManifestSummarySize total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Total is the total size (in bytes) of all the locally present data (both distributable and non-distributable) that&#39;s related to this manifest and its children. This equal to the sum of [Content] size AND all the sizes in the [Size] struct present in the Kind-specific data struct. For example, for an image kind (Kind &#x3D;&#x3D; ManifestKindImage), this would include the size of the image content and unpacked image snapshots ([Size.Content] + [ImageData.Size.Unpacked]).
   * @return total
   */
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestSummarySize manifestSummarySize = (ManifestSummarySize) o;
    return Objects.equals(this.content, manifestSummarySize.content) &&
        Objects.equals(this.total, manifestSummarySize.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestSummarySize {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("Content");
    openapiFields.add("Total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ManifestSummarySize
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ManifestSummarySize.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManifestSummarySize is not found in the empty JSON string", ManifestSummarySize.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ManifestSummarySize.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ManifestSummarySize` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManifestSummarySize.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManifestSummarySize' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManifestSummarySize> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManifestSummarySize.class));

       return (TypeAdapter<T>) new TypeAdapter<ManifestSummarySize>() {
           @Override
           public void write(JsonWriter out, ManifestSummarySize value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManifestSummarySize read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ManifestSummarySize given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ManifestSummarySize
   * @throws IOException if the JSON string is invalid with respect to ManifestSummarySize
   */
  public static ManifestSummarySize fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManifestSummarySize.class);
  }

  /**
   * Convert an instance of ManifestSummarySize to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

