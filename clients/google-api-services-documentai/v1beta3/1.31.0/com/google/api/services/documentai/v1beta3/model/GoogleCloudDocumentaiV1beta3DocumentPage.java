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

package com.google.api.services.documentai.v1beta3.model;

/**
 * A page in a Document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta3DocumentPage extends com.google.api.client.json.GenericJson {

  /**
   * A list of visually detected text blocks on the page. A block has a set of lines (collected into
   * paragraphs) that have a common line-spacing and orientation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageBlock> blocks;

  /**
   * A list of detected languages together with confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageDetectedLanguage> detectedLanguages;

  /**
   * Physical dimension of the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3DocumentPageDimension dimension;

  /**
   * A list of visually detected form fields on the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageFormField> formFields;

  /**
   * Rendered image for this page. This image is preprocessed to remove any skew, rotation, and
   * distortions such that the annotation bounding boxes can be upright and axis-aligned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3DocumentPageImage image;

  /**
   * Layout for the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3DocumentPageLayout layout;

  /**
   * A list of visually detected text lines on the page. A collection of tokens that a human would
   * perceive as a line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageLine> lines;

  /**
   * 1-based index for current Page in a parent Document. Useful when a page is taken out of a
   * Document for individual processing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageNumber;

  /**
   * A list of visually detected text paragraphs on the page. A collection of lines that a human
   * would perceive as a paragraph.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageParagraph> paragraphs;

  /**
   * The history of this page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3DocumentProvenance provenance;

  /**
   * A list of visually detected symbols on the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageSymbol> symbols;

  /**
   * A list of visually detected tables on the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageTable> tables;

  /**
   * A list of visually detected tokens on the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageToken> tokens;

  /**
   * Transformation matrices that were applied to the original document image to produce Page.image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageMatrix> transforms;

  /**
   * A list of detected non-text visual elements e.g. checkbox, signature etc. on the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageVisualElement> visualElements;

  /**
   * A list of visually detected text blocks on the page. A block has a set of lines (collected into
   * paragraphs) that have a common line-spacing and orientation.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageBlock> getBlocks() {
    return blocks;
  }

  /**
   * A list of visually detected text blocks on the page. A block has a set of lines (collected into
   * paragraphs) that have a common line-spacing and orientation.
   * @param blocks blocks or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setBlocks(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageBlock> blocks) {
    this.blocks = blocks;
    return this;
  }

  /**
   * A list of detected languages together with confidence.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageDetectedLanguage> getDetectedLanguages() {
    return detectedLanguages;
  }

  /**
   * A list of detected languages together with confidence.
   * @param detectedLanguages detectedLanguages or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setDetectedLanguages(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageDetectedLanguage> detectedLanguages) {
    this.detectedLanguages = detectedLanguages;
    return this;
  }

  /**
   * Physical dimension of the page.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPageDimension getDimension() {
    return dimension;
  }

  /**
   * Physical dimension of the page.
   * @param dimension dimension or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setDimension(GoogleCloudDocumentaiV1beta3DocumentPageDimension dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * A list of visually detected form fields on the page.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageFormField> getFormFields() {
    return formFields;
  }

  /**
   * A list of visually detected form fields on the page.
   * @param formFields formFields or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setFormFields(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageFormField> formFields) {
    this.formFields = formFields;
    return this;
  }

  /**
   * Rendered image for this page. This image is preprocessed to remove any skew, rotation, and
   * distortions such that the annotation bounding boxes can be upright and axis-aligned.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPageImage getImage() {
    return image;
  }

  /**
   * Rendered image for this page. This image is preprocessed to remove any skew, rotation, and
   * distortions such that the annotation bounding boxes can be upright and axis-aligned.
   * @param image image or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setImage(GoogleCloudDocumentaiV1beta3DocumentPageImage image) {
    this.image = image;
    return this;
  }

  /**
   * Layout for the page.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPageLayout getLayout() {
    return layout;
  }

  /**
   * Layout for the page.
   * @param layout layout or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setLayout(GoogleCloudDocumentaiV1beta3DocumentPageLayout layout) {
    this.layout = layout;
    return this;
  }

  /**
   * A list of visually detected text lines on the page. A collection of tokens that a human would
   * perceive as a line.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageLine> getLines() {
    return lines;
  }

  /**
   * A list of visually detected text lines on the page. A collection of tokens that a human would
   * perceive as a line.
   * @param lines lines or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setLines(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageLine> lines) {
    this.lines = lines;
    return this;
  }

  /**
   * 1-based index for current Page in a parent Document. Useful when a page is taken out of a
   * Document for individual processing.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageNumber() {
    return pageNumber;
  }

  /**
   * 1-based index for current Page in a parent Document. Useful when a page is taken out of a
   * Document for individual processing.
   * @param pageNumber pageNumber or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setPageNumber(java.lang.Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * A list of visually detected text paragraphs on the page. A collection of lines that a human
   * would perceive as a paragraph.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageParagraph> getParagraphs() {
    return paragraphs;
  }

  /**
   * A list of visually detected text paragraphs on the page. A collection of lines that a human
   * would perceive as a paragraph.
   * @param paragraphs paragraphs or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setParagraphs(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageParagraph> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  /**
   * The history of this page.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentProvenance getProvenance() {
    return provenance;
  }

  /**
   * The history of this page.
   * @param provenance provenance or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setProvenance(GoogleCloudDocumentaiV1beta3DocumentProvenance provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * A list of visually detected symbols on the page.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageSymbol> getSymbols() {
    return symbols;
  }

  /**
   * A list of visually detected symbols on the page.
   * @param symbols symbols or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setSymbols(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageSymbol> symbols) {
    this.symbols = symbols;
    return this;
  }

  /**
   * A list of visually detected tables on the page.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageTable> getTables() {
    return tables;
  }

  /**
   * A list of visually detected tables on the page.
   * @param tables tables or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setTables(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageTable> tables) {
    this.tables = tables;
    return this;
  }

  /**
   * A list of visually detected tokens on the page.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageToken> getTokens() {
    return tokens;
  }

  /**
   * A list of visually detected tokens on the page.
   * @param tokens tokens or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setTokens(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageToken> tokens) {
    this.tokens = tokens;
    return this;
  }

  /**
   * Transformation matrices that were applied to the original document image to produce Page.image.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageMatrix> getTransforms() {
    return transforms;
  }

  /**
   * Transformation matrices that were applied to the original document image to produce Page.image.
   * @param transforms transforms or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setTransforms(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageMatrix> transforms) {
    this.transforms = transforms;
    return this;
  }

  /**
   * A list of detected non-text visual elements e.g. checkbox, signature etc. on the page.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageVisualElement> getVisualElements() {
    return visualElements;
  }

  /**
   * A list of detected non-text visual elements e.g. checkbox, signature etc. on the page.
   * @param visualElements visualElements or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentPage setVisualElements(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPageVisualElement> visualElements) {
    this.visualElements = visualElements;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta3DocumentPage set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta3DocumentPage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta3DocumentPage clone() {
    return (GoogleCloudDocumentaiV1beta3DocumentPage) super.clone();
  }

}
