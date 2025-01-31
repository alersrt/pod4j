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
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import javax.validation.Valid;

/**
 * Mount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Mount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIND_OPTIONS = "BindOptions";
  @SerializedName(SERIALIZED_NAME_BIND_OPTIONS)
  private BindOptions bindOptions;

  public static final String SERIALIZED_NAME_CLUSTER_OPTIONS = "ClusterOptions";
  @SerializedName(SERIALIZED_NAME_CLUSTER_OPTIONS)
  private Object clusterOptions;

  public static final String SERIALIZED_NAME_CONSISTENCY = "Consistency";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY)
  private String consistency;

  public static final String SERIALIZED_NAME_READ_ONLY = "ReadOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TARGET = "Target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_TMPFS_OPTIONS = "TmpfsOptions";
  @SerializedName(SERIALIZED_NAME_TMPFS_OPTIONS)
  private TmpfsOptions tmpfsOptions;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VOLUME_OPTIONS = "VolumeOptions";
  @SerializedName(SERIALIZED_NAME_VOLUME_OPTIONS)
  private VolumeOptions volumeOptions;

  public Mount() {
  }

  public Mount bindOptions(BindOptions bindOptions) {

    this.bindOptions = bindOptions;
    return this;
  }

  /**
   * Get bindOptions
   * @return bindOptions
   **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public BindOptions getBindOptions() {
    return bindOptions;
  }


  public void setBindOptions(BindOptions bindOptions) {
    this.bindOptions = bindOptions;
  }


  public Mount clusterOptions(Object clusterOptions) {

    this.clusterOptions = clusterOptions;
    return this;
  }

  /**
   * Get clusterOptions
   * @return clusterOptions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getClusterOptions() {
    return clusterOptions;
  }


  public void setClusterOptions(Object clusterOptions) {
    this.clusterOptions = clusterOptions;
  }


  public Mount consistency(String consistency) {

    this.consistency = consistency;
    return this;
  }

  /**
   * Get consistency
   * @return consistency
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsistency() {
    return consistency;
  }


  public void setConsistency(String consistency) {
    this.consistency = consistency;
  }


  public Mount readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Get readOnly
   * @return readOnly
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public Mount source(String source) {

    this.source = source;
    return this;
  }

  /**
   * Source specifies the name of the mount. Depending on mount type, this may be a volume name or a host path, or even ignored. Source is not supported for tmpfs (must be an empty value)
   * @return source
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source specifies the name of the mount. Depending on mount type, this may be a volume name or a host path, or even ignored. Source is not supported for tmpfs (must be an empty value)")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public Mount target(String target) {

    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public Mount tmpfsOptions(TmpfsOptions tmpfsOptions) {

    this.tmpfsOptions = tmpfsOptions;
    return this;
  }

  /**
   * Get tmpfsOptions
   * @return tmpfsOptions
   **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public TmpfsOptions getTmpfsOptions() {
    return tmpfsOptions;
  }


  public void setTmpfsOptions(TmpfsOptions tmpfsOptions) {
    this.tmpfsOptions = tmpfsOptions;
  }


  public Mount type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Mount volumeOptions(VolumeOptions volumeOptions) {

    this.volumeOptions = volumeOptions;
    return this;
  }

  /**
   * Get volumeOptions
   * @return volumeOptions
   **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public VolumeOptions getVolumeOptions() {
    return volumeOptions;
  }


  public void setVolumeOptions(VolumeOptions volumeOptions) {
    this.volumeOptions = volumeOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mount mount = (Mount) o;
    return Objects.equals(this.bindOptions, mount.bindOptions) &&
        Objects.equals(this.clusterOptions, mount.clusterOptions) &&
        Objects.equals(this.consistency, mount.consistency) &&
        Objects.equals(this.readOnly, mount.readOnly) &&
        Objects.equals(this.source, mount.source) &&
        Objects.equals(this.target, mount.target) &&
        Objects.equals(this.tmpfsOptions, mount.tmpfsOptions) &&
        Objects.equals(this.type, mount.type) &&
        Objects.equals(this.volumeOptions, mount.volumeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindOptions, clusterOptions, consistency, readOnly, source, target, tmpfsOptions, type, volumeOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mount {\n");
    sb.append("    bindOptions: ").append(toIndentedString(bindOptions)).append("\n");
    sb.append("    clusterOptions: ").append(toIndentedString(clusterOptions)).append("\n");
    sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    tmpfsOptions: ").append(toIndentedString(tmpfsOptions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    volumeOptions: ").append(toIndentedString(volumeOptions)).append("\n");
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
    openapiFields.add("BindOptions");
    openapiFields.add("ClusterOptions");
    openapiFields.add("Consistency");
    openapiFields.add("ReadOnly");
    openapiFields.add("Source");
    openapiFields.add("Target");
    openapiFields.add("TmpfsOptions");
    openapiFields.add("Type");
    openapiFields.add("VolumeOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to Mount
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (Mount.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Mount is not found in the empty JSON string", Mount.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
        if (!Mount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Mount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `BindOptions`
      if (jsonObj.get("BindOptions") != null && !jsonObj.get("BindOptions").isJsonNull()) {
        BindOptions.validateJsonObject(jsonObj.getAsJsonObject("BindOptions"));
      }
      if ((jsonObj.get("Consistency") != null && !jsonObj.get("Consistency").isJsonNull()) && !jsonObj.get("Consistency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Consistency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Consistency").toString()));
      }
      if ((jsonObj.get("Source") != null && !jsonObj.get("Source").isJsonNull()) && !jsonObj.get("Source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Source").toString()));
      }
      if ((jsonObj.get("Target") != null && !jsonObj.get("Target").isJsonNull()) && !jsonObj.get("Target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Target").toString()));
      }
      // validate the optional field `TmpfsOptions`
      if (jsonObj.get("TmpfsOptions") != null && !jsonObj.get("TmpfsOptions").isJsonNull()) {
        TmpfsOptions.validateJsonObject(jsonObj.getAsJsonObject("TmpfsOptions"));
      }
      if ((jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
      // validate the optional field `VolumeOptions`
      if (jsonObj.get("VolumeOptions") != null && !jsonObj.get("VolumeOptions").isJsonNull()) {
        VolumeOptions.validateJsonObject(jsonObj.getAsJsonObject("VolumeOptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Mount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Mount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Mount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Mount.class));

       return (TypeAdapter<T>) new TypeAdapter<Mount>() {
           @Override
           public void write(JsonWriter out, Mount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Mount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Mount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Mount
   * @throws IOException if the JSON string is invalid with respect to Mount
  */
  public static Mount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Mount.class);
  }

  /**
   * Convert an instance of Mount to an JSON string
   *
   * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

