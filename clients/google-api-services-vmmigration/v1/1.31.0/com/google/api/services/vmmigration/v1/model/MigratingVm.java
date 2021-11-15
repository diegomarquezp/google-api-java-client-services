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

package com.google.api.services.vmmigration.v1.model;

/**
 * MigratingVm describes the VM that will be migrated from a Source environment and its replication
 * state.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MigratingVm extends com.google.api.client.json.GenericJson {

  /**
   * Details of the target VM in Compute Engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ComputeEngineTargetDefaults computeEngineTargetDefaults;

  /**
   * Output only. The time the migrating VM was created (this refers to this resource and not to the
   * time it was installed in the source).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The percentage progress of the current running replication cycle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReplicationCycle currentSyncInfo;

  /**
   * The description attached to the migrating VM by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The display name attached to the MigratingVm by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Provides details on the state of the Migrating VM in case of an error in
   * replication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * Output only. The group this migrating vm is included in, if any. The group is represented by
   * the full path of the appropriate Group resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String group;

  /**
   * The labels of the migrating VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The most updated snapshot created time in the source that finished replication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReplicationSync lastSync;

  /**
   * Output only. The identifier of the MigratingVm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The replication schedule policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SchedulePolicy policy;

  /**
   * Output only. The recent clone jobs performed on the migrating VM. This field holds the vm's
   * last completed clone job and the vm's running clone job, if one exists. Note: To have this
   * field populated you need to explicitly request it via the "view" parameter of the Get/List
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CloneJob> recentCloneJobs;

  static {
    // hack to force ProGuard to consider CloneJob used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CloneJob.class);
  }

  /**
   * Output only. The recent cutover jobs performed on the migrating VM. This field holds the vm's
   * last completed cutover job and the vm's running cutover job, if one exists. Note: To have this
   * field populated you need to explicitly request it via the "view" parameter of the Get/List
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CutoverJob> recentCutoverJobs;

  static {
    // hack to force ProGuard to consider CutoverJob used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CutoverJob.class);
  }

  /**
   * The unique ID of the VM in the source. The VM's name in vSphere can be changed, so this is not
   * the VM's name but rather its moRef id. This id is of the form vm-.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceVmId;

  /**
   * Output only. State of the MigratingVm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The last time the migrating VM state was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String stateTime;

  /**
   * Output only. The last time the migrating VM resource was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Details of the target VM in Compute Engine.
   * @return value or {@code null} for none
   */
  public ComputeEngineTargetDefaults getComputeEngineTargetDefaults() {
    return computeEngineTargetDefaults;
  }

  /**
   * Details of the target VM in Compute Engine.
   * @param computeEngineTargetDefaults computeEngineTargetDefaults or {@code null} for none
   */
  public MigratingVm setComputeEngineTargetDefaults(ComputeEngineTargetDefaults computeEngineTargetDefaults) {
    this.computeEngineTargetDefaults = computeEngineTargetDefaults;
    return this;
  }

  /**
   * Output only. The time the migrating VM was created (this refers to this resource and not to the
   * time it was installed in the source).
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the migrating VM was created (this refers to this resource and not to the
   * time it was installed in the source).
   * @param createTime createTime or {@code null} for none
   */
  public MigratingVm setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The percentage progress of the current running replication cycle.
   * @return value or {@code null} for none
   */
  public ReplicationCycle getCurrentSyncInfo() {
    return currentSyncInfo;
  }

  /**
   * Output only. The percentage progress of the current running replication cycle.
   * @param currentSyncInfo currentSyncInfo or {@code null} for none
   */
  public MigratingVm setCurrentSyncInfo(ReplicationCycle currentSyncInfo) {
    this.currentSyncInfo = currentSyncInfo;
    return this;
  }

  /**
   * The description attached to the migrating VM by the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description attached to the migrating VM by the user.
   * @param description description or {@code null} for none
   */
  public MigratingVm setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The display name attached to the MigratingVm by the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name attached to the MigratingVm by the user.
   * @param displayName displayName or {@code null} for none
   */
  public MigratingVm setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Provides details on the state of the Migrating VM in case of an error in
   * replication.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * Output only. Provides details on the state of the Migrating VM in case of an error in
   * replication.
   * @param error error or {@code null} for none
   */
  public MigratingVm setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * Output only. The group this migrating vm is included in, if any. The group is represented by
   * the full path of the appropriate Group resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getGroup() {
    return group;
  }

  /**
   * Output only. The group this migrating vm is included in, if any. The group is represented by
   * the full path of the appropriate Group resource.
   * @param group group or {@code null} for none
   */
  public MigratingVm setGroup(java.lang.String group) {
    this.group = group;
    return this;
  }

  /**
   * The labels of the migrating VM.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels of the migrating VM.
   * @param labels labels or {@code null} for none
   */
  public MigratingVm setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The most updated snapshot created time in the source that finished replication.
   * @return value or {@code null} for none
   */
  public ReplicationSync getLastSync() {
    return lastSync;
  }

  /**
   * Output only. The most updated snapshot created time in the source that finished replication.
   * @param lastSync lastSync or {@code null} for none
   */
  public MigratingVm setLastSync(ReplicationSync lastSync) {
    this.lastSync = lastSync;
    return this;
  }

  /**
   * Output only. The identifier of the MigratingVm.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The identifier of the MigratingVm.
   * @param name name or {@code null} for none
   */
  public MigratingVm setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The replication schedule policy.
   * @return value or {@code null} for none
   */
  public SchedulePolicy getPolicy() {
    return policy;
  }

  /**
   * The replication schedule policy.
   * @param policy policy or {@code null} for none
   */
  public MigratingVm setPolicy(SchedulePolicy policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Output only. The recent clone jobs performed on the migrating VM. This field holds the vm's
   * last completed clone job and the vm's running clone job, if one exists. Note: To have this
   * field populated you need to explicitly request it via the "view" parameter of the Get/List
   * request.
   * @return value or {@code null} for none
   */
  public java.util.List<CloneJob> getRecentCloneJobs() {
    return recentCloneJobs;
  }

  /**
   * Output only. The recent clone jobs performed on the migrating VM. This field holds the vm's
   * last completed clone job and the vm's running clone job, if one exists. Note: To have this
   * field populated you need to explicitly request it via the "view" parameter of the Get/List
   * request.
   * @param recentCloneJobs recentCloneJobs or {@code null} for none
   */
  public MigratingVm setRecentCloneJobs(java.util.List<CloneJob> recentCloneJobs) {
    this.recentCloneJobs = recentCloneJobs;
    return this;
  }

  /**
   * Output only. The recent cutover jobs performed on the migrating VM. This field holds the vm's
   * last completed cutover job and the vm's running cutover job, if one exists. Note: To have this
   * field populated you need to explicitly request it via the "view" parameter of the Get/List
   * request.
   * @return value or {@code null} for none
   */
  public java.util.List<CutoverJob> getRecentCutoverJobs() {
    return recentCutoverJobs;
  }

  /**
   * Output only. The recent cutover jobs performed on the migrating VM. This field holds the vm's
   * last completed cutover job and the vm's running cutover job, if one exists. Note: To have this
   * field populated you need to explicitly request it via the "view" parameter of the Get/List
   * request.
   * @param recentCutoverJobs recentCutoverJobs or {@code null} for none
   */
  public MigratingVm setRecentCutoverJobs(java.util.List<CutoverJob> recentCutoverJobs) {
    this.recentCutoverJobs = recentCutoverJobs;
    return this;
  }

  /**
   * The unique ID of the VM in the source. The VM's name in vSphere can be changed, so this is not
   * the VM's name but rather its moRef id. This id is of the form vm-.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceVmId() {
    return sourceVmId;
  }

  /**
   * The unique ID of the VM in the source. The VM's name in vSphere can be changed, so this is not
   * the VM's name but rather its moRef id. This id is of the form vm-.
   * @param sourceVmId sourceVmId or {@code null} for none
   */
  public MigratingVm setSourceVmId(java.lang.String sourceVmId) {
    this.sourceVmId = sourceVmId;
    return this;
  }

  /**
   * Output only. State of the MigratingVm.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the MigratingVm.
   * @param state state or {@code null} for none
   */
  public MigratingVm setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The last time the migrating VM state was updated.
   * @return value or {@code null} for none
   */
  public String getStateTime() {
    return stateTime;
  }

  /**
   * Output only. The last time the migrating VM state was updated.
   * @param stateTime stateTime or {@code null} for none
   */
  public MigratingVm setStateTime(String stateTime) {
    this.stateTime = stateTime;
    return this;
  }

  /**
   * Output only. The last time the migrating VM resource was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last time the migrating VM resource was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public MigratingVm setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public MigratingVm set(String fieldName, Object value) {
    return (MigratingVm) super.set(fieldName, value);
  }

  @Override
  public MigratingVm clone() {
    return (MigratingVm) super.clone();
  }

}
