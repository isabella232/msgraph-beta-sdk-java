// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SecurityProviderStatus;
import com.microsoft.graph.models.extensions.Alert;
import com.microsoft.graph.models.extensions.CloudAppSecurityProfile;
import com.microsoft.graph.models.extensions.DomainSecurityProfile;
import com.microsoft.graph.models.extensions.FileSecurityProfile;
import com.microsoft.graph.models.extensions.HostSecurityProfile;
import com.microsoft.graph.models.extensions.IpSecurityProfile;
import com.microsoft.graph.models.extensions.ProviderTenantSetting;
import com.microsoft.graph.models.extensions.SecureScoreControlProfile;
import com.microsoft.graph.models.extensions.SecureScore;
import com.microsoft.graph.models.extensions.SecurityAction;
import com.microsoft.graph.models.extensions.TiIndicator;
import com.microsoft.graph.models.extensions.UserSecurityProfile;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AlertCollectionPage;
import com.microsoft.graph.requests.extensions.CloudAppSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.DomainSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.FileSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.HostSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.IpSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.ProviderTenantSettingCollectionPage;
import com.microsoft.graph.requests.extensions.SecureScoreControlProfileCollectionPage;
import com.microsoft.graph.requests.extensions.SecureScoreCollectionPage;
import com.microsoft.graph.requests.extensions.SecurityActionCollectionPage;
import com.microsoft.graph.requests.extensions.TiIndicatorCollectionPage;
import com.microsoft.graph.requests.extensions.UserSecurityProfileCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security.
 */
public class Security extends Entity implements IJsonBackedObject {


    /**
     * The Provider Status.
     * 
     */
    @SerializedName(value = "providerStatus", alternate = {"ProviderStatus"})
    @Expose
    public java.util.List<SecurityProviderStatus> providerStatus;

    /**
     * The Alerts.
     * Read-only. Nullable.
     */
    @SerializedName(value = "alerts", alternate = {"Alerts"})
    @Expose
    public AlertCollectionPage alerts;

    /**
     * The Cloud App Security Profiles.
     * 
     */
    @SerializedName(value = "cloudAppSecurityProfiles", alternate = {"CloudAppSecurityProfiles"})
    @Expose
    public CloudAppSecurityProfileCollectionPage cloudAppSecurityProfiles;

    /**
     * The Domain Security Profiles.
     * 
     */
    @SerializedName(value = "domainSecurityProfiles", alternate = {"DomainSecurityProfiles"})
    @Expose
    public DomainSecurityProfileCollectionPage domainSecurityProfiles;

    /**
     * The File Security Profiles.
     * 
     */
    @SerializedName(value = "fileSecurityProfiles", alternate = {"FileSecurityProfiles"})
    @Expose
    public FileSecurityProfileCollectionPage fileSecurityProfiles;

    /**
     * The Host Security Profiles.
     * 
     */
    @SerializedName(value = "hostSecurityProfiles", alternate = {"HostSecurityProfiles"})
    @Expose
    public HostSecurityProfileCollectionPage hostSecurityProfiles;

    /**
     * The Ip Security Profiles.
     * 
     */
    @SerializedName(value = "ipSecurityProfiles", alternate = {"IpSecurityProfiles"})
    @Expose
    public IpSecurityProfileCollectionPage ipSecurityProfiles;

    /**
     * The Provider Tenant Settings.
     * 
     */
    @SerializedName(value = "providerTenantSettings", alternate = {"ProviderTenantSettings"})
    @Expose
    public ProviderTenantSettingCollectionPage providerTenantSettings;

    /**
     * The Secure Score Control Profiles.
     * 
     */
    @SerializedName(value = "secureScoreControlProfiles", alternate = {"SecureScoreControlProfiles"})
    @Expose
    public SecureScoreControlProfileCollectionPage secureScoreControlProfiles;

    /**
     * The Secure Scores.
     * 
     */
    @SerializedName(value = "secureScores", alternate = {"SecureScores"})
    @Expose
    public SecureScoreCollectionPage secureScores;

    /**
     * The Security Actions.
     * 
     */
    @SerializedName(value = "securityActions", alternate = {"SecurityActions"})
    @Expose
    public SecurityActionCollectionPage securityActions;

    /**
     * The Ti Indicators.
     * 
     */
    @SerializedName(value = "tiIndicators", alternate = {"TiIndicators"})
    @Expose
    public TiIndicatorCollectionPage tiIndicators;

    /**
     * The User Security Profiles.
     * 
     */
    @SerializedName(value = "userSecurityProfiles", alternate = {"UserSecurityProfiles"})
    @Expose
    public UserSecurityProfileCollectionPage userSecurityProfiles;


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


        if (json.has("alerts")) {
            alerts = serializer.deserializeObject(json.get("alerts").toString(), AlertCollectionPage.class);
        }

        if (json.has("cloudAppSecurityProfiles")) {
            cloudAppSecurityProfiles = serializer.deserializeObject(json.get("cloudAppSecurityProfiles").toString(), CloudAppSecurityProfileCollectionPage.class);
        }

        if (json.has("domainSecurityProfiles")) {
            domainSecurityProfiles = serializer.deserializeObject(json.get("domainSecurityProfiles").toString(), DomainSecurityProfileCollectionPage.class);
        }

        if (json.has("fileSecurityProfiles")) {
            fileSecurityProfiles = serializer.deserializeObject(json.get("fileSecurityProfiles").toString(), FileSecurityProfileCollectionPage.class);
        }

        if (json.has("hostSecurityProfiles")) {
            hostSecurityProfiles = serializer.deserializeObject(json.get("hostSecurityProfiles").toString(), HostSecurityProfileCollectionPage.class);
        }

        if (json.has("ipSecurityProfiles")) {
            ipSecurityProfiles = serializer.deserializeObject(json.get("ipSecurityProfiles").toString(), IpSecurityProfileCollectionPage.class);
        }

        if (json.has("providerTenantSettings")) {
            providerTenantSettings = serializer.deserializeObject(json.get("providerTenantSettings").toString(), ProviderTenantSettingCollectionPage.class);
        }

        if (json.has("secureScoreControlProfiles")) {
            secureScoreControlProfiles = serializer.deserializeObject(json.get("secureScoreControlProfiles").toString(), SecureScoreControlProfileCollectionPage.class);
        }

        if (json.has("secureScores")) {
            secureScores = serializer.deserializeObject(json.get("secureScores").toString(), SecureScoreCollectionPage.class);
        }

        if (json.has("securityActions")) {
            securityActions = serializer.deserializeObject(json.get("securityActions").toString(), SecurityActionCollectionPage.class);
        }

        if (json.has("tiIndicators")) {
            tiIndicators = serializer.deserializeObject(json.get("tiIndicators").toString(), TiIndicatorCollectionPage.class);
        }

        if (json.has("userSecurityProfiles")) {
            userSecurityProfiles = serializer.deserializeObject(json.get("userSecurityProfiles").toString(), UserSecurityProfileCollectionPage.class);
        }
    }
}
