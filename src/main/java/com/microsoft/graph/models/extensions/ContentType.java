// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.models.extensions.ContentTypeOrder;
import com.microsoft.graph.models.extensions.ColumnLink;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ColumnLinkCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type.
 */
public class ContentType extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * The descriptive text for the item.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Group.
     * The name of the group this content type belongs to. Helps organize related content types.
     */
    @SerializedName("group")
    @Expose
    public String group;

    /**
     * The Hidden.
     * Indicates whether the content type is hidden in the list's 'New' menu.
     */
    @SerializedName("hidden")
    @Expose
    public Boolean hidden;

    /**
     * The Inherited From.
     * If this content type is inherited from another scope (like a site), provides a reference to the item where the content type is defined.
     */
    @SerializedName("inheritedFrom")
    @Expose
    public ItemReference inheritedFrom;

    /**
     * The Name.
     * The name of the content type.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Order.
     * Specifies the order in which the content type appears in the selection UI.
     */
    @SerializedName("order")
    @Expose
    public ContentTypeOrder order;

    /**
     * The Parent Id.
     * The unique identifier of the content type.
     */
    @SerializedName("parentId")
    @Expose
    public String parentId;

    /**
     * The Read Only.
     * If true, the content type cannot be modified unless this value is first set to false.
     */
    @SerializedName("readOnly")
    @Expose
    public Boolean readOnly;

    /**
     * The Sealed.
     * If true, the content type cannot be modified by users or through push-down operations. Only site collection administrators can seal or unseal content types.
     */
    @SerializedName("sealed")
    @Expose
    public Boolean sealed;

    /**
     * The Column Links.
     * The collection of columns that are required by this content type
     */
    @SerializedName("columnLinks")
    @Expose
    public ColumnLinkCollectionPage columnLinks;


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


        if (json.has("columnLinks")) {
            columnLinks = serializer.deserializeObject(json.get("columnLinks").toString(), ColumnLinkCollectionPage.class);
        }
    }
}
