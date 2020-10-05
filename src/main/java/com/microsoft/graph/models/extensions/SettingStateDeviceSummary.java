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
 * The class for the Setting State Device Summary.
 */
public class SettingStateDeviceSummary extends Entity implements IJsonBackedObject {


    /**
     * The Compliant Device Count.
     * Device Compliant count for the setting
     */
    @SerializedName("compliantDeviceCount")
    @Expose
    public Integer compliantDeviceCount;

    /**
     * The Conflict Device Count.
     * Device conflict error count for the setting
     */
    @SerializedName("conflictDeviceCount")
    @Expose
    public Integer conflictDeviceCount;

    /**
     * The Error Device Count.
     * Device error count for the setting
     */
    @SerializedName("errorDeviceCount")
    @Expose
    public Integer errorDeviceCount;

    /**
     * The Instance Path.
     * Name of the InstancePath for the setting
     */
    @SerializedName("instancePath")
    @Expose
    public String instancePath;

    /**
     * The Non Compliant Device Count.
     * Device NonCompliant count for the setting
     */
    @SerializedName("nonCompliantDeviceCount")
    @Expose
    public Integer nonCompliantDeviceCount;

    /**
     * The Not Applicable Device Count.
     * Device Not Applicable count for the setting
     */
    @SerializedName("notApplicableDeviceCount")
    @Expose
    public Integer notApplicableDeviceCount;

    /**
     * The Remediated Device Count.
     * Device Compliant count for the setting
     */
    @SerializedName("remediatedDeviceCount")
    @Expose
    public Integer remediatedDeviceCount;

    /**
     * The Setting Name.
     * Name of the setting
     */
    @SerializedName("settingName")
    @Expose
    public String settingName;

    /**
     * The Unknown Device Count.
     * Device Unkown count for the setting
     */
    @SerializedName("unknownDeviceCount")
    @Expose
    public Integer unknownDeviceCount;


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
