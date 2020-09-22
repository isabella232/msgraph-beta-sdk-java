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
 * The class for the Device Log Collection Response.
 */
public class DeviceLogCollectionResponse extends Entity implements IJsonBackedObject {


    /**
     * The Error Code.
     * The error code, if any. Valid values -9.22337203685478E+18 to 9.22337203685478E+18
     */
    @SerializedName("errorCode")
    @Expose
    public Long errorCode;

    /**
     * The Expiration Date Time UTC.
     * The DateTime of the expiration of the logs
     */
    @SerializedName("expirationDateTimeUTC")
    @Expose
    public java.util.Calendar expirationDateTimeUTC;

    /**
     * The Initiated By User Principal Name.
     * The UPN for who initiated the request
     */
    @SerializedName("initiatedByUserPrincipalName")
    @Expose
    public String initiatedByUserPrincipalName;

    /**
     * The Managed Device Id.
     * The device Id
     */
    @SerializedName("managedDeviceId")
    @Expose
    public java.util.UUID managedDeviceId;

    /**
     * The Received Date Time UTC.
     * The DateTime the request was received
     */
    @SerializedName("receivedDateTimeUTC")
    @Expose
    public java.util.Calendar receivedDateTimeUTC;

    /**
     * The Requested Date Time UTC.
     * The DateTime of the request
     */
    @SerializedName("requestedDateTimeUTC")
    @Expose
    public java.util.Calendar requestedDateTimeUTC;

    /**
     * The Size.
     * The size of the logs. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName("size")
    @Expose
    public Double size;

    /**
     * The Status.
     * The status of the log collection request
     */
    @SerializedName("status")
    @Expose
    public String status;


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
