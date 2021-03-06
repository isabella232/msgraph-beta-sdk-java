// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AppScope;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.UnifiedRoleDefinition;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AppScopeCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Multiple.
 */
public class UnifiedRoleAssignmentMultiple extends Entity implements IJsonBackedObject {


    /**
     * The App Scope Ids.
     * 
     */
    @SerializedName(value = "appScopeIds", alternate = {"AppScopeIds"})
    @Expose
    public java.util.List<String> appScopeIds;

    /**
     * The Condition.
     * 
     */
    @SerializedName(value = "condition", alternate = {"Condition"})
    @Expose
    public String condition;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Directory Scope Ids.
     * 
     */
    @SerializedName(value = "directoryScopeIds", alternate = {"DirectoryScopeIds"})
    @Expose
    public java.util.List<String> directoryScopeIds;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Principal Ids.
     * 
     */
    @SerializedName(value = "principalIds", alternate = {"PrincipalIds"})
    @Expose
    public java.util.List<String> principalIds;

    /**
     * The Role Definition Id.
     * 
     */
    @SerializedName(value = "roleDefinitionId", alternate = {"RoleDefinitionId"})
    @Expose
    public String roleDefinitionId;

    /**
     * The App Scopes.
     * 
     */
    @SerializedName(value = "appScopes", alternate = {"AppScopes"})
    @Expose
    public AppScopeCollectionPage appScopes;

    /**
     * The Directory Scopes.
     * 
     */
    public DirectoryObjectCollectionPage directoryScopes;

    /**
     * The Principals.
     * 
     */
    public DirectoryObjectCollectionPage principals;

    /**
     * The Role Definition.
     * 
     */
    @SerializedName(value = "roleDefinition", alternate = {"RoleDefinition"})
    @Expose
    public UnifiedRoleDefinition roleDefinition;


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


        if (json.has("appScopes")) {
            appScopes = serializer.deserializeObject(json.get("appScopes").toString(), AppScopeCollectionPage.class);
        }

        if (json.has("directoryScopes")) {
            directoryScopes = serializer.deserializeObject(json.get("directoryScopes").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("principals")) {
            principals = serializer.deserializeObject(json.get("principals").toString(), DirectoryObjectCollectionPage.class);
        }
    }
}
