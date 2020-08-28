// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SynchronizationSecretKeyStringValuePair;
import com.microsoft.graph.models.extensions.SynchronizationJob;
import com.microsoft.graph.models.extensions.SynchronizationTemplate;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.SynchronizationJobCollectionResponse;
import com.microsoft.graph.requests.extensions.SynchronizationJobCollectionPage;
import com.microsoft.graph.requests.extensions.SynchronizationTemplateCollectionResponse;
import com.microsoft.graph.requests.extensions.SynchronizationTemplateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization.
 */
public class Synchronization extends Entity implements IJsonBackedObject {


    /**
     * The Secrets.
     * 
     */
    @SerializedName("secrets")
    @Expose
    public java.util.List<SynchronizationSecretKeyStringValuePair> secrets;

    /**
     * The Jobs.
     * 
     */
    public SynchronizationJobCollectionPage jobs;

    /**
     * The Templates.
     * 
     */
    public SynchronizationTemplateCollectionPage templates;


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


        if (json.has("jobs")) {
            final SynchronizationJobCollectionResponse response = new SynchronizationJobCollectionResponse();
            if (json.has("jobs@odata.nextLink")) {
                response.nextLink = json.get("jobs@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("jobs").toString(), JsonObject[].class);
            final SynchronizationJob[] array = new SynchronizationJob[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SynchronizationJob.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            jobs = new SynchronizationJobCollectionPage(response, null);
        }

        if (json.has("templates")) {
            final SynchronizationTemplateCollectionResponse response = new SynchronizationTemplateCollectionResponse();
            if (json.has("templates@odata.nextLink")) {
                response.nextLink = json.get("templates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("templates").toString(), JsonObject[].class);
            final SynchronizationTemplate[] array = new SynchronizationTemplate[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SynchronizationTemplate.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            templates = new SynchronizationTemplateCollectionPage(response, null);
        }
    }
}
