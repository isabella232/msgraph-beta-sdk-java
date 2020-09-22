// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ImportedWindowsAutopilotDeviceIdentityImportStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Windows Autopilot Device Identity State.
 */
public class ImportedWindowsAutopilotDeviceIdentityState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Device Error Code.
     * Device error code reported by Device Directory Service(DDS).
     */
    @SerializedName("deviceErrorCode")
    @Expose
    public Integer deviceErrorCode;

    /**
     * The Device Error Name.
     * Device error name reported by Device Directory Service(DDS).
     */
    @SerializedName("deviceErrorName")
    @Expose
    public String deviceErrorName;

    /**
     * The Device Import Status.
     * Device status reported by Device Directory Service(DDS). Possible values are: unknown, pending, partial, complete, error.
     */
    @SerializedName("deviceImportStatus")
    @Expose
    public ImportedWindowsAutopilotDeviceIdentityImportStatus deviceImportStatus;

    /**
     * The Device Registration Id.
     * Device Registration ID for successfully added device reported by Device Directory Service(DDS).
     */
    @SerializedName("deviceRegistrationId")
    @Expose
    public String deviceRegistrationId;


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
