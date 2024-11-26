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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ManifestRemoveReport */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-26T18:05:51.842033247+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class ManifestRemoveReport {
    public static final String SERIALIZED_NAME_DELETED = "Deleted";

    @SerializedName(SERIALIZED_NAME_DELETED)
    private List<String> deleted = new ArrayList<>();

    public static final String SERIALIZED_NAME_ERRORS = "Errors";

    @SerializedName(SERIALIZED_NAME_ERRORS)
    private List<String> errors = new ArrayList<>();

    public static final String SERIALIZED_NAME_EXIT_CODE = "ExitCode";

    @SerializedName(SERIALIZED_NAME_EXIT_CODE)
    private Long exitCode;

    public static final String SERIALIZED_NAME_UNTAGGED = "Untagged";

    @SerializedName(SERIALIZED_NAME_UNTAGGED)
    private List<String> untagged = new ArrayList<>();

    public ManifestRemoveReport() {}

    public ManifestRemoveReport deleted(List<String> deleted) {
        this.deleted = deleted;
        return this;
    }

    public ManifestRemoveReport addDeletedItem(String deletedItem) {
        if (this.deleted == null) {
            this.deleted = new ArrayList<>();
        }
        this.deleted.add(deletedItem);
        return this;
    }

    /**
     * Deleted manifest list.
     *
     * @return deleted
     */
    @javax.annotation.Nullable
    public List<String> getDeleted() {
        return deleted;
    }

    public void setDeleted(List<String> deleted) {
        this.deleted = deleted;
    }

    public ManifestRemoveReport errors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public ManifestRemoveReport addErrorsItem(String errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Errors associated with operation
     *
     * @return errors
     */
    @javax.annotation.Nullable
    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public ManifestRemoveReport exitCode(Long exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * ExitCode describes the exit codes as described in the &#x60;podman rmi&#x60; man page.
     *
     * @return exitCode
     */
    @javax.annotation.Nullable
    public Long getExitCode() {
        return exitCode;
    }

    public void setExitCode(Long exitCode) {
        this.exitCode = exitCode;
    }

    public ManifestRemoveReport untagged(List<String> untagged) {
        this.untagged = untagged;
        return this;
    }

    public ManifestRemoveReport addUntaggedItem(String untaggedItem) {
        if (this.untagged == null) {
            this.untagged = new ArrayList<>();
        }
        this.untagged.add(untaggedItem);
        return this;
    }

    /**
     * Untagged images. Can be longer than Deleted.
     *
     * @return untagged
     */
    @javax.annotation.Nullable
    public List<String> getUntagged() {
        return untagged;
    }

    public void setUntagged(List<String> untagged) {
        this.untagged = untagged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManifestRemoveReport manifestRemoveReport = (ManifestRemoveReport) o;
        return Objects.equals(this.deleted, manifestRemoveReport.deleted)
                && Objects.equals(this.errors, manifestRemoveReport.errors)
                && Objects.equals(this.exitCode, manifestRemoveReport.exitCode)
                && Objects.equals(this.untagged, manifestRemoveReport.untagged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleted, errors, exitCode, untagged);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManifestRemoveReport {\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
        sb.append("    untagged: ").append(toIndentedString(untagged)).append("\n");
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
        openapiFields.add("Deleted");
        openapiFields.add("Errors");
        openapiFields.add("ExitCode");
        openapiFields.add("Untagged");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ManifestRemoveReport
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ManifestRemoveReport.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ManifestRemoveReport is not found in"
                                        + " the empty JSON string",
                                ManifestRemoveReport.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ManifestRemoveReport.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ManifestRemoveReport` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("Deleted") != null
                && !jsonObj.get("Deleted").isJsonNull()
                && !jsonObj.get("Deleted").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Deleted` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Deleted").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Errors") != null
                && !jsonObj.get("Errors").isJsonNull()
                && !jsonObj.get("Errors").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Errors` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Errors").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Untagged") != null
                && !jsonObj.get("Untagged").isJsonNull()
                && !jsonObj.get("Untagged").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Untagged` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("Untagged").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ManifestRemoveReport.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ManifestRemoveReport' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ManifestRemoveReport> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ManifestRemoveReport.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ManifestRemoveReport>() {
                        @Override
                        public void write(JsonWriter out, ManifestRemoveReport value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ManifestRemoveReport read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ManifestRemoveReport given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ManifestRemoveReport
     * @throws IOException if the JSON string is invalid with respect to ManifestRemoveReport
     */
    public static ManifestRemoveReport fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ManifestRemoveReport.class);
    }

    /**
     * Convert an instance of ManifestRemoveReport to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
