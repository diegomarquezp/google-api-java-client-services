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

package com.google.api.services.documentai.v1.model;

/**
 * A collection of tokens that a human would perceive as a line. Does not cross column boundaries,
 * can be horizontal, vertical, etc.
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
public final class GoogleCloudDocumentaiV1beta2DocumentPageLine extends com.google.api.client.json.GenericJson {

  /**
   * A list of detected languages together with confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> detectedLanguages;

  static {
    // hack to force ProGuard to consider GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage.class);
  }

  /**
   * Layout for Line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentPageLayout layout;

  /**
   * The history of this annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentProvenance provenance;

  /**
   * A list of detected languages together with confidence.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> getDetectedLanguages() {
    return detectedLanguages;
  }

  /**
   * A list of detected languages together with confidence.
   * @param detectedLanguages detectedLanguages or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageLine setDetectedLanguages(java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> detectedLanguages) {
    this.detectedLanguages = detectedLanguages;
    return this;
  }

  /**
   * Layout for Line.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageLayout getLayout() {
    return layout;
  }

  /**
   * Layout for Line.
   * @param layout layout or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageLine setLayout(GoogleCloudDocumentaiV1beta2DocumentPageLayout layout) {
    this.layout = layout;
    return this;
  }

  /**
   * The history of this annotation.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentProvenance getProvenance() {
    return provenance;
  }

  /**
   * The history of this annotation.
   * @param provenance provenance or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageLine setProvenance(GoogleCloudDocumentaiV1beta2DocumentProvenance provenance) {
    this.provenance = provenance;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentPageLine set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentPageLine) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentPageLine clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentPageLine) super.clone();
  }

}
