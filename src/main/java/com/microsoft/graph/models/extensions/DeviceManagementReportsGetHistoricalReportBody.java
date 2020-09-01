// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Historical Report Body.
 */
public class DeviceManagementReportsGetHistoricalReportBody {

    /**
     * The name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The select.
     * 
     */
    @SerializedName("select")
    @Expose
    public java.util.List<String> select;

    /**
     * The search.
     * 
     */
    @SerializedName("search")
    @Expose
    public String search;

    /**
     * The group By.
     * 
     */
    @SerializedName("groupBy")
    @Expose
    public java.util.List<String> groupBy;

    /**
     * The order By.
     * 
     */
    @SerializedName("orderBy")
    @Expose
    public java.util.List<String> orderBy;

    /**
     * The skip.
     * 
     */
    @SerializedName("skip")
    @Expose
    public Integer skip;

    /**
     * The top.
     * 
     */
    @SerializedName("top")
    @Expose
    public Integer top;

    /**
     * The filter.
     * 
     */
    @SerializedName("filter")
    @Expose
    public String filter;


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