// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Operating System Summary.
 */
public class DeviceOperatingSystemSummary implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Android Count.
     * Number of android device count.
     */
    @SerializedName("androidCount")
    @Expose
    public Integer androidCount;

    /**
     * The Ios Count.
     * Number of iOS device count.
     */
    @SerializedName("iosCount")
    @Expose
    public Integer iosCount;

    /**
     * The Mac OSCount.
     * Number of Mac OS X device count.
     */
    @SerializedName("macOSCount")
    @Expose
    public Integer macOSCount;

    /**
     * The Windows Mobile Count.
     * Number of Windows mobile device count.
     */
    @SerializedName("windowsMobileCount")
    @Expose
    public Integer windowsMobileCount;

    /**
     * The Windows Count.
     * Number of Windows device count.
     */
    @SerializedName("windowsCount")
    @Expose
    public Integer windowsCount;

    /**
     * The Unknown Count.
     * Number of unknown device count.
     */
    @SerializedName("unknownCount")
    @Expose
    public Integer unknownCount;

    /**
     * The Android Dedicated Count.
     * Number of dedicated Android devices.
     */
    @SerializedName("androidDedicatedCount")
    @Expose
    public Integer androidDedicatedCount;

    /**
     * The Android Device Admin Count.
     * Number of device admin Android devices.
     */
    @SerializedName("androidDeviceAdminCount")
    @Expose
    public Integer androidDeviceAdminCount;

    /**
     * The Android Fully Managed Count.
     * Number of fully managed Android devices.
     */
    @SerializedName("androidFullyManagedCount")
    @Expose
    public Integer androidFullyManagedCount;

    /**
     * The Android Work Profile Count.
     * Number of work profile Android devices.
     */
    @SerializedName("androidWorkProfileCount")
    @Expose
    public Integer androidWorkProfileCount;

    /**
     * The Android Corporate Work Profile Count.
     * The count of Corporate work profile Android devices. Also known as Corporate Owned Personally Enabled (COPE). Valid values -1 to 2147483647
     */
    @SerializedName("androidCorporateWorkProfileCount")
    @Expose
    public Integer androidCorporateWorkProfileCount;

    /**
     * The Config Mgr Device Count.
     * Number of ConfigMgr managed devices.
     */
    @SerializedName("configMgrDeviceCount")
    @Expose
    public Integer configMgrDeviceCount;


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