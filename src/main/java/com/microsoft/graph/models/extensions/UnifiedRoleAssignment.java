// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AppScope;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.UnifiedRoleDefinition;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment.
 */
public class UnifiedRoleAssignment extends Entity implements IJsonBackedObject {


    /**
     * The App Scope Id.
     * 
     */
    @SerializedName("appScopeId")
    @Expose
    public String appScopeId;

    /**
     * The Condition.
     * 
     */
    @SerializedName("condition")
    @Expose
    public String condition;

    /**
     * The Directory Scope Id.
     * 
     */
    @SerializedName("directoryScopeId")
    @Expose
    public String directoryScopeId;

    /**
     * The Principal Id.
     * 
     */
    @SerializedName("principalId")
    @Expose
    public String principalId;

    /**
     * The Resource Scope.
     * 
     */
    @SerializedName("resourceScope")
    @Expose
    public String resourceScope;

    /**
     * The Role Definition Id.
     * 
     */
    @SerializedName("roleDefinitionId")
    @Expose
    public String roleDefinitionId;

    /**
     * The App Scope.
     * 
     */
    @SerializedName("appScope")
    @Expose
    public AppScope appScope;

    /**
     * The Directory Scope.
     * 
     */
    @SerializedName("directoryScope")
    @Expose
    public DirectoryObject directoryScope;

    /**
     * The Principal.
     * 
     */
    @SerializedName("principal")
    @Expose
    public DirectoryObject principal;

    /**
     * The Role Definition.
     * 
     */
    @SerializedName("roleDefinition")
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

    }
}
