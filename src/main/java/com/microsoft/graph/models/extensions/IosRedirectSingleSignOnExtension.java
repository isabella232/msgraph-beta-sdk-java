// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.KeyTypedValuePair;
import com.microsoft.graph.models.extensions.IosSingleSignOnExtension;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Redirect Single Sign On Extension.
 */
public class IosRedirectSingleSignOnExtension extends IosSingleSignOnExtension implements IJsonBackedObject {


    /**
     * The Extension Identifier.
     * Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     */
    @SerializedName("extensionIdentifier")
    @Expose
    public String extensionIdentifier;

    /**
     * The Team Identifier.
     * Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     */
    @SerializedName("teamIdentifier")
    @Expose
    public String teamIdentifier;

    /**
     * The Configurations.
     * Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("configurations")
    @Expose
    public java.util.List<KeyTypedValuePair> configurations;

    /**
     * The Url Prefixes.
     * One or more URL prefixes of identity providers on whose behalf the app extension performs single sign-on. URLs must begin with http:// or https://. All URL prefixes must be unique for all profiles.
     */
    @SerializedName("urlPrefixes")
    @Expose
    public java.util.List<String> urlPrefixes;


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
