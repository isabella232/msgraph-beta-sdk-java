// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cart To Class Association.
 */
public class CartToClassAssociation extends Entity implements IJsonBackedObject {


    /**
     * The Classroom Ids.
     * Identifiers of classrooms to be associated with device carts.
     */
    @SerializedName(value = "classroomIds", alternate = {"ClassroomIds"})
    @Expose
    public java.util.List<String> classroomIds;

    /**
     * The Created Date Time.
     * DateTime the object was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Admin provided description of the CartToClassAssociation.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Device Cart Ids.
     * Identifiers of device carts to be associated with classes.
     */
    @SerializedName(value = "deviceCartIds", alternate = {"DeviceCartIds"})
    @Expose
    public java.util.List<String> deviceCartIds;

    /**
     * The Display Name.
     * Admin provided name of the device configuration.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Last Modified Date Time.
     * DateTime the object was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Version.
     * Version of the CartToClassAssociation.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
    public Integer version;


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
