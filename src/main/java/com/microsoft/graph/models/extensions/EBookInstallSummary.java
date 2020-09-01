// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the EBook Install Summary.
 */
public class EBookInstallSummary extends Entity implements IJsonBackedObject {


    /**
     * The Installed Device Count.
     * Number of Devices that have successfully installed this book.
     */
    @SerializedName("installedDeviceCount")
    @Expose
    public Integer installedDeviceCount;

    /**
     * The Failed Device Count.
     * Number of Devices that have failed to install this book.
     */
    @SerializedName("failedDeviceCount")
    @Expose
    public Integer failedDeviceCount;

    /**
     * The Not Installed Device Count.
     * Number of Devices that does not have this book installed.
     */
    @SerializedName("notInstalledDeviceCount")
    @Expose
    public Integer notInstalledDeviceCount;

    /**
     * The Installed User Count.
     * Number of Users whose devices have all succeeded to install this book.
     */
    @SerializedName("installedUserCount")
    @Expose
    public Integer installedUserCount;

    /**
     * The Failed User Count.
     * Number of Users that have 1 or more device that failed to install this book.
     */
    @SerializedName("failedUserCount")
    @Expose
    public Integer failedUserCount;

    /**
     * The Not Installed User Count.
     * Number of Users that did not install this book.
     */
    @SerializedName("notInstalledUserCount")
    @Expose
    public Integer notInstalledUserCount;


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