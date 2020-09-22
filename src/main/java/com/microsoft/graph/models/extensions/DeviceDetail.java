// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Detail.
 */
public class DeviceDetail implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Browser.
     * Indicates the browser information of the used for signing in.
     */
    @SerializedName("browser")
    @Expose
    public String browser;

    /**
     * The Browser Id.
     * 
     */
    @SerializedName("browserId")
    @Expose
    public String browserId;

    /**
     * The Device Id.
     * Refers to the UniqueID of the device used for signing in.
     */
    @SerializedName("deviceId")
    @Expose
    public String deviceId;

    /**
     * The Display Name.
     * Refers to the name of the device used for signing in.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Compliant.
     * Indicates whether the device is compliant.
     */
    @SerializedName("isCompliant")
    @Expose
    public Boolean isCompliant;

    /**
     * The Is Managed.
     * Indicates whether the device is managed.
     */
    @SerializedName("isManaged")
    @Expose
    public Boolean isManaged;

    /**
     * The Operating System.
     * Indicates the operating system name and version used for signing in.
     */
    @SerializedName("operatingSystem")
    @Expose
    public String operatingSystem;

    /**
     * The Trust Type.
     * Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
     */
    @SerializedName("trustType")
    @Expose
    public String trustType;


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
