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
 * The class for the User Experience Analytics Device Startup Process.
 */
public class UserExperienceAnalyticsDeviceStartupProcess extends Entity implements IJsonBackedObject {


    /**
     * The Managed Device Id.
     * The user experience analytics device id.
     */
    @SerializedName("managedDeviceId")
    @Expose
    public String managedDeviceId;

    /**
     * The Process Name.
     * User experience analytics device startup process name.
     */
    @SerializedName("processName")
    @Expose
    public String processName;

    /**
     * The Product Name.
     * The user experience analytics device startup process product name.
     */
    @SerializedName("productName")
    @Expose
    public String productName;

    /**
     * The Publisher.
     * The User experience analytics device startup process publisher.
     */
    @SerializedName("publisher")
    @Expose
    public String publisher;

    /**
     * The Startup Impact In Ms.
     * User experience analytics device startup process impact in milliseconds.
     */
    @SerializedName("startupImpactInMs")
    @Expose
    public Integer startupImpactInMs;


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
