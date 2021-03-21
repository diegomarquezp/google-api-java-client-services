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
 * MembershipState describes the state of the Service Mesh Hub Feature as analyzed by the Service
 * Mesh Hub Controller, for single Membership.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceMeshMembershipState extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Results of running Service Mesh analyzers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceMeshAnalysisMessage> analysisMessages;

  static {
    // hack to force ProGuard to consider ServiceMeshAnalysisMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ServiceMeshAnalysisMessage.class);
  }

  /**
   * Output only. Results of running Service Mesh analyzers.
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceMeshAnalysisMessage> getAnalysisMessages() {
    return analysisMessages;
  }

  /**
   * Output only. Results of running Service Mesh analyzers.
   * @param analysisMessages analysisMessages or {@code null} for none
   */
  public ServiceMeshMembershipState setAnalysisMessages(java.util.List<ServiceMeshAnalysisMessage> analysisMessages) {
    this.analysisMessages = analysisMessages;
    return this;
  }

  @Override
  public ServiceMeshMembershipState set(String fieldName, Object value) {
    return (ServiceMeshMembershipState) super.set(fieldName, value);
  }

  @Override
  public ServiceMeshMembershipState clone() {
    return (ServiceMeshMembershipState) super.clone();
  }

}
