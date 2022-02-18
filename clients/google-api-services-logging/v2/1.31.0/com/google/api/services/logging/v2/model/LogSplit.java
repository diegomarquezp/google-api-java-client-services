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
 * Additional information used to correlate multiple log entries. Used when a single LogEntry would
 * exceed the Google Cloud Logging size limit and is split across multiple log entries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogSplit extends com.google.api.client.json.GenericJson {

  /**
   * The index of this LogEntry in the sequence of split log entries. Log entries are given |index|
   * values 0, 1, ..., n-1 for a sequence of n log entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * The total number of log entries that the original LogEntry was split into.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalSplits;

  /**
   * A globally unique identifier for all log entries in a sequence of split log entries. All log
   * entries with the same |LogSplit.uid| are assumed to be part of the same sequence of split log
   * entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * The index of this LogEntry in the sequence of split log entries. Log entries are given |index|
   * values 0, 1, ..., n-1 for a sequence of n log entries.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * The index of this LogEntry in the sequence of split log entries. Log entries are given |index|
   * values 0, 1, ..., n-1 for a sequence of n log entries.
   * @param index index or {@code null} for none
   */
  public LogSplit setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The total number of log entries that the original LogEntry was split into.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalSplits() {
    return totalSplits;
  }

  /**
   * The total number of log entries that the original LogEntry was split into.
   * @param totalSplits totalSplits or {@code null} for none
   */
  public LogSplit setTotalSplits(java.lang.Integer totalSplits) {
    this.totalSplits = totalSplits;
    return this;
  }

  /**
   * A globally unique identifier for all log entries in a sequence of split log entries. All log
   * entries with the same |LogSplit.uid| are assumed to be part of the same sequence of split log
   * entries.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * A globally unique identifier for all log entries in a sequence of split log entries. All log
   * entries with the same |LogSplit.uid| are assumed to be part of the same sequence of split log
   * entries.
   * @param uid uid or {@code null} for none
   */
  public LogSplit setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public LogSplit set(String fieldName, Object value) {
    return (LogSplit) super.set(fieldName, value);
  }

  @Override
  public LogSplit clone() {
    return (LogSplit) super.clone();
  }

}
