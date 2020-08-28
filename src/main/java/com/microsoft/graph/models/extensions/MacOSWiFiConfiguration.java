// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WiFiSecurityType;
import com.microsoft.graph.models.generated.WiFiProxySetting;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSWi Fi Configuration.
 */
public class MacOSWiFiConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Network Name.
     * Network Name
     */
    @SerializedName("networkName")
    @Expose
    public String networkName;

    /**
     * The Ssid.
     * This is the name of the Wi-Fi network that is broadcast to all devices.
     */
    @SerializedName("ssid")
    @Expose
    public String ssid;

    /**
     * The Connect Automatically.
     * Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network.
     */
    @SerializedName("connectAutomatically")
    @Expose
    public Boolean connectAutomatically;

    /**
     * The Connect When Network Name Is Hidden.
     * Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
     */
    @SerializedName("connectWhenNetworkNameIsHidden")
    @Expose
    public Boolean connectWhenNetworkNameIsHidden;

    /**
     * The Wi Fi Security Type.
     * Indicates whether Wi-Fi endpoint uses an EAP based security type.
     */
    @SerializedName("wiFiSecurityType")
    @Expose
    public WiFiSecurityType wiFiSecurityType;

    /**
     * The Proxy Settings.
     * Proxy Type for this Wi-Fi connection
     */
    @SerializedName("proxySettings")
    @Expose
    public WiFiProxySetting proxySettings;

    /**
     * The Proxy Manual Address.
     * IP Address or DNS hostname of the proxy server when manual configuration is selected.
     */
    @SerializedName("proxyManualAddress")
    @Expose
    public String proxyManualAddress;

    /**
     * The Proxy Manual Port.
     * Port of the proxy server when manual configuration is selected.
     */
    @SerializedName("proxyManualPort")
    @Expose
    public Integer proxyManualPort;

    /**
     * The Proxy Automatic Configuration Url.
     * URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.
     */
    @SerializedName("proxyAutomaticConfigurationUrl")
    @Expose
    public String proxyAutomaticConfigurationUrl;

    /**
     * The Pre Shared Key.
     * This is the pre-shared key for WPA Personal Wi-Fi network.
     */
    @SerializedName("preSharedKey")
    @Expose
    public String preSharedKey;


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
