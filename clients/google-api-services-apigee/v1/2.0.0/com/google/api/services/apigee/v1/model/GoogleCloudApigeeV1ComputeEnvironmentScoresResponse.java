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
 * Response for ComputeEnvironmentScores.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ComputeEnvironmentScoresResponse extends com.google.api.client.json.GenericJson {

  /**
   * A page token, received from a previous `ComputeScore` call. Provide this to retrieve the
   * subsequent page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of scores. One score per day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1Score> scores;

  /**
   * A page token, received from a previous `ComputeScore` call. Provide this to retrieve the
   * subsequent page.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A page token, received from a previous `ComputeScore` call. Provide this to retrieve the
   * subsequent page.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudApigeeV1ComputeEnvironmentScoresResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of scores. One score per day.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1Score> getScores() {
    return scores;
  }

  /**
   * List of scores. One score per day.
   * @param scores scores or {@code null} for none
   */
  public GoogleCloudApigeeV1ComputeEnvironmentScoresResponse setScores(java.util.List<GoogleCloudApigeeV1Score> scores) {
    this.scores = scores;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ComputeEnvironmentScoresResponse set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ComputeEnvironmentScoresResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ComputeEnvironmentScoresResponse clone() {
    return (GoogleCloudApigeeV1ComputeEnvironmentScoresResponse) super.clone();
  }

}
