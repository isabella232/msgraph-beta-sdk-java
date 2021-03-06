// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Device Setting State Summary.
 */
public class DeviceManagementIntentDeviceSettingStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The Compliant Count.
     * Number of compliant devices
     */
    @SerializedName(value = "compliantCount", alternate = {"CompliantCount"})
    @Expose
    public Integer compliantCount;

    /**
     * The Conflict Count.
     * Number of devices in conflict
     */
    @SerializedName(value = "conflictCount", alternate = {"ConflictCount"})
    @Expose
    public Integer conflictCount;

    /**
     * The Error Count.
     * Number of error devices
     */
    @SerializedName(value = "errorCount", alternate = {"ErrorCount"})
    @Expose
    public Integer errorCount;

    /**
     * The Non Compliant Count.
     * Number of non compliant devices
     */
    @SerializedName(value = "nonCompliantCount", alternate = {"NonCompliantCount"})
    @Expose
    public Integer nonCompliantCount;

    /**
     * The Not Applicable Count.
     * Number of not applicable devices
     */
    @SerializedName(value = "notApplicableCount", alternate = {"NotApplicableCount"})
    @Expose
    public Integer notApplicableCount;

    /**
     * The Remediated Count.
     * Number of remediated devices
     */
    @SerializedName(value = "remediatedCount", alternate = {"RemediatedCount"})
    @Expose
    public Integer remediatedCount;

    /**
     * The Setting Name.
     * Name of a setting
     */
    @SerializedName(value = "settingName", alternate = {"SettingName"})
    @Expose
    public String settingName;


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
