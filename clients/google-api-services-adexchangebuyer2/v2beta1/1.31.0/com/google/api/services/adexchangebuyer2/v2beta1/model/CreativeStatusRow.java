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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * The number of bids with the specified dimension values that did not win the auction (either were
 * filtered pre-auction or lost the auction), as described by the specified creative status.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreativeStatusRow extends com.google.api.client.json.GenericJson {

  /**
   * The number of bids with the specified status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue bidCount;

  /**
   * The ID of the creative status. See [creative-status-codes](https://developers.google.com
   * /authorized-buyers/rtb/downloads/creative-status-codes).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer creativeStatusId;

  /**
   * The values of all dimensions associated with metric values in this row.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RowDimensions rowDimensions;

  /**
   * The number of bids with the specified status.
   * @return value or {@code null} for none
   */
  public MetricValue getBidCount() {
    return bidCount;
  }

  /**
   * The number of bids with the specified status.
   * @param bidCount bidCount or {@code null} for none
   */
  public CreativeStatusRow setBidCount(MetricValue bidCount) {
    this.bidCount = bidCount;
    return this;
  }

  /**
   * The ID of the creative status. See [creative-status-codes](https://developers.google.com
   * /authorized-buyers/rtb/downloads/creative-status-codes).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCreativeStatusId() {
    return creativeStatusId;
  }

  /**
   * The ID of the creative status. See [creative-status-codes](https://developers.google.com
   * /authorized-buyers/rtb/downloads/creative-status-codes).
   * @param creativeStatusId creativeStatusId or {@code null} for none
   */
  public CreativeStatusRow setCreativeStatusId(java.lang.Integer creativeStatusId) {
    this.creativeStatusId = creativeStatusId;
    return this;
  }

  /**
   * The values of all dimensions associated with metric values in this row.
   * @return value or {@code null} for none
   */
  public RowDimensions getRowDimensions() {
    return rowDimensions;
  }

  /**
   * The values of all dimensions associated with metric values in this row.
   * @param rowDimensions rowDimensions or {@code null} for none
   */
  public CreativeStatusRow setRowDimensions(RowDimensions rowDimensions) {
    this.rowDimensions = rowDimensions;
    return this;
  }

  @Override
  public CreativeStatusRow set(String fieldName, Object value) {
    return (CreativeStatusRow) super.set(fieldName, value);
  }

  @Override
  public CreativeStatusRow clone() {
    return (CreativeStatusRow) super.clone();
  }

}
