// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ConditionalAccessApplications;
import com.microsoft.graph.models.generated.ConditionalAccessClientApp;
import com.microsoft.graph.models.extensions.ConditionalAccessDevices;
import com.microsoft.graph.models.extensions.ConditionalAccessDeviceStates;
import com.microsoft.graph.models.extensions.ConditionalAccessLocations;
import com.microsoft.graph.models.extensions.ConditionalAccessPlatforms;
import com.microsoft.graph.models.generated.RiskLevel;
import com.microsoft.graph.models.extensions.ConditionalAccessUsers;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Condition Set.
 */
public class ConditionalAccessConditionSet implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Applications.
     * Applications and user actions included in and excluded from the policy. Required.
     */
    @SerializedName("applications")
    @Expose
    public ConditionalAccessApplications applications;

    /**
     * The Client App Types.
     * Client application types included in the policy. Possible values are: all, browser, mobileAppsAndDesktopClients, exchangeActiveSync, easSupported, other.
     */
    @SerializedName("clientAppTypes")
    @Expose
    public java.util.List<ConditionalAccessClientApp> clientAppTypes;

    /**
     * The Devices.
     * 
     */
    @SerializedName("devices")
    @Expose
    public ConditionalAccessDevices devices;

    /**
     * The Device States.
     * 
     */
    @SerializedName("deviceStates")
    @Expose
    public ConditionalAccessDeviceStates deviceStates;

    /**
     * The Locations.
     * Locations included in and excluded from the policy.
     */
    @SerializedName("locations")
    @Expose
    public ConditionalAccessLocations locations;

    /**
     * The Platforms.
     * Platforms included in and excluded from the policy.
     */
    @SerializedName("platforms")
    @Expose
    public ConditionalAccessPlatforms platforms;

    /**
     * The Sign In Risk Levels.
     * Risk levels included in the policy. Possible values are: low, medium, high, none.
     */
    @SerializedName("signInRiskLevels")
    @Expose
    public java.util.List<RiskLevel> signInRiskLevels;

    /**
     * The User Risk Levels.
     * 
     */
    @SerializedName("userRiskLevels")
    @Expose
    public java.util.List<RiskLevel> userRiskLevels;

    /**
     * The Users.
     * Users, groups, and roles included in and excluded from the policy. Required.
     */
    @SerializedName("users")
    @Expose
    public ConditionalAccessUsers users;


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
