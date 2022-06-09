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

package com.google.api.services.dfareporting.model;

/**
 * Skippable Settings
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SiteSkippableSetting extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#siteSkippableSetting".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Amount of time to play videos served to this site template before counting a view. Applicable
   * when skippable is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoOffset progressOffset;

  /**
   * Amount of time to play videos served to this site before the skip button should appear.
   * Applicable when skippable is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoOffset skipOffset;

  /**
   * Whether the user can skip creatives served to this site. This will act as default for new
   * placements created under this site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean skippable;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#siteSkippableSetting".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#siteSkippableSetting".
   * @param kind kind or {@code null} for none
   */
  public SiteSkippableSetting setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Amount of time to play videos served to this site template before counting a view. Applicable
   * when skippable is true.
   * @return value or {@code null} for none
   */
  public VideoOffset getProgressOffset() {
    return progressOffset;
  }

  /**
   * Amount of time to play videos served to this site template before counting a view. Applicable
   * when skippable is true.
   * @param progressOffset progressOffset or {@code null} for none
   */
  public SiteSkippableSetting setProgressOffset(VideoOffset progressOffset) {
    this.progressOffset = progressOffset;
    return this;
  }

  /**
   * Amount of time to play videos served to this site before the skip button should appear.
   * Applicable when skippable is true.
   * @return value or {@code null} for none
   */
  public VideoOffset getSkipOffset() {
    return skipOffset;
  }

  /**
   * Amount of time to play videos served to this site before the skip button should appear.
   * Applicable when skippable is true.
   * @param skipOffset skipOffset or {@code null} for none
   */
  public SiteSkippableSetting setSkipOffset(VideoOffset skipOffset) {
    this.skipOffset = skipOffset;
    return this;
  }

  /**
   * Whether the user can skip creatives served to this site. This will act as default for new
   * placements created under this site.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSkippable() {
    return skippable;
  }

  /**
   * Whether the user can skip creatives served to this site. This will act as default for new
   * placements created under this site.
   * @param skippable skippable or {@code null} for none
   */
  public SiteSkippableSetting setSkippable(java.lang.Boolean skippable) {
    this.skippable = skippable;
    return this;
  }

  @Override
  public SiteSkippableSetting set(String fieldName, Object value) {
    return (SiteSkippableSetting) super.set(fieldName, value);
  }

  @Override
  public SiteSkippableSetting clone() {
    return (SiteSkippableSetting) super.clone();
  }

}
