// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.Location;
import com.microsoft.graph.models.extensions.EventMessage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Request.
 */
public class EventMessageRequest extends EventMessage implements IJsonBackedObject {


    /**
     * The Allow New Time Proposals.
     * True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default is true.
     */
    @SerializedName("allowNewTimeProposals")
    @Expose
    public Boolean allowNewTimeProposals;

    /**
     * The Previous End Date Time.
     * If the meeting update changes the meeting end time, this property specifies the previous meeting end time.
     */
    @SerializedName("previousEndDateTime")
    @Expose
    public DateTimeTimeZone previousEndDateTime;

    /**
     * The Previous Location.
     * If the meeting update changes the meeting location, this property specifies the previous meeting location.
     */
    @SerializedName("previousLocation")
    @Expose
    public Location previousLocation;

    /**
     * The Previous Start Date Time.
     * If the meeting update changes the meeting start time, this property specifies the previous meeting start time.
     */
    @SerializedName("previousStartDateTime")
    @Expose
    public DateTimeTimeZone previousStartDateTime;

    /**
     * The Response Requested.
     * Set to true if the sender would like the invitee to send a response to the requested meeting.
     */
    @SerializedName("responseRequested")
    @Expose
    public Boolean responseRequested;


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
