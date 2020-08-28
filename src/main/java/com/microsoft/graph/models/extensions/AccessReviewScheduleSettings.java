// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PatternedRecurrence;
import com.microsoft.graph.models.extensions.AccessReviewApplyAction;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Schedule Settings.
 */
public class AccessReviewScheduleSettings implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Mail Notifications Enabled.
     * 
     */
    @SerializedName("mailNotificationsEnabled")
    @Expose
    public Boolean mailNotificationsEnabled;

    /**
     * The Reminder Notifications Enabled.
     * 
     */
    @SerializedName("reminderNotificationsEnabled")
    @Expose
    public Boolean reminderNotificationsEnabled;

    /**
     * The Justification Required On Approval.
     * 
     */
    @SerializedName("justificationRequiredOnApproval")
    @Expose
    public Boolean justificationRequiredOnApproval;

    /**
     * The Default Decision Enabled.
     * 
     */
    @SerializedName("defaultDecisionEnabled")
    @Expose
    public Boolean defaultDecisionEnabled;

    /**
     * The Default Decision.
     * 
     */
    @SerializedName("defaultDecision")
    @Expose
    public String defaultDecision;

    /**
     * The Instance Duration In Days.
     * 
     */
    @SerializedName("instanceDurationInDays")
    @Expose
    public Integer instanceDurationInDays;

    /**
     * The Recurrence.
     * 
     */
    @SerializedName("recurrence")
    @Expose
    public PatternedRecurrence recurrence;

    /**
     * The Auto Apply Decisions Enabled.
     * 
     */
    @SerializedName("autoApplyDecisionsEnabled")
    @Expose
    public Boolean autoApplyDecisionsEnabled;

    /**
     * The Apply Actions.
     * 
     */
    @SerializedName("applyActions")
    @Expose
    public java.util.List<AccessReviewApplyAction> applyActions;

    /**
     * The Recommendations Enabled.
     * 
     */
    @SerializedName("recommendationsEnabled")
    @Expose
    public Boolean recommendationsEnabled;


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
