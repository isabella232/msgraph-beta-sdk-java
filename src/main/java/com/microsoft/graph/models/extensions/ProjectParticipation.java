// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.CompanyDetail;
import com.microsoft.graph.models.extensions.RelatedPerson;
import com.microsoft.graph.models.extensions.PositionDetail;
import com.microsoft.graph.models.extensions.ItemFacet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Project Participation.
 */
public class ProjectParticipation extends ItemFacet implements IJsonBackedObject {


    /**
     * The Categories.
     * 
     */
    @SerializedName("categories")
    @Expose
    public java.util.List<String> categories;

    /**
     * The Client.
     * 
     */
    @SerializedName("client")
    @Expose
    public CompanyDetail client;

    /**
     * The Collaboration Tags.
     * 
     */
    @SerializedName("collaborationTags")
    @Expose
    public java.util.List<String> collaborationTags;

    /**
     * The Colleagues.
     * 
     */
    @SerializedName("colleagues")
    @Expose
    public java.util.List<RelatedPerson> colleagues;

    /**
     * The Detail.
     * 
     */
    @SerializedName("detail")
    @Expose
    public PositionDetail detail;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Sponsors.
     * 
     */
    @SerializedName("sponsors")
    @Expose
    public java.util.List<RelatedPerson> sponsors;


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
