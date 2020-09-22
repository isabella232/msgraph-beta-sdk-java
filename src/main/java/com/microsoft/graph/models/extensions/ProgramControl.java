// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserIdentity;
import com.microsoft.graph.models.extensions.ProgramResource;
import com.microsoft.graph.models.extensions.Program;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Program Control.
 */
public class ProgramControl extends Entity implements IJsonBackedObject {


    /**
     * The Control Id.
     * 
     */
    @SerializedName("controlId")
    @Expose
    public String controlId;

    /**
     * The Control Type Id.
     * 
     */
    @SerializedName("controlTypeId")
    @Expose
    public String controlTypeId;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Owner.
     * 
     */
    @SerializedName("owner")
    @Expose
    public UserIdentity owner;

    /**
     * The Program Id.
     * 
     */
    @SerializedName("programId")
    @Expose
    public String programId;

    /**
     * The Resource.
     * 
     */
    @SerializedName("resource")
    @Expose
    public ProgramResource resource;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public String status;

    /**
     * The Program.
     * 
     */
    @SerializedName("program")
    @Expose
    public Program program;


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
