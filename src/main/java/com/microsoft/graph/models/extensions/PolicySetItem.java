// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.PolicySetStatus;
import com.microsoft.graph.models.generated.ErrorCode;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set Item.
 */
public class PolicySetItem extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Creation time of the PolicySetItem.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Last Modified Date Time.
     * Last modified time of the PolicySetItem.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Payload Id.
     * PayloadId of the PolicySetItem.
     */
    @SerializedName("payloadId")
    @Expose
    public String payloadId;

    /**
     * The Item Type.
     * policySetType of the PolicySetItem.
     */
    @SerializedName("itemType")
    @Expose
    public String itemType;

    /**
     * The Display Name.
     * DisplayName of the PolicySetItem.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Status.
     * Status of the PolicySetItem.
     */
    @SerializedName("status")
    @Expose
    public PolicySetStatus status;

    /**
     * The Error Code.
     * Error code if any occured.
     */
    @SerializedName("errorCode")
    @Expose
    public ErrorCode errorCode;

    /**
     * The Guided Deployment Tags.
     * Tags of the guided deployment
     */
    @SerializedName("guidedDeploymentTags")
    @Expose
    public java.util.List<String> guidedDeploymentTags;


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