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

package com.google.api.services.apigee.v1.model;

/**
 * Model definition for GoogleCloudApigeeV1AsyncQueryResultView.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1AsyncQueryResultView extends com.google.api.client.json.GenericJson {

  /**
   * Error code when there is a failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer code;

  /**
   * Error message when there is a failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String error;

  /**
   * Metadata contains information like metrics, dimenstions etc of the AsyncQuery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1QueryMetadata metadata;

  /**
   * Rows of query result. Each row is a JSON object. Example: {sum(message_count): 1,
   * developer_app: "(not set)",…}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> rows;

  /**
   * State of retrieving ResultView.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Error code when there is a failure.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCode() {
    return code;
  }

  /**
   * Error code when there is a failure.
   * @param code code or {@code null} for none
   */
  public GoogleCloudApigeeV1AsyncQueryResultView setCode(java.lang.Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Error message when there is a failure.
   * @return value or {@code null} for none
   */
  public java.lang.String getError() {
    return error;
  }

  /**
   * Error message when there is a failure.
   * @param error error or {@code null} for none
   */
  public GoogleCloudApigeeV1AsyncQueryResultView setError(java.lang.String error) {
    this.error = error;
    return this;
  }

  /**
   * Metadata contains information like metrics, dimenstions etc of the AsyncQuery.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1QueryMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata contains information like metrics, dimenstions etc of the AsyncQuery.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudApigeeV1AsyncQueryResultView setMetadata(GoogleCloudApigeeV1QueryMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Rows of query result. Each row is a JSON object. Example: {sum(message_count): 1,
   * developer_app: "(not set)",…}
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getRows() {
    return rows;
  }

  /**
   * Rows of query result. Each row is a JSON object. Example: {sum(message_count): 1,
   * developer_app: "(not set)",…}
   * @param rows rows or {@code null} for none
   */
  public GoogleCloudApigeeV1AsyncQueryResultView setRows(java.util.List<java.lang.Object> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * State of retrieving ResultView.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of retrieving ResultView.
   * @param state state or {@code null} for none
   */
  public GoogleCloudApigeeV1AsyncQueryResultView setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1AsyncQueryResultView set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1AsyncQueryResultView) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1AsyncQueryResultView clone() {
    return (GoogleCloudApigeeV1AsyncQueryResultView) super.clone();
  }

}
