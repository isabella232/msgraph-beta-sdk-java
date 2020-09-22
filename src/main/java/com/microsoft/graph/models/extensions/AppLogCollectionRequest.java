// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AppLogUploadState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Log Collection Request.
 */
public class AppLogCollectionRequest extends Entity implements IJsonBackedObject {


    /**
     * The Completed Date Time.
     * Time at which the upload log request reached a terminal state
     */
    @SerializedName("completedDateTime")
    @Expose
    public java.util.Calendar completedDateTime;

    /**
     * The Custom Log Folders.
     * List of log folders. 
     */
    @SerializedName("customLogFolders")
    @Expose
    public java.util.List<String> customLogFolders;

    /**
     * The Error Message.
     * Error message if any during the upload process
     */
    @SerializedName("errorMessage")
    @Expose
    public String errorMessage;

    /**
     * The Status.
     * Log upload status
     */
    @SerializedName("status")
    @Expose
    public AppLogUploadState status;


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
