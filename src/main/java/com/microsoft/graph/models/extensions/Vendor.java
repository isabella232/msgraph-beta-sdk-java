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
import com.microsoft.graph.models.extensions.Picture;
import com.microsoft.graph.models.extensions.Currency;
import com.microsoft.graph.models.extensions.PaymentTerm;
import com.microsoft.graph.models.extensions.PaymentMethod;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PictureCollectionResponse;
import com.microsoft.graph.requests.extensions.PictureCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vendor.
 */
public class Vendor extends Entity implements IJsonBackedObject {


    /**
     * The Number.
     * 
     */
    @SerializedName("number")
    @Expose
    public String number;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Address.
     * 
     */
    @SerializedName("address")
    @Expose
    public PostalAddressType address;

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
     * The Website.
     * 
     */
    @SerializedName("website")
    @Expose
    public String website;

    /**
     * The Tax Registration Number.
     * 
     */
    @SerializedName("taxRegistrationNumber")
    @Expose
    public String taxRegistrationNumber;

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
     * The Payment Method Id.
     * 
     */
    @SerializedName("paymentMethodId")
    @Expose
    public java.util.UUID paymentMethodId;

    /**
     * The Tax Liable.
     * 
     */
    @SerializedName("taxLiable")
    @Expose
    public Boolean taxLiable;

    /**
     * The Blocked.
     * 
     */
    @SerializedName("blocked")
    @Expose
    public String blocked;

    /**
     * The Balance.
     * 
     */
    @SerializedName("balance")
    @Expose
    public java.math.BigDecimal balance;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Picture.
     * 
     */
    public PictureCollectionPage picture;

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
     * The Payment Method.
     * 
     */
    @SerializedName("paymentMethod")
    @Expose
    public PaymentMethod paymentMethod;


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


        if (json.has("picture")) {
            final PictureCollectionResponse response = new PictureCollectionResponse();
            if (json.has("picture@odata.nextLink")) {
                response.nextLink = json.get("picture@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("picture").toString(), JsonObject[].class);
            final Picture[] array = new Picture[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Picture.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            picture = new PictureCollectionPage(response, null);
        }
    }
}