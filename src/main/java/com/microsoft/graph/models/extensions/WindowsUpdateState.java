// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsUpdateStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update State.
 */
public class WindowsUpdateState extends Entity implements IJsonBackedObject {


    /**
     * The Device Id.
     * The id of the device.
     */
    @SerializedName("deviceId")
    @Expose
    public String deviceId;

    /**
     * The User Id.
     * The id of the user.
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The Device Display Name.
     * Device display name.
     */
    @SerializedName("deviceDisplayName")
    @Expose
    public String deviceDisplayName;

    /**
     * The User Principal Name.
     * User principal name.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Status.
     * Windows udpate status.
     */
    @SerializedName("status")
    @Expose
    public WindowsUpdateStatus status;

    /**
     * The Quality Update Version.
     * The Quality Update Version of the device.
     */
    @SerializedName("qualityUpdateVersion")
    @Expose
    public String qualityUpdateVersion;

    /**
     * The Feature Update Version.
     * The current feature update version of the device.
     */
    @SerializedName("featureUpdateVersion")
    @Expose
    public String featureUpdateVersion;

    /**
     * The Last Scan Date Time.
     * The date time that the Windows Update Agent did a successful scan.
     */
    @SerializedName("lastScanDateTime")
    @Expose
    public java.util.Calendar lastScanDateTime;

    /**
     * The Last Sync Date Time.
     * Last date time that the device sync with with Microsoft Intune.
     */
    @SerializedName("lastSyncDateTime")
    @Expose
    public java.util.Calendar lastSyncDateTime;


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