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

package com.google.api.services.adsense.v2.model;

/**
 * Representation of the AdSense code for a given ad client. For more information, see [About the
 * AdSense code](https://support.google.com/adsense/answer/9274634).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdClientAdCode extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The AdSense code snippet to add to the head of an HTML page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adCode;

  /**
   * Output only. The AdSense code snippet to add to the body of an AMP page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ampBody;

  /**
   * Output only. The AdSense code snippet to add to the head of an AMP page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ampHead;

  /**
   * Output only. The AdSense code snippet to add to the head of an HTML page.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdCode() {
    return adCode;
  }

  /**
   * Output only. The AdSense code snippet to add to the head of an HTML page.
   * @param adCode adCode or {@code null} for none
   */
  public AdClientAdCode setAdCode(java.lang.String adCode) {
    this.adCode = adCode;
    return this;
  }

  /**
   * Output only. The AdSense code snippet to add to the body of an AMP page.
   * @return value or {@code null} for none
   */
  public java.lang.String getAmpBody() {
    return ampBody;
  }

  /**
   * Output only. The AdSense code snippet to add to the body of an AMP page.
   * @param ampBody ampBody or {@code null} for none
   */
  public AdClientAdCode setAmpBody(java.lang.String ampBody) {
    this.ampBody = ampBody;
    return this;
  }

  /**
   * Output only. The AdSense code snippet to add to the head of an AMP page.
   * @return value or {@code null} for none
   */
  public java.lang.String getAmpHead() {
    return ampHead;
  }

  /**
   * Output only. The AdSense code snippet to add to the head of an AMP page.
   * @param ampHead ampHead or {@code null} for none
   */
  public AdClientAdCode setAmpHead(java.lang.String ampHead) {
    this.ampHead = ampHead;
    return this;
  }

  @Override
  public AdClientAdCode set(String fieldName, Object value) {
    return (AdClientAdCode) super.set(fieldName, value);
  }

  @Override
  public AdClientAdCode clone() {
    return (AdClientAdCode) super.clone();
  }

}
