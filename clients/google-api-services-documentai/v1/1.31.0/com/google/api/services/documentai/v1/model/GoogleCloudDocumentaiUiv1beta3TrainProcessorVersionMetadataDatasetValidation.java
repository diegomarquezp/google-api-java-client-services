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
 * The dataset validation information. This includes any and all errors with documents and the
 * dataset.
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
public final class GoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation extends com.google.api.client.json.GenericJson {

  /**
   * Error information for the dataset as a whole. A maximum of 10 dataset errors will be returned.
   * A single dataset error is terminal for training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleRpcStatus> datasetErrors;

  /**
   * Error information pertaining to specific documents. A maximum of 10 document errors will be
   * returned. Any document with errors will not be used throughout training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleRpcStatus> documentErrors;

  /**
   * Error information for the dataset as a whole. A maximum of 10 dataset errors will be returned.
   * A single dataset error is terminal for training.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleRpcStatus> getDatasetErrors() {
    return datasetErrors;
  }

  /**
   * Error information for the dataset as a whole. A maximum of 10 dataset errors will be returned.
   * A single dataset error is terminal for training.
   * @param datasetErrors datasetErrors or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation setDatasetErrors(java.util.List<GoogleRpcStatus> datasetErrors) {
    this.datasetErrors = datasetErrors;
    return this;
  }

  /**
   * Error information pertaining to specific documents. A maximum of 10 document errors will be
   * returned. Any document with errors will not be used throughout training.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleRpcStatus> getDocumentErrors() {
    return documentErrors;
  }

  /**
   * Error information pertaining to specific documents. A maximum of 10 document errors will be
   * returned. Any document with errors will not be used throughout training.
   * @param documentErrors documentErrors or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation setDocumentErrors(java.util.List<GoogleRpcStatus> documentErrors) {
    this.documentErrors = documentErrors;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation clone() {
    return (GoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation) super.clone();
  }

}
