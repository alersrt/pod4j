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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.alersrt.pod4j.openapi.ApiClient;
import jakarta.validation.constraints.NotNull;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
/**
 * HistoryResponseItem individual image layer information in response to ImageHistory operation
 */
@JsonPropertyOrder({
  HistoryResponseItem.JSON_PROPERTY_COMMENT,
  HistoryResponseItem.JSON_PROPERTY_CREATED,
  HistoryResponseItem.JSON_PROPERTY_CREATED_BY,
  HistoryResponseItem.JSON_PROPERTY_ID,
  HistoryResponseItem.JSON_PROPERTY_SIZE,
  HistoryResponseItem.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class HistoryResponseItem {
  public static final String JSON_PROPERTY_COMMENT = "Comment";
  private String comment;

  public static final String JSON_PROPERTY_CREATED = "Created";
  private Long created;

  public static final String JSON_PROPERTY_CREATED_BY = "CreatedBy";
  private String createdBy;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_SIZE = "Size";
  private Long size;

  public static final String JSON_PROPERTY_TAGS = "Tags";
  private List<String> tags = new ArrayList<>();

  public HistoryResponseItem() { 
  }

  public HistoryResponseItem comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * comment
   * @return comment
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public HistoryResponseItem created(Long created) {
    this.created = created;
    return this;
  }

  /**
   * created
   * @return created
   */
  @jakarta.annotation.Nonnull
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


  public HistoryResponseItem createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * created by
   * @return createdBy
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public HistoryResponseItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id
   * @return id
   */
  @jakarta.annotation.Nonnull
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


  public HistoryResponseItem size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * size
   * @return size
   */
  @jakarta.annotation.Nonnull
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


  public HistoryResponseItem tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public HistoryResponseItem addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * tags
   * @return tags
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  /**
   * Return true if this HistoryResponseItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryResponseItem historyResponseItem = (HistoryResponseItem) o;
    return Objects.equals(this.comment, historyResponseItem.comment) &&
        Objects.equals(this.created, historyResponseItem.created) &&
        Objects.equals(this.createdBy, historyResponseItem.createdBy) &&
        Objects.equals(this.id, historyResponseItem.id) &&
        Objects.equals(this.size, historyResponseItem.size) &&
        Objects.equals(this.tags, historyResponseItem.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, created, createdBy, id, size, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryResponseItem {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

    // add `Comment` to the URL query string
    if (getComment() != null) {
      joiner.add(String.format("%sComment%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getComment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format("%sCreated%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `CreatedBy` to the URL query string
    if (getCreatedBy() != null) {
      joiner.add(String.format("%sCreatedBy%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreatedBy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%sSize%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Tags` to the URL query string
    if (getTags() != null) {
      for (int i = 0; i < getTags().size(); i++) {
        joiner.add(String.format("%sTags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getTags().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

