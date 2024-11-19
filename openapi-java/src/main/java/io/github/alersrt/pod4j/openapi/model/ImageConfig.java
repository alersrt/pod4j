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

/** ImageConfig */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class ImageConfig {
    public static final String SERIALIZED_NAME_ARGS_ESCAPED = "ArgsEscaped";

    @SerializedName(SERIALIZED_NAME_ARGS_ESCAPED)
    private Boolean argsEscaped;

    public static final String SERIALIZED_NAME_CMD = "Cmd";

    @SerializedName(SERIALIZED_NAME_CMD)
    private List<String> cmd = new ArrayList<>();

    public static final String SERIALIZED_NAME_ENTRYPOINT = "Entrypoint";

    @SerializedName(SERIALIZED_NAME_ENTRYPOINT)
    private List<String> entrypoint = new ArrayList<>();

    public static final String SERIALIZED_NAME_ENV = "Env";

    @SerializedName(SERIALIZED_NAME_ENV)
    private List<String> env = new ArrayList<>();

    public static final String SERIALIZED_NAME_EXPOSED_PORTS = "ExposedPorts";

    @SerializedName(SERIALIZED_NAME_EXPOSED_PORTS)
    private Map<String, Object> exposedPorts = new HashMap<>();

    public static final String SERIALIZED_NAME_LABELS = "Labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private Map<String, String> labels = new HashMap<>();

    public static final String SERIALIZED_NAME_STOP_SIGNAL = "StopSignal";

    @SerializedName(SERIALIZED_NAME_STOP_SIGNAL)
    private String stopSignal;

    public static final String SERIALIZED_NAME_USER = "User";

    @SerializedName(SERIALIZED_NAME_USER)
    private String user;

    public static final String SERIALIZED_NAME_VOLUMES = "Volumes";

    @SerializedName(SERIALIZED_NAME_VOLUMES)
    private Map<String, Object> volumes = new HashMap<>();

    public static final String SERIALIZED_NAME_WORKING_DIR = "WorkingDir";

    @SerializedName(SERIALIZED_NAME_WORKING_DIR)
    private String workingDir;

    public ImageConfig() {}

    public ImageConfig argsEscaped(Boolean argsEscaped) {
        this.argsEscaped = argsEscaped;
        return this;
    }

    /**
     * ArgsEscaped Deprecated: This field is present only for legacy compatibility with Docker and
     * should not be used by new image builders. It is used by Docker for Windows images to indicate
     * that the &#x60;Entrypoint&#x60; or &#x60;Cmd&#x60; or both, contains only a single element
     * array, that is a pre-escaped, and combined into a single string &#x60;CommandLine&#x60;. If
     * &#x60;true&#x60; the value in &#x60;Entrypoint&#x60; or &#x60;Cmd&#x60; should be used as-is
     * to avoid double escaping. https://github.com/opencontainers/image-spec/pull/892
     *
     * @return argsEscaped
     */
    @javax.annotation.Nullable
    public Boolean getArgsEscaped() {
        return argsEscaped;
    }

    public void setArgsEscaped(Boolean argsEscaped) {
        this.argsEscaped = argsEscaped;
    }

    public ImageConfig cmd(List<String> cmd) {
        this.cmd = cmd;
        return this;
    }

    public ImageConfig addCmdItem(String cmdItem) {
        if (this.cmd == null) {
            this.cmd = new ArrayList<>();
        }
        this.cmd.add(cmdItem);
        return this;
    }

    /**
     * Cmd defines the default arguments to the entrypoint of the container.
     *
     * @return cmd
     */
    @javax.annotation.Nullable
    public List<String> getCmd() {
        return cmd;
    }

    public void setCmd(List<String> cmd) {
        this.cmd = cmd;
    }

    public ImageConfig entrypoint(List<String> entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    public ImageConfig addEntrypointItem(String entrypointItem) {
        if (this.entrypoint == null) {
            this.entrypoint = new ArrayList<>();
        }
        this.entrypoint.add(entrypointItem);
        return this;
    }

    /**
     * Entrypoint defines a list of arguments to use as the command to execute when the container
     * starts.
     *
     * @return entrypoint
     */
    @javax.annotation.Nullable
    public List<String> getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(List<String> entrypoint) {
        this.entrypoint = entrypoint;
    }

    public ImageConfig env(List<String> env) {
        this.env = env;
        return this;
    }

    public ImageConfig addEnvItem(String envItem) {
        if (this.env == null) {
            this.env = new ArrayList<>();
        }
        this.env.add(envItem);
        return this;
    }

    /**
     * Env is a list of environment variables to be used in a container.
     *
     * @return env
     */
    @javax.annotation.Nullable
    public List<String> getEnv() {
        return env;
    }

    public void setEnv(List<String> env) {
        this.env = env;
    }

    public ImageConfig exposedPorts(Map<String, Object> exposedPorts) {
        this.exposedPorts = exposedPorts;
        return this;
    }

    public ImageConfig putExposedPortsItem(String key, Object exposedPortsItem) {
        if (this.exposedPorts == null) {
            this.exposedPorts = new HashMap<>();
        }
        this.exposedPorts.put(key, exposedPortsItem);
        return this;
    }

    /**
     * ExposedPorts a set of ports to expose from a container running this image.
     *
     * @return exposedPorts
     */
    @javax.annotation.Nullable
    public Map<String, Object> getExposedPorts() {
        return exposedPorts;
    }

    public void setExposedPorts(Map<String, Object> exposedPorts) {
        this.exposedPorts = exposedPorts;
    }

    public ImageConfig labels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public ImageConfig putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    /**
     * Labels contains arbitrary metadata for the container.
     *
     * @return labels
     */
    @javax.annotation.Nullable
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public ImageConfig stopSignal(String stopSignal) {
        this.stopSignal = stopSignal;
        return this;
    }

    /**
     * StopSignal contains the system call signal that will be sent to the container to exit.
     *
     * @return stopSignal
     */
    @javax.annotation.Nullable
    public String getStopSignal() {
        return stopSignal;
    }

    public void setStopSignal(String stopSignal) {
        this.stopSignal = stopSignal;
    }

    public ImageConfig user(String user) {
        this.user = user;
        return this;
    }

    /**
     * User defines the username or UID which the process in the container should run as.
     *
     * @return user
     */
    @javax.annotation.Nullable
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ImageConfig volumes(Map<String, Object> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ImageConfig putVolumesItem(String key, Object volumesItem) {
        if (this.volumes == null) {
            this.volumes = new HashMap<>();
        }
        this.volumes.put(key, volumesItem);
        return this;
    }

    /**
     * Volumes is a set of directories describing where the process is likely write data specific to
     * a container instance.
     *
     * @return volumes
     */
    @javax.annotation.Nullable
    public Map<String, Object> getVolumes() {
        return volumes;
    }

    public void setVolumes(Map<String, Object> volumes) {
        this.volumes = volumes;
    }

    public ImageConfig workingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * WorkingDir sets the current working directory of the entrypoint process in the container.
     *
     * @return workingDir
     */
    @javax.annotation.Nullable
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageConfig imageConfig = (ImageConfig) o;
        return Objects.equals(this.argsEscaped, imageConfig.argsEscaped)
                && Objects.equals(this.cmd, imageConfig.cmd)
                && Objects.equals(this.entrypoint, imageConfig.entrypoint)
                && Objects.equals(this.env, imageConfig.env)
                && Objects.equals(this.exposedPorts, imageConfig.exposedPorts)
                && Objects.equals(this.labels, imageConfig.labels)
                && Objects.equals(this.stopSignal, imageConfig.stopSignal)
                && Objects.equals(this.user, imageConfig.user)
                && Objects.equals(this.volumes, imageConfig.volumes)
                && Objects.equals(this.workingDir, imageConfig.workingDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                argsEscaped,
                cmd,
                entrypoint,
                env,
                exposedPorts,
                labels,
                stopSignal,
                user,
                volumes,
                workingDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageConfig {\n");
        sb.append("    argsEscaped: ").append(toIndentedString(argsEscaped)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
        sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
        sb.append("    exposedPorts: ").append(toIndentedString(exposedPorts)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    stopSignal: ").append(toIndentedString(stopSignal)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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
        openapiFields.add("ArgsEscaped");
        openapiFields.add("Cmd");
        openapiFields.add("Entrypoint");
        openapiFields.add("Env");
        openapiFields.add("ExposedPorts");
        openapiFields.add("Labels");
        openapiFields.add("StopSignal");
        openapiFields.add("User");
        openapiFields.add("Volumes");
        openapiFields.add("WorkingDir");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ImageConfig
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ImageConfig.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ImageConfig is not found in the empty"
                                        + " JSON string",
                                ImageConfig.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ImageConfig.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ImageConfig` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("Cmd") != null
                && !jsonObj.get("Cmd").isJsonNull()
                && !jsonObj.get("Cmd").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Cmd` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Cmd").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Entrypoint") != null
                && !jsonObj.get("Entrypoint").isJsonNull()
                && !jsonObj.get("Entrypoint").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Entrypoint` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("Entrypoint").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Env") != null
                && !jsonObj.get("Env").isJsonNull()
                && !jsonObj.get("Env").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Env` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Env").toString()));
        }
        if ((jsonObj.get("StopSignal") != null && !jsonObj.get("StopSignal").isJsonNull())
                && !jsonObj.get("StopSignal").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `StopSignal` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("StopSignal").toString()));
        }
        if ((jsonObj.get("User") != null && !jsonObj.get("User").isJsonNull())
                && !jsonObj.get("User").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `User` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("User").toString()));
        }
        if ((jsonObj.get("WorkingDir") != null && !jsonObj.get("WorkingDir").isJsonNull())
                && !jsonObj.get("WorkingDir").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `WorkingDir` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("WorkingDir").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ImageConfig.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ImageConfig' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImageConfig> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ImageConfig.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ImageConfig>() {
                        @Override
                        public void write(JsonWriter out, ImageConfig value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ImageConfig read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ImageConfig given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ImageConfig
     * @throws IOException if the JSON string is invalid with respect to ImageConfig
     */
    public static ImageConfig fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ImageConfig.class);
    }

    /**
     * Convert an instance of ImageConfig to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
