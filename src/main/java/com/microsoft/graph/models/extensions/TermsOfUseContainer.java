// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AgreementAcceptance;
import com.microsoft.graph.models.extensions.Agreement;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionResponse;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionPage;
import com.microsoft.graph.requests.extensions.AgreementCollectionResponse;
import com.microsoft.graph.requests.extensions.AgreementCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms Of Use Container.
 */
public class TermsOfUseContainer extends Entity implements IJsonBackedObject {


    /**
     * The Agreement Acceptances.
     * 
     */
    @SerializedName("agreementAcceptances")
    @Expose
    public AgreementAcceptanceCollectionPage agreementAcceptances;

    /**
     * The Agreements.
     * 
     */
    @SerializedName("agreements")
    @Expose
    public AgreementCollectionPage agreements;


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


        if (json.has("agreementAcceptances")) {
            final AgreementAcceptanceCollectionResponse response = new AgreementAcceptanceCollectionResponse();
            if (json.has("agreementAcceptances@odata.nextLink")) {
                response.nextLink = json.get("agreementAcceptances@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("agreementAcceptances").toString(), JsonObject[].class);
            final AgreementAcceptance[] array = new AgreementAcceptance[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AgreementAcceptance.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            agreementAcceptances = new AgreementAcceptanceCollectionPage(response, null);
        }

        if (json.has("agreements")) {
            final AgreementCollectionResponse response = new AgreementCollectionResponse();
            if (json.has("agreements@odata.nextLink")) {
                response.nextLink = json.get("agreements@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("agreements").toString(), JsonObject[].class);
            final Agreement[] array = new Agreement[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Agreement.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            agreements = new AgreementCollectionPage(response, null);
        }
    }
}
