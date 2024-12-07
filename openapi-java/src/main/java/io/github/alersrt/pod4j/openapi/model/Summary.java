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
import io.github.alersrt.pod4j.openapi.model.ManifestSummary;
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
 * Summary
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T22:01:10.352312929+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Summary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTAINERS = "Containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Long containers;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_PARENT_ID = "ParentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_REPO_DIGESTS = "RepoDigests";
  @SerializedName(SERIALIZED_NAME_REPO_DIGESTS)
  private List<String> repoDigests = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPO_TAGS = "RepoTags";
  @SerializedName(SERIALIZED_NAME_REPO_TAGS)
  private List<String> repoTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHARED_SIZE = "SharedSize";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
  private Long sharedSize;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_MANIFESTS = "Manifests";
  @SerializedName(SERIALIZED_NAME_MANIFESTS)
  private List<@Valid ManifestSummary> manifests = new ArrayList<>();

  public static final String SERIALIZED_NAME_VIRTUAL_SIZE = "VirtualSize";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_SIZE)
  private Long virtualSize;

  public Summary() {
  }

  public Summary containers(Long containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Number of containers using this image. Includes both stopped and running containers.  This size is not calculated by default, and depends on which API endpoint is used. &#x60;-1&#x60; indicates that the value has not been set / calculated.
   * @return containers
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public Long getContainers() {
    return containers;
  }

  public void setContainers(Long containers) {
    this.containers = containers;
  }


  public Summary created(Long created) {
    this.created = created;
    return this;
  }

  /**
   * Date and time at which the image was created as a Unix timestamp (number of seconds since EPOCH).
   * @return created
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }


  public Summary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID is the content-addressable ID of an image.  This identifier is a content-addressable digest calculated from the image&#39;s configuration (which includes the digests of layers used by the image).  Note that this digest differs from the &#x60;RepoDigests&#x60; below, which holds digests of image manifests that reference the image.
   * @return id
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Summary labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Summary putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public Summary parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry.
   * @return parentId
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public Summary repoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
    return this;
  }

  public Summary addRepoDigestsItem(String repoDigestsItem) {
    if (this.repoDigests == null) {
      this.repoDigests = new ArrayList<>();
    }
    this.repoDigests.add(repoDigestsItem);
    return this;
  }

  /**
   * List of content-addressable digests of locally available image manifests that the image is referenced from. Multiple manifests can refer to the same image.  These digests are usually only available if the image was either pulled from a registry, or if the image was pushed to a registry, which is when the manifest is generated and its digest calculated.
   * @return repoDigests
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public List<String> getRepoDigests() {
    return repoDigests;
  }

  public void setRepoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
  }


  public Summary repoTags(List<String> repoTags) {
    this.repoTags = repoTags;
    return this;
  }

  public Summary addRepoTagsItem(String repoTagsItem) {
    if (this.repoTags == null) {
      this.repoTags = new ArrayList<>();
    }
    this.repoTags.add(repoTagsItem);
    return this;
  }

  /**
   * List of image names/tags in the local image cache that reference this image.  Multiple image tags can refer to the same image, and this list may be empty if no tags reference the image, in which case the image is \&quot;untagged\&quot;, in which case it can still be referenced by its ID.
   * @return repoTags
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public List<String> getRepoTags() {
    return repoTags;
  }

  public void setRepoTags(List<String> repoTags) {
    this.repoTags = repoTags;
  }


  public Summary sharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
    return this;
  }

  /**
   * Total size of image layers that are shared between this image and other images.  This size is not calculated by default. &#x60;-1&#x60; indicates that the value has not been set / calculated.
   * @return sharedSize
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public Long getSharedSize() {
    return sharedSize;
  }

  public void setSharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
  }


  public Summary size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Total size of the image including all layers it is composed of.
   * @return size
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public Summary manifests(List<@Valid ManifestSummary> manifests) {
    this.manifests = manifests;
    return this;
  }

  public Summary addManifestsItem(ManifestSummary manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new ArrayList<>();
    }
    this.manifests.add(manifestsItem);
    return this;
  }

  /**
   * Manifests is a list of image manifests available in this image.  It provides a more detailed view of the platform-specific image manifests or other image-attached data like build attestations.  WARNING: This is experimental and may change at any time without any backward compatibility.
   * @return manifests
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid ManifestSummary> getManifests() {
    return manifests;
  }

  public void setManifests(List<@Valid ManifestSummary> manifests) {
    this.manifests = manifests;
  }


  public Summary virtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
    return this;
  }

  /**
   * Total size of the image including all layers it is composed of.  Deprecated: this field is omitted in API v1.44, but kept for backward compatibility. Use Size instead.
   * @return virtualSize
   */
  @jakarta.annotation.Nullable

  public Long getVirtualSize() {
    return virtualSize;
  }

  public void setVirtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Summary summary = (Summary) o;
    return Objects.equals(this.containers, summary.containers) &&
        Objects.equals(this.created, summary.created) &&
        Objects.equals(this.id, summary.id) &&
        Objects.equals(this.labels, summary.labels) &&
        Objects.equals(this.parentId, summary.parentId) &&
        Objects.equals(this.repoDigests, summary.repoDigests) &&
        Objects.equals(this.repoTags, summary.repoTags) &&
        Objects.equals(this.sharedSize, summary.sharedSize) &&
        Objects.equals(this.size, summary.size) &&
        Objects.equals(this.manifests, summary.manifests) &&
        Objects.equals(this.virtualSize, summary.virtualSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, created, id, labels, parentId, repoDigests, repoTags, sharedSize, size, manifests, virtualSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    repoDigests: ").append(toIndentedString(repoDigests)).append("\n");
    sb.append("    repoTags: ").append(toIndentedString(repoTags)).append("\n");
    sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    virtualSize: ").append(toIndentedString(virtualSize)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("Labels");
    openapiFields.add("ParentId");
    openapiFields.add("RepoDigests");
    openapiFields.add("RepoTags");
    openapiFields.add("SharedSize");
    openapiFields.add("Size");
    openapiFields.add("Manifests");
    openapiFields.add("VirtualSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Containers");
    openapiRequiredFields.add("Created");
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Labels");
    openapiRequiredFields.add("ParentId");
    openapiRequiredFields.add("RepoDigests");
    openapiRequiredFields.add("RepoTags");
    openapiRequiredFields.add("SharedSize");
    openapiRequiredFields.add("Size");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Summary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Summary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Summary is not found in the empty JSON string", Summary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Summary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Summary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Summary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if (!jsonObj.get("ParentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ParentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ParentId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("RepoDigests") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("RepoDigests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RepoDigests` to be an array in the JSON string but got `%s`", jsonObj.get("RepoDigests").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("RepoTags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("RepoTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RepoTags` to be an array in the JSON string but got `%s`", jsonObj.get("RepoTags").toString()));
      }
      if (jsonObj.get("Manifests") != null && !jsonObj.get("Manifests").isJsonNull()) {
        JsonArray jsonArraymanifests = jsonObj.getAsJsonArray("Manifests");
        if (jsonArraymanifests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Manifests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Manifests` to be an array in the JSON string but got `%s`", jsonObj.get("Manifests").toString()));
          }

          // validate the optional field `Manifests` (array)
          for (int i = 0; i < jsonArraymanifests.size(); i++) {
            ManifestSummary.validateJsonElement(jsonArraymanifests.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Summary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Summary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Summary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Summary.class));

       return (TypeAdapter<T>) new TypeAdapter<Summary>() {
           @Override
           public void write(JsonWriter out, Summary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Summary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Summary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Summary
   * @throws IOException if the JSON string is invalid with respect to Summary
   */
  public static Summary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Summary.class);
  }

  /**
   * Convert an instance of Summary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

