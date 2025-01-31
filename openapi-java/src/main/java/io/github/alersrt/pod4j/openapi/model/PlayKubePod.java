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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.alersrt.pod4j.openapi.JSON;

/**
 * PlayKubePod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlayKubePod implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTAINER_ERRORS = "ContainerErrors";
  @SerializedName(SERIALIZED_NAME_CONTAINER_ERRORS)
  private List<String> containerErrors = null;

  public static final String SERIALIZED_NAME_CONTAINERS = "Containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<String> containers = null;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "InitContainers";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<String> initContainers = null;

  public static final String SERIALIZED_NAME_LOGS = "Logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private List<String> logs = null;

  public PlayKubePod() {
  }

  public PlayKubePod containerErrors(List<String> containerErrors) {

      this.containerErrors = containerErrors;
    return this;
  }

  public PlayKubePod addContainerErrorsItem(String containerErrorsItem) {
    if (this.containerErrors == null) {
      this.containerErrors = new ArrayList<>();
    }
    this.containerErrors.add(containerErrorsItem);
    return this;
  }

    /**
   * ContainerErrors - any errors that occurred while starting containers in the pod.
   * @return containerErrors
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ContainerErrors - any errors that occurred while starting containers in the pod.")

  public List<String> getContainerErrors() {
    return containerErrors;
  }


  public void setContainerErrors(List<String> containerErrors) {
    this.containerErrors = containerErrors;
  }


  public PlayKubePod containers(List<String> containers) {

      this.containers = containers;
    return this;
  }

  public PlayKubePod addContainersItem(String containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

    /**
   * Containers - the IDs of the containers running in the created pod.
   * @return containers
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Containers - the IDs of the containers running in the created pod.")

  public List<String> getContainers() {
    return containers;
  }


  public void setContainers(List<String> containers) {
    this.containers = containers;
  }


  public PlayKubePod ID(String ID) {

      this.ID = ID;
    return this;
  }

    /**
   * ID - ID of the pod created as a result of play kube.
   * @return ID
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID - ID of the pod created as a result of play kube.")

  public String getID() {
    return ID;
  }


  public void setID(String ID) {
    this.ID = ID;
  }


  public PlayKubePod initContainers(List<String> initContainers) {

      this.initContainers = initContainers;
    return this;
  }

  public PlayKubePod addInitContainersItem(String initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

    /**
   * InitContainers - the IDs of the init containers to be run in the created pod.
   * @return initContainers
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "InitContainers - the IDs of the init containers to be run in the created pod.")

  public List<String> getInitContainers() {
    return initContainers;
  }


  public void setInitContainers(List<String> initContainers) {
    this.initContainers = initContainers;
  }


  public PlayKubePod logs(List<String> logs) {

      this.logs = logs;
    return this;
  }

  public PlayKubePod addLogsItem(String logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    return this;
  }

    /**
   * Logs - non-fatal errors and log messages while processing.
   * @return logs
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Logs - non-fatal errors and log messages while processing.")

  public List<String> getLogs() {
    return logs;
  }


  public void setLogs(List<String> logs) {
    this.logs = logs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayKubePod playKubePod = (PlayKubePod) o;
    return Objects.equals(this.containerErrors, playKubePod.containerErrors) &&
        Objects.equals(this.containers, playKubePod.containers) &&
        Objects.equals(this.ID, playKubePod.ID) &&
        Objects.equals(this.initContainers, playKubePod.initContainers) &&
        Objects.equals(this.logs, playKubePod.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerErrors, containers, ID, initContainers, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayKubePod {\n");
    sb.append("    containerErrors: ").append(toIndentedString(containerErrors)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
    openapiFields.add("ContainerErrors");
    openapiFields.add("Containers");
    openapiFields.add("ID");
    openapiFields.add("InitContainers");
    openapiFields.add("Logs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to PlayKubePod
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (PlayKubePod.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayKubePod is not found in the empty JSON string", PlayKubePod.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!PlayKubePod.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlayKubePod` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
        }
        // ensure the json data is an array
        if ((jsonObj.get("ContainerErrors") != null && !jsonObj.get("ContainerErrors").isJsonNull()) && !jsonObj.get("ContainerErrors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ContainerErrors` to be an array in the JSON string but got `%s`", jsonObj.get("ContainerErrors").toString()));
        }
        // ensure the json data is an array
        if ((jsonObj.get("Containers") != null && !jsonObj.get("Containers").isJsonNull()) && !jsonObj.get("Containers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Containers` to be an array in the JSON string but got `%s`", jsonObj.get("Containers").toString()));
      }
      if ((jsonObj.get("ID") != null && !jsonObj.get("ID").isJsonNull()) && !jsonObj.get("ID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ID").toString()));
      }
        // ensure the json data is an array
        if ((jsonObj.get("InitContainers") != null && !jsonObj.get("InitContainers").isJsonNull()) && !jsonObj.get("InitContainers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `InitContainers` to be an array in the JSON string but got `%s`", jsonObj.get("InitContainers").toString()));
        }
        // ensure the json data is an array
        if ((jsonObj.get("Logs") != null && !jsonObj.get("Logs").isJsonNull()) && !jsonObj.get("Logs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Logs` to be an array in the JSON string but got `%s`", jsonObj.get("Logs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayKubePod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayKubePod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayKubePod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayKubePod.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayKubePod>() {
           @Override
           public void write(JsonWriter out, PlayKubePod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlayKubePod read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of PlayKubePod given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PlayKubePod
     * @throws IOException if the JSON string is invalid with respect to PlayKubePod
  */
  public static PlayKubePod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayKubePod.class);
  }

    /**
     * Convert an instance of PlayKubePod to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

