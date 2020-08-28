// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.models.extensions.RoleAssignment;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionResponse;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Assignment.
 */
public class DeviceAndAppManagementRoleAssignment extends RoleAssignment implements IJsonBackedObject {


    /**
     * The Members.
     * The list of ids of role member security groups. These are IDs from Azure Active Directory.
     */
    @SerializedName("members")
    @Expose
    public java.util.List<String> members;

    /**
     * The Role Scope Tags.
     * The set of Role Scope Tags defined on the Role Assignment.
     */
    public RoleScopeTagCollectionPage roleScopeTags;


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


        if (json.has("roleScopeTags")) {
            final RoleScopeTagCollectionResponse response = new RoleScopeTagCollectionResponse();
            if (json.has("roleScopeTags@odata.nextLink")) {
                response.nextLink = json.get("roleScopeTags@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleScopeTags").toString(), JsonObject[].class);
            final RoleScopeTag[] array = new RoleScopeTag[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RoleScopeTag.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleScopeTags = new RoleScopeTagCollectionPage(response, null);
        }
    }
}
