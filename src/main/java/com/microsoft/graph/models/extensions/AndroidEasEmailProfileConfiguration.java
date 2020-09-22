// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EasAuthenticationMethod;
import com.microsoft.graph.models.generated.EmailSyncDuration;
import com.microsoft.graph.models.generated.UserEmailSource;
import com.microsoft.graph.models.generated.EmailSyncSchedule;
import com.microsoft.graph.models.generated.DomainNameSource;
import com.microsoft.graph.models.generated.AndroidUsernameSource;
import com.microsoft.graph.models.extensions.AndroidCertificateProfileBase;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Eas Email Profile Configuration.
 */
public class AndroidEasEmailProfileConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Account Name.
     * Exchange ActiveSync account name, displayed to users as name of EAS (this) profile.
     */
    @SerializedName("accountName")
    @Expose
    public String accountName;

    /**
     * The Authentication Method.
     * Authentication method for Exchange ActiveSync.
     */
    @SerializedName("authenticationMethod")
    @Expose
    public EasAuthenticationMethod authenticationMethod;

    /**
     * The Custom Domain Name.
     * Custom domain name value used while generating an email profile before installing on the device.
     */
    @SerializedName("customDomainName")
    @Expose
    public String customDomainName;

    /**
     * The Duration Of Email To Sync.
     * Duration of time email should be synced to.
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
     * Exchange location (URL) that the native mail app connects to.
     */
    @SerializedName("hostName")
    @Expose
    public String hostName;

    /**
     * The Require Smime.
     * Indicates whether or not to use S/MIME certificate.
     */
    @SerializedName("requireSmime")
    @Expose
    public Boolean requireSmime;

    /**
     * The Require Ssl.
     * Indicates whether or not to use SSL.
     */
    @SerializedName("requireSsl")
    @Expose
    public Boolean requireSsl;

    /**
     * The Sync Calendar.
     * Toggles syncing the calendar. If set to false calendar is turned off on the device.
     */
    @SerializedName("syncCalendar")
    @Expose
    public Boolean syncCalendar;

    /**
     * The Sync Contacts.
     * Toggles syncing contacts. If set to false contacts are turned off on the device.
     */
    @SerializedName("syncContacts")
    @Expose
    public Boolean syncContacts;

    /**
     * The Sync Notes.
     * Toggles syncing notes. If set to false notes are turned off on the device.
     */
    @SerializedName("syncNotes")
    @Expose
    public Boolean syncNotes;

    /**
     * The Sync Tasks.
     * Toggles syncing tasks. If set to false tasks are turned off on the device.
     */
    @SerializedName("syncTasks")
    @Expose
    public Boolean syncTasks;

    /**
     * The User Domain Name Source.
     * UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName("userDomainNameSource")
    @Expose
    public DomainNameSource userDomainNameSource;

    /**
     * The Username Source.
     * Username attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName("usernameSource")
    @Expose
    public AndroidUsernameSource usernameSource;

    /**
     * The Identity Certificate.
     * Identity certificate.
     */
    @SerializedName("identityCertificate")
    @Expose
    public AndroidCertificateProfileBase identityCertificate;

    /**
     * The Smime Signing Certificate.
     * S/MIME signing certificate.
     */
    @SerializedName("smimeSigningCertificate")
    @Expose
    public AndroidCertificateProfileBase smimeSigningCertificate;


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
