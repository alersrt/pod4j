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
 * BindOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BindOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CREATE_MOUNTPOINT = "CreateMountpoint";
  @SerializedName(SERIALIZED_NAME_CREATE_MOUNTPOINT)
  private Boolean createMountpoint;

  public static final String SERIALIZED_NAME_NON_RECURSIVE = "NonRecursive";
  @SerializedName(SERIALIZED_NAME_NON_RECURSIVE)
  private Boolean nonRecursive;

  public static final String SERIALIZED_NAME_PROPAGATION = "Propagation";
  @SerializedName(SERIALIZED_NAME_PROPAGATION)
  private String propagation;

  public static final String SERIALIZED_NAME_READ_ONLY_FORCE_RECURSIVE = "ReadOnlyForceRecursive";
  @SerializedName(SERIALIZED_NAME_READ_ONLY_FORCE_RECURSIVE)
  private Boolean readOnlyForceRecursive;

  public static final String SERIALIZED_NAME_READ_ONLY_NON_RECURSIVE = "ReadOnlyNonRecursive";
  @SerializedName(SERIALIZED_NAME_READ_ONLY_NON_RECURSIVE)
  private Boolean readOnlyNonRecursive;

  public BindOptions() {
  }

  public BindOptions createMountpoint(Boolean createMountpoint) {

      this.createMountpoint = createMountpoint;
    return this;
  }

    /**
   * Get createMountpoint
   * @return createMountpoint
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public Boolean getCreateMountpoint() {
    return createMountpoint;
  }


  public void setCreateMountpoint(Boolean createMountpoint) {
    this.createMountpoint = createMountpoint;
  }


  public BindOptions nonRecursive(Boolean nonRecursive) {

      this.nonRecursive = nonRecursive;
    return this;
  }

    /**
   * Get nonRecursive
   * @return nonRecursive
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public Boolean getNonRecursive() {
    return nonRecursive;
  }


  public void setNonRecursive(Boolean nonRecursive) {
    this.nonRecursive = nonRecursive;
  }


  public BindOptions propagation(String propagation) {

      this.propagation = propagation;
    return this;
  }

    /**
   * Get propagation
   * @return propagation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public String getPropagation() {
    return propagation;
  }


  public void setPropagation(String propagation) {
    this.propagation = propagation;
  }


  public BindOptions readOnlyForceRecursive(Boolean readOnlyForceRecursive) {

      this.readOnlyForceRecursive = readOnlyForceRecursive;
    return this;
  }

    /**
   * ReadOnlyForceRecursive raises an error if the mount cannot be made recursively read-only.
   * @return readOnlyForceRecursive
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ReadOnlyForceRecursive raises an error if the mount cannot be made recursively read-only.")

  public Boolean getReadOnlyForceRecursive() {
    return readOnlyForceRecursive;
  }


  public void setReadOnlyForceRecursive(Boolean readOnlyForceRecursive) {
    this.readOnlyForceRecursive = readOnlyForceRecursive;
  }


  public BindOptions readOnlyNonRecursive(Boolean readOnlyNonRecursive) {

      this.readOnlyNonRecursive = readOnlyNonRecursive;
    return this;
  }

    /**
   * ReadOnlyNonRecursive makes the mount non-recursively read-only, but still leaves the mount recursive (unless NonRecursive is set to true in conjunction).
   * @return readOnlyNonRecursive
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ReadOnlyNonRecursive makes the mount non-recursively read-only, but still leaves the mount recursive (unless NonRecursive is set to true in conjunction).")

  public Boolean getReadOnlyNonRecursive() {
    return readOnlyNonRecursive;
  }


  public void setReadOnlyNonRecursive(Boolean readOnlyNonRecursive) {
    this.readOnlyNonRecursive = readOnlyNonRecursive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BindOptions bindOptions = (BindOptions) o;
    return Objects.equals(this.createMountpoint, bindOptions.createMountpoint) &&
        Objects.equals(this.nonRecursive, bindOptions.nonRecursive) &&
        Objects.equals(this.propagation, bindOptions.propagation) &&
        Objects.equals(this.readOnlyForceRecursive, bindOptions.readOnlyForceRecursive) &&
        Objects.equals(this.readOnlyNonRecursive, bindOptions.readOnlyNonRecursive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createMountpoint, nonRecursive, propagation, readOnlyForceRecursive, readOnlyNonRecursive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BindOptions {\n");
    sb.append("    createMountpoint: ").append(toIndentedString(createMountpoint)).append("\n");
    sb.append("    nonRecursive: ").append(toIndentedString(nonRecursive)).append("\n");
    sb.append("    propagation: ").append(toIndentedString(propagation)).append("\n");
    sb.append("    readOnlyForceRecursive: ").append(toIndentedString(readOnlyForceRecursive)).append("\n");
    sb.append("    readOnlyNonRecursive: ").append(toIndentedString(readOnlyNonRecursive)).append("\n");
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
    openapiFields.add("CreateMountpoint");
    openapiFields.add("NonRecursive");
    openapiFields.add("Propagation");
    openapiFields.add("ReadOnlyForceRecursive");
    openapiFields.add("ReadOnlyNonRecursive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to BindOptions
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (BindOptions.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BindOptions is not found in the empty JSON string", BindOptions.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!BindOptions.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BindOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Propagation") != null && !jsonObj.get("Propagation").isJsonNull()) && !jsonObj.get("Propagation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Propagation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Propagation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BindOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BindOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BindOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BindOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<BindOptions>() {
           @Override
           public void write(JsonWriter out, BindOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BindOptions read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of BindOptions given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of BindOptions
     * @throws IOException if the JSON string is invalid with respect to BindOptions
  */
  public static BindOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BindOptions.class);
  }

    /**
     * Convert an instance of BindOptions to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

