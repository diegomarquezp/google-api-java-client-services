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
 * This message encapsulates a list of custom report definitions
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ListCustomReportsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1CustomReport> qualifier;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1CustomReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1CustomReport.class);
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1CustomReport> getQualifier() {
    return qualifier;
  }

  /**
   * @param qualifier qualifier or {@code null} for none
   */
  public GoogleCloudApigeeV1ListCustomReportsResponse setQualifier(java.util.List<GoogleCloudApigeeV1CustomReport> qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ListCustomReportsResponse set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ListCustomReportsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ListCustomReportsResponse clone() {
    return (GoogleCloudApigeeV1ListCustomReportsResponse) super.clone();
  }

}
