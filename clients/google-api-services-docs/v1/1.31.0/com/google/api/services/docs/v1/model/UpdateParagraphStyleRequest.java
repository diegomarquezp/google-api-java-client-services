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

package com.google.api.services.docs.v1.model;

/**
 * Update the styling of all paragraphs that overlap with the given range.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateParagraphStyleRequest extends com.google.api.client.json.GenericJson {

  /**
   * The fields that should be updated. At least one field must be specified. The root
   * `paragraph_style` is implied and should not be specified. A single `"*"` can be used as short-
   * hand for listing every field. For example, to update the paragraph style's alignment property,
   * set `fields` to `"alignment"`. To reset a property to its default value, include its field name
   * in the field mask but leave the field itself unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * The styles to set on the paragraphs. Certain paragraph style changes may cause other changes in
   * order to mirror the behavior of the Docs editor. See the documentation of ParagraphStyle for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParagraphStyle paragraphStyle;

  /**
   * The range overlapping the paragraphs to style.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Range range;

  /**
   * The fields that should be updated. At least one field must be specified. The root
   * `paragraph_style` is implied and should not be specified. A single `"*"` can be used as short-
   * hand for listing every field. For example, to update the paragraph style's alignment property,
   * set `fields` to `"alignment"`. To reset a property to its default value, include its field name
   * in the field mask but leave the field itself unset.
   * @return value or {@code null} for none
   */
  public String getFields() {
    return fields;
  }

  /**
   * The fields that should be updated. At least one field must be specified. The root
   * `paragraph_style` is implied and should not be specified. A single `"*"` can be used as short-
   * hand for listing every field. For example, to update the paragraph style's alignment property,
   * set `fields` to `"alignment"`. To reset a property to its default value, include its field name
   * in the field mask but leave the field itself unset.
   * @param fields fields or {@code null} for none
   */
  public UpdateParagraphStyleRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  /**
   * The styles to set on the paragraphs. Certain paragraph style changes may cause other changes in
   * order to mirror the behavior of the Docs editor. See the documentation of ParagraphStyle for
   * more information.
   * @return value or {@code null} for none
   */
  public ParagraphStyle getParagraphStyle() {
    return paragraphStyle;
  }

  /**
   * The styles to set on the paragraphs. Certain paragraph style changes may cause other changes in
   * order to mirror the behavior of the Docs editor. See the documentation of ParagraphStyle for
   * more information.
   * @param paragraphStyle paragraphStyle or {@code null} for none
   */
  public UpdateParagraphStyleRequest setParagraphStyle(ParagraphStyle paragraphStyle) {
    this.paragraphStyle = paragraphStyle;
    return this;
  }

  /**
   * The range overlapping the paragraphs to style.
   * @return value or {@code null} for none
   */
  public Range getRange() {
    return range;
  }

  /**
   * The range overlapping the paragraphs to style.
   * @param range range or {@code null} for none
   */
  public UpdateParagraphStyleRequest setRange(Range range) {
    this.range = range;
    return this;
  }

  @Override
  public UpdateParagraphStyleRequest set(String fieldName, Object value) {
    return (UpdateParagraphStyleRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateParagraphStyleRequest clone() {
    return (UpdateParagraphStyleRequest) super.clone();
  }

}
