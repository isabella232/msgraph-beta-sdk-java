// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RunAsAccountType;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptDeviceState;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptRunSummary;
import com.microsoft.graph.models.extensions.DeviceManagementScriptUserState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Shell Script.
 */
public class DeviceShellScript extends Entity implements IJsonBackedObject {


    /**
     * The Block Execution Notifications.
     * Does not notify the user a script is being executed
     */
    @SerializedName("blockExecutionNotifications")
    @Expose
    public Boolean blockExecutionNotifications;

    /**
     * The Created Date Time.
     * The date and time the device management script was created. This property is read-only.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Optional description for the device management script.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * Name of the device management script.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Execution Frequency.
     * The interval for script to run. If not defined the script will run once
     */
    @SerializedName("executionFrequency")
    @Expose
    public javax.xml.datatype.Duration executionFrequency;

    /**
     * The File Name.
     * Script file name.
     */
    @SerializedName("fileName")
    @Expose
    public String fileName;

    /**
     * The Last Modified Date Time.
     * The date and time the device management script was last modified. This property is read-only.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Retry Count.
     * Number of times for the script to be retried if it fails
     */
    @SerializedName("retryCount")
    @Expose
    public Integer retryCount;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tag IDs for this PowerShellScript instance.
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Run As Account.
     * Indicates the type of execution context.
     */
    @SerializedName("runAsAccount")
    @Expose
    public RunAsAccountType runAsAccount;

    /**
     * The Script Content.
     * The script content.
     */
    @SerializedName("scriptContent")
    @Expose
    public byte[] scriptContent;

    /**
     * The Assignments.
     * The list of group assignments for the device management script.
     */
    @SerializedName("assignments")
    @Expose
    public DeviceManagementScriptAssignmentCollectionPage assignments;

    /**
     * The Device Run States.
     * List of run states for this script across all devices.
     */
    @SerializedName("deviceRunStates")
    @Expose
    public DeviceManagementScriptDeviceStateCollectionPage deviceRunStates;

    /**
     * The Group Assignments.
     * The list of group assignments for the device management script.
     */
    @SerializedName("groupAssignments")
    @Expose
    public DeviceManagementScriptGroupAssignmentCollectionPage groupAssignments;

    /**
     * The Run Summary.
     * Run summary for device management script.
     */
    @SerializedName("runSummary")
    @Expose
    public DeviceManagementScriptRunSummary runSummary;

    /**
     * The User Run States.
     * List of run states for this script across all users.
     */
    @SerializedName("userRunStates")
    @Expose
    public DeviceManagementScriptUserStateCollectionPage userRunStates;


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
            final DeviceManagementScriptAssignmentCollectionResponse response = new DeviceManagementScriptAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final DeviceManagementScriptAssignment[] array = new DeviceManagementScriptAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementScriptAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new DeviceManagementScriptAssignmentCollectionPage(response, null);
        }

        if (json.has("deviceRunStates")) {
            final DeviceManagementScriptDeviceStateCollectionResponse response = new DeviceManagementScriptDeviceStateCollectionResponse();
            if (json.has("deviceRunStates@odata.nextLink")) {
                response.nextLink = json.get("deviceRunStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceRunStates").toString(), JsonObject[].class);
            final DeviceManagementScriptDeviceState[] array = new DeviceManagementScriptDeviceState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementScriptDeviceState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceRunStates = new DeviceManagementScriptDeviceStateCollectionPage(response, null);
        }

        if (json.has("groupAssignments")) {
            final DeviceManagementScriptGroupAssignmentCollectionResponse response = new DeviceManagementScriptGroupAssignmentCollectionResponse();
            if (json.has("groupAssignments@odata.nextLink")) {
                response.nextLink = json.get("groupAssignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupAssignments").toString(), JsonObject[].class);
            final DeviceManagementScriptGroupAssignment[] array = new DeviceManagementScriptGroupAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementScriptGroupAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupAssignments = new DeviceManagementScriptGroupAssignmentCollectionPage(response, null);
        }

        if (json.has("userRunStates")) {
            final DeviceManagementScriptUserStateCollectionResponse response = new DeviceManagementScriptUserStateCollectionResponse();
            if (json.has("userRunStates@odata.nextLink")) {
                response.nextLink = json.get("userRunStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userRunStates").toString(), JsonObject[].class);
            final DeviceManagementScriptUserState[] array = new DeviceManagementScriptUserState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementScriptUserState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userRunStates = new DeviceManagementScriptUserStateCollectionPage(response, null);
        }
    }
}
