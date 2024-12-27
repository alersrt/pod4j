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
import io.github.alersrt.pod4j.openapi.model.InspectExecProcess;
import java.io.IOException;
import java.util.Arrays;
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
 * InspectExecSession
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T22:50:27.482487554+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class InspectExecSession implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CAN_REMOVE = "CanRemove";
  @SerializedName(SERIALIZED_NAME_CAN_REMOVE)
  private Boolean canRemove;

  public static final String SERIALIZED_NAME_CONTAINER_I_D = "ContainerID";
  @SerializedName(SERIALIZED_NAME_CONTAINER_I_D)
  private String containerID;

  public static final String SERIALIZED_NAME_DETACH_KEYS = "DetachKeys";
  @SerializedName(SERIALIZED_NAME_DETACH_KEYS)
  private String detachKeys;

  public static final String SERIALIZED_NAME_EXIT_CODE = "ExitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private Long exitCode;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_OPEN_STDERR = "OpenStderr";
  @SerializedName(SERIALIZED_NAME_OPEN_STDERR)
  private Boolean openStderr;

  public static final String SERIALIZED_NAME_OPEN_STDIN = "OpenStdin";
  @SerializedName(SERIALIZED_NAME_OPEN_STDIN)
  private Boolean openStdin;

  public static final String SERIALIZED_NAME_OPEN_STDOUT = "OpenStdout";
  @SerializedName(SERIALIZED_NAME_OPEN_STDOUT)
  private Boolean openStdout;

  public static final String SERIALIZED_NAME_PID = "Pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private Long pid;

  public static final String SERIALIZED_NAME_PROCESS_CONFIG = "ProcessConfig";
  @SerializedName(SERIALIZED_NAME_PROCESS_CONFIG)
  private InspectExecProcess processConfig;

  public static final String SERIALIZED_NAME_RUNNING = "Running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  private Boolean running;

  public InspectExecSession() {
  }

  public InspectExecSession canRemove(Boolean canRemove) {
    this.canRemove = canRemove;
    return this;
  }

  /**
   * CanRemove is legacy and used purely for compatibility reasons. Will always be set to true, unless the exec session is running.
   * @return canRemove
   */
  @jakarta.annotation.Nullable

  public Boolean getCanRemove() {
    return canRemove;
  }

  public void setCanRemove(Boolean canRemove) {
    this.canRemove = canRemove;
  }


  public InspectExecSession containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  /**
   * ContainerID is the ID of the container this exec session is attached to.
   * @return containerID
   */
  @jakarta.annotation.Nullable

  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }


  public InspectExecSession detachKeys(String detachKeys) {
    this.detachKeys = detachKeys;
    return this;
  }

  /**
   * DetachKeys are the detach keys used by the exec session. If set to \&quot;\&quot; the default keys are being used. Will show \&quot;&lt;none&gt;\&quot; if no detach keys are set.
   * @return detachKeys
   */
  @jakarta.annotation.Nullable

  public String getDetachKeys() {
    return detachKeys;
  }

  public void setDetachKeys(String detachKeys) {
    this.detachKeys = detachKeys;
  }


  public InspectExecSession exitCode(Long exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * ExitCode is the exit code of the exec session. Will be set to 0 if the exec session has not yet exited.
   * @return exitCode
   */
  @jakarta.annotation.Nullable

  public Long getExitCode() {
    return exitCode;
  }

  public void setExitCode(Long exitCode) {
    this.exitCode = exitCode;
  }


  public InspectExecSession ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * ID is the ID of the exec session.
   * @return ID
   */
  @jakarta.annotation.Nullable

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }


  public InspectExecSession openStderr(Boolean openStderr) {
    this.openStderr = openStderr;
    return this;
  }

  /**
   * OpenStderr is whether the container&#39;s STDERR stream will be attached. Always set to true if the exec session created a TTY.
   * @return openStderr
   */
  @jakarta.annotation.Nullable

  public Boolean getOpenStderr() {
    return openStderr;
  }

  public void setOpenStderr(Boolean openStderr) {
    this.openStderr = openStderr;
  }


  public InspectExecSession openStdin(Boolean openStdin) {
    this.openStdin = openStdin;
    return this;
  }

  /**
   * OpenStdin is whether the container&#39;s STDIN stream will be attached to.
   * @return openStdin
   */
  @jakarta.annotation.Nullable

  public Boolean getOpenStdin() {
    return openStdin;
  }

  public void setOpenStdin(Boolean openStdin) {
    this.openStdin = openStdin;
  }


  public InspectExecSession openStdout(Boolean openStdout) {
    this.openStdout = openStdout;
    return this;
  }

  /**
   * OpenStdout is whether the container&#39;s STDOUT stream will be attached. Always set to true if the exec session created a TTY.
   * @return openStdout
   */
  @jakarta.annotation.Nullable

  public Boolean getOpenStdout() {
    return openStdout;
  }

  public void setOpenStdout(Boolean openStdout) {
    this.openStdout = openStdout;
  }


  public InspectExecSession pid(Long pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Pid is the PID of the exec session&#39;s process. Will be set to 0 if the exec session is not running.
   * @return pid
   */
  @jakarta.annotation.Nullable

  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }


  public InspectExecSession processConfig(InspectExecProcess processConfig) {
    this.processConfig = processConfig;
    return this;
  }

  /**
   * Get processConfig
   * @return processConfig
   */
  @jakarta.annotation.Nullable
  @Valid

  public InspectExecProcess getProcessConfig() {
    return processConfig;
  }

  public void setProcessConfig(InspectExecProcess processConfig) {
    this.processConfig = processConfig;
  }


  public InspectExecSession running(Boolean running) {
    this.running = running;
    return this;
  }

  /**
   * Running is whether the exec session is running.
   * @return running
   */
  @jakarta.annotation.Nullable

  public Boolean getRunning() {
    return running;
  }

  public void setRunning(Boolean running) {
    this.running = running;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectExecSession inspectExecSession = (InspectExecSession) o;
    return Objects.equals(this.canRemove, inspectExecSession.canRemove) &&
        Objects.equals(this.containerID, inspectExecSession.containerID) &&
        Objects.equals(this.detachKeys, inspectExecSession.detachKeys) &&
        Objects.equals(this.exitCode, inspectExecSession.exitCode) &&
        Objects.equals(this.ID, inspectExecSession.ID) &&
        Objects.equals(this.openStderr, inspectExecSession.openStderr) &&
        Objects.equals(this.openStdin, inspectExecSession.openStdin) &&
        Objects.equals(this.openStdout, inspectExecSession.openStdout) &&
        Objects.equals(this.pid, inspectExecSession.pid) &&
        Objects.equals(this.processConfig, inspectExecSession.processConfig) &&
        Objects.equals(this.running, inspectExecSession.running);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRemove, containerID, detachKeys, exitCode, ID, openStderr, openStdin, openStdout, pid, processConfig, running);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectExecSession {\n");
    sb.append("    canRemove: ").append(toIndentedString(canRemove)).append("\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    detachKeys: ").append(toIndentedString(detachKeys)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    openStderr: ").append(toIndentedString(openStderr)).append("\n");
    sb.append("    openStdin: ").append(toIndentedString(openStdin)).append("\n");
    sb.append("    openStdout: ").append(toIndentedString(openStdout)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    processConfig: ").append(toIndentedString(processConfig)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
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
    openapiFields.add("CanRemove");
    openapiFields.add("ContainerID");
    openapiFields.add("DetachKeys");
    openapiFields.add("ExitCode");
    openapiFields.add("ID");
    openapiFields.add("OpenStderr");
    openapiFields.add("OpenStdin");
    openapiFields.add("OpenStdout");
    openapiFields.add("Pid");
    openapiFields.add("ProcessConfig");
    openapiFields.add("Running");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InspectExecSession
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InspectExecSession.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectExecSession is not found in the empty JSON string", InspectExecSession.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InspectExecSession.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectExecSession` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ContainerID") != null && !jsonObj.get("ContainerID").isJsonNull()) && !jsonObj.get("ContainerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ContainerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ContainerID").toString()));
      }
      if ((jsonObj.get("DetachKeys") != null && !jsonObj.get("DetachKeys").isJsonNull()) && !jsonObj.get("DetachKeys").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DetachKeys` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DetachKeys").toString()));
      }
      if ((jsonObj.get("ID") != null && !jsonObj.get("ID").isJsonNull()) && !jsonObj.get("ID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ID").toString()));
      }
      // validate the optional field `ProcessConfig`
      if (jsonObj.get("ProcessConfig") != null && !jsonObj.get("ProcessConfig").isJsonNull()) {
        InspectExecProcess.validateJsonElement(jsonObj.get("ProcessConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectExecSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectExecSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectExecSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectExecSession.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectExecSession>() {
           @Override
           public void write(JsonWriter out, InspectExecSession value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectExecSession read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InspectExecSession given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InspectExecSession
   * @throws IOException if the JSON string is invalid with respect to InspectExecSession
   */
  public static InspectExecSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectExecSession.class);
  }

  /**
   * Convert an instance of InspectExecSession to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

