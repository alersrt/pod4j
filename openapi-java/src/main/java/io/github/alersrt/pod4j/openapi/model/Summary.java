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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.alersrt.pod4j.openapi.model.ManifestSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * Summary
 */
@JsonPropertyOrder({
  Summary.JSON_PROPERTY_CONTAINERS,
  Summary.JSON_PROPERTY_CREATED,
  Summary.JSON_PROPERTY_ID,
  Summary.JSON_PROPERTY_LABELS,
  Summary.JSON_PROPERTY_MANIFESTS,
  Summary.JSON_PROPERTY_PARENT_ID,
  Summary.JSON_PROPERTY_REPO_DIGESTS,
  Summary.JSON_PROPERTY_REPO_TAGS,
  Summary.JSON_PROPERTY_SHARED_SIZE,
  Summary.JSON_PROPERTY_SIZE,
  Summary.JSON_PROPERTY_VIRTUAL_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Summary {
  public static final String JSON_PROPERTY_CONTAINERS = "Containers";
  private Long containers;

  public static final String JSON_PROPERTY_CREATED = "Created";
  private Long created;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_LABELS = "Labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_MANIFESTS = "Manifests";
  private List<@Valid ManifestSummary> manifests = new ArrayList<>();

  public static final String JSON_PROPERTY_PARENT_ID = "ParentId";
  private String parentId;

  public static final String JSON_PROPERTY_REPO_DIGESTS = "RepoDigests";
  private List<String> repoDigests = new ArrayList<>();

  public static final String JSON_PROPERTY_REPO_TAGS = "RepoTags";
  private List<String> repoTags = new ArrayList<>();

  public static final String JSON_PROPERTY_SHARED_SIZE = "SharedSize";
  private Long sharedSize;

  public static final String JSON_PROPERTY_SIZE = "Size";
  private Long size;

  public static final String JSON_PROPERTY_VIRTUAL_SIZE = "VirtualSize";
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
  @javax.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_CONTAINERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getContainers() {
    return containers;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
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
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_MANIFESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid ManifestSummary> getManifests() {
    return manifests;
  }


  @JsonProperty(JSON_PROPERTY_MANIFESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManifests(List<@Valid ManifestSummary> manifests) {
    this.manifests = manifests;
  }


  public Summary parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry.
   * @return parentId
   */
  @javax.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_REPO_DIGESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRepoDigests() {
    return repoDigests;
  }


  @JsonProperty(JSON_PROPERTY_REPO_DIGESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_REPO_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRepoTags() {
    return repoTags;
  }


  @JsonProperty(JSON_PROPERTY_REPO_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_SHARED_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSharedSize() {
    return sharedSize;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(Long size) {
    this.size = size;
  }


  public Summary virtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
    return this;
  }

  /**
   * Total size of the image including all layers it is composed of.  Deprecated: this field is omitted in API v1.44, but kept for backward compatibility. Use Size instead.
   * @return virtualSize
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_VIRTUAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVirtualSize() {
    return virtualSize;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
  }


  /**
   * Return true if this Summary object is equal to o.
   */
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
        Objects.equals(this.manifests, summary.manifests) &&
        Objects.equals(this.parentId, summary.parentId) &&
        Objects.equals(this.repoDigests, summary.repoDigests) &&
        Objects.equals(this.repoTags, summary.repoTags) &&
        Objects.equals(this.sharedSize, summary.sharedSize) &&
        Objects.equals(this.size, summary.size) &&
        Objects.equals(this.virtualSize, summary.virtualSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, created, id, labels, manifests, parentId, repoDigests, repoTags, sharedSize, size, virtualSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `Containers` to the URL query string
    if (getContainers() != null) {
      joiner.add(String.format("%sContainers%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getContainers()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format("%sCreated%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Labels` to the URL query string
    if (getLabels() != null) {
      for (String _key : getLabels().keySet()) {
        joiner.add(String.format("%sLabels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getLabels().get(_key), URLEncoder.encode(ApiClient.valueToString(getLabels().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `Manifests` to the URL query string
    if (getManifests() != null) {
      for (int i = 0; i < getManifests().size(); i++) {
        if (getManifests().get(i) != null) {
          joiner.add(getManifests().get(i).toUrlQueryString(String.format("%sManifests%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `ParentId` to the URL query string
    if (getParentId() != null) {
      joiner.add(String.format("%sParentId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getParentId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `RepoDigests` to the URL query string
    if (getRepoDigests() != null) {
      for (int i = 0; i < getRepoDigests().size(); i++) {
        joiner.add(String.format("%sRepoDigests%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getRepoDigests().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `RepoTags` to the URL query string
    if (getRepoTags() != null) {
      for (int i = 0; i < getRepoTags().size(); i++) {
        joiner.add(String.format("%sRepoTags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getRepoTags().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `SharedSize` to the URL query string
    if (getSharedSize() != null) {
      joiner.add(String.format("%sSharedSize%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSharedSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%sSize%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `VirtualSize` to the URL query string
    if (getVirtualSize() != null) {
      joiner.add(String.format("%sVirtualSize%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getVirtualSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

