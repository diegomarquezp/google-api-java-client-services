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

package com.google.api.services.adsense.v2.model;

/**
 * Representation of an account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Account extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Creation time of the account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Display name of this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Resource name of the account. Format: accounts/pub-[0-9]+
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Outstanding tasks that need to be completed as part of the sign-up process for a
   * new account. e.g. "billing-profile-creation", "phone-pin-verification".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> pendingTasks;

  /**
   * Output only. Whether this account is premium.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean premium;

  /**
   * The account time zone, as used by reporting. For more information, see [changing the time zone
   * of your reports](https://support.google.com/adsense/answer/9830725).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeZone timeZone;

  /**
   * Output only. Creation time of the account.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Creation time of the account.
   * @param createTime createTime or {@code null} for none
   */
  public Account setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Display name of this account.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. Display name of this account.
   * @param displayName displayName or {@code null} for none
   */
  public Account setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Resource name of the account. Format: accounts/pub-[0-9]+
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of the account. Format: accounts/pub-[0-9]+
   * @param name name or {@code null} for none
   */
  public Account setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Outstanding tasks that need to be completed as part of the sign-up process for a
   * new account. e.g. "billing-profile-creation", "phone-pin-verification".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPendingTasks() {
    return pendingTasks;
  }

  /**
   * Output only. Outstanding tasks that need to be completed as part of the sign-up process for a
   * new account. e.g. "billing-profile-creation", "phone-pin-verification".
   * @param pendingTasks pendingTasks or {@code null} for none
   */
  public Account setPendingTasks(java.util.List<java.lang.String> pendingTasks) {
    this.pendingTasks = pendingTasks;
    return this;
  }

  /**
   * Output only. Whether this account is premium.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPremium() {
    return premium;
  }

  /**
   * Output only. Whether this account is premium.
   * @param premium premium or {@code null} for none
   */
  public Account setPremium(java.lang.Boolean premium) {
    this.premium = premium;
    return this;
  }

  /**
   * The account time zone, as used by reporting. For more information, see [changing the time zone
   * of your reports](https://support.google.com/adsense/answer/9830725).
   * @return value or {@code null} for none
   */
  public TimeZone getTimeZone() {
    return timeZone;
  }

  /**
   * The account time zone, as used by reporting. For more information, see [changing the time zone
   * of your reports](https://support.google.com/adsense/answer/9830725).
   * @param timeZone timeZone or {@code null} for none
   */
  public Account setTimeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public Account set(String fieldName, Object value) {
    return (Account) super.set(fieldName, value);
  }

  @Override
  public Account clone() {
    return (Account) super.clone();
  }

}
