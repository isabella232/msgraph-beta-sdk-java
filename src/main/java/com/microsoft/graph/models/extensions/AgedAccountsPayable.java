// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Aged Accounts Payable.
 */
public class AgedAccountsPayable extends Entity implements IJsonBackedObject {


    /**
     * The Vendor Number.
     * 
     */
    @SerializedName("vendorNumber")
    @Expose
    public String vendorNumber;

    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Currency Code.
     * 
     */
    @SerializedName("currencyCode")
    @Expose
    public String currencyCode;

    /**
     * The Balance Due.
     * 
     */
    @SerializedName("balanceDue")
    @Expose
    public java.math.BigDecimal balanceDue;

    /**
     * The Current Amount.
     * 
     */
    @SerializedName("currentAmount")
    @Expose
    public java.math.BigDecimal currentAmount;

    /**
     * The Period1Amount.
     * 
     */
    @SerializedName("period1Amount")
    @Expose
    public java.math.BigDecimal period1Amount;

    /**
     * The Period2Amount.
     * 
     */
    @SerializedName("period2Amount")
    @Expose
    public java.math.BigDecimal period2Amount;

    /**
     * The Period3Amount.
     * 
     */
    @SerializedName("period3Amount")
    @Expose
    public java.math.BigDecimal period3Amount;

    /**
     * The Aged As Of Date.
     * 
     */
    @SerializedName("agedAsOfDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly agedAsOfDate;

    /**
     * The Period Length Filter.
     * 
     */
    @SerializedName("periodLengthFilter")
    @Expose
    public String periodLengthFilter;


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
