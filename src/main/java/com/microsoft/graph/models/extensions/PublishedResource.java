// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.OnPremisesPublishingType;
import com.microsoft.graph.models.extensions.OnPremisesAgentGroup;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.OnPremisesAgentGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.OnPremisesAgentGroupCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Published Resource.
 */
public class PublishedResource extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Publishing Type.
     * 
     */
    @SerializedName("publishingType")
    @Expose
    public OnPremisesPublishingType publishingType;

    /**
     * The Resource Name.
     * 
     */
    @SerializedName("resourceName")
    @Expose
    public String resourceName;

    /**
     * The Agent Groups.
     * 
     */
    @SerializedName("agentGroups")
    @Expose
    public OnPremisesAgentGroupCollectionPage agentGroups;


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


        if (json.has("agentGroups")) {
            final OnPremisesAgentGroupCollectionResponse response = new OnPremisesAgentGroupCollectionResponse();
            if (json.has("agentGroups@odata.nextLink")) {
                response.nextLink = json.get("agentGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("agentGroups").toString(), JsonObject[].class);
            final OnPremisesAgentGroup[] array = new OnPremisesAgentGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnPremisesAgentGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            agentGroups = new OnPremisesAgentGroupCollectionPage(response, null);
        }
    }
}
