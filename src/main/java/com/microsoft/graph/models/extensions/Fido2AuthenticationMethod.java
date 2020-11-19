// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AttestationLevel;
import com.microsoft.graph.models.extensions.AuthenticationMethod;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Fido2Authentication Method.
 */
public class Fido2AuthenticationMethod extends AuthenticationMethod implements IJsonBackedObject {


    /**
     * The Aa Guid.
     * 
     */
    @SerializedName(value = "aaGuid", alternate = {"AaGuid"})
    @Expose
    public String aaGuid;

    /**
     * The Attestation Certificates.
     * 
     */
    @SerializedName(value = "attestationCertificates", alternate = {"AttestationCertificates"})
    @Expose
    public java.util.List<String> attestationCertificates;

    /**
     * The Attestation Level.
     * 
     */
    @SerializedName(value = "attestationLevel", alternate = {"AttestationLevel"})
    @Expose
    public AttestationLevel attestationLevel;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Creation Date Time.
     * 
     */
    @SerializedName(value = "creationDateTime", alternate = {"CreationDateTime"})
    @Expose
    public java.util.Calendar creationDateTime;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Model.
     * 
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
    public String model;


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
