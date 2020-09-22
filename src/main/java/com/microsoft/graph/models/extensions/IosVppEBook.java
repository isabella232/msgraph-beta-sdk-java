// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ManagedEBook;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp EBook.
 */
public class IosVppEBook extends ManagedEBook implements IJsonBackedObject {


    /**
     * The Apple Id.
     * The Apple ID associated with Vpp token.
     */
    @SerializedName("appleId")
    @Expose
    public String appleId;

    /**
     * The Genres.
     * Genres.
     */
    @SerializedName("genres")
    @Expose
    public java.util.List<String> genres;

    /**
     * The Language.
     * Language.
     */
    @SerializedName("language")
    @Expose
    public String language;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Seller.
     * Seller.
     */
    @SerializedName("seller")
    @Expose
    public String seller;

    /**
     * The Total License Count.
     * Total license count.
     */
    @SerializedName("totalLicenseCount")
    @Expose
    public Integer totalLicenseCount;

    /**
     * The Used License Count.
     * Used license count.
     */
    @SerializedName("usedLicenseCount")
    @Expose
    public Integer usedLicenseCount;

    /**
     * The Vpp Organization Name.
     * The Vpp token's organization name.
     */
    @SerializedName("vppOrganizationName")
    @Expose
    public String vppOrganizationName;

    /**
     * The Vpp Token Id.
     * The Vpp token ID.
     */
    @SerializedName("vppTokenId")
    @Expose
    public java.util.UUID vppTokenId;


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
