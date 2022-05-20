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

package com.google.api.services.firebase.v1beta1.model;

/**
 * Model definition for RemoveIosAppRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RemoveIosAppRequest extends com.google.api.client.json.GenericJson {

  /**
   * If set to true, and the App is not found, the request will succeed but no action will be taken
   * on the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowMissing;

  /**
   * Checksum provided in the IosApp entity, which if provided ensures the client has an up-to-date
   * value before proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * If set to true, only validate the request and do not delete the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean validateOnly;

  /**
   * If set to true, and the App is not found, the request will succeed but no action will be taken
   * on the server.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowMissing() {
    return allowMissing;
  }

  /**
   * If set to true, and the App is not found, the request will succeed but no action will be taken
   * on the server.
   * @param allowMissing allowMissing or {@code null} for none
   */
  public RemoveIosAppRequest setAllowMissing(java.lang.Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  /**
   * Checksum provided in the IosApp entity, which if provided ensures the client has an up-to-date
   * value before proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Checksum provided in the IosApp entity, which if provided ensures the client has an up-to-date
   * value before proceeding.
   * @param etag etag or {@code null} for none
   */
  public RemoveIosAppRequest setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * If set to true, only validate the request and do not delete the app.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValidateOnly() {
    return validateOnly;
  }

  /**
   * If set to true, only validate the request and do not delete the app.
   * @param validateOnly validateOnly or {@code null} for none
   */
  public RemoveIosAppRequest setValidateOnly(java.lang.Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  @Override
  public RemoveIosAppRequest set(String fieldName, Object value) {
    return (RemoveIosAppRequest) super.set(fieldName, value);
  }

  @Override
  public RemoveIosAppRequest clone() {
    return (RemoveIosAppRequest) super.clone();
  }

}
