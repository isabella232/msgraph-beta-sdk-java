// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EducationSubmissionRecipient;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.EducationSubmissionStatus;
import com.microsoft.graph.models.extensions.EducationOutcome;
import com.microsoft.graph.models.extensions.EducationSubmissionResource;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EducationOutcomeCollectionPage;
import com.microsoft.graph.requests.extensions.EducationSubmissionResourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Submission.
 */
public class EducationSubmission extends Entity implements IJsonBackedObject {


    /**
     * The Recipient.
     * 
     */
    @SerializedName(value = "recipient", alternate = {"Recipient"})
    @Expose
    public EducationSubmissionRecipient recipient;

    /**
     * The Released By.
     * 
     */
    @SerializedName(value = "releasedBy", alternate = {"ReleasedBy"})
    @Expose
    public IdentitySet releasedBy;

    /**
     * The Released Date Time.
     * 
     */
    @SerializedName(value = "releasedDateTime", alternate = {"ReleasedDateTime"})
    @Expose
    public java.util.Calendar releasedDateTime;

    /**
     * The Resources Folder Url.
     * 
     */
    @SerializedName(value = "resourcesFolderUrl", alternate = {"ResourcesFolderUrl"})
    @Expose
    public String resourcesFolderUrl;

    /**
     * The Returned By.
     * 
     */
    @SerializedName(value = "returnedBy", alternate = {"ReturnedBy"})
    @Expose
    public IdentitySet returnedBy;

    /**
     * The Returned Date Time.
     * 
     */
    @SerializedName(value = "returnedDateTime", alternate = {"ReturnedDateTime"})
    @Expose
    public java.util.Calendar returnedDateTime;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public EducationSubmissionStatus status;

    /**
     * The Submitted By.
     * 
     */
    @SerializedName(value = "submittedBy", alternate = {"SubmittedBy"})
    @Expose
    public IdentitySet submittedBy;

    /**
     * The Submitted Date Time.
     * 
     */
    @SerializedName(value = "submittedDateTime", alternate = {"SubmittedDateTime"})
    @Expose
    public java.util.Calendar submittedDateTime;

    /**
     * The Unsubmitted By.
     * 
     */
    @SerializedName(value = "unsubmittedBy", alternate = {"UnsubmittedBy"})
    @Expose
    public IdentitySet unsubmittedBy;

    /**
     * The Unsubmitted Date Time.
     * 
     */
    @SerializedName(value = "unsubmittedDateTime", alternate = {"UnsubmittedDateTime"})
    @Expose
    public java.util.Calendar unsubmittedDateTime;

    /**
     * The Outcomes.
     * 
     */
    @SerializedName(value = "outcomes", alternate = {"Outcomes"})
    @Expose
    public EducationOutcomeCollectionPage outcomes;

    /**
     * The Resources.
     * 
     */
    @SerializedName(value = "resources", alternate = {"Resources"})
    @Expose
    public EducationSubmissionResourceCollectionPage resources;

    /**
     * The Submitted Resources.
     * 
     */
    @SerializedName(value = "submittedResources", alternate = {"SubmittedResources"})
    @Expose
    public EducationSubmissionResourceCollectionPage submittedResources;


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


        if (json.has("outcomes")) {
            outcomes = serializer.deserializeObject(json.get("outcomes").toString(), EducationOutcomeCollectionPage.class);
        }

        if (json.has("resources")) {
            resources = serializer.deserializeObject(json.get("resources").toString(), EducationSubmissionResourceCollectionPage.class);
        }

        if (json.has("submittedResources")) {
            submittedResources = serializer.deserializeObject(json.get("submittedResources").toString(), EducationSubmissionResourceCollectionPage.class);
        }
    }
}
