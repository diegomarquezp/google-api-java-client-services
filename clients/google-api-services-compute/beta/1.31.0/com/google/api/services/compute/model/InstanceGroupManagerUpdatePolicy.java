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

package com.google.api.services.compute.model;

/**
 * Model definition for InstanceGroupManagerUpdatePolicy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceGroupManagerUpdatePolicy extends com.google.api.client.json.GenericJson {

  /**
   * The  instance redistribution policy for regional managed instance groups. Valid values are: -
   * PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across
   * zones in the region.  - NONE: For non-autoscaled groups, proactive redistribution is disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceRedistributionType;

  /**
   * The maximum number of instances that can be created above the specified targetSize during the
   * update process. This value can be either a fixed number or, if the group has 10 or more
   * instances, a percentage. If you set a percentage, the number of instances is rounded up if
   * necessary. The default value for maxSurge is a fixed value equal to the number of zones in
   * which the managed instance group operates.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxSurge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FixedOrPercent maxSurge;

  /**
   * The maximum number of instances that can be unavailable during the update process. An instance
   * is considered available if all of the following conditions are satisfied:
   *
   *   - The instance's status is RUNNING.  - If there is a health check on the instance group, the
   * instance's health check status must be HEALTHY at least once. If there is no health check on
   * the group, then the instance only needs to have a status of RUNNING to be considered available.
   * This value can be either a fixed number or, if the group has 10 or more instances, a
   * percentage. If you set a percentage, the number of instances is rounded up if necessary. The
   * default value for maxUnavailable is a fixed value equal to the number of zones in which the
   * managed instance group operates.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxUnavailable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FixedOrPercent maxUnavailable;

  /**
   * Minimum number of seconds to wait for after a newly created instance becomes available. This
   * value must be from range [0, 3600].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minReadySec;

  /**
   * Minimal action to be taken on an instance. You can specify either RESTART to restart existing
   * instances or REPLACE to delete and create new instances from the target template. If you
   * specify a RESTART, the Updater will attempt to perform that action only. However, if the
   * Updater determines that the minimal action you specify is not enough to perform the update, it
   * might perform a more disruptive action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minimalAction;

  /**
   * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE
   * to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to
   * allow actions that can be applied without instance replacing or REPLACE to allow all possible
   * actions. If the Updater determines that the minimal update action needed is more disruptive
   * than most disruptive allowed action you specify it will not perform the update at all.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mostDisruptiveAllowedAction;

  /**
   * What action should be used to replace instances. See minimal_action.REPLACE
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String replacementMethod;

  /**
   * The type of update process. You can specify either PROACTIVE so that the instance group manager
   * proactively executes actions in order to bring instances to their target versions or
   * OPPORTUNISTIC so that no action is proactively executed but the update will be performed as
   * part of other actions (for example, resizes or recreateInstances calls).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The  instance redistribution policy for regional managed instance groups. Valid values are: -
   * PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across
   * zones in the region.  - NONE: For non-autoscaled groups, proactive redistribution is disabled.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceRedistributionType() {
    return instanceRedistributionType;
  }

  /**
   * The  instance redistribution policy for regional managed instance groups. Valid values are: -
   * PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across
   * zones in the region.  - NONE: For non-autoscaled groups, proactive redistribution is disabled.
   * @param instanceRedistributionType instanceRedistributionType or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setInstanceRedistributionType(java.lang.String instanceRedistributionType) {
    this.instanceRedistributionType = instanceRedistributionType;
    return this;
  }

  /**
   * The maximum number of instances that can be created above the specified targetSize during the
   * update process. This value can be either a fixed number or, if the group has 10 or more
   * instances, a percentage. If you set a percentage, the number of instances is rounded up if
   * necessary. The default value for maxSurge is a fixed value equal to the number of zones in
   * which the managed instance group operates.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxSurge.
   * @return value or {@code null} for none
   */
  public FixedOrPercent getMaxSurge() {
    return maxSurge;
  }

  /**
   * The maximum number of instances that can be created above the specified targetSize during the
   * update process. This value can be either a fixed number or, if the group has 10 or more
   * instances, a percentage. If you set a percentage, the number of instances is rounded up if
   * necessary. The default value for maxSurge is a fixed value equal to the number of zones in
   * which the managed instance group operates.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxSurge.
   * @param maxSurge maxSurge or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setMaxSurge(FixedOrPercent maxSurge) {
    this.maxSurge = maxSurge;
    return this;
  }

  /**
   * The maximum number of instances that can be unavailable during the update process. An instance
   * is considered available if all of the following conditions are satisfied:
   *
   *   - The instance's status is RUNNING.  - If there is a health check on the instance group, the
   * instance's health check status must be HEALTHY at least once. If there is no health check on
   * the group, then the instance only needs to have a status of RUNNING to be considered available.
   * This value can be either a fixed number or, if the group has 10 or more instances, a
   * percentage. If you set a percentage, the number of instances is rounded up if necessary. The
   * default value for maxUnavailable is a fixed value equal to the number of zones in which the
   * managed instance group operates.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxUnavailable.
   * @return value or {@code null} for none
   */
  public FixedOrPercent getMaxUnavailable() {
    return maxUnavailable;
  }

  /**
   * The maximum number of instances that can be unavailable during the update process. An instance
   * is considered available if all of the following conditions are satisfied:
   *
   *   - The instance's status is RUNNING.  - If there is a health check on the instance group, the
   * instance's health check status must be HEALTHY at least once. If there is no health check on
   * the group, then the instance only needs to have a status of RUNNING to be considered available.
   * This value can be either a fixed number or, if the group has 10 or more instances, a
   * percentage. If you set a percentage, the number of instances is rounded up if necessary. The
   * default value for maxUnavailable is a fixed value equal to the number of zones in which the
   * managed instance group operates.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxUnavailable.
   * @param maxUnavailable maxUnavailable or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setMaxUnavailable(FixedOrPercent maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

  /**
   * Minimum number of seconds to wait for after a newly created instance becomes available. This
   * value must be from range [0, 3600].
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinReadySec() {
    return minReadySec;
  }

  /**
   * Minimum number of seconds to wait for after a newly created instance becomes available. This
   * value must be from range [0, 3600].
   * @param minReadySec minReadySec or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setMinReadySec(java.lang.Integer minReadySec) {
    this.minReadySec = minReadySec;
    return this;
  }

  /**
   * Minimal action to be taken on an instance. You can specify either RESTART to restart existing
   * instances or REPLACE to delete and create new instances from the target template. If you
   * specify a RESTART, the Updater will attempt to perform that action only. However, if the
   * Updater determines that the minimal action you specify is not enough to perform the update, it
   * might perform a more disruptive action.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinimalAction() {
    return minimalAction;
  }

  /**
   * Minimal action to be taken on an instance. You can specify either RESTART to restart existing
   * instances or REPLACE to delete and create new instances from the target template. If you
   * specify a RESTART, the Updater will attempt to perform that action only. However, if the
   * Updater determines that the minimal action you specify is not enough to perform the update, it
   * might perform a more disruptive action.
   * @param minimalAction minimalAction or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setMinimalAction(java.lang.String minimalAction) {
    this.minimalAction = minimalAction;
    return this;
  }

  /**
   * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE
   * to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to
   * allow actions that can be applied without instance replacing or REPLACE to allow all possible
   * actions. If the Updater determines that the minimal update action needed is more disruptive
   * than most disruptive allowed action you specify it will not perform the update at all.
   * @return value or {@code null} for none
   */
  public java.lang.String getMostDisruptiveAllowedAction() {
    return mostDisruptiveAllowedAction;
  }

  /**
   * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE
   * to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to
   * allow actions that can be applied without instance replacing or REPLACE to allow all possible
   * actions. If the Updater determines that the minimal update action needed is more disruptive
   * than most disruptive allowed action you specify it will not perform the update at all.
   * @param mostDisruptiveAllowedAction mostDisruptiveAllowedAction or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setMostDisruptiveAllowedAction(java.lang.String mostDisruptiveAllowedAction) {
    this.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
    return this;
  }

  /**
   * What action should be used to replace instances. See minimal_action.REPLACE
   * @return value or {@code null} for none
   */
  public java.lang.String getReplacementMethod() {
    return replacementMethod;
  }

  /**
   * What action should be used to replace instances. See minimal_action.REPLACE
   * @param replacementMethod replacementMethod or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setReplacementMethod(java.lang.String replacementMethod) {
    this.replacementMethod = replacementMethod;
    return this;
  }

  /**
   * The type of update process. You can specify either PROACTIVE so that the instance group manager
   * proactively executes actions in order to bring instances to their target versions or
   * OPPORTUNISTIC so that no action is proactively executed but the update will be performed as
   * part of other actions (for example, resizes or recreateInstances calls).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of update process. You can specify either PROACTIVE so that the instance group manager
   * proactively executes actions in order to bring instances to their target versions or
   * OPPORTUNISTIC so that no action is proactively executed but the update will be performed as
   * part of other actions (for example, resizes or recreateInstances calls).
   * @param type type or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public InstanceGroupManagerUpdatePolicy set(String fieldName, Object value) {
    return (InstanceGroupManagerUpdatePolicy) super.set(fieldName, value);
  }

  @Override
  public InstanceGroupManagerUpdatePolicy clone() {
    return (InstanceGroupManagerUpdatePolicy) super.clone();
  }

}
