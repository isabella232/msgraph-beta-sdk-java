// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AppListItem;
import com.microsoft.graph.models.extensions.IosCertificateProfileBase;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;
import com.microsoft.graph.models.extensions.AppleVpnConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpn Configuration.
 */
public class IosVpnConfiguration extends AppleVpnConfiguration implements IJsonBackedObject {


    /**
     * The User Domain.
     * Zscaler only. Enter a static domain to pre-populate the login field with in the Zscaler app. If this is left empty, the user's Azure Active Directory domain will be used instead.
     */
    @SerializedName("userDomain")
    @Expose
    public String userDomain;

    /**
     * The Strict Enforcement.
     * Zscaler only. Blocks network traffic until the user signs into Zscaler app. "True" means traffic is blocked.
     */
    @SerializedName("strictEnforcement")
    @Expose
    public Boolean strictEnforcement;

    /**
     * The Cloud Name.
     * Zscaler only. Zscaler cloud which the user is assigned to.
     */
    @SerializedName("cloudName")
    @Expose
    public String cloudName;

    /**
     * The Exclude List.
     * Zscaler only. List of network addresses which are not sent through the Zscaler cloud.
     */
    @SerializedName("excludeList")
    @Expose
    public java.util.List<String> excludeList;

    /**
     * The Targeted Mobile Apps.
     * Targeted mobile apps. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("targetedMobileApps")
    @Expose
    public java.util.List<AppListItem> targetedMobileApps;

    /**
     * The Identity Certificate.
     * Identity certificate for client authentication when authentication method is certificate.
     */
    @SerializedName("identityCertificate")
    @Expose
    public IosCertificateProfileBase identityCertificate;

    /**
     * The Derived Credential Settings.
     * Tenant level settings for the Derived Credentials to be used for authentication.
     */
    @SerializedName("derivedCredentialSettings")
    @Expose
    public DeviceManagementDerivedCredentialSettings derivedCredentialSettings;


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
