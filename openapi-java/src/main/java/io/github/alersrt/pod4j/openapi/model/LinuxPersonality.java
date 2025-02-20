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
 * LinuxPersonality represents the Linux personality syscall input
 */
@ApiModel(description = "LinuxPersonality represents the Linux personality syscall input")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinuxPersonality implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private List<String> flags = null;

  public LinuxPersonality() {
  }

  public LinuxPersonality domain(String domain) {

      this.domain = domain;
    return this;
  }

    /**
   * Get domain
   * @return domain
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public LinuxPersonality flags(List<String> flags) {

      this.flags = flags;
    return this;
  }

  public LinuxPersonality addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

    /**
   * Additional flags
   * @return flags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Additional flags")

  public List<String> getFlags() {
    return flags;
  }


  public void setFlags(List<String> flags) {
    this.flags = flags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinuxPersonality linuxPersonality = (LinuxPersonality) o;
    return Objects.equals(this.domain, linuxPersonality.domain) &&
        Objects.equals(this.flags, linuxPersonality.flags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, flags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinuxPersonality {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
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
    openapiFields.add("domain");
    openapiFields.add("flags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to LinuxPersonality
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (LinuxPersonality.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinuxPersonality is not found in the empty JSON string", LinuxPersonality.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!LinuxPersonality.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinuxPersonality` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
        // ensure the json data is an array
        if ((jsonObj.get("flags") != null && !jsonObj.get("flags").isJsonNull()) && !jsonObj.get("flags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `flags` to be an array in the JSON string but got `%s`", jsonObj.get("flags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinuxPersonality.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinuxPersonality' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinuxPersonality> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinuxPersonality.class));

       return (TypeAdapter<T>) new TypeAdapter<LinuxPersonality>() {
           @Override
           public void write(JsonWriter out, LinuxPersonality value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinuxPersonality read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of LinuxPersonality given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LinuxPersonality
     * @throws IOException if the JSON string is invalid with respect to LinuxPersonality
  */
  public static LinuxPersonality fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinuxPersonality.class);
  }

    /**
     * Convert an instance of LinuxPersonality to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

