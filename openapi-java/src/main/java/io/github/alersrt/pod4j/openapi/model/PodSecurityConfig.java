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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import javax.validation.Valid;

/**
 * PodSecurityConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PodSecurityConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IDMAPPINGS = "idmappings";
  @SerializedName(SERIALIZED_NAME_IDMAPPINGS)
  private IDMappingOptions idmappings;

  public static final String SERIALIZED_NAME_SECURITY_OPT = "security_opt";
  @SerializedName(SERIALIZED_NAME_SECURITY_OPT)
  private List<String> securityOpt = null;

  public PodSecurityConfig() {
  }

  public PodSecurityConfig idmappings(IDMappingOptions idmappings) {

      this.idmappings = idmappings;
    return this;
  }

    /**
   * Get idmappings
   * @return idmappings
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public IDMappingOptions getIdmappings() {
    return idmappings;
  }


  public void setIdmappings(IDMappingOptions idmappings) {
    this.idmappings = idmappings;
  }


  public PodSecurityConfig securityOpt(List<String> securityOpt) {

      this.securityOpt = securityOpt;
    return this;
  }

  public PodSecurityConfig addSecurityOptItem(String securityOptItem) {
    if (this.securityOpt == null) {
      this.securityOpt = new ArrayList<>();
    }
    this.securityOpt.add(securityOptItem);
    return this;
  }

    /**
   * Get securityOpt
   * @return securityOpt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public List<String> getSecurityOpt() {
    return securityOpt;
  }


  public void setSecurityOpt(List<String> securityOpt) {
    this.securityOpt = securityOpt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodSecurityConfig podSecurityConfig = (PodSecurityConfig) o;
    return Objects.equals(this.idmappings, podSecurityConfig.idmappings) &&
        Objects.equals(this.securityOpt, podSecurityConfig.securityOpt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idmappings, securityOpt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodSecurityConfig {\n");
    sb.append("    idmappings: ").append(toIndentedString(idmappings)).append("\n");
    sb.append("    securityOpt: ").append(toIndentedString(securityOpt)).append("\n");
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
    openapiFields.add("idmappings");
    openapiFields.add("security_opt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to PodSecurityConfig
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (PodSecurityConfig.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PodSecurityConfig is not found in the empty JSON string", PodSecurityConfig.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!PodSecurityConfig.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PodSecurityConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `idmappings`
      if (jsonObj.get("idmappings") != null && !jsonObj.get("idmappings").isJsonNull()) {
          IDMappingOptions.validateJsonObject(jsonObj.getAsJsonObject("idmappings"));
      }
        // ensure the json data is an array
        if ((jsonObj.get("security_opt") != null && !jsonObj.get("security_opt").isJsonNull()) && !jsonObj.get("security_opt").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `security_opt` to be an array in the JSON string but got `%s`", jsonObj.get("security_opt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PodSecurityConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PodSecurityConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PodSecurityConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PodSecurityConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<PodSecurityConfig>() {
           @Override
           public void write(JsonWriter out, PodSecurityConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PodSecurityConfig read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of PodSecurityConfig given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PodSecurityConfig
     * @throws IOException if the JSON string is invalid with respect to PodSecurityConfig
  */
  public static PodSecurityConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PodSecurityConfig.class);
  }

    /**
     * Convert an instance of PodSecurityConfig to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

