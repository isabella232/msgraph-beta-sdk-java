// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.Location;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Reminder.
 */
public class Reminder implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Change Key.
     * Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object.
     */
    @SerializedName(value = "changeKey", alternate = {"ChangeKey"})
    @Expose
    public String changeKey;

    /**
     * The Event End Time.
     * The date, time and time zone that the event ends.
     */
    @SerializedName(value = "eventEndTime", alternate = {"EventEndTime"})
    @Expose
    public DateTimeTimeZone eventEndTime;

    /**
     * The Event Id.
     * The unique ID of the event. Read only.
     */
    @SerializedName(value = "eventId", alternate = {"EventId"})
    @Expose
    public String eventId;

    /**
     * The Event Location.
     * The location of the event.
     */
    @SerializedName(value = "eventLocation", alternate = {"EventLocation"})
    @Expose
    public Location eventLocation;

    /**
     * The Event Start Time.
     * The date, time, and time zone that the event starts.
     */
    @SerializedName(value = "eventStartTime", alternate = {"EventStartTime"})
    @Expose
    public DateTimeTimeZone eventStartTime;

    /**
     * The Event Subject.
     * The text of the event's subject line.
     */
    @SerializedName(value = "eventSubject", alternate = {"EventSubject"})
    @Expose
    public String eventSubject;

    /**
     * The Event Web Link.
     * The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL cannot be accessed from within an iFrame.
     */
    @SerializedName(value = "eventWebLink", alternate = {"EventWebLink"})
    @Expose
    public String eventWebLink;

    /**
     * The Reminder Fire Time.
     * The date, time, and time zone that the reminder is set to occur.
     */
    @SerializedName(value = "reminderFireTime", alternate = {"ReminderFireTime"})
    @Expose
    public DateTimeTimeZone reminderFireTime;


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
