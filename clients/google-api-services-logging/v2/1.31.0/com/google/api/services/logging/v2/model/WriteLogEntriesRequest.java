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

package com.google.api.services.logging.v2.model;

/**
 * The parameters to WriteLogEntries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WriteLogEntriesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If true, the request should expect normal response, but the entries won't be
   * persisted nor exported. Useful for checking whether the logging API endpoints are working
   * properly before sending valuable data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dryRun;

  /**
   * Required. The log entries to send to Logging. The order of log entries in this list does not
   * matter. Values supplied in this method's log_name, resource, and labels fields are copied into
   * those log entries in this list that do not include values for their corresponding fields. For
   * more information, see the LogEntry type.If the timestamp or insert_id fields are missing in log
   * entries, then this method supplies the current time or a unique identifier, respectively. The
   * supplied values are chosen so that, among the log entries that did not supply their own values,
   * the entries earlier in the list will sort before the entries later in the list. See the
   * entries.list method.Log entries with timestamps that are more than the logs retention period
   * (https://cloud.google.com/logging/quotas) in the past or more than 24 hours in the future will
   * not be available when calling entries.list. However, those log entries can still be exported
   * with LogSinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).To improve
   * throughput and to avoid exceeding the quota limit (https://cloud.google.com/logging/quotas) for
   * calls to entries.write, you should try to include several log entries in this list, rather than
   * calling this method for each individual log entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LogEntry> entries;

  static {
    // hack to force ProGuard to consider LogEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LogEntry.class);
  }

  /**
   * Optional. Default labels that are added to the labels field of all log entries in entries. If a
   * log entry already has a label with the same key as a label in this parameter, then the log
   * entry's label is not changed. See LogEntry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. A default log resource name that is assigned to all log entries in entries that do
   * not specify a value for log_name: projects/[PROJECT_ID]/logs/[LOG_ID]
   * organizations/[ORGANIZATION_ID]/logs/[LOG_ID]
   * billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID] folders/[FOLDER_ID]/logs/[LOG_ID][LOG_ID]
   * must be URL-encoded. For example: "projects/my-project-id/logs/syslog"
   * "organizations/123/logs/cloudaudit.googleapis.com%2Factivity" The permission
   * logging.logEntries.create is needed on each project, organization, billing account, or folder
   * that is receiving new log entries, whether the resource is specified in logName or in an
   * individual log entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logName;

  /**
   * Optional. Whether a batch's valid entries should be written even if some other entry failed due
   * to a permanent error such as INVALID_ARGUMENT or PERMISSION_DENIED. If any entry failed, then
   * the response status is the response status is the status of one of the failed entries. The
   * response will include error details keyed by the entries' zero-based index in the entries.write
   * method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean partialSuccess;

  /**
   * Optional. A default monitored resource object that is assigned to all log entries in entries
   * that do not specify a value for resource. Example: { "type": "gce_instance", "labels": {
   * "zone": "us-central1-a", "instance_id": "00000000000000000000" }} See LogEntry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoredResource resource;

  /**
   * Optional. If true, the request should expect normal response, but the entries won't be
   * persisted nor exported. Useful for checking whether the logging API endpoints are working
   * properly before sending valuable data.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDryRun() {
    return dryRun;
  }

  /**
   * Optional. If true, the request should expect normal response, but the entries won't be
   * persisted nor exported. Useful for checking whether the logging API endpoints are working
   * properly before sending valuable data.
   * @param dryRun dryRun or {@code null} for none
   */
  public WriteLogEntriesRequest setDryRun(java.lang.Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Required. The log entries to send to Logging. The order of log entries in this list does not
   * matter. Values supplied in this method's log_name, resource, and labels fields are copied into
   * those log entries in this list that do not include values for their corresponding fields. For
   * more information, see the LogEntry type.If the timestamp or insert_id fields are missing in log
   * entries, then this method supplies the current time or a unique identifier, respectively. The
   * supplied values are chosen so that, among the log entries that did not supply their own values,
   * the entries earlier in the list will sort before the entries later in the list. See the
   * entries.list method.Log entries with timestamps that are more than the logs retention period
   * (https://cloud.google.com/logging/quotas) in the past or more than 24 hours in the future will
   * not be available when calling entries.list. However, those log entries can still be exported
   * with LogSinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).To improve
   * throughput and to avoid exceeding the quota limit (https://cloud.google.com/logging/quotas) for
   * calls to entries.write, you should try to include several log entries in this list, rather than
   * calling this method for each individual log entry.
   * @return value or {@code null} for none
   */
  public java.util.List<LogEntry> getEntries() {
    return entries;
  }

  /**
   * Required. The log entries to send to Logging. The order of log entries in this list does not
   * matter. Values supplied in this method's log_name, resource, and labels fields are copied into
   * those log entries in this list that do not include values for their corresponding fields. For
   * more information, see the LogEntry type.If the timestamp or insert_id fields are missing in log
   * entries, then this method supplies the current time or a unique identifier, respectively. The
   * supplied values are chosen so that, among the log entries that did not supply their own values,
   * the entries earlier in the list will sort before the entries later in the list. See the
   * entries.list method.Log entries with timestamps that are more than the logs retention period
   * (https://cloud.google.com/logging/quotas) in the past or more than 24 hours in the future will
   * not be available when calling entries.list. However, those log entries can still be exported
   * with LogSinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).To improve
   * throughput and to avoid exceeding the quota limit (https://cloud.google.com/logging/quotas) for
   * calls to entries.write, you should try to include several log entries in this list, rather than
   * calling this method for each individual log entry.
   * @param entries entries or {@code null} for none
   */
  public WriteLogEntriesRequest setEntries(java.util.List<LogEntry> entries) {
    this.entries = entries;
    return this;
  }

  /**
   * Optional. Default labels that are added to the labels field of all log entries in entries. If a
   * log entry already has a label with the same key as a label in this parameter, then the log
   * entry's label is not changed. See LogEntry.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Default labels that are added to the labels field of all log entries in entries. If a
   * log entry already has a label with the same key as a label in this parameter, then the log
   * entry's label is not changed. See LogEntry.
   * @param labels labels or {@code null} for none
   */
  public WriteLogEntriesRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. A default log resource name that is assigned to all log entries in entries that do
   * not specify a value for log_name: projects/[PROJECT_ID]/logs/[LOG_ID]
   * organizations/[ORGANIZATION_ID]/logs/[LOG_ID]
   * billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID] folders/[FOLDER_ID]/logs/[LOG_ID][LOG_ID]
   * must be URL-encoded. For example: "projects/my-project-id/logs/syslog"
   * "organizations/123/logs/cloudaudit.googleapis.com%2Factivity" The permission
   * logging.logEntries.create is needed on each project, organization, billing account, or folder
   * that is receiving new log entries, whether the resource is specified in logName or in an
   * individual log entry.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogName() {
    return logName;
  }

  /**
   * Optional. A default log resource name that is assigned to all log entries in entries that do
   * not specify a value for log_name: projects/[PROJECT_ID]/logs/[LOG_ID]
   * organizations/[ORGANIZATION_ID]/logs/[LOG_ID]
   * billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID] folders/[FOLDER_ID]/logs/[LOG_ID][LOG_ID]
   * must be URL-encoded. For example: "projects/my-project-id/logs/syslog"
   * "organizations/123/logs/cloudaudit.googleapis.com%2Factivity" The permission
   * logging.logEntries.create is needed on each project, organization, billing account, or folder
   * that is receiving new log entries, whether the resource is specified in logName or in an
   * individual log entry.
   * @param logName logName or {@code null} for none
   */
  public WriteLogEntriesRequest setLogName(java.lang.String logName) {
    this.logName = logName;
    return this;
  }

  /**
   * Optional. Whether a batch's valid entries should be written even if some other entry failed due
   * to a permanent error such as INVALID_ARGUMENT or PERMISSION_DENIED. If any entry failed, then
   * the response status is the response status is the status of one of the failed entries. The
   * response will include error details keyed by the entries' zero-based index in the entries.write
   * method.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPartialSuccess() {
    return partialSuccess;
  }

  /**
   * Optional. Whether a batch's valid entries should be written even if some other entry failed due
   * to a permanent error such as INVALID_ARGUMENT or PERMISSION_DENIED. If any entry failed, then
   * the response status is the response status is the status of one of the failed entries. The
   * response will include error details keyed by the entries' zero-based index in the entries.write
   * method.
   * @param partialSuccess partialSuccess or {@code null} for none
   */
  public WriteLogEntriesRequest setPartialSuccess(java.lang.Boolean partialSuccess) {
    this.partialSuccess = partialSuccess;
    return this;
  }

  /**
   * Optional. A default monitored resource object that is assigned to all log entries in entries
   * that do not specify a value for resource. Example: { "type": "gce_instance", "labels": {
   * "zone": "us-central1-a", "instance_id": "00000000000000000000" }} See LogEntry.
   * @return value or {@code null} for none
   */
  public MonitoredResource getResource() {
    return resource;
  }

  /**
   * Optional. A default monitored resource object that is assigned to all log entries in entries
   * that do not specify a value for resource. Example: { "type": "gce_instance", "labels": {
   * "zone": "us-central1-a", "instance_id": "00000000000000000000" }} See LogEntry.
   * @param resource resource or {@code null} for none
   */
  public WriteLogEntriesRequest setResource(MonitoredResource resource) {
    this.resource = resource;
    return this;
  }

  @Override
  public WriteLogEntriesRequest set(String fieldName, Object value) {
    return (WriteLogEntriesRequest) super.set(fieldName, value);
  }

  @Override
  public WriteLogEntriesRequest clone() {
    return (WriteLogEntriesRequest) super.clone();
  }

}
