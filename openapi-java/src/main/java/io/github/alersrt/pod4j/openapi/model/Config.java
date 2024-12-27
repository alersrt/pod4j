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
import io.github.alersrt.pod4j.openapi.model.HealthcheckConfig;
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
 * It should hold only portable information about the container. Here, \&quot;portable\&quot; means \&quot;independent from the host we are running on\&quot;. Non-portable information *should* appear in HostConfig. All fields added to this struct must be marked &#x60;omitempty&#x60; to keep getting predictable hashes from the old &#x60;v1Compatibility&#x60; configuration.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T23:15:58.977038016+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Config implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ARGS_ESCAPED = "ArgsEscaped";
  @SerializedName(SERIALIZED_NAME_ARGS_ESCAPED)
  private Boolean argsEscaped;

  public static final String SERIALIZED_NAME_ATTACH_STDERR = "AttachStderr";
  @SerializedName(SERIALIZED_NAME_ATTACH_STDERR)
  private Boolean attachStderr;

  public static final String SERIALIZED_NAME_ATTACH_STDIN = "AttachStdin";
  @SerializedName(SERIALIZED_NAME_ATTACH_STDIN)
  private Boolean attachStdin;

  public static final String SERIALIZED_NAME_ATTACH_STDOUT = "AttachStdout";
  @SerializedName(SERIALIZED_NAME_ATTACH_STDOUT)
  private Boolean attachStdout;

  public static final String SERIALIZED_NAME_CMD = "Cmd";
  @SerializedName(SERIALIZED_NAME_CMD)
  private List<String> cmd = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOMAINNAME = "Domainname";
  @SerializedName(SERIALIZED_NAME_DOMAINNAME)
  private String domainname;

  public static final String SERIALIZED_NAME_ENTRYPOINT = "Entrypoint";
  @SerializedName(SERIALIZED_NAME_ENTRYPOINT)
  private List<String> entrypoint = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENV = "Env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<String> env = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPOSED_PORTS = "ExposedPorts";
  @SerializedName(SERIALIZED_NAME_EXPOSED_PORTS)
  private Map<String, Object> exposedPorts = new HashMap<>();

  public static final String SERIALIZED_NAME_HEALTHCHECK = "Healthcheck";
  @SerializedName(SERIALIZED_NAME_HEALTHCHECK)
  private HealthcheckConfig healthcheck;

  public static final String SERIALIZED_NAME_HOSTNAME = "Hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_IMAGE = "Image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "MacAddress";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_NETWORK_DISABLED = "NetworkDisabled";
  @SerializedName(SERIALIZED_NAME_NETWORK_DISABLED)
  private Boolean networkDisabled;

  public static final String SERIALIZED_NAME_ON_BUILD = "OnBuild";
  @SerializedName(SERIALIZED_NAME_ON_BUILD)
  private List<String> onBuild = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPEN_STDIN = "OpenStdin";
  @SerializedName(SERIALIZED_NAME_OPEN_STDIN)
  private Boolean openStdin;

  public static final String SERIALIZED_NAME_SHELL = "Shell";
  @SerializedName(SERIALIZED_NAME_SHELL)
  private List<String> shell = new ArrayList<>();

  public static final String SERIALIZED_NAME_STDIN_ONCE = "StdinOnce";
  @SerializedName(SERIALIZED_NAME_STDIN_ONCE)
  private Boolean stdinOnce;

  public static final String SERIALIZED_NAME_STOP_SIGNAL = "StopSignal";
  @SerializedName(SERIALIZED_NAME_STOP_SIGNAL)
  private String stopSignal;

  public static final String SERIALIZED_NAME_STOP_TIMEOUT = "StopTimeout";
  @SerializedName(SERIALIZED_NAME_STOP_TIMEOUT)
  private Long stopTimeout;

  public static final String SERIALIZED_NAME_TTY = "Tty";
  @SerializedName(SERIALIZED_NAME_TTY)
  private Boolean tty;

  public static final String SERIALIZED_NAME_USER = "User";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_VOLUMES = "Volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private Map<String, Object> volumes = new HashMap<>();

  public static final String SERIALIZED_NAME_WORKING_DIR = "WorkingDir";
  @SerializedName(SERIALIZED_NAME_WORKING_DIR)
  private String workingDir;

  public Config() {
  }

  public Config argsEscaped(Boolean argsEscaped) {
    this.argsEscaped = argsEscaped;
    return this;
  }

  /**
   * Get argsEscaped
   * @return argsEscaped
   */
  @jakarta.annotation.Nullable

  public Boolean getArgsEscaped() {
    return argsEscaped;
  }

  public void setArgsEscaped(Boolean argsEscaped) {
    this.argsEscaped = argsEscaped;
  }


  public Config attachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
    return this;
  }

  /**
   * Get attachStderr
   * @return attachStderr
   */
  @jakarta.annotation.Nullable

  public Boolean getAttachStderr() {
    return attachStderr;
  }

  public void setAttachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
  }


  public Config attachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
    return this;
  }

  /**
   * Get attachStdin
   * @return attachStdin
   */
  @jakarta.annotation.Nullable

  public Boolean getAttachStdin() {
    return attachStdin;
  }

  public void setAttachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
  }


  public Config attachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
    return this;
  }

  /**
   * Get attachStdout
   * @return attachStdout
   */
  @jakarta.annotation.Nullable

  public Boolean getAttachStdout() {
    return attachStdout;
  }

  public void setAttachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
  }


  public Config cmd(List<String> cmd) {
    this.cmd = cmd;
    return this;
  }

  public Config addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

  /**
   * We need to override the json decoder to accept both options.
   * @return cmd
   */
  @jakarta.annotation.Nullable

  public List<String> getCmd() {
    return cmd;
  }

  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }


  public Config domainname(String domainname) {
    this.domainname = domainname;
    return this;
  }

  /**
   * Get domainname
   * @return domainname
   */
  @jakarta.annotation.Nullable

  public String getDomainname() {
    return domainname;
  }

  public void setDomainname(String domainname) {
    this.domainname = domainname;
  }


  public Config entrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  public Config addEntrypointItem(String entrypointItem) {
    if (this.entrypoint == null) {
      this.entrypoint = new ArrayList<>();
    }
    this.entrypoint.add(entrypointItem);
    return this;
  }

  /**
   * We need to override the json decoder to accept both options.
   * @return entrypoint
   */
  @jakarta.annotation.Nullable

  public List<String> getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
  }


  public Config env(List<String> env) {
    this.env = env;
    return this;
  }

  public Config addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * Get env
   * @return env
   */
  @jakarta.annotation.Nullable

  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }


  public Config exposedPorts(Map<String, Object> exposedPorts) {
    this.exposedPorts = exposedPorts;
    return this;
  }

  public Config putExposedPortsItem(String key, Object exposedPortsItem) {
    if (this.exposedPorts == null) {
      this.exposedPorts = new HashMap<>();
    }
    this.exposedPorts.put(key, exposedPortsItem);
    return this;
  }

  /**
   * PortSet is a collection of structs indexed by Port
   * @return exposedPorts
   */
  @jakarta.annotation.Nullable

  public Map<String, Object> getExposedPorts() {
    return exposedPorts;
  }

  public void setExposedPorts(Map<String, Object> exposedPorts) {
    this.exposedPorts = exposedPorts;
  }


  public Config healthcheck(HealthcheckConfig healthcheck) {
    this.healthcheck = healthcheck;
    return this;
  }

  /**
   * Get healthcheck
   * @return healthcheck
   */
  @jakarta.annotation.Nullable
  @Valid

  public HealthcheckConfig getHealthcheck() {
    return healthcheck;
  }

  public void setHealthcheck(HealthcheckConfig healthcheck) {
    this.healthcheck = healthcheck;
  }


  public Config hostname(String hostname) {
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


  public Config image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @jakarta.annotation.Nullable

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public Config labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Config putLabelsItem(String key, String labelsItem) {
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


  public Config macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * Mac Address of the container.  Deprecated: this field is deprecated since API v1.44. Use EndpointSettings.MacAddress instead.
   * @return macAddress
   */
  @jakarta.annotation.Nullable

  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public Config networkDisabled(Boolean networkDisabled) {
    this.networkDisabled = networkDisabled;
    return this;
  }

  /**
   * Get networkDisabled
   * @return networkDisabled
   */
  @jakarta.annotation.Nullable

  public Boolean getNetworkDisabled() {
    return networkDisabled;
  }

  public void setNetworkDisabled(Boolean networkDisabled) {
    this.networkDisabled = networkDisabled;
  }


  public Config onBuild(List<String> onBuild) {
    this.onBuild = onBuild;
    return this;
  }

  public Config addOnBuildItem(String onBuildItem) {
    if (this.onBuild == null) {
      this.onBuild = new ArrayList<>();
    }
    this.onBuild.add(onBuildItem);
    return this;
  }

  /**
   * Get onBuild
   * @return onBuild
   */
  @jakarta.annotation.Nullable

  public List<String> getOnBuild() {
    return onBuild;
  }

  public void setOnBuild(List<String> onBuild) {
    this.onBuild = onBuild;
  }


  public Config openStdin(Boolean openStdin) {
    this.openStdin = openStdin;
    return this;
  }

  /**
   * Get openStdin
   * @return openStdin
   */
  @jakarta.annotation.Nullable

  public Boolean getOpenStdin() {
    return openStdin;
  }

  public void setOpenStdin(Boolean openStdin) {
    this.openStdin = openStdin;
  }


  public Config shell(List<String> shell) {
    this.shell = shell;
    return this;
  }

  public Config addShellItem(String shellItem) {
    if (this.shell == null) {
      this.shell = new ArrayList<>();
    }
    this.shell.add(shellItem);
    return this;
  }

  /**
   * We need to override the json decoder to accept both options.
   * @return shell
   */
  @jakarta.annotation.Nullable

  public List<String> getShell() {
    return shell;
  }

  public void setShell(List<String> shell) {
    this.shell = shell;
  }


  public Config stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

  /**
   * Get stdinOnce
   * @return stdinOnce
   */
  @jakarta.annotation.Nullable

  public Boolean getStdinOnce() {
    return stdinOnce;
  }

  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }


  public Config stopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
    return this;
  }

  /**
   * Get stopSignal
   * @return stopSignal
   */
  @jakarta.annotation.Nullable

  public String getStopSignal() {
    return stopSignal;
  }

  public void setStopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
  }


  public Config stopTimeout(Long stopTimeout) {
    this.stopTimeout = stopTimeout;
    return this;
  }

  /**
   * Get stopTimeout
   * @return stopTimeout
   */
  @jakarta.annotation.Nullable

  public Long getStopTimeout() {
    return stopTimeout;
  }

  public void setStopTimeout(Long stopTimeout) {
    this.stopTimeout = stopTimeout;
  }


  public Config tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Get tty
   * @return tty
   */
  @jakarta.annotation.Nullable

  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }


  public Config user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @jakarta.annotation.Nullable

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  public Config volumes(Map<String, Object> volumes) {
    this.volumes = volumes;
    return this;
  }

  public Config putVolumesItem(String key, Object volumesItem) {
    if (this.volumes == null) {
      this.volumes = new HashMap<>();
    }
    this.volumes.put(key, volumesItem);
    return this;
  }

  /**
   * Get volumes
   * @return volumes
   */
  @jakarta.annotation.Nullable

  public Map<String, Object> getVolumes() {
    return volumes;
  }

  public void setVolumes(Map<String, Object> volumes) {
    this.volumes = volumes;
  }


  public Config workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  /**
   * Get workingDir
   * @return workingDir
   */
  @jakarta.annotation.Nullable

  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return Objects.equals(this.argsEscaped, config.argsEscaped) &&
        Objects.equals(this.attachStderr, config.attachStderr) &&
        Objects.equals(this.attachStdin, config.attachStdin) &&
        Objects.equals(this.attachStdout, config.attachStdout) &&
        Objects.equals(this.cmd, config.cmd) &&
        Objects.equals(this.domainname, config.domainname) &&
        Objects.equals(this.entrypoint, config.entrypoint) &&
        Objects.equals(this.env, config.env) &&
        Objects.equals(this.exposedPorts, config.exposedPorts) &&
        Objects.equals(this.healthcheck, config.healthcheck) &&
        Objects.equals(this.hostname, config.hostname) &&
        Objects.equals(this.image, config.image) &&
        Objects.equals(this.labels, config.labels) &&
        Objects.equals(this.macAddress, config.macAddress) &&
        Objects.equals(this.networkDisabled, config.networkDisabled) &&
        Objects.equals(this.onBuild, config.onBuild) &&
        Objects.equals(this.openStdin, config.openStdin) &&
        Objects.equals(this.shell, config.shell) &&
        Objects.equals(this.stdinOnce, config.stdinOnce) &&
        Objects.equals(this.stopSignal, config.stopSignal) &&
        Objects.equals(this.stopTimeout, config.stopTimeout) &&
        Objects.equals(this.tty, config.tty) &&
        Objects.equals(this.user, config.user) &&
        Objects.equals(this.volumes, config.volumes) &&
        Objects.equals(this.workingDir, config.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argsEscaped, attachStderr, attachStdin, attachStdout, cmd, domainname, entrypoint, env, exposedPorts, healthcheck, hostname, image, labels, macAddress, networkDisabled, onBuild, openStdin, shell, stdinOnce, stopSignal, stopTimeout, tty, user, volumes, workingDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    sb.append("    argsEscaped: ").append(toIndentedString(argsEscaped)).append("\n");
    sb.append("    attachStderr: ").append(toIndentedString(attachStderr)).append("\n");
    sb.append("    attachStdin: ").append(toIndentedString(attachStdin)).append("\n");
    sb.append("    attachStdout: ").append(toIndentedString(attachStdout)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    domainname: ").append(toIndentedString(domainname)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    exposedPorts: ").append(toIndentedString(exposedPorts)).append("\n");
    sb.append("    healthcheck: ").append(toIndentedString(healthcheck)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    networkDisabled: ").append(toIndentedString(networkDisabled)).append("\n");
    sb.append("    onBuild: ").append(toIndentedString(onBuild)).append("\n");
    sb.append("    openStdin: ").append(toIndentedString(openStdin)).append("\n");
    sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    stopSignal: ").append(toIndentedString(stopSignal)).append("\n");
    sb.append("    stopTimeout: ").append(toIndentedString(stopTimeout)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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
    openapiFields.add("ArgsEscaped");
    openapiFields.add("AttachStderr");
    openapiFields.add("AttachStdin");
    openapiFields.add("AttachStdout");
    openapiFields.add("Cmd");
    openapiFields.add("Domainname");
    openapiFields.add("Entrypoint");
    openapiFields.add("Env");
    openapiFields.add("ExposedPorts");
    openapiFields.add("Healthcheck");
    openapiFields.add("Hostname");
    openapiFields.add("Image");
    openapiFields.add("Labels");
    openapiFields.add("MacAddress");
    openapiFields.add("NetworkDisabled");
    openapiFields.add("OnBuild");
    openapiFields.add("OpenStdin");
    openapiFields.add("Shell");
    openapiFields.add("StdinOnce");
    openapiFields.add("StopSignal");
    openapiFields.add("StopTimeout");
    openapiFields.add("Tty");
    openapiFields.add("User");
    openapiFields.add("Volumes");
    openapiFields.add("WorkingDir");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Config
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Config.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Config is not found in the empty JSON string", Config.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Config.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Config` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Cmd") != null && !jsonObj.get("Cmd").isJsonNull() && !jsonObj.get("Cmd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Cmd` to be an array in the JSON string but got `%s`", jsonObj.get("Cmd").toString()));
      }
      if ((jsonObj.get("Domainname") != null && !jsonObj.get("Domainname").isJsonNull()) && !jsonObj.get("Domainname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Domainname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Domainname").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Entrypoint") != null && !jsonObj.get("Entrypoint").isJsonNull() && !jsonObj.get("Entrypoint").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Entrypoint` to be an array in the JSON string but got `%s`", jsonObj.get("Entrypoint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Env") != null && !jsonObj.get("Env").isJsonNull() && !jsonObj.get("Env").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Env` to be an array in the JSON string but got `%s`", jsonObj.get("Env").toString()));
      }
      // validate the optional field `Healthcheck`
      if (jsonObj.get("Healthcheck") != null && !jsonObj.get("Healthcheck").isJsonNull()) {
        HealthcheckConfig.validateJsonElement(jsonObj.get("Healthcheck"));
      }
      if ((jsonObj.get("Hostname") != null && !jsonObj.get("Hostname").isJsonNull()) && !jsonObj.get("Hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Hostname").toString()));
      }
      if ((jsonObj.get("Image") != null && !jsonObj.get("Image").isJsonNull()) && !jsonObj.get("Image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Image").toString()));
      }
      if ((jsonObj.get("MacAddress") != null && !jsonObj.get("MacAddress").isJsonNull()) && !jsonObj.get("MacAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MacAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MacAddress").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("OnBuild") != null && !jsonObj.get("OnBuild").isJsonNull() && !jsonObj.get("OnBuild").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `OnBuild` to be an array in the JSON string but got `%s`", jsonObj.get("OnBuild").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Shell") != null && !jsonObj.get("Shell").isJsonNull() && !jsonObj.get("Shell").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Shell` to be an array in the JSON string but got `%s`", jsonObj.get("Shell").toString()));
      }
      if ((jsonObj.get("StopSignal") != null && !jsonObj.get("StopSignal").isJsonNull()) && !jsonObj.get("StopSignal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StopSignal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StopSignal").toString()));
      }
      if ((jsonObj.get("User") != null && !jsonObj.get("User").isJsonNull()) && !jsonObj.get("User").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `User` to be a primitive type in the JSON string but got `%s`", jsonObj.get("User").toString()));
      }
      if ((jsonObj.get("WorkingDir") != null && !jsonObj.get("WorkingDir").isJsonNull()) && !jsonObj.get("WorkingDir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkingDir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkingDir").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Config.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Config' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Config> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Config.class));

       return (TypeAdapter<T>) new TypeAdapter<Config>() {
           @Override
           public void write(JsonWriter out, Config value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Config read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Config given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Config
   * @throws IOException if the JSON string is invalid with respect to Config
   */
  public static Config fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Config.class);
  }

  /**
   * Convert an instance of Config to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

