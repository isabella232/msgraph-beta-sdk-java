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
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Yammer Device Usage User Detail.
 */
public class YammerDeviceUsageUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName("reportRefreshDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The User State.
     * 
     */
    @SerializedName("userState")
    @Expose
    public String userState;

    /**
     * The State Change Date.
     * 
     */
    @SerializedName("stateChangeDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly stateChangeDate;

    /**
     * The Last Activity Date.
     * 
     */
    @SerializedName("lastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly lastActivityDate;

    /**
     * The Used Web.
     * 
     */
    @SerializedName("usedWeb")
    @Expose
    public Boolean usedWeb;

    /**
     * The Used Windows Phone.
     * 
     */
    @SerializedName("usedWindowsPhone")
    @Expose
    public Boolean usedWindowsPhone;

    /**
     * The Used Android Phone.
     * 
     */
    @SerializedName("usedAndroidPhone")
    @Expose
    public Boolean usedAndroidPhone;

    /**
     * The Usedi Phone.
     * 
     */
    @SerializedName("usediPhone")
    @Expose
    public Boolean usediPhone;

    /**
     * The Usedi Pad.
     * 
     */
    @SerializedName("usediPad")
    @Expose
    public Boolean usediPad;

    /**
     * The Used Others.
     * 
     */
    @SerializedName("usedOthers")
    @Expose
    public Boolean usedOthers;

    /**
     * The Report Period.
     * 
     */
    @SerializedName("reportPeriod")
    @Expose
    public String reportPeriod;


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
