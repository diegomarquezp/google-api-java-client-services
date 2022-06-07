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

package com.google.api.services.securitycenter.v1beta1.model;

/**
 * Security Command Center finding. A finding is a record of assessment data like security, risk,
 * health, or privacy, that is ingested into Security Command Center for presentation, notification,
 * analysis, policy testing, and enforcement. For example, a cross-site scripting (XSS)
 * vulnerability in an App Engine application is a finding.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Finding extends com.google.api.client.json.GenericJson {

  /**
   * Access details associated to the Finding, such as more information on the caller, which method
   * was accessed, from where, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Access access;

  /**
   * The canonical name of the finding. It's either
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}",
   * "folders/{folder_id}/sources/{source_id}/findings/{finding_id}" or
   * "projects/{project_number}/sources/{source_id}/findings/{finding_id}", depending on the closest
   * CRM ancestor of the resource associated with the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canonicalName;

  /**
   * The additional taxonomy group within findings from a given source. This field is immutable
   * after creation time. Example: "XSS_FLASH_INJECTION"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * Contains compliance information for security standards associated to the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Compliance> compliances;

  static {
    // hack to force ProGuard to consider Compliance used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Compliance.class);
  }

  /**
   * Contains information about the IP connection associated with the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Connection> connections;

  static {
    // hack to force ProGuard to consider Connection used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Connection.class);
  }

  /**
   * Output only. Map containing the point of contacts for the given finding. The key represents the
   * type of contact, while the value contains a list of all the contacts that pertain. Please refer
   * to: https://cloud.google.com/resource-manager/docs/managing-notification-contacts#notification-
   * categories { “security”: {contact: {email: “person1@company.com”} contact: {email:
   * “person2@company.com”} }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ContactDetails> contacts;

  static {
    // hack to force ProGuard to consider ContactDetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContactDetails.class);
  }

  /**
   * The time at which the finding was created in Security Command Center.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Contains more detail about the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The time the finding was first detected. If an existing finding is updated, then this is the
   * time the update occurred. For example, if the finding represents an open firewall, this
   * property captures the time the detector believes the firewall became open. The accuracy is
   * determined by the detector. If the finding is later resolved, then this time reflects when the
   * finding was resolved. This must not be set to a value greater than the current timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * Represents exfiltration associated with the Finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Exfiltration exfiltration;

  /**
   * Output only. Third party SIEM/SOAR fields within SCC, contains external system information and
   * external system finding fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudSecuritycenterV1ExternalSystem> externalSystems;

  /**
   * The URI that, if available, points to a web page outside of Security Command Center where
   * additional information about the finding can be found. This field is guaranteed to be either
   * empty or a well formed URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalUri;

  /**
   * The class of the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String findingClass;

  /**
   * Represents IAM bindings associated with the Finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IamBinding> iamBindings;

  /**
   * Represents what's commonly known as an Indicator of compromise (IoC) in computer forensics.
   * This is an artifact observed on a network or in an operating system that, with high confidence,
   * indicates a computer intrusion. Reference:
   * https://en.wikipedia.org/wiki/Indicator_of_compromise
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Indicator indicator;

  /**
   * MITRE ATT tactics and techniques related to this finding. See: https://attack.mitre.org
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MitreAttack mitreAttack;

  /**
   * Indicates the mute state of a finding (either muted, unmuted or undefined). Unlike other
   * attributes of a finding, a finding provider shouldn't set the value of mute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mute;

  /**
   * First known as mute_annotation. Records additional information about the mute operation e.g.
   * mute config that muted the finding, user who muted the finding, etc. Unlike other attributes of
   * a finding, a finding provider shouldn't set the value of mute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String muteInitiator;

  /**
   * Output only. The most recent time this finding was muted or unmuted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String muteUpdateTime;

  /**
   * The relative resource name of this finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Next steps associate to the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextSteps;

  /**
   * The relative resource name of the source the finding belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name This field is
   * immutable after creation time. For example:
   * "organizations/{organization_id}/sources/{source_id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Represents operating system processes associated with the Finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Process> processes;

  /**
   * For findings on Google Cloud resources, the full resource name of the Google Cloud resource
   * this finding is for. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name When the finding is for
   * a non-Google Cloud resource, the resourceName can be a customer or partner defined string. This
   * field is immutable after creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * Output only. User specified security marks. These marks are entirely managed by the user and
   * come from the SecurityMarks resource that belongs to the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityMarks securityMarks;

  /**
   * The severity of the finding. This field is managed by the source that writes the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Source specific properties. These properties are managed by the source that writes the finding.
   * The key names in the source_properties map must be between 1 and 255 characters, and must start
   * with a letter and contain alphanumeric characters or underscores only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> sourceProperties;

  /**
   * The state of the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Represents vulnerability specific fields like cve, cvss scores etc. CVE stands for Common
   * Vulnerabilities and Exposures (https://cve.mitre.org/about/)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Vulnerability vulnerability;

  /**
   * Access details associated to the Finding, such as more information on the caller, which method
   * was accessed, from where, etc.
   * @return value or {@code null} for none
   */
  public Access getAccess() {
    return access;
  }

  /**
   * Access details associated to the Finding, such as more information on the caller, which method
   * was accessed, from where, etc.
   * @param access access or {@code null} for none
   */
  public Finding setAccess(Access access) {
    this.access = access;
    return this;
  }

  /**
   * The canonical name of the finding. It's either
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}",
   * "folders/{folder_id}/sources/{source_id}/findings/{finding_id}" or
   * "projects/{project_number}/sources/{source_id}/findings/{finding_id}", depending on the closest
   * CRM ancestor of the resource associated with the finding.
   * @return value or {@code null} for none
   */
  public java.lang.String getCanonicalName() {
    return canonicalName;
  }

  /**
   * The canonical name of the finding. It's either
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}",
   * "folders/{folder_id}/sources/{source_id}/findings/{finding_id}" or
   * "projects/{project_number}/sources/{source_id}/findings/{finding_id}", depending on the closest
   * CRM ancestor of the resource associated with the finding.
   * @param canonicalName canonicalName or {@code null} for none
   */
  public Finding setCanonicalName(java.lang.String canonicalName) {
    this.canonicalName = canonicalName;
    return this;
  }

  /**
   * The additional taxonomy group within findings from a given source. This field is immutable
   * after creation time. Example: "XSS_FLASH_INJECTION"
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The additional taxonomy group within findings from a given source. This field is immutable
   * after creation time. Example: "XSS_FLASH_INJECTION"
   * @param category category or {@code null} for none
   */
  public Finding setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * Contains compliance information for security standards associated to the finding.
   * @return value or {@code null} for none
   */
  public java.util.List<Compliance> getCompliances() {
    return compliances;
  }

  /**
   * Contains compliance information for security standards associated to the finding.
   * @param compliances compliances or {@code null} for none
   */
  public Finding setCompliances(java.util.List<Compliance> compliances) {
    this.compliances = compliances;
    return this;
  }

  /**
   * Contains information about the IP connection associated with the finding.
   * @return value or {@code null} for none
   */
  public java.util.List<Connection> getConnections() {
    return connections;
  }

  /**
   * Contains information about the IP connection associated with the finding.
   * @param connections connections or {@code null} for none
   */
  public Finding setConnections(java.util.List<Connection> connections) {
    this.connections = connections;
    return this;
  }

  /**
   * Output only. Map containing the point of contacts for the given finding. The key represents the
   * type of contact, while the value contains a list of all the contacts that pertain. Please refer
   * to: https://cloud.google.com/resource-manager/docs/managing-notification-contacts#notification-
   * categories { “security”: {contact: {email: “person1@company.com”} contact: {email:
   * “person2@company.com”} }
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ContactDetails> getContacts() {
    return contacts;
  }

  /**
   * Output only. Map containing the point of contacts for the given finding. The key represents the
   * type of contact, while the value contains a list of all the contacts that pertain. Please refer
   * to: https://cloud.google.com/resource-manager/docs/managing-notification-contacts#notification-
   * categories { “security”: {contact: {email: “person1@company.com”} contact: {email:
   * “person2@company.com”} }
   * @param contacts contacts or {@code null} for none
   */
  public Finding setContacts(java.util.Map<String, ContactDetails> contacts) {
    this.contacts = contacts;
    return this;
  }

  /**
   * The time at which the finding was created in Security Command Center.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time at which the finding was created in Security Command Center.
   * @param createTime createTime or {@code null} for none
   */
  public Finding setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Contains more detail about the finding.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Contains more detail about the finding.
   * @param description description or {@code null} for none
   */
  public Finding setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The time the finding was first detected. If an existing finding is updated, then this is the
   * time the update occurred. For example, if the finding represents an open firewall, this
   * property captures the time the detector believes the firewall became open. The accuracy is
   * determined by the detector. If the finding is later resolved, then this time reflects when the
   * finding was resolved. This must not be set to a value greater than the current timestamp.
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * The time the finding was first detected. If an existing finding is updated, then this is the
   * time the update occurred. For example, if the finding represents an open firewall, this
   * property captures the time the detector believes the firewall became open. The accuracy is
   * determined by the detector. If the finding is later resolved, then this time reflects when the
   * finding was resolved. This must not be set to a value greater than the current timestamp.
   * @param eventTime eventTime or {@code null} for none
   */
  public Finding setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Represents exfiltration associated with the Finding.
   * @return value or {@code null} for none
   */
  public Exfiltration getExfiltration() {
    return exfiltration;
  }

  /**
   * Represents exfiltration associated with the Finding.
   * @param exfiltration exfiltration or {@code null} for none
   */
  public Finding setExfiltration(Exfiltration exfiltration) {
    this.exfiltration = exfiltration;
    return this;
  }

  /**
   * Output only. Third party SIEM/SOAR fields within SCC, contains external system information and
   * external system finding fields.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudSecuritycenterV1ExternalSystem> getExternalSystems() {
    return externalSystems;
  }

  /**
   * Output only. Third party SIEM/SOAR fields within SCC, contains external system information and
   * external system finding fields.
   * @param externalSystems externalSystems or {@code null} for none
   */
  public Finding setExternalSystems(java.util.Map<String, GoogleCloudSecuritycenterV1ExternalSystem> externalSystems) {
    this.externalSystems = externalSystems;
    return this;
  }

  /**
   * The URI that, if available, points to a web page outside of Security Command Center where
   * additional information about the finding can be found. This field is guaranteed to be either
   * empty or a well formed URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalUri() {
    return externalUri;
  }

  /**
   * The URI that, if available, points to a web page outside of Security Command Center where
   * additional information about the finding can be found. This field is guaranteed to be either
   * empty or a well formed URL.
   * @param externalUri externalUri or {@code null} for none
   */
  public Finding setExternalUri(java.lang.String externalUri) {
    this.externalUri = externalUri;
    return this;
  }

  /**
   * The class of the finding.
   * @return value or {@code null} for none
   */
  public java.lang.String getFindingClass() {
    return findingClass;
  }

  /**
   * The class of the finding.
   * @param findingClass findingClass or {@code null} for none
   */
  public Finding setFindingClass(java.lang.String findingClass) {
    this.findingClass = findingClass;
    return this;
  }

  /**
   * Represents IAM bindings associated with the Finding.
   * @return value or {@code null} for none
   */
  public java.util.List<IamBinding> getIamBindings() {
    return iamBindings;
  }

  /**
   * Represents IAM bindings associated with the Finding.
   * @param iamBindings iamBindings or {@code null} for none
   */
  public Finding setIamBindings(java.util.List<IamBinding> iamBindings) {
    this.iamBindings = iamBindings;
    return this;
  }

  /**
   * Represents what's commonly known as an Indicator of compromise (IoC) in computer forensics.
   * This is an artifact observed on a network or in an operating system that, with high confidence,
   * indicates a computer intrusion. Reference:
   * https://en.wikipedia.org/wiki/Indicator_of_compromise
   * @return value or {@code null} for none
   */
  public Indicator getIndicator() {
    return indicator;
  }

  /**
   * Represents what's commonly known as an Indicator of compromise (IoC) in computer forensics.
   * This is an artifact observed on a network or in an operating system that, with high confidence,
   * indicates a computer intrusion. Reference:
   * https://en.wikipedia.org/wiki/Indicator_of_compromise
   * @param indicator indicator or {@code null} for none
   */
  public Finding setIndicator(Indicator indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * MITRE ATT tactics and techniques related to this finding. See: https://attack.mitre.org
   * @return value or {@code null} for none
   */
  public MitreAttack getMitreAttack() {
    return mitreAttack;
  }

  /**
   * MITRE ATT tactics and techniques related to this finding. See: https://attack.mitre.org
   * @param mitreAttack mitreAttack or {@code null} for none
   */
  public Finding setMitreAttack(MitreAttack mitreAttack) {
    this.mitreAttack = mitreAttack;
    return this;
  }

  /**
   * Indicates the mute state of a finding (either muted, unmuted or undefined). Unlike other
   * attributes of a finding, a finding provider shouldn't set the value of mute.
   * @return value or {@code null} for none
   */
  public java.lang.String getMute() {
    return mute;
  }

  /**
   * Indicates the mute state of a finding (either muted, unmuted or undefined). Unlike other
   * attributes of a finding, a finding provider shouldn't set the value of mute.
   * @param mute mute or {@code null} for none
   */
  public Finding setMute(java.lang.String mute) {
    this.mute = mute;
    return this;
  }

  /**
   * First known as mute_annotation. Records additional information about the mute operation e.g.
   * mute config that muted the finding, user who muted the finding, etc. Unlike other attributes of
   * a finding, a finding provider shouldn't set the value of mute.
   * @return value or {@code null} for none
   */
  public java.lang.String getMuteInitiator() {
    return muteInitiator;
  }

  /**
   * First known as mute_annotation. Records additional information about the mute operation e.g.
   * mute config that muted the finding, user who muted the finding, etc. Unlike other attributes of
   * a finding, a finding provider shouldn't set the value of mute.
   * @param muteInitiator muteInitiator or {@code null} for none
   */
  public Finding setMuteInitiator(java.lang.String muteInitiator) {
    this.muteInitiator = muteInitiator;
    return this;
  }

  /**
   * Output only. The most recent time this finding was muted or unmuted.
   * @return value or {@code null} for none
   */
  public String getMuteUpdateTime() {
    return muteUpdateTime;
  }

  /**
   * Output only. The most recent time this finding was muted or unmuted.
   * @param muteUpdateTime muteUpdateTime or {@code null} for none
   */
  public Finding setMuteUpdateTime(String muteUpdateTime) {
    this.muteUpdateTime = muteUpdateTime;
    return this;
  }

  /**
   * The relative resource name of this finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The relative resource name of this finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
   * @param name name or {@code null} for none
   */
  public Finding setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Next steps associate to the finding.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextSteps() {
    return nextSteps;
  }

  /**
   * Next steps associate to the finding.
   * @param nextSteps nextSteps or {@code null} for none
   */
  public Finding setNextSteps(java.lang.String nextSteps) {
    this.nextSteps = nextSteps;
    return this;
  }

  /**
   * The relative resource name of the source the finding belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name This field is
   * immutable after creation time. For example:
   * "organizations/{organization_id}/sources/{source_id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * The relative resource name of the source the finding belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name This field is
   * immutable after creation time. For example:
   * "organizations/{organization_id}/sources/{source_id}"
   * @param parent parent or {@code null} for none
   */
  public Finding setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Represents operating system processes associated with the Finding.
   * @return value or {@code null} for none
   */
  public java.util.List<Process> getProcesses() {
    return processes;
  }

  /**
   * Represents operating system processes associated with the Finding.
   * @param processes processes or {@code null} for none
   */
  public Finding setProcesses(java.util.List<Process> processes) {
    this.processes = processes;
    return this;
  }

  /**
   * For findings on Google Cloud resources, the full resource name of the Google Cloud resource
   * this finding is for. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name When the finding is for
   * a non-Google Cloud resource, the resourceName can be a customer or partner defined string. This
   * field is immutable after creation time.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * For findings on Google Cloud resources, the full resource name of the Google Cloud resource
   * this finding is for. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name When the finding is for
   * a non-Google Cloud resource, the resourceName can be a customer or partner defined string. This
   * field is immutable after creation time.
   * @param resourceName resourceName or {@code null} for none
   */
  public Finding setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Output only. User specified security marks. These marks are entirely managed by the user and
   * come from the SecurityMarks resource that belongs to the finding.
   * @return value or {@code null} for none
   */
  public SecurityMarks getSecurityMarks() {
    return securityMarks;
  }

  /**
   * Output only. User specified security marks. These marks are entirely managed by the user and
   * come from the SecurityMarks resource that belongs to the finding.
   * @param securityMarks securityMarks or {@code null} for none
   */
  public Finding setSecurityMarks(SecurityMarks securityMarks) {
    this.securityMarks = securityMarks;
    return this;
  }

  /**
   * The severity of the finding. This field is managed by the source that writes the finding.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * The severity of the finding. This field is managed by the source that writes the finding.
   * @param severity severity or {@code null} for none
   */
  public Finding setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Source specific properties. These properties are managed by the source that writes the finding.
   * The key names in the source_properties map must be between 1 and 255 characters, and must start
   * with a letter and contain alphanumeric characters or underscores only.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getSourceProperties() {
    return sourceProperties;
  }

  /**
   * Source specific properties. These properties are managed by the source that writes the finding.
   * The key names in the source_properties map must be between 1 and 255 characters, and must start
   * with a letter and contain alphanumeric characters or underscores only.
   * @param sourceProperties sourceProperties or {@code null} for none
   */
  public Finding setSourceProperties(java.util.Map<String, java.lang.Object> sourceProperties) {
    this.sourceProperties = sourceProperties;
    return this;
  }

  /**
   * The state of the finding.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the finding.
   * @param state state or {@code null} for none
   */
  public Finding setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Represents vulnerability specific fields like cve, cvss scores etc. CVE stands for Common
   * Vulnerabilities and Exposures (https://cve.mitre.org/about/)
   * @return value or {@code null} for none
   */
  public Vulnerability getVulnerability() {
    return vulnerability;
  }

  /**
   * Represents vulnerability specific fields like cve, cvss scores etc. CVE stands for Common
   * Vulnerabilities and Exposures (https://cve.mitre.org/about/)
   * @param vulnerability vulnerability or {@code null} for none
   */
  public Finding setVulnerability(Vulnerability vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

  @Override
  public Finding set(String fieldName, Object value) {
    return (Finding) super.set(fieldName, value);
  }

  @Override
  public Finding clone() {
    return (Finding) super.clone();
  }

}
