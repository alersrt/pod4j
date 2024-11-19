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
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Route */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class Route {
    public static final String SERIALIZED_NAME_DESTINATION = "destination";

    @SerializedName(SERIALIZED_NAME_DESTINATION)
    private String destination;

    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public static final String SERIALIZED_NAME_METRIC = "metric";

    @SerializedName(SERIALIZED_NAME_METRIC)
    private Integer metric;

    public Route() {}

    public Route destination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Destination for this route in CIDR form.
     *
     * @return destination
     */
    @javax.annotation.Nullable
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Route gateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * Gateway IP for this route.
     *
     * @return gateway
     */
    @javax.annotation.Nullable
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public Route metric(Integer metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Metric for this route. Optional.
     *
     * @return metric
     */
    @javax.annotation.Nullable
    public Integer getMetric() {
        return metric;
    }

    public void setMetric(Integer metric) {
        this.metric = metric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Route route = (Route) o;
        return Objects.equals(this.destination, route.destination)
                && Objects.equals(this.gateway, route.gateway)
                && Objects.equals(this.metric, route.metric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, gateway, metric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Route {\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        openapiFields.add("destination");
        openapiFields.add("gateway");
        openapiFields.add("metric");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Route
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!Route.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Route is not found in the empty JSON"
                                        + " string",
                                Route.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!Route.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Route`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull())
                && !jsonObj.get("destination").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `destination` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("destination").toString()));
        }
        if ((jsonObj.get("gateway") != null && !jsonObj.get("gateway").isJsonNull())
                && !jsonObj.get("gateway").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `gateway` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("gateway").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Route.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Route' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Route> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Route.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Route>() {
                        @Override
                        public void write(JsonWriter out, Route value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Route read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Route given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Route
     * @throws IOException if the JSON string is invalid with respect to Route
     */
    public static Route fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Route.class);
    }

    /**
     * Convert an instance of Route to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
