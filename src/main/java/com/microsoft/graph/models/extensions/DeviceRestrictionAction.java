// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RestrictionAction;
import com.microsoft.graph.models.generated.RestrictionTrigger;
import com.microsoft.graph.models.extensions.DlpActionInfo;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Restriction Action.
 */
public class DeviceRestrictionAction extends DlpActionInfo implements IJsonBackedObject {


    /**
     * The Message.
     * 
     */
    @SerializedName("message")
    @Expose
    public String message;

    /**
     * The Restriction Action.
     * 
     */
    @SerializedName("restrictionAction")
    @Expose
    public RestrictionAction restrictionAction;

    /**
     * The Triggers.
     * 
     */
    @SerializedName("triggers")
    @Expose
    public java.util.List<RestrictionTrigger> triggers;


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
