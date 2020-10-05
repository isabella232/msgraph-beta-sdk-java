// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceManagementComparisonResult;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Setting Comparison.
 */
public class DeviceManagementSettingComparison implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Comparison Result.
     * Setting comparison result
     */
    @SerializedName("comparisonResult")
    @Expose
    public DeviceManagementComparisonResult comparisonResult;

    /**
     * The Current Value Json.
     * JSON representation of current intent (or) template setting's value
     */
    @SerializedName("currentValueJson")
    @Expose
    public String currentValueJson;

    /**
     * The Definition Id.
     * The ID of the setting definition for this instance
     */
    @SerializedName("definitionId")
    @Expose
    public String definitionId;

    /**
     * The Display Name.
     * The setting's display name
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Id.
     * The setting ID
     */
    @SerializedName("id")
    @Expose
    public String id;

    /**
     * The New Value Json.
     * JSON representation of new template setting's value
     */
    @SerializedName("newValueJson")
    @Expose
    public String newValueJson;


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
