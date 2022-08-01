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

package com.google.api.services.directory.model;

/**
 * Model definition for UserGender.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserGender extends com.google.api.client.json.GenericJson {

  /**
   * AddressMeAs. A human-readable string containing the proper way to refer to the profile owner by
   * humans for example he/him/his or they/them/their.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String addressMeAs;

  /**
   * Custom gender.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customGender;

  /**
   * Gender.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * AddressMeAs. A human-readable string containing the proper way to refer to the profile owner by
   * humans for example he/him/his or they/them/their.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddressMeAs() {
    return addressMeAs;
  }

  /**
   * AddressMeAs. A human-readable string containing the proper way to refer to the profile owner by
   * humans for example he/him/his or they/them/their.
   * @param addressMeAs addressMeAs or {@code null} for none
   */
  public UserGender setAddressMeAs(java.lang.String addressMeAs) {
    this.addressMeAs = addressMeAs;
    return this;
  }

  /**
   * Custom gender.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomGender() {
    return customGender;
  }

  /**
   * Custom gender.
   * @param customGender customGender or {@code null} for none
   */
  public UserGender setCustomGender(java.lang.String customGender) {
    this.customGender = customGender;
    return this;
  }

  /**
   * Gender.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Gender.
   * @param type type or {@code null} for none
   */
  public UserGender setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public UserGender set(String fieldName, Object value) {
    return (UserGender) super.set(fieldName, value);
  }

  @Override
  public UserGender clone() {
    return (UserGender) super.clone();
  }

}
