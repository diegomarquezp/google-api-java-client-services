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
 * The Execution resource contains detailed information of an individual integration execution.
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
public final class GoogleCloudIntegrationsV1alphaExecution extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Created time of the execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Direct sub executions of the following Execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudIntegrationsV1alphaExecution> directSubExecutions;

  /**
   * The execution info about this event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmEventbusProtoEventExecutionDetails eventExecutionDetails;

  /**
   * Detailed info of this execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaExecutionDetails executionDetails;

  /**
   * The ways user posts this event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionMethod;

  /**
   * Auto-generated primary key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Event parameters come in as part of the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudIntegrationsV1alphaValueType> requestParameters;

  /**
   * Event parameters come in as part of the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterEntry> requestParams;

  static {
    // hack to force ProGuard to consider EnterpriseCrmFrontendsEventbusProtoParameterEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EnterpriseCrmFrontendsEventbusProtoParameterEntry.class);
  }

  /**
   * Event parameters returned as part of the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudIntegrationsV1alphaValueType> responseParameters;

  /**
   * Event parameters come out as part of the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterEntry> responseParams;

  static {
    // hack to force ProGuard to consider EnterpriseCrmFrontendsEventbusProtoParameterEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EnterpriseCrmFrontendsEventbusProtoParameterEntry.class);
  }

  /**
   * The trigger id of the integration trigger config. If both trigger_id and client_id is present,
   * the integration is executed from the start tasks provided by the matching trigger config
   * otherwise it is executed from the default start tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerId;

  /**
   * Output only. Last modified time of the execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Created time of the execution.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Created time of the execution.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Direct sub executions of the following Execution.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudIntegrationsV1alphaExecution> getDirectSubExecutions() {
    return directSubExecutions;
  }

  /**
   * Direct sub executions of the following Execution.
   * @param directSubExecutions directSubExecutions or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setDirectSubExecutions(java.util.List<GoogleCloudIntegrationsV1alphaExecution> directSubExecutions) {
    this.directSubExecutions = directSubExecutions;
    return this;
  }

  /**
   * The execution info about this event.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoEventExecutionDetails getEventExecutionDetails() {
    return eventExecutionDetails;
  }

  /**
   * The execution info about this event.
   * @param eventExecutionDetails eventExecutionDetails or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setEventExecutionDetails(EnterpriseCrmEventbusProtoEventExecutionDetails eventExecutionDetails) {
    this.eventExecutionDetails = eventExecutionDetails;
    return this;
  }

  /**
   * Detailed info of this execution.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecutionDetails getExecutionDetails() {
    return executionDetails;
  }

  /**
   * Detailed info of this execution.
   * @param executionDetails executionDetails or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setExecutionDetails(GoogleCloudIntegrationsV1alphaExecutionDetails executionDetails) {
    this.executionDetails = executionDetails;
    return this;
  }

  /**
   * The ways user posts this event.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionMethod() {
    return executionMethod;
  }

  /**
   * The ways user posts this event.
   * @param executionMethod executionMethod or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setExecutionMethod(java.lang.String executionMethod) {
    this.executionMethod = executionMethod;
    return this;
  }

  /**
   * Auto-generated primary key.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Auto-generated primary key.
   * @param name name or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Event parameters come in as part of the request.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudIntegrationsV1alphaValueType> getRequestParameters() {
    return requestParameters;
  }

  /**
   * Event parameters come in as part of the request.
   * @param requestParameters requestParameters or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setRequestParameters(java.util.Map<String, GoogleCloudIntegrationsV1alphaValueType> requestParameters) {
    this.requestParameters = requestParameters;
    return this;
  }

  /**
   * Event parameters come in as part of the request.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterEntry> getRequestParams() {
    return requestParams;
  }

  /**
   * Event parameters come in as part of the request.
   * @param requestParams requestParams or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setRequestParams(java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterEntry> requestParams) {
    this.requestParams = requestParams;
    return this;
  }

  /**
   * Event parameters returned as part of the response.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudIntegrationsV1alphaValueType> getResponseParameters() {
    return responseParameters;
  }

  /**
   * Event parameters returned as part of the response.
   * @param responseParameters responseParameters or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setResponseParameters(java.util.Map<String, GoogleCloudIntegrationsV1alphaValueType> responseParameters) {
    this.responseParameters = responseParameters;
    return this;
  }

  /**
   * Event parameters come out as part of the response.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterEntry> getResponseParams() {
    return responseParams;
  }

  /**
   * Event parameters come out as part of the response.
   * @param responseParams responseParams or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setResponseParams(java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterEntry> responseParams) {
    this.responseParams = responseParams;
    return this;
  }

  /**
   * The trigger id of the integration trigger config. If both trigger_id and client_id is present,
   * the integration is executed from the start tasks provided by the matching trigger config
   * otherwise it is executed from the default start tasks.
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerId() {
    return triggerId;
  }

  /**
   * The trigger id of the integration trigger config. If both trigger_id and client_id is present,
   * the integration is executed from the start tasks provided by the matching trigger config
   * otherwise it is executed from the default start tasks.
   * @param triggerId triggerId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setTriggerId(java.lang.String triggerId) {
    this.triggerId = triggerId;
    return this;
  }

  /**
   * Output only. Last modified time of the execution.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Last modified time of the execution.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaExecution setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaExecution set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaExecution) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaExecution clone() {
    return (GoogleCloudIntegrationsV1alphaExecution) super.clone();
  }

}