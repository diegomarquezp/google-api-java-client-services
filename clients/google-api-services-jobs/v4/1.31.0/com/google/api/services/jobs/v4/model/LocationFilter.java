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

package com.google.api.services.jobs.v4.model;

/**
 * Geographic region of the search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LocationFilter extends com.google.api.client.json.GenericJson {

  /**
   * The address name, such as "Mountain View" or "Bay Area".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The distance_in_miles is applied when the location being searched for is identified as a city
   * or smaller. This field is ignored if the location being searched for is a state or larger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double distanceInMiles;

  /**
   * The latitude and longitude of the geographic center to search from. This field is ignored if
   * `address` is provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatLng latLng;

  /**
   * CLDR region code of the country/region. This field may be used in two ways: 1) If telecommute
   * preference is not set, this field is used address ambiguity of the user-input address. For
   * example, "Liverpool" may refer to "Liverpool, NY, US" or "Liverpool, UK". This region code
   * biases the address resolution toward a specific country or territory. If this field is not set,
   * address resolution is biased toward the United States by default. 2) If telecommute preference
   * is set to TELECOMMUTE_ALLOWED, the telecommute location filter will be limited to the region
   * specified in this field. If this field is not set, the telecommute job locations will not be
   * See https://unicode-org.github.io/cldr-
   * staging/charts/latest/supplemental/territory_information.html for details. Example: "CH" for
   * Switzerland.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Allows the client to return jobs without a set location, specifically, telecommuting jobs
   * (telecommuting is considered by the service as a special location. Job.posting_region indicates
   * if a job permits telecommuting. If this field is set to
   * TelecommutePreference.TELECOMMUTE_ALLOWED, telecommuting jobs are searched, and address and
   * lat_lng are ignored. If not set or set to TelecommutePreference.TELECOMMUTE_EXCLUDED,
   * telecommute job are not searched. This filter can be used by itself to search exclusively for
   * telecommuting jobs, or it can be combined with another location filter to search for a
   * combination of job locations, such as "Mountain View" or "telecommuting" jobs. However, when
   * used in combination with other location filters, telecommuting jobs can be treated as less
   * relevant than other jobs in the search response. This field is only used for job search
   * requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String telecommutePreference;

  /**
   * The address name, such as "Mountain View" or "Bay Area".
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * The address name, such as "Mountain View" or "Bay Area".
   * @param address address or {@code null} for none
   */
  public LocationFilter setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * The distance_in_miles is applied when the location being searched for is identified as a city
   * or smaller. This field is ignored if the location being searched for is a state or larger.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDistanceInMiles() {
    return distanceInMiles;
  }

  /**
   * The distance_in_miles is applied when the location being searched for is identified as a city
   * or smaller. This field is ignored if the location being searched for is a state or larger.
   * @param distanceInMiles distanceInMiles or {@code null} for none
   */
  public LocationFilter setDistanceInMiles(java.lang.Double distanceInMiles) {
    this.distanceInMiles = distanceInMiles;
    return this;
  }

  /**
   * The latitude and longitude of the geographic center to search from. This field is ignored if
   * `address` is provided.
   * @return value or {@code null} for none
   */
  public LatLng getLatLng() {
    return latLng;
  }

  /**
   * The latitude and longitude of the geographic center to search from. This field is ignored if
   * `address` is provided.
   * @param latLng latLng or {@code null} for none
   */
  public LocationFilter setLatLng(LatLng latLng) {
    this.latLng = latLng;
    return this;
  }

  /**
   * CLDR region code of the country/region. This field may be used in two ways: 1) If telecommute
   * preference is not set, this field is used address ambiguity of the user-input address. For
   * example, "Liverpool" may refer to "Liverpool, NY, US" or "Liverpool, UK". This region code
   * biases the address resolution toward a specific country or territory. If this field is not set,
   * address resolution is biased toward the United States by default. 2) If telecommute preference
   * is set to TELECOMMUTE_ALLOWED, the telecommute location filter will be limited to the region
   * specified in this field. If this field is not set, the telecommute job locations will not be
   * See https://unicode-org.github.io/cldr-
   * staging/charts/latest/supplemental/territory_information.html for details. Example: "CH" for
   * Switzerland.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * CLDR region code of the country/region. This field may be used in two ways: 1) If telecommute
   * preference is not set, this field is used address ambiguity of the user-input address. For
   * example, "Liverpool" may refer to "Liverpool, NY, US" or "Liverpool, UK". This region code
   * biases the address resolution toward a specific country or territory. If this field is not set,
   * address resolution is biased toward the United States by default. 2) If telecommute preference
   * is set to TELECOMMUTE_ALLOWED, the telecommute location filter will be limited to the region
   * specified in this field. If this field is not set, the telecommute job locations will not be
   * See https://unicode-org.github.io/cldr-
   * staging/charts/latest/supplemental/territory_information.html for details. Example: "CH" for
   * Switzerland.
   * @param regionCode regionCode or {@code null} for none
   */
  public LocationFilter setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Allows the client to return jobs without a set location, specifically, telecommuting jobs
   * (telecommuting is considered by the service as a special location. Job.posting_region indicates
   * if a job permits telecommuting. If this field is set to
   * TelecommutePreference.TELECOMMUTE_ALLOWED, telecommuting jobs are searched, and address and
   * lat_lng are ignored. If not set or set to TelecommutePreference.TELECOMMUTE_EXCLUDED,
   * telecommute job are not searched. This filter can be used by itself to search exclusively for
   * telecommuting jobs, or it can be combined with another location filter to search for a
   * combination of job locations, such as "Mountain View" or "telecommuting" jobs. However, when
   * used in combination with other location filters, telecommuting jobs can be treated as less
   * relevant than other jobs in the search response. This field is only used for job search
   * requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getTelecommutePreference() {
    return telecommutePreference;
  }

  /**
   * Allows the client to return jobs without a set location, specifically, telecommuting jobs
   * (telecommuting is considered by the service as a special location. Job.posting_region indicates
   * if a job permits telecommuting. If this field is set to
   * TelecommutePreference.TELECOMMUTE_ALLOWED, telecommuting jobs are searched, and address and
   * lat_lng are ignored. If not set or set to TelecommutePreference.TELECOMMUTE_EXCLUDED,
   * telecommute job are not searched. This filter can be used by itself to search exclusively for
   * telecommuting jobs, or it can be combined with another location filter to search for a
   * combination of job locations, such as "Mountain View" or "telecommuting" jobs. However, when
   * used in combination with other location filters, telecommuting jobs can be treated as less
   * relevant than other jobs in the search response. This field is only used for job search
   * requests.
   * @param telecommutePreference telecommutePreference or {@code null} for none
   */
  public LocationFilter setTelecommutePreference(java.lang.String telecommutePreference) {
    this.telecommutePreference = telecommutePreference;
    return this;
  }

  @Override
  public LocationFilter set(String fieldName, Object value) {
    return (LocationFilter) super.set(fieldName, value);
  }

  @Override
  public LocationFilter clone() {
    return (LocationFilter) super.clone();
  }

}
