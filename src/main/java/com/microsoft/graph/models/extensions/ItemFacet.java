// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AllowedAudiences;
import com.microsoft.graph.models.extensions.InferenceData;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.PersonDataSource;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Facet.
 */
public class ItemFacet extends Entity implements IJsonBackedObject {


    /**
     * The Allowed Audiences.
     * 
     */
    @SerializedName("allowedAudiences")
    @Expose
    public EnumSet<AllowedAudiences> allowedAudiences;

    /**
     * The Inference.
     * 
     */
    @SerializedName("inference")
    @Expose
    public InferenceData inference;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Created By.
     * 
     */
    @SerializedName("createdBy")
    @Expose
    public IdentitySet createdBy;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Last Modified By.
     * 
     */
    @SerializedName("lastModifiedBy")
    @Expose
    public IdentitySet lastModifiedBy;

    /**
     * The Source.
     * 
     */
    @SerializedName("source")
    @Expose
    public PersonDataSource source;


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
