// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentPolicy;
import com.microsoft.graph.models.extensions.AccessPackageCatalog;
import com.microsoft.graph.models.extensions.AccessPackageResourceRoleScope;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeCollectionResponse;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package.
 */
public class AccessPackage extends Entity implements IJsonBackedObject {


    /**
     * The Catalog Id.
     * 
     */
    @SerializedName("catalogId")
    @Expose
    public String catalogId;

    /**
     * The Created By.
     * 
     */
    @SerializedName("createdBy")
    @Expose
    public String createdBy;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Hidden.
     * 
     */
    @SerializedName("isHidden")
    @Expose
    public Boolean isHidden;

    /**
     * The Is Role Scopes Visible.
     * 
     */
    @SerializedName("isRoleScopesVisible")
    @Expose
    public Boolean isRoleScopesVisible;

    /**
     * The Modified By.
     * 
     */
    @SerializedName("modifiedBy")
    @Expose
    public String modifiedBy;

    /**
     * The Modified Date Time.
     * 
     */
    @SerializedName("modifiedDateTime")
    @Expose
    public java.util.Calendar modifiedDateTime;

    /**
     * The Access Package Assignment Policies.
     * 
     */
    @SerializedName("accessPackageAssignmentPolicies")
    @Expose
    public AccessPackageAssignmentPolicyCollectionPage accessPackageAssignmentPolicies;

    /**
     * The Access Package Catalog.
     * 
     */
    @SerializedName("accessPackageCatalog")
    @Expose
    public AccessPackageCatalog accessPackageCatalog;

    /**
     * The Access Package Resource Role Scopes.
     * 
     */
    @SerializedName("accessPackageResourceRoleScopes")
    @Expose
    public AccessPackageResourceRoleScopeCollectionPage accessPackageResourceRoleScopes;


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


        if (json.has("accessPackageAssignmentPolicies")) {
            final AccessPackageAssignmentPolicyCollectionResponse response = new AccessPackageAssignmentPolicyCollectionResponse();
            if (json.has("accessPackageAssignmentPolicies@odata.nextLink")) {
                response.nextLink = json.get("accessPackageAssignmentPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("accessPackageAssignmentPolicies").toString(), JsonObject[].class);
            final AccessPackageAssignmentPolicy[] array = new AccessPackageAssignmentPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AccessPackageAssignmentPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            accessPackageAssignmentPolicies = new AccessPackageAssignmentPolicyCollectionPage(response, null);
        }

        if (json.has("accessPackageResourceRoleScopes")) {
            final AccessPackageResourceRoleScopeCollectionResponse response = new AccessPackageResourceRoleScopeCollectionResponse();
            if (json.has("accessPackageResourceRoleScopes@odata.nextLink")) {
                response.nextLink = json.get("accessPackageResourceRoleScopes@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("accessPackageResourceRoleScopes").toString(), JsonObject[].class);
            final AccessPackageResourceRoleScope[] array = new AccessPackageResourceRoleScope[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AccessPackageResourceRoleScope.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            accessPackageResourceRoleScopes = new AccessPackageResourceRoleScopeCollectionPage(response, null);
        }
    }
}
