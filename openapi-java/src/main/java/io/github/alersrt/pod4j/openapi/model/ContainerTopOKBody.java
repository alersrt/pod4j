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
 * ContainerTopOKBody OK response to ContainerTop operation
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T23:04:06.361421791+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ContainerTopOKBody implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PROCESSES = "Processes";
  @SerializedName(SERIALIZED_NAME_PROCESSES)
  private List<List<String>> processes = new ArrayList<>();

  public static final String SERIALIZED_NAME_TITLES = "Titles";
  @SerializedName(SERIALIZED_NAME_TITLES)
  private List<String> titles = new ArrayList<>();

  public ContainerTopOKBody() {
  }

  public ContainerTopOKBody processes(List<List<String>> processes) {
    this.processes = processes;
    return this;
  }

  public ContainerTopOKBody addProcessesItem(List<String> processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<>();
    }
    this.processes.add(processesItem);
    return this;
  }

  /**
   * Each process running in the container, where each is process is an array of values corresponding to the titles.
   * @return processes
   */
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  public List<List<String>> getProcesses() {
    return processes;
  }

  public void setProcesses(List<List<String>> processes) {
    this.processes = processes;
  }


  public ContainerTopOKBody titles(List<String> titles) {
    this.titles = titles;
    return this;
  }

  public ContainerTopOKBody addTitlesItem(String titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

  /**
   * The ps column titles
   * @return titles
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public List<String> getTitles() {
    return titles;
  }

  public void setTitles(List<String> titles) {
    this.titles = titles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerTopOKBody containerTopOKBody = (ContainerTopOKBody) o;
    return Objects.equals(this.processes, containerTopOKBody.processes) &&
        Objects.equals(this.titles, containerTopOKBody.titles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processes, titles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerTopOKBody {\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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
    openapiFields.add("Processes");
    openapiFields.add("Titles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Processes");
    openapiRequiredFields.add("Titles");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerTopOKBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerTopOKBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerTopOKBody is not found in the empty JSON string", ContainerTopOKBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerTopOKBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerTopOKBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContainerTopOKBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("Processes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Processes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Processes` to be an array in the JSON string but got `%s`", jsonObj.get("Processes").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("Titles") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Titles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Titles` to be an array in the JSON string but got `%s`", jsonObj.get("Titles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerTopOKBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerTopOKBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerTopOKBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerTopOKBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerTopOKBody>() {
           @Override
           public void write(JsonWriter out, ContainerTopOKBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerTopOKBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerTopOKBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerTopOKBody
   * @throws IOException if the JSON string is invalid with respect to ContainerTopOKBody
   */
  public static ContainerTopOKBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerTopOKBody.class);
  }

  /**
   * Convert an instance of ContainerTopOKBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

