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
 * Input configuration for datasets.
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
public final class DatasetInputConfig extends com.google.api.client.json.GenericJson {

  /**
   * Files containing the sentence pairs to be imported to the dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InputFile> inputFiles;

  /**
   * Files containing the sentence pairs to be imported to the dataset.
   * @return value or {@code null} for none
   */
  public java.util.List<InputFile> getInputFiles() {
    return inputFiles;
  }

  /**
   * Files containing the sentence pairs to be imported to the dataset.
   * @param inputFiles inputFiles or {@code null} for none
   */
  public DatasetInputConfig setInputFiles(java.util.List<InputFile> inputFiles) {
    this.inputFiles = inputFiles;
    return this;
  }

  @Override
  public DatasetInputConfig set(String fieldName, Object value) {
    return (DatasetInputConfig) super.set(fieldName, value);
  }

  @Override
  public DatasetInputConfig clone() {
    return (DatasetInputConfig) super.clone();
  }

}