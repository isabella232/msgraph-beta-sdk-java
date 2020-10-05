// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.UsageAuthMethod;
import com.microsoft.graph.models.generated.FeatureType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Credential Usage Details.
 */
public class UserCredentialUsageDetails extends Entity implements IJsonBackedObject {


    /**
     * The Auth Method.
     * 
     */
    @SerializedName("authMethod")
    @Expose
    public UsageAuthMethod authMethod;

    /**
     * The Event Date Time.
     * 
     */
    @SerializedName("eventDateTime")
    @Expose
    public java.util.Calendar eventDateTime;

    /**
     * The Failure Reason.
     * 
     */
    @SerializedName("failureReason")
    @Expose
    public String failureReason;

    /**
     * The Feature.
     * 
     */
    @SerializedName("feature")
    @Expose
    public FeatureType feature;

    /**
     * The Is Success.
     * 
     */
    @SerializedName("isSuccess")
    @Expose
    public Boolean isSuccess;

    /**
     * The User Display Name.
     * 
     */
    @SerializedName("userDisplayName")
    @Expose
    public String userDisplayName;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;


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
