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

package com.google.api.services.dataplex.v1.model;

/**
 * Action details for invalid or unsupported data files detected by discovery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1ActionInvalidDataFormat extends com.google.api.client.json.GenericJson {

  /**
   * The expected data format of the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expectedFormat;

  /**
   * The new unexpected data format within the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newFormat;

  /**
   * The list of data locations sampled and used for format/schema inference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sampledDataLocations;

  /**
   * The expected data format of the entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpectedFormat() {
    return expectedFormat;
  }

  /**
   * The expected data format of the entity.
   * @param expectedFormat expectedFormat or {@code null} for none
   */
  public GoogleCloudDataplexV1ActionInvalidDataFormat setExpectedFormat(java.lang.String expectedFormat) {
    this.expectedFormat = expectedFormat;
    return this;
  }

  /**
   * The new unexpected data format within the entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewFormat() {
    return newFormat;
  }

  /**
   * The new unexpected data format within the entity.
   * @param newFormat newFormat or {@code null} for none
   */
  public GoogleCloudDataplexV1ActionInvalidDataFormat setNewFormat(java.lang.String newFormat) {
    this.newFormat = newFormat;
    return this;
  }

  /**
   * The list of data locations sampled and used for format/schema inference.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSampledDataLocations() {
    return sampledDataLocations;
  }

  /**
   * The list of data locations sampled and used for format/schema inference.
   * @param sampledDataLocations sampledDataLocations or {@code null} for none
   */
  public GoogleCloudDataplexV1ActionInvalidDataFormat setSampledDataLocations(java.util.List<java.lang.String> sampledDataLocations) {
    this.sampledDataLocations = sampledDataLocations;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1ActionInvalidDataFormat set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1ActionInvalidDataFormat) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1ActionInvalidDataFormat clone() {
    return (GoogleCloudDataplexV1ActionInvalidDataFormat) super.clone();
  }

}
