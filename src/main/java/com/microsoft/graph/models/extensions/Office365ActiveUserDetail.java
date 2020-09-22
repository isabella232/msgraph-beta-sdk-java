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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office365Active User Detail.
 */
public class Office365ActiveUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Assigned Products.
     * 
     */
    @SerializedName("assignedProducts")
    @Expose
    public java.util.List<String> assignedProducts;

    /**
     * The Deleted Date.
     * 
     */
    @SerializedName("deletedDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly deletedDate;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Exchange Last Activity Date.
     * 
     */
    @SerializedName("exchangeLastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly exchangeLastActivityDate;

    /**
     * The Exchange License Assign Date.
     * 
     */
    @SerializedName("exchangeLicenseAssignDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly exchangeLicenseAssignDate;

    /**
     * The Has Exchange License.
     * 
     */
    @SerializedName("hasExchangeLicense")
    @Expose
    public Boolean hasExchangeLicense;

    /**
     * The Has One Drive License.
     * 
     */
    @SerializedName("hasOneDriveLicense")
    @Expose
    public Boolean hasOneDriveLicense;

    /**
     * The Has Share Point License.
     * 
     */
    @SerializedName("hasSharePointLicense")
    @Expose
    public Boolean hasSharePointLicense;

    /**
     * The Has Skype For Business License.
     * 
     */
    @SerializedName("hasSkypeForBusinessLicense")
    @Expose
    public Boolean hasSkypeForBusinessLicense;

    /**
     * The Has Teams License.
     * 
     */
    @SerializedName("hasTeamsLicense")
    @Expose
    public Boolean hasTeamsLicense;

    /**
     * The Has Yammer License.
     * 
     */
    @SerializedName("hasYammerLicense")
    @Expose
    public Boolean hasYammerLicense;

    /**
     * The Is Deleted.
     * 
     */
    @SerializedName("isDeleted")
    @Expose
    public Boolean isDeleted;

    /**
     * The One Drive Last Activity Date.
     * 
     */
    @SerializedName("oneDriveLastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly oneDriveLastActivityDate;

    /**
     * The One Drive License Assign Date.
     * 
     */
    @SerializedName("oneDriveLicenseAssignDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly oneDriveLicenseAssignDate;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName("reportRefreshDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Share Point Last Activity Date.
     * 
     */
    @SerializedName("sharePointLastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly sharePointLastActivityDate;

    /**
     * The Share Point License Assign Date.
     * 
     */
    @SerializedName("sharePointLicenseAssignDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly sharePointLicenseAssignDate;

    /**
     * The Skype For Business Last Activity Date.
     * 
     */
    @SerializedName("skypeForBusinessLastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly skypeForBusinessLastActivityDate;

    /**
     * The Skype For Business License Assign Date.
     * 
     */
    @SerializedName("skypeForBusinessLicenseAssignDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly skypeForBusinessLicenseAssignDate;

    /**
     * The Teams Last Activity Date.
     * 
     */
    @SerializedName("teamsLastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly teamsLastActivityDate;

    /**
     * The Teams License Assign Date.
     * 
     */
    @SerializedName("teamsLicenseAssignDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly teamsLicenseAssignDate;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Yammer Last Activity Date.
     * 
     */
    @SerializedName("yammerLastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly yammerLastActivityDate;

    /**
     * The Yammer License Assign Date.
     * 
     */
    @SerializedName("yammerLicenseAssignDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly yammerLicenseAssignDate;


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
