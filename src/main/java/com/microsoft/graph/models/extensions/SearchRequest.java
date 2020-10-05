// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AggregationOption;
import com.microsoft.graph.models.generated.EntityType;
import com.microsoft.graph.models.extensions.SearchQuery;
import com.microsoft.graph.models.extensions.SortProperty;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Request.
 */
public class SearchRequest implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Aggregation Filters.
     * 
     */
    @SerializedName("aggregationFilters")
    @Expose
    public java.util.List<String> aggregationFilters;

    /**
     * The Aggregations.
     * 
     */
    @SerializedName("aggregations")
    @Expose
    public java.util.List<AggregationOption> aggregations;

    /**
     * The Content Sources.
     * 
     */
    @SerializedName("contentSources")
    @Expose
    public java.util.List<String> contentSources;

    /**
     * The Enable Top Results.
     * 
     */
    @SerializedName("enableTopResults")
    @Expose
    public Boolean enableTopResults;

    /**
     * The Entity Types.
     * 
     */
    @SerializedName("entityTypes")
    @Expose
    public java.util.List<EntityType> entityTypes;

    /**
     * The Fields.
     * 
     */
    @SerializedName("fields")
    @Expose
    public java.util.List<String> fields;

    /**
     * The From.
     * 
     */
    @SerializedName("from")
    @Expose
    public Integer from;

    /**
     * The Query.
     * 
     */
    @SerializedName("query")
    @Expose
    public SearchQuery query;

    /**
     * The Size.
     * 
     */
    @SerializedName("size")
    @Expose
    public Integer size;

    /**
     * The Sort Properties.
     * 
     */
    @SerializedName("sortProperties")
    @Expose
    public java.util.List<SortProperty> sortProperties;

    /**
     * The Stored_fields.
     * 
     */
    @SerializedName("stored_fields")
    @Expose
    public java.util.List<String> stored_fields;


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
