// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AccessPackageResourceRole;
import com.microsoft.graph.models.extensions.AccessPackageResource;
import com.microsoft.graph.models.extensions.AccessPackageResourceScope;
import com.microsoft.graph.models.extensions.AccessPackage;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageResourceCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Catalog.
 */
public class AccessPackageCatalog extends Entity implements IJsonBackedObject {


    /**
     * The Catalog Status.
     * 
     */
    @SerializedName(value = "catalogStatus", alternate = {"CatalogStatus"})
    @Expose
    public String catalogStatus;

    /**
     * The Catalog Type.
     * 
     */
    @SerializedName(value = "catalogType", alternate = {"CatalogType"})
    @Expose
    public String catalogType;

    /**
     * The Created By.
     * 
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
    public String createdBy;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Is Externally Visible.
     * 
     */
    @SerializedName(value = "isExternallyVisible", alternate = {"IsExternallyVisible"})
    @Expose
    public Boolean isExternallyVisible;

    /**
     * The Modified By.
     * 
     */
    @SerializedName(value = "modifiedBy", alternate = {"ModifiedBy"})
    @Expose
    public String modifiedBy;

    /**
     * The Modified Date Time.
     * 
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
    public java.util.Calendar modifiedDateTime;

    /**
     * The Access Package Resource Roles.
     * 
     */
    @SerializedName(value = "accessPackageResourceRoles", alternate = {"AccessPackageResourceRoles"})
    @Expose
    public AccessPackageResourceRoleCollectionPage accessPackageResourceRoles;

    /**
     * The Access Package Resources.
     * 
     */
    @SerializedName(value = "accessPackageResources", alternate = {"AccessPackageResources"})
    @Expose
    public AccessPackageResourceCollectionPage accessPackageResources;

    /**
     * The Access Package Resource Scopes.
     * 
     */
    @SerializedName(value = "accessPackageResourceScopes", alternate = {"AccessPackageResourceScopes"})
    @Expose
    public AccessPackageResourceScopeCollectionPage accessPackageResourceScopes;

    /**
     * The Access Packages.
     * 
     */
    @SerializedName(value = "accessPackages", alternate = {"AccessPackages"})
    @Expose
    public AccessPackageCollectionPage accessPackages;


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


        if (json.has("accessPackageResourceRoles")) {
            accessPackageResourceRoles = serializer.deserializeObject(json.get("accessPackageResourceRoles").toString(), AccessPackageResourceRoleCollectionPage.class);
        }

        if (json.has("accessPackageResources")) {
            accessPackageResources = serializer.deserializeObject(json.get("accessPackageResources").toString(), AccessPackageResourceCollectionPage.class);
        }

        if (json.has("accessPackageResourceScopes")) {
            accessPackageResourceScopes = serializer.deserializeObject(json.get("accessPackageResourceScopes").toString(), AccessPackageResourceScopeCollectionPage.class);
        }

        if (json.has("accessPackages")) {
            accessPackages = serializer.deserializeObject(json.get("accessPackages").toString(), AccessPackageCollectionPage.class);
        }
    }
}
