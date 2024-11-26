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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** LinuxDevice represents the mknod information for a Linux special device file */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-26T18:05:51.842033247+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class LinuxDevice {
    public static final String SERIALIZED_NAME_FILE_MODE = "fileMode";

    @SerializedName(SERIALIZED_NAME_FILE_MODE)
    private Integer fileMode;

    public static final String SERIALIZED_NAME_GID = "gid";

    @SerializedName(SERIALIZED_NAME_GID)
    private Integer gid;

    public static final String SERIALIZED_NAME_MAJOR = "major";

    @SerializedName(SERIALIZED_NAME_MAJOR)
    private Long major;

    public static final String SERIALIZED_NAME_MINOR = "minor";

    @SerializedName(SERIALIZED_NAME_MINOR)
    private Long minor;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_UID = "uid";

    @SerializedName(SERIALIZED_NAME_UID)
    private Integer uid;

    public LinuxDevice() {}

    public LinuxDevice fileMode(Integer fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * The bits have the same definition on all systems, so that information about files can be
     * moved from one system to another portably. Not all bits apply to all systems. The only
     * required bit is [ModeDir] for directories.
     *
     * @return fileMode
     */
    @javax.annotation.Nullable
    public Integer getFileMode() {
        return fileMode;
    }

    public void setFileMode(Integer fileMode) {
        this.fileMode = fileMode;
    }

    public LinuxDevice gid(Integer gid) {
        this.gid = gid;
        return this;
    }

    /**
     * Gid of the device.
     *
     * @return gid
     */
    @javax.annotation.Nullable
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public LinuxDevice major(Long major) {
        this.major = major;
        return this;
    }

    /**
     * Major is the device&#39;s major number.
     *
     * @return major
     */
    @javax.annotation.Nullable
    public Long getMajor() {
        return major;
    }

    public void setMajor(Long major) {
        this.major = major;
    }

    public LinuxDevice minor(Long minor) {
        this.minor = minor;
        return this;
    }

    /**
     * Minor is the device&#39;s minor number.
     *
     * @return minor
     */
    @javax.annotation.Nullable
    public Long getMinor() {
        return minor;
    }

    public void setMinor(Long minor) {
        this.minor = minor;
    }

    public LinuxDevice path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Path to the device.
     *
     * @return path
     */
    @javax.annotation.Nullable
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LinuxDevice type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Device type, block, char, etc.
     *
     * @return type
     */
    @javax.annotation.Nullable
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LinuxDevice uid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * UID of the device.
     *
     * @return uid
     */
    @javax.annotation.Nullable
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinuxDevice linuxDevice = (LinuxDevice) o;
        return Objects.equals(this.fileMode, linuxDevice.fileMode)
                && Objects.equals(this.gid, linuxDevice.gid)
                && Objects.equals(this.major, linuxDevice.major)
                && Objects.equals(this.minor, linuxDevice.minor)
                && Objects.equals(this.path, linuxDevice.path)
                && Objects.equals(this.type, linuxDevice.type)
                && Objects.equals(this.uid, linuxDevice.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileMode, gid, major, minor, path, type, uid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinuxDevice {\n");
        sb.append("    fileMode: ").append(toIndentedString(fileMode)).append("\n");
        sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
        sb.append("    major: ").append(toIndentedString(major)).append("\n");
        sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
        openapiFields.add("fileMode");
        openapiFields.add("gid");
        openapiFields.add("major");
        openapiFields.add("minor");
        openapiFields.add("path");
        openapiFields.add("type");
        openapiFields.add("uid");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to LinuxDevice
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!LinuxDevice.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in LinuxDevice is not found in the empty"
                                        + " JSON string",
                                LinuxDevice.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!LinuxDevice.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `LinuxDevice` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull())
                && !jsonObj.get("path").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `path` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("path").toString()));
        }
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LinuxDevice.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LinuxDevice' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LinuxDevice> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(LinuxDevice.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LinuxDevice>() {
                        @Override
                        public void write(JsonWriter out, LinuxDevice value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LinuxDevice read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LinuxDevice given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LinuxDevice
     * @throws IOException if the JSON string is invalid with respect to LinuxDevice
     */
    public static LinuxDevice fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LinuxDevice.class);
    }

    /**
     * Convert an instance of LinuxDevice to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
