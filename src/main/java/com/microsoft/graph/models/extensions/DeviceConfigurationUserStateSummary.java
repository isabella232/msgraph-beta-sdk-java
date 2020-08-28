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
 * The class for the Device Configuration User State Summary.
 */
public class DeviceConfigurationUserStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The Unknown User Count.
     * Number of unknown users
     */
    @SerializedName("unknownUserCount")
    @Expose
    public Integer unknownUserCount;

    /**
     * The Not Applicable User Count.
     * Number of not applicable users
     */
    @SerializedName("notApplicableUserCount")
    @Expose
    public Integer notApplicableUserCount;

    /**
     * The Compliant User Count.
     * Number of compliant users
     */
    @SerializedName("compliantUserCount")
    @Expose
    public Integer compliantUserCount;

    /**
     * The Remediated User Count.
     * Number of remediated users
     */
    @SerializedName("remediatedUserCount")
    @Expose
    public Integer remediatedUserCount;

    /**
     * The Non Compliant User Count.
     * Number of NonCompliant users
     */
    @SerializedName("nonCompliantUserCount")
    @Expose
    public Integer nonCompliantUserCount;

    /**
     * The Error User Count.
     * Number of error users
     */
    @SerializedName("errorUserCount")
    @Expose
    public Integer errorUserCount;

    /**
     * The Conflict User Count.
     * Number of conflict users
     */
    @SerializedName("conflictUserCount")
    @Expose
    public Integer conflictUserCount;


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
