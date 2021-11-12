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

package com.google.api.services.datacatalog.v1.model;

/**
 * The criteria that select the subspace used for query matching.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1SearchCatalogRequestScope extends com.google.api.client.json.GenericJson {

  /**
   * If `true`, include Google Cloud Platform (GCP) public datasets in search results. By default,
   * they are excluded. See [Google Cloud Public Datasets](/public-datasets) for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeGcpPublicDatasets;

  /**
   * The list of organization IDs to search within. To find your organization ID, follow the steps
   * from [Creating and managing organizations] (/resource-manager/docs/creating-managing-
   * organization).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includeOrgIds;

  /**
   * The list of project IDs to search within. For more information on the distinction between
   * project names, IDs, and numbers, see [Projects](/docs/overview/#projects).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includeProjectIds;

  /**
   * Optional. If `true`, include public tag templates in the search results. By default, they are
   * included only if you have explicit permissions on them to view them. For example, if you are
   * the owner. Other scope fields, for example, `include_org_ids`, still restrict the returned
   * public tag templates and at least one of them is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includePublicTagTemplates;

  /**
   * Optional. The list of locations to search within. If empty, all locations are searched. Returns
   * an error if any location in the list isn't one of the [Supported
   * regions](https://cloud.google.com/data-catalog/docs/concepts/regions#supported_regions). If a
   * location is unreachable, its name is returned in the `SearchCatalogResponse.unreachable` field.
   * To get additional information on the error, repeat the search request and set the location name
   * as the value of this parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> restrictedLocations;

  /**
   * If `true`, include Google Cloud Platform (GCP) public datasets in search results. By default,
   * they are excluded. See [Google Cloud Public Datasets](/public-datasets) for more information.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeGcpPublicDatasets() {
    return includeGcpPublicDatasets;
  }

  /**
   * If `true`, include Google Cloud Platform (GCP) public datasets in search results. By default,
   * they are excluded. See [Google Cloud Public Datasets](/public-datasets) for more information.
   * @param includeGcpPublicDatasets includeGcpPublicDatasets or {@code null} for none
   */
  public GoogleCloudDatacatalogV1SearchCatalogRequestScope setIncludeGcpPublicDatasets(java.lang.Boolean includeGcpPublicDatasets) {
    this.includeGcpPublicDatasets = includeGcpPublicDatasets;
    return this;
  }

  /**
   * The list of organization IDs to search within. To find your organization ID, follow the steps
   * from [Creating and managing organizations] (/resource-manager/docs/creating-managing-
   * organization).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludeOrgIds() {
    return includeOrgIds;
  }

  /**
   * The list of organization IDs to search within. To find your organization ID, follow the steps
   * from [Creating and managing organizations] (/resource-manager/docs/creating-managing-
   * organization).
   * @param includeOrgIds includeOrgIds or {@code null} for none
   */
  public GoogleCloudDatacatalogV1SearchCatalogRequestScope setIncludeOrgIds(java.util.List<java.lang.String> includeOrgIds) {
    this.includeOrgIds = includeOrgIds;
    return this;
  }

  /**
   * The list of project IDs to search within. For more information on the distinction between
   * project names, IDs, and numbers, see [Projects](/docs/overview/#projects).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludeProjectIds() {
    return includeProjectIds;
  }

  /**
   * The list of project IDs to search within. For more information on the distinction between
   * project names, IDs, and numbers, see [Projects](/docs/overview/#projects).
   * @param includeProjectIds includeProjectIds or {@code null} for none
   */
  public GoogleCloudDatacatalogV1SearchCatalogRequestScope setIncludeProjectIds(java.util.List<java.lang.String> includeProjectIds) {
    this.includeProjectIds = includeProjectIds;
    return this;
  }

  /**
   * Optional. If `true`, include public tag templates in the search results. By default, they are
   * included only if you have explicit permissions on them to view them. For example, if you are
   * the owner. Other scope fields, for example, `include_org_ids`, still restrict the returned
   * public tag templates and at least one of them is required.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludePublicTagTemplates() {
    return includePublicTagTemplates;
  }

  /**
   * Optional. If `true`, include public tag templates in the search results. By default, they are
   * included only if you have explicit permissions on them to view them. For example, if you are
   * the owner. Other scope fields, for example, `include_org_ids`, still restrict the returned
   * public tag templates and at least one of them is required.
   * @param includePublicTagTemplates includePublicTagTemplates or {@code null} for none
   */
  public GoogleCloudDatacatalogV1SearchCatalogRequestScope setIncludePublicTagTemplates(java.lang.Boolean includePublicTagTemplates) {
    this.includePublicTagTemplates = includePublicTagTemplates;
    return this;
  }

  /**
   * Optional. The list of locations to search within. If empty, all locations are searched. Returns
   * an error if any location in the list isn't one of the [Supported
   * regions](https://cloud.google.com/data-catalog/docs/concepts/regions#supported_regions). If a
   * location is unreachable, its name is returned in the `SearchCatalogResponse.unreachable` field.
   * To get additional information on the error, repeat the search request and set the location name
   * as the value of this parameter.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRestrictedLocations() {
    return restrictedLocations;
  }

  /**
   * Optional. The list of locations to search within. If empty, all locations are searched. Returns
   * an error if any location in the list isn't one of the [Supported
   * regions](https://cloud.google.com/data-catalog/docs/concepts/regions#supported_regions). If a
   * location is unreachable, its name is returned in the `SearchCatalogResponse.unreachable` field.
   * To get additional information on the error, repeat the search request and set the location name
   * as the value of this parameter.
   * @param restrictedLocations restrictedLocations or {@code null} for none
   */
  public GoogleCloudDatacatalogV1SearchCatalogRequestScope setRestrictedLocations(java.util.List<java.lang.String> restrictedLocations) {
    this.restrictedLocations = restrictedLocations;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1SearchCatalogRequestScope set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1SearchCatalogRequestScope) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1SearchCatalogRequestScope clone() {
    return (GoogleCloudDatacatalogV1SearchCatalogRequestScope) super.clone();
  }

}
