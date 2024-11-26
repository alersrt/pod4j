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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.JSON;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * ManifestAddArtifactOptions provides the model for creating artifact manifests for files and
 * adding those manifests to a manifest list
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-26T18:24:48.119248545+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class ManifestAddArtifactOptions {
    public static final String SERIALIZED_NAME_ANNOTATION = "annotation";

    @SerializedName(SERIALIZED_NAME_ANNOTATION)
    private List<String> annotation = new ArrayList<>();

    public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";

    @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
    private Map<String, String> annotations = new HashMap<>();

    public static final String SERIALIZED_NAME_ARCH = "arch";

    @SerializedName(SERIALIZED_NAME_ARCH)
    private String arch;

    public static final String SERIALIZED_NAME_ARTIFACT_ANNOTATIONS = "artifact_annotations";

    @SerializedName(SERIALIZED_NAME_ARTIFACT_ANNOTATIONS)
    private Map<String, String> artifactAnnotations = new HashMap<>();

    public static final String SERIALIZED_NAME_ARTIFACT_CONFIG = "artifact_config";

    @SerializedName(SERIALIZED_NAME_ARTIFACT_CONFIG)
    private String artifactConfig;

    public static final String SERIALIZED_NAME_ARTIFACT_CONFIG_TYPE = "artifact_config_type";

    @SerializedName(SERIALIZED_NAME_ARTIFACT_CONFIG_TYPE)
    private String artifactConfigType;

    public static final String SERIALIZED_NAME_ARTIFACT_EXCLUDE_TITLES = "artifact_exclude_titles";

    @SerializedName(SERIALIZED_NAME_ARTIFACT_EXCLUDE_TITLES)
    private Boolean artifactExcludeTitles;

    public static final String SERIALIZED_NAME_ARTIFACT_FILES = "artifact_files";

    @SerializedName(SERIALIZED_NAME_ARTIFACT_FILES)
    private List<String> artifactFiles = new ArrayList<>();

    public static final String SERIALIZED_NAME_ARTIFACT_LAYER_TYPE = "artifact_layer_type";

    @SerializedName(SERIALIZED_NAME_ARTIFACT_LAYER_TYPE)
    private String artifactLayerType;

    public static final String SERIALIZED_NAME_ARTIFACT_SUBJECT = "artifact_subject";

    @SerializedName(SERIALIZED_NAME_ARTIFACT_SUBJECT)
    private String artifactSubject;

    public static final String SERIALIZED_NAME_ARTIFACT_TYPE = "artifact_type";

    @SerializedName(SERIALIZED_NAME_ARTIFACT_TYPE)
    private String artifactType;

    public static final String SERIALIZED_NAME_FEATURES = "features";

    @SerializedName(SERIALIZED_NAME_FEATURES)
    private List<String> features = new ArrayList<>();

    public static final String SERIALIZED_NAME_INDEX_ANNOTATION = "index_annotation";

    @SerializedName(SERIALIZED_NAME_INDEX_ANNOTATION)
    private List<String> indexAnnotation = new ArrayList<>();

    public static final String SERIALIZED_NAME_INDEX_ANNOTATIONS = "index_annotations";

    @SerializedName(SERIALIZED_NAME_INDEX_ANNOTATIONS)
    private Map<String, String> indexAnnotations = new HashMap<>();

    public static final String SERIALIZED_NAME_OS = "os";

    @SerializedName(SERIALIZED_NAME_OS)
    private String os;

    public static final String SERIALIZED_NAME_OS_FEATURES = "os_features";

    @SerializedName(SERIALIZED_NAME_OS_FEATURES)
    private List<String> osFeatures = new ArrayList<>();

    public static final String SERIALIZED_NAME_OS_VERSION = "os_version";

    @SerializedName(SERIALIZED_NAME_OS_VERSION)
    private String osVersion;

    public static final String SERIALIZED_NAME_SUBJECT = "subject";

    @SerializedName(SERIALIZED_NAME_SUBJECT)
    private String subject;

    public static final String SERIALIZED_NAME_VARIANT = "variant";

    @SerializedName(SERIALIZED_NAME_VARIANT)
    private String variant;

    public ManifestAddArtifactOptions() {}

    public ManifestAddArtifactOptions annotation(List<String> annotation) {
        this.annotation = annotation;
        return this;
    }

    public ManifestAddArtifactOptions addAnnotationItem(String annotationItem) {
        if (this.annotation == null) {
            this.annotation = new ArrayList<>();
        }
        this.annotation.add(annotationItem);
        return this;
    }

    /**
     * Annotation to add to the item in the manifest list
     *
     * @return annotation
     */
    @javax.annotation.Nullable
    public List<String> getAnnotation() {
        return annotation;
    }

    public void setAnnotation(List<String> annotation) {
        this.annotation = annotation;
    }

    public ManifestAddArtifactOptions annotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public ManifestAddArtifactOptions putAnnotationsItem(String key, String annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    /**
     * Annotations to add to the item in the manifest list by a map which is preferred over
     * Annotation
     *
     * @return annotations
     */
    @javax.annotation.Nullable
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public ManifestAddArtifactOptions arch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * Arch overrides the architecture for the item in the manifest list
     *
     * @return arch
     */
    @javax.annotation.Nullable
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public ManifestAddArtifactOptions artifactAnnotations(Map<String, String> artifactAnnotations) {
        this.artifactAnnotations = artifactAnnotations;
        return this;
    }

    public ManifestAddArtifactOptions putArtifactAnnotationsItem(
            String key, String artifactAnnotationsItem) {
        if (this.artifactAnnotations == null) {
            this.artifactAnnotations = new HashMap<>();
        }
        this.artifactAnnotations.put(key, artifactAnnotationsItem);
        return this;
    }

    /**
     * Get artifactAnnotations
     *
     * @return artifactAnnotations
     */
    @javax.annotation.Nullable
    public Map<String, String> getArtifactAnnotations() {
        return artifactAnnotations;
    }

    public void setArtifactAnnotations(Map<String, String> artifactAnnotations) {
        this.artifactAnnotations = artifactAnnotations;
    }

    public ManifestAddArtifactOptions artifactConfig(String artifactConfig) {
        this.artifactConfig = artifactConfig;
        return this;
    }

    /**
     * Get artifactConfig
     *
     * @return artifactConfig
     */
    @javax.annotation.Nullable
    public String getArtifactConfig() {
        return artifactConfig;
    }

    public void setArtifactConfig(String artifactConfig) {
        this.artifactConfig = artifactConfig;
    }

    public ManifestAddArtifactOptions artifactConfigType(String artifactConfigType) {
        this.artifactConfigType = artifactConfigType;
        return this;
    }

    /**
     * Get artifactConfigType
     *
     * @return artifactConfigType
     */
    @javax.annotation.Nullable
    public String getArtifactConfigType() {
        return artifactConfigType;
    }

    public void setArtifactConfigType(String artifactConfigType) {
        this.artifactConfigType = artifactConfigType;
    }

    public ManifestAddArtifactOptions artifactExcludeTitles(Boolean artifactExcludeTitles) {
        this.artifactExcludeTitles = artifactExcludeTitles;
        return this;
    }

    /**
     * Get artifactExcludeTitles
     *
     * @return artifactExcludeTitles
     */
    @javax.annotation.Nullable
    public Boolean getArtifactExcludeTitles() {
        return artifactExcludeTitles;
    }

    public void setArtifactExcludeTitles(Boolean artifactExcludeTitles) {
        this.artifactExcludeTitles = artifactExcludeTitles;
    }

    public ManifestAddArtifactOptions artifactFiles(List<String> artifactFiles) {
        this.artifactFiles = artifactFiles;
        return this;
    }

    public ManifestAddArtifactOptions addArtifactFilesItem(String artifactFilesItem) {
        if (this.artifactFiles == null) {
            this.artifactFiles = new ArrayList<>();
        }
        this.artifactFiles.add(artifactFilesItem);
        return this;
    }

    /**
     * Get artifactFiles
     *
     * @return artifactFiles
     */
    @javax.annotation.Nullable
    public List<String> getArtifactFiles() {
        return artifactFiles;
    }

    public void setArtifactFiles(List<String> artifactFiles) {
        this.artifactFiles = artifactFiles;
    }

    public ManifestAddArtifactOptions artifactLayerType(String artifactLayerType) {
        this.artifactLayerType = artifactLayerType;
        return this;
    }

    /**
     * Get artifactLayerType
     *
     * @return artifactLayerType
     */
    @javax.annotation.Nullable
    public String getArtifactLayerType() {
        return artifactLayerType;
    }

    public void setArtifactLayerType(String artifactLayerType) {
        this.artifactLayerType = artifactLayerType;
    }

    public ManifestAddArtifactOptions artifactSubject(String artifactSubject) {
        this.artifactSubject = artifactSubject;
        return this;
    }

    /**
     * Get artifactSubject
     *
     * @return artifactSubject
     */
    @javax.annotation.Nullable
    public String getArtifactSubject() {
        return artifactSubject;
    }

    public void setArtifactSubject(String artifactSubject) {
        this.artifactSubject = artifactSubject;
    }

    public ManifestAddArtifactOptions artifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }

    /**
     * Note to future maintainers: keep these fields synchronized with ManifestModifyOptions!
     *
     * @return artifactType
     */
    @javax.annotation.Nullable
    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    public ManifestAddArtifactOptions features(List<String> features) {
        this.features = features;
        return this;
    }

    public ManifestAddArtifactOptions addFeaturesItem(String featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    /**
     * Feature list for the item in the manifest list
     *
     * @return features
     */
    @javax.annotation.Nullable
    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public ManifestAddArtifactOptions indexAnnotation(List<String> indexAnnotation) {
        this.indexAnnotation = indexAnnotation;
        return this;
    }

    public ManifestAddArtifactOptions addIndexAnnotationItem(String indexAnnotationItem) {
        if (this.indexAnnotation == null) {
            this.indexAnnotation = new ArrayList<>();
        }
        this.indexAnnotation.add(indexAnnotationItem);
        return this;
    }

    /**
     * IndexAnnotation is a slice of key&#x3D;value annotations to add to the manifest list itself
     *
     * @return indexAnnotation
     */
    @javax.annotation.Nullable
    public List<String> getIndexAnnotation() {
        return indexAnnotation;
    }

    public void setIndexAnnotation(List<String> indexAnnotation) {
        this.indexAnnotation = indexAnnotation;
    }

    public ManifestAddArtifactOptions indexAnnotations(Map<String, String> indexAnnotations) {
        this.indexAnnotations = indexAnnotations;
        return this;
    }

    public ManifestAddArtifactOptions putIndexAnnotationsItem(
            String key, String indexAnnotationsItem) {
        if (this.indexAnnotations == null) {
            this.indexAnnotations = new HashMap<>();
        }
        this.indexAnnotations.put(key, indexAnnotationsItem);
        return this;
    }

    /**
     * IndexAnnotations is a map of key:value annotations to add to the manifest list itself, by a
     * map which is preferred over IndexAnnotation
     *
     * @return indexAnnotations
     */
    @javax.annotation.Nullable
    public Map<String, String> getIndexAnnotations() {
        return indexAnnotations;
    }

    public void setIndexAnnotations(Map<String, String> indexAnnotations) {
        this.indexAnnotations = indexAnnotations;
    }

    public ManifestAddArtifactOptions os(String os) {
        this.os = os;
        return this;
    }

    /**
     * OS overrides the operating system for the item in the manifest list
     *
     * @return os
     */
    @javax.annotation.Nullable
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public ManifestAddArtifactOptions osFeatures(List<String> osFeatures) {
        this.osFeatures = osFeatures;
        return this;
    }

    public ManifestAddArtifactOptions addOsFeaturesItem(String osFeaturesItem) {
        if (this.osFeatures == null) {
            this.osFeatures = new ArrayList<>();
        }
        this.osFeatures.add(osFeaturesItem);
        return this;
    }

    /**
     * OS features for the item in the manifest list
     *
     * @return osFeatures
     */
    @javax.annotation.Nullable
    public List<String> getOsFeatures() {
        return osFeatures;
    }

    public void setOsFeatures(List<String> osFeatures) {
        this.osFeatures = osFeatures;
    }

    public ManifestAddArtifactOptions osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * OSVersion overrides the operating system for the item in the manifest list
     *
     * @return osVersion
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public ManifestAddArtifactOptions subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * IndexSubject is a subject value to set in the manifest list itself
     *
     * @return subject
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ManifestAddArtifactOptions variant(String variant) {
        this.variant = variant;
        return this;
    }

    /**
     * Variant for the item in the manifest list
     *
     * @return variant
     */
    @javax.annotation.Nullable
    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManifestAddArtifactOptions manifestAddArtifactOptions = (ManifestAddArtifactOptions) o;
        return Objects.equals(this.annotation, manifestAddArtifactOptions.annotation)
                && Objects.equals(this.annotations, manifestAddArtifactOptions.annotations)
                && Objects.equals(this.arch, manifestAddArtifactOptions.arch)
                && Objects.equals(
                        this.artifactAnnotations, manifestAddArtifactOptions.artifactAnnotations)
                && Objects.equals(this.artifactConfig, manifestAddArtifactOptions.artifactConfig)
                && Objects.equals(
                        this.artifactConfigType, manifestAddArtifactOptions.artifactConfigType)
                && Objects.equals(
                        this.artifactExcludeTitles,
                        manifestAddArtifactOptions.artifactExcludeTitles)
                && Objects.equals(this.artifactFiles, manifestAddArtifactOptions.artifactFiles)
                && Objects.equals(
                        this.artifactLayerType, manifestAddArtifactOptions.artifactLayerType)
                && Objects.equals(this.artifactSubject, manifestAddArtifactOptions.artifactSubject)
                && Objects.equals(this.artifactType, manifestAddArtifactOptions.artifactType)
                && Objects.equals(this.features, manifestAddArtifactOptions.features)
                && Objects.equals(this.indexAnnotation, manifestAddArtifactOptions.indexAnnotation)
                && Objects.equals(
                        this.indexAnnotations, manifestAddArtifactOptions.indexAnnotations)
                && Objects.equals(this.os, manifestAddArtifactOptions.os)
                && Objects.equals(this.osFeatures, manifestAddArtifactOptions.osFeatures)
                && Objects.equals(this.osVersion, manifestAddArtifactOptions.osVersion)
                && Objects.equals(this.subject, manifestAddArtifactOptions.subject)
                && Objects.equals(this.variant, manifestAddArtifactOptions.variant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                annotation,
                annotations,
                arch,
                artifactAnnotations,
                artifactConfig,
                artifactConfigType,
                artifactExcludeTitles,
                artifactFiles,
                artifactLayerType,
                artifactSubject,
                artifactType,
                features,
                indexAnnotation,
                indexAnnotations,
                os,
                osFeatures,
                osVersion,
                subject,
                variant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManifestAddArtifactOptions {\n");
        sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    artifactAnnotations: ")
                .append(toIndentedString(artifactAnnotations))
                .append("\n");
        sb.append("    artifactConfig: ").append(toIndentedString(artifactConfig)).append("\n");
        sb.append("    artifactConfigType: ")
                .append(toIndentedString(artifactConfigType))
                .append("\n");
        sb.append("    artifactExcludeTitles: ")
                .append(toIndentedString(artifactExcludeTitles))
                .append("\n");
        sb.append("    artifactFiles: ").append(toIndentedString(artifactFiles)).append("\n");
        sb.append("    artifactLayerType: ")
                .append(toIndentedString(artifactLayerType))
                .append("\n");
        sb.append("    artifactSubject: ").append(toIndentedString(artifactSubject)).append("\n");
        sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
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
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        openapiFields.add("annotation");
        openapiFields.add("annotations");
        openapiFields.add("arch");
        openapiFields.add("artifact_annotations");
        openapiFields.add("artifact_config");
        openapiFields.add("artifact_config_type");
        openapiFields.add("artifact_exclude_titles");
        openapiFields.add("artifact_files");
        openapiFields.add("artifact_layer_type");
        openapiFields.add("artifact_subject");
        openapiFields.add("artifact_type");
        openapiFields.add("features");
        openapiFields.add("index_annotation");
        openapiFields.add("index_annotations");
        openapiFields.add("os");
        openapiFields.add("os_features");
        openapiFields.add("os_version");
        openapiFields.add("subject");
        openapiFields.add("variant");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ManifestAddArtifactOptions
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ManifestAddArtifactOptions.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ManifestAddArtifactOptions is not"
                                        + " found in the empty JSON string",
                                ManifestAddArtifactOptions.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ManifestAddArtifactOptions.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ManifestAddArtifactOptions` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("annotation") != null
                && !jsonObj.get("annotation").isJsonNull()
                && !jsonObj.get("annotation").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `annotation` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("annotation").toString()));
        }
        if ((jsonObj.get("arch") != null && !jsonObj.get("arch").isJsonNull())
                && !jsonObj.get("arch").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `arch` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("arch").toString()));
        }
        if ((jsonObj.get("artifact_config") != null && !jsonObj.get("artifact_config").isJsonNull())
                && !jsonObj.get("artifact_config").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `artifact_config` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("artifact_config").toString()));
        }
        if ((jsonObj.get("artifact_config_type") != null
                        && !jsonObj.get("artifact_config_type").isJsonNull())
                && !jsonObj.get("artifact_config_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `artifact_config_type` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("artifact_config_type").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("artifact_files") != null
                && !jsonObj.get("artifact_files").isJsonNull()
                && !jsonObj.get("artifact_files").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `artifact_files` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("artifact_files").toString()));
        }
        if ((jsonObj.get("artifact_layer_type") != null
                        && !jsonObj.get("artifact_layer_type").isJsonNull())
                && !jsonObj.get("artifact_layer_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `artifact_layer_type` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("artifact_layer_type").toString()));
        }
        if ((jsonObj.get("artifact_subject") != null
                        && !jsonObj.get("artifact_subject").isJsonNull())
                && !jsonObj.get("artifact_subject").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `artifact_subject` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("artifact_subject").toString()));
        }
        if ((jsonObj.get("artifact_type") != null && !jsonObj.get("artifact_type").isJsonNull())
                && !jsonObj.get("artifact_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `artifact_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("artifact_type").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("features") != null
                && !jsonObj.get("features").isJsonNull()
                && !jsonObj.get("features").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `features` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("features").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("index_annotation") != null
                && !jsonObj.get("index_annotation").isJsonNull()
                && !jsonObj.get("index_annotation").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `index_annotation` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("index_annotation").toString()));
        }
        if ((jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull())
                && !jsonObj.get("os").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `os` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("os").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("os_features") != null
                && !jsonObj.get("os_features").isJsonNull()
                && !jsonObj.get("os_features").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `os_features` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("os_features").toString()));
        }
        if ((jsonObj.get("os_version") != null && !jsonObj.get("os_version").isJsonNull())
                && !jsonObj.get("os_version").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `os_version` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("os_version").toString()));
        }
        if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull())
                && !jsonObj.get("subject").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `subject` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("subject").toString()));
        }
        if ((jsonObj.get("variant") != null && !jsonObj.get("variant").isJsonNull())
                && !jsonObj.get("variant").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `variant` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("variant").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ManifestAddArtifactOptions.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ManifestAddArtifactOptions' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ManifestAddArtifactOptions> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ManifestAddArtifactOptions.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ManifestAddArtifactOptions>() {
                        @Override
                        public void write(JsonWriter out, ManifestAddArtifactOptions value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ManifestAddArtifactOptions read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ManifestAddArtifactOptions given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ManifestAddArtifactOptions
     * @throws IOException if the JSON string is invalid with respect to ManifestAddArtifactOptions
     */
    public static ManifestAddArtifactOptions fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ManifestAddArtifactOptions.class);
    }

    /**
     * Convert an instance of ManifestAddArtifactOptions to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
