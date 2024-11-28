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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * ManifestAnnotateOptions provides model for annotating manifest list
 */
@JsonPropertyOrder({
  ManifestAnnotateOptions.JSON_PROPERTY_ANNOTATION,
  ManifestAnnotateOptions.JSON_PROPERTY_ANNOTATIONS,
  ManifestAnnotateOptions.JSON_PROPERTY_ARCH,
  ManifestAnnotateOptions.JSON_PROPERTY_FEATURES,
  ManifestAnnotateOptions.JSON_PROPERTY_INDEX_ANNOTATION,
  ManifestAnnotateOptions.JSON_PROPERTY_INDEX_ANNOTATIONS,
  ManifestAnnotateOptions.JSON_PROPERTY_OS,
  ManifestAnnotateOptions.JSON_PROPERTY_OS_FEATURES,
  ManifestAnnotateOptions.JSON_PROPERTY_OS_VERSION,
  ManifestAnnotateOptions.JSON_PROPERTY_SUBJECT,
  ManifestAnnotateOptions.JSON_PROPERTY_VARIANT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ManifestAnnotateOptions {
  public static final String JSON_PROPERTY_ANNOTATION = "annotation";
  private List<String> annotation = new ArrayList<>();

  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private Map<String, String> annotations = new HashMap<>();

  public static final String JSON_PROPERTY_ARCH = "arch";
  private String arch;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private List<String> features = new ArrayList<>();

  public static final String JSON_PROPERTY_INDEX_ANNOTATION = "index_annotation";
  private List<String> indexAnnotation = new ArrayList<>();

  public static final String JSON_PROPERTY_INDEX_ANNOTATIONS = "index_annotations";
  private Map<String, String> indexAnnotations = new HashMap<>();

  public static final String JSON_PROPERTY_OS = "os";
  private String os;

  public static final String JSON_PROPERTY_OS_FEATURES = "os_features";
  private List<String> osFeatures = new ArrayList<>();

  public static final String JSON_PROPERTY_OS_VERSION = "os_version";
  private String osVersion;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_VARIANT = "variant";
  private String variant;

  public ManifestAnnotateOptions() { 
  }

  public ManifestAnnotateOptions annotation(List<String> annotation) {
    this.annotation = annotation;
    return this;
  }

  public ManifestAnnotateOptions addAnnotationItem(String annotationItem) {
    if (this.annotation == null) {
      this.annotation = new ArrayList<>();
    }
    this.annotation.add(annotationItem);
    return this;
  }

  /**
   * Annotation to add to the item in the manifest list
   * @return annotation
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ANNOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAnnotation() {
    return annotation;
  }


  @JsonProperty(JSON_PROPERTY_ANNOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnotation(List<String> annotation) {
    this.annotation = annotation;
  }


  public ManifestAnnotateOptions annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public ManifestAnnotateOptions putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Annotations to add to the item in the manifest list by a map which is preferred over Annotation
   * @return annotations
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getAnnotations() {
    return annotations;
  }


  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public ManifestAnnotateOptions arch(String arch) {
    this.arch = arch;
    return this;
  }

  /**
   * Arch overrides the architecture for the item in the manifest list
   * @return arch
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArch() {
    return arch;
  }


  @JsonProperty(JSON_PROPERTY_ARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArch(String arch) {
    this.arch = arch;
  }


  public ManifestAnnotateOptions features(List<String> features) {
    this.features = features;
    return this;
  }

  public ManifestAnnotateOptions addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Feature list for the item in the manifest list
   * @return features
   */
  @jakarta.annotation.Nullable

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


  public ManifestAnnotateOptions indexAnnotation(List<String> indexAnnotation) {
    this.indexAnnotation = indexAnnotation;
    return this;
  }

  public ManifestAnnotateOptions addIndexAnnotationItem(String indexAnnotationItem) {
    if (this.indexAnnotation == null) {
      this.indexAnnotation = new ArrayList<>();
    }
    this.indexAnnotation.add(indexAnnotationItem);
    return this;
  }

  /**
   * IndexAnnotation is a slice of key&#x3D;value annotations to add to the manifest list itself
   * @return indexAnnotation
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_INDEX_ANNOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIndexAnnotation() {
    return indexAnnotation;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_ANNOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexAnnotation(List<String> indexAnnotation) {
    this.indexAnnotation = indexAnnotation;
  }


  public ManifestAnnotateOptions indexAnnotations(Map<String, String> indexAnnotations) {
    this.indexAnnotations = indexAnnotations;
    return this;
  }

  public ManifestAnnotateOptions putIndexAnnotationsItem(String key, String indexAnnotationsItem) {
    if (this.indexAnnotations == null) {
      this.indexAnnotations = new HashMap<>();
    }
    this.indexAnnotations.put(key, indexAnnotationsItem);
    return this;
  }

  /**
   * IndexAnnotations is a map of key:value annotations to add to the manifest list itself, by a map which is preferred over IndexAnnotation
   * @return indexAnnotations
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_INDEX_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getIndexAnnotations() {
    return indexAnnotations;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexAnnotations(Map<String, String> indexAnnotations) {
    this.indexAnnotations = indexAnnotations;
  }


  public ManifestAnnotateOptions os(String os) {
    this.os = os;
    return this;
  }

  /**
   * OS overrides the operating system for the item in the manifest list
   * @return os
   */
  @jakarta.annotation.Nullable

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


  public ManifestAnnotateOptions osFeatures(List<String> osFeatures) {
    this.osFeatures = osFeatures;
    return this;
  }

  public ManifestAnnotateOptions addOsFeaturesItem(String osFeaturesItem) {
    if (this.osFeatures == null) {
      this.osFeatures = new ArrayList<>();
    }
    this.osFeatures.add(osFeaturesItem);
    return this;
  }

  /**
   * OS features for the item in the manifest list
   * @return osFeatures
   */
  @jakarta.annotation.Nullable

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


  public ManifestAnnotateOptions osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * OSVersion overrides the operating system for the item in the manifest list
   * @return osVersion
   */
  @jakarta.annotation.Nullable

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


  public ManifestAnnotateOptions subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * IndexSubject is a subject value to set in the manifest list itself
   * @return subject
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public ManifestAnnotateOptions variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Variant for the item in the manifest list
   * @return variant
   */
  @jakarta.annotation.Nullable

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
   * Return true if this ManifestAnnotateOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestAnnotateOptions manifestAnnotateOptions = (ManifestAnnotateOptions) o;
    return Objects.equals(this.annotation, manifestAnnotateOptions.annotation) &&
        Objects.equals(this.annotations, manifestAnnotateOptions.annotations) &&
        Objects.equals(this.arch, manifestAnnotateOptions.arch) &&
        Objects.equals(this.features, manifestAnnotateOptions.features) &&
        Objects.equals(this.indexAnnotation, manifestAnnotateOptions.indexAnnotation) &&
        Objects.equals(this.indexAnnotations, manifestAnnotateOptions.indexAnnotations) &&
        Objects.equals(this.os, manifestAnnotateOptions.os) &&
        Objects.equals(this.osFeatures, manifestAnnotateOptions.osFeatures) &&
        Objects.equals(this.osVersion, manifestAnnotateOptions.osVersion) &&
        Objects.equals(this.subject, manifestAnnotateOptions.subject) &&
        Objects.equals(this.variant, manifestAnnotateOptions.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotation, annotations, arch, features, indexAnnotation, indexAnnotations, os, osFeatures, osVersion, subject, variant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestAnnotateOptions {\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    indexAnnotation: ").append(toIndentedString(indexAnnotation)).append("\n");
    sb.append("    indexAnnotations: ").append(toIndentedString(indexAnnotations)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osFeatures: ").append(toIndentedString(osFeatures)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

    // add `annotation` to the URL query string
    if (getAnnotation() != null) {
      for (int i = 0; i < getAnnotation().size(); i++) {
        joiner.add(String.format("%sannotation%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getAnnotation().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `annotations` to the URL query string
    if (getAnnotations() != null) {
      for (String _key : getAnnotations().keySet()) {
        joiner.add(String.format("%sannotations%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getAnnotations().get(_key), URLEncoder.encode(ApiClient.valueToString(getAnnotations().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `arch` to the URL query string
    if (getArch() != null) {
      joiner.add(String.format("%sarch%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getArch()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `features` to the URL query string
    if (getFeatures() != null) {
      for (int i = 0; i < getFeatures().size(); i++) {
        joiner.add(String.format("%sfeatures%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getFeatures().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `index_annotation` to the URL query string
    if (getIndexAnnotation() != null) {
      for (int i = 0; i < getIndexAnnotation().size(); i++) {
        joiner.add(String.format("%sindex_annotation%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getIndexAnnotation().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `index_annotations` to the URL query string
    if (getIndexAnnotations() != null) {
      for (String _key : getIndexAnnotations().keySet()) {
        joiner.add(String.format("%sindex_annotations%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getIndexAnnotations().get(_key), URLEncoder.encode(ApiClient.valueToString(getIndexAnnotations().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `os` to the URL query string
    if (getOs() != null) {
      joiner.add(String.format("%sos%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `os_features` to the URL query string
    if (getOsFeatures() != null) {
      for (int i = 0; i < getOsFeatures().size(); i++) {
        joiner.add(String.format("%sos_features%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getOsFeatures().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `os_version` to the URL query string
    if (getOsVersion() != null) {
      joiner.add(String.format("%sos_version%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOsVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `subject` to the URL query string
    if (getSubject() != null) {
      joiner.add(String.format("%ssubject%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSubject()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `variant` to the URL query string
    if (getVariant() != null) {
      joiner.add(String.format("%svariant%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getVariant()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

