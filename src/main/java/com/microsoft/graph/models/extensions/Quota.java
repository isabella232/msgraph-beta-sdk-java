// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.StoragePlanInformation;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Quota.
 */
public class Quota implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Deleted.
     * Total space consumed by files in the recycle bin, in bytes. Read-only.
     */
    @SerializedName("deleted")
    @Expose
    public Long deleted;

    /**
     * The Remaining.
     * Total space remaining before reaching the quota limit, in bytes. Read-only.
     */
    @SerializedName("remaining")
    @Expose
    public Long remaining;

    /**
     * The State.
     * Enumeration value that indicates the state of the storage space. Read-only.
     */
    @SerializedName("state")
    @Expose
    public String state;

    /**
     * The Storage Plan Information.
     * Information about the drive's storage quota plans. Only in Personal OneDrive.
     */
    @SerializedName("storagePlanInformation")
    @Expose
    public StoragePlanInformation storagePlanInformation;

    /**
     * The Total.
     * Total allowed storage space, in bytes. Read-only.
     */
    @SerializedName("total")
    @Expose
    public Long total;

    /**
     * The Used.
     * Total space used, in bytes. Read-only.
     */
    @SerializedName("used")
    @Expose
    public Long used;


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
