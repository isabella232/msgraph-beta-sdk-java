// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WiFiAuthenticationMethod;
import com.microsoft.graph.models.generated.AndroidEapType;
import com.microsoft.graph.models.generated.NonEapAuthenticationMethodForEapTtlsType;
import com.microsoft.graph.models.generated.NonEapAuthenticationMethodForPeap;
import com.microsoft.graph.models.extensions.AndroidCertificateProfileBase;
import com.microsoft.graph.models.extensions.AndroidTrustedRootCertificate;
import com.microsoft.graph.models.extensions.AndroidWiFiConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Enterprise Wi Fi Configuration.
 */
public class AndroidEnterpriseWiFiConfiguration extends AndroidWiFiConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS.
     */
    @SerializedName("authenticationMethod")
    @Expose
    public WiFiAuthenticationMethod authenticationMethod;

    /**
     * The Eap Type.
     * Indicates the type of EAP protocol set on the Wi-Fi endpoint (router).
     */
    @SerializedName("eapType")
    @Expose
    public AndroidEapType eapType;

    /**
     * The Inner Authentication Protocol For Eap Ttls.
     * Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password.
     */
    @SerializedName("innerAuthenticationProtocolForEapTtls")
    @Expose
    public NonEapAuthenticationMethodForEapTtlsType innerAuthenticationProtocolForEapTtls;

    /**
     * The Inner Authentication Protocol For Peap.
     * Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password.
     */
    @SerializedName("innerAuthenticationProtocolForPeap")
    @Expose
    public NonEapAuthenticationMethodForPeap innerAuthenticationProtocolForPeap;

    /**
     * The Outer Identity Privacy Temporary Value.
     * Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network.
     */
    @SerializedName("outerIdentityPrivacyTemporaryValue")
    @Expose
    public String outerIdentityPrivacyTemporaryValue;

    /**
     * The Password Format String.
     * Password format string used to build the password to connect to wifi
     */
    @SerializedName("passwordFormatString")
    @Expose
    public String passwordFormatString;

    /**
     * The Pre Shared Key.
     * PreSharedKey used to build the password to connect to wifi
     */
    @SerializedName("preSharedKey")
    @Expose
    public String preSharedKey;

    /**
     * The Username Format String.
     * Username format string used to build the username to connect to wifi
     */
    @SerializedName("usernameFormatString")
    @Expose
    public String usernameFormatString;

    /**
     * The Identity Certificate For Client Authentication.
     * Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection.
     */
    @SerializedName("identityCertificateForClientAuthentication")
    @Expose
    public AndroidCertificateProfileBase identityCertificateForClientAuthentication;

    /**
     * The Root Certificate For Server Validation.
     * Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt.
     */
    @SerializedName("rootCertificateForServerValidation")
    @Expose
    public AndroidTrustedRootCertificate rootCertificateForServerValidation;


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
