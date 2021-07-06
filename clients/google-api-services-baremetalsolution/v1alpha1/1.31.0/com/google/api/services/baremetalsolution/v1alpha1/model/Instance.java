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

package com.google.api.services.baremetalsolution.v1alpha1.model;

/**
 * An Instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Bare Metal Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * Is hyperthreading enabled for this instance?
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hyperthreadingEnabled;

  /**
   * The Luns attached to this instance
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Lun> luns;

  /**
   * Output only. The name of this Instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The scheduled power reset time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduledPowerResetTime;

  /**
   * Is SSH enabled for this instance?
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sshEnabled;

  /**
   * The state of this Instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Is hyperthreading enabled for this instance?
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHyperthreadingEnabled() {
    return hyperthreadingEnabled;
  }

  /**
   * Is hyperthreading enabled for this instance?
   * @param hyperthreadingEnabled hyperthreadingEnabled or {@code null} for none
   */
  public Instance setHyperthreadingEnabled(java.lang.Boolean hyperthreadingEnabled) {
    this.hyperthreadingEnabled = hyperthreadingEnabled;
    return this;
  }

  /**
   * The Luns attached to this instance
   * @return value or {@code null} for none
   */
  public java.util.List<Lun> getLuns() {
    return luns;
  }

  /**
   * The Luns attached to this instance
   * @param luns luns or {@code null} for none
   */
  public Instance setLuns(java.util.List<Lun> luns) {
    this.luns = luns;
    return this;
  }

  /**
   * Output only. The name of this Instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of this Instance.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The scheduled power reset time.
   * @return value or {@code null} for none
   */
  public String getScheduledPowerResetTime() {
    return scheduledPowerResetTime;
  }

  /**
   * The scheduled power reset time.
   * @param scheduledPowerResetTime scheduledPowerResetTime or {@code null} for none
   */
  public Instance setScheduledPowerResetTime(String scheduledPowerResetTime) {
    this.scheduledPowerResetTime = scheduledPowerResetTime;
    return this;
  }

  /**
   * Is SSH enabled for this instance?
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSshEnabled() {
    return sshEnabled;
  }

  /**
   * Is SSH enabled for this instance?
   * @param sshEnabled sshEnabled or {@code null} for none
   */
  public Instance setSshEnabled(java.lang.Boolean sshEnabled) {
    this.sshEnabled = sshEnabled;
    return this;
  }

  /**
   * The state of this Instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of this Instance.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}
