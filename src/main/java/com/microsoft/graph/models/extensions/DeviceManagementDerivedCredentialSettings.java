// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceManagementDerivedCredentialIssuer;
import com.microsoft.graph.models.generated.DeviceManagementDerivedCredentialNotificationType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Derived Credential Settings.
 */
public class DeviceManagementDerivedCredentialSettings extends Entity implements IJsonBackedObject {


    /**
     * The Help Url.
     * The URL that will be accessible to end users as they retrieve a derived credential using the Company Portal.
     */
    @SerializedName("helpUrl")
    @Expose
    public String helpUrl;

    /**
     * The Display Name.
     * The display name for the profile.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Issuer.
     * The derived credential provider to use.
     */
    @SerializedName("issuer")
    @Expose
    public DeviceManagementDerivedCredentialIssuer issuer;

    /**
     * The Notification Type.
     * The methods used to inform the end user to open Company Portal to deliver Wi-Fi, VPN, or email profiles that use certificates to the device.
     */
    @SerializedName("notificationType")
    @Expose
    public EnumSet<DeviceManagementDerivedCredentialNotificationType> notificationType;


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