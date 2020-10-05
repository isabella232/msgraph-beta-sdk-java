// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceExchangeAccessStateSummary;
import com.microsoft.graph.models.extensions.DeviceOperatingSystemSummary;
import com.microsoft.graph.models.extensions.ManagedDeviceModelsAndManufacturers;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Overview.
 */
public class ManagedDeviceOverview extends Entity implements IJsonBackedObject {


    /**
     * The Device Exchange Access State Summary.
     * Distribution of Exchange Access State in Intune
     */
    @SerializedName("deviceExchangeAccessStateSummary")
    @Expose
    public DeviceExchangeAccessStateSummary deviceExchangeAccessStateSummary;

    /**
     * The Device Operating System Summary.
     * Device operating system summary.
     */
    @SerializedName("deviceOperatingSystemSummary")
    @Expose
    public DeviceOperatingSystemSummary deviceOperatingSystemSummary;

    /**
     * The Dual Enrolled Device Count.
     * The number of devices enrolled in both MDM and EAS
     */
    @SerializedName("dualEnrolledDeviceCount")
    @Expose
    public Integer dualEnrolledDeviceCount;

    /**
     * The Enrolled Device Count.
     * Total enrolled device count. Does not include PC devices managed via Intune PC Agent
     */
    @SerializedName("enrolledDeviceCount")
    @Expose
    public Integer enrolledDeviceCount;

    /**
     * The Last Modified Date Time.
     * Last modified date time of device overview
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Managed Device Models And Manufacturers.
     * Models and Manufactures meatadata for managed devices in the account
     */
    @SerializedName("managedDeviceModelsAndManufacturers")
    @Expose
    public ManagedDeviceModelsAndManufacturers managedDeviceModelsAndManufacturers;

    /**
     * The Mdm Enrolled Count.
     * The number of devices enrolled in MDM
     */
    @SerializedName("mdmEnrolledCount")
    @Expose
    public Integer mdmEnrolledCount;


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
