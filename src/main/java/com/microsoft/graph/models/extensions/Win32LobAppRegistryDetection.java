// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Win32LobAppRegistryDetectionType;
import com.microsoft.graph.models.generated.Win32LobAppDetectionOperator;
import com.microsoft.graph.models.extensions.Win32LobAppDetection;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App Registry Detection.
 */
public class Win32LobAppRegistryDetection extends Win32LobAppDetection implements IJsonBackedObject {


    /**
     * The Check32Bit On64System.
     * A value indicating whether this registry path is for checking 32-bit app on 64-bit system
     */
    @SerializedName("check32BitOn64System")
    @Expose
    public Boolean check32BitOn64System;

    /**
     * The Detection Type.
     * The registry data detection type
     */
    @SerializedName("detectionType")
    @Expose
    public Win32LobAppRegistryDetectionType detectionType;

    /**
     * The Detection Value.
     * The registry detection value
     */
    @SerializedName("detectionValue")
    @Expose
    public String detectionValue;

    /**
     * The Key Path.
     * The registry key path to detect Win32 Line of Business (LoB) app
     */
    @SerializedName("keyPath")
    @Expose
    public String keyPath;

    /**
     * The Operator.
     * The operator for registry data detection
     */
    @SerializedName("operator")
    @Expose
    public EnumSet<Win32LobAppDetectionOperator> operator;

    /**
     * The Value Name.
     * The registry value name
     */
    @SerializedName("valueName")
    @Expose
    public String valueName;


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
