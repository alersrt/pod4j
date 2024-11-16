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
import io.github.alersrt.pod4j.openapi.model.Config;
import io.github.alersrt.pod4j.openapi.model.GraphDriverData;
import io.github.alersrt.pod4j.openapi.model.Metadata;
import io.github.alersrt.pod4j.openapi.model.RootFS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ImageInspect
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T19:12:58.552824144+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ImageInspect {
  public static final String SERIALIZED_NAME_ARCHITECTURE = "Architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private String architecture;

  public static final String SERIALIZED_NAME_AUTHOR = "Author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CONFIG = "Config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Config config;

  public static final String SERIALIZED_NAME_CONTAINER = "Container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private String container;

  public static final String SERIALIZED_NAME_CONTAINER_CONFIG = "ContainerConfig";
  @SerializedName(SERIALIZED_NAME_CONTAINER_CONFIG)
  private Config containerConfig;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_DOCKER_VERSION = "DockerVersion";
  @SerializedName(SERIALIZED_NAME_DOCKER_VERSION)
  private String dockerVersion;

  public static final String SERIALIZED_NAME_GRAPH_DRIVER = "GraphDriver";
  @SerializedName(SERIALIZED_NAME_GRAPH_DRIVER)
  private GraphDriverData graphDriver;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_METADATA = "Metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Metadata metadata;

  public static final String SERIALIZED_NAME_OS = "Os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_OS_VERSION = "OsVersion";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_PARENT = "Parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent;

  public static final String SERIALIZED_NAME_REPO_DIGESTS = "RepoDigests";
  @SerializedName(SERIALIZED_NAME_REPO_DIGESTS)
  private List<String> repoDigests = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPO_TAGS = "RepoTags";
  @SerializedName(SERIALIZED_NAME_REPO_TAGS)
  private List<String> repoTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROOT_F_S = "RootFS";
  @SerializedName(SERIALIZED_NAME_ROOT_F_S)
  private RootFS rootFS;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_VARIANT = "Variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private String variant;

  public static final String SERIALIZED_NAME_VIRTUAL_SIZE = "VirtualSize";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_SIZE)
  private Long virtualSize;

  public ImageInspect() {
  }

  public ImageInspect architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Architecture is the hardware CPU architecture that the image runs on.
   * @return architecture
   */
  @javax.annotation.Nullable
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }


  public ImageInspect author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Author is the name of the author that was specified when committing the image, or as specified through MAINTAINER (deprecated) in the Dockerfile.
   * @return author
   */
  @javax.annotation.Nullable
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public ImageInspect comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Comment is an optional message that can be set when committing or importing the image.
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public ImageInspect config(Config config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @javax.annotation.Nullable
  public Config getConfig() {
    return config;
  }

  public void setConfig(Config config) {
    this.config = config;
  }


  public ImageInspect container(String container) {
    this.container = container;
    return this;
  }

  /**
   * Container is for backwards compat but is basically unused
   * @return container
   */
  @javax.annotation.Nullable
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }


  public ImageInspect containerConfig(Config containerConfig) {
    this.containerConfig = containerConfig;
    return this;
  }

  /**
   * Get containerConfig
   * @return containerConfig
   */
  @javax.annotation.Nullable
  public Config getContainerConfig() {
    return containerConfig;
  }

  public void setContainerConfig(Config containerConfig) {
    this.containerConfig = containerConfig;
  }


  public ImageInspect created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Created is the date and time at which the image was created, formatted in RFC 3339 nano-seconds (time.RFC3339Nano).  This information is only available if present in the image, and omitted otherwise.
   * @return created
   */
  @javax.annotation.Nullable
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }


  public ImageInspect dockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
    return this;
  }

  /**
   * DockerVersion is the version of Docker that was used to build the image.  Depending on how the image was created, this field may be empty.
   * @return dockerVersion
   */
  @javax.annotation.Nullable
  public String getDockerVersion() {
    return dockerVersion;
  }

  public void setDockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
  }


  public ImageInspect graphDriver(GraphDriverData graphDriver) {
    this.graphDriver = graphDriver;
    return this;
  }

  /**
   * Get graphDriver
   * @return graphDriver
   */
  @javax.annotation.Nullable
  public GraphDriverData getGraphDriver() {
    return graphDriver;
  }

  public void setGraphDriver(GraphDriverData graphDriver) {
    this.graphDriver = graphDriver;
  }


  public ImageInspect id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID is the content-addressable ID of an image.  This identifier is a content-addressable digest calculated from the image&#39;s configuration (which includes the digests of layers used by the image).  Note that this digest differs from the &#x60;RepoDigests&#x60; below, which holds digests of image manifests that reference the image.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ImageInspect metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }


  public ImageInspect os(String os) {
    this.os = os;
    return this;
  }

  /**
   * OS is the Operating System the image is built to run on.
   * @return os
   */
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public ImageInspect osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * OsVersion is the version of the Operating System the image is built to run on (especially for Windows).
   * @return osVersion
   */
  @javax.annotation.Nullable
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public ImageInspect parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Parent is the ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry.
   * @return parent
   */
  @javax.annotation.Nullable
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }


  public ImageInspect repoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
    return this;
  }

  public ImageInspect addRepoDigestsItem(String repoDigestsItem) {
    if (this.repoDigests == null) {
      this.repoDigests = new ArrayList<>();
    }
    this.repoDigests.add(repoDigestsItem);
    return this;
  }

  /**
   * RepoDigests is a list of content-addressable digests of locally available image manifests that the image is referenced from. Multiple manifests can refer to the same image.  These digests are usually only available if the image was either pulled from a registry, or if the image was pushed to a registry, which is when the manifest is generated and its digest calculated.
   * @return repoDigests
   */
  @javax.annotation.Nullable
  public List<String> getRepoDigests() {
    return repoDigests;
  }

  public void setRepoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
  }


  public ImageInspect repoTags(List<String> repoTags) {
    this.repoTags = repoTags;
    return this;
  }

  public ImageInspect addRepoTagsItem(String repoTagsItem) {
    if (this.repoTags == null) {
      this.repoTags = new ArrayList<>();
    }
    this.repoTags.add(repoTagsItem);
    return this;
  }

  /**
   * RepoTags is a list of image names/tags in the local image cache that reference this image.  Multiple image tags can refer to the same image, and this list may be empty if no tags reference the image, in which case the image is \&quot;untagged\&quot;, in which case it can still be referenced by its ID.
   * @return repoTags
   */
  @javax.annotation.Nullable
  public List<String> getRepoTags() {
    return repoTags;
  }

  public void setRepoTags(List<String> repoTags) {
    this.repoTags = repoTags;
  }


  public ImageInspect rootFS(RootFS rootFS) {
    this.rootFS = rootFS;
    return this;
  }

  /**
   * Get rootFS
   * @return rootFS
   */
  @javax.annotation.Nullable
  public RootFS getRootFS() {
    return rootFS;
  }

  public void setRootFS(RootFS rootFS) {
    this.rootFS = rootFS;
  }


  public ImageInspect size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Size is the total size of the image including all layers it is composed of.
   * @return size
   */
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public ImageInspect variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Variant is the CPU architecture variant (presently ARM-only).
   * @return variant
   */
  @javax.annotation.Nullable
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }


  public ImageInspect virtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
    return this;
  }

  /**
   * VirtualSize is the total size of the image including all layers it is composed of.  Deprecated: this field is omitted in API v1.44, but kept for backward compatibility. Use Size instead.
   * @return virtualSize
   */
  @javax.annotation.Nullable
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
    ImageInspect imageInspect = (ImageInspect) o;
    return Objects.equals(this.architecture, imageInspect.architecture) &&
        Objects.equals(this.author, imageInspect.author) &&
        Objects.equals(this.comment, imageInspect.comment) &&
        Objects.equals(this.config, imageInspect.config) &&
        Objects.equals(this.container, imageInspect.container) &&
        Objects.equals(this.containerConfig, imageInspect.containerConfig) &&
        Objects.equals(this.created, imageInspect.created) &&
        Objects.equals(this.dockerVersion, imageInspect.dockerVersion) &&
        Objects.equals(this.graphDriver, imageInspect.graphDriver) &&
        Objects.equals(this.id, imageInspect.id) &&
        Objects.equals(this.metadata, imageInspect.metadata) &&
        Objects.equals(this.os, imageInspect.os) &&
        Objects.equals(this.osVersion, imageInspect.osVersion) &&
        Objects.equals(this.parent, imageInspect.parent) &&
        Objects.equals(this.repoDigests, imageInspect.repoDigests) &&
        Objects.equals(this.repoTags, imageInspect.repoTags) &&
        Objects.equals(this.rootFS, imageInspect.rootFS) &&
        Objects.equals(this.size, imageInspect.size) &&
        Objects.equals(this.variant, imageInspect.variant) &&
        Objects.equals(this.virtualSize, imageInspect.virtualSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, author, comment, config, container, containerConfig, created, dockerVersion, graphDriver, id, metadata, os, osVersion, parent, repoDigests, repoTags, rootFS, size, variant, virtualSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageInspect {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    containerConfig: ").append(toIndentedString(containerConfig)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    dockerVersion: ").append(toIndentedString(dockerVersion)).append("\n");
    sb.append("    graphDriver: ").append(toIndentedString(graphDriver)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    repoDigests: ").append(toIndentedString(repoDigests)).append("\n");
    sb.append("    repoTags: ").append(toIndentedString(repoTags)).append("\n");
    sb.append("    rootFS: ").append(toIndentedString(rootFS)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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
    openapiFields.add("Architecture");
    openapiFields.add("Author");
    openapiFields.add("Comment");
    openapiFields.add("Config");
    openapiFields.add("Container");
    openapiFields.add("ContainerConfig");
    openapiFields.add("Created");
    openapiFields.add("DockerVersion");
    openapiFields.add("GraphDriver");
    openapiFields.add("Id");
    openapiFields.add("Metadata");
    openapiFields.add("Os");
    openapiFields.add("OsVersion");
    openapiFields.add("Parent");
    openapiFields.add("RepoDigests");
    openapiFields.add("RepoTags");
    openapiFields.add("RootFS");
    openapiFields.add("Size");
    openapiFields.add("Variant");
    openapiFields.add("VirtualSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImageInspect
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImageInspect.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImageInspect is not found in the empty JSON string", ImageInspect.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImageInspect.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImageInspect` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Architecture") != null && !jsonObj.get("Architecture").isJsonNull()) && !jsonObj.get("Architecture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Architecture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Architecture").toString()));
      }
      if ((jsonObj.get("Author") != null && !jsonObj.get("Author").isJsonNull()) && !jsonObj.get("Author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Author").toString()));
      }
      if ((jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull()) && !jsonObj.get("Comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Comment").toString()));
      }
      // validate the optional field `Config`
      if (jsonObj.get("Config") != null && !jsonObj.get("Config").isJsonNull()) {
        Config.validateJsonElement(jsonObj.get("Config"));
      }
      if ((jsonObj.get("Container") != null && !jsonObj.get("Container").isJsonNull()) && !jsonObj.get("Container").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Container` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Container").toString()));
      }
      // validate the optional field `ContainerConfig`
      if (jsonObj.get("ContainerConfig") != null && !jsonObj.get("ContainerConfig").isJsonNull()) {
        Config.validateJsonElement(jsonObj.get("ContainerConfig"));
      }
      if ((jsonObj.get("Created") != null && !jsonObj.get("Created").isJsonNull()) && !jsonObj.get("Created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Created").toString()));
      }
      if ((jsonObj.get("DockerVersion") != null && !jsonObj.get("DockerVersion").isJsonNull()) && !jsonObj.get("DockerVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DockerVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DockerVersion").toString()));
      }
      // validate the optional field `GraphDriver`
      if (jsonObj.get("GraphDriver") != null && !jsonObj.get("GraphDriver").isJsonNull()) {
        GraphDriverData.validateJsonElement(jsonObj.get("GraphDriver"));
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      // validate the optional field `Metadata`
      if (jsonObj.get("Metadata") != null && !jsonObj.get("Metadata").isJsonNull()) {
        Metadata.validateJsonElement(jsonObj.get("Metadata"));
      }
      if ((jsonObj.get("Os") != null && !jsonObj.get("Os").isJsonNull()) && !jsonObj.get("Os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Os").toString()));
      }
      if ((jsonObj.get("OsVersion") != null && !jsonObj.get("OsVersion").isJsonNull()) && !jsonObj.get("OsVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OsVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OsVersion").toString()));
      }
      if ((jsonObj.get("Parent") != null && !jsonObj.get("Parent").isJsonNull()) && !jsonObj.get("Parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Parent").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("RepoDigests") != null && !jsonObj.get("RepoDigests").isJsonNull() && !jsonObj.get("RepoDigests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RepoDigests` to be an array in the JSON string but got `%s`", jsonObj.get("RepoDigests").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("RepoTags") != null && !jsonObj.get("RepoTags").isJsonNull() && !jsonObj.get("RepoTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RepoTags` to be an array in the JSON string but got `%s`", jsonObj.get("RepoTags").toString()));
      }
      // validate the optional field `RootFS`
      if (jsonObj.get("RootFS") != null && !jsonObj.get("RootFS").isJsonNull()) {
        RootFS.validateJsonElement(jsonObj.get("RootFS"));
      }
      if ((jsonObj.get("Variant") != null && !jsonObj.get("Variant").isJsonNull()) && !jsonObj.get("Variant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Variant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Variant").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImageInspect.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImageInspect' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImageInspect> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImageInspect.class));

       return (TypeAdapter<T>) new TypeAdapter<ImageInspect>() {
           @Override
           public void write(JsonWriter out, ImageInspect value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImageInspect read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImageInspect given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImageInspect
   * @throws IOException if the JSON string is invalid with respect to ImageInspect
   */
  public static ImageInspect fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageInspect.class);
  }

  /**
   * Convert an instance of ImageInspect to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

