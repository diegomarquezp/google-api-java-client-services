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
 * Evaluation metrics, either in aggregate or about a specific entity.
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
public final class GoogleCloudDocumentaiV1EvaluationMetrics extends com.google.api.client.json.GenericJson {

  /**
   * The calculated f1 score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float f1Score;

  /**
   * The amount of false negatives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer falseNegativesCount;

  /**
   * The amount of false positives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer falsePositivesCount;

  /**
   * The amount of occurrences in ground truth documents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer groundTruthOccurrencesCount;

  /**
   * The calculated precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float precision;

  /**
   * The amount of occurrences in predicted documents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer predictedOccurrencesCount;

  /**
   * The calculated recall.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float recall;

  /**
   * The amount of documents that had an occurrence of this label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalDocumentsCount;

  /**
   * The amount of true positives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer truePositivesCount;

  /**
   * The calculated f1 score.
   * @return value or {@code null} for none
   */
  public java.lang.Float getF1Score() {
    return f1Score;
  }

  /**
   * The calculated f1 score.
   * @param f1Score f1Score or {@code null} for none
   */
  public GoogleCloudDocumentaiV1EvaluationMetrics setF1Score(java.lang.Float f1Score) {
    this.f1Score = f1Score;
    return this;
  }

  /**
   * The amount of false negatives.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFalseNegativesCount() {
    return falseNegativesCount;
  }

  /**
   * The amount of false negatives.
   * @param falseNegativesCount falseNegativesCount or {@code null} for none
   */
  public GoogleCloudDocumentaiV1EvaluationMetrics setFalseNegativesCount(java.lang.Integer falseNegativesCount) {
    this.falseNegativesCount = falseNegativesCount;
    return this;
  }

  /**
   * The amount of false positives.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFalsePositivesCount() {
    return falsePositivesCount;
  }

  /**
   * The amount of false positives.
   * @param falsePositivesCount falsePositivesCount or {@code null} for none
   */
  public GoogleCloudDocumentaiV1EvaluationMetrics setFalsePositivesCount(java.lang.Integer falsePositivesCount) {
    this.falsePositivesCount = falsePositivesCount;
    return this;
  }

  /**
   * The amount of occurrences in ground truth documents.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGroundTruthOccurrencesCount() {
    return groundTruthOccurrencesCount;
  }

  /**
   * The amount of occurrences in ground truth documents.
   * @param groundTruthOccurrencesCount groundTruthOccurrencesCount or {@code null} for none
   */
  public GoogleCloudDocumentaiV1EvaluationMetrics setGroundTruthOccurrencesCount(java.lang.Integer groundTruthOccurrencesCount) {
    this.groundTruthOccurrencesCount = groundTruthOccurrencesCount;
    return this;
  }

  /**
   * The calculated precision.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPrecision() {
    return precision;
  }

  /**
   * The calculated precision.
   * @param precision precision or {@code null} for none
   */
  public GoogleCloudDocumentaiV1EvaluationMetrics setPrecision(java.lang.Float precision) {
    this.precision = precision;
    return this;
  }

  /**
   * The amount of occurrences in predicted documents.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPredictedOccurrencesCount() {
    return predictedOccurrencesCount;
  }

  /**
   * The amount of occurrences in predicted documents.
   * @param predictedOccurrencesCount predictedOccurrencesCount or {@code null} for none
   */
  public GoogleCloudDocumentaiV1EvaluationMetrics setPredictedOccurrencesCount(java.lang.Integer predictedOccurrencesCount) {
    this.predictedOccurrencesCount = predictedOccurrencesCount;
    return this;
  }

  /**
   * The calculated recall.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRecall() {
    return recall;
  }

  /**
   * The calculated recall.
   * @param recall recall or {@code null} for none
   */
  public GoogleCloudDocumentaiV1EvaluationMetrics setRecall(java.lang.Float recall) {
    this.recall = recall;
    return this;
  }

  /**
   * The amount of documents that had an occurrence of this label.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalDocumentsCount() {
    return totalDocumentsCount;
  }

  /**
   * The amount of documents that had an occurrence of this label.
   * @param totalDocumentsCount totalDocumentsCount or {@code null} for none
   */
  public GoogleCloudDocumentaiV1EvaluationMetrics setTotalDocumentsCount(java.lang.Integer totalDocumentsCount) {
    this.totalDocumentsCount = totalDocumentsCount;
    return this;
  }

  /**
   * The amount of true positives.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTruePositivesCount() {
    return truePositivesCount;
  }

  /**
   * The amount of true positives.
   * @param truePositivesCount truePositivesCount or {@code null} for none
   */
  public GoogleCloudDocumentaiV1EvaluationMetrics setTruePositivesCount(java.lang.Integer truePositivesCount) {
    this.truePositivesCount = truePositivesCount;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1EvaluationMetrics set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1EvaluationMetrics) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1EvaluationMetrics clone() {
    return (GoogleCloudDocumentaiV1EvaluationMetrics) super.clone();
  }

}
