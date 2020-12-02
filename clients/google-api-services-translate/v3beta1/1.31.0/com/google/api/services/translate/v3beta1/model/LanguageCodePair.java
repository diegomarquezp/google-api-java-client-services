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

package com.google.api.services.translate.v3beta1.model;

/**
 * Used with unidirectional glossaries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Translation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LanguageCodePair extends com.google.api.client.json.GenericJson {

  /**
   * Required. The BCP-47 language code of the input text, for example, "en-US". Expected to be an
   * exact match for GlossaryTerm.language_code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceLanguageCode;

  /**
   * Required. The BCP-47 language code for translation output, for example, "zh-CN". Expected to be
   * an exact match for GlossaryTerm.language_code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetLanguageCode;

  /**
   * Required. The BCP-47 language code of the input text, for example, "en-US". Expected to be an
   * exact match for GlossaryTerm.language_code.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceLanguageCode() {
    return sourceLanguageCode;
  }

  /**
   * Required. The BCP-47 language code of the input text, for example, "en-US". Expected to be an
   * exact match for GlossaryTerm.language_code.
   * @param sourceLanguageCode sourceLanguageCode or {@code null} for none
   */
  public LanguageCodePair setSourceLanguageCode(java.lang.String sourceLanguageCode) {
    this.sourceLanguageCode = sourceLanguageCode;
    return this;
  }

  /**
   * Required. The BCP-47 language code for translation output, for example, "zh-CN". Expected to be
   * an exact match for GlossaryTerm.language_code.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetLanguageCode() {
    return targetLanguageCode;
  }

  /**
   * Required. The BCP-47 language code for translation output, for example, "zh-CN". Expected to be
   * an exact match for GlossaryTerm.language_code.
   * @param targetLanguageCode targetLanguageCode or {@code null} for none
   */
  public LanguageCodePair setTargetLanguageCode(java.lang.String targetLanguageCode) {
    this.targetLanguageCode = targetLanguageCode;
    return this;
  }

  @Override
  public LanguageCodePair set(String fieldName, Object value) {
    return (LanguageCodePair) super.set(fieldName, value);
  }

  @Override
  public LanguageCodePair clone() {
    return (LanguageCodePair) super.clone();
  }

}
