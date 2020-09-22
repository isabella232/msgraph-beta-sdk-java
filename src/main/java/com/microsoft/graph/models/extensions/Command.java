// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PayloadRequest;
import com.microsoft.graph.models.extensions.PayloadResponse;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Command.
 */
public class Command extends Entity implements IJsonBackedObject {


    /**
     * The App Service Name.
     * 
     */
    @SerializedName("AppServiceName")
    @Expose
    public String appServiceName;

    /**
     * The Error.
     * 
     */
    @SerializedName("Error")
    @Expose
    public String error;

    /**
     * The Package Family Name.
     * 
     */
    @SerializedName("PackageFamilyName")
    @Expose
    public String packageFamilyName;

    /**
     * The Payload.
     * 
     */
    @SerializedName("Payload")
    @Expose
    public PayloadRequest payload;

    /**
     * The Permission Ticket.
     * 
     */
    @SerializedName("PermissionTicket")
    @Expose
    public String permissionTicket;

    /**
     * The Post Back Uri.
     * 
     */
    @SerializedName("PostBackUri")
    @Expose
    public String postBackUri;

    /**
     * The Status.
     * 
     */
    @SerializedName("Status")
    @Expose
    public String status;

    /**
     * The Type.
     * 
     */
    @SerializedName("Type")
    @Expose
    public String type;

    /**
     * The Responsepayload.
     * 
     */
    @SerializedName("responsepayload")
    @Expose
    public PayloadResponse responsepayload;


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
