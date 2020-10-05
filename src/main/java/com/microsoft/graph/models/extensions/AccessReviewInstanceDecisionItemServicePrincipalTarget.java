// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AccessReviewInstanceDecisionItemTarget;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Decision Item Service Principal Target.
 */
public class AccessReviewInstanceDecisionItemServicePrincipalTarget extends AccessReviewInstanceDecisionItemTarget implements IJsonBackedObject {


    /**
     * The App Id.
     * 
     */
    @SerializedName("appId")
    @Expose
    public String appId;

    /**
     * The Service Principal Display Name.
     * 
     */
    @SerializedName("servicePrincipalDisplayName")
    @Expose
    public String servicePrincipalDisplayName;

    /**
     * The Service Principal Id.
     * 
     */
    @SerializedName("servicePrincipalId")
    @Expose
    public String servicePrincipalId;


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
