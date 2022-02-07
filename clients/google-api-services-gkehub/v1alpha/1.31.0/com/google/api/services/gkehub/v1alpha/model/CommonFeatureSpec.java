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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * CommonFeatureSpec contains Hub-wide configuration information
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommonFeatureSpec extends com.google.api.client.json.GenericJson {

  /**
   * Appdevexperience specific spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppDevExperienceFeatureSpec appdevexperience;

  /**
   * Cloud Audit Logging-specific spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudAuditLoggingFeatureSpec cloudauditlogging;

  /**
   * Multicluster Ingress-specific spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MultiClusterIngressFeatureSpec multiclusteringress;

  /**
   * Workload Certificate spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FeatureSpec workloadcertificate;

  /**
   * Appdevexperience specific spec.
   * @return value or {@code null} for none
   */
  public AppDevExperienceFeatureSpec getAppdevexperience() {
    return appdevexperience;
  }

  /**
   * Appdevexperience specific spec.
   * @param appdevexperience appdevexperience or {@code null} for none
   */
  public CommonFeatureSpec setAppdevexperience(AppDevExperienceFeatureSpec appdevexperience) {
    this.appdevexperience = appdevexperience;
    return this;
  }

  /**
   * Cloud Audit Logging-specific spec.
   * @return value or {@code null} for none
   */
  public CloudAuditLoggingFeatureSpec getCloudauditlogging() {
    return cloudauditlogging;
  }

  /**
   * Cloud Audit Logging-specific spec.
   * @param cloudauditlogging cloudauditlogging or {@code null} for none
   */
  public CommonFeatureSpec setCloudauditlogging(CloudAuditLoggingFeatureSpec cloudauditlogging) {
    this.cloudauditlogging = cloudauditlogging;
    return this;
  }

  /**
   * Multicluster Ingress-specific spec.
   * @return value or {@code null} for none
   */
  public MultiClusterIngressFeatureSpec getMulticlusteringress() {
    return multiclusteringress;
  }

  /**
   * Multicluster Ingress-specific spec.
   * @param multiclusteringress multiclusteringress or {@code null} for none
   */
  public CommonFeatureSpec setMulticlusteringress(MultiClusterIngressFeatureSpec multiclusteringress) {
    this.multiclusteringress = multiclusteringress;
    return this;
  }

  /**
   * Workload Certificate spec.
   * @return value or {@code null} for none
   */
  public FeatureSpec getWorkloadcertificate() {
    return workloadcertificate;
  }

  /**
   * Workload Certificate spec.
   * @param workloadcertificate workloadcertificate or {@code null} for none
   */
  public CommonFeatureSpec setWorkloadcertificate(FeatureSpec workloadcertificate) {
    this.workloadcertificate = workloadcertificate;
    return this;
  }

  @Override
  public CommonFeatureSpec set(String fieldName, Object value) {
    return (CommonFeatureSpec) super.set(fieldName, value);
  }

  @Override
  public CommonFeatureSpec clone() {
    return (CommonFeatureSpec) super.clone();
  }

}
