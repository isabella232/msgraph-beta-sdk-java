// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AnalyticsActivityType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity Statistics.
 */
public class ActivityStatistics extends Entity implements IJsonBackedObject {


    /**
     * The Activity.
     * 
     */
    @SerializedName("activity")
    @Expose
    public AnalyticsActivityType activity;

    /**
     * The Start Date.
     * 
     */
    @SerializedName("startDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly startDate;

    /**
     * The End Date.
     * 
     */
    @SerializedName("endDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly endDate;

    /**
     * The Time Zone Used.
     * 
     */
    @SerializedName("timeZoneUsed")
    @Expose
    public String timeZoneUsed;

    /**
     * The Duration.
     * 
     */
    @SerializedName("duration")
    @Expose
    public javax.xml.datatype.Duration duration;


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