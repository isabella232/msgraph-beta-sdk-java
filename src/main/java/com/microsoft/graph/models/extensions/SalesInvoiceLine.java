// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Account;
import com.microsoft.graph.models.extensions.Item;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Invoice Line.
 */
public class SalesInvoiceLine extends Entity implements IJsonBackedObject {


    /**
     * The Account Id.
     * 
     */
    @SerializedName("accountId")
    @Expose
    public java.util.UUID accountId;

    /**
     * The Amount Excluding Tax.
     * 
     */
    @SerializedName("amountExcludingTax")
    @Expose
    public java.math.BigDecimal amountExcludingTax;

    /**
     * The Amount Including Tax.
     * 
     */
    @SerializedName("amountIncludingTax")
    @Expose
    public java.math.BigDecimal amountIncludingTax;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Discount Amount.
     * 
     */
    @SerializedName("discountAmount")
    @Expose
    public java.math.BigDecimal discountAmount;

    /**
     * The Discount Applied Before Tax.
     * 
     */
    @SerializedName("discountAppliedBeforeTax")
    @Expose
    public Boolean discountAppliedBeforeTax;

    /**
     * The Discount Percent.
     * 
     */
    @SerializedName("discountPercent")
    @Expose
    public java.math.BigDecimal discountPercent;

    /**
     * The Document Id.
     * 
     */
    @SerializedName("documentId")
    @Expose
    public java.util.UUID documentId;

    /**
     * The Invoice Discount Allocation.
     * 
     */
    @SerializedName("invoiceDiscountAllocation")
    @Expose
    public java.math.BigDecimal invoiceDiscountAllocation;

    /**
     * The Item Id.
     * 
     */
    @SerializedName("itemId")
    @Expose
    public java.util.UUID itemId;

    /**
     * The Line Type.
     * 
     */
    @SerializedName("lineType")
    @Expose
    public String lineType;

    /**
     * The Net Amount.
     * 
     */
    @SerializedName("netAmount")
    @Expose
    public java.math.BigDecimal netAmount;

    /**
     * The Net Amount Including Tax.
     * 
     */
    @SerializedName("netAmountIncludingTax")
    @Expose
    public java.math.BigDecimal netAmountIncludingTax;

    /**
     * The Net Tax Amount.
     * 
     */
    @SerializedName("netTaxAmount")
    @Expose
    public java.math.BigDecimal netTaxAmount;

    /**
     * The Quantity.
     * 
     */
    @SerializedName("quantity")
    @Expose
    public java.math.BigDecimal quantity;

    /**
     * The Sequence.
     * 
     */
    @SerializedName("sequence")
    @Expose
    public Integer sequence;

    /**
     * The Shipment Date.
     * 
     */
    @SerializedName("shipmentDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly shipmentDate;

    /**
     * The Tax Code.
     * 
     */
    @SerializedName("taxCode")
    @Expose
    public String taxCode;

    /**
     * The Tax Percent.
     * 
     */
    @SerializedName("taxPercent")
    @Expose
    public java.math.BigDecimal taxPercent;

    /**
     * The Total Tax Amount.
     * 
     */
    @SerializedName("totalTaxAmount")
    @Expose
    public java.math.BigDecimal totalTaxAmount;

    /**
     * The Unit Of Measure Id.
     * 
     */
    @SerializedName("unitOfMeasureId")
    @Expose
    public java.util.UUID unitOfMeasureId;

    /**
     * The Unit Price.
     * 
     */
    @SerializedName("unitPrice")
    @Expose
    public java.math.BigDecimal unitPrice;

    /**
     * The Account.
     * 
     */
    @SerializedName("account")
    @Expose
    public Account account;

    /**
     * The Item.
     * 
     */
    @SerializedName("item")
    @Expose
    public Item item;


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
