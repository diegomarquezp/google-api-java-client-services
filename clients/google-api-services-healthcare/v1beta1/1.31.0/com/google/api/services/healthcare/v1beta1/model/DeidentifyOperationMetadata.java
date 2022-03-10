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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Details about the work the de-identify operation performed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeidentifyOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Details about the FHIR store to write the output to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FhirOutput fhirOutput;

  /**
   * Details about the FHIR store to write the output to.
   * @return value or {@code null} for none
   */
  public FhirOutput getFhirOutput() {
    return fhirOutput;
  }

  /**
   * Details about the FHIR store to write the output to.
   * @param fhirOutput fhirOutput or {@code null} for none
   */
  public DeidentifyOperationMetadata setFhirOutput(FhirOutput fhirOutput) {
    this.fhirOutput = fhirOutput;
    return this;
  }

  @Override
  public DeidentifyOperationMetadata set(String fieldName, Object value) {
    return (DeidentifyOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public DeidentifyOperationMetadata clone() {
    return (DeidentifyOperationMetadata) super.clone();
  }

}
