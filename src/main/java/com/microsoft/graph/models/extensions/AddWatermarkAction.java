// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WatermarkLayout;
import com.microsoft.graph.models.extensions.InformationProtectionAction;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Add Watermark Action.
 */
public class AddWatermarkAction extends InformationProtectionAction implements IJsonBackedObject {


    /**
     * The Font Color.
     * 
     */
    @SerializedName("fontColor")
    @Expose
    public String fontColor;

    /**
     * The Font Name.
     * 
     */
    @SerializedName("fontName")
    @Expose
    public String fontName;

    /**
     * The Font Size.
     * 
     */
    @SerializedName("fontSize")
    @Expose
    public Integer fontSize;

    /**
     * The Layout.
     * 
     */
    @SerializedName("layout")
    @Expose
    public WatermarkLayout layout;

    /**
     * The Text.
     * 
     */
    @SerializedName("text")
    @Expose
    public String text;

    /**
     * The Ui Element Name.
     * 
     */
    @SerializedName("uiElementName")
    @Expose
    public String uiElementName;


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
