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
 * Public API: Resources.buildings
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Building extends com.google.api.client.json.GenericJson {

  /**
   * The postal address of the building. See [`PostalAddress`](/my-
   * business/reference/rest/v4/PostalAddress) for details. Note that only a single address line and
   * region code are required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildingAddress address;

  /**
   * Unique identifier for the building. The maximum length is 100 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buildingId;

  /**
   * The building name as seen by users in Calendar. Must be unique for the customer. For example,
   * "NYC-CHEL". The maximum length is 100 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buildingName;

  /**
   * The geographic coordinates of the center of the building, expressed as latitude and longitude
   * in decimal degrees.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildingCoordinates coordinates;

  /**
   * A brief description of the building. For example, "Chelsea Market".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etags;

  /**
   * The display names for all floors in this building. The floors are expected to be sorted in
   * ascending order, from lowest floor to highest floor. For example, ["B2", "B1", "L", "1", "2",
   * "2M", "3", "PH"] Must contain at least one entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> floorNames;

  /**
   * Kind of resource this is.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The postal address of the building. See [`PostalAddress`](/my-
   * business/reference/rest/v4/PostalAddress) for details. Note that only a single address line and
   * region code are required.
   * @return value or {@code null} for none
   */
  public BuildingAddress getAddress() {
    return address;
  }

  /**
   * The postal address of the building. See [`PostalAddress`](/my-
   * business/reference/rest/v4/PostalAddress) for details. Note that only a single address line and
   * region code are required.
   * @param address address or {@code null} for none
   */
  public Building setAddress(BuildingAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Unique identifier for the building. The maximum length is 100 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuildingId() {
    return buildingId;
  }

  /**
   * Unique identifier for the building. The maximum length is 100 characters.
   * @param buildingId buildingId or {@code null} for none
   */
  public Building setBuildingId(java.lang.String buildingId) {
    this.buildingId = buildingId;
    return this;
  }

  /**
   * The building name as seen by users in Calendar. Must be unique for the customer. For example,
   * "NYC-CHEL". The maximum length is 100 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuildingName() {
    return buildingName;
  }

  /**
   * The building name as seen by users in Calendar. Must be unique for the customer. For example,
   * "NYC-CHEL". The maximum length is 100 characters.
   * @param buildingName buildingName or {@code null} for none
   */
  public Building setBuildingName(java.lang.String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  /**
   * The geographic coordinates of the center of the building, expressed as latitude and longitude
   * in decimal degrees.
   * @return value or {@code null} for none
   */
  public BuildingCoordinates getCoordinates() {
    return coordinates;
  }

  /**
   * The geographic coordinates of the center of the building, expressed as latitude and longitude
   * in decimal degrees.
   * @param coordinates coordinates or {@code null} for none
   */
  public Building setCoordinates(BuildingCoordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * A brief description of the building. For example, "Chelsea Market".
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A brief description of the building. For example, "Chelsea Market".
   * @param description description or {@code null} for none
   */
  public Building setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtags() {
    return etags;
  }

  /**
   * ETag of the resource.
   * @param etags etags or {@code null} for none
   */
  public Building setEtags(java.lang.String etags) {
    this.etags = etags;
    return this;
  }

  /**
   * The display names for all floors in this building. The floors are expected to be sorted in
   * ascending order, from lowest floor to highest floor. For example, ["B2", "B1", "L", "1", "2",
   * "2M", "3", "PH"] Must contain at least one entry.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFloorNames() {
    return floorNames;
  }

  /**
   * The display names for all floors in this building. The floors are expected to be sorted in
   * ascending order, from lowest floor to highest floor. For example, ["B2", "B1", "L", "1", "2",
   * "2M", "3", "PH"] Must contain at least one entry.
   * @param floorNames floorNames or {@code null} for none
   */
  public Building setFloorNames(java.util.List<java.lang.String> floorNames) {
    this.floorNames = floorNames;
    return this;
  }

  /**
   * Kind of resource this is.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of resource this is.
   * @param kind kind or {@code null} for none
   */
  public Building setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public Building set(String fieldName, Object value) {
    return (Building) super.set(fieldName, value);
  }

  @Override
  public Building clone() {
    return (Building) super.clone();
  }

}
