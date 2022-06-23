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

package com.google.api.services.retail.v2beta.model;

/**
 * Catalog level attribute config for an attribute. For example, if customers want to enable/disable
 * facet for a specific attribute.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaCatalogAttribute extends com.google.api.client.json.GenericJson {

  /**
   * If DYNAMIC_FACETABLE_ENABLED, attribute values are available for dynamic facet. Could only be
   * DYNAMIC_FACETABLE_DISABLED if CatalogAttribute.indexable_option is INDEXABLE_DISABLED.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dynamicFacetableOption;

  /**
   * Output only. Indicates whether this attribute has been used by any products. `True` if at least
   * one Product is using this attribute in Product.attributes. Otherwise, this field is `False`.
   * CatalogAttribute can be pre-loaded by using CatalogService.AddCatalogAttribute,
   * CatalogService.ImportCatalogAttributes, or CatalogService.UpdateAttributesConfig APIs. This
   * field is `False` for pre-loaded CatalogAttributes. Only CatalogAttributes that are not in use
   * by products can be deleted. CatalogAttributes that are in use by products cannot be deleted;
   * however, their configuration properties will reset to default values upon removal request.
   * After catalog changes, it takes about 10 minutes for this field to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean inUse;

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * INDEXABLE_ENABLED attribute values are indexed so that it can be filtered, faceted, or boosted
   * in SearchService.Search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String indexableOption;

  /**
   * Required. Attribute name. For example: `color`, `brands`, `attributes.custom_attribute`, such
   * as `attributes.xyz`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * RECOMMENDATIONS_FILTERING_ENABLED, attribute values are filterable for recommendations. This
   * option works for categorical features only, does not work for numerical features, inventory
   * filtering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recommendationsFilteringOption;

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * SEARCHABLE_ENABLED, attribute values are searchable by text queries in SearchService.Search. If
   * SEARCHABLE_ENABLED but attribute type is numerical, attribute values will not be searchable by
   * text queries in SearchService.Search, as there are no text values associated to numerical
   * attributes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchableOption;

  /**
   * Output only. The type of this attribute. This is derived from the attribute in
   * Product.attributes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * If DYNAMIC_FACETABLE_ENABLED, attribute values are available for dynamic facet. Could only be
   * DYNAMIC_FACETABLE_DISABLED if CatalogAttribute.indexable_option is INDEXABLE_DISABLED.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getDynamicFacetableOption() {
    return dynamicFacetableOption;
  }

  /**
   * If DYNAMIC_FACETABLE_ENABLED, attribute values are available for dynamic facet. Could only be
   * DYNAMIC_FACETABLE_DISABLED if CatalogAttribute.indexable_option is INDEXABLE_DISABLED.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * @param dynamicFacetableOption dynamicFacetableOption or {@code null} for none
   */
  public GoogleCloudRetailV2betaCatalogAttribute setDynamicFacetableOption(java.lang.String dynamicFacetableOption) {
    this.dynamicFacetableOption = dynamicFacetableOption;
    return this;
  }

  /**
   * Output only. Indicates whether this attribute has been used by any products. `True` if at least
   * one Product is using this attribute in Product.attributes. Otherwise, this field is `False`.
   * CatalogAttribute can be pre-loaded by using CatalogService.AddCatalogAttribute,
   * CatalogService.ImportCatalogAttributes, or CatalogService.UpdateAttributesConfig APIs. This
   * field is `False` for pre-loaded CatalogAttributes. Only CatalogAttributes that are not in use
   * by products can be deleted. CatalogAttributes that are in use by products cannot be deleted;
   * however, their configuration properties will reset to default values upon removal request.
   * After catalog changes, it takes about 10 minutes for this field to update.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInUse() {
    return inUse;
  }

  /**
   * Output only. Indicates whether this attribute has been used by any products. `True` if at least
   * one Product is using this attribute in Product.attributes. Otherwise, this field is `False`.
   * CatalogAttribute can be pre-loaded by using CatalogService.AddCatalogAttribute,
   * CatalogService.ImportCatalogAttributes, or CatalogService.UpdateAttributesConfig APIs. This
   * field is `False` for pre-loaded CatalogAttributes. Only CatalogAttributes that are not in use
   * by products can be deleted. CatalogAttributes that are in use by products cannot be deleted;
   * however, their configuration properties will reset to default values upon removal request.
   * After catalog changes, it takes about 10 minutes for this field to update.
   * @param inUse inUse or {@code null} for none
   */
  public GoogleCloudRetailV2betaCatalogAttribute setInUse(java.lang.Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * INDEXABLE_ENABLED attribute values are indexed so that it can be filtered, faceted, or boosted
   * in SearchService.Search.
   * @return value or {@code null} for none
   */
  public java.lang.String getIndexableOption() {
    return indexableOption;
  }

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * INDEXABLE_ENABLED attribute values are indexed so that it can be filtered, faceted, or boosted
   * in SearchService.Search.
   * @param indexableOption indexableOption or {@code null} for none
   */
  public GoogleCloudRetailV2betaCatalogAttribute setIndexableOption(java.lang.String indexableOption) {
    this.indexableOption = indexableOption;
    return this;
  }

  /**
   * Required. Attribute name. For example: `color`, `brands`, `attributes.custom_attribute`, such
   * as `attributes.xyz`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Required. Attribute name. For example: `color`, `brands`, `attributes.custom_attribute`, such
   * as `attributes.xyz`.
   * @param key key or {@code null} for none
   */
  public GoogleCloudRetailV2betaCatalogAttribute setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * RECOMMENDATIONS_FILTERING_ENABLED, attribute values are filterable for recommendations. This
   * option works for categorical features only, does not work for numerical features, inventory
   * filtering.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecommendationsFilteringOption() {
    return recommendationsFilteringOption;
  }

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * RECOMMENDATIONS_FILTERING_ENABLED, attribute values are filterable for recommendations. This
   * option works for categorical features only, does not work for numerical features, inventory
   * filtering.
   * @param recommendationsFilteringOption recommendationsFilteringOption or {@code null} for none
   */
  public GoogleCloudRetailV2betaCatalogAttribute setRecommendationsFilteringOption(java.lang.String recommendationsFilteringOption) {
    this.recommendationsFilteringOption = recommendationsFilteringOption;
    return this;
  }

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * SEARCHABLE_ENABLED, attribute values are searchable by text queries in SearchService.Search. If
   * SEARCHABLE_ENABLED but attribute type is numerical, attribute values will not be searchable by
   * text queries in SearchService.Search, as there are no text values associated to numerical
   * attributes.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchableOption() {
    return searchableOption;
  }

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * SEARCHABLE_ENABLED, attribute values are searchable by text queries in SearchService.Search. If
   * SEARCHABLE_ENABLED but attribute type is numerical, attribute values will not be searchable by
   * text queries in SearchService.Search, as there are no text values associated to numerical
   * attributes.
   * @param searchableOption searchableOption or {@code null} for none
   */
  public GoogleCloudRetailV2betaCatalogAttribute setSearchableOption(java.lang.String searchableOption) {
    this.searchableOption = searchableOption;
    return this;
  }

  /**
   * Output only. The type of this attribute. This is derived from the attribute in
   * Product.attributes.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Output only. The type of this attribute. This is derived from the attribute in
   * Product.attributes.
   * @param type type or {@code null} for none
   */
  public GoogleCloudRetailV2betaCatalogAttribute setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaCatalogAttribute set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaCatalogAttribute) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaCatalogAttribute clone() {
    return (GoogleCloudRetailV2betaCatalogAttribute) super.clone();
  }

}
