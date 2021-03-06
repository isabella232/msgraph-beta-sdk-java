// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.termstore.models.extensions.Group;
import com.microsoft.graph.termstore.models.extensions.Set;
import com.microsoft.graph.termstore.requests.extensions.GroupCollectionPage;
import com.microsoft.graph.termstore.requests.extensions.SetCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Store.
 */
public class Store implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Default Language Tag.
     * 
     */
    @SerializedName(value = "defaultLanguageTag", alternate = {"DefaultLanguageTag"})
    @Expose
    public String defaultLanguageTag;

    /**
     * The Language Tags.
     * 
     */
    @SerializedName(value = "languageTags", alternate = {"LanguageTags"})
    @Expose
    public java.util.List<String> languageTags;

    /**
     * The Groups.
     * 
     */
    @SerializedName(value = "groups", alternate = {"Groups"})
    @Expose
    public GroupCollectionPage groups;

    /**
     * The Sets.
     * 
     */
    @SerializedName(value = "sets", alternate = {"Sets"})
    @Expose
    public SetCollectionPage sets;


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


        if (json.has("groups")) {
            groups = serializer.deserializeObject(json.get("groups").toString(), GroupCollectionPage.class);
        }

        if (json.has("sets")) {
            sets = serializer.deserializeObject(json.get("sets").toString(), SetCollectionPage.class);
        }
    }
}
