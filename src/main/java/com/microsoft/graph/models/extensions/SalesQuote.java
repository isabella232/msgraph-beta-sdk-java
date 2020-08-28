// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PostalAddressType;
import com.microsoft.graph.models.extensions.SalesQuoteLine;
import com.microsoft.graph.models.extensions.Customer;
import com.microsoft.graph.models.extensions.Currency;
import com.microsoft.graph.models.extensions.PaymentTerm;
import com.microsoft.graph.models.extensions.ShipmentMethod;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.SalesQuoteLineCollectionResponse;
import com.microsoft.graph.requests.extensions.SalesQuoteLineCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Quote.
 */
public class SalesQuote extends Entity implements IJsonBackedObject {


    /**
     * The Number.
     * 
     */
    @SerializedName("number")
    @Expose
    public String number;

    /**
     * The External Document Number.
     * 
     */
    @SerializedName("externalDocumentNumber")
    @Expose
    public String externalDocumentNumber;

    /**
     * The Document Date.
     * 
     */
    @SerializedName("documentDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly documentDate;

    /**
     * The Due Date.
     * 
     */
    @SerializedName("dueDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly dueDate;

    /**
     * The Customer Id.
     * 
     */
    @SerializedName("customerId")
    @Expose
    public java.util.UUID customerId;

    /**
     * The Customer Number.
     * 
     */
    @SerializedName("customerNumber")
    @Expose
    public String customerNumber;

    /**
     * The Customer Name.
     * 
     */
    @SerializedName("customerName")
    @Expose
    public String customerName;

    /**
     * The Bill To Name.
     * 
     */
    @SerializedName("billToName")
    @Expose
    public String billToName;

    /**
     * The Bill To Customer Id.
     * 
     */
    @SerializedName("billToCustomerId")
    @Expose
    public java.util.UUID billToCustomerId;

    /**
     * The Bill To Customer Number.
     * 
     */
    @SerializedName("billToCustomerNumber")
    @Expose
    public String billToCustomerNumber;

    /**
     * The Ship To Name.
     * 
     */
    @SerializedName("shipToName")
    @Expose
    public String shipToName;

    /**
     * The Ship To Contact.
     * 
     */
    @SerializedName("shipToContact")
    @Expose
    public String shipToContact;

    /**
     * The Selling Postal Address.
     * 
     */
    @SerializedName("sellingPostalAddress")
    @Expose
    public PostalAddressType sellingPostalAddress;

    /**
     * The Billing Postal Address.
     * 
     */
    @SerializedName("billingPostalAddress")
    @Expose
    public PostalAddressType billingPostalAddress;

    /**
     * The Shipping Postal Address.
     * 
     */
    @SerializedName("shippingPostalAddress")
    @Expose
    public PostalAddressType shippingPostalAddress;

    /**
     * The Currency Id.
     * 
     */
    @SerializedName("currencyId")
    @Expose
    public java.util.UUID currencyId;

    /**
     * The Currency Code.
     * 
     */
    @SerializedName("currencyCode")
    @Expose
    public String currencyCode;

    /**
     * The Payment Terms Id.
     * 
     */
    @SerializedName("paymentTermsId")
    @Expose
    public java.util.UUID paymentTermsId;

    /**
     * The Shipment Method Id.
     * 
     */
    @SerializedName("shipmentMethodId")
    @Expose
    public java.util.UUID shipmentMethodId;

    /**
     * The Salesperson.
     * 
     */
    @SerializedName("salesperson")
    @Expose
    public String salesperson;

    /**
     * The Discount Amount.
     * 
     */
    @SerializedName("discountAmount")
    @Expose
    public java.math.BigDecimal discountAmount;

    /**
     * The Total Amount Excluding Tax.
     * 
     */
    @SerializedName("totalAmountExcludingTax")
    @Expose
    public java.math.BigDecimal totalAmountExcludingTax;

    /**
     * The Total Tax Amount.
     * 
     */
    @SerializedName("totalTaxAmount")
    @Expose
    public java.math.BigDecimal totalTaxAmount;

    /**
     * The Total Amount Including Tax.
     * 
     */
    @SerializedName("totalAmountIncludingTax")
    @Expose
    public java.math.BigDecimal totalAmountIncludingTax;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public String status;

    /**
     * The Sent Date.
     * 
     */
    @SerializedName("sentDate")
    @Expose
    public java.util.Calendar sentDate;

    /**
     * The Valid Until Date.
     * 
     */
    @SerializedName("validUntilDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly validUntilDate;

    /**
     * The Accepted Date.
     * 
     */
    @SerializedName("acceptedDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly acceptedDate;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Phone Number.
     * 
     */
    @SerializedName("phoneNumber")
    @Expose
    public String phoneNumber;

    /**
     * The Email.
     * 
     */
    @SerializedName("email")
    @Expose
    public String email;

    /**
     * The Sales Quote Lines.
     * 
     */
    public SalesQuoteLineCollectionPage salesQuoteLines;

    /**
     * The Customer.
     * 
     */
    @SerializedName("customer")
    @Expose
    public Customer customer;

    /**
     * The Currency.
     * 
     */
    @SerializedName("currency")
    @Expose
    public Currency currency;

    /**
     * The Payment Term.
     * 
     */
    @SerializedName("paymentTerm")
    @Expose
    public PaymentTerm paymentTerm;

    /**
     * The Shipment Method.
     * 
     */
    @SerializedName("shipmentMethod")
    @Expose
    public ShipmentMethod shipmentMethod;


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


        if (json.has("salesQuoteLines")) {
            final SalesQuoteLineCollectionResponse response = new SalesQuoteLineCollectionResponse();
            if (json.has("salesQuoteLines@odata.nextLink")) {
                response.nextLink = json.get("salesQuoteLines@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("salesQuoteLines").toString(), JsonObject[].class);
            final SalesQuoteLine[] array = new SalesQuoteLine[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SalesQuoteLine.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            salesQuoteLines = new SalesQuoteLineCollectionPage(response, null);
        }
    }
}
