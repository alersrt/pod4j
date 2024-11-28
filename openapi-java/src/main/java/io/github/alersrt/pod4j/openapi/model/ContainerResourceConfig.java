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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.alersrt.pod4j.openapi.model.LinuxIntelRdt;
import io.github.alersrt.pod4j.openapi.model.LinuxResources;
import io.github.alersrt.pod4j.openapi.model.LinuxThrottleDevice;
import io.github.alersrt.pod4j.openapi.model.LinuxWeightDevice;
import io.github.alersrt.pod4j.openapi.model.POSIXRlimit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * ContainerResourceConfig
 */
@JsonPropertyOrder({
  ContainerResourceConfig.JSON_PROPERTY_INTEL_RDT,
  ContainerResourceConfig.JSON_PROPERTY_OOM_SCORE_ADJ,
  ContainerResourceConfig.JSON_PROPERTY_R_LIMITS,
  ContainerResourceConfig.JSON_PROPERTY_RESOURCE_LIMITS,
  ContainerResourceConfig.JSON_PROPERTY_THROTTLE_READ_BPS_DEVICE,
  ContainerResourceConfig.JSON_PROPERTY_THROTTLE_READ_I_O_P_S_DEVICE,
  ContainerResourceConfig.JSON_PROPERTY_THROTTLE_WRITE_BPS_DEVICE,
  ContainerResourceConfig.JSON_PROPERTY_THROTTLE_WRITE_I_O_P_S_DEVICE,
  ContainerResourceConfig.JSON_PROPERTY_UNIFIED,
  ContainerResourceConfig.JSON_PROPERTY_WEIGHT_DEVICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ContainerResourceConfig {
  public static final String JSON_PROPERTY_INTEL_RDT = "intelRdt";
  private LinuxIntelRdt intelRdt;

  public static final String JSON_PROPERTY_OOM_SCORE_ADJ = "oom_score_adj";
  private Long oomScoreAdj;

  public static final String JSON_PROPERTY_R_LIMITS = "r_limits";
  private List<@Valid POSIXRlimit> rLimits = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOURCE_LIMITS = "resource_limits";
  private LinuxResources resourceLimits;

  public static final String JSON_PROPERTY_THROTTLE_READ_BPS_DEVICE = "throttleReadBpsDevice";
  private Map<String, LinuxThrottleDevice> throttleReadBpsDevice = new HashMap<>();

  public static final String JSON_PROPERTY_THROTTLE_READ_I_O_P_S_DEVICE = "throttleReadIOPSDevice";
  private Map<String, LinuxThrottleDevice> throttleReadIOPSDevice = new HashMap<>();

  public static final String JSON_PROPERTY_THROTTLE_WRITE_BPS_DEVICE = "throttleWriteBpsDevice";
  private Map<String, LinuxThrottleDevice> throttleWriteBpsDevice = new HashMap<>();

  public static final String JSON_PROPERTY_THROTTLE_WRITE_I_O_P_S_DEVICE = "throttleWriteIOPSDevice";
  private Map<String, LinuxThrottleDevice> throttleWriteIOPSDevice = new HashMap<>();

  public static final String JSON_PROPERTY_UNIFIED = "unified";
  private Map<String, String> unified = new HashMap<>();

  public static final String JSON_PROPERTY_WEIGHT_DEVICE = "weightDevice";
  private Map<String, LinuxWeightDevice> weightDevice = new HashMap<>();

  public ContainerResourceConfig() { 
  }

  public ContainerResourceConfig intelRdt(LinuxIntelRdt intelRdt) {
    this.intelRdt = intelRdt;
    return this;
  }

  /**
   * Get intelRdt
   * @return intelRdt
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_INTEL_RDT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LinuxIntelRdt getIntelRdt() {
    return intelRdt;
  }


  @JsonProperty(JSON_PROPERTY_INTEL_RDT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntelRdt(LinuxIntelRdt intelRdt) {
    this.intelRdt = intelRdt;
  }


  public ContainerResourceConfig oomScoreAdj(Long oomScoreAdj) {
    this.oomScoreAdj = oomScoreAdj;
    return this;
  }

  /**
   * OOMScoreAdj adjusts the score used by the OOM killer to determine processes to kill for the container&#39;s process. Optional.
   * @return oomScoreAdj
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OOM_SCORE_ADJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOomScoreAdj() {
    return oomScoreAdj;
  }


  @JsonProperty(JSON_PROPERTY_OOM_SCORE_ADJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOomScoreAdj(Long oomScoreAdj) {
    this.oomScoreAdj = oomScoreAdj;
  }


  public ContainerResourceConfig rLimits(List<@Valid POSIXRlimit> rLimits) {
    this.rLimits = rLimits;
    return this;
  }

  public ContainerResourceConfig addRLimitsItem(POSIXRlimit rLimitsItem) {
    if (this.rLimits == null) {
      this.rLimits = new ArrayList<>();
    }
    this.rLimits.add(rLimitsItem);
    return this;
  }

  /**
   * Rlimits are POSIX rlimits to apply to the container. Optional.
   * @return rLimits
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_R_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid POSIXRlimit> getrLimits() {
    return rLimits;
  }


  @JsonProperty(JSON_PROPERTY_R_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setrLimits(List<@Valid POSIXRlimit> rLimits) {
    this.rLimits = rLimits;
  }


  public ContainerResourceConfig resourceLimits(LinuxResources resourceLimits) {
    this.resourceLimits = resourceLimits;
    return this;
  }

  /**
   * Get resourceLimits
   * @return resourceLimits
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_RESOURCE_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LinuxResources getResourceLimits() {
    return resourceLimits;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceLimits(LinuxResources resourceLimits) {
    this.resourceLimits = resourceLimits;
  }


  public ContainerResourceConfig throttleReadBpsDevice(Map<String, LinuxThrottleDevice> throttleReadBpsDevice) {
    this.throttleReadBpsDevice = throttleReadBpsDevice;
    return this;
  }

  public ContainerResourceConfig putThrottleReadBpsDeviceItem(String key, LinuxThrottleDevice throttleReadBpsDeviceItem) {
    if (this.throttleReadBpsDevice == null) {
      this.throttleReadBpsDevice = new HashMap<>();
    }
    this.throttleReadBpsDevice.put(key, throttleReadBpsDeviceItem);
    return this;
  }

  /**
   * IO read rate limit per cgroup per device, bytes per second
   * @return throttleReadBpsDevice
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_THROTTLE_READ_BPS_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, LinuxThrottleDevice> getThrottleReadBpsDevice() {
    return throttleReadBpsDevice;
  }


  @JsonProperty(JSON_PROPERTY_THROTTLE_READ_BPS_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThrottleReadBpsDevice(Map<String, LinuxThrottleDevice> throttleReadBpsDevice) {
    this.throttleReadBpsDevice = throttleReadBpsDevice;
  }


  public ContainerResourceConfig throttleReadIOPSDevice(Map<String, LinuxThrottleDevice> throttleReadIOPSDevice) {
    this.throttleReadIOPSDevice = throttleReadIOPSDevice;
    return this;
  }

  public ContainerResourceConfig putThrottleReadIOPSDeviceItem(String key, LinuxThrottleDevice throttleReadIOPSDeviceItem) {
    if (this.throttleReadIOPSDevice == null) {
      this.throttleReadIOPSDevice = new HashMap<>();
    }
    this.throttleReadIOPSDevice.put(key, throttleReadIOPSDeviceItem);
    return this;
  }

  /**
   * IO read rate limit per cgroup per device, IO per second
   * @return throttleReadIOPSDevice
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_THROTTLE_READ_I_O_P_S_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, LinuxThrottleDevice> getThrottleReadIOPSDevice() {
    return throttleReadIOPSDevice;
  }


  @JsonProperty(JSON_PROPERTY_THROTTLE_READ_I_O_P_S_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThrottleReadIOPSDevice(Map<String, LinuxThrottleDevice> throttleReadIOPSDevice) {
    this.throttleReadIOPSDevice = throttleReadIOPSDevice;
  }


  public ContainerResourceConfig throttleWriteBpsDevice(Map<String, LinuxThrottleDevice> throttleWriteBpsDevice) {
    this.throttleWriteBpsDevice = throttleWriteBpsDevice;
    return this;
  }

  public ContainerResourceConfig putThrottleWriteBpsDeviceItem(String key, LinuxThrottleDevice throttleWriteBpsDeviceItem) {
    if (this.throttleWriteBpsDevice == null) {
      this.throttleWriteBpsDevice = new HashMap<>();
    }
    this.throttleWriteBpsDevice.put(key, throttleWriteBpsDeviceItem);
    return this;
  }

  /**
   * IO write rate limit per cgroup per device, bytes per second
   * @return throttleWriteBpsDevice
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_THROTTLE_WRITE_BPS_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, LinuxThrottleDevice> getThrottleWriteBpsDevice() {
    return throttleWriteBpsDevice;
  }


  @JsonProperty(JSON_PROPERTY_THROTTLE_WRITE_BPS_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThrottleWriteBpsDevice(Map<String, LinuxThrottleDevice> throttleWriteBpsDevice) {
    this.throttleWriteBpsDevice = throttleWriteBpsDevice;
  }


  public ContainerResourceConfig throttleWriteIOPSDevice(Map<String, LinuxThrottleDevice> throttleWriteIOPSDevice) {
    this.throttleWriteIOPSDevice = throttleWriteIOPSDevice;
    return this;
  }

  public ContainerResourceConfig putThrottleWriteIOPSDeviceItem(String key, LinuxThrottleDevice throttleWriteIOPSDeviceItem) {
    if (this.throttleWriteIOPSDevice == null) {
      this.throttleWriteIOPSDevice = new HashMap<>();
    }
    this.throttleWriteIOPSDevice.put(key, throttleWriteIOPSDeviceItem);
    return this;
  }

  /**
   * IO write rate limit per cgroup per device, IO per second
   * @return throttleWriteIOPSDevice
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_THROTTLE_WRITE_I_O_P_S_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, LinuxThrottleDevice> getThrottleWriteIOPSDevice() {
    return throttleWriteIOPSDevice;
  }


  @JsonProperty(JSON_PROPERTY_THROTTLE_WRITE_I_O_P_S_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThrottleWriteIOPSDevice(Map<String, LinuxThrottleDevice> throttleWriteIOPSDevice) {
    this.throttleWriteIOPSDevice = throttleWriteIOPSDevice;
  }


  public ContainerResourceConfig unified(Map<String, String> unified) {
    this.unified = unified;
    return this;
  }

  public ContainerResourceConfig putUnifiedItem(String key, String unifiedItem) {
    if (this.unified == null) {
      this.unified = new HashMap<>();
    }
    this.unified.put(key, unifiedItem);
    return this;
  }

  /**
   * CgroupConf are key-value options passed into the container runtime that are used to configure cgroup v2. Optional.
   * @return unified
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_UNIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getUnified() {
    return unified;
  }


  @JsonProperty(JSON_PROPERTY_UNIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnified(Map<String, String> unified) {
    this.unified = unified;
  }


  public ContainerResourceConfig weightDevice(Map<String, LinuxWeightDevice> weightDevice) {
    this.weightDevice = weightDevice;
    return this;
  }

  public ContainerResourceConfig putWeightDeviceItem(String key, LinuxWeightDevice weightDeviceItem) {
    if (this.weightDevice == null) {
      this.weightDevice = new HashMap<>();
    }
    this.weightDevice.put(key, weightDeviceItem);
    return this;
  }

  /**
   * Weight per cgroup per device, can override BlkioWeight
   * @return weightDevice
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_WEIGHT_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, LinuxWeightDevice> getWeightDevice() {
    return weightDevice;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeightDevice(Map<String, LinuxWeightDevice> weightDevice) {
    this.weightDevice = weightDevice;
  }


  /**
   * Return true if this ContainerResourceConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerResourceConfig containerResourceConfig = (ContainerResourceConfig) o;
    return Objects.equals(this.intelRdt, containerResourceConfig.intelRdt) &&
        Objects.equals(this.oomScoreAdj, containerResourceConfig.oomScoreAdj) &&
        Objects.equals(this.rLimits, containerResourceConfig.rLimits) &&
        Objects.equals(this.resourceLimits, containerResourceConfig.resourceLimits) &&
        Objects.equals(this.throttleReadBpsDevice, containerResourceConfig.throttleReadBpsDevice) &&
        Objects.equals(this.throttleReadIOPSDevice, containerResourceConfig.throttleReadIOPSDevice) &&
        Objects.equals(this.throttleWriteBpsDevice, containerResourceConfig.throttleWriteBpsDevice) &&
        Objects.equals(this.throttleWriteIOPSDevice, containerResourceConfig.throttleWriteIOPSDevice) &&
        Objects.equals(this.unified, containerResourceConfig.unified) &&
        Objects.equals(this.weightDevice, containerResourceConfig.weightDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intelRdt, oomScoreAdj, rLimits, resourceLimits, throttleReadBpsDevice, throttleReadIOPSDevice, throttleWriteBpsDevice, throttleWriteIOPSDevice, unified, weightDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerResourceConfig {\n");
    sb.append("    intelRdt: ").append(toIndentedString(intelRdt)).append("\n");
    sb.append("    oomScoreAdj: ").append(toIndentedString(oomScoreAdj)).append("\n");
    sb.append("    rLimits: ").append(toIndentedString(rLimits)).append("\n");
    sb.append("    resourceLimits: ").append(toIndentedString(resourceLimits)).append("\n");
    sb.append("    throttleReadBpsDevice: ").append(toIndentedString(throttleReadBpsDevice)).append("\n");
    sb.append("    throttleReadIOPSDevice: ").append(toIndentedString(throttleReadIOPSDevice)).append("\n");
    sb.append("    throttleWriteBpsDevice: ").append(toIndentedString(throttleWriteBpsDevice)).append("\n");
    sb.append("    throttleWriteIOPSDevice: ").append(toIndentedString(throttleWriteIOPSDevice)).append("\n");
    sb.append("    unified: ").append(toIndentedString(unified)).append("\n");
    sb.append("    weightDevice: ").append(toIndentedString(weightDevice)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `intelRdt` to the URL query string
    if (getIntelRdt() != null) {
      joiner.add(getIntelRdt().toUrlQueryString(prefix + "intelRdt" + suffix));
    }

    // add `oom_score_adj` to the URL query string
    if (getOomScoreAdj() != null) {
      joiner.add(String.format("%soom_score_adj%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOomScoreAdj()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `r_limits` to the URL query string
    if (getrLimits() != null) {
      for (int i = 0; i < getrLimits().size(); i++) {
        if (getrLimits().get(i) != null) {
          joiner.add(getrLimits().get(i).toUrlQueryString(String.format("%sr_limits%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `resource_limits` to the URL query string
    if (getResourceLimits() != null) {
      joiner.add(getResourceLimits().toUrlQueryString(prefix + "resource_limits" + suffix));
    }

    // add `throttleReadBpsDevice` to the URL query string
    if (getThrottleReadBpsDevice() != null) {
      for (String _key : getThrottleReadBpsDevice().keySet()) {
        if (getThrottleReadBpsDevice().get(_key) != null) {
          joiner.add(getThrottleReadBpsDevice().get(_key).toUrlQueryString(String.format("%sthrottleReadBpsDevice%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `throttleReadIOPSDevice` to the URL query string
    if (getThrottleReadIOPSDevice() != null) {
      for (String _key : getThrottleReadIOPSDevice().keySet()) {
        if (getThrottleReadIOPSDevice().get(_key) != null) {
          joiner.add(getThrottleReadIOPSDevice().get(_key).toUrlQueryString(String.format("%sthrottleReadIOPSDevice%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `throttleWriteBpsDevice` to the URL query string
    if (getThrottleWriteBpsDevice() != null) {
      for (String _key : getThrottleWriteBpsDevice().keySet()) {
        if (getThrottleWriteBpsDevice().get(_key) != null) {
          joiner.add(getThrottleWriteBpsDevice().get(_key).toUrlQueryString(String.format("%sthrottleWriteBpsDevice%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `throttleWriteIOPSDevice` to the URL query string
    if (getThrottleWriteIOPSDevice() != null) {
      for (String _key : getThrottleWriteIOPSDevice().keySet()) {
        if (getThrottleWriteIOPSDevice().get(_key) != null) {
          joiner.add(getThrottleWriteIOPSDevice().get(_key).toUrlQueryString(String.format("%sthrottleWriteIOPSDevice%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `unified` to the URL query string
    if (getUnified() != null) {
      for (String _key : getUnified().keySet()) {
        joiner.add(String.format("%sunified%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getUnified().get(_key), URLEncoder.encode(ApiClient.valueToString(getUnified().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `weightDevice` to the URL query string
    if (getWeightDevice() != null) {
      for (String _key : getWeightDevice().keySet()) {
        if (getWeightDevice().get(_key) != null) {
          joiner.add(getWeightDevice().get(_key).toUrlQueryString(String.format("%sweightDevice%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

