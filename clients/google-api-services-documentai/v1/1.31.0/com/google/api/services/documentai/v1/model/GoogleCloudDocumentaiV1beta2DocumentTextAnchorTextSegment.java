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

package com.google.api.services.documentai.v1.model;

/**
 * A text segment in the Document.text. The indices may be out of bounds which indicate that the
 * text extends into another document shard for large sharded documents. See ShardInfo.text_offset
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
public final class GoogleCloudDocumentaiV1beta2DocumentTextAnchorTextSegment extends com.google.api.client.json.GenericJson {

  /**
   * TextSegment half open end UTF-8 char index in the Document.text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endIndex;

  /**
   * TextSegment start UTF-8 char index in the Document.text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startIndex;

  /**
   * TextSegment half open end UTF-8 char index in the Document.text.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndIndex() {
    return endIndex;
  }

  /**
   * TextSegment half open end UTF-8 char index in the Document.text.
   * @param endIndex endIndex or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentTextAnchorTextSegment setEndIndex(java.lang.Long endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  /**
   * TextSegment start UTF-8 char index in the Document.text.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartIndex() {
    return startIndex;
  }

  /**
   * TextSegment start UTF-8 char index in the Document.text.
   * @param startIndex startIndex or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentTextAnchorTextSegment setStartIndex(java.lang.Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentTextAnchorTextSegment set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentTextAnchorTextSegment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentTextAnchorTextSegment clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentTextAnchorTextSegment) super.clone();
  }

}
