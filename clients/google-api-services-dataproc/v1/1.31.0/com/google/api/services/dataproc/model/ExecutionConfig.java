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

package com.google.api.services.dataproc.model;

/**
 * Execution configuration for a workload.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecutionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The Cloud KMS key to use for encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKey;

  /**
   * Optional. Tags used for network traffic control.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> networkTags;

  /**
   * Optional. Network URI to connect workload to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkUri;

  /**
   * Optional. Service account that used to execute workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Optional. Subnetwork URI to connect workload to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetworkUri;

  /**
   * Optional. The Cloud KMS key to use for encryption.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKey() {
    return kmsKey;
  }

  /**
   * Optional. The Cloud KMS key to use for encryption.
   * @param kmsKey kmsKey or {@code null} for none
   */
  public ExecutionConfig setKmsKey(java.lang.String kmsKey) {
    this.kmsKey = kmsKey;
    return this;
  }

  /**
   * Optional. Tags used for network traffic control.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNetworkTags() {
    return networkTags;
  }

  /**
   * Optional. Tags used for network traffic control.
   * @param networkTags networkTags or {@code null} for none
   */
  public ExecutionConfig setNetworkTags(java.util.List<java.lang.String> networkTags) {
    this.networkTags = networkTags;
    return this;
  }

  /**
   * Optional. Network URI to connect workload to.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkUri() {
    return networkUri;
  }

  /**
   * Optional. Network URI to connect workload to.
   * @param networkUri networkUri or {@code null} for none
   */
  public ExecutionConfig setNetworkUri(java.lang.String networkUri) {
    this.networkUri = networkUri;
    return this;
  }

  /**
   * Optional. Service account that used to execute workload.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Optional. Service account that used to execute workload.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public ExecutionConfig setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Optional. Subnetwork URI to connect workload to.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetworkUri() {
    return subnetworkUri;
  }

  /**
   * Optional. Subnetwork URI to connect workload to.
   * @param subnetworkUri subnetworkUri or {@code null} for none
   */
  public ExecutionConfig setSubnetworkUri(java.lang.String subnetworkUri) {
    this.subnetworkUri = subnetworkUri;
    return this;
  }

  @Override
  public ExecutionConfig set(String fieldName, Object value) {
    return (ExecutionConfig) super.set(fieldName, value);
  }

  @Override
  public ExecutionConfig clone() {
    return (ExecutionConfig) super.clone();
  }

}
