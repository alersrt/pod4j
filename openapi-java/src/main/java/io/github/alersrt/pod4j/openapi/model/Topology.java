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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * This description is taken verbatim from the CSI Spec:  A topological domain is a sub-division of a cluster, like \&quot;region\&quot;, \&quot;zone\&quot;, \&quot;rack\&quot;, etc. A topological segment is a specific instance of a topological domain, like \&quot;zone3\&quot;, \&quot;rack3\&quot;, etc. For example {\&quot;com.company/zone\&quot;: \&quot;Z1\&quot;, \&quot;com.company/rack\&quot;: \&quot;R3\&quot;} Valid keys have two segments: an OPTIONAL prefix and name, separated by a slash (/), for example: \&quot;com.company.example/zone\&quot;. The key name segment is REQUIRED. The prefix is OPTIONAL. The key name MUST be 63 characters or less, begin and end with an alphanumeric character ([a-z0-9A-Z]), and contain only dashes (-), underscores (_), dots (.), or alphanumerics in between, for example \&quot;zone\&quot;. The key prefix MUST be 63 characters or less, begin and end with a lower-case alphanumeric character ([a-z0-9]), contain only dashes (-), dots (.), or lower-case alphanumerics in between, and follow domain name notation format (https://tools.ietf.org/html/rfc1035#section-2.3.1). The key prefix SHOULD include the plugin&#39;s host company name and/or the plugin name, to minimize the possibility of collisions with keys from other plugins. If a key prefix is specified, it MUST be identical across all topology keys returned by the SP (across all RPCs). Keys MUST be case-insensitive. Meaning the keys \&quot;Zone\&quot; and \&quot;zone\&quot; MUST not both exist. Each value (topological segment) MUST contain 1 or more strings. Each string MUST be 63 characters or less and begin and end with an alphanumeric character with &#39;-&#39;, &#39;_&#39;, &#39;.&#39;, or alphanumerics in between.
 */
@ApiModel(description = "This description is taken verbatim from the CSI Spec:  A topological domain is a sub-division of a cluster, like \"region\", \"zone\", \"rack\", etc. A topological segment is a specific instance of a topological domain, like \"zone3\", \"rack3\", etc. For example {\"com.company/zone\": \"Z1\", \"com.company/rack\": \"R3\"} Valid keys have two segments: an OPTIONAL prefix and name, separated by a slash (/), for example: \"com.company.example/zone\". The key name segment is REQUIRED. The prefix is OPTIONAL. The key name MUST be 63 characters or less, begin and end with an alphanumeric character ([a-z0-9A-Z]), and contain only dashes (-), underscores (_), dots (.), or alphanumerics in between, for example \"zone\". The key prefix MUST be 63 characters or less, begin and end with a lower-case alphanumeric character ([a-z0-9]), contain only dashes (-), dots (.), or lower-case alphanumerics in between, and follow domain name notation format (https://tools.ietf.org/html/rfc1035#section-2.3.1). The key prefix SHOULD include the plugin's host company name and/or the plugin name, to minimize the possibility of collisions with keys from other plugins. If a key prefix is specified, it MUST be identical across all topology keys returned by the SP (across all RPCs). Keys MUST be case-insensitive. Meaning the keys \"Zone\" and \"zone\" MUST not both exist. Each value (topological segment) MUST contain 1 or more strings. Each string MUST be 63 characters or less and begin and end with an alphanumeric character with '-', '_', '.', or alphanumerics in between.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Topology implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SEGMENTS = "Segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private Map<String, String> segments = null;

  public Topology() {
  }

  public Topology segments(Map<String, String> segments) {

      this.segments = segments;
    return this;
  }

  public Topology putSegmentsItem(String key, String segmentsItem) {
    if (this.segments == null) {
      this.segments = new HashMap<>();
    }
    this.segments.put(key, segmentsItem);
    return this;
  }

    /**
   * Get segments
   * @return segments
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public Map<String, String> getSegments() {
    return segments;
  }


  public void setSegments(Map<String, String> segments) {
    this.segments = segments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Topology topology = (Topology) o;
    return Objects.equals(this.segments, topology.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Topology {\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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
    openapiFields.add("Segments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Topology
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (Topology.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Topology is not found in the empty JSON string", Topology.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!Topology.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Topology` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Topology.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Topology' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Topology> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Topology.class));

       return (TypeAdapter<T>) new TypeAdapter<Topology>() {
           @Override
           public void write(JsonWriter out, Topology value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Topology read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of Topology given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Topology
     * @throws IOException if the JSON string is invalid with respect to Topology
  */
  public static Topology fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Topology.class);
  }

    /**
     * Convert an instance of Topology to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

