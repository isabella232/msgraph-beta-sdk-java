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
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Assigned Access Profile.
 */
public class WindowsAssignedAccessProfile extends Entity implements IJsonBackedObject {


    /**
     * The Profile Name.
     * This is a friendly name??used to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     */
    @SerializedName("profileName")
    @Expose
    public String profileName;

    /**
     * The Show Task Bar.
     * This setting allows the admin to specify whether the Task Bar is shown or not.
     */
    @SerializedName("showTaskBar")
    @Expose
    public Boolean showTaskBar;

    /**
     * The App User Model Ids.
     * These are the only Windows Store Apps that will be available to launch from the Start menu.
     */
    @SerializedName("appUserModelIds")
    @Expose
    public java.util.List<String> appUserModelIds;

    /**
     * The Desktop App Paths.
     * These are the paths of the Desktop Apps that will be available on the Start menu and the only apps the user will be able to launch.
     */
    @SerializedName("desktopAppPaths")
    @Expose
    public java.util.List<String> desktopAppPaths;

    /**
     * The User Accounts.
     * The user accounts that will be locked to this kiosk configuration.
     */
    @SerializedName("userAccounts")
    @Expose
    public java.util.List<String> userAccounts;

    /**
     * The Start Menu Layout Xml.
     * Allows admins to override the default Start layout and prevents the user from changing it.??The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format.
     */
    @SerializedName("startMenuLayoutXml")
    @Expose
    public byte[] startMenuLayoutXml;


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