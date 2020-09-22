// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.YomiPersonName;
import com.microsoft.graph.models.extensions.ItemFacet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Name.
 */
public class PersonName extends ItemFacet implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The First.
     * 
     */
    @SerializedName("first")
    @Expose
    public String first;

    /**
     * The Initials.
     * 
     */
    @SerializedName("initials")
    @Expose
    public String initials;

    /**
     * The Language Tag.
     * 
     */
    @SerializedName("languageTag")
    @Expose
    public String languageTag;

    /**
     * The Last.
     * 
     */
    @SerializedName("last")
    @Expose
    public String last;

    /**
     * The Maiden.
     * 
     */
    @SerializedName("maiden")
    @Expose
    public String maiden;

    /**
     * The Middle.
     * 
     */
    @SerializedName("middle")
    @Expose
    public String middle;

    /**
     * The Nickname.
     * 
     */
    @SerializedName("nickname")
    @Expose
    public String nickname;

    /**
     * The Pronunciation.
     * 
     */
    @SerializedName("pronunciation")
    @Expose
    public YomiPersonName pronunciation;

    /**
     * The Suffix.
     * 
     */
    @SerializedName("suffix")
    @Expose
    public String suffix;

    /**
     * The Title.
     * 
     */
    @SerializedName("title")
    @Expose
    public String title;


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
