// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Scope.
 */
public class PermissionScope implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Admin Consent Description.
     * A description of the delegated permissions, intended to be read by an administrator granting the permission on behalf of all users. This text appears in tenant-wide admin consent experiences.
     */
    @SerializedName("adminConsentDescription")
    @Expose
    public String adminConsentDescription;

    /**
     * The Admin Consent Display Name.
     * The permission's title, intended to be read by an administrator granting the permission on behalf of all users.
     */
    @SerializedName("adminConsentDisplayName")
    @Expose
    public String adminConsentDisplayName;

    /**
     * The Id.
     * Unique delegated permission identifier inside the collection of delegated permissions defined for a resource application.
     */
    @SerializedName("id")
    @Expose
    public java.util.UUID id;

    /**
     * The Is Enabled.
     * When creating or updating a permission, this property must be set to true (which is the default). To delete a permission, this property must first be set to false.  At that point, in a subsequent call, the permission may be removed.
     */
    @SerializedName("isEnabled")
    @Expose
    public Boolean isEnabled;

    /**
     * The Origin.
     * 
     */
    @SerializedName("origin")
    @Expose
    public String origin;

    /**
     * The Type.
     * Specifies whether this delegated permission should be considered safe for non-admin users to consent to on behalf of themselves, or whether an administrator should be required for consent to the permissions. This will be the default behavior, but each customer can choose to customize the behavior in their organization (by allowing, restricting or limiting user consent to this delegated permission.)
     */
    @SerializedName("type")
    @Expose
    public String type;

    /**
     * The User Consent Description.
     * A description of the delegated permissions, intended to be read by a user granting the permission on their own behalf. This text appears in consent experiences where the user is consenting only on behalf of themselves.
     */
    @SerializedName("userConsentDescription")
    @Expose
    public String userConsentDescription;

    /**
     * The User Consent Display Name.
     * A title for the permission, intended to be read by a user granting the permission on their own behalf. This text appears in consent experiences where the user is consenting only on behalf of themselves.
     */
    @SerializedName("userConsentDisplayName")
    @Expose
    public String userConsentDisplayName;

    /**
     * The Value.
     * Specifies the value to include in the scp (scope) claim in access tokens. Must not exceed 120 characters in length. Allowed characters are : ! # $ % &amp; ' ( ) * + , - . / : ;  =  ? @ [ ] ^ + _  {  } ~, as well as characters in the ranges 0-9, A-Z and a-z. Any other character, including the space character, are not allowed.
     */
    @SerializedName("value")
    @Expose
    public String value;


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
