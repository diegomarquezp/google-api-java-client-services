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

package com.google.api.services.cloudsearch.v1.model;

/**
 * The definition of a operator that can be used in a Search/Suggest request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryOperator extends com.google.api.client.json.GenericJson {

  /**
   * Display name of the operator
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Potential list of values for the opeatror field. This field is only filled when we can safely
   * enumerate all the possible values of this operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> enumValues;

  /**
   * Indicates the operator name that can be used to isolate the property using the greater-than
   * operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String greaterThanOperatorName;

  /**
   * Can this operator be used to get facets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isFacetable;

  /**
   * Indicates if multiple values can be set for this property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRepeatable;

  /**
   * Will the property associated with this facet be returned as part of search results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isReturnable;

  /**
   * Can this operator be used to sort results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSortable;

  /**
   * Can get suggestions for this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSuggestable;

  /**
   * Indicates the operator name that can be used to isolate the property using the less-than
   * operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lessThanOperatorName;

  /**
   * The name of the object corresponding to the operator. This field is only filled for schema-
   * specific operators, and is unset for common operators.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectType;

  /**
   * The name of the operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operatorName;

  /**
   * The type of the operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Display name of the operator
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name of the operator
   * @param displayName displayName or {@code null} for none
   */
  public QueryOperator setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Potential list of values for the opeatror field. This field is only filled when we can safely
   * enumerate all the possible values of this operator.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnumValues() {
    return enumValues;
  }

  /**
   * Potential list of values for the opeatror field. This field is only filled when we can safely
   * enumerate all the possible values of this operator.
   * @param enumValues enumValues or {@code null} for none
   */
  public QueryOperator setEnumValues(java.util.List<java.lang.String> enumValues) {
    this.enumValues = enumValues;
    return this;
  }

  /**
   * Indicates the operator name that can be used to isolate the property using the greater-than
   * operator.
   * @return value or {@code null} for none
   */
  public java.lang.String getGreaterThanOperatorName() {
    return greaterThanOperatorName;
  }

  /**
   * Indicates the operator name that can be used to isolate the property using the greater-than
   * operator.
   * @param greaterThanOperatorName greaterThanOperatorName or {@code null} for none
   */
  public QueryOperator setGreaterThanOperatorName(java.lang.String greaterThanOperatorName) {
    this.greaterThanOperatorName = greaterThanOperatorName;
    return this;
  }

  /**
   * Can this operator be used to get facets.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsFacetable() {
    return isFacetable;
  }

  /**
   * Can this operator be used to get facets.
   * @param isFacetable isFacetable or {@code null} for none
   */
  public QueryOperator setIsFacetable(java.lang.Boolean isFacetable) {
    this.isFacetable = isFacetable;
    return this;
  }

  /**
   * Indicates if multiple values can be set for this property.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRepeatable() {
    return isRepeatable;
  }

  /**
   * Indicates if multiple values can be set for this property.
   * @param isRepeatable isRepeatable or {@code null} for none
   */
  public QueryOperator setIsRepeatable(java.lang.Boolean isRepeatable) {
    this.isRepeatable = isRepeatable;
    return this;
  }

  /**
   * Will the property associated with this facet be returned as part of search results.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsReturnable() {
    return isReturnable;
  }

  /**
   * Will the property associated with this facet be returned as part of search results.
   * @param isReturnable isReturnable or {@code null} for none
   */
  public QueryOperator setIsReturnable(java.lang.Boolean isReturnable) {
    this.isReturnable = isReturnable;
    return this;
  }

  /**
   * Can this operator be used to sort results.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSortable() {
    return isSortable;
  }

  /**
   * Can this operator be used to sort results.
   * @param isSortable isSortable or {@code null} for none
   */
  public QueryOperator setIsSortable(java.lang.Boolean isSortable) {
    this.isSortable = isSortable;
    return this;
  }

  /**
   * Can get suggestions for this field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSuggestable() {
    return isSuggestable;
  }

  /**
   * Can get suggestions for this field.
   * @param isSuggestable isSuggestable or {@code null} for none
   */
  public QueryOperator setIsSuggestable(java.lang.Boolean isSuggestable) {
    this.isSuggestable = isSuggestable;
    return this;
  }

  /**
   * Indicates the operator name that can be used to isolate the property using the less-than
   * operator.
   * @return value or {@code null} for none
   */
  public java.lang.String getLessThanOperatorName() {
    return lessThanOperatorName;
  }

  /**
   * Indicates the operator name that can be used to isolate the property using the less-than
   * operator.
   * @param lessThanOperatorName lessThanOperatorName or {@code null} for none
   */
  public QueryOperator setLessThanOperatorName(java.lang.String lessThanOperatorName) {
    this.lessThanOperatorName = lessThanOperatorName;
    return this;
  }

  /**
   * The name of the object corresponding to the operator. This field is only filled for schema-
   * specific operators, and is unset for common operators.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectType() {
    return objectType;
  }

  /**
   * The name of the object corresponding to the operator. This field is only filled for schema-
   * specific operators, and is unset for common operators.
   * @param objectType objectType or {@code null} for none
   */
  public QueryOperator setObjectType(java.lang.String objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * The name of the operator.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperatorName() {
    return operatorName;
  }

  /**
   * The name of the operator.
   * @param operatorName operatorName or {@code null} for none
   */
  public QueryOperator setOperatorName(java.lang.String operatorName) {
    this.operatorName = operatorName;
    return this;
  }

  /**
   * The type of the operator.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the operator.
   * @param type type or {@code null} for none
   */
  public QueryOperator setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public QueryOperator set(String fieldName, Object value) {
    return (QueryOperator) super.set(fieldName, value);
  }

  @Override
  public QueryOperator clone() {
    return (QueryOperator) super.clone();
  }

}
