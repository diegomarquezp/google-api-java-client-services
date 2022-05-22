/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.notebooks.v1.model;

/**
 * Specifies the selection and configuration of software inside the runtime. The properties to set
 * on runtime. Properties keys are specified in `key:value` format, for example: * `idle_shutdown:
 * true` * `idle_shutdown_timeout: 180` * `enable_health_monitoring: true`
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Notebooks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RuntimeSoftwareConfig extends com.google.api.client.json.GenericJson {

  /**
   * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll
   * automatically choose from official GPU drivers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customGpuDriverPath;

  /**
   * Verifies core internal services are running. Default: True
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableHealthMonitoring;

  /**
   * Runtime will automatically shutdown after idle_shutdown_time. Default: True
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean idleShutdown;

  /**
   * Time in minutes to wait before shutting down runtime. Default: 180 minutes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer idleShutdownTimeout;

  /**
   * Install Nvidia Driver automatically. Default: True
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean installGpuDriver;

  /**
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContainerImage> kernels;

  static {
    // hack to force ProGuard to consider ContainerImage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContainerImage.class);
  }

  /**
   * Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the
   * [cron format](https://en.wikipedia.org/wiki/Cron).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notebookUpgradeSchedule;

  /**
   * Path to a Bash script that automatically runs after a notebook instance fully boots up. The
   * path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postStartupScript;

  /**
   * Behavior for the post startup script.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postStartupScriptBehavior;

  /**
   * Output only. Bool indicating whether an newer image is available in an image family.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean upgradeable;

  /**
   * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll
   * automatically choose from official GPU drivers.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomGpuDriverPath() {
    return customGpuDriverPath;
  }

  /**
   * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll
   * automatically choose from official GPU drivers.
   * @param customGpuDriverPath customGpuDriverPath or {@code null} for none
   */
  public RuntimeSoftwareConfig setCustomGpuDriverPath(java.lang.String customGpuDriverPath) {
    this.customGpuDriverPath = customGpuDriverPath;
    return this;
  }

  /**
   * Verifies core internal services are running. Default: True
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableHealthMonitoring() {
    return enableHealthMonitoring;
  }

  /**
   * Verifies core internal services are running. Default: True
   * @param enableHealthMonitoring enableHealthMonitoring or {@code null} for none
   */
  public RuntimeSoftwareConfig setEnableHealthMonitoring(java.lang.Boolean enableHealthMonitoring) {
    this.enableHealthMonitoring = enableHealthMonitoring;
    return this;
  }

  /**
   * Runtime will automatically shutdown after idle_shutdown_time. Default: True
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIdleShutdown() {
    return idleShutdown;
  }

  /**
   * Runtime will automatically shutdown after idle_shutdown_time. Default: True
   * @param idleShutdown idleShutdown or {@code null} for none
   */
  public RuntimeSoftwareConfig setIdleShutdown(java.lang.Boolean idleShutdown) {
    this.idleShutdown = idleShutdown;
    return this;
  }

  /**
   * Time in minutes to wait before shutting down runtime. Default: 180 minutes
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIdleShutdownTimeout() {
    return idleShutdownTimeout;
  }

  /**
   * Time in minutes to wait before shutting down runtime. Default: 180 minutes
   * @param idleShutdownTimeout idleShutdownTimeout or {@code null} for none
   */
  public RuntimeSoftwareConfig setIdleShutdownTimeout(java.lang.Integer idleShutdownTimeout) {
    this.idleShutdownTimeout = idleShutdownTimeout;
    return this;
  }

  /**
   * Install Nvidia Driver automatically. Default: True
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInstallGpuDriver() {
    return installGpuDriver;
  }

  /**
   * Install Nvidia Driver automatically. Default: True
   * @param installGpuDriver installGpuDriver or {@code null} for none
   */
  public RuntimeSoftwareConfig setInstallGpuDriver(java.lang.Boolean installGpuDriver) {
    this.installGpuDriver = installGpuDriver;
    return this;
  }

  /**
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * @return value or {@code null} for none
   */
  public java.util.List<ContainerImage> getKernels() {
    return kernels;
  }

  /**
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * @param kernels kernels or {@code null} for none
   */
  public RuntimeSoftwareConfig setKernels(java.util.List<ContainerImage> kernels) {
    this.kernels = kernels;
    return this;
  }

  /**
   * Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the
   * [cron format](https://en.wikipedia.org/wiki/Cron).
   * @return value or {@code null} for none
   */
  public java.lang.String getNotebookUpgradeSchedule() {
    return notebookUpgradeSchedule;
  }

  /**
   * Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the
   * [cron format](https://en.wikipedia.org/wiki/Cron).
   * @param notebookUpgradeSchedule notebookUpgradeSchedule or {@code null} for none
   */
  public RuntimeSoftwareConfig setNotebookUpgradeSchedule(java.lang.String notebookUpgradeSchedule) {
    this.notebookUpgradeSchedule = notebookUpgradeSchedule;
    return this;
  }

  /**
   * Path to a Bash script that automatically runs after a notebook instance fully boots up. The
   * path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
   * @return value or {@code null} for none
   */
  public java.lang.String getPostStartupScript() {
    return postStartupScript;
  }

  /**
   * Path to a Bash script that automatically runs after a notebook instance fully boots up. The
   * path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
   * @param postStartupScript postStartupScript or {@code null} for none
   */
  public RuntimeSoftwareConfig setPostStartupScript(java.lang.String postStartupScript) {
    this.postStartupScript = postStartupScript;
    return this;
  }

  /**
   * Behavior for the post startup script.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostStartupScriptBehavior() {
    return postStartupScriptBehavior;
  }

  /**
   * Behavior for the post startup script.
   * @param postStartupScriptBehavior postStartupScriptBehavior or {@code null} for none
   */
  public RuntimeSoftwareConfig setPostStartupScriptBehavior(java.lang.String postStartupScriptBehavior) {
    this.postStartupScriptBehavior = postStartupScriptBehavior;
    return this;
  }

  /**
   * Output only. Bool indicating whether an newer image is available in an image family.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUpgradeable() {
    return upgradeable;
  }

  /**
   * Output only. Bool indicating whether an newer image is available in an image family.
   * @param upgradeable upgradeable or {@code null} for none
   */
  public RuntimeSoftwareConfig setUpgradeable(java.lang.Boolean upgradeable) {
    this.upgradeable = upgradeable;
    return this;
  }

  @Override
  public RuntimeSoftwareConfig set(String fieldName, Object value) {
    return (RuntimeSoftwareConfig) super.set(fieldName, value);
  }

  @Override
  public RuntimeSoftwareConfig clone() {
    return (RuntimeSoftwareConfig) super.clone();
  }

}
