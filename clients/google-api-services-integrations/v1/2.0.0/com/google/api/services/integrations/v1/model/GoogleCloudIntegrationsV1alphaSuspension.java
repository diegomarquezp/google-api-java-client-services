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

package com.google.api.services.integrations.v1.model;

/**
 * A record representing a suspension.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaSuspension extends com.google.api.client.json.GenericJson {

  /**
   * Controls the notifications and approval permissions for this suspension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaSuspensionApprovalConfig approvalConfig;

  /**
   * Metadata pertaining to the resolution of this suspension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaSuspensionAudit audit;

  /**
   * Output only. Auto-generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. ID of the associated execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventExecutionInfoId;

  /**
   * Required. The name of the originating integration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String integration;

  /**
   * Output only. Auto-generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastModifyTime;

  /**
   * Resource name for suspensions suspension/{suspension_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. State of this suspension, indicating what action a resolver has taken.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Controls the notifications and resolver permissions for this suspension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmEventbusProtoSuspensionConfig suspensionConfig;

  /**
   * Required. Task id of the associated SuspensionTask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskId;

  /**
   * Controls the notifications and approval permissions for this suspension.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspensionApprovalConfig getApprovalConfig() {
    return approvalConfig;
  }

  /**
   * Controls the notifications and approval permissions for this suspension.
   * @param approvalConfig approvalConfig or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension setApprovalConfig(GoogleCloudIntegrationsV1alphaSuspensionApprovalConfig approvalConfig) {
    this.approvalConfig = approvalConfig;
    return this;
  }

  /**
   * Metadata pertaining to the resolution of this suspension.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspensionAudit getAudit() {
    return audit;
  }

  /**
   * Metadata pertaining to the resolution of this suspension.
   * @param audit audit or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension setAudit(GoogleCloudIntegrationsV1alphaSuspensionAudit audit) {
    this.audit = audit;
    return this;
  }

  /**
   * Output only. Auto-generated.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Auto-generated.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. ID of the associated execution.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventExecutionInfoId() {
    return eventExecutionInfoId;
  }

  /**
   * Required. ID of the associated execution.
   * @param eventExecutionInfoId eventExecutionInfoId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension setEventExecutionInfoId(java.lang.String eventExecutionInfoId) {
    this.eventExecutionInfoId = eventExecutionInfoId;
    return this;
  }

  /**
   * Required. The name of the originating integration.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntegration() {
    return integration;
  }

  /**
   * Required. The name of the originating integration.
   * @param integration integration or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension setIntegration(java.lang.String integration) {
    this.integration = integration;
    return this;
  }

  /**
   * Output only. Auto-generated.
   * @return value or {@code null} for none
   */
  public String getLastModifyTime() {
    return lastModifyTime;
  }

  /**
   * Output only. Auto-generated.
   * @param lastModifyTime lastModifyTime or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension setLastModifyTime(String lastModifyTime) {
    this.lastModifyTime = lastModifyTime;
    return this;
  }

  /**
   * Resource name for suspensions suspension/{suspension_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name for suspensions suspension/{suspension_id}
   * @param name name or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. State of this suspension, indicating what action a resolver has taken.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Required. State of this suspension, indicating what action a resolver has taken.
   * @param state state or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Controls the notifications and resolver permissions for this suspension.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoSuspensionConfig getSuspensionConfig() {
    return suspensionConfig;
  }

  /**
   * Controls the notifications and resolver permissions for this suspension.
   * @param suspensionConfig suspensionConfig or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension setSuspensionConfig(EnterpriseCrmEventbusProtoSuspensionConfig suspensionConfig) {
    this.suspensionConfig = suspensionConfig;
    return this;
  }

  /**
   * Required. Task id of the associated SuspensionTask.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskId() {
    return taskId;
  }

  /**
   * Required. Task id of the associated SuspensionTask.
   * @param taskId taskId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension setTaskId(java.lang.String taskId) {
    this.taskId = taskId;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaSuspension set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaSuspension) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaSuspension clone() {
    return (GoogleCloudIntegrationsV1alphaSuspension) super.clone();
  }

}