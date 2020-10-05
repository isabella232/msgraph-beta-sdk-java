// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.VpnOnDemandRuleConnectionAction;
import com.microsoft.graph.models.generated.VpnOnDemandRuleConnectionDomainAction;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpn On Demand Rule.
 */
public class VpnOnDemandRule implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Action.
     * Action.
     */
    @SerializedName("action")
    @Expose
    public VpnOnDemandRuleConnectionAction action;

    /**
     * The Dns Search Domains.
     * DNS Search Domains.
     */
    @SerializedName("dnsSearchDomains")
    @Expose
    public java.util.List<String> dnsSearchDomains;

    /**
     * The Domain Action.
     * Domain Action (Only applicable when Action is evaluate connection).
     */
    @SerializedName("domainAction")
    @Expose
    public VpnOnDemandRuleConnectionDomainAction domainAction;

    /**
     * The Domains.
     * Domains (Only applicable when Action is evaluate connection).
     */
    @SerializedName("domains")
    @Expose
    public java.util.List<String> domains;

    /**
     * The Probe Required Url.
     * Probe Required Url (Only applicable when Action is evaluate connection and DomainAction is connect if needed).
     */
    @SerializedName("probeRequiredUrl")
    @Expose
    public String probeRequiredUrl;

    /**
     * The Probe Url.
     * A URL to probe. If this URL is successfully fetched (returning a 200 HTTP status code) without redirection, this rule matches.
     */
    @SerializedName("probeUrl")
    @Expose
    public String probeUrl;

    /**
     * The Ssids.
     * Network Service Set Identifiers (SSIDs).
     */
    @SerializedName("ssids")
    @Expose
    public java.util.List<String> ssids;


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
