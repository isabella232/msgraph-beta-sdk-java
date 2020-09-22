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
 * The class for the Privileged Role Settings.
 */
public class PrivilegedRoleSettings extends Entity implements IJsonBackedObject {


    /**
     * The Approval On Elevation.
     * 
     */
    @SerializedName("approvalOnElevation")
    @Expose
    public Boolean approvalOnElevation;

    /**
     * The Approver Ids.
     * 
     */
    @SerializedName("approverIds")
    @Expose
    public java.util.List<String> approverIds;

    /**
     * The Elevation Duration.
     * 
     */
    @SerializedName("elevationDuration")
    @Expose
    public javax.xml.datatype.Duration elevationDuration;

    /**
     * The Is Mfa On Elevation Configurable.
     * 
     */
    @SerializedName("isMfaOnElevationConfigurable")
    @Expose
    public Boolean isMfaOnElevationConfigurable;

    /**
     * The Last Global Admin.
     * 
     */
    @SerializedName("lastGlobalAdmin")
    @Expose
    public Boolean lastGlobalAdmin;

    /**
     * The Max Elavation Duration.
     * 
     */
    @SerializedName("maxElavationDuration")
    @Expose
    public javax.xml.datatype.Duration maxElavationDuration;

    /**
     * The Mfa On Elevation.
     * 
     */
    @SerializedName("mfaOnElevation")
    @Expose
    public Boolean mfaOnElevation;

    /**
     * The Min Elevation Duration.
     * 
     */
    @SerializedName("minElevationDuration")
    @Expose
    public javax.xml.datatype.Duration minElevationDuration;

    /**
     * The Notification To User On Elevation.
     * 
     */
    @SerializedName("notificationToUserOnElevation")
    @Expose
    public Boolean notificationToUserOnElevation;

    /**
     * The Ticketing Info On Elevation.
     * 
     */
    @SerializedName("ticketingInfoOnElevation")
    @Expose
    public Boolean ticketingInfoOnElevation;


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
