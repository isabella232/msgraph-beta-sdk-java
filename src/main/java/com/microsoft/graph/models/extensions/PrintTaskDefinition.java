// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AppIdentity;
import com.microsoft.graph.models.extensions.PrintTask;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PrintTaskCollectionResponse;
import com.microsoft.graph.requests.extensions.PrintTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task Definition.
 */
public class PrintTaskDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * 
     */
    @SerializedName("createdBy")
    @Expose
    public AppIdentity createdBy;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Tasks.
     * 
     */
    @SerializedName("tasks")
    @Expose
    public PrintTaskCollectionPage tasks;


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


        if (json.has("tasks")) {
            final PrintTaskCollectionResponse response = new PrintTaskCollectionResponse();
            if (json.has("tasks@odata.nextLink")) {
                response.nextLink = json.get("tasks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tasks").toString(), JsonObject[].class);
            final PrintTask[] array = new PrintTask[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PrintTask.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tasks = new PrintTaskCollectionPage(response, null);
        }
    }
}
