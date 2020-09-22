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
 * The class for the Office365Groups Activity Detail.
 */
public class Office365GroupsActivityDetail extends Entity implements IJsonBackedObject {


    /**
     * The Exchange Mailbox Storage Used In Bytes.
     * 
     */
    @SerializedName("exchangeMailboxStorageUsedInBytes")
    @Expose
    public Long exchangeMailboxStorageUsedInBytes;

    /**
     * The Exchange Mailbox Total Item Count.
     * 
     */
    @SerializedName("exchangeMailboxTotalItemCount")
    @Expose
    public Long exchangeMailboxTotalItemCount;

    /**
     * The Exchange Received Email Count.
     * 
     */
    @SerializedName("exchangeReceivedEmailCount")
    @Expose
    public Long exchangeReceivedEmailCount;

    /**
     * The External Member Count.
     * 
     */
    @SerializedName("externalMemberCount")
    @Expose
    public Long externalMemberCount;

    /**
     * The Group Display Name.
     * 
     */
    @SerializedName("groupDisplayName")
    @Expose
    public String groupDisplayName;

    /**
     * The Group Id.
     * 
     */
    @SerializedName("groupId")
    @Expose
    public String groupId;

    /**
     * The Group Type.
     * 
     */
    @SerializedName("groupType")
    @Expose
    public String groupType;

    /**
     * The Is Deleted.
     * 
     */
    @SerializedName("isDeleted")
    @Expose
    public Boolean isDeleted;

    /**
     * The Last Activity Date.
     * 
     */
    @SerializedName("lastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly lastActivityDate;

    /**
     * The Member Count.
     * 
     */
    @SerializedName("memberCount")
    @Expose
    public Long memberCount;

    /**
     * The Owner Principal Name.
     * 
     */
    @SerializedName("ownerPrincipalName")
    @Expose
    public String ownerPrincipalName;

    /**
     * The Report Period.
     * 
     */
    @SerializedName("reportPeriod")
    @Expose
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName("reportRefreshDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Share Point Active File Count.
     * 
     */
    @SerializedName("sharePointActiveFileCount")
    @Expose
    public Long sharePointActiveFileCount;

    /**
     * The Share Point Site Storage Used In Bytes.
     * 
     */
    @SerializedName("sharePointSiteStorageUsedInBytes")
    @Expose
    public Long sharePointSiteStorageUsedInBytes;

    /**
     * The Share Point Total File Count.
     * 
     */
    @SerializedName("sharePointTotalFileCount")
    @Expose
    public Long sharePointTotalFileCount;

    /**
     * The Yammer Liked Message Count.
     * 
     */
    @SerializedName("yammerLikedMessageCount")
    @Expose
    public Long yammerLikedMessageCount;

    /**
     * The Yammer Posted Message Count.
     * 
     */
    @SerializedName("yammerPostedMessageCount")
    @Expose
    public Long yammerPostedMessageCount;

    /**
     * The Yammer Read Message Count.
     * 
     */
    @SerializedName("yammerReadMessageCount")
    @Expose
    public Long yammerReadMessageCount;


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
