// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.RoleScopeTagInfo;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Actor.
 */
public class AuditActor implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Application Display Name.
     * Name of the Application.
     */
    @SerializedName("applicationDisplayName")
    @Expose
    public String applicationDisplayName;

    /**
     * The Application Id.
     * AAD Application Id.
     */
    @SerializedName("applicationId")
    @Expose
    public String applicationId;

    /**
     * The Ip Address.
     * IPAddress.
     */
    @SerializedName("ipAddress")
    @Expose
    public String ipAddress;

    /**
     * The Remote Tenant Id.
     * Remote Tenant Id
     */
    @SerializedName("remoteTenantId")
    @Expose
    public String remoteTenantId;

    /**
     * The Remote User Id.
     * Remote User Id
     */
    @SerializedName("remoteUserId")
    @Expose
    public String remoteUserId;

    /**
     * The Service Principal Name.
     * Service Principal Name (SPN).
     */
    @SerializedName("servicePrincipalName")
    @Expose
    public String servicePrincipalName;

    /**
     * The Type.
     * Actor Type.
     */
    @SerializedName("type")
    @Expose
    public String type;

    /**
     * The User Id.
     * User Id.
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The User Permissions.
     * List of user permissions when the audit was performed.
     */
    @SerializedName("userPermissions")
    @Expose
    public java.util.List<String> userPermissions;

    /**
     * The User Principal Name.
     * User Principal Name (UPN).
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The User Role Scope Tags.
     * List of user scope tags when the audit was performed.
     */
    @SerializedName("userRoleScopeTags")
    @Expose
    public java.util.List<RoleScopeTagInfo> userRoleScopeTags;


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
