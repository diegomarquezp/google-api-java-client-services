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

package com.google.api.services.run.v2.model;

/**
 * RevisionTemplate describes the data a revision should have when created from a template.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunOpV2RevisionTemplate extends com.google.api.client.json.GenericJson {

  /**
   * KRM-style annotations for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Enables Confidential Cloud Run in Revisions created using this template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean confidential;

  /**
   * Sets the maximum number of requests that each serving instance can receive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer containerConcurrency;

  /**
   * Holds the single container that defines the unit of execution for this Revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunOpV2Container> containers;

  static {
    // hack to force ProGuard to consider GoogleCloudRunOpV2Container used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRunOpV2Container.class);
  }

  /**
   * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image.
   * For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptionKey;

  /**
   * The sandbox environment to host this Revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionEnvironment;

  /**
   * KRM-style labels for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The unique name for the revision. If this field is omitted, it will be automatically generated
   * based on the Service name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revision;

  /**
   * Scaling settings for this Revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunOpV2RevisionScaling scaling;

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has. If not provided, the revision will use the project's default
   * service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Max allowed time for an instance to respond to a request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * A list of Volumes to make available to containers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunOpV2Volume> volumes;

  /**
   * VPC Access configuration to use for this Revision. For more information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunOpV2VpcAccess vpcAccess;

  /**
   * KRM-style annotations for the resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * KRM-style annotations for the resource.
   * @param annotations annotations or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Enables Confidential Cloud Run in Revisions created using this template.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConfidential() {
    return confidential;
  }

  /**
   * Enables Confidential Cloud Run in Revisions created using this template.
   * @param confidential confidential or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setConfidential(java.lang.Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

  /**
   * Sets the maximum number of requests that each serving instance can receive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getContainerConcurrency() {
    return containerConcurrency;
  }

  /**
   * Sets the maximum number of requests that each serving instance can receive.
   * @param containerConcurrency containerConcurrency or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setContainerConcurrency(java.lang.Integer containerConcurrency) {
    this.containerConcurrency = containerConcurrency;
    return this;
  }

  /**
   * Holds the single container that defines the unit of execution for this Revision.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunOpV2Container> getContainers() {
    return containers;
  }

  /**
   * Holds the single container that defines the unit of execution for this Revision.
   * @param containers containers or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setContainers(java.util.List<GoogleCloudRunOpV2Container> containers) {
    this.containers = containers;
    return this;
  }

  /**
   * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image.
   * For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image.
   * For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
   * @param encryptionKey encryptionKey or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setEncryptionKey(java.lang.String encryptionKey) {
    this.encryptionKey = encryptionKey;
    return this;
  }

  /**
   * The sandbox environment to host this Revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionEnvironment() {
    return executionEnvironment;
  }

  /**
   * The sandbox environment to host this Revision.
   * @param executionEnvironment executionEnvironment or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setExecutionEnvironment(java.lang.String executionEnvironment) {
    this.executionEnvironment = executionEnvironment;
    return this;
  }

  /**
   * KRM-style labels for the resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * KRM-style labels for the resource.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The unique name for the revision. If this field is omitted, it will be automatically generated
   * based on the Service name.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevision() {
    return revision;
  }

  /**
   * The unique name for the revision. If this field is omitted, it will be automatically generated
   * based on the Service name.
   * @param revision revision or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setRevision(java.lang.String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Scaling settings for this Revision.
   * @return value or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionScaling getScaling() {
    return scaling;
  }

  /**
   * Scaling settings for this Revision.
   * @param scaling scaling or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setScaling(GoogleCloudRunOpV2RevisionScaling scaling) {
    this.scaling = scaling;
    return this;
  }

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has. If not provided, the revision will use the project's default
   * service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has. If not provided, the revision will use the project's default
   * service account.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Max allowed time for an instance to respond to a request.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * Max allowed time for an instance to respond to a request.
   * @param timeout timeout or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * A list of Volumes to make available to containers.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunOpV2Volume> getVolumes() {
    return volumes;
  }

  /**
   * A list of Volumes to make available to containers.
   * @param volumes volumes or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setVolumes(java.util.List<GoogleCloudRunOpV2Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  /**
   * VPC Access configuration to use for this Revision. For more information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * @return value or {@code null} for none
   */
  public GoogleCloudRunOpV2VpcAccess getVpcAccess() {
    return vpcAccess;
  }

  /**
   * VPC Access configuration to use for this Revision. For more information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * @param vpcAccess vpcAccess or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionTemplate setVpcAccess(GoogleCloudRunOpV2VpcAccess vpcAccess) {
    this.vpcAccess = vpcAccess;
    return this;
  }

  @Override
  public GoogleCloudRunOpV2RevisionTemplate set(String fieldName, Object value) {
    return (GoogleCloudRunOpV2RevisionTemplate) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunOpV2RevisionTemplate clone() {
    return (GoogleCloudRunOpV2RevisionTemplate) super.clone();
  }

}
