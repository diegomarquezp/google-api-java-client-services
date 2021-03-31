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
 * A block has a set of lines (collected into paragraphs) that have a common line-spacing and
 * orientation.
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
public final class GoogleCloudDocumentaiV1DocumentPageBlock extends com.google.api.client.json.GenericJson {

  /**
   * A list of detected languages together with confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1DocumentPageDetectedLanguage> detectedLanguages;

  /**
   * Layout for Block.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1DocumentPageLayout layout;

  /**
   * The history of this annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1DocumentProvenance provenance;

  /**
   * A list of detected languages together with confidence.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1DocumentPageDetectedLanguage> getDetectedLanguages() {
    return detectedLanguages;
  }

  /**
   * A list of detected languages together with confidence.
   * @param detectedLanguages detectedLanguages or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageBlock setDetectedLanguages(java.util.List<GoogleCloudDocumentaiV1DocumentPageDetectedLanguage> detectedLanguages) {
    this.detectedLanguages = detectedLanguages;
    return this;
  }

  /**
   * Layout for Block.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageLayout getLayout() {
    return layout;
  }

  /**
   * Layout for Block.
   * @param layout layout or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageBlock setLayout(GoogleCloudDocumentaiV1DocumentPageLayout layout) {
    this.layout = layout;
    return this;
  }

  /**
   * The history of this annotation.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentProvenance getProvenance() {
    return provenance;
  }

  /**
   * The history of this annotation.
   * @param provenance provenance or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageBlock setProvenance(GoogleCloudDocumentaiV1DocumentProvenance provenance) {
    this.provenance = provenance;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentPageBlock set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1DocumentPageBlock) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentPageBlock clone() {
    return (GoogleCloudDocumentaiV1DocumentPageBlock) super.clone();
  }

}
