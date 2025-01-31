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
 * InspectUlimit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InspectUlimit implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_HARD = "Hard";
  @SerializedName(SERIALIZED_NAME_HARD)
  private Long hard;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOFT = "Soft";
  @SerializedName(SERIALIZED_NAME_SOFT)
  private Long soft;

  public InspectUlimit() {
  }

  public InspectUlimit hard(Long hard) {

      this.hard = hard;
    return this;
  }

    /**
   * Hard is the hard limit that will be applied.
   * @return hard
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Hard is the hard limit that will be applied.")

  public Long getHard() {
    return hard;
  }


  public void setHard(Long hard) {
    this.hard = hard;
  }


  public InspectUlimit name(String name) {

      this.name = name;
    return this;
  }

    /**
   * Name is the name (type) of the ulimit.
   * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Name is the name (type) of the ulimit.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InspectUlimit soft(Long soft) {

      this.soft = soft;
    return this;
  }

    /**
   * Soft is the soft limit that will be applied.
   * @return soft
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Soft is the soft limit that will be applied.")

  public Long getSoft() {
    return soft;
  }


  public void setSoft(Long soft) {
    this.soft = soft;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectUlimit inspectUlimit = (InspectUlimit) o;
    return Objects.equals(this.hard, inspectUlimit.hard) &&
        Objects.equals(this.name, inspectUlimit.name) &&
        Objects.equals(this.soft, inspectUlimit.soft);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard, name, soft);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectUlimit {\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    soft: ").append(toIndentedString(soft)).append("\n");
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
    openapiFields.add("Hard");
    openapiFields.add("Name");
    openapiFields.add("Soft");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to InspectUlimit
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (InspectUlimit.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectUlimit is not found in the empty JSON string", InspectUlimit.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!InspectUlimit.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectUlimit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectUlimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectUlimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectUlimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectUlimit.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectUlimit>() {
           @Override
           public void write(JsonWriter out, InspectUlimit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectUlimit read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of InspectUlimit given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of InspectUlimit
     * @throws IOException if the JSON string is invalid with respect to InspectUlimit
  */
  public static InspectUlimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectUlimit.class);
  }

    /**
     * Convert an instance of InspectUlimit to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

