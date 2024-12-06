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
 * LibpodImageSummary
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T22:01:10.352312929+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class LibpodImageSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ARCH = "Arch";
  @SerializedName(SERIALIZED_NAME_ARCH)
  private String arch;

  public static final String SERIALIZED_NAME_CONTAINERS = "Containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Long containers;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_DANGLING = "Dangling";
  @SerializedName(SERIALIZED_NAME_DANGLING)
  private Boolean dangling;

  public static final String SERIALIZED_NAME_DIGEST = "Digest";
  @SerializedName(SERIALIZED_NAME_DIGEST)
  private String digest;

  public static final String SERIALIZED_NAME_HISTORY = "History";
  @SerializedName(SERIALIZED_NAME_HISTORY)
  private List<String> history = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_MANIFEST_LIST = "IsManifestList";
  @SerializedName(SERIALIZED_NAME_IS_MANIFEST_LIST)
  private Boolean isManifestList;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_NAMES = "Names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<String> names = new ArrayList<>();

  public static final String SERIALIZED_NAME_OS = "Os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_PARENT_ID = "ParentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_READ_ONLY = "ReadOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

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

  public static final String SERIALIZED_NAME_VIRTUAL_SIZE = "VirtualSize";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_SIZE)
  private Long virtualSize;

  public LibpodImageSummary() {
  }

  public LibpodImageSummary arch(String arch) {
    this.arch = arch;
    return this;
  }

  /**
   * Podman extensions
   * @return arch
   */
  @jakarta.annotation.Nullable

  public String getArch() {
    return arch;
  }

  public void setArch(String arch) {
    this.arch = arch;
  }


  public LibpodImageSummary containers(Long containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Get containers
   * @return containers
   */
  @jakarta.annotation.Nullable

  public Long getContainers() {
    return containers;
  }

  public void setContainers(Long containers) {
    this.containers = containers;
  }


  public LibpodImageSummary created(Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @jakarta.annotation.Nullable

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }


  public LibpodImageSummary dangling(Boolean dangling) {
    this.dangling = dangling;
    return this;
  }

  /**
   * Get dangling
   * @return dangling
   */
  @jakarta.annotation.Nullable

  public Boolean getDangling() {
    return dangling;
  }

  public void setDangling(Boolean dangling) {
    this.dangling = dangling;
  }


  public LibpodImageSummary digest(String digest) {
    this.digest = digest;
    return this;
  }

  /**
   * Get digest
   * @return digest
   */
  @jakarta.annotation.Nullable

  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }


  public LibpodImageSummary history(List<String> history) {
    this.history = history;
    return this;
  }

  public LibpodImageSummary addHistoryItem(String historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * Get history
   * @return history
   */
  @jakarta.annotation.Nullable

  public List<String> getHistory() {
    return history;
  }

  public void setHistory(List<String> history) {
    this.history = history;
  }


  public LibpodImageSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nullable

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public LibpodImageSummary isManifestList(Boolean isManifestList) {
    this.isManifestList = isManifestList;
    return this;
  }

  /**
   * IsManifestList is a ptr so we can distinguish between a true json empty response and false.  the docker compat side needs to return empty; where as the libpod side needs a value of true or false
   * @return isManifestList
   */
  @jakarta.annotation.Nullable

  public Boolean getIsManifestList() {
    return isManifestList;
  }

  public void setIsManifestList(Boolean isManifestList) {
    this.isManifestList = isManifestList;
  }


  public LibpodImageSummary labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public LibpodImageSummary putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public LibpodImageSummary names(List<String> names) {
    this.names = names;
    return this;
  }

  public LibpodImageSummary addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @jakarta.annotation.Nullable

  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }


  public LibpodImageSummary os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Get os
   * @return os
   */
  @jakarta.annotation.Nullable

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public LibpodImageSummary parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   */
  @jakarta.annotation.Nullable

  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public LibpodImageSummary readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Get readOnly
   * @return readOnly
   */
  @jakarta.annotation.Nullable

  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public LibpodImageSummary repoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
    return this;
  }

  public LibpodImageSummary addRepoDigestsItem(String repoDigestsItem) {
    if (this.repoDigests == null) {
      this.repoDigests = new ArrayList<>();
    }
    this.repoDigests.add(repoDigestsItem);
    return this;
  }

  /**
   * Get repoDigests
   * @return repoDigests
   */
  @jakarta.annotation.Nullable

  public List<String> getRepoDigests() {
    return repoDigests;
  }

  public void setRepoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
  }


  public LibpodImageSummary repoTags(List<String> repoTags) {
    this.repoTags = repoTags;
    return this;
  }

  public LibpodImageSummary addRepoTagsItem(String repoTagsItem) {
    if (this.repoTags == null) {
      this.repoTags = new ArrayList<>();
    }
    this.repoTags.add(repoTagsItem);
    return this;
  }

  /**
   * Get repoTags
   * @return repoTags
   */
  @jakarta.annotation.Nullable

  public List<String> getRepoTags() {
    return repoTags;
  }

  public void setRepoTags(List<String> repoTags) {
    this.repoTags = repoTags;
  }


  public LibpodImageSummary sharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
    return this;
  }

  /**
   * Get sharedSize
   * @return sharedSize
   */
  @jakarta.annotation.Nullable

  public Long getSharedSize() {
    return sharedSize;
  }

  public void setSharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
  }


  public LibpodImageSummary size(Long size) {
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


  public LibpodImageSummary virtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
    return this;
  }

  /**
   * Get virtualSize
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
    LibpodImageSummary libpodImageSummary = (LibpodImageSummary) o;
    return Objects.equals(this.arch, libpodImageSummary.arch) &&
        Objects.equals(this.containers, libpodImageSummary.containers) &&
        Objects.equals(this.created, libpodImageSummary.created) &&
        Objects.equals(this.dangling, libpodImageSummary.dangling) &&
        Objects.equals(this.digest, libpodImageSummary.digest) &&
        Objects.equals(this.history, libpodImageSummary.history) &&
        Objects.equals(this.id, libpodImageSummary.id) &&
        Objects.equals(this.isManifestList, libpodImageSummary.isManifestList) &&
        Objects.equals(this.labels, libpodImageSummary.labels) &&
        Objects.equals(this.names, libpodImageSummary.names) &&
        Objects.equals(this.os, libpodImageSummary.os) &&
        Objects.equals(this.parentId, libpodImageSummary.parentId) &&
        Objects.equals(this.readOnly, libpodImageSummary.readOnly) &&
        Objects.equals(this.repoDigests, libpodImageSummary.repoDigests) &&
        Objects.equals(this.repoTags, libpodImageSummary.repoTags) &&
        Objects.equals(this.sharedSize, libpodImageSummary.sharedSize) &&
        Objects.equals(this.size, libpodImageSummary.size) &&
        Objects.equals(this.virtualSize, libpodImageSummary.virtualSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arch, containers, created, dangling, digest, history, id, isManifestList, labels, names, os, parentId, readOnly, repoDigests, repoTags, sharedSize, size, virtualSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibpodImageSummary {\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    dangling: ").append(toIndentedString(dangling)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isManifestList: ").append(toIndentedString(isManifestList)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    repoDigests: ").append(toIndentedString(repoDigests)).append("\n");
    sb.append("    repoTags: ").append(toIndentedString(repoTags)).append("\n");
    sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("Arch");
    openapiFields.add("Containers");
    openapiFields.add("Created");
    openapiFields.add("Dangling");
    openapiFields.add("Digest");
    openapiFields.add("History");
    openapiFields.add("Id");
    openapiFields.add("IsManifestList");
    openapiFields.add("Labels");
    openapiFields.add("Names");
    openapiFields.add("Os");
    openapiFields.add("ParentId");
    openapiFields.add("ReadOnly");
    openapiFields.add("RepoDigests");
    openapiFields.add("RepoTags");
    openapiFields.add("SharedSize");
    openapiFields.add("Size");
    openapiFields.add("VirtualSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LibpodImageSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LibpodImageSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LibpodImageSummary is not found in the empty JSON string", LibpodImageSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LibpodImageSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LibpodImageSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Arch") != null && !jsonObj.get("Arch").isJsonNull()) && !jsonObj.get("Arch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Arch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Arch").toString()));
      }
      if ((jsonObj.get("Digest") != null && !jsonObj.get("Digest").isJsonNull()) && !jsonObj.get("Digest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Digest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Digest").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("History") != null && !jsonObj.get("History").isJsonNull() && !jsonObj.get("History").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `History` to be an array in the JSON string but got `%s`", jsonObj.get("History").toString()));
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Names") != null && !jsonObj.get("Names").isJsonNull() && !jsonObj.get("Names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Names` to be an array in the JSON string but got `%s`", jsonObj.get("Names").toString()));
      }
      if ((jsonObj.get("Os") != null && !jsonObj.get("Os").isJsonNull()) && !jsonObj.get("Os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Os").toString()));
      }
      if ((jsonObj.get("ParentId") != null && !jsonObj.get("ParentId").isJsonNull()) && !jsonObj.get("ParentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ParentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ParentId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("RepoDigests") != null && !jsonObj.get("RepoDigests").isJsonNull() && !jsonObj.get("RepoDigests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RepoDigests` to be an array in the JSON string but got `%s`", jsonObj.get("RepoDigests").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("RepoTags") != null && !jsonObj.get("RepoTags").isJsonNull() && !jsonObj.get("RepoTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RepoTags` to be an array in the JSON string but got `%s`", jsonObj.get("RepoTags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LibpodImageSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LibpodImageSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LibpodImageSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LibpodImageSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<LibpodImageSummary>() {
           @Override
           public void write(JsonWriter out, LibpodImageSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LibpodImageSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LibpodImageSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LibpodImageSummary
   * @throws IOException if the JSON string is invalid with respect to LibpodImageSummary
   */
  public static LibpodImageSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LibpodImageSummary.class);
  }

  /**
   * Convert an instance of LibpodImageSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

