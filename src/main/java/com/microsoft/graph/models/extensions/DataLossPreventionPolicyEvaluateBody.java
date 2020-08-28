// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.DlpEvaluationInput;
import com.microsoft.graph.models.extensions.DlpNotification;
import com.microsoft.graph.models.extensions.DlpEvaluatePoliciesJobResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Loss Prevention Policy Evaluate Body.
 */
public class DataLossPreventionPolicyEvaluateBody {

    /**
     * The target.
     * 
     */
    @SerializedName("target")
    @Expose
    public String target;

    /**
     * The evaluation Input.
     * 
     */
    @SerializedName("evaluationInput")
    @Expose
    public DlpEvaluationInput evaluationInput;

    /**
     * The notification Info.
     * 
     */
    @SerializedName("notificationInfo")
    @Expose
    public DlpNotification notificationInfo;


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
