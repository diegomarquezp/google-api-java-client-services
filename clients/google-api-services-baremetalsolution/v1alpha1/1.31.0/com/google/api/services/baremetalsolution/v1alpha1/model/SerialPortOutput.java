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

package com.google.api.services.baremetalsolution.v1alpha1.model;

/**
 * Response for ReadSerialPortOutput.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Bare Metal Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SerialPortOutput extends com.google.api.client.json.GenericJson {

  /**
   * The serial port output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contents;

  /**
   * The byte index to use in a subsequent call to ReadSerialPortOutput to get more output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long nextStartByte;

  /**
   * The start byte index of the included contents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long start;

  /**
   * The serial port output.
   * @return value or {@code null} for none
   */
  public java.lang.String getContents() {
    return contents;
  }

  /**
   * The serial port output.
   * @param contents contents or {@code null} for none
   */
  public SerialPortOutput setContents(java.lang.String contents) {
    this.contents = contents;
    return this;
  }

  /**
   * The byte index to use in a subsequent call to ReadSerialPortOutput to get more output.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNextStartByte() {
    return nextStartByte;
  }

  /**
   * The byte index to use in a subsequent call to ReadSerialPortOutput to get more output.
   * @param nextStartByte nextStartByte or {@code null} for none
   */
  public SerialPortOutput setNextStartByte(java.lang.Long nextStartByte) {
    this.nextStartByte = nextStartByte;
    return this;
  }

  /**
   * The start byte index of the included contents.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStart() {
    return start;
  }

  /**
   * The start byte index of the included contents.
   * @param start start or {@code null} for none
   */
  public SerialPortOutput setStart(java.lang.Long start) {
    this.start = start;
    return this;
  }

  @Override
  public SerialPortOutput set(String fieldName, Object value) {
    return (SerialPortOutput) super.set(fieldName, value);
  }

  @Override
  public SerialPortOutput clone() {
    return (SerialPortOutput) super.clone();
  }

}
