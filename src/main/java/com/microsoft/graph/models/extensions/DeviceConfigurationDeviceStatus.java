// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ComplianceStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Device Status.
 */
public class DeviceConfigurationDeviceStatus extends Entity implements IJsonBackedObject {


    /**
     * The Compliance Grace Period Expiration Date Time.
     * The DateTime when device compliance grace period expires
     */
    @SerializedName("complianceGracePeriodExpirationDateTime")
    @Expose
    public java.util.Calendar complianceGracePeriodExpirationDateTime;

    /**
     * The Device Display Name.
     * Device name of the DevicePolicyStatus.
     */
    @SerializedName("deviceDisplayName")
    @Expose
    public String deviceDisplayName;

    /**
     * The Device Model.
     * The device model that is being reported
     */
    @SerializedName("deviceModel")
    @Expose
    public String deviceModel;

    /**
     * The Last Reported Date Time.
     * Last modified date time of the policy report.
     */
    @SerializedName("lastReportedDateTime")
    @Expose
    public java.util.Calendar lastReportedDateTime;

    /**
     * The Platform.
     * Platform of the device that is being reported
     */
    @SerializedName("platform")
    @Expose
    public Integer platform;

    /**
     * The Status.
     * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned.
     */
    @SerializedName("status")
    @Expose
    public ComplianceStatus status;

    /**
     * The User Name.
     * The User Name that is being reported
     */
    @SerializedName("userName")
    @Expose
    public String userName;

    /**
     * The User Principal Name.
     * UserPrincipalName.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;


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
