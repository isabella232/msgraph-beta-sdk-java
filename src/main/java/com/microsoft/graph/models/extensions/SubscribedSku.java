// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.LicenseUnitsDetail;
import com.microsoft.graph.models.extensions.ServicePlanInfo;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscribed Sku.
 */
public class SubscribedSku extends Entity implements IJsonBackedObject {


    /**
     * The Applies To.
     * For example, 'User' or 'Company'.
     */
    @SerializedName("appliesTo")
    @Expose
    public String appliesTo;

    /**
     * The Capability Status.
     * Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut.
     */
    @SerializedName("capabilityStatus")
    @Expose
    public String capabilityStatus;

    /**
     * The Consumed Units.
     * The number of licenses that have been assigned.
     */
    @SerializedName("consumedUnits")
    @Expose
    public Integer consumedUnits;

    /**
     * The Prepaid Units.
     * Information about the number and status of prepaid licenses.
     */
    @SerializedName("prepaidUnits")
    @Expose
    public LicenseUnitsDetail prepaidUnits;

    /**
     * The Service Plans.
     * Information about the service plans that are available with the SKU. Not nullable
     */
    @SerializedName("servicePlans")
    @Expose
    public java.util.List<ServicePlanInfo> servicePlans;

    /**
     * The Sku Id.
     * The unique identifier (GUID) for the service SKU.
     */
    @SerializedName("skuId")
    @Expose
    public java.util.UUID skuId;

    /**
     * The Sku Part Number.
     * The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of commercial subscriptions that an organization has acquired, see List subscribedSkus.
     */
    @SerializedName("skuPartNumber")
    @Expose
    public String skuPartNumber;


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
