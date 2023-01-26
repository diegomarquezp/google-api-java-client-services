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
 * An input file.
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
public final class InputFile extends com.google.api.client.json.GenericJson {

  /**
   * Google Cloud Storage file source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsInputSource gcsSource;

  /**
   * Optional. Usage of the file contents. Options are TRAIN|VALIDATION|TEST, or UNASSIGNED (by
   * default) for auto split.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String usage;

  /**
   * Google Cloud Storage file source.
   * @return value or {@code null} for none
   */
  public GcsInputSource getGcsSource() {
    return gcsSource;
  }

  /**
   * Google Cloud Storage file source.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public InputFile setGcsSource(GcsInputSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  /**
   * Optional. Usage of the file contents. Options are TRAIN|VALIDATION|TEST, or UNASSIGNED (by
   * default) for auto split.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsage() {
    return usage;
  }

  /**
   * Optional. Usage of the file contents. Options are TRAIN|VALIDATION|TEST, or UNASSIGNED (by
   * default) for auto split.
   * @param usage usage or {@code null} for none
   */
  public InputFile setUsage(java.lang.String usage) {
    this.usage = usage;
    return this;
  }

  @Override
  public InputFile set(String fieldName, Object value) {
    return (InputFile) super.set(fieldName, value);
  }

  @Override
  public InputFile clone() {
    return (InputFile) super.clone();
  }

}