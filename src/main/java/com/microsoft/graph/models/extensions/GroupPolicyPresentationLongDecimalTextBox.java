// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.GroupPolicyPresentation;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Long Decimal Text Box.
 */
public class GroupPolicyPresentationLongDecimalTextBox extends GroupPolicyPresentation implements IJsonBackedObject {


    /**
     * The Default Value.
     * An unsigned integer that specifies the initial value for the decimal text box. The default value is 1.
     */
    @SerializedName("defaultValue")
    @Expose
    public Long defaultValue;

    /**
     * The Max Value.
     * An unsigned long that specifies the maximum allowed value. The default value is 9999.
     */
    @SerializedName("maxValue")
    @Expose
    public Long maxValue;

    /**
     * The Min Value.
     * An unsigned long that specifies the minimum allowed value. The default value is 0.
     */
    @SerializedName("minValue")
    @Expose
    public Long minValue;

    /**
     * The Required.
     * Requirement to enter a value in the parameter box. The default value is false.
     */
    @SerializedName("required")
    @Expose
    public Boolean required;

    /**
     * The Spin.
     * If true, create a spin control; otherwise, create a text box for numeric entry. The default value is true.
     */
    @SerializedName("spin")
    @Expose
    public Boolean spin;

    /**
     * The Spin Step.
     * An unsigned integer that specifies the increment of change for the spin control. The default value is 1.
     */
    @SerializedName("spinStep")
    @Expose
    public Long spinStep;


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
