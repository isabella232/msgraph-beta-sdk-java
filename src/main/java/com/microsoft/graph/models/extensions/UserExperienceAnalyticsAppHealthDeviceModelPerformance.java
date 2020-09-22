// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Device Model Performance.
 */
public class UserExperienceAnalyticsAppHealthDeviceModelPerformance extends Entity implements IJsonBackedObject {


    /**
     * The Active Device Count.
     * The number of active devices for the model. Valid values -2147483648 to 2147483647
     */
    @SerializedName("activeDeviceCount")
    @Expose
    public Integer activeDeviceCount;

    /**
     * The Device Manufacturer.
     * The manufacturer name of the device.
     */
    @SerializedName("deviceManufacturer")
    @Expose
    public String deviceManufacturer;

    /**
     * The Device Model.
     * The model name of the device.
     */
    @SerializedName("deviceModel")
    @Expose
    public String deviceModel;

    /**
     * The Mean Time To Failure In Minutes.
     * The mean time to failure for the model device in minutes. Valid values -2147483648 to 2147483647
     */
    @SerializedName("meanTimeToFailureInMinutes")
    @Expose
    public Integer meanTimeToFailureInMinutes;

    /**
     * The Model App Health Score.
     * The app health score of the device model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName("modelAppHealthScore")
    @Expose
    public Double modelAppHealthScore;

    /**
     * The Model App Health Status.
     * The overall app health status of the device model.
     */
    @SerializedName("modelAppHealthStatus")
    @Expose
    public String modelAppHealthStatus;


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
