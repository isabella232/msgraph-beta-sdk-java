// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.StringKeyStringValuePair;
import com.microsoft.graph.models.extensions.ObjectMapping;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Rule.
 */
public class SynchronizationRule implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Editable.
     * 
     */
    @SerializedName("editable")
    @Expose
    public Boolean editable;

    /**
     * The Id.
     * 
     */
    @SerializedName("id")
    @Expose
    public String id;

    /**
     * The Metadata.
     * 
     */
    @SerializedName("metadata")
    @Expose
    public java.util.List<StringKeyStringValuePair> metadata;

    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Object Mappings.
     * 
     */
    @SerializedName("objectMappings")
    @Expose
    public java.util.List<ObjectMapping> objectMappings;

    /**
     * The Priority.
     * 
     */
    @SerializedName("priority")
    @Expose
    public Integer priority;

    /**
     * The Source Directory Name.
     * 
     */
    @SerializedName("sourceDirectoryName")
    @Expose
    public String sourceDirectoryName;

    /**
     * The Target Directory Name.
     * 
     */
    @SerializedName("targetDirectoryName")
    @Expose
    public String targetDirectoryName;


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