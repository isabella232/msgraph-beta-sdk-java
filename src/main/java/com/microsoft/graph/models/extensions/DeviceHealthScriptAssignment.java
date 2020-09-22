// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRunSchedule;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementAssignmentTarget;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Assignment.
 */
public class DeviceHealthScriptAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Run Remediation Script.
     * Determine whether we want to run detection script only or run both detection script and remediation script
     */
    @SerializedName("runRemediationScript")
    @Expose
    public Boolean runRemediationScript;

    /**
     * The Run Schedule.
     * Script run schedule for the target group
     */
    @SerializedName("runSchedule")
    @Expose
    public DeviceHealthScriptRunSchedule runSchedule;

    /**
     * The Target.
     * The Azure Active Directory group we are targeting the script to
     */
    @SerializedName("target")
    @Expose
    public DeviceAndAppManagementAssignmentTarget target;


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

    }
}
