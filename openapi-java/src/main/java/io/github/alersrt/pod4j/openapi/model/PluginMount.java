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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * PluginMount plugin mount
 */
@JsonPropertyOrder({
  PluginMount.JSON_PROPERTY_DESCRIPTION,
  PluginMount.JSON_PROPERTY_DESTINATION,
  PluginMount.JSON_PROPERTY_NAME,
  PluginMount.JSON_PROPERTY_OPTIONS,
  PluginMount.JSON_PROPERTY_SETTABLE,
  PluginMount.JSON_PROPERTY_SOURCE,
  PluginMount.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class PluginMount {
  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_DESTINATION = "Destination";
  private String destination;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "Options";
  private List<String> options = new ArrayList<>();

  public static final String JSON_PROPERTY_SETTABLE = "Settable";
  private List<String> settable = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCE = "Source";
  private String source;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private String type;

  public PluginMount() { 
  }

  public PluginMount description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description
   * @return description
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PluginMount destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * destination
   * @return destination
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDestination() {
    return destination;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestination(String destination) {
    this.destination = destination;
  }


  public PluginMount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name
   * @return name
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public PluginMount options(List<String> options) {
    this.options = options;
    return this;
  }

  public PluginMount addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * options
   * @return options
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOptions(List<String> options) {
    this.options = options;
  }


  public PluginMount settable(List<String> settable) {
    this.settable = settable;
    return this;
  }

  public PluginMount addSettableItem(String settableItem) {
    if (this.settable == null) {
      this.settable = new ArrayList<>();
    }
    this.settable.add(settableItem);
    return this;
  }

  /**
   * settable
   * @return settable
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_SETTABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSettable() {
    return settable;
  }


  @JsonProperty(JSON_PROPERTY_SETTABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSettable(List<String> settable) {
    this.settable = settable;
  }


  public PluginMount source(String source) {
    this.source = source;
    return this;
  }

  /**
   * source
   * @return source
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSource(String source) {
    this.source = source;
  }


  public PluginMount type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type
   * @return type
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this PluginMount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginMount pluginMount = (PluginMount) o;
    return Objects.equals(this.description, pluginMount.description) &&
        Objects.equals(this.destination, pluginMount.destination) &&
        Objects.equals(this.name, pluginMount.name) &&
        Objects.equals(this.options, pluginMount.options) &&
        Objects.equals(this.settable, pluginMount.settable) &&
        Objects.equals(this.source, pluginMount.source) &&
        Objects.equals(this.type, pluginMount.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, destination, name, options, settable, source, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginMount {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    settable: ").append(toIndentedString(settable)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `Description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sDescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Destination` to the URL query string
    if (getDestination() != null) {
      joiner.add(String.format("%sDestination%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDestination()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Options` to the URL query string
    if (getOptions() != null) {
      for (int i = 0; i < getOptions().size(); i++) {
        joiner.add(String.format("%sOptions%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getOptions().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `Settable` to the URL query string
    if (getSettable() != null) {
      for (int i = 0; i < getSettable().size(); i++) {
        joiner.add(String.format("%sSettable%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getSettable().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `Source` to the URL query string
    if (getSource() != null) {
      joiner.add(String.format("%sSource%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSource()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%sType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

