// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PhysicalAddress;
import com.microsoft.graph.models.extensions.OutlookGeoCoordinates;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Place.
 */
public class Place extends Entity implements IJsonBackedObject {


    /**
     * The Address.
     * The street address of the place.
     */
    @SerializedName("address")
    @Expose
    public PhysicalAddress address;

    /**
     * The Display Name.
     * The name associated with the place.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Geo Coordinates.
     * Specifies the place location in latitude, longitude and (optionally) altitude coordinates.
     */
    @SerializedName("geoCoordinates")
    @Expose
    public OutlookGeoCoordinates geoCoordinates;

    /**
     * The Phone.
     * The phone number of the place.
     */
    @SerializedName("phone")
    @Expose
    public String phone;


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
