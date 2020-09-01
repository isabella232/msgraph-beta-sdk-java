// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ReputationCategory;
import com.microsoft.graph.models.extensions.DomainRegistrant;
import com.microsoft.graph.models.extensions.SecurityVendorInformation;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Security Profile.
 */
public class DomainSecurityProfile extends Entity implements IJsonBackedObject {


    /**
     * The Activity Group Names.
     * 
     */
    @SerializedName("activityGroupNames")
    @Expose
    public java.util.List<String> activityGroupNames;

    /**
     * The Azure Subscription Id.
     * 
     */
    @SerializedName("azureSubscriptionId")
    @Expose
    public String azureSubscriptionId;

    /**
     * The Azure Tenant Id.
     * 
     */
    @SerializedName("azureTenantId")
    @Expose
    public String azureTenantId;

    /**
     * The Count Hits.
     * 
     */
    @SerializedName("countHits")
    @Expose
    public Integer countHits;

    /**
     * The Count In Org.
     * 
     */
    @SerializedName("countInOrg")
    @Expose
    public Integer countInOrg;

    /**
     * The Domain Categories.
     * 
     */
    @SerializedName("domainCategories")
    @Expose
    public java.util.List<ReputationCategory> domainCategories;

    /**
     * The Domain Registered Date Time.
     * 
     */
    @SerializedName("domainRegisteredDateTime")
    @Expose
    public java.util.Calendar domainRegisteredDateTime;

    /**
     * The First Seen Date Time.
     * 
     */
    @SerializedName("firstSeenDateTime")
    @Expose
    public java.util.Calendar firstSeenDateTime;

    /**
     * The Last Seen Date Time.
     * 
     */
    @SerializedName("lastSeenDateTime")
    @Expose
    public java.util.Calendar lastSeenDateTime;

    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Registrant.
     * 
     */
    @SerializedName("registrant")
    @Expose
    public DomainRegistrant registrant;

    /**
     * The Risk Score.
     * 
     */
    @SerializedName("riskScore")
    @Expose
    public String riskScore;

    /**
     * The Tags.
     * 
     */
    @SerializedName("tags")
    @Expose
    public java.util.List<String> tags;

    /**
     * The Vendor Information.
     * 
     */
    @SerializedName("vendorInformation")
    @Expose
    public SecurityVendorInformation vendorInformation;


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