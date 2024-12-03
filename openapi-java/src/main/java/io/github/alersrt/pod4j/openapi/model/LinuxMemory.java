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

/**
 * LinuxMemory for Linux cgroup &#39;memory&#39; resource management
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T01:29:49.168634544+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class LinuxMemory {
    public static final String SERIALIZED_NAME_CHECK_BEFORE_UPDATE = "checkBeforeUpdate";
    public static final String SERIALIZED_NAME_DISABLE_O_O_M_KILLER = "disableOOMKiller";
    public static final String SERIALIZED_NAME_KERNEL = "kernel";
    public static final String SERIALIZED_NAME_KERNEL_T_C_P = "kernelTCP";
    public static final String SERIALIZED_NAME_LIMIT = "limit";
    public static final String SERIALIZED_NAME_RESERVATION = "reservation";
    public static final String SERIALIZED_NAME_SWAP = "swap";
    public static final String SERIALIZED_NAME_SWAPPINESS = "swappiness";
    public static final String SERIALIZED_NAME_USE_HIERARCHY = "useHierarchy";
    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("checkBeforeUpdate");
        openapiFields.add("disableOOMKiller");
        openapiFields.add("kernel");
        openapiFields.add("kernelTCP");
        openapiFields.add("limit");
        openapiFields.add("reservation");
        openapiFields.add("swap");
        openapiFields.add("swappiness");
        openapiFields.add("useHierarchy");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    @SerializedName(SERIALIZED_NAME_CHECK_BEFORE_UPDATE)
    private Boolean checkBeforeUpdate;
    @SerializedName(SERIALIZED_NAME_DISABLE_O_O_M_KILLER)
    private Boolean disableOOMKiller;
    @SerializedName(SERIALIZED_NAME_KERNEL)
    private Long kernel;
    @SerializedName(SERIALIZED_NAME_KERNEL_T_C_P)
    private Long kernelTCP;
    @SerializedName(SERIALIZED_NAME_LIMIT)
    private Long limit;
    @SerializedName(SERIALIZED_NAME_RESERVATION)
    private Long reservation;
    @SerializedName(SERIALIZED_NAME_SWAP)
    private Long swap;
    @SerializedName(SERIALIZED_NAME_SWAPPINESS)
    private Integer swappiness;
    @SerializedName(SERIALIZED_NAME_USE_HIERARCHY)
    private Boolean useHierarchy;

    public LinuxMemory() {
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to LinuxMemory
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!LinuxMemory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in LinuxMemory is not found in the empty JSON string", LinuxMemory.openapiRequiredFields));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!LinuxMemory.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinuxMemory` properties. JSON: %s", entry.getKey(), jsonElement));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    /**
     * Create an instance of LinuxMemory given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LinuxMemory
     * @throws IOException if the JSON string is invalid with respect to LinuxMemory
     */
    public static LinuxMemory fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LinuxMemory.class);
    }

    public LinuxMemory checkBeforeUpdate(Boolean checkBeforeUpdate) {
        this.checkBeforeUpdate = checkBeforeUpdate;
        return this;
    }

    /**
     * CheckBeforeUpdate enables checking if a new memory limit is lower than the current usage during update, and if so, rejecting the new limit.
     *
     * @return checkBeforeUpdate
     */
    @jakarta.annotation.Nullable

    public Boolean getCheckBeforeUpdate() {
        return checkBeforeUpdate;
    }

    public void setCheckBeforeUpdate(Boolean checkBeforeUpdate) {
        this.checkBeforeUpdate = checkBeforeUpdate;
    }

    public LinuxMemory disableOOMKiller(Boolean disableOOMKiller) {
        this.disableOOMKiller = disableOOMKiller;
        return this;
    }

    /**
     * DisableOOMKiller disables the OOM killer for out of memory conditions
     *
     * @return disableOOMKiller
     */
    @jakarta.annotation.Nullable

    public Boolean getDisableOOMKiller() {
        return disableOOMKiller;
    }

    public void setDisableOOMKiller(Boolean disableOOMKiller) {
        this.disableOOMKiller = disableOOMKiller;
    }

    public LinuxMemory kernel(Long kernel) {
        this.kernel = kernel;
        return this;
    }

    /**
     * Kernel memory limit (in bytes).  Deprecated: kernel-memory limits are not supported in cgroups v2, and were obsoleted in [kernel v5.4]. This field should no longer be used, as it may be ignored by runtimes.  [kernel v5.4]: https://github.com/torvalds/linux/commit/0158115f702b0ba208ab0
     *
     * @return kernel
     */
    @jakarta.annotation.Nullable

    public Long getKernel() {
        return kernel;
    }

    public void setKernel(Long kernel) {
        this.kernel = kernel;
    }

    public LinuxMemory kernelTCP(Long kernelTCP) {
        this.kernelTCP = kernelTCP;
        return this;
    }

    /**
     * Kernel memory limit for tcp (in bytes)
     *
     * @return kernelTCP
     */
    @jakarta.annotation.Nullable

    public Long getKernelTCP() {
        return kernelTCP;
    }

    public void setKernelTCP(Long kernelTCP) {
        this.kernelTCP = kernelTCP;
    }

    public LinuxMemory limit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Memory limit (in bytes).
     *
     * @return limit
     */
    @jakarta.annotation.Nullable

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public LinuxMemory reservation(Long reservation) {
        this.reservation = reservation;
        return this;
    }

    /**
     * Memory reservation or soft_limit (in bytes).
     *
     * @return reservation
     */
    @jakarta.annotation.Nullable

    public Long getReservation() {
        return reservation;
    }

    public void setReservation(Long reservation) {
        this.reservation = reservation;
    }

    public LinuxMemory swap(Long swap) {
        this.swap = swap;
        return this;
    }

    /**
     * Total memory limit (memory + swap).
     *
     * @return swap
     */
    @jakarta.annotation.Nullable

    public Long getSwap() {
        return swap;
    }

    public void setSwap(Long swap) {
        this.swap = swap;
    }

    public LinuxMemory swappiness(Integer swappiness) {
        this.swappiness = swappiness;
        return this;
    }

    /**
     * How aggressive the kernel will swap memory pages.
     *
     * @return swappiness
     */
    @jakarta.annotation.Nullable

    public Integer getSwappiness() {
        return swappiness;
    }

    public void setSwappiness(Integer swappiness) {
        this.swappiness = swappiness;
    }

    public LinuxMemory useHierarchy(Boolean useHierarchy) {
        this.useHierarchy = useHierarchy;
        return this;
    }

    /**
     * Enables hierarchical memory accounting
     *
     * @return useHierarchy
     */
    @jakarta.annotation.Nullable

    public Boolean getUseHierarchy() {
        return useHierarchy;
    }

    public void setUseHierarchy(Boolean useHierarchy) {
        this.useHierarchy = useHierarchy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinuxMemory linuxMemory = (LinuxMemory) o;
        return Objects.equals(this.checkBeforeUpdate, linuxMemory.checkBeforeUpdate) &&
                Objects.equals(this.disableOOMKiller, linuxMemory.disableOOMKiller) &&
                Objects.equals(this.kernel, linuxMemory.kernel) &&
                Objects.equals(this.kernelTCP, linuxMemory.kernelTCP) &&
                Objects.equals(this.limit, linuxMemory.limit) &&
                Objects.equals(this.reservation, linuxMemory.reservation) &&
                Objects.equals(this.swap, linuxMemory.swap) &&
                Objects.equals(this.swappiness, linuxMemory.swappiness) &&
                Objects.equals(this.useHierarchy, linuxMemory.useHierarchy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkBeforeUpdate, disableOOMKiller, kernel, kernelTCP, limit, reservation, swap, swappiness, useHierarchy);
    }

    @Override
    public String toString() {
        String sb = "class LinuxMemory {\n" +
                "    checkBeforeUpdate: " + toIndentedString(checkBeforeUpdate) + "\n" +
                "    disableOOMKiller: " + toIndentedString(disableOOMKiller) + "\n" +
                "    kernel: " + toIndentedString(kernel) + "\n" +
                "    kernelTCP: " + toIndentedString(kernelTCP) + "\n" +
                "    limit: " + toIndentedString(limit) + "\n" +
                "    reservation: " + toIndentedString(reservation) + "\n" +
                "    swap: " + toIndentedString(swap) + "\n" +
                "    swappiness: " + toIndentedString(swappiness) + "\n" +
                "    useHierarchy: " + toIndentedString(useHierarchy) + "\n" +
                "}";
        return sb;
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

    /**
     * Convert an instance of LinuxMemory to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LinuxMemory.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LinuxMemory' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LinuxMemory> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(LinuxMemory.class));

            return (TypeAdapter<T>) new TypeAdapter<LinuxMemory>() {
                @Override
                public void write(JsonWriter out, LinuxMemory value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public LinuxMemory read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }
}

