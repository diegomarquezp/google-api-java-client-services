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

package com.google.api.services.documentai.v1beta2.model;

/**
 * The long running operation metadata for review document method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1ReviewDocumentOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The basic metadata of the long running operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1CommonOperationMetadata commonMetadata;

  /**
   * The Crowd Compute question ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String questionId;

  /**
   * The basic metadata of the long running operation.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1CommonOperationMetadata getCommonMetadata() {
    return commonMetadata;
  }

  /**
   * The basic metadata of the long running operation.
   * @param commonMetadata commonMetadata or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ReviewDocumentOperationMetadata setCommonMetadata(GoogleCloudDocumentaiV1CommonOperationMetadata commonMetadata) {
    this.commonMetadata = commonMetadata;
    return this;
  }

  /**
   * The Crowd Compute question ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuestionId() {
    return questionId;
  }

  /**
   * The Crowd Compute question ID.
   * @param questionId questionId or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ReviewDocumentOperationMetadata setQuestionId(java.lang.String questionId) {
    this.questionId = questionId;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1ReviewDocumentOperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1ReviewDocumentOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1ReviewDocumentOperationMetadata clone() {
    return (GoogleCloudDocumentaiV1ReviewDocumentOperationMetadata) super.clone();
  }

}
