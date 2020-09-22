// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementPartnerAssignment;
import com.microsoft.graph.models.generated.DeviceManagementPartnerAppType;
import com.microsoft.graph.models.generated.DeviceManagementPartnerTenantState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Partner.
 */
public class DeviceManagementPartner extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * Partner display name
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Groups Requiring Partner Enrollment.
     * User groups that specifies whether enrollment is through partner.
     */
    @SerializedName("groupsRequiringPartnerEnrollment")
    @Expose
    public java.util.List<DeviceManagementPartnerAssignment> groupsRequiringPartnerEnrollment;

    /**
     * The Is Configured.
     * Whether device management partner is configured or not
     */
    @SerializedName("isConfigured")
    @Expose
    public Boolean isConfigured;

    /**
     * The Last Heartbeat Date Time.
     * Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
     */
    @SerializedName("lastHeartbeatDateTime")
    @Expose
    public java.util.Calendar lastHeartbeatDateTime;

    /**
     * The Partner App Type.
     * Partner App type. Possible values are: unknown, singleTenantApp, multiTenantApp.
     */
    @SerializedName("partnerAppType")
    @Expose
    public DeviceManagementPartnerAppType partnerAppType;

    /**
     * The Partner State.
     * Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
     */
    @SerializedName("partnerState")
    @Expose
    public DeviceManagementPartnerTenantState partnerState;

    /**
     * The Single Tenant App Id.
     * Partner Single tenant App id
     */
    @SerializedName("singleTenantAppId")
    @Expose
    public String singleTenantAppId;

    /**
     * The When Partner Devices Will Be Marked As Non Compliant.
     * DateTime in UTC when PartnerDevices will be marked as NonCompliant. This will become obselete soon.
     */
    @SerializedName("whenPartnerDevicesWillBeMarkedAsNonCompliant")
    @Expose
    public java.util.Calendar whenPartnerDevicesWillBeMarkedAsNonCompliant;

    /**
     * The When Partner Devices Will Be Marked As Non Compliant Date Time.
     * DateTime in UTC when PartnerDevices will be marked as NonCompliant
     */
    @SerializedName("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime")
    @Expose
    public java.util.Calendar whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime;

    /**
     * The When Partner Devices Will Be Removed.
     * DateTime in UTC when PartnerDevices will be removed. This will become obselete soon.
     */
    @SerializedName("whenPartnerDevicesWillBeRemoved")
    @Expose
    public java.util.Calendar whenPartnerDevicesWillBeRemoved;

    /**
     * The When Partner Devices Will Be Removed Date Time.
     * DateTime in UTC when PartnerDevices will be removed
     */
    @SerializedName("whenPartnerDevicesWillBeRemovedDateTime")
    @Expose
    public java.util.Calendar whenPartnerDevicesWillBeRemovedDateTime;


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
