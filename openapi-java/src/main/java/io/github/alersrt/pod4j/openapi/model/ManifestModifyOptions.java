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
 * swagger 2.0 does not support oneOf for schema validation.  Operation \&quot;update\&quot; uses all fields. Operation \&quot;remove\&quot; uses fields: Operation and Images Operation \&quot;annotate\&quot; uses fields: Operation and Annotations
 */
@JsonPropertyOrder({
  ManifestModifyOptions.JSON_PROPERTY_ALL,
  ManifestModifyOptions.JSON_PROPERTY_ANNOTATION,
  ManifestModifyOptions.JSON_PROPERTY_ANNOTATIONS,
  ManifestModifyOptions.JSON_PROPERTY_ARCH,
  ManifestModifyOptions.JSON_PROPERTY_ARTIFACT_ANNOTATIONS,
  ManifestModifyOptions.JSON_PROPERTY_ARTIFACT_CONFIG,
  ManifestModifyOptions.JSON_PROPERTY_ARTIFACT_CONFIG_TYPE,
  ManifestModifyOptions.JSON_PROPERTY_ARTIFACT_EXCLUDE_TITLES,
  ManifestModifyOptions.JSON_PROPERTY_ARTIFACT_FILES,
  ManifestModifyOptions.JSON_PROPERTY_ARTIFACT_LAYER_TYPE,
  ManifestModifyOptions.JSON_PROPERTY_ARTIFACT_SUBJECT,
  ManifestModifyOptions.JSON_PROPERTY_ARTIFACT_TYPE,
  ManifestModifyOptions.JSON_PROPERTY_FEATURES,
  ManifestModifyOptions.JSON_PROPERTY_IMAGES,
  ManifestModifyOptions.JSON_PROPERTY_INDEX_ANNOTATION,
  ManifestModifyOptions.JSON_PROPERTY_INDEX_ANNOTATIONS,
  ManifestModifyOptions.JSON_PROPERTY_OPERATION,
  ManifestModifyOptions.JSON_PROPERTY_OS,
  ManifestModifyOptions.JSON_PROPERTY_OS_FEATURES,
  ManifestModifyOptions.JSON_PROPERTY_OS_VERSION,
  ManifestModifyOptions.JSON_PROPERTY_SUBJECT,
  ManifestModifyOptions.JSON_PROPERTY_VARIANT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ManifestModifyOptions {
  public static final String JSON_PROPERTY_ALL = "all";
  private Boolean all;

  public static final String JSON_PROPERTY_ANNOTATION = "annotation";
  private List<String> annotation = new ArrayList<>();

  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private Map<String, String> annotations = new HashMap<>();

  public static final String JSON_PROPERTY_ARCH = "arch";
  private String arch;

  public static final String JSON_PROPERTY_ARTIFACT_ANNOTATIONS = "artifact_annotations";
  private Map<String, String> artifactAnnotations = new HashMap<>();

  public static final String JSON_PROPERTY_ARTIFACT_CONFIG = "artifact_config";
  private String artifactConfig;

  public static final String JSON_PROPERTY_ARTIFACT_CONFIG_TYPE = "artifact_config_type";
  private String artifactConfigType;

  public static final String JSON_PROPERTY_ARTIFACT_EXCLUDE_TITLES = "artifact_exclude_titles";
  private Boolean artifactExcludeTitles;

  public static final String JSON_PROPERTY_ARTIFACT_FILES = "artifact_files";
  private List<String> artifactFiles = new ArrayList<>();

  public static final String JSON_PROPERTY_ARTIFACT_LAYER_TYPE = "artifact_layer_type";
  private String artifactLayerType;

  public static final String JSON_PROPERTY_ARTIFACT_SUBJECT = "artifact_subject";
  private String artifactSubject;

  public static final String JSON_PROPERTY_ARTIFACT_TYPE = "artifact_type";
  private String artifactType;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private List<String> features = new ArrayList<>();

  public static final String JSON_PROPERTY_IMAGES = "images";
  private List<String> images = new ArrayList<>();

  public static final String JSON_PROPERTY_INDEX_ANNOTATION = "index_annotation";
  private List<String> indexAnnotation = new ArrayList<>();

  public static final String JSON_PROPERTY_INDEX_ANNOTATIONS = "index_annotations";
  private Map<String, String> indexAnnotations = new HashMap<>();

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

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

  public ManifestModifyOptions() { 
  }

  public ManifestModifyOptions all(Boolean all) {
    this.all = all;
    return this;
  }

  /**
   * True when operating on a list to include all images
   * @return all
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAll() {
    return all;
  }


  @JsonProperty(JSON_PROPERTY_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAll(Boolean all) {
    this.all = all;
  }


  public ManifestModifyOptions annotation(List<String> annotation) {
    this.annotation = annotation;
    return this;
  }

  public ManifestModifyOptions addAnnotationItem(String annotationItem) {
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
  @javax.annotation.Nullable

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


  public ManifestModifyOptions annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public ManifestModifyOptions putAnnotationsItem(String key, String annotationsItem) {
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
  @javax.annotation.Nullable

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


  public ManifestModifyOptions arch(String arch) {
    this.arch = arch;
    return this;
  }

  /**
   * Arch overrides the architecture for the item in the manifest list
   * @return arch
   */
  @javax.annotation.Nullable

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


  public ManifestModifyOptions artifactAnnotations(Map<String, String> artifactAnnotations) {
    this.artifactAnnotations = artifactAnnotations;
    return this;
  }

  public ManifestModifyOptions putArtifactAnnotationsItem(String key, String artifactAnnotationsItem) {
    if (this.artifactAnnotations == null) {
      this.artifactAnnotations = new HashMap<>();
    }
    this.artifactAnnotations.put(key, artifactAnnotationsItem);
    return this;
  }

  /**
   * Get artifactAnnotations
   * @return artifactAnnotations
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARTIFACT_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getArtifactAnnotations() {
    return artifactAnnotations;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifactAnnotations(Map<String, String> artifactAnnotations) {
    this.artifactAnnotations = artifactAnnotations;
  }


  public ManifestModifyOptions artifactConfig(String artifactConfig) {
    this.artifactConfig = artifactConfig;
    return this;
  }

  /**
   * Get artifactConfig
   * @return artifactConfig
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARTIFACT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArtifactConfig() {
    return artifactConfig;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifactConfig(String artifactConfig) {
    this.artifactConfig = artifactConfig;
  }


  public ManifestModifyOptions artifactConfigType(String artifactConfigType) {
    this.artifactConfigType = artifactConfigType;
    return this;
  }

  /**
   * Get artifactConfigType
   * @return artifactConfigType
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARTIFACT_CONFIG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArtifactConfigType() {
    return artifactConfigType;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_CONFIG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifactConfigType(String artifactConfigType) {
    this.artifactConfigType = artifactConfigType;
  }


  public ManifestModifyOptions artifactExcludeTitles(Boolean artifactExcludeTitles) {
    this.artifactExcludeTitles = artifactExcludeTitles;
    return this;
  }

  /**
   * Get artifactExcludeTitles
   * @return artifactExcludeTitles
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARTIFACT_EXCLUDE_TITLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getArtifactExcludeTitles() {
    return artifactExcludeTitles;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_EXCLUDE_TITLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifactExcludeTitles(Boolean artifactExcludeTitles) {
    this.artifactExcludeTitles = artifactExcludeTitles;
  }


  public ManifestModifyOptions artifactFiles(List<String> artifactFiles) {
    this.artifactFiles = artifactFiles;
    return this;
  }

  public ManifestModifyOptions addArtifactFilesItem(String artifactFilesItem) {
    if (this.artifactFiles == null) {
      this.artifactFiles = new ArrayList<>();
    }
    this.artifactFiles.add(artifactFilesItem);
    return this;
  }

  /**
   * Get artifactFiles
   * @return artifactFiles
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARTIFACT_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getArtifactFiles() {
    return artifactFiles;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifactFiles(List<String> artifactFiles) {
    this.artifactFiles = artifactFiles;
  }


  public ManifestModifyOptions artifactLayerType(String artifactLayerType) {
    this.artifactLayerType = artifactLayerType;
    return this;
  }

  /**
   * Get artifactLayerType
   * @return artifactLayerType
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARTIFACT_LAYER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArtifactLayerType() {
    return artifactLayerType;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_LAYER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifactLayerType(String artifactLayerType) {
    this.artifactLayerType = artifactLayerType;
  }


  public ManifestModifyOptions artifactSubject(String artifactSubject) {
    this.artifactSubject = artifactSubject;
    return this;
  }

  /**
   * Get artifactSubject
   * @return artifactSubject
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARTIFACT_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArtifactSubject() {
    return artifactSubject;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifactSubject(String artifactSubject) {
    this.artifactSubject = artifactSubject;
  }


  public ManifestModifyOptions artifactType(String artifactType) {
    this.artifactType = artifactType;
    return this;
  }

  /**
   * The following are all of the fields from ManifestAddArtifactOptions. We can&#39;t just embed the whole structure because it embeds a ManifestAnnotateOptions, which would conflict with the one that ManifestAddOptions embeds.
   * @return artifactType
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARTIFACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArtifactType() {
    return artifactType;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifactType(String artifactType) {
    this.artifactType = artifactType;
  }


  public ManifestModifyOptions features(List<String> features) {
    this.features = features;
    return this;
  }

  public ManifestModifyOptions addFeaturesItem(String featuresItem) {
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


  public ManifestModifyOptions images(List<String> images) {
    this.images = images;
    return this;
  }

  public ManifestModifyOptions addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Images is an optional list of image references to add to manifest list
   * @return images
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getImages() {
    return images;
  }


  @JsonProperty(JSON_PROPERTY_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImages(List<String> images) {
    this.images = images;
  }


  public ManifestModifyOptions indexAnnotation(List<String> indexAnnotation) {
    this.indexAnnotation = indexAnnotation;
    return this;
  }

  public ManifestModifyOptions addIndexAnnotationItem(String indexAnnotationItem) {
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
  @javax.annotation.Nullable

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


  public ManifestModifyOptions indexAnnotations(Map<String, String> indexAnnotations) {
    this.indexAnnotations = indexAnnotations;
    return this;
  }

  public ManifestModifyOptions putIndexAnnotationsItem(String key, String indexAnnotationsItem) {
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
  @javax.annotation.Nullable

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


  public ManifestModifyOptions operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperation(String operation) {
    this.operation = operation;
  }


  public ManifestModifyOptions os(String os) {
    this.os = os;
    return this;
  }

  /**
   * OS overrides the operating system for the item in the manifest list
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


  public ManifestModifyOptions osFeatures(List<String> osFeatures) {
    this.osFeatures = osFeatures;
    return this;
  }

  public ManifestModifyOptions addOsFeaturesItem(String osFeaturesItem) {
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


  public ManifestModifyOptions osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * OSVersion overrides the operating system for the item in the manifest list
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


  public ManifestModifyOptions subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * IndexSubject is a subject value to set in the manifest list itself
   * @return subject
   */
  @javax.annotation.Nullable

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


  public ManifestModifyOptions variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Variant for the item in the manifest list
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
   * Return true if this ManifestModifyOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestModifyOptions manifestModifyOptions = (ManifestModifyOptions) o;
    return Objects.equals(this.all, manifestModifyOptions.all) &&
        Objects.equals(this.annotation, manifestModifyOptions.annotation) &&
        Objects.equals(this.annotations, manifestModifyOptions.annotations) &&
        Objects.equals(this.arch, manifestModifyOptions.arch) &&
        Objects.equals(this.artifactAnnotations, manifestModifyOptions.artifactAnnotations) &&
        Objects.equals(this.artifactConfig, manifestModifyOptions.artifactConfig) &&
        Objects.equals(this.artifactConfigType, manifestModifyOptions.artifactConfigType) &&
        Objects.equals(this.artifactExcludeTitles, manifestModifyOptions.artifactExcludeTitles) &&
        Objects.equals(this.artifactFiles, manifestModifyOptions.artifactFiles) &&
        Objects.equals(this.artifactLayerType, manifestModifyOptions.artifactLayerType) &&
        Objects.equals(this.artifactSubject, manifestModifyOptions.artifactSubject) &&
        Objects.equals(this.artifactType, manifestModifyOptions.artifactType) &&
        Objects.equals(this.features, manifestModifyOptions.features) &&
        Objects.equals(this.images, manifestModifyOptions.images) &&
        Objects.equals(this.indexAnnotation, manifestModifyOptions.indexAnnotation) &&
        Objects.equals(this.indexAnnotations, manifestModifyOptions.indexAnnotations) &&
        Objects.equals(this.operation, manifestModifyOptions.operation) &&
        Objects.equals(this.os, manifestModifyOptions.os) &&
        Objects.equals(this.osFeatures, manifestModifyOptions.osFeatures) &&
        Objects.equals(this.osVersion, manifestModifyOptions.osVersion) &&
        Objects.equals(this.subject, manifestModifyOptions.subject) &&
        Objects.equals(this.variant, manifestModifyOptions.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, annotation, annotations, arch, artifactAnnotations, artifactConfig, artifactConfigType, artifactExcludeTitles, artifactFiles, artifactLayerType, artifactSubject, artifactType, features, images, indexAnnotation, indexAnnotations, operation, os, osFeatures, osVersion, subject, variant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestModifyOptions {\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    artifactAnnotations: ").append(toIndentedString(artifactAnnotations)).append("\n");
    sb.append("    artifactConfig: ").append(toIndentedString(artifactConfig)).append("\n");
    sb.append("    artifactConfigType: ").append(toIndentedString(artifactConfigType)).append("\n");
    sb.append("    artifactExcludeTitles: ").append(toIndentedString(artifactExcludeTitles)).append("\n");
    sb.append("    artifactFiles: ").append(toIndentedString(artifactFiles)).append("\n");
    sb.append("    artifactLayerType: ").append(toIndentedString(artifactLayerType)).append("\n");
    sb.append("    artifactSubject: ").append(toIndentedString(artifactSubject)).append("\n");
    sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    indexAnnotation: ").append(toIndentedString(indexAnnotation)).append("\n");
    sb.append("    indexAnnotations: ").append(toIndentedString(indexAnnotations)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

    // add `all` to the URL query string
    if (getAll() != null) {
      joiner.add(String.format("%sall%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAll()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

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

    // add `artifact_annotations` to the URL query string
    if (getArtifactAnnotations() != null) {
      for (String _key : getArtifactAnnotations().keySet()) {
        joiner.add(String.format("%sartifact_annotations%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getArtifactAnnotations().get(_key), URLEncoder.encode(ApiClient.valueToString(getArtifactAnnotations().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `artifact_config` to the URL query string
    if (getArtifactConfig() != null) {
      joiner.add(String.format("%sartifact_config%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getArtifactConfig()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `artifact_config_type` to the URL query string
    if (getArtifactConfigType() != null) {
      joiner.add(String.format("%sartifact_config_type%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getArtifactConfigType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `artifact_exclude_titles` to the URL query string
    if (getArtifactExcludeTitles() != null) {
      joiner.add(String.format("%sartifact_exclude_titles%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getArtifactExcludeTitles()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `artifact_files` to the URL query string
    if (getArtifactFiles() != null) {
      for (int i = 0; i < getArtifactFiles().size(); i++) {
        joiner.add(String.format("%sartifact_files%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getArtifactFiles().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `artifact_layer_type` to the URL query string
    if (getArtifactLayerType() != null) {
      joiner.add(String.format("%sartifact_layer_type%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getArtifactLayerType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `artifact_subject` to the URL query string
    if (getArtifactSubject() != null) {
      joiner.add(String.format("%sartifact_subject%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getArtifactSubject()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `artifact_type` to the URL query string
    if (getArtifactType() != null) {
      joiner.add(String.format("%sartifact_type%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getArtifactType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `features` to the URL query string
    if (getFeatures() != null) {
      for (int i = 0; i < getFeatures().size(); i++) {
        joiner.add(String.format("%sfeatures%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getFeatures().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `images` to the URL query string
    if (getImages() != null) {
      for (int i = 0; i < getImages().size(); i++) {
        joiner.add(String.format("%simages%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getImages().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `operation` to the URL query string
    if (getOperation() != null) {
      joiner.add(String.format("%soperation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOperation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

