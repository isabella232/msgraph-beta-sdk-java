// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.GovernanceSchedule;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignmentRequestStatus;
import com.microsoft.graph.models.extensions.GovernanceResource;
import com.microsoft.graph.models.extensions.GovernanceRoleDefinition;
import com.microsoft.graph.models.extensions.GovernanceSubject;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment Request.
 */
public class GovernanceRoleAssignmentRequest extends Entity implements IJsonBackedObject {


    /**
     * The Assignment State.
     * 
     */
    @SerializedName(value = "assignmentState", alternate = {"AssignmentState"})
    @Expose
    public String assignmentState;

    /**
     * The Linked Eligible Role Assignment Id.
     * 
     */
    @SerializedName(value = "linkedEligibleRoleAssignmentId", alternate = {"LinkedEligibleRoleAssignmentId"})
    @Expose
    public String linkedEligibleRoleAssignmentId;

    /**
     * The Reason.
     * 
     */
    @SerializedName(value = "reason", alternate = {"Reason"})
    @Expose
    public String reason;

    /**
     * The Requested Date Time.
     * 
     */
    @SerializedName(value = "requestedDateTime", alternate = {"RequestedDateTime"})
    @Expose
    public java.util.Calendar requestedDateTime;

    /**
     * The Resource Id.
     * 
     */
    @SerializedName(value = "resourceId", alternate = {"ResourceId"})
    @Expose
    public String resourceId;

    /**
     * The Role Definition Id.
     * 
     */
    @SerializedName(value = "roleDefinitionId", alternate = {"RoleDefinitionId"})
    @Expose
    public String roleDefinitionId;

    /**
     * The Schedule.
     * 
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
    public GovernanceSchedule schedule;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public GovernanceRoleAssignmentRequestStatus status;

    /**
     * The Subject Id.
     * 
     */
    @SerializedName(value = "subjectId", alternate = {"SubjectId"})
    @Expose
    public String subjectId;

    /**
     * The Type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
    public String type;

    /**
     * The Resource.
     * 
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
    public GovernanceResource resource;

    /**
     * The Role Definition.
     * 
     */
    @SerializedName(value = "roleDefinition", alternate = {"RoleDefinition"})
    @Expose
    public GovernanceRoleDefinition roleDefinition;

    /**
     * The Subject.
     * 
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
    public GovernanceSubject subject;


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
