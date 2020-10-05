// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Licensing Type.
 */
public class VppLicensingType implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Support Device Licensing.
     * Whether the program supports the device licensing type.
     */
    @SerializedName("supportDeviceLicensing")
    @Expose
    public Boolean supportDeviceLicensing;

    /**
     * The Supports Device Licensing.
     * Whether the program supports the device licensing type.
     */
    @SerializedName("supportsDeviceLicensing")
    @Expose
    public Boolean supportsDeviceLicensing;

    /**
     * The Supports User Licensing.
     * Whether the program supports the user licensing type.
     */
    @SerializedName("supportsUserLicensing")
    @Expose
    public Boolean supportsUserLicensing;

    /**
     * The Support User Licensing.
     * Whether the program supports the user licensing type.
     */
    @SerializedName("supportUserLicensing")
    @Expose
    public Boolean supportUserLicensing;


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
