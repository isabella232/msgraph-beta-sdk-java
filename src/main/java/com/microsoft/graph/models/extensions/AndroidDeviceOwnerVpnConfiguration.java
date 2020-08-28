// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AndroidVpnConnectionType;
import com.microsoft.graph.models.extensions.VpnProxyServer;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerCertificateProfileBase;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;
import com.microsoft.graph.models.extensions.VpnConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Vpn Configuration.
 */
public class AndroidDeviceOwnerVpnConfiguration extends VpnConfiguration implements IJsonBackedObject {


    /**
     * The Connection Type.
     * Connection type.
     */
    @SerializedName("connectionType")
    @Expose
    public AndroidVpnConnectionType connectionType;

    /**
     * The Proxy Server.
     * Proxy server.
     */
    @SerializedName("proxyServer")
    @Expose
    public VpnProxyServer proxyServer;

    /**
     * The Targeted Package Ids.
     * Targeted App package IDs.
     */
    @SerializedName("targetedPackageIds")
    @Expose
    public java.util.List<String> targetedPackageIds;

    /**
     * The Always On.
     * Whether or not to enable always-on VPN connection.
     */
    @SerializedName("alwaysOn")
    @Expose
    public Boolean alwaysOn;

    /**
     * The Always On Lockdown.
     * If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     */
    @SerializedName("alwaysOnLockdown")
    @Expose
    public Boolean alwaysOnLockdown;

    /**
     * The Identity Certificate.
     * Identity certificate for client authentication when authentication method is certificate.
     */
    @SerializedName("identityCertificate")
    @Expose
    public AndroidDeviceOwnerCertificateProfileBase identityCertificate;

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
