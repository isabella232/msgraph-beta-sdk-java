// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ComplianceStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent User State.
 */
public class DeviceManagementIntentUserState extends Entity implements IJsonBackedObject {


    /**
     * The User Principal Name.
     * The user principal name that is being reported on a device
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The User Name.
     * The user name that is being reported on a device
     */
    @SerializedName("userName")
    @Expose
    public String userName;

    /**
     * The Device Count.
     * Count of Devices that belongs to a user for an intent
     */
    @SerializedName("deviceCount")
    @Expose
    public Integer deviceCount;

    /**
     * The Last Reported Date Time.
     * Last modified date time of an intent report
     */
    @SerializedName("lastReportedDateTime")
    @Expose
    public java.util.Calendar lastReportedDateTime;

    /**
     * The State.
     * User state for an intent
     */
    @SerializedName("state")
    @Expose
    public ComplianceStatus state;


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
