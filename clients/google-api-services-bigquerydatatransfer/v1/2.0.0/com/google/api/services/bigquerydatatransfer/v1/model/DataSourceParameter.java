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

package com.google.api.services.bigquerydatatransfer.v1.model;

/**
 * A parameter used to define custom fields in a data source definition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Data Transfer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSourceParameter extends com.google.api.client.json.GenericJson {

  /**
   * All possible values for the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedValues;

  /**
   * If true, it should not be used in new transfers, and it should not be visible to users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deprecated;

  /**
   * Parameter description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Parameter display name in the user interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Deprecated. This field has no effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataSourceParameter> fields;

  /**
   * Cannot be changed after initial creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean immutable;

  /**
   * For integer and double values specifies maxminum allowed value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxValue;

  /**
   * For integer and double values specifies minimum allowed value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minValue;

  /**
   * Parameter identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paramId;

  /**
   * Deprecated. This field has no effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean recurse;

  /**
   * Deprecated. This field has no effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean repeated;

  /**
   * Is parameter required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean required;

  /**
   * Parameter type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Description of the requirements for this field, in case the user input does not fulfill the
   * regex pattern or min/max values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String validationDescription;

  /**
   * URL to a help document to further explain the naming requirements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String validationHelpUrl;

  /**
   * Regular expression which can be used for parameter validation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String validationRegex;

  /**
   * All possible values for the parameter.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedValues() {
    return allowedValues;
  }

  /**
   * All possible values for the parameter.
   * @param allowedValues allowedValues or {@code null} for none
   */
  public DataSourceParameter setAllowedValues(java.util.List<java.lang.String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  /**
   * If true, it should not be used in new transfers, and it should not be visible to users.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeprecated() {
    return deprecated;
  }

  /**
   * If true, it should not be used in new transfers, and it should not be visible to users.
   * @param deprecated deprecated or {@code null} for none
   */
  public DataSourceParameter setDeprecated(java.lang.Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

  /**
   * Parameter description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Parameter description.
   * @param description description or {@code null} for none
   */
  public DataSourceParameter setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Parameter display name in the user interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Parameter display name in the user interface.
   * @param displayName displayName or {@code null} for none
   */
  public DataSourceParameter setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Deprecated. This field has no effect.
   * @return value or {@code null} for none
   */
  public java.util.List<DataSourceParameter> getFields() {
    return fields;
  }

  /**
   * Deprecated. This field has no effect.
   * @param fields fields or {@code null} for none
   */
  public DataSourceParameter setFields(java.util.List<DataSourceParameter> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Cannot be changed after initial creation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getImmutable() {
    return immutable;
  }

  /**
   * Cannot be changed after initial creation.
   * @param immutable immutable or {@code null} for none
   */
  public DataSourceParameter setImmutable(java.lang.Boolean immutable) {
    this.immutable = immutable;
    return this;
  }

  /**
   * For integer and double values specifies maxminum allowed value.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxValue() {
    return maxValue;
  }

  /**
   * For integer and double values specifies maxminum allowed value.
   * @param maxValue maxValue or {@code null} for none
   */
  public DataSourceParameter setMaxValue(java.lang.Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * For integer and double values specifies minimum allowed value.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinValue() {
    return minValue;
  }

  /**
   * For integer and double values specifies minimum allowed value.
   * @param minValue minValue or {@code null} for none
   */
  public DataSourceParameter setMinValue(java.lang.Double minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Parameter identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getParamId() {
    return paramId;
  }

  /**
   * Parameter identifier.
   * @param paramId paramId or {@code null} for none
   */
  public DataSourceParameter setParamId(java.lang.String paramId) {
    this.paramId = paramId;
    return this;
  }

  /**
   * Deprecated. This field has no effect.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRecurse() {
    return recurse;
  }

  /**
   * Deprecated. This field has no effect.
   * @param recurse recurse or {@code null} for none
   */
  public DataSourceParameter setRecurse(java.lang.Boolean recurse) {
    this.recurse = recurse;
    return this;
  }

  /**
   * Deprecated. This field has no effect.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRepeated() {
    return repeated;
  }

  /**
   * Deprecated. This field has no effect.
   * @param repeated repeated or {@code null} for none
   */
  public DataSourceParameter setRepeated(java.lang.Boolean repeated) {
    this.repeated = repeated;
    return this;
  }

  /**
   * Is parameter required.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequired() {
    return required;
  }

  /**
   * Is parameter required.
   * @param required required or {@code null} for none
   */
  public DataSourceParameter setRequired(java.lang.Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Parameter type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Parameter type.
   * @param type type or {@code null} for none
   */
  public DataSourceParameter setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Description of the requirements for this field, in case the user input does not fulfill the
   * regex pattern or min/max values.
   * @return value or {@code null} for none
   */
  public java.lang.String getValidationDescription() {
    return validationDescription;
  }

  /**
   * Description of the requirements for this field, in case the user input does not fulfill the
   * regex pattern or min/max values.
   * @param validationDescription validationDescription or {@code null} for none
   */
  public DataSourceParameter setValidationDescription(java.lang.String validationDescription) {
    this.validationDescription = validationDescription;
    return this;
  }

  /**
   * URL to a help document to further explain the naming requirements.
   * @return value or {@code null} for none
   */
  public java.lang.String getValidationHelpUrl() {
    return validationHelpUrl;
  }

  /**
   * URL to a help document to further explain the naming requirements.
   * @param validationHelpUrl validationHelpUrl or {@code null} for none
   */
  public DataSourceParameter setValidationHelpUrl(java.lang.String validationHelpUrl) {
    this.validationHelpUrl = validationHelpUrl;
    return this;
  }

  /**
   * Regular expression which can be used for parameter validation.
   * @return value or {@code null} for none
   */
  public java.lang.String getValidationRegex() {
    return validationRegex;
  }

  /**
   * Regular expression which can be used for parameter validation.
   * @param validationRegex validationRegex or {@code null} for none
   */
  public DataSourceParameter setValidationRegex(java.lang.String validationRegex) {
    this.validationRegex = validationRegex;
    return this;
  }

  @Override
  public DataSourceParameter set(String fieldName, Object value) {
    return (DataSourceParameter) super.set(fieldName, value);
  }

  @Override
  public DataSourceParameter clone() {
    return (DataSourceParameter) super.clone();
  }

}
