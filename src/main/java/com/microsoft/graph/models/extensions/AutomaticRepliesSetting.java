// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AutomaticRepliesStatus;
import com.microsoft.graph.models.generated.ExternalAudienceScope;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Automatic Replies Setting.
 */
public class AutomaticRepliesSetting implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Status.
     * Configurations status for automatic replies. The possible values are: disabled, alwaysEnabled, scheduled.
     */
    @SerializedName("status")
    @Expose
    public AutomaticRepliesStatus status;

    /**
     * The External Audience.
     * The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status is AlwaysEnabled or Scheduled. The possible values are: none, contactsOnly, all.
     */
    @SerializedName("externalAudience")
    @Expose
    public ExternalAudienceScope externalAudience;

    /**
     * The Scheduled Start Date Time.
     * The date and time that automatic replies are set to begin, if Status is set to Scheduled.
     */
    @SerializedName("scheduledStartDateTime")
    @Expose
    public DateTimeTimeZone scheduledStartDateTime;

    /**
     * The Scheduled End Date Time.
     * The date and time that automatic replies are set to end, if Status is set to Scheduled.
     */
    @SerializedName("scheduledEndDateTime")
    @Expose
    public DateTimeTimeZone scheduledEndDateTime;

    /**
     * The Internal Reply Message.
     * The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled or Scheduled.
     */
    @SerializedName("internalReplyMessage")
    @Expose
    public String internalReplyMessage;

    /**
     * The External Reply Message.
     * The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
     */
    @SerializedName("externalReplyMessage")
    @Expose
    public String externalReplyMessage;


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