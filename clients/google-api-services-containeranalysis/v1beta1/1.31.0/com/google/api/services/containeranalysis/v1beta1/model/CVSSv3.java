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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * Deprecated. Common Vulnerability Scoring System version 3. For details, see
 * https://www.first.org/cvss/specification-document
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CVSSv3 extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attackComplexity;

  /**
   * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over
   * time and across user environments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attackVector;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availabilityImpact;

  /**
   * The base score is a function of the base metric scores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float baseScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String confidentialityImpact;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float exploitabilityScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float impactScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String integrityImpact;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privilegesRequired;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scope;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userInteraction;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAttackComplexity() {
    return attackComplexity;
  }

  /**
   * @param attackComplexity attackComplexity or {@code null} for none
   */
  public CVSSv3 setAttackComplexity(java.lang.String attackComplexity) {
    this.attackComplexity = attackComplexity;
    return this;
  }

  /**
   * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over
   * time and across user environments.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttackVector() {
    return attackVector;
  }

  /**
   * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over
   * time and across user environments.
   * @param attackVector attackVector or {@code null} for none
   */
  public CVSSv3 setAttackVector(java.lang.String attackVector) {
    this.attackVector = attackVector;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailabilityImpact() {
    return availabilityImpact;
  }

  /**
   * @param availabilityImpact availabilityImpact or {@code null} for none
   */
  public CVSSv3 setAvailabilityImpact(java.lang.String availabilityImpact) {
    this.availabilityImpact = availabilityImpact;
    return this;
  }

  /**
   * The base score is a function of the base metric scores.
   * @return value or {@code null} for none
   */
  public java.lang.Float getBaseScore() {
    return baseScore;
  }

  /**
   * The base score is a function of the base metric scores.
   * @param baseScore baseScore or {@code null} for none
   */
  public CVSSv3 setBaseScore(java.lang.Float baseScore) {
    this.baseScore = baseScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getConfidentialityImpact() {
    return confidentialityImpact;
  }

  /**
   * @param confidentialityImpact confidentialityImpact or {@code null} for none
   */
  public CVSSv3 setConfidentialityImpact(java.lang.String confidentialityImpact) {
    this.confidentialityImpact = confidentialityImpact;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getExploitabilityScore() {
    return exploitabilityScore;
  }

  /**
   * @param exploitabilityScore exploitabilityScore or {@code null} for none
   */
  public CVSSv3 setExploitabilityScore(java.lang.Float exploitabilityScore) {
    this.exploitabilityScore = exploitabilityScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getImpactScore() {
    return impactScore;
  }

  /**
   * @param impactScore impactScore or {@code null} for none
   */
  public CVSSv3 setImpactScore(java.lang.Float impactScore) {
    this.impactScore = impactScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIntegrityImpact() {
    return integrityImpact;
  }

  /**
   * @param integrityImpact integrityImpact or {@code null} for none
   */
  public CVSSv3 setIntegrityImpact(java.lang.String integrityImpact) {
    this.integrityImpact = integrityImpact;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivilegesRequired() {
    return privilegesRequired;
  }

  /**
   * @param privilegesRequired privilegesRequired or {@code null} for none
   */
  public CVSSv3 setPrivilegesRequired(java.lang.String privilegesRequired) {
    this.privilegesRequired = privilegesRequired;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getScope() {
    return scope;
  }

  /**
   * @param scope scope or {@code null} for none
   */
  public CVSSv3 setScope(java.lang.String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUserInteraction() {
    return userInteraction;
  }

  /**
   * @param userInteraction userInteraction or {@code null} for none
   */
  public CVSSv3 setUserInteraction(java.lang.String userInteraction) {
    this.userInteraction = userInteraction;
    return this;
  }

  @Override
  public CVSSv3 set(String fieldName, Object value) {
    return (CVSSv3) super.set(fieldName, value);
  }

  @Override
  public CVSSv3 clone() {
    return (CVSSv3) super.clone();
  }

}
