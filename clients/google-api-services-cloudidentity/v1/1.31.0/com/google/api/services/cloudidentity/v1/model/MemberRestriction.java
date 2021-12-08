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

package com.google.api.services.cloudidentity.v1.model;

/**
 * The definition of MemberRestriction
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MemberRestriction extends com.google.api.client.json.GenericJson {

  /**
   * The evaluated state of this restriction on a group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RestrictionEvaluation evaluation;

  /**
   * Member Restriction as defined by CEL expression. Supported restrictions are:
   * `member.customer_id` and `member.type`. Valid values for `member.type` are `1`, `2` and `3`.
   * They correspond to USER, SERVICE_ACCOUNT, and GROUP respectively. The value for
   * `member.customer_id` only supports `groupCustomerId()` currently which means the customer id of
   * the group will be used for restriction. Supported operators are `&&`, `||` and `==`,
   * corresponding to AND, OR, and EQUAL. Examples: Allow only service accounts of given customer to
   * be members. `member.type == 2 && member.customer_id == groupCustomerId()` Allow only users or
   * groups to be members. `member.type == 1 || member.type == 3`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The evaluated state of this restriction on a group.
   * @return value or {@code null} for none
   */
  public RestrictionEvaluation getEvaluation() {
    return evaluation;
  }

  /**
   * The evaluated state of this restriction on a group.
   * @param evaluation evaluation or {@code null} for none
   */
  public MemberRestriction setEvaluation(RestrictionEvaluation evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  /**
   * Member Restriction as defined by CEL expression. Supported restrictions are:
   * `member.customer_id` and `member.type`. Valid values for `member.type` are `1`, `2` and `3`.
   * They correspond to USER, SERVICE_ACCOUNT, and GROUP respectively. The value for
   * `member.customer_id` only supports `groupCustomerId()` currently which means the customer id of
   * the group will be used for restriction. Supported operators are `&&`, `||` and `==`,
   * corresponding to AND, OR, and EQUAL. Examples: Allow only service accounts of given customer to
   * be members. `member.type == 2 && member.customer_id == groupCustomerId()` Allow only users or
   * groups to be members. `member.type == 1 || member.type == 3`
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Member Restriction as defined by CEL expression. Supported restrictions are:
   * `member.customer_id` and `member.type`. Valid values for `member.type` are `1`, `2` and `3`.
   * They correspond to USER, SERVICE_ACCOUNT, and GROUP respectively. The value for
   * `member.customer_id` only supports `groupCustomerId()` currently which means the customer id of
   * the group will be used for restriction. Supported operators are `&&`, `||` and `==`,
   * corresponding to AND, OR, and EQUAL. Examples: Allow only service accounts of given customer to
   * be members. `member.type == 2 && member.customer_id == groupCustomerId()` Allow only users or
   * groups to be members. `member.type == 1 || member.type == 3`
   * @param query query or {@code null} for none
   */
  public MemberRestriction setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  @Override
  public MemberRestriction set(String fieldName, Object value) {
    return (MemberRestriction) super.set(fieldName, value);
  }

  @Override
  public MemberRestriction clone() {
    return (MemberRestriction) super.clone();
  }

}
