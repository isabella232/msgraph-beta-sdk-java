// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Configuration;
import com.microsoft.graph.models.generated.ConnectionState;
import com.microsoft.graph.models.extensions.ExternalGroup;
import com.microsoft.graph.models.extensions.ExternalItem;
import com.microsoft.graph.models.extensions.ConnectionOperation;
import com.microsoft.graph.models.extensions.Schema;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ExternalGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.ExternalGroupCollectionPage;
import com.microsoft.graph.requests.extensions.ExternalItemCollectionResponse;
import com.microsoft.graph.requests.extensions.ExternalItemCollectionPage;
import com.microsoft.graph.requests.extensions.ConnectionOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.ConnectionOperationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Connection.
 */
public class ExternalConnection extends Entity implements IJsonBackedObject {


    /**
     * The Configuration.
     * 
     */
    @SerializedName("configuration")
    @Expose
    public Configuration configuration;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The State.
     * 
     */
    @SerializedName("state")
    @Expose
    public ConnectionState state;

    /**
     * The Groups.
     * 
     */
    @SerializedName("groups")
    @Expose
    public ExternalGroupCollectionPage groups;

    /**
     * The Items.
     * 
     */
    @SerializedName("items")
    @Expose
    public ExternalItemCollectionPage items;

    /**
     * The Operations.
     * 
     */
    @SerializedName("operations")
    @Expose
    public ConnectionOperationCollectionPage operations;

    /**
     * The Schema.
     * 
     */
    @SerializedName("schema")
    @Expose
    public Schema schema;


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
            final ExternalGroupCollectionResponse response = new ExternalGroupCollectionResponse();
            if (json.has("groups@odata.nextLink")) {
                response.nextLink = json.get("groups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groups").toString(), JsonObject[].class);
            final ExternalGroup[] array = new ExternalGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ExternalGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groups = new ExternalGroupCollectionPage(response, null);
        }

        if (json.has("items")) {
            final ExternalItemCollectionResponse response = new ExternalItemCollectionResponse();
            if (json.has("items@odata.nextLink")) {
                response.nextLink = json.get("items@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("items").toString(), JsonObject[].class);
            final ExternalItem[] array = new ExternalItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ExternalItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            items = new ExternalItemCollectionPage(response, null);
        }

        if (json.has("operations")) {
            final ConnectionOperationCollectionResponse response = new ConnectionOperationCollectionResponse();
            if (json.has("operations@odata.nextLink")) {
                response.nextLink = json.get("operations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("operations").toString(), JsonObject[].class);
            final ConnectionOperation[] array = new ConnectionOperation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ConnectionOperation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            operations = new ConnectionOperationCollectionPage(response, null);
        }
    }
}
