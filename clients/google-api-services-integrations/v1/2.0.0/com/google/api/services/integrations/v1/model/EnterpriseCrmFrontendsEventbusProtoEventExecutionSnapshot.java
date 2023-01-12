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
 * Model definition for EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot.
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
public final class EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot extends com.google.api.client.json.GenericJson {

  /**
   * Indicates "right after which checkpoint task's execution" this snapshot is taken.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String checkpointTaskNumber;

  /**
   * All of the computed conditions that been calculated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseCrmEventbusProtoConditionResult> conditionResults;

  static {
    // hack to force ProGuard to consider EnterpriseCrmEventbusProtoConditionResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EnterpriseCrmEventbusProtoConditionResult.class);
  }

  /**
   * The parameters in Event object that differs from last snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmFrontendsEventbusProtoEventParameters diffParams;

  /**
   * Points to the event execution info this snapshot belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventExecutionInfoId;

  /**
   * Auto-generated. Used as primary key for EventExecutionSnapshots table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventExecutionSnapshotId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata eventExecutionSnapshotMetadata;

  /**
   * The parameters in Event object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmFrontendsEventbusProtoEventParameters eventParams;

  /**
   * Indicates when this snapshot is taken.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long snapshotTime;

  /**
   * All of the task execution details at the given point of time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseCrmEventbusProtoTaskExecutionDetails> taskExecutionDetails;

  static {
    // hack to force ProGuard to consider EnterpriseCrmEventbusProtoTaskExecutionDetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EnterpriseCrmEventbusProtoTaskExecutionDetails.class);
  }

  /**
   * The task name associated with this snapshot. Could be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskName;

  /**
   * Indicates "right after which checkpoint task's execution" this snapshot is taken.
   * @return value or {@code null} for none
   */
  public java.lang.String getCheckpointTaskNumber() {
    return checkpointTaskNumber;
  }

  /**
   * Indicates "right after which checkpoint task's execution" this snapshot is taken.
   * @param checkpointTaskNumber checkpointTaskNumber or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot setCheckpointTaskNumber(java.lang.String checkpointTaskNumber) {
    this.checkpointTaskNumber = checkpointTaskNumber;
    return this;
  }

  /**
   * All of the computed conditions that been calculated.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseCrmEventbusProtoConditionResult> getConditionResults() {
    return conditionResults;
  }

  /**
   * All of the computed conditions that been calculated.
   * @param conditionResults conditionResults or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot setConditionResults(java.util.List<EnterpriseCrmEventbusProtoConditionResult> conditionResults) {
    this.conditionResults = conditionResults;
    return this;
  }

  /**
   * The parameters in Event object that differs from last snapshot.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventParameters getDiffParams() {
    return diffParams;
  }

  /**
   * The parameters in Event object that differs from last snapshot.
   * @param diffParams diffParams or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot setDiffParams(EnterpriseCrmFrontendsEventbusProtoEventParameters diffParams) {
    this.diffParams = diffParams;
    return this;
  }

  /**
   * Points to the event execution info this snapshot belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventExecutionInfoId() {
    return eventExecutionInfoId;
  }

  /**
   * Points to the event execution info this snapshot belongs to.
   * @param eventExecutionInfoId eventExecutionInfoId or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot setEventExecutionInfoId(java.lang.String eventExecutionInfoId) {
    this.eventExecutionInfoId = eventExecutionInfoId;
    return this;
  }

  /**
   * Auto-generated. Used as primary key for EventExecutionSnapshots table.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventExecutionSnapshotId() {
    return eventExecutionSnapshotId;
  }

  /**
   * Auto-generated. Used as primary key for EventExecutionSnapshots table.
   * @param eventExecutionSnapshotId eventExecutionSnapshotId or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot setEventExecutionSnapshotId(java.lang.String eventExecutionSnapshotId) {
    this.eventExecutionSnapshotId = eventExecutionSnapshotId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata getEventExecutionSnapshotMetadata() {
    return eventExecutionSnapshotMetadata;
  }

  /**
   * @param eventExecutionSnapshotMetadata eventExecutionSnapshotMetadata or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot setEventExecutionSnapshotMetadata(EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata eventExecutionSnapshotMetadata) {
    this.eventExecutionSnapshotMetadata = eventExecutionSnapshotMetadata;
    return this;
  }

  /**
   * The parameters in Event object.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventParameters getEventParams() {
    return eventParams;
  }

  /**
   * The parameters in Event object.
   * @param eventParams eventParams or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot setEventParams(EnterpriseCrmFrontendsEventbusProtoEventParameters eventParams) {
    this.eventParams = eventParams;
    return this;
  }

  /**
   * Indicates when this snapshot is taken.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSnapshotTime() {
    return snapshotTime;
  }

  /**
   * Indicates when this snapshot is taken.
   * @param snapshotTime snapshotTime or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot setSnapshotTime(java.lang.Long snapshotTime) {
    this.snapshotTime = snapshotTime;
    return this;
  }

  /**
   * All of the task execution details at the given point of time.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseCrmEventbusProtoTaskExecutionDetails> getTaskExecutionDetails() {
    return taskExecutionDetails;
  }

  /**
   * All of the task execution details at the given point of time.
   * @param taskExecutionDetails taskExecutionDetails or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot setTaskExecutionDetails(java.util.List<EnterpriseCrmEventbusProtoTaskExecutionDetails> taskExecutionDetails) {
    this.taskExecutionDetails = taskExecutionDetails;
    return this;
  }

  /**
   * The task name associated with this snapshot. Could be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskName() {
    return taskName;
  }

  /**
   * The task name associated with this snapshot. Could be empty.
   * @param taskName taskName or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot setTaskName(java.lang.String taskName) {
    this.taskName = taskName;
    return this;
  }

  @Override
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot set(String fieldName, Object value) {
    return (EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot clone() {
    return (EnterpriseCrmFrontendsEventbusProtoEventExecutionSnapshot) super.clone();
  }

}