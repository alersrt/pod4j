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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.alersrt.pod4j.openapi.JSON;

/**
 * ContainerExecRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class ContainerExecRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTACH_STDERR = "AttachStderr";
  @SerializedName(SERIALIZED_NAME_ATTACH_STDERR)
  private Boolean attachStderr;

  public static final String SERIALIZED_NAME_ATTACH_STDIN = "AttachStdin";
  @SerializedName(SERIALIZED_NAME_ATTACH_STDIN)
  private Boolean attachStdin;

  public static final String SERIALIZED_NAME_ATTACH_STDOUT = "AttachStdout";
  @SerializedName(SERIALIZED_NAME_ATTACH_STDOUT)
  private Boolean attachStdout;

  public static final String SERIALIZED_NAME_CMD = "Cmd";
  @SerializedName(SERIALIZED_NAME_CMD)
  private List<String> cmd = new ArrayList<>();

  public static final String SERIALIZED_NAME_DETACH_KEYS = "DetachKeys";
  @SerializedName(SERIALIZED_NAME_DETACH_KEYS)
  private String detachKeys;

  public static final String SERIALIZED_NAME_ENV = "Env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<String> env = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRIVILEGED = "Privileged";
  @SerializedName(SERIALIZED_NAME_PRIVILEGED)
  private Boolean privileged = false;

  public static final String SERIALIZED_NAME_TTY = "Tty";
  @SerializedName(SERIALIZED_NAME_TTY)
  private Boolean tty;

  public static final String SERIALIZED_NAME_USER = "User";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_WORKING_DIR = "WorkingDir";
  @SerializedName(SERIALIZED_NAME_WORKING_DIR)
  private String workingDir;

  public ContainerExecRequest() {
  }

  public ContainerExecRequest attachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
    return this;
  }

  /**
   * Attach to stderr of the exec command
   * @return attachStderr
   */
  @jakarta.annotation.Nullable

  public Boolean getAttachStderr() {
    return attachStderr;
  }

  public void setAttachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
  }


  public ContainerExecRequest attachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
    return this;
  }

  /**
   * Attach to stdin of the exec command
   * @return attachStdin
   */
  @jakarta.annotation.Nullable

  public Boolean getAttachStdin() {
    return attachStdin;
  }

  public void setAttachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
  }


  public ContainerExecRequest attachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
    return this;
  }

  /**
   * Attach to stdout of the exec command
   * @return attachStdout
   */
  @jakarta.annotation.Nullable

  public Boolean getAttachStdout() {
    return attachStdout;
  }

  public void setAttachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
  }


  public ContainerExecRequest cmd(List<String> cmd) {
    this.cmd = cmd;
    return this;
  }

  public ContainerExecRequest addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

  /**
   * Command to run, as a string or array of strings.
   * @return cmd
   */
  @jakarta.annotation.Nullable

  public List<String> getCmd() {
    return cmd;
  }

  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }


  public ContainerExecRequest detachKeys(String detachKeys) {
    this.detachKeys = detachKeys;
    return this;
  }

  /**
   * \&quot;Override the key sequence for detaching a container. Format is a single character [a-Z] or ctrl-&lt;value&gt; where &lt;value&gt; is one of: a-z, @, ^, [, , or _.\&quot; 
   * @return detachKeys
   */
  @jakarta.annotation.Nullable

  public String getDetachKeys() {
    return detachKeys;
  }

  public void setDetachKeys(String detachKeys) {
    this.detachKeys = detachKeys;
  }


  public ContainerExecRequest env(List<String> env) {
    this.env = env;
    return this;
  }

  public ContainerExecRequest addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * A list of environment variables in the form [\&quot;VAR&#x3D;value\&quot;, ...]
   * @return env
   */
  @jakarta.annotation.Nullable

  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }


  public ContainerExecRequest privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Runs the exec process with extended privileges
   * @return privileged
   */
  @jakarta.annotation.Nullable

  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }


  public ContainerExecRequest tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Allocate a pseudo-TTY
   * @return tty
   */
  @jakarta.annotation.Nullable

  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }


  public ContainerExecRequest user(String user) {
    this.user = user;
    return this;
  }

  /**
   * \&quot;The user, and optionally, group to run the exec process inside the container. Format is one of: user, user:group, uid, or uid:gid.\&quot; 
   * @return user
   */
  @jakarta.annotation.Nullable

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  public ContainerExecRequest workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  /**
   * The working directory for the exec process inside the container.
   * @return workingDir
   */
  @jakarta.annotation.Nullable

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
    ContainerExecRequest containerExecRequest = (ContainerExecRequest) o;
    return Objects.equals(this.attachStderr, containerExecRequest.attachStderr) &&
        Objects.equals(this.attachStdin, containerExecRequest.attachStdin) &&
        Objects.equals(this.attachStdout, containerExecRequest.attachStdout) &&
        Objects.equals(this.cmd, containerExecRequest.cmd) &&
        Objects.equals(this.detachKeys, containerExecRequest.detachKeys) &&
        Objects.equals(this.env, containerExecRequest.env) &&
        Objects.equals(this.privileged, containerExecRequest.privileged) &&
        Objects.equals(this.tty, containerExecRequest.tty) &&
        Objects.equals(this.user, containerExecRequest.user) &&
        Objects.equals(this.workingDir, containerExecRequest.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachStderr, attachStdin, attachStdout, cmd, detachKeys, env, privileged, tty, user, workingDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerExecRequest {\n");
    sb.append("    attachStderr: ").append(toIndentedString(attachStderr)).append("\n");
    sb.append("    attachStdin: ").append(toIndentedString(attachStdin)).append("\n");
    sb.append("    attachStdout: ").append(toIndentedString(attachStdout)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    detachKeys: ").append(toIndentedString(detachKeys)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("AttachStderr");
    openapiFields.add("AttachStdin");
    openapiFields.add("AttachStdout");
    openapiFields.add("Cmd");
    openapiFields.add("DetachKeys");
    openapiFields.add("Env");
    openapiFields.add("Privileged");
    openapiFields.add("Tty");
    openapiFields.add("User");
    openapiFields.add("WorkingDir");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerExecRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerExecRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerExecRequest is not found in the empty JSON string", ContainerExecRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerExecRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerExecRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Cmd") != null && !jsonObj.get("Cmd").isJsonNull() && !jsonObj.get("Cmd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Cmd` to be an array in the JSON string but got `%s`", jsonObj.get("Cmd").toString()));
      }
      if ((jsonObj.get("DetachKeys") != null && !jsonObj.get("DetachKeys").isJsonNull()) && !jsonObj.get("DetachKeys").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DetachKeys` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DetachKeys").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Env") != null && !jsonObj.get("Env").isJsonNull() && !jsonObj.get("Env").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Env` to be an array in the JSON string but got `%s`", jsonObj.get("Env").toString()));
      }
      if ((jsonObj.get("User") != null && !jsonObj.get("User").isJsonNull()) && !jsonObj.get("User").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `User` to be a primitive type in the JSON string but got `%s`", jsonObj.get("User").toString()));
      }
      if ((jsonObj.get("WorkingDir") != null && !jsonObj.get("WorkingDir").isJsonNull()) && !jsonObj.get("WorkingDir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkingDir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkingDir").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerExecRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerExecRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerExecRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerExecRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerExecRequest>() {
           @Override
           public void write(JsonWriter out, ContainerExecRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerExecRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerExecRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerExecRequest
   * @throws IOException if the JSON string is invalid with respect to ContainerExecRequest
   */
  public static ContainerExecRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerExecRequest.class);
  }

  /**
   * Convert an instance of ContainerExecRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

