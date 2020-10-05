// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EmailSyncDuration;
import com.microsoft.graph.models.generated.UserEmailSource;
import com.microsoft.graph.models.generated.EmailSyncSchedule;
import com.microsoft.graph.models.extensions.EasEmailProfileConfigurationBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone EASEmail Profile Configuration.
 */
public class WindowsPhoneEASEmailProfileConfiguration extends EasEmailProfileConfigurationBase implements IJsonBackedObject {


    /**
     * The Account Name.
     * Account name.
     */
    @SerializedName("accountName")
    @Expose
    public String accountName;

    /**
     * The Apply Only To Windows Phone81.
     * Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     */
    @SerializedName("applyOnlyToWindowsPhone81")
    @Expose
    public Boolean applyOnlyToWindowsPhone81;

    /**
     * The Duration Of Email To Sync.
     * Duration of email to sync.
     */
    @SerializedName("durationOfEmailToSync")
    @Expose
    public EmailSyncDuration durationOfEmailToSync;

    /**
     * The Email Address Source.
     * Email attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName("emailAddressSource")
    @Expose
    public UserEmailSource emailAddressSource;

    /**
     * The Email Sync Schedule.
     * Email sync schedule.
     */
    @SerializedName("emailSyncSchedule")
    @Expose
    public EmailSyncSchedule emailSyncSchedule;

    /**
     * The Host Name.
     * Exchange location that (URL) that the native mail app connects to.
     */
    @SerializedName("hostName")
    @Expose
    public String hostName;

    /**
     * The Require Ssl.
     * Indicates whether or not to use SSL.
     */
    @SerializedName("requireSsl")
    @Expose
    public Boolean requireSsl;

    /**
     * The Sync Calendar.
     * Whether or not to sync the calendar.
     */
    @SerializedName("syncCalendar")
    @Expose
    public Boolean syncCalendar;

    /**
     * The Sync Contacts.
     * Whether or not to sync contacts.
     */
    @SerializedName("syncContacts")
    @Expose
    public Boolean syncContacts;

    /**
     * The Sync Tasks.
     * Whether or not to sync tasks.
     */
    @SerializedName("syncTasks")
    @Expose
    public Boolean syncTasks;


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
