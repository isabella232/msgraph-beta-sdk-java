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
 * The class for the Bulk Managed Device Action Result.
 */
public class BulkManagedDeviceActionResult implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Failed Device Ids.
     * Failed devices
     */
    @SerializedName("failedDeviceIds")
    @Expose
    public java.util.List<String> failedDeviceIds;

    /**
     * The Not Found Device Ids.
     * Not found devices
     */
    @SerializedName("notFoundDeviceIds")
    @Expose
    public java.util.List<String> notFoundDeviceIds;

    /**
     * The Not Supported Device Ids.
     * Not supported devices
     */
    @SerializedName("notSupportedDeviceIds")
    @Expose
    public java.util.List<String> notSupportedDeviceIds;

    /**
     * The Successful Device Ids.
     * Successful devices
     */
    @SerializedName("successfulDeviceIds")
    @Expose
    public java.util.List<String> successfulDeviceIds;


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
