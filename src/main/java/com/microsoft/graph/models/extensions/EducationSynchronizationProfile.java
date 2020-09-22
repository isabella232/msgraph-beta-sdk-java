// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EducationSynchronizationDataProvider;
import com.microsoft.graph.models.extensions.EducationIdentitySynchronizationConfiguration;
import com.microsoft.graph.models.extensions.EducationSynchronizationLicenseAssignment;
import com.microsoft.graph.models.generated.EducationSynchronizationProfileState;
import com.microsoft.graph.models.extensions.EducationSynchronizationError;
import com.microsoft.graph.models.extensions.EducationSynchronizationProfileStatus;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EducationSynchronizationErrorCollectionResponse;
import com.microsoft.graph.requests.extensions.EducationSynchronizationErrorCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Synchronization Profile.
 */
public class EducationSynchronizationProfile extends Entity implements IJsonBackedObject {


    /**
     * The Data Provider.
     * 
     */
    @SerializedName("dataProvider")
    @Expose
    public EducationSynchronizationDataProvider dataProvider;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Expiration Date.
     * 
     */
    @SerializedName("expirationDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly expirationDate;

    /**
     * The Handle Special Character Constraint.
     * 
     */
    @SerializedName("handleSpecialCharacterConstraint")
    @Expose
    public Boolean handleSpecialCharacterConstraint;

    /**
     * The Identity Synchronization Configuration.
     * 
     */
    @SerializedName("identitySynchronizationConfiguration")
    @Expose
    public EducationIdentitySynchronizationConfiguration identitySynchronizationConfiguration;

    /**
     * The Licenses To Assign.
     * 
     */
    @SerializedName("licensesToAssign")
    @Expose
    public java.util.List<EducationSynchronizationLicenseAssignment> licensesToAssign;

    /**
     * The State.
     * 
     */
    @SerializedName("state")
    @Expose
    public EducationSynchronizationProfileState state;

    /**
     * The Errors.
     * 
     */
    @SerializedName("errors")
    @Expose
    public EducationSynchronizationErrorCollectionPage errors;

    /**
     * The Profile Status.
     * 
     */
    @SerializedName("profileStatus")
    @Expose
    public EducationSynchronizationProfileStatus profileStatus;


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


        if (json.has("errors")) {
            final EducationSynchronizationErrorCollectionResponse response = new EducationSynchronizationErrorCollectionResponse();
            if (json.has("errors@odata.nextLink")) {
                response.nextLink = json.get("errors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("errors").toString(), JsonObject[].class);
            final EducationSynchronizationError[] array = new EducationSynchronizationError[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationSynchronizationError.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            errors = new EducationSynchronizationErrorCollectionPage(response, null);
        }
    }
}
