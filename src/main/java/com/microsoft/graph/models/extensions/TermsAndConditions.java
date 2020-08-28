// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TermsAndConditionsGroupAssignment;
import com.microsoft.graph.models.extensions.TermsAndConditionsAssignment;
import com.microsoft.graph.models.extensions.TermsAndConditionsAcceptanceStatus;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.TermsAndConditionsGroupAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.TermsAndConditionsGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions.
 */
public class TermsAndConditions extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * DateTime the object was created.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Modified Date Time.
     * DateTime the object was last modified.
     */
    @SerializedName("modifiedDateTime")
    @Expose
    public java.util.Calendar modifiedDateTime;

    /**
     * The Last Modified Date Time.
     * DateTime the object was last modified.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Display Name.
     * Administrator-supplied name for the T&amp;C policy.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Description.
     * Administrator-supplied description of the T&amp;C policy.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Title.
     * Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&amp;C policy.
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Body Text.
     * Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user on prompts to accept the T&amp;C policy.
     */
    @SerializedName("bodyText")
    @Expose
    public String bodyText;

    /**
     * The Acceptance Statement.
     * Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms and conditions set out in the T&amp;C policy. This is shown to the user on prompts to accept the T&amp;C policy.
     */
    @SerializedName("acceptanceStatement")
    @Expose
    public String acceptanceStatement;

    /**
     * The Version.
     * Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and wishes to require users to re-accept the modified T&amp;C policy.
     */
    @SerializedName("version")
    @Expose
    public Integer version;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Group Assignments.
     * The list of group assignments for this T&amp;C policy.
     */
    public TermsAndConditionsGroupAssignmentCollectionPage groupAssignments;

    /**
     * The Assignments.
     * The list of assignments for this T&amp;C policy.
     */
    public TermsAndConditionsAssignmentCollectionPage assignments;

    /**
     * The Acceptance Statuses.
     * The list of acceptance statuses for this T&amp;C policy.
     */
    public TermsAndConditionsAcceptanceStatusCollectionPage acceptanceStatuses;


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


        if (json.has("groupAssignments")) {
            final TermsAndConditionsGroupAssignmentCollectionResponse response = new TermsAndConditionsGroupAssignmentCollectionResponse();
            if (json.has("groupAssignments@odata.nextLink")) {
                response.nextLink = json.get("groupAssignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupAssignments").toString(), JsonObject[].class);
            final TermsAndConditionsGroupAssignment[] array = new TermsAndConditionsGroupAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TermsAndConditionsGroupAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupAssignments = new TermsAndConditionsGroupAssignmentCollectionPage(response, null);
        }

        if (json.has("assignments")) {
            final TermsAndConditionsAssignmentCollectionResponse response = new TermsAndConditionsAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final TermsAndConditionsAssignment[] array = new TermsAndConditionsAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TermsAndConditionsAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new TermsAndConditionsAssignmentCollectionPage(response, null);
        }

        if (json.has("acceptanceStatuses")) {
            final TermsAndConditionsAcceptanceStatusCollectionResponse response = new TermsAndConditionsAcceptanceStatusCollectionResponse();
            if (json.has("acceptanceStatuses@odata.nextLink")) {
                response.nextLink = json.get("acceptanceStatuses@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("acceptanceStatuses").toString(), JsonObject[].class);
            final TermsAndConditionsAcceptanceStatus[] array = new TermsAndConditionsAcceptanceStatus[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TermsAndConditionsAcceptanceStatus.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            acceptanceStatuses = new TermsAndConditionsAcceptanceStatusCollectionPage(response, null);
        }
    }
}
