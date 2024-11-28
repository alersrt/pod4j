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
 * Schema2PlatformSpec describes the platform which a particular manifest is specialized for. This is publicly visible as c/image/manifest.Schema2PlatformSpec.
 */
@JsonPropertyOrder({
  Schema2PlatformSpec.JSON_PROPERTY_ARCHITECTURE,
  Schema2PlatformSpec.JSON_PROPERTY_FEATURES,
  Schema2PlatformSpec.JSON_PROPERTY_OS,
  Schema2PlatformSpec.JSON_PROPERTY_OS_FEATURES,
  Schema2PlatformSpec.JSON_PROPERTY_OS_VERSION,
  Schema2PlatformSpec.JSON_PROPERTY_VARIANT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Schema2PlatformSpec {
  public static final String JSON_PROPERTY_ARCHITECTURE = "architecture";
  private String architecture;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private List<String> features = new ArrayList<>();

  public static final String JSON_PROPERTY_OS = "os";
  private String os;

  public static final String JSON_PROPERTY_OS_FEATURES = "os.features";
  private List<String> osFeatures = new ArrayList<>();

  public static final String JSON_PROPERTY_OS_VERSION = "os.version";
  private String osVersion;

  public static final String JSON_PROPERTY_VARIANT = "variant";
  private String variant;

  public Schema2PlatformSpec() { 
  }

  public Schema2PlatformSpec architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARCHITECTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArchitecture() {
    return architecture;
  }


  @JsonProperty(JSON_PROPERTY_ARCHITECTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }


  public Schema2PlatformSpec features(List<String> features) {
    this.features = features;
    return this;
  }

  public Schema2PlatformSpec addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getFeatures() {
    return features;
  }


  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeatures(List<String> features) {
    this.features = features;
  }


  public Schema2PlatformSpec os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Get os
   * @return os
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOs() {
    return os;
  }


  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOs(String os) {
    this.os = os;
  }


  public Schema2PlatformSpec osFeatures(List<String> osFeatures) {
    this.osFeatures = osFeatures;
    return this;
  }

  public Schema2PlatformSpec addOsFeaturesItem(String osFeaturesItem) {
    if (this.osFeatures == null) {
      this.osFeatures = new ArrayList<>();
    }
    this.osFeatures.add(osFeaturesItem);
    return this;
  }

  /**
   * Get osFeatures
   * @return osFeatures
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OS_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOsFeatures() {
    return osFeatures;
  }


  @JsonProperty(JSON_PROPERTY_OS_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsFeatures(List<String> osFeatures) {
    this.osFeatures = osFeatures;
  }


  public Schema2PlatformSpec osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Get osVersion
   * @return osVersion
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOsVersion() {
    return osVersion;
  }


  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public Schema2PlatformSpec variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Get variant
   * @return variant
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariant() {
    return variant;
  }


  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariant(String variant) {
    this.variant = variant;
  }


  /**
   * Return true if this Schema2PlatformSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schema2PlatformSpec schema2PlatformSpec = (Schema2PlatformSpec) o;
    return Objects.equals(this.architecture, schema2PlatformSpec.architecture) &&
        Objects.equals(this.features, schema2PlatformSpec.features) &&
        Objects.equals(this.os, schema2PlatformSpec.os) &&
        Objects.equals(this.osFeatures, schema2PlatformSpec.osFeatures) &&
        Objects.equals(this.osVersion, schema2PlatformSpec.osVersion) &&
        Objects.equals(this.variant, schema2PlatformSpec.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, features, os, osFeatures, osVersion, variant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schema2PlatformSpec {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osFeatures: ").append(toIndentedString(osFeatures)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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

    // add `architecture` to the URL query string
    if (getArchitecture() != null) {
      joiner.add(String.format("%sarchitecture%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getArchitecture()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `features` to the URL query string
    if (getFeatures() != null) {
      for (int i = 0; i < getFeatures().size(); i++) {
        joiner.add(String.format("%sfeatures%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getFeatures().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `os` to the URL query string
    if (getOs() != null) {
      joiner.add(String.format("%sos%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `os.features` to the URL query string
    if (getOsFeatures() != null) {
      for (int i = 0; i < getOsFeatures().size(); i++) {
        joiner.add(String.format("%sos.features%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getOsFeatures().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `os.version` to the URL query string
    if (getOsVersion() != null) {
      joiner.add(String.format("%sos.version%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOsVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `variant` to the URL query string
    if (getVariant() != null) {
      joiner.add(String.format("%svariant%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getVariant()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

