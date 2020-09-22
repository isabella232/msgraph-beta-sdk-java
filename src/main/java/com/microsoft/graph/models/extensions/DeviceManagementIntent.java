// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementIntentAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementIntentSettingCategory;
import com.microsoft.graph.models.extensions.DeviceManagementIntentDeviceSettingStateSummary;
import com.microsoft.graph.models.extensions.DeviceManagementIntentDeviceState;
import com.microsoft.graph.models.extensions.DeviceManagementIntentDeviceStateSummary;
import com.microsoft.graph.models.extensions.DeviceManagementSettingInstance;
import com.microsoft.graph.models.extensions.DeviceManagementIntentUserState;
import com.microsoft.graph.models.extensions.DeviceManagementIntentUserStateSummary;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentSettingCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentSettingCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceSettingStateSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceSettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentUserStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentUserStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent.
 */
public class DeviceManagementIntent extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * The user given description
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * The user given display name
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Assigned.
     * Signifies whether or not the intent is assigned to users
     */
    @SerializedName("isAssigned")
    @Expose
    public Boolean isAssigned;

    /**
     * The Last Modified Date Time.
     * When the intent was last modified
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Template Id.
     * The ID of the template this intent was created from (if any)
     */
    @SerializedName("templateId")
    @Expose
    public String templateId;

    /**
     * The Assignments.
     * Collection of assignments
     */
    @SerializedName("assignments")
    @Expose
    public DeviceManagementIntentAssignmentCollectionPage assignments;

    /**
     * The Categories.
     * Collection of setting categories within the intent
     */
    @SerializedName("categories")
    @Expose
    public DeviceManagementIntentSettingCategoryCollectionPage categories;

    /**
     * The Device Setting State Summaries.
     * Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent
     */
    @SerializedName("deviceSettingStateSummaries")
    @Expose
    public DeviceManagementIntentDeviceSettingStateSummaryCollectionPage deviceSettingStateSummaries;

    /**
     * The Device States.
     * Collection of states of all devices that the intent is applied to
     */
    @SerializedName("deviceStates")
    @Expose
    public DeviceManagementIntentDeviceStateCollectionPage deviceStates;

    /**
     * The Device State Summary.
     * A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to
     */
    @SerializedName("deviceStateSummary")
    @Expose
    public DeviceManagementIntentDeviceStateSummary deviceStateSummary;

    /**
     * The Settings.
     * Collection of all settings to be applied
     */
    @SerializedName("settings")
    @Expose
    public DeviceManagementSettingInstanceCollectionPage settings;

    /**
     * The User States.
     * Collection of states of all users that the intent is applied to
     */
    @SerializedName("userStates")
    @Expose
    public DeviceManagementIntentUserStateCollectionPage userStates;

    /**
     * The User State Summary.
     * A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to
     */
    @SerializedName("userStateSummary")
    @Expose
    public DeviceManagementIntentUserStateSummary userStateSummary;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("assignments")) {
            final DeviceManagementIntentAssignmentCollectionResponse response = new DeviceManagementIntentAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final DeviceManagementIntentAssignment[] array = new DeviceManagementIntentAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementIntentAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new DeviceManagementIntentAssignmentCollectionPage(response, null);
        }

        if (json.has("categories")) {
            final DeviceManagementIntentSettingCategoryCollectionResponse response = new DeviceManagementIntentSettingCategoryCollectionResponse();
            if (json.has("categories@odata.nextLink")) {
                response.nextLink = json.get("categories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("categories").toString(), JsonObject[].class);
            final DeviceManagementIntentSettingCategory[] array = new DeviceManagementIntentSettingCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementIntentSettingCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            categories = new DeviceManagementIntentSettingCategoryCollectionPage(response, null);
        }

        if (json.has("deviceSettingStateSummaries")) {
            final DeviceManagementIntentDeviceSettingStateSummaryCollectionResponse response = new DeviceManagementIntentDeviceSettingStateSummaryCollectionResponse();
            if (json.has("deviceSettingStateSummaries@odata.nextLink")) {
                response.nextLink = json.get("deviceSettingStateSummaries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceSettingStateSummaries").toString(), JsonObject[].class);
            final DeviceManagementIntentDeviceSettingStateSummary[] array = new DeviceManagementIntentDeviceSettingStateSummary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementIntentDeviceSettingStateSummary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceSettingStateSummaries = new DeviceManagementIntentDeviceSettingStateSummaryCollectionPage(response, null);
        }

        if (json.has("deviceStates")) {
            final DeviceManagementIntentDeviceStateCollectionResponse response = new DeviceManagementIntentDeviceStateCollectionResponse();
            if (json.has("deviceStates@odata.nextLink")) {
                response.nextLink = json.get("deviceStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceStates").toString(), JsonObject[].class);
            final DeviceManagementIntentDeviceState[] array = new DeviceManagementIntentDeviceState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementIntentDeviceState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceStates = new DeviceManagementIntentDeviceStateCollectionPage(response, null);
        }

        if (json.has("settings")) {
            final DeviceManagementSettingInstanceCollectionResponse response = new DeviceManagementSettingInstanceCollectionResponse();
            if (json.has("settings@odata.nextLink")) {
                response.nextLink = json.get("settings@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("settings").toString(), JsonObject[].class);
            final DeviceManagementSettingInstance[] array = new DeviceManagementSettingInstance[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementSettingInstance.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            settings = new DeviceManagementSettingInstanceCollectionPage(response, null);
        }

        if (json.has("userStates")) {
            final DeviceManagementIntentUserStateCollectionResponse response = new DeviceManagementIntentUserStateCollectionResponse();
            if (json.has("userStates@odata.nextLink")) {
                response.nextLink = json.get("userStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userStates").toString(), JsonObject[].class);
            final DeviceManagementIntentUserState[] array = new DeviceManagementIntentUserState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementIntentUserState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userStates = new DeviceManagementIntentUserStateCollectionPage(response, null);
        }
    }
}
