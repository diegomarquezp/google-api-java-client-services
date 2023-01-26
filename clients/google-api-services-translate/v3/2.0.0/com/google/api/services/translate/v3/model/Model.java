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

package com.google.api.services.translate.v3.model;

/**
 * A trained translation model.
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
public final class Model extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when the model resource was created, which is also when the training
   * started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The dataset from which the model is trained, in form of `projects/{project-number-or-
   * id}/locations/{location_id}/datasets/{dataset_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataset;

  /**
   * Output only. Timestamp when the model training finished and ready to be used for translation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deployTime;

  /**
   * The name of the model to show in the interface. The name can be up to 32 characters long and
   * can consist only of ASCII Latin letters A-Z and a-z, underscores (_), and ASCII digits 0-9.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The resource name of the model, in form of `projects/{project-number-or-
   * id}/locations/{location_id}/models/{model_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The BCP-47 language code of the source language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceLanguageCode;

  /**
   * Output only. The BCP-47 language code of the target language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetLanguageCode;

  /**
   * Output only. Number of examples (sentence pairs) used to test the model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer testExampleCount;

  /**
   * Output only. Number of examples (sentence pairs) used to train the model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer trainExampleCount;

  /**
   * Output only. Timestamp when this model was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Number of examples (sentence pairs) used to validate the model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer validateExampleCount;

  /**
   * Output only. Timestamp when the model resource was created, which is also when the training
   * started.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when the model resource was created, which is also when the training
   * started.
   * @param createTime createTime or {@code null} for none
   */
  public Model setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The dataset from which the model is trained, in form of `projects/{project-number-or-
   * id}/locations/{location_id}/datasets/{dataset_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getDataset() {
    return dataset;
  }

  /**
   * The dataset from which the model is trained, in form of `projects/{project-number-or-
   * id}/locations/{location_id}/datasets/{dataset_id}`
   * @param dataset dataset or {@code null} for none
   */
  public Model setDataset(java.lang.String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * Output only. Timestamp when the model training finished and ready to be used for translation.
   * @return value or {@code null} for none
   */
  public String getDeployTime() {
    return deployTime;
  }

  /**
   * Output only. Timestamp when the model training finished and ready to be used for translation.
   * @param deployTime deployTime or {@code null} for none
   */
  public Model setDeployTime(String deployTime) {
    this.deployTime = deployTime;
    return this;
  }

  /**
   * The name of the model to show in the interface. The name can be up to 32 characters long and
   * can consist only of ASCII Latin letters A-Z and a-z, underscores (_), and ASCII digits 0-9.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name of the model to show in the interface. The name can be up to 32 characters long and
   * can consist only of ASCII Latin letters A-Z and a-z, underscores (_), and ASCII digits 0-9.
   * @param displayName displayName or {@code null} for none
   */
  public Model setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The resource name of the model, in form of `projects/{project-number-or-
   * id}/locations/{location_id}/models/{model_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the model, in form of `projects/{project-number-or-
   * id}/locations/{location_id}/models/{model_id}`
   * @param name name or {@code null} for none
   */
  public Model setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The BCP-47 language code of the source language.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceLanguageCode() {
    return sourceLanguageCode;
  }

  /**
   * Output only. The BCP-47 language code of the source language.
   * @param sourceLanguageCode sourceLanguageCode or {@code null} for none
   */
  public Model setSourceLanguageCode(java.lang.String sourceLanguageCode) {
    this.sourceLanguageCode = sourceLanguageCode;
    return this;
  }

  /**
   * Output only. The BCP-47 language code of the target language.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetLanguageCode() {
    return targetLanguageCode;
  }

  /**
   * Output only. The BCP-47 language code of the target language.
   * @param targetLanguageCode targetLanguageCode or {@code null} for none
   */
  public Model setTargetLanguageCode(java.lang.String targetLanguageCode) {
    this.targetLanguageCode = targetLanguageCode;
    return this;
  }

  /**
   * Output only. Number of examples (sentence pairs) used to test the model.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTestExampleCount() {
    return testExampleCount;
  }

  /**
   * Output only. Number of examples (sentence pairs) used to test the model.
   * @param testExampleCount testExampleCount or {@code null} for none
   */
  public Model setTestExampleCount(java.lang.Integer testExampleCount) {
    this.testExampleCount = testExampleCount;
    return this;
  }

  /**
   * Output only. Number of examples (sentence pairs) used to train the model.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTrainExampleCount() {
    return trainExampleCount;
  }

  /**
   * Output only. Number of examples (sentence pairs) used to train the model.
   * @param trainExampleCount trainExampleCount or {@code null} for none
   */
  public Model setTrainExampleCount(java.lang.Integer trainExampleCount) {
    this.trainExampleCount = trainExampleCount;
    return this;
  }

  /**
   * Output only. Timestamp when this model was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when this model was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Model setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. Number of examples (sentence pairs) used to validate the model.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getValidateExampleCount() {
    return validateExampleCount;
  }

  /**
   * Output only. Number of examples (sentence pairs) used to validate the model.
   * @param validateExampleCount validateExampleCount or {@code null} for none
   */
  public Model setValidateExampleCount(java.lang.Integer validateExampleCount) {
    this.validateExampleCount = validateExampleCount;
    return this;
  }

  @Override
  public Model set(String fieldName, Object value) {
    return (Model) super.set(fieldName, value);
  }

  @Override
  public Model clone() {
    return (Model) super.clone();
  }

}