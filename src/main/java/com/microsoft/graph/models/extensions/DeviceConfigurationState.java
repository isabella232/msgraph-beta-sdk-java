// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.PolicyPlatformType;
import com.microsoft.graph.models.extensions.DeviceConfigurationSettingState;
import com.microsoft.graph.models.generated.ComplianceStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration State.
 */
public class DeviceConfigurationState extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The name of the policy for this policyBase
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Platform Type.
     * Platform type that the policy applies to
     */
    @SerializedName("platformType")
    @Expose
    public PolicyPlatformType platformType;

    /**
     * The Setting Count.
     * Count of how many setting a policy holds
     */
    @SerializedName("settingCount")
    @Expose
    public Integer settingCount;

    /**
     * The Setting States.
     * 
     */
    @SerializedName("settingStates")
    @Expose
    public java.util.List<DeviceConfigurationSettingState> settingStates;

    /**
     * The State.
     * The compliance state of the policy
     */
    @SerializedName("state")
    @Expose
    public ComplianceStatus state;

    /**
     * The User Id.
     * User unique identifier, must be Guid
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The User Principal Name.
     * User Principal Name
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Version.
     * The version of the policy
     */
    @SerializedName("version")
    @Expose
    public Integer version;


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
