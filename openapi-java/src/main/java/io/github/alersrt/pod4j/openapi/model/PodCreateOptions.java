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
import io.github.alersrt.pod4j.openapi.model.NetOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

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
 * The JSON tags below are made to match the respective field in ContainerCreateOptions for the purpose of mapping.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T03:11:38.353612246+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class PodCreateOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CGROUP_PARENT = "cgroup_parent";
  @SerializedName(SERIALIZED_NAME_CGROUP_PARENT)
  private String cgroupParent;

  public static final String SERIALIZED_NAME_CONTAINER_COMMAND = "container_command";
  @SerializedName(SERIALIZED_NAME_CONTAINER_COMMAND)
  private String containerCommand;

  public static final String SERIALIZED_NAME_CONTAINER_CONMON_PIDFILE = "container_conmon_pidfile";
  @SerializedName(SERIALIZED_NAME_CONTAINER_CONMON_PIDFILE)
  private String containerConmonPidfile;

  public static final String SERIALIZED_NAME_CONTAINER_NAME = "container_name";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_CPUS = "cpus";
  @SerializedName(SERIALIZED_NAME_CPUS)
  private Double cpus;

  public static final String SERIALIZED_NAME_CPUSET_CPUS = "cpuset_cpus";
  @SerializedName(SERIALIZED_NAME_CPUSET_CPUS)
  private String cpusetCpus;

  public static final String SERIALIZED_NAME_CREATE_COMMAND = "create_command";
  @SerializedName(SERIALIZED_NAME_CREATE_COMMAND)
  private List<String> createCommand = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEVICE_READ_BPS = "device_read_bps";
  @SerializedName(SERIALIZED_NAME_DEVICE_READ_BPS)
  private List<String> deviceReadBps = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<String> devices = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXIT_POLICY = "exit_policy";
  @SerializedName(SERIALIZED_NAME_EXIT_POLICY)
  private String exitPolicy;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_INFRA = "infra";
  @SerializedName(SERIALIZED_NAME_INFRA)
  private Boolean infra;

  public static final String SERIALIZED_NAME_INFRA_IMAGE = "infra_image";
  @SerializedName(SERIALIZED_NAME_INFRA_IMAGE)
  private String infraImage;

  public static final String SERIALIZED_NAME_IPC = "ipc";
  @SerializedName(SERIALIZED_NAME_IPC)
  private String ipc;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NET = "net";
  @SerializedName(SERIALIZED_NAME_NET)
  private NetOptions net;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_RESTART = "restart";
  @SerializedName(SERIALIZED_NAME_RESTART)
  private String restart;

  public static final String SERIALIZED_NAME_SECURITY_OPT = "security_opt";
  @SerializedName(SERIALIZED_NAME_SECURITY_OPT)
  private List<String> securityOpt = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private List<String> share = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHARE_PARENT = "share_parent";
  @SerializedName(SERIALIZED_NAME_SHARE_PARENT)
  private Boolean shareParent;

  public static final String SERIALIZED_NAME_SYSCTL = "sysctl";
  @SerializedName(SERIALIZED_NAME_SYSCTL)
  private List<String> sysctl = new ArrayList<>();

  public static final String SERIALIZED_NAME_UTS = "uts";
  @SerializedName(SERIALIZED_NAME_UTS)
  private String uts;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private List<String> volume = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOLUMES_FROM = "volumes_from";
  @SerializedName(SERIALIZED_NAME_VOLUMES_FROM)
  private List<String> volumesFrom = new ArrayList<>();

  public PodCreateOptions() {
  }

  public PodCreateOptions cgroupParent(String cgroupParent) {
    this.cgroupParent = cgroupParent;
    return this;
  }

  /**
   * Get cgroupParent
   * @return cgroupParent
   */
  @jakarta.annotation.Nullable

  public String getCgroupParent() {
    return cgroupParent;
  }

  public void setCgroupParent(String cgroupParent) {
    this.cgroupParent = cgroupParent;
  }


  public PodCreateOptions containerCommand(String containerCommand) {
    this.containerCommand = containerCommand;
    return this;
  }

  /**
   * Get containerCommand
   * @return containerCommand
   */
  @jakarta.annotation.Nullable

  public String getContainerCommand() {
    return containerCommand;
  }

  public void setContainerCommand(String containerCommand) {
    this.containerCommand = containerCommand;
  }


  public PodCreateOptions containerConmonPidfile(String containerConmonPidfile) {
    this.containerConmonPidfile = containerConmonPidfile;
    return this;
  }

  /**
   * Get containerConmonPidfile
   * @return containerConmonPidfile
   */
  @jakarta.annotation.Nullable

  public String getContainerConmonPidfile() {
    return containerConmonPidfile;
  }

  public void setContainerConmonPidfile(String containerConmonPidfile) {
    this.containerConmonPidfile = containerConmonPidfile;
  }


  public PodCreateOptions containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

  /**
   * Get containerName
   * @return containerName
   */
  @jakarta.annotation.Nullable

  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }


  public PodCreateOptions cpus(Double cpus) {
    this.cpus = cpus;
    return this;
  }

  /**
   * Get cpus
   * @return cpus
   */
  @jakarta.annotation.Nullable

  public Double getCpus() {
    return cpus;
  }

  public void setCpus(Double cpus) {
    this.cpus = cpus;
  }


  public PodCreateOptions cpusetCpus(String cpusetCpus) {
    this.cpusetCpus = cpusetCpus;
    return this;
  }

  /**
   * Get cpusetCpus
   * @return cpusetCpus
   */
  @jakarta.annotation.Nullable

  public String getCpusetCpus() {
    return cpusetCpus;
  }

  public void setCpusetCpus(String cpusetCpus) {
    this.cpusetCpus = cpusetCpus;
  }


  public PodCreateOptions createCommand(List<String> createCommand) {
    this.createCommand = createCommand;
    return this;
  }

  public PodCreateOptions addCreateCommandItem(String createCommandItem) {
    if (this.createCommand == null) {
      this.createCommand = new ArrayList<>();
    }
    this.createCommand.add(createCommandItem);
    return this;
  }

  /**
   * Get createCommand
   * @return createCommand
   */
  @jakarta.annotation.Nullable

  public List<String> getCreateCommand() {
    return createCommand;
  }

  public void setCreateCommand(List<String> createCommand) {
    this.createCommand = createCommand;
  }


  public PodCreateOptions deviceReadBps(List<String> deviceReadBps) {
    this.deviceReadBps = deviceReadBps;
    return this;
  }

  public PodCreateOptions addDeviceReadBpsItem(String deviceReadBpsItem) {
    if (this.deviceReadBps == null) {
      this.deviceReadBps = new ArrayList<>();
    }
    this.deviceReadBps.add(deviceReadBpsItem);
    return this;
  }

  /**
   * Get deviceReadBps
   * @return deviceReadBps
   */
  @jakarta.annotation.Nullable

  public List<String> getDeviceReadBps() {
    return deviceReadBps;
  }

  public void setDeviceReadBps(List<String> deviceReadBps) {
    this.deviceReadBps = deviceReadBps;
  }


  public PodCreateOptions devices(List<String> devices) {
    this.devices = devices;
    return this;
  }

  public PodCreateOptions addDevicesItem(String devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * Get devices
   * @return devices
   */
  @jakarta.annotation.Nullable

  public List<String> getDevices() {
    return devices;
  }

  public void setDevices(List<String> devices) {
    this.devices = devices;
  }


  public PodCreateOptions exitPolicy(String exitPolicy) {
    this.exitPolicy = exitPolicy;
    return this;
  }

  /**
   * Get exitPolicy
   * @return exitPolicy
   */
  @jakarta.annotation.Nullable

  public String getExitPolicy() {
    return exitPolicy;
  }

  public void setExitPolicy(String exitPolicy) {
    this.exitPolicy = exitPolicy;
  }


  public PodCreateOptions hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Get hostname
   * @return hostname
   */
  @jakarta.annotation.Nullable

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public PodCreateOptions infra(Boolean infra) {
    this.infra = infra;
    return this;
  }

  /**
   * Get infra
   * @return infra
   */
  @jakarta.annotation.Nullable

  public Boolean getInfra() {
    return infra;
  }

  public void setInfra(Boolean infra) {
    this.infra = infra;
  }


  public PodCreateOptions infraImage(String infraImage) {
    this.infraImage = infraImage;
    return this;
  }

  /**
   * Get infraImage
   * @return infraImage
   */
  @jakarta.annotation.Nullable

  public String getInfraImage() {
    return infraImage;
  }

  public void setInfraImage(String infraImage) {
    this.infraImage = infraImage;
  }


  public PodCreateOptions ipc(String ipc) {
    this.ipc = ipc;
    return this;
  }

  /**
   * Get ipc
   * @return ipc
   */
  @jakarta.annotation.Nullable

  public String getIpc() {
    return ipc;
  }

  public void setIpc(String ipc) {
    this.ipc = ipc;
  }


  public PodCreateOptions labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public PodCreateOptions putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public PodCreateOptions name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nullable

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PodCreateOptions net(NetOptions net) {
    this.net = net;
    return this;
  }

  /**
   * Get net
   * @return net
   */
  @jakarta.annotation.Nullable
  @Valid

  public NetOptions getNet() {
    return net;
  }

  public void setNet(NetOptions net) {
    this.net = net;
  }


  public PodCreateOptions pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  @jakarta.annotation.Nullable

  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }


  public PodCreateOptions restart(String restart) {
    this.restart = restart;
    return this;
  }

  /**
   * Get restart
   * @return restart
   */
  @jakarta.annotation.Nullable

  public String getRestart() {
    return restart;
  }

  public void setRestart(String restart) {
    this.restart = restart;
  }


  public PodCreateOptions securityOpt(List<String> securityOpt) {
    this.securityOpt = securityOpt;
    return this;
  }

  public PodCreateOptions addSecurityOptItem(String securityOptItem) {
    if (this.securityOpt == null) {
      this.securityOpt = new ArrayList<>();
    }
    this.securityOpt.add(securityOptItem);
    return this;
  }

  /**
   * Get securityOpt
   * @return securityOpt
   */
  @jakarta.annotation.Nullable

  public List<String> getSecurityOpt() {
    return securityOpt;
  }

  public void setSecurityOpt(List<String> securityOpt) {
    this.securityOpt = securityOpt;
  }


  public PodCreateOptions share(List<String> share) {
    this.share = share;
    return this;
  }

  public PodCreateOptions addShareItem(String shareItem) {
    if (this.share == null) {
      this.share = new ArrayList<>();
    }
    this.share.add(shareItem);
    return this;
  }

  /**
   * Get share
   * @return share
   */
  @jakarta.annotation.Nullable

  public List<String> getShare() {
    return share;
  }

  public void setShare(List<String> share) {
    this.share = share;
  }


  public PodCreateOptions shareParent(Boolean shareParent) {
    this.shareParent = shareParent;
    return this;
  }

  /**
   * Get shareParent
   * @return shareParent
   */
  @jakarta.annotation.Nullable

  public Boolean getShareParent() {
    return shareParent;
  }

  public void setShareParent(Boolean shareParent) {
    this.shareParent = shareParent;
  }


  public PodCreateOptions sysctl(List<String> sysctl) {
    this.sysctl = sysctl;
    return this;
  }

  public PodCreateOptions addSysctlItem(String sysctlItem) {
    if (this.sysctl == null) {
      this.sysctl = new ArrayList<>();
    }
    this.sysctl.add(sysctlItem);
    return this;
  }

  /**
   * Get sysctl
   * @return sysctl
   */
  @jakarta.annotation.Nullable

  public List<String> getSysctl() {
    return sysctl;
  }

  public void setSysctl(List<String> sysctl) {
    this.sysctl = sysctl;
  }


  public PodCreateOptions uts(String uts) {
    this.uts = uts;
    return this;
  }

  /**
   * Get uts
   * @return uts
   */
  @jakarta.annotation.Nullable

  public String getUts() {
    return uts;
  }

  public void setUts(String uts) {
    this.uts = uts;
  }


  public PodCreateOptions volume(List<String> volume) {
    this.volume = volume;
    return this;
  }

  public PodCreateOptions addVolumeItem(String volumeItem) {
    if (this.volume == null) {
      this.volume = new ArrayList<>();
    }
    this.volume.add(volumeItem);
    return this;
  }

  /**
   * Get volume
   * @return volume
   */
  @jakarta.annotation.Nullable

  public List<String> getVolume() {
    return volume;
  }

  public void setVolume(List<String> volume) {
    this.volume = volume;
  }


  public PodCreateOptions volumesFrom(List<String> volumesFrom) {
    this.volumesFrom = volumesFrom;
    return this;
  }

  public PodCreateOptions addVolumesFromItem(String volumesFromItem) {
    if (this.volumesFrom == null) {
      this.volumesFrom = new ArrayList<>();
    }
    this.volumesFrom.add(volumesFromItem);
    return this;
  }

  /**
   * Get volumesFrom
   * @return volumesFrom
   */
  @jakarta.annotation.Nullable

  public List<String> getVolumesFrom() {
    return volumesFrom;
  }

  public void setVolumesFrom(List<String> volumesFrom) {
    this.volumesFrom = volumesFrom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodCreateOptions podCreateOptions = (PodCreateOptions) o;
    return Objects.equals(this.cgroupParent, podCreateOptions.cgroupParent) &&
        Objects.equals(this.containerCommand, podCreateOptions.containerCommand) &&
        Objects.equals(this.containerConmonPidfile, podCreateOptions.containerConmonPidfile) &&
        Objects.equals(this.containerName, podCreateOptions.containerName) &&
        Objects.equals(this.cpus, podCreateOptions.cpus) &&
        Objects.equals(this.cpusetCpus, podCreateOptions.cpusetCpus) &&
        Objects.equals(this.createCommand, podCreateOptions.createCommand) &&
        Objects.equals(this.deviceReadBps, podCreateOptions.deviceReadBps) &&
        Objects.equals(this.devices, podCreateOptions.devices) &&
        Objects.equals(this.exitPolicy, podCreateOptions.exitPolicy) &&
        Objects.equals(this.hostname, podCreateOptions.hostname) &&
        Objects.equals(this.infra, podCreateOptions.infra) &&
        Objects.equals(this.infraImage, podCreateOptions.infraImage) &&
        Objects.equals(this.ipc, podCreateOptions.ipc) &&
        Objects.equals(this.labels, podCreateOptions.labels) &&
        Objects.equals(this.name, podCreateOptions.name) &&
        Objects.equals(this.net, podCreateOptions.net) &&
        Objects.equals(this.pid, podCreateOptions.pid) &&
        Objects.equals(this.restart, podCreateOptions.restart) &&
        Objects.equals(this.securityOpt, podCreateOptions.securityOpt) &&
        Objects.equals(this.share, podCreateOptions.share) &&
        Objects.equals(this.shareParent, podCreateOptions.shareParent) &&
        Objects.equals(this.sysctl, podCreateOptions.sysctl) &&
        Objects.equals(this.uts, podCreateOptions.uts) &&
        Objects.equals(this.volume, podCreateOptions.volume) &&
        Objects.equals(this.volumesFrom, podCreateOptions.volumesFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cgroupParent, containerCommand, containerConmonPidfile, containerName, cpus, cpusetCpus, createCommand, deviceReadBps, devices, exitPolicy, hostname, infra, infraImage, ipc, labels, name, net, pid, restart, securityOpt, share, shareParent, sysctl, uts, volume, volumesFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodCreateOptions {\n");
    sb.append("    cgroupParent: ").append(toIndentedString(cgroupParent)).append("\n");
    sb.append("    containerCommand: ").append(toIndentedString(containerCommand)).append("\n");
    sb.append("    containerConmonPidfile: ").append(toIndentedString(containerConmonPidfile)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    cpusetCpus: ").append(toIndentedString(cpusetCpus)).append("\n");
    sb.append("    createCommand: ").append(toIndentedString(createCommand)).append("\n");
    sb.append("    deviceReadBps: ").append(toIndentedString(deviceReadBps)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    exitPolicy: ").append(toIndentedString(exitPolicy)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    infra: ").append(toIndentedString(infra)).append("\n");
    sb.append("    infraImage: ").append(toIndentedString(infraImage)).append("\n");
    sb.append("    ipc: ").append(toIndentedString(ipc)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
    sb.append("    securityOpt: ").append(toIndentedString(securityOpt)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    shareParent: ").append(toIndentedString(shareParent)).append("\n");
    sb.append("    sysctl: ").append(toIndentedString(sysctl)).append("\n");
    sb.append("    uts: ").append(toIndentedString(uts)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    volumesFrom: ").append(toIndentedString(volumesFrom)).append("\n");
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
    openapiFields.add("cgroup_parent");
    openapiFields.add("container_command");
    openapiFields.add("container_conmon_pidfile");
    openapiFields.add("container_name");
    openapiFields.add("cpus");
    openapiFields.add("cpuset_cpus");
    openapiFields.add("create_command");
    openapiFields.add("device_read_bps");
    openapiFields.add("devices");
    openapiFields.add("exit_policy");
    openapiFields.add("hostname");
    openapiFields.add("infra");
    openapiFields.add("infra_image");
    openapiFields.add("ipc");
    openapiFields.add("labels");
    openapiFields.add("name");
    openapiFields.add("net");
    openapiFields.add("pid");
    openapiFields.add("restart");
    openapiFields.add("security_opt");
    openapiFields.add("share");
    openapiFields.add("share_parent");
    openapiFields.add("sysctl");
    openapiFields.add("uts");
    openapiFields.add("volume");
    openapiFields.add("volumes_from");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PodCreateOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PodCreateOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PodCreateOptions is not found in the empty JSON string", PodCreateOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PodCreateOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PodCreateOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cgroup_parent") != null && !jsonObj.get("cgroup_parent").isJsonNull()) && !jsonObj.get("cgroup_parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cgroup_parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cgroup_parent").toString()));
      }
      if ((jsonObj.get("container_command") != null && !jsonObj.get("container_command").isJsonNull()) && !jsonObj.get("container_command").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `container_command` to be a primitive type in the JSON string but got `%s`", jsonObj.get("container_command").toString()));
      }
      if ((jsonObj.get("container_conmon_pidfile") != null && !jsonObj.get("container_conmon_pidfile").isJsonNull()) && !jsonObj.get("container_conmon_pidfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `container_conmon_pidfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("container_conmon_pidfile").toString()));
      }
      if ((jsonObj.get("container_name") != null && !jsonObj.get("container_name").isJsonNull()) && !jsonObj.get("container_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `container_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("container_name").toString()));
      }
      if ((jsonObj.get("cpuset_cpus") != null && !jsonObj.get("cpuset_cpus").isJsonNull()) && !jsonObj.get("cpuset_cpus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpuset_cpus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpuset_cpus").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("create_command") != null && !jsonObj.get("create_command").isJsonNull() && !jsonObj.get("create_command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_command` to be an array in the JSON string but got `%s`", jsonObj.get("create_command").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("device_read_bps") != null && !jsonObj.get("device_read_bps").isJsonNull() && !jsonObj.get("device_read_bps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_read_bps` to be an array in the JSON string but got `%s`", jsonObj.get("device_read_bps").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull() && !jsonObj.get("devices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
      }
      if ((jsonObj.get("exit_policy") != null && !jsonObj.get("exit_policy").isJsonNull()) && !jsonObj.get("exit_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exit_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exit_policy").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("infra_image") != null && !jsonObj.get("infra_image").isJsonNull()) && !jsonObj.get("infra_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `infra_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("infra_image").toString()));
      }
      if ((jsonObj.get("ipc") != null && !jsonObj.get("ipc").isJsonNull()) && !jsonObj.get("ipc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipc").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `net`
      if (jsonObj.get("net") != null && !jsonObj.get("net").isJsonNull()) {
        NetOptions.validateJsonElement(jsonObj.get("net"));
      }
      if ((jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonNull()) && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if ((jsonObj.get("restart") != null && !jsonObj.get("restart").isJsonNull()) && !jsonObj.get("restart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restart").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("security_opt") != null && !jsonObj.get("security_opt").isJsonNull() && !jsonObj.get("security_opt").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `security_opt` to be an array in the JSON string but got `%s`", jsonObj.get("security_opt").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("share") != null && !jsonObj.get("share").isJsonNull() && !jsonObj.get("share").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `share` to be an array in the JSON string but got `%s`", jsonObj.get("share").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sysctl") != null && !jsonObj.get("sysctl").isJsonNull() && !jsonObj.get("sysctl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sysctl` to be an array in the JSON string but got `%s`", jsonObj.get("sysctl").toString()));
      }
      if ((jsonObj.get("uts") != null && !jsonObj.get("uts").isJsonNull()) && !jsonObj.get("uts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uts").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("volume") != null && !jsonObj.get("volume").isJsonNull() && !jsonObj.get("volume").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume` to be an array in the JSON string but got `%s`", jsonObj.get("volume").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("volumes_from") != null && !jsonObj.get("volumes_from").isJsonNull() && !jsonObj.get("volumes_from").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumes_from` to be an array in the JSON string but got `%s`", jsonObj.get("volumes_from").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PodCreateOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PodCreateOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PodCreateOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PodCreateOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<PodCreateOptions>() {
           @Override
           public void write(JsonWriter out, PodCreateOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PodCreateOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PodCreateOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PodCreateOptions
   * @throws IOException if the JSON string is invalid with respect to PodCreateOptions
   */
  public static PodCreateOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PodCreateOptions.class);
  }

  /**
   * Convert an instance of PodCreateOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

