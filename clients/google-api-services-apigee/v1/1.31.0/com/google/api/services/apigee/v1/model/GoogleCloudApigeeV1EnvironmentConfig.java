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

package com.google.api.services.apigee.v1.model;

/**
 * Model definition for GoogleCloudApigeeV1EnvironmentConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1EnvironmentConfig extends com.google.api.client.json.GenericJson {

  /**
   * The location for the config blob of API Runtime Control, aka Envoy Adapter, for op-based
   * authentication as a URI, e.g. a Cloud Storage URI. This is only used by Envoy-based gateways.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String arcConfigLocation;

  /**
   * Time that the environment configuration was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * List of data collectors used by the deployments in the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1DataCollectorConfig> dataCollectors;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1DataCollectorConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1DataCollectorConfig.class);
  }

  /**
   * Debug mask that applies to all deployments in the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1DebugMask debugMask;

  /**
   * List of deployments in the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1DeploymentConfig> deployments;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1DeploymentConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1DeploymentConfig.class);
  }

  /**
   * Feature flags inherited from the organization and environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> featureFlags;

  /**
   * List of flow hooks in the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1FlowHookConfig> flowhooks;

  /**
   * The location for the gateway config blob as a URI, e.g. a Cloud Storage URI. This is only used
   * by Envoy-based gateways.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gatewayConfigLocation;

  /**
   * List of keystores in the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1KeystoreConfig> keystores;

  /**
   * Name of the environment configuration in the following format:
   * `organizations/{org}/environments/{env}/configs/{config}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Used by the Control plane to add context information to help detect the source of the document
   * during diagnostics and debugging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provider;

  /**
   * Name of the PubSub topic for the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pubsubTopic;

  /**
   * List of resource references in the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1ReferenceConfig> resourceReferences;

  /**
   * List of resource versions in the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1ResourceConfig> resources;

  /**
   * Revision ID of the environment configuration. The higher the value, the more recently the
   * configuration was deployed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long revisionId;

  /**
   * DEPRECATED: Use revision_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sequenceNumber;

  /**
   * List of target servers in the environment. Disabled target servers are not displayed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1TargetServerConfig> targets;

  /**
   * Trace configurations. Contains config for the environment and config overrides for specific API
   * proxies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1RuntimeTraceConfig traceConfig;

  /**
   * Unique ID for the environment configuration. The ID will only change if the environment is
   * deleted and recreated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * The location for the config blob of API Runtime Control, aka Envoy Adapter, for op-based
   * authentication as a URI, e.g. a Cloud Storage URI. This is only used by Envoy-based gateways.
   * @return value or {@code null} for none
   */
  public java.lang.String getArcConfigLocation() {
    return arcConfigLocation;
  }

  /**
   * The location for the config blob of API Runtime Control, aka Envoy Adapter, for op-based
   * authentication as a URI, e.g. a Cloud Storage URI. This is only used by Envoy-based gateways.
   * @param arcConfigLocation arcConfigLocation or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setArcConfigLocation(java.lang.String arcConfigLocation) {
    this.arcConfigLocation = arcConfigLocation;
    return this;
  }

  /**
   * Time that the environment configuration was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Time that the environment configuration was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * List of data collectors used by the deployments in the environment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1DataCollectorConfig> getDataCollectors() {
    return dataCollectors;
  }

  /**
   * List of data collectors used by the deployments in the environment.
   * @param dataCollectors dataCollectors or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setDataCollectors(java.util.List<GoogleCloudApigeeV1DataCollectorConfig> dataCollectors) {
    this.dataCollectors = dataCollectors;
    return this;
  }

  /**
   * Debug mask that applies to all deployments in the environment.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1DebugMask getDebugMask() {
    return debugMask;
  }

  /**
   * Debug mask that applies to all deployments in the environment.
   * @param debugMask debugMask or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setDebugMask(GoogleCloudApigeeV1DebugMask debugMask) {
    this.debugMask = debugMask;
    return this;
  }

  /**
   * List of deployments in the environment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1DeploymentConfig> getDeployments() {
    return deployments;
  }

  /**
   * List of deployments in the environment.
   * @param deployments deployments or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setDeployments(java.util.List<GoogleCloudApigeeV1DeploymentConfig> deployments) {
    this.deployments = deployments;
    return this;
  }

  /**
   * Feature flags inherited from the organization and environment.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getFeatureFlags() {
    return featureFlags;
  }

  /**
   * Feature flags inherited from the organization and environment.
   * @param featureFlags featureFlags or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setFeatureFlags(java.util.Map<String, java.lang.String> featureFlags) {
    this.featureFlags = featureFlags;
    return this;
  }

  /**
   * List of flow hooks in the environment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1FlowHookConfig> getFlowhooks() {
    return flowhooks;
  }

  /**
   * List of flow hooks in the environment.
   * @param flowhooks flowhooks or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setFlowhooks(java.util.List<GoogleCloudApigeeV1FlowHookConfig> flowhooks) {
    this.flowhooks = flowhooks;
    return this;
  }

  /**
   * The location for the gateway config blob as a URI, e.g. a Cloud Storage URI. This is only used
   * by Envoy-based gateways.
   * @return value or {@code null} for none
   */
  public java.lang.String getGatewayConfigLocation() {
    return gatewayConfigLocation;
  }

  /**
   * The location for the gateway config blob as a URI, e.g. a Cloud Storage URI. This is only used
   * by Envoy-based gateways.
   * @param gatewayConfigLocation gatewayConfigLocation or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setGatewayConfigLocation(java.lang.String gatewayConfigLocation) {
    this.gatewayConfigLocation = gatewayConfigLocation;
    return this;
  }

  /**
   * List of keystores in the environment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1KeystoreConfig> getKeystores() {
    return keystores;
  }

  /**
   * List of keystores in the environment.
   * @param keystores keystores or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setKeystores(java.util.List<GoogleCloudApigeeV1KeystoreConfig> keystores) {
    this.keystores = keystores;
    return this;
  }

  /**
   * Name of the environment configuration in the following format:
   * `organizations/{org}/environments/{env}/configs/{config}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the environment configuration in the following format:
   * `organizations/{org}/environments/{env}/configs/{config}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Used by the Control plane to add context information to help detect the source of the document
   * during diagnostics and debugging.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvider() {
    return provider;
  }

  /**
   * Used by the Control plane to add context information to help detect the source of the document
   * during diagnostics and debugging.
   * @param provider provider or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setProvider(java.lang.String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Name of the PubSub topic for the environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getPubsubTopic() {
    return pubsubTopic;
  }

  /**
   * Name of the PubSub topic for the environment.
   * @param pubsubTopic pubsubTopic or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setPubsubTopic(java.lang.String pubsubTopic) {
    this.pubsubTopic = pubsubTopic;
    return this;
  }

  /**
   * List of resource references in the environment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1ReferenceConfig> getResourceReferences() {
    return resourceReferences;
  }

  /**
   * List of resource references in the environment.
   * @param resourceReferences resourceReferences or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setResourceReferences(java.util.List<GoogleCloudApigeeV1ReferenceConfig> resourceReferences) {
    this.resourceReferences = resourceReferences;
    return this;
  }

  /**
   * List of resource versions in the environment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1ResourceConfig> getResources() {
    return resources;
  }

  /**
   * List of resource versions in the environment.
   * @param resources resources or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setResources(java.util.List<GoogleCloudApigeeV1ResourceConfig> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Revision ID of the environment configuration. The higher the value, the more recently the
   * configuration was deployed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRevisionId() {
    return revisionId;
  }

  /**
   * Revision ID of the environment configuration. The higher the value, the more recently the
   * configuration was deployed.
   * @param revisionId revisionId or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setRevisionId(java.lang.Long revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * DEPRECATED: Use revision_id.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSequenceNumber() {
    return sequenceNumber;
  }

  /**
   * DEPRECATED: Use revision_id.
   * @param sequenceNumber sequenceNumber or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setSequenceNumber(java.lang.Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * List of target servers in the environment. Disabled target servers are not displayed.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1TargetServerConfig> getTargets() {
    return targets;
  }

  /**
   * List of target servers in the environment. Disabled target servers are not displayed.
   * @param targets targets or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setTargets(java.util.List<GoogleCloudApigeeV1TargetServerConfig> targets) {
    this.targets = targets;
    return this;
  }

  /**
   * Trace configurations. Contains config for the environment and config overrides for specific API
   * proxies.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeTraceConfig getTraceConfig() {
    return traceConfig;
  }

  /**
   * Trace configurations. Contains config for the environment and config overrides for specific API
   * proxies.
   * @param traceConfig traceConfig or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setTraceConfig(GoogleCloudApigeeV1RuntimeTraceConfig traceConfig) {
    this.traceConfig = traceConfig;
    return this;
  }

  /**
   * Unique ID for the environment configuration. The ID will only change if the environment is
   * deleted and recreated.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Unique ID for the environment configuration. The ID will only change if the environment is
   * deleted and recreated.
   * @param uid uid or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentConfig setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1EnvironmentConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1EnvironmentConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1EnvironmentConfig clone() {
    return (GoogleCloudApigeeV1EnvironmentConfig) super.clone();
  }

}
