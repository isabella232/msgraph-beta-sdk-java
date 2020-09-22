// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.termstore.models.extensions.Group;
import com.microsoft.graph.termstore.models.extensions.Set;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.termstore.requests.extensions.GroupCollectionResponse;
import com.microsoft.graph.termstore.requests.extensions.GroupCollectionPage;
import com.microsoft.graph.termstore.requests.extensions.SetCollectionResponse;
import com.microsoft.graph.termstore.requests.extensions.SetCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Store.
 */
public class Store extends Entity implements IJsonBackedObject {


    /**
     * The Default Language Tag.
     * 
     */
    @SerializedName("defaultLanguageTag")
    @Expose
    public String defaultLanguageTag;

    /**
     * The Language Tags.
     * 
     */
    @SerializedName("languageTags")
    @Expose
    public java.util.List<String> languageTags;

    /**
     * The Groups.
     * 
     */
    @SerializedName("groups")
    @Expose
    public GroupCollectionPage groups;

    /**
     * The Sets.
     * 
     */
    @SerializedName("sets")
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
            final GroupCollectionResponse response = new GroupCollectionResponse();
            if (json.has("groups@odata.nextLink")) {
                response.nextLink = json.get("groups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groups").toString(), JsonObject[].class);
            final Group[] array = new Group[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Group.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groups = new GroupCollectionPage(response, null);
        }

        if (json.has("sets")) {
            final SetCollectionResponse response = new SetCollectionResponse();
            if (json.has("sets@odata.nextLink")) {
                response.nextLink = json.get("sets@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sets").toString(), JsonObject[].class);
            final Set[] array = new Set[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Set.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sets = new SetCollectionPage(response, null);
        }
    }
}
