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

package com.google.api.services.apigee.v1.model;

/**
 * TraceSamplingConfig represents the detail settings of distributed tracing. Only the fields that
 * are defined in the distributed trace configuration can be overridden using the distribute trace
 * configuration override APIs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1TraceSamplingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Sampler of distributed tracing. OFF is the default value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sampler;

  /**
   * Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The
   * supported values are > 0 and <= 0.5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float samplingRate;

  /**
   * Sampler of distributed tracing. OFF is the default value.
   * @return value or {@code null} for none
   */
  public java.lang.String getSampler() {
    return sampler;
  }

  /**
   * Sampler of distributed tracing. OFF is the default value.
   * @param sampler sampler or {@code null} for none
   */
  public GoogleCloudApigeeV1TraceSamplingConfig setSampler(java.lang.String sampler) {
    this.sampler = sampler;
    return this;
  }

  /**
   * Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The
   * supported values are > 0 and <= 0.5.
   * @return value or {@code null} for none
   */
  public java.lang.Float getSamplingRate() {
    return samplingRate;
  }

  /**
   * Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The
   * supported values are > 0 and <= 0.5.
   * @param samplingRate samplingRate or {@code null} for none
   */
  public GoogleCloudApigeeV1TraceSamplingConfig setSamplingRate(java.lang.Float samplingRate) {
    this.samplingRate = samplingRate;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1TraceSamplingConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1TraceSamplingConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1TraceSamplingConfig clone() {
    return (GoogleCloudApigeeV1TraceSamplingConfig) super.clone();
  }

}
