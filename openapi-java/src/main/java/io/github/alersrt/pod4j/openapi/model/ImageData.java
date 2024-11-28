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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.JSON;
import jakarta.validation.Valid;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * ImageData
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T01:29:49.168634544+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ImageData {
    public static final String SERIALIZED_NAME_ANNOTATIONS = "Annotations";
    public static final String SERIALIZED_NAME_ARCHITECTURE = "Architecture";
    public static final String SERIALIZED_NAME_AUTHOR = "Author";
    public static final String SERIALIZED_NAME_COMMENT = "Comment";
    public static final String SERIALIZED_NAME_CONFIG = "Config";
    public static final String SERIALIZED_NAME_CREATED = "Created";
    public static final String SERIALIZED_NAME_DIGEST = "Digest";
    public static final String SERIALIZED_NAME_GRAPH_DRIVER = "GraphDriver";
    public static final String SERIALIZED_NAME_HEALTHCHECK = "Healthcheck";
    public static final String SERIALIZED_NAME_HISTORY = "History";
    public static final String SERIALIZED_NAME_ID = "Id";
    public static final String SERIALIZED_NAME_LABELS = "Labels";
    public static final String SERIALIZED_NAME_MANIFEST_TYPE = "ManifestType";
    public static final String SERIALIZED_NAME_NAMES_HISTORY = "NamesHistory";
    public static final String SERIALIZED_NAME_OS = "Os";
    public static final String SERIALIZED_NAME_PARENT = "Parent";
    public static final String SERIALIZED_NAME_REPO_DIGESTS = "RepoDigests";
    public static final String SERIALIZED_NAME_REPO_TAGS = "RepoTags";
    public static final String SERIALIZED_NAME_ROOT_F_S = "RootFS";
    public static final String SERIALIZED_NAME_SIZE = "Size";
    public static final String SERIALIZED_NAME_USER = "User";
    public static final String SERIALIZED_NAME_VERSION = "Version";
    public static final String SERIALIZED_NAME_VIRTUAL_SIZE = "VirtualSize";
    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("Annotations");
        openapiFields.add("Architecture");
        openapiFields.add("Author");
        openapiFields.add("Comment");
        openapiFields.add("Config");
        openapiFields.add("Created");
        openapiFields.add("Digest");
        openapiFields.add("GraphDriver");
        openapiFields.add("Healthcheck");
        openapiFields.add("History");
        openapiFields.add("Id");
        openapiFields.add("Labels");
        openapiFields.add("ManifestType");
        openapiFields.add("NamesHistory");
        openapiFields.add("Os");
        openapiFields.add("Parent");
        openapiFields.add("RepoDigests");
        openapiFields.add("RepoTags");
        openapiFields.add("RootFS");
        openapiFields.add("Size");
        openapiFields.add("User");
        openapiFields.add("Version");
        openapiFields.add("VirtualSize");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
    private Map<String, String> annotations = new HashMap<>();
    @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
    private String architecture;
    @SerializedName(SERIALIZED_NAME_AUTHOR)
    private String author;
    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;
    @SerializedName(SERIALIZED_NAME_CONFIG)
    private ImageConfig config;
    @SerializedName(SERIALIZED_NAME_CREATED)
    private OffsetDateTime created;
    @SerializedName(SERIALIZED_NAME_DIGEST)
    private String digest;
    @SerializedName(SERIALIZED_NAME_GRAPH_DRIVER)
    private DriverData graphDriver;
    @SerializedName(SERIALIZED_NAME_HEALTHCHECK)
    private Schema2HealthConfig healthcheck;
    @SerializedName(SERIALIZED_NAME_HISTORY)
    private List<@Valid History> history = new ArrayList<>();
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;
    @SerializedName(SERIALIZED_NAME_LABELS)
    private Map<String, String> labels = new HashMap<>();
    @SerializedName(SERIALIZED_NAME_MANIFEST_TYPE)
    private String manifestType;
    @SerializedName(SERIALIZED_NAME_NAMES_HISTORY)
    private List<String> namesHistory = new ArrayList<>();
    @SerializedName(SERIALIZED_NAME_OS)
    private String os;
    @SerializedName(SERIALIZED_NAME_PARENT)
    private String parent;
    @SerializedName(SERIALIZED_NAME_REPO_DIGESTS)
    private List<String> repoDigests = new ArrayList<>();
    @SerializedName(SERIALIZED_NAME_REPO_TAGS)
    private List<String> repoTags = new ArrayList<>();
    @SerializedName(SERIALIZED_NAME_ROOT_F_S)
    private RootFS rootFS;
    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;
    @SerializedName(SERIALIZED_NAME_USER)
    private String user;
    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;
    @SerializedName(SERIALIZED_NAME_VIRTUAL_SIZE)
    private Long virtualSize;

    public ImageData() {
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ImageData
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ImageData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in ImageData is not found in the empty JSON string", ImageData.openapiRequiredFields));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ImageData.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImageData` properties. JSON: %s", entry.getKey(), jsonElement));
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
            ImageConfig.validateJsonElement(jsonObj.get("Config"));
        }
        if ((jsonObj.get("Digest") != null && !jsonObj.get("Digest").isJsonNull()) && !jsonObj.get("Digest").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Digest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Digest").toString()));
        }
        // validate the optional field `GraphDriver`
        if (jsonObj.get("GraphDriver") != null && !jsonObj.get("GraphDriver").isJsonNull()) {
            DriverData.validateJsonElement(jsonObj.get("GraphDriver"));
        }
        // validate the optional field `Healthcheck`
        if (jsonObj.get("Healthcheck") != null && !jsonObj.get("Healthcheck").isJsonNull()) {
            Schema2HealthConfig.validateJsonElement(jsonObj.get("Healthcheck"));
        }
        if (jsonObj.get("History") != null && !jsonObj.get("History").isJsonNull()) {
            JsonArray jsonArrayhistory = jsonObj.getAsJsonArray("History");
            if (jsonArrayhistory != null) {
                // ensure the json data is an array
                if (!jsonObj.get("History").isJsonArray()) {
                    throw new IllegalArgumentException(String.format("Expected the field `History` to be an array in the JSON string but got `%s`", jsonObj.get("History").toString()));
                }

                // validate the optional field `History` (array)
                for (int i = 0; i < jsonArrayhistory.size(); i++) {
                    History.validateJsonElement(jsonArrayhistory.get(i));
                }
            }
        }
        if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
        }
        if ((jsonObj.get("ManifestType") != null && !jsonObj.get("ManifestType").isJsonNull()) && !jsonObj.get("ManifestType").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `ManifestType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ManifestType").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("NamesHistory") != null && !jsonObj.get("NamesHistory").isJsonNull() && !jsonObj.get("NamesHistory").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `NamesHistory` to be an array in the JSON string but got `%s`", jsonObj.get("NamesHistory").toString()));
        }
        if ((jsonObj.get("Os") != null && !jsonObj.get("Os").isJsonNull()) && !jsonObj.get("Os").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Os").toString()));
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
        if ((jsonObj.get("User") != null && !jsonObj.get("User").isJsonNull()) && !jsonObj.get("User").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `User` to be a primitive type in the JSON string but got `%s`", jsonObj.get("User").toString()));
        }
        if ((jsonObj.get("Version") != null && !jsonObj.get("Version").isJsonNull()) && !jsonObj.get("Version").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Version").toString()));
        }
    }

    /**
     * Create an instance of ImageData given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ImageData
     * @throws IOException if the JSON string is invalid with respect to ImageData
     */
    public static ImageData fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ImageData.class);
    }

    public ImageData annotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public ImageData putAnnotationsItem(String key, String annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    /**
     * Get annotations
     *
     * @return annotations
     */
    @jakarta.annotation.Nullable

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public ImageData architecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * Get architecture
     *
     * @return architecture
     */
    @jakarta.annotation.Nullable

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public ImageData author(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     *
     * @return author
     */
    @jakarta.annotation.Nullable

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ImageData comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get comment
     *
     * @return comment
     */
    @jakarta.annotation.Nullable

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ImageData config(ImageConfig config) {
        this.config = config;
        return this;
    }

    /**
     * Get config
     *
     * @return config
     */
    @jakarta.annotation.Nullable
    @Valid

    public ImageConfig getConfig() {
        return config;
    }

    public void setConfig(ImageConfig config) {
        this.config = config;
    }

    public ImageData created(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get created
     *
     * @return created
     */
    @jakarta.annotation.Nullable
    @Valid

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public ImageData digest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * The following is an example of the contents of Digest types:  sha256:7173b809ca12ec5dee4506cd86be934c4596dd234ee82c0662eac04a8c2c71dc  This allows to abstract the digest behind this type and work only in those terms.
     *
     * @return digest
     */
    @jakarta.annotation.Nullable

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public ImageData graphDriver(DriverData graphDriver) {
        this.graphDriver = graphDriver;
        return this;
    }

    /**
     * Get graphDriver
     *
     * @return graphDriver
     */
    @jakarta.annotation.Nullable
    @Valid

    public DriverData getGraphDriver() {
        return graphDriver;
    }

    public void setGraphDriver(DriverData graphDriver) {
        this.graphDriver = graphDriver;
    }

    public ImageData healthcheck(Schema2HealthConfig healthcheck) {
        this.healthcheck = healthcheck;
        return this;
    }

    /**
     * Get healthcheck
     *
     * @return healthcheck
     */
    @jakarta.annotation.Nullable
    @Valid

    public Schema2HealthConfig getHealthcheck() {
        return healthcheck;
    }

    public void setHealthcheck(Schema2HealthConfig healthcheck) {
        this.healthcheck = healthcheck;
    }

    public ImageData history(List<@Valid History> history) {
        this.history = history;
        return this;
    }

    public ImageData addHistoryItem(History historyItem) {
        if (this.history == null) {
            this.history = new ArrayList<>();
        }
        this.history.add(historyItem);
        return this;
    }

    /**
     * Get history
     *
     * @return history
     */
    @jakarta.annotation.Nullable
    @Valid

    public List<@Valid History> getHistory() {
        return history;
    }

    public void setHistory(List<@Valid History> history) {
        this.history = history;
    }

    public ImageData id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @jakarta.annotation.Nullable

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageData labels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public ImageData putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @jakarta.annotation.Nullable

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public ImageData manifestType(String manifestType) {
        this.manifestType = manifestType;
        return this;
    }

    /**
     * Get manifestType
     *
     * @return manifestType
     */
    @jakarta.annotation.Nullable

    public String getManifestType() {
        return manifestType;
    }

    public void setManifestType(String manifestType) {
        this.manifestType = manifestType;
    }

    public ImageData namesHistory(List<String> namesHistory) {
        this.namesHistory = namesHistory;
        return this;
    }

    public ImageData addNamesHistoryItem(String namesHistoryItem) {
        if (this.namesHistory == null) {
            this.namesHistory = new ArrayList<>();
        }
        this.namesHistory.add(namesHistoryItem);
        return this;
    }

    /**
     * Get namesHistory
     *
     * @return namesHistory
     */
    @jakarta.annotation.Nullable

    public List<String> getNamesHistory() {
        return namesHistory;
    }

    public void setNamesHistory(List<String> namesHistory) {
        this.namesHistory = namesHistory;
    }

    public ImageData os(String os) {
        this.os = os;
        return this;
    }

    /**
     * Get os
     *
     * @return os
     */
    @jakarta.annotation.Nullable

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public ImageData parent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get parent
     *
     * @return parent
     */
    @jakarta.annotation.Nullable

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public ImageData repoDigests(List<String> repoDigests) {
        this.repoDigests = repoDigests;
        return this;
    }

    public ImageData addRepoDigestsItem(String repoDigestsItem) {
        if (this.repoDigests == null) {
            this.repoDigests = new ArrayList<>();
        }
        this.repoDigests.add(repoDigestsItem);
        return this;
    }

    /**
     * Get repoDigests
     *
     * @return repoDigests
     */
    @jakarta.annotation.Nullable

    public List<String> getRepoDigests() {
        return repoDigests;
    }

    public void setRepoDigests(List<String> repoDigests) {
        this.repoDigests = repoDigests;
    }

    public ImageData repoTags(List<String> repoTags) {
        this.repoTags = repoTags;
        return this;
    }

    public ImageData addRepoTagsItem(String repoTagsItem) {
        if (this.repoTags == null) {
            this.repoTags = new ArrayList<>();
        }
        this.repoTags.add(repoTagsItem);
        return this;
    }

    /**
     * Get repoTags
     *
     * @return repoTags
     */
    @jakarta.annotation.Nullable

    public List<String> getRepoTags() {
        return repoTags;
    }

    public void setRepoTags(List<String> repoTags) {
        this.repoTags = repoTags;
    }

    public ImageData rootFS(RootFS rootFS) {
        this.rootFS = rootFS;
        return this;
    }

    /**
     * Get rootFS
     *
     * @return rootFS
     */
    @jakarta.annotation.Nullable
    @Valid

    public RootFS getRootFS() {
        return rootFS;
    }

    public void setRootFS(RootFS rootFS) {
        this.rootFS = rootFS;
    }

    public ImageData size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @jakarta.annotation.Nullable

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ImageData user(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     */
    @jakarta.annotation.Nullable

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ImageData version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @jakarta.annotation.Nullable

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ImageData virtualSize(Long virtualSize) {
        this.virtualSize = virtualSize;
        return this;
    }

    /**
     * Get virtualSize
     *
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
        ImageData imageData = (ImageData) o;
        return Objects.equals(this.annotations, imageData.annotations) &&
                Objects.equals(this.architecture, imageData.architecture) &&
                Objects.equals(this.author, imageData.author) &&
                Objects.equals(this.comment, imageData.comment) &&
                Objects.equals(this.config, imageData.config) &&
                Objects.equals(this.created, imageData.created) &&
                Objects.equals(this.digest, imageData.digest) &&
                Objects.equals(this.graphDriver, imageData.graphDriver) &&
                Objects.equals(this.healthcheck, imageData.healthcheck) &&
                Objects.equals(this.history, imageData.history) &&
                Objects.equals(this.id, imageData.id) &&
                Objects.equals(this.labels, imageData.labels) &&
                Objects.equals(this.manifestType, imageData.manifestType) &&
                Objects.equals(this.namesHistory, imageData.namesHistory) &&
                Objects.equals(this.os, imageData.os) &&
                Objects.equals(this.parent, imageData.parent) &&
                Objects.equals(this.repoDigests, imageData.repoDigests) &&
                Objects.equals(this.repoTags, imageData.repoTags) &&
                Objects.equals(this.rootFS, imageData.rootFS) &&
                Objects.equals(this.size, imageData.size) &&
                Objects.equals(this.user, imageData.user) &&
                Objects.equals(this.version, imageData.version) &&
                Objects.equals(this.virtualSize, imageData.virtualSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotations, architecture, author, comment, config, created, digest, graphDriver, healthcheck, history, id, labels, manifestType, namesHistory, os, parent, repoDigests, repoTags, rootFS, size, user, version, virtualSize);
    }

    @Override
    public String toString() {
        String sb = "class ImageData {\n" +
                "    annotations: " + toIndentedString(annotations) + "\n" +
                "    architecture: " + toIndentedString(architecture) + "\n" +
                "    author: " + toIndentedString(author) + "\n" +
                "    comment: " + toIndentedString(comment) + "\n" +
                "    config: " + toIndentedString(config) + "\n" +
                "    created: " + toIndentedString(created) + "\n" +
                "    digest: " + toIndentedString(digest) + "\n" +
                "    graphDriver: " + toIndentedString(graphDriver) + "\n" +
                "    healthcheck: " + toIndentedString(healthcheck) + "\n" +
                "    history: " + toIndentedString(history) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    labels: " + toIndentedString(labels) + "\n" +
                "    manifestType: " + toIndentedString(manifestType) + "\n" +
                "    namesHistory: " + toIndentedString(namesHistory) + "\n" +
                "    os: " + toIndentedString(os) + "\n" +
                "    parent: " + toIndentedString(parent) + "\n" +
                "    repoDigests: " + toIndentedString(repoDigests) + "\n" +
                "    repoTags: " + toIndentedString(repoTags) + "\n" +
                "    rootFS: " + toIndentedString(rootFS) + "\n" +
                "    size: " + toIndentedString(size) + "\n" +
                "    user: " + toIndentedString(user) + "\n" +
                "    version: " + toIndentedString(version) + "\n" +
                "    virtualSize: " + toIndentedString(virtualSize) + "\n" +
                "}";
        return sb;
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
     * Convert an instance of ImageData to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ImageData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ImageData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImageData> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(ImageData.class));

            return (TypeAdapter<T>) new TypeAdapter<ImageData>() {
                @Override
                public void write(JsonWriter out, ImageData value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public ImageData read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }
}

