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
import io.github.alersrt.pod4j.openapi.model.Platform;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * This structure provides &#x60;application/vnd.oci.descriptor.v1+json&#x60; mediatype when marshalled to JSON.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T02:16:23.826374396+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Descriptor implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = new HashMap<>();

  public static final String SERIALIZED_NAME_ARTIFACT_TYPE = "artifactType";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_TYPE)
  private String artifactType;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Integer> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_DIGEST = "digest";
  @SerializedName(SERIALIZED_NAME_DIGEST)
  private String digest;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "mediaType";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Platform platform;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<String> urls = new ArrayList<>();

  public Descriptor() {
  }

  public Descriptor annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public Descriptor putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Annotations contains arbitrary metadata relating to the targeted content.
   * @return annotations
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public Descriptor artifactType(String artifactType) {
    this.artifactType = artifactType;
    return this;
  }

  /**
   * ArtifactType is the IANA media type of this artifact.
   * @return artifactType
   */
  @jakarta.annotation.Nullable

  public String getArtifactType() {
    return artifactType;
  }

  public void setArtifactType(String artifactType) {
    this.artifactType = artifactType;
  }


  public Descriptor data(List<Integer> data) {
    this.data = data;
    return this;
  }

  public Descriptor addDataItem(Integer dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Data is an embedding of the targeted content. This is encoded as a base64 string when marshalled to JSON (automatically, by encoding/json). If present, Data can be used directly to avoid fetching the targeted content.
   * @return data
   */
  @jakarta.annotation.Nullable

  public List<Integer> getData() {
    return data;
  }

  public void setData(List<Integer> data) {
    this.data = data;
  }


  public Descriptor digest(String digest) {
    this.digest = digest;
    return this;
  }

  /**
   * The following is an example of the contents of Digest types:  sha256:7173b809ca12ec5dee4506cd86be934c4596dd234ee82c0662eac04a8c2c71dc  This allows to abstract the digest behind this type and work only in those terms.
   * @return digest
   */
  @jakarta.annotation.Nullable

  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }


  public Descriptor mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * MediaType is the media type of the object this schema refers to.
   * @return mediaType
   */
  @jakarta.annotation.Nullable

  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public Descriptor platform(Platform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  @jakarta.annotation.Nullable
  @Valid

  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }


  public Descriptor size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Size specifies the size in bytes of the blob.
   * @return size
   */
  @jakarta.annotation.Nullable

  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public Descriptor urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public Descriptor addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

  /**
   * URLs specifies a list of URLs from which this object MAY be downloaded
   * @return urls
   */
  @jakarta.annotation.Nullable

  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Descriptor descriptor = (Descriptor) o;
    return Objects.equals(this.annotations, descriptor.annotations) &&
        Objects.equals(this.artifactType, descriptor.artifactType) &&
        Objects.equals(this.data, descriptor.data) &&
        Objects.equals(this.digest, descriptor.digest) &&
        Objects.equals(this.mediaType, descriptor.mediaType) &&
        Objects.equals(this.platform, descriptor.platform) &&
        Objects.equals(this.size, descriptor.size) &&
        Objects.equals(this.urls, descriptor.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, artifactType, data, digest, mediaType, platform, size, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Descriptor {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
    openapiFields.add("annotations");
    openapiFields.add("artifactType");
    openapiFields.add("data");
    openapiFields.add("digest");
    openapiFields.add("mediaType");
    openapiFields.add("platform");
    openapiFields.add("size");
    openapiFields.add("urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Descriptor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Descriptor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Descriptor is not found in the empty JSON string", Descriptor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Descriptor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Descriptor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("artifactType") != null && !jsonObj.get("artifactType").isJsonNull()) && !jsonObj.get("artifactType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull() && !jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("digest") != null && !jsonObj.get("digest").isJsonNull()) && !jsonObj.get("digest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `digest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("digest").toString()));
      }
      if ((jsonObj.get("mediaType") != null && !jsonObj.get("mediaType").isJsonNull()) && !jsonObj.get("mediaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaType").toString()));
      }
      // validate the optional field `platform`
      if (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) {
        Platform.validateJsonElement(jsonObj.get("platform"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("urls") != null && !jsonObj.get("urls").isJsonNull() && !jsonObj.get("urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `urls` to be an array in the JSON string but got `%s`", jsonObj.get("urls").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Descriptor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Descriptor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Descriptor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Descriptor.class));

       return (TypeAdapter<T>) new TypeAdapter<Descriptor>() {
           @Override
           public void write(JsonWriter out, Descriptor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Descriptor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Descriptor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Descriptor
   * @throws IOException if the JSON string is invalid with respect to Descriptor
   */
  public static Descriptor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Descriptor.class);
  }

  /**
   * Convert an instance of Descriptor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

