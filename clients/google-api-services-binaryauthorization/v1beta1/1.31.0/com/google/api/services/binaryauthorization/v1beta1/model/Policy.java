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

package com.google.api.services.binaryauthorization.v1beta1.model;

/**
 * A policy for Binary Authorization.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Binary Authorization API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Policy extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Admission policy allowlisting. A matching admission request will always be permitted.
   * This feature is typically used to exclude Google or third-party infrastructure images from
   * Binary Authorization policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AdmissionWhitelistPattern> admissionWhitelistPatterns;

  static {
    // hack to force ProGuard to consider AdmissionWhitelistPattern used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AdmissionWhitelistPattern.class);
  }

  /**
   * Optional. Per-cluster admission rules. Cluster spec format: `location.clusterId`. There can be
   * at most one admission rule per cluster spec. A `location` is either a compute zone (e.g. us-
   * central1-a) or a region (e.g. us-central1). For `clusterId` syntax restrictions see
   * https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, AdmissionRule> clusterAdmissionRules;

  static {
    // hack to force ProGuard to consider AdmissionRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AdmissionRule.class);
  }

  /**
   * Required. Default admission rule for a cluster without a per-cluster, per- kubernetes-service-
   * account, or per-istio-service-identity admission rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdmissionRule defaultAdmissionRule;

  /**
   * Optional. A descriptive comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Controls the evaluation of a Google-maintained global admission policy for common
   * system-level images. Images not covered by the global policy will be subject to the project
   * admission policy. This setting has no effect when specified inside a global admission policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String globalPolicyEvaluationMode;

  /**
   * Optional. Per-istio-service-identity admission rules. Istio service identity spec format:
   * spiffe:ns//sa/ or /ns//sa/ e.g. spiffe://example.com/ns/test-ns/sa/default
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, AdmissionRule> istioServiceIdentityAdmissionRules;

  static {
    // hack to force ProGuard to consider AdmissionRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AdmissionRule.class);
  }

  /**
   * Optional. Per-kubernetes-namespace admission rules. K8s namespace spec format: [a-z.-]+, e.g.
   * 'some-namespace'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, AdmissionRule> kubernetesNamespaceAdmissionRules;

  static {
    // hack to force ProGuard to consider AdmissionRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AdmissionRule.class);
  }

  /**
   * Optional. Per-kubernetes-service-account admission rules. Service account spec format:
   * `namespace:serviceaccount`. e.g. 'test-ns:default'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, AdmissionRule> kubernetesServiceAccountAdmissionRules;

  static {
    // hack to force ProGuard to consider AdmissionRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AdmissionRule.class);
  }

  /**
   * Output only. The resource name, in the format `projects/policy`. There is at most one policy
   * per project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Time when the policy was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Admission policy allowlisting. A matching admission request will always be permitted.
   * This feature is typically used to exclude Google or third-party infrastructure images from
   * Binary Authorization policies.
   * @return value or {@code null} for none
   */
  public java.util.List<AdmissionWhitelistPattern> getAdmissionWhitelistPatterns() {
    return admissionWhitelistPatterns;
  }

  /**
   * Optional. Admission policy allowlisting. A matching admission request will always be permitted.
   * This feature is typically used to exclude Google or third-party infrastructure images from
   * Binary Authorization policies.
   * @param admissionWhitelistPatterns admissionWhitelistPatterns or {@code null} for none
   */
  public Policy setAdmissionWhitelistPatterns(java.util.List<AdmissionWhitelistPattern> admissionWhitelistPatterns) {
    this.admissionWhitelistPatterns = admissionWhitelistPatterns;
    return this;
  }

  /**
   * Optional. Per-cluster admission rules. Cluster spec format: `location.clusterId`. There can be
   * at most one admission rule per cluster spec. A `location` is either a compute zone (e.g. us-
   * central1-a) or a region (e.g. us-central1). For `clusterId` syntax restrictions see
   * https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, AdmissionRule> getClusterAdmissionRules() {
    return clusterAdmissionRules;
  }

  /**
   * Optional. Per-cluster admission rules. Cluster spec format: `location.clusterId`. There can be
   * at most one admission rule per cluster spec. A `location` is either a compute zone (e.g. us-
   * central1-a) or a region (e.g. us-central1). For `clusterId` syntax restrictions see
   * https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.
   * @param clusterAdmissionRules clusterAdmissionRules or {@code null} for none
   */
  public Policy setClusterAdmissionRules(java.util.Map<String, AdmissionRule> clusterAdmissionRules) {
    this.clusterAdmissionRules = clusterAdmissionRules;
    return this;
  }

  /**
   * Required. Default admission rule for a cluster without a per-cluster, per- kubernetes-service-
   * account, or per-istio-service-identity admission rule.
   * @return value or {@code null} for none
   */
  public AdmissionRule getDefaultAdmissionRule() {
    return defaultAdmissionRule;
  }

  /**
   * Required. Default admission rule for a cluster without a per-cluster, per- kubernetes-service-
   * account, or per-istio-service-identity admission rule.
   * @param defaultAdmissionRule defaultAdmissionRule or {@code null} for none
   */
  public Policy setDefaultAdmissionRule(AdmissionRule defaultAdmissionRule) {
    this.defaultAdmissionRule = defaultAdmissionRule;
    return this;
  }

  /**
   * Optional. A descriptive comment.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A descriptive comment.
   * @param description description or {@code null} for none
   */
  public Policy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Controls the evaluation of a Google-maintained global admission policy for common
   * system-level images. Images not covered by the global policy will be subject to the project
   * admission policy. This setting has no effect when specified inside a global admission policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getGlobalPolicyEvaluationMode() {
    return globalPolicyEvaluationMode;
  }

  /**
   * Optional. Controls the evaluation of a Google-maintained global admission policy for common
   * system-level images. Images not covered by the global policy will be subject to the project
   * admission policy. This setting has no effect when specified inside a global admission policy.
   * @param globalPolicyEvaluationMode globalPolicyEvaluationMode or {@code null} for none
   */
  public Policy setGlobalPolicyEvaluationMode(java.lang.String globalPolicyEvaluationMode) {
    this.globalPolicyEvaluationMode = globalPolicyEvaluationMode;
    return this;
  }

  /**
   * Optional. Per-istio-service-identity admission rules. Istio service identity spec format:
   * spiffe:ns//sa/ or /ns//sa/ e.g. spiffe://example.com/ns/test-ns/sa/default
   * @return value or {@code null} for none
   */
  public java.util.Map<String, AdmissionRule> getIstioServiceIdentityAdmissionRules() {
    return istioServiceIdentityAdmissionRules;
  }

  /**
   * Optional. Per-istio-service-identity admission rules. Istio service identity spec format:
   * spiffe:ns//sa/ or /ns//sa/ e.g. spiffe://example.com/ns/test-ns/sa/default
   * @param istioServiceIdentityAdmissionRules istioServiceIdentityAdmissionRules or {@code null} for none
   */
  public Policy setIstioServiceIdentityAdmissionRules(java.util.Map<String, AdmissionRule> istioServiceIdentityAdmissionRules) {
    this.istioServiceIdentityAdmissionRules = istioServiceIdentityAdmissionRules;
    return this;
  }

  /**
   * Optional. Per-kubernetes-namespace admission rules. K8s namespace spec format: [a-z.-]+, e.g.
   * 'some-namespace'
   * @return value or {@code null} for none
   */
  public java.util.Map<String, AdmissionRule> getKubernetesNamespaceAdmissionRules() {
    return kubernetesNamespaceAdmissionRules;
  }

  /**
   * Optional. Per-kubernetes-namespace admission rules. K8s namespace spec format: [a-z.-]+, e.g.
   * 'some-namespace'
   * @param kubernetesNamespaceAdmissionRules kubernetesNamespaceAdmissionRules or {@code null} for none
   */
  public Policy setKubernetesNamespaceAdmissionRules(java.util.Map<String, AdmissionRule> kubernetesNamespaceAdmissionRules) {
    this.kubernetesNamespaceAdmissionRules = kubernetesNamespaceAdmissionRules;
    return this;
  }

  /**
   * Optional. Per-kubernetes-service-account admission rules. Service account spec format:
   * `namespace:serviceaccount`. e.g. 'test-ns:default'
   * @return value or {@code null} for none
   */
  public java.util.Map<String, AdmissionRule> getKubernetesServiceAccountAdmissionRules() {
    return kubernetesServiceAccountAdmissionRules;
  }

  /**
   * Optional. Per-kubernetes-service-account admission rules. Service account spec format:
   * `namespace:serviceaccount`. e.g. 'test-ns:default'
   * @param kubernetesServiceAccountAdmissionRules kubernetesServiceAccountAdmissionRules or {@code null} for none
   */
  public Policy setKubernetesServiceAccountAdmissionRules(java.util.Map<String, AdmissionRule> kubernetesServiceAccountAdmissionRules) {
    this.kubernetesServiceAccountAdmissionRules = kubernetesServiceAccountAdmissionRules;
    return this;
  }

  /**
   * Output only. The resource name, in the format `projects/policy`. There is at most one policy
   * per project.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name, in the format `projects/policy`. There is at most one policy
   * per project.
   * @param name name or {@code null} for none
   */
  public Policy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Time when the policy was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time when the policy was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Policy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Policy set(String fieldName, Object value) {
    return (Policy) super.set(fieldName, value);
  }

  @Override
  public Policy clone() {
    return (Policy) super.clone();
  }

}
