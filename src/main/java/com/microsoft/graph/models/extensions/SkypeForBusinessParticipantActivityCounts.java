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
 * The class for the Skype For Business Participant Activity Counts.
 */
public class SkypeForBusinessParticipantActivityCounts extends Entity implements IJsonBackedObject {


    /**
     * The App Sharing.
     * 
     */
    @SerializedName("appSharing")
    @Expose
    public Long appSharing;

    /**
     * The Audio Video.
     * 
     */
    @SerializedName("audioVideo")
    @Expose
    public Long audioVideo;

    /**
     * The Dial In Out3rd Party.
     * 
     */
    @SerializedName("dialInOut3rdParty")
    @Expose
    public Long dialInOut3rdParty;

    /**
     * The Im.
     * 
     */
    @SerializedName("im")
    @Expose
    public Long im;

    /**
     * The Report Date.
     * 
     */
    @SerializedName("reportDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportDate;

    /**
     * The Report Period.
     * 
     */
    @SerializedName("reportPeriod")
    @Expose
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName("reportRefreshDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Web.
     * 
     */
    @SerializedName("web")
    @Expose
    public Long web;


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
