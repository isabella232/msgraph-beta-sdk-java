// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RoleAssignmentScopeType;
import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Assignment.
 */
public class RoleAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * Description of the Role Assignment.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display or friendly name of the role Assignment.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Resource Scopes.
     * List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     */
    @SerializedName("resourceScopes")
    @Expose
    public java.util.List<String> resourceScopes;

    /**
     * The Scope Members.
     * List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     */
    @SerializedName("scopeMembers")
    @Expose
    public java.util.List<String> scopeMembers;

    /**
     * The Scope Type.
     * Specifies the type of scope for a Role Assignment. Default type 'ResourceScope' allows assignment of ResourceScopes. For 'AllDevices', 'AllLicensedUsers', and 'AllDevicesAndLicensedUsers', the ResourceScopes property should be left empty.
     */
    @SerializedName("scopeType")
    @Expose
    public RoleAssignmentScopeType scopeType;

    /**
     * The Role Definition.
     * Role definition this assignment is part of.
     */
    @SerializedName("roleDefinition")
    @Expose
    public RoleDefinition roleDefinition;


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
