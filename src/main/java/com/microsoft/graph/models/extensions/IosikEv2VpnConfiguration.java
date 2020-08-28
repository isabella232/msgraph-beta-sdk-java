// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IosVpnSecurityAssociationParameters;
import com.microsoft.graph.models.generated.VpnClientAuthenticationType;
import com.microsoft.graph.models.generated.VpnDeadPeerDetectionRate;
import com.microsoft.graph.models.generated.VpnLocalIdentifier;
import com.microsoft.graph.models.generated.VpnServerCertificateType;
import com.microsoft.graph.models.extensions.AppleVpnAlwaysOnConfiguration;
import com.microsoft.graph.models.extensions.IosVpnConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Iosik Ev2Vpn Configuration.
 */
public class IosikEv2VpnConfiguration extends IosVpnConfiguration implements IJsonBackedObject {


    /**
     * The Child Security Association Parameters.
     * Child Security Association Parameters
     */
    @SerializedName("childSecurityAssociationParameters")
    @Expose
    public IosVpnSecurityAssociationParameters childSecurityAssociationParameters;

    /**
     * The Client Authentication Type.
     * Type of Client Authentication the VPN client will use.
     */
    @SerializedName("clientAuthenticationType")
    @Expose
    public VpnClientAuthenticationType clientAuthenticationType;

    /**
     * The Dead Peer Detection Rate.
     * Determine how often to check if a peer connection is still active. 
     */
    @SerializedName("deadPeerDetectionRate")
    @Expose
    public VpnDeadPeerDetectionRate deadPeerDetectionRate;

    /**
     * The Disable Mobility And Multihoming.
     * Disable MOBIKE
     */
    @SerializedName("disableMobilityAndMultihoming")
    @Expose
    public Boolean disableMobilityAndMultihoming;

    /**
     * The Disable Redirect.
     * Disable Redirect
     */
    @SerializedName("disableRedirect")
    @Expose
    public Boolean disableRedirect;

    /**
     * The Enable Certificate Revocation Check.
     * Enables a best-effort revocation check; server response timeouts will not cause it to fail
     */
    @SerializedName("enableCertificateRevocationCheck")
    @Expose
    public Boolean enableCertificateRevocationCheck;

    /**
     * The Enable EAP.
     * Enables EAP only authentication
     */
    @SerializedName("enableEAP")
    @Expose
    public Boolean enableEAP;

    /**
     * The Enable Perfect Forward Secrecy.
     * Enable Perfect Forward Secrecy (PFS).
     */
    @SerializedName("enablePerfectForwardSecrecy")
    @Expose
    public Boolean enablePerfectForwardSecrecy;

    /**
     * The Enable Use Internal Subnet Attributes.
     * Enable Use Internal Subnet Attributes.
     */
    @SerializedName("enableUseInternalSubnetAttributes")
    @Expose
    public Boolean enableUseInternalSubnetAttributes;

    /**
     * The Local Identifier.
     * Method of identifying the client that is trying to connect via VPN. 
     */
    @SerializedName("localIdentifier")
    @Expose
    public VpnLocalIdentifier localIdentifier;

    /**
     * The Remote Identifier.
     * Address of the IKEv2 server. Must be a FQDN, UserFQDN, network address, or ASN1DN
     */
    @SerializedName("remoteIdentifier")
    @Expose
    public String remoteIdentifier;

    /**
     * The Security Association Parameters.
     * Security Association Parameters
     */
    @SerializedName("securityAssociationParameters")
    @Expose
    public IosVpnSecurityAssociationParameters securityAssociationParameters;

    /**
     * The Server Certificate Common Name.
     * Common name of the IKEv2 Server Certificate used in Server Authentication
     */
    @SerializedName("serverCertificateCommonName")
    @Expose
    public String serverCertificateCommonName;

    /**
     * The Server Certificate Issuer Common Name.
     * Issuer Common name of the IKEv2 Server Certificate issuer used in Authentication
     */
    @SerializedName("serverCertificateIssuerCommonName")
    @Expose
    public String serverCertificateIssuerCommonName;

    /**
     * The Server Certificate Type.
     * The type of certificate the VPN server will present to the VPN client for authentication.
     */
    @SerializedName("serverCertificateType")
    @Expose
    public VpnServerCertificateType serverCertificateType;

    /**
     * The Shared Secret.
     * Used when Shared Secret Authentication is selected
     */
    @SerializedName("sharedSecret")
    @Expose
    public String sharedSecret;

    /**
     * The Tls Maximum Version.
     * The maximum TLS version to be used with EAP-TLS authentication
     */
    @SerializedName("tlsMaximumVersion")
    @Expose
    public String tlsMaximumVersion;

    /**
     * The Tls Minimum Version.
     * The minimum TLS version to be used with EAP-TLS authentication
     */
    @SerializedName("tlsMinimumVersion")
    @Expose
    public String tlsMinimumVersion;

    /**
     * The Allow Default Security Association Parameters.
     * Allows the use of security association parameters by setting all parameters to the device's default unless explicitly specified.
     */
    @SerializedName("allowDefaultSecurityAssociationParameters")
    @Expose
    public Boolean allowDefaultSecurityAssociationParameters;

    /**
     * The Allow Default Child Security Association Parameters.
     * Allows the use of child security association parameters by setting all parameters to the device's default unless explicitly specified.
     */
    @SerializedName("allowDefaultChildSecurityAssociationParameters")
    @Expose
    public Boolean allowDefaultChildSecurityAssociationParameters;

    /**
     * The Always On Configuration.
     * AlwaysOn Configuration
     */
    @SerializedName("alwaysOnConfiguration")
    @Expose
    public AppleVpnAlwaysOnConfiguration alwaysOnConfiguration;

    /**
     * The Enable Always On Configuration.
     * Determines if Always on VPN is enabled
     */
    @SerializedName("enableAlwaysOnConfiguration")
    @Expose
    public Boolean enableAlwaysOnConfiguration;


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
