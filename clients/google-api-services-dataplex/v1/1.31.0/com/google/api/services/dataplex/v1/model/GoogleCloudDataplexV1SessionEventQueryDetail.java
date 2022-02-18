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

package com.google.api.services.dataplex.v1.model;

/**
 * Execution details of the query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1SessionEventQueryDetail extends com.google.api.client.json.GenericJson {

  /**
   * The data processed by the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dataProcessedBytes;

  /**
   * Time taken for execution of the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * Query Execution engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String engine;

  /**
   * The unique Query id identifying the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryId;

  /**
   * The query text executed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryText;

  /**
   * The size of results the query produced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long resultSizeBytes;

  /**
   * The data processed by the query.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDataProcessedBytes() {
    return dataProcessedBytes;
  }

  /**
   * The data processed by the query.
   * @param dataProcessedBytes dataProcessedBytes or {@code null} for none
   */
  public GoogleCloudDataplexV1SessionEventQueryDetail setDataProcessedBytes(java.lang.Long dataProcessedBytes) {
    this.dataProcessedBytes = dataProcessedBytes;
    return this;
  }

  /**
   * Time taken for execution of the query.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Time taken for execution of the query.
   * @param duration duration or {@code null} for none
   */
  public GoogleCloudDataplexV1SessionEventQueryDetail setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Query Execution engine.
   * @return value or {@code null} for none
   */
  public java.lang.String getEngine() {
    return engine;
  }

  /**
   * Query Execution engine.
   * @param engine engine or {@code null} for none
   */
  public GoogleCloudDataplexV1SessionEventQueryDetail setEngine(java.lang.String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * The unique Query id identifying the query.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryId() {
    return queryId;
  }

  /**
   * The unique Query id identifying the query.
   * @param queryId queryId or {@code null} for none
   */
  public GoogleCloudDataplexV1SessionEventQueryDetail setQueryId(java.lang.String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * The query text executed.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryText() {
    return queryText;
  }

  /**
   * The query text executed.
   * @param queryText queryText or {@code null} for none
   */
  public GoogleCloudDataplexV1SessionEventQueryDetail setQueryText(java.lang.String queryText) {
    this.queryText = queryText;
    return this;
  }

  /**
   * The size of results the query produced.
   * @return value or {@code null} for none
   */
  public java.lang.Long getResultSizeBytes() {
    return resultSizeBytes;
  }

  /**
   * The size of results the query produced.
   * @param resultSizeBytes resultSizeBytes or {@code null} for none
   */
  public GoogleCloudDataplexV1SessionEventQueryDetail setResultSizeBytes(java.lang.Long resultSizeBytes) {
    this.resultSizeBytes = resultSizeBytes;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1SessionEventQueryDetail set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1SessionEventQueryDetail) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1SessionEventQueryDetail clone() {
    return (GoogleCloudDataplexV1SessionEventQueryDetail) super.clone();
  }

}
