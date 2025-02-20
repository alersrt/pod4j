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
 * TypeMount contains options for using a volume as a Mount-type volume.
 */
@ApiModel(description = "TypeMount contains options for using a volume as a Mount-type volume.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TypeMount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FS_TYPE = "FsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_MOUNT_FLAGS = "MountFlags";
  @SerializedName(SERIALIZED_NAME_MOUNT_FLAGS)
  private List<String> mountFlags = null;

  public TypeMount() {
  }

  public TypeMount fsType(String fsType) {

      this.fsType = fsType;
    return this;
  }

    /**
   * FsType specifies the filesystem type for the mount volume. Optional.
   * @return fsType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "FsType specifies the filesystem type for the mount volume. Optional.")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public TypeMount mountFlags(List<String> mountFlags) {

      this.mountFlags = mountFlags;
    return this;
  }

  public TypeMount addMountFlagsItem(String mountFlagsItem) {
    if (this.mountFlags == null) {
      this.mountFlags = new ArrayList<>();
    }
    this.mountFlags.add(mountFlagsItem);
    return this;
  }

    /**
   * MountFlags defines flags to pass when mounting the volume. Optional.
   * @return mountFlags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "MountFlags defines flags to pass when mounting the volume. Optional.")

  public List<String> getMountFlags() {
    return mountFlags;
  }


  public void setMountFlags(List<String> mountFlags) {
    this.mountFlags = mountFlags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeMount typeMount = (TypeMount) o;
    return Objects.equals(this.fsType, typeMount.fsType) &&
        Objects.equals(this.mountFlags, typeMount.mountFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, mountFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeMount {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    mountFlags: ").append(toIndentedString(mountFlags)).append("\n");
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
    openapiFields.add("FsType");
    openapiFields.add("MountFlags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to TypeMount
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (TypeMount.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TypeMount is not found in the empty JSON string", TypeMount.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!TypeMount.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TypeMount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("FsType") != null && !jsonObj.get("FsType").isJsonNull()) && !jsonObj.get("FsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FsType").toString()));
      }
        // ensure the json data is an array
        if ((jsonObj.get("MountFlags") != null && !jsonObj.get("MountFlags").isJsonNull()) && !jsonObj.get("MountFlags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MountFlags` to be an array in the JSON string but got `%s`", jsonObj.get("MountFlags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TypeMount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TypeMount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TypeMount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TypeMount.class));

       return (TypeAdapter<T>) new TypeAdapter<TypeMount>() {
           @Override
           public void write(JsonWriter out, TypeMount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TypeMount read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of TypeMount given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TypeMount
     * @throws IOException if the JSON string is invalid with respect to TypeMount
  */
  public static TypeMount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TypeMount.class);
  }

    /**
     * Convert an instance of TypeMount to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

