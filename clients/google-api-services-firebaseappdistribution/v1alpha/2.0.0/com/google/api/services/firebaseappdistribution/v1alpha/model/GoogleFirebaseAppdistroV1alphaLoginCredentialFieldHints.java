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

package com.google.api.services.firebaseappdistribution.v1alpha.model;

/**
 * Hints to the crawler for identifying input fields
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Distribution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppdistroV1alphaLoginCredentialFieldHints extends com.google.api.client.json.GenericJson {

  /**
   * Required. The Android resource name of the password UI element. For example, in Java:
   * R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc:
   * https://developer.android.com/guide/topics/resources/accessing-resources.html
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String passwordResourceName;

  /**
   * Required. The Android resource name of the username UI element. For example, in Java:
   * R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc:
   * https://developer.android.com/guide/topics/resources/accessing-resources.html
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String usernameResourceName;

  /**
   * Required. The Android resource name of the password UI element. For example, in Java:
   * R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc:
   * https://developer.android.com/guide/topics/resources/accessing-resources.html
   * @return value or {@code null} for none
   */
  public java.lang.String getPasswordResourceName() {
    return passwordResourceName;
  }

  /**
   * Required. The Android resource name of the password UI element. For example, in Java:
   * R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc:
   * https://developer.android.com/guide/topics/resources/accessing-resources.html
   * @param passwordResourceName passwordResourceName or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaLoginCredentialFieldHints setPasswordResourceName(java.lang.String passwordResourceName) {
    this.passwordResourceName = passwordResourceName;
    return this;
  }

  /**
   * Required. The Android resource name of the username UI element. For example, in Java:
   * R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc:
   * https://developer.android.com/guide/topics/resources/accessing-resources.html
   * @return value or {@code null} for none
   */
  public java.lang.String getUsernameResourceName() {
    return usernameResourceName;
  }

  /**
   * Required. The Android resource name of the username UI element. For example, in Java:
   * R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc:
   * https://developer.android.com/guide/topics/resources/accessing-resources.html
   * @param usernameResourceName usernameResourceName or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaLoginCredentialFieldHints setUsernameResourceName(java.lang.String usernameResourceName) {
    this.usernameResourceName = usernameResourceName;
    return this;
  }

  @Override
  public GoogleFirebaseAppdistroV1alphaLoginCredentialFieldHints set(String fieldName, Object value) {
    return (GoogleFirebaseAppdistroV1alphaLoginCredentialFieldHints) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppdistroV1alphaLoginCredentialFieldHints clone() {
    return (GoogleFirebaseAppdistroV1alphaLoginCredentialFieldHints) super.clone();
  }

}
