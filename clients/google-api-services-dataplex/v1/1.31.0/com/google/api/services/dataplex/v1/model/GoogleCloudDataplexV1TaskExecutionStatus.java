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
 * Status of the task execution (e.g. Jobs).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1TaskExecutionStatus extends com.google.api.client.json.GenericJson {

  /**
   * Output only. latest job execution
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDataplexV1Job latestJob;

  /**
   * Output only. Last update time of the status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. latest job execution
   * @return value or {@code null} for none
   */
  public GoogleCloudDataplexV1Job getLatestJob() {
    return latestJob;
  }

  /**
   * Output only. latest job execution
   * @param latestJob latestJob or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskExecutionStatus setLatestJob(GoogleCloudDataplexV1Job latestJob) {
    this.latestJob = latestJob;
    return this;
  }

  /**
   * Output only. Last update time of the status.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Last update time of the status.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskExecutionStatus setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1TaskExecutionStatus set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1TaskExecutionStatus) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1TaskExecutionStatus clone() {
    return (GoogleCloudDataplexV1TaskExecutionStatus) super.clone();
  }

}
