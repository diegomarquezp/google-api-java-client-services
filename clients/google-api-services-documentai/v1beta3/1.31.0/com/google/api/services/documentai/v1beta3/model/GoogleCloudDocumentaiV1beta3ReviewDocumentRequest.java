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

package com.google.api.services.documentai.v1beta3.model;

/**
 * Request message for review document method.
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
public final class GoogleCloudDocumentaiV1beta3ReviewDocumentRequest extends com.google.api.client.json.GenericJson {

  /**
   * The document that needs human review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3Document document;

  /**
   * The document schema of the human review task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3DocumentSchema documentSchema;

  /**
   * Whether the validation should be performed on the ad-hoc review request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableSchemaValidation;

  /**
   * An inline document proto.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3Document inlineDocument;

  /**
   * The priority of the human review task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String priority;

  /**
   * The document that needs human review.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document getDocument() {
    return document;
  }

  /**
   * The document that needs human review.
   * @param document document or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ReviewDocumentRequest setDocument(GoogleCloudDocumentaiV1beta3Document document) {
    this.document = document;
    return this;
  }

  /**
   * The document schema of the human review task.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentSchema getDocumentSchema() {
    return documentSchema;
  }

  /**
   * The document schema of the human review task.
   * @param documentSchema documentSchema or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ReviewDocumentRequest setDocumentSchema(GoogleCloudDocumentaiV1beta3DocumentSchema documentSchema) {
    this.documentSchema = documentSchema;
    return this;
  }

  /**
   * Whether the validation should be performed on the ad-hoc review request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableSchemaValidation() {
    return enableSchemaValidation;
  }

  /**
   * Whether the validation should be performed on the ad-hoc review request.
   * @param enableSchemaValidation enableSchemaValidation or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ReviewDocumentRequest setEnableSchemaValidation(java.lang.Boolean enableSchemaValidation) {
    this.enableSchemaValidation = enableSchemaValidation;
    return this;
  }

  /**
   * An inline document proto.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document getInlineDocument() {
    return inlineDocument;
  }

  /**
   * An inline document proto.
   * @param inlineDocument inlineDocument or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ReviewDocumentRequest setInlineDocument(GoogleCloudDocumentaiV1beta3Document inlineDocument) {
    this.inlineDocument = inlineDocument;
    return this;
  }

  /**
   * The priority of the human review task.
   * @return value or {@code null} for none
   */
  public java.lang.String getPriority() {
    return priority;
  }

  /**
   * The priority of the human review task.
   * @param priority priority or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ReviewDocumentRequest setPriority(java.lang.String priority) {
    this.priority = priority;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta3ReviewDocumentRequest set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta3ReviewDocumentRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta3ReviewDocumentRequest clone() {
    return (GoogleCloudDocumentaiV1beta3ReviewDocumentRequest) super.clone();
  }

}
