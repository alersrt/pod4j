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
import io.github.alersrt.pod4j.openapi.model.SecretSpec;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * SecretInfoReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T19:12:58.552824144+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class SecretInfoReport {
  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_SECRET_DATA = "SecretData";
  @SerializedName(SERIALIZED_NAME_SECRET_DATA)
  private String secretData;

  public static final String SERIALIZED_NAME_SPEC = "Spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private SecretSpec spec;

  public static final String SERIALIZED_NAME_UPDATED_AT = "UpdatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public SecretInfoReport() {
  }

  public SecretInfoReport createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public SecretInfoReport ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
   */
  @javax.annotation.Nullable
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }


  public SecretInfoReport secretData(String secretData) {
    this.secretData = secretData;
    return this;
  }

  /**
   * Get secretData
   * @return secretData
   */
  @javax.annotation.Nullable
  public String getSecretData() {
    return secretData;
  }

  public void setSecretData(String secretData) {
    this.secretData = secretData;
  }


  public SecretInfoReport spec(SecretSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
   */
  @javax.annotation.Nullable
  public SecretSpec getSpec() {
    return spec;
  }

  public void setSpec(SecretSpec spec) {
    this.spec = spec;
  }


  public SecretInfoReport updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretInfoReport secretInfoReport = (SecretInfoReport) o;
    return Objects.equals(this.createdAt, secretInfoReport.createdAt) &&
        Objects.equals(this.ID, secretInfoReport.ID) &&
        Objects.equals(this.secretData, secretInfoReport.secretData) &&
        Objects.equals(this.spec, secretInfoReport.spec) &&
        Objects.equals(this.updatedAt, secretInfoReport.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, ID, secretData, spec, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretInfoReport {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    secretData: ").append(toIndentedString(secretData)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("CreatedAt");
    openapiFields.add("ID");
    openapiFields.add("SecretData");
    openapiFields.add("Spec");
    openapiFields.add("UpdatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SecretInfoReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SecretInfoReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecretInfoReport is not found in the empty JSON string", SecretInfoReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SecretInfoReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecretInfoReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ID") != null && !jsonObj.get("ID").isJsonNull()) && !jsonObj.get("ID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ID").toString()));
      }
      if ((jsonObj.get("SecretData") != null && !jsonObj.get("SecretData").isJsonNull()) && !jsonObj.get("SecretData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecretData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecretData").toString()));
      }
      // validate the optional field `Spec`
      if (jsonObj.get("Spec") != null && !jsonObj.get("Spec").isJsonNull()) {
        SecretSpec.validateJsonElement(jsonObj.get("Spec"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecretInfoReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecretInfoReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecretInfoReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecretInfoReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SecretInfoReport>() {
           @Override
           public void write(JsonWriter out, SecretInfoReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecretInfoReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SecretInfoReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SecretInfoReport
   * @throws IOException if the JSON string is invalid with respect to SecretInfoReport
   */
  public static SecretInfoReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecretInfoReport.class);
  }

  /**
   * Convert an instance of SecretInfoReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

