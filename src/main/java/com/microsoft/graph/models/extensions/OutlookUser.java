// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.OutlookCategory;
import com.microsoft.graph.models.extensions.OutlookTaskFolder;
import com.microsoft.graph.models.extensions.OutlookTaskGroup;
import com.microsoft.graph.models.extensions.OutlookTask;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.OutlookTaskFolderCollectionResponse;
import com.microsoft.graph.requests.extensions.OutlookTaskFolderCollectionPage;
import com.microsoft.graph.requests.extensions.OutlookTaskGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.OutlookTaskGroupCollectionPage;
import com.microsoft.graph.requests.extensions.OutlookTaskCollectionResponse;
import com.microsoft.graph.requests.extensions.OutlookTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User.
 */
public class OutlookUser extends Entity implements IJsonBackedObject {


    /**
     * The Master Categories.
     * A list of categories defined for the user.
     */
    @SerializedName("masterCategories")
    @Expose
    public OutlookCategoryCollectionPage masterCategories;

    /**
     * The Task Folders.
     * 
     */
    @SerializedName("taskFolders")
    @Expose
    public OutlookTaskFolderCollectionPage taskFolders;

    /**
     * The Task Groups.
     * 
     */
    @SerializedName("taskGroups")
    @Expose
    public OutlookTaskGroupCollectionPage taskGroups;

    /**
     * The Tasks.
     * 
     */
    @SerializedName("tasks")
    @Expose
    public OutlookTaskCollectionPage tasks;


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


        if (json.has("masterCategories")) {
            final OutlookCategoryCollectionResponse response = new OutlookCategoryCollectionResponse();
            if (json.has("masterCategories@odata.nextLink")) {
                response.nextLink = json.get("masterCategories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("masterCategories").toString(), JsonObject[].class);
            final OutlookCategory[] array = new OutlookCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OutlookCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            masterCategories = new OutlookCategoryCollectionPage(response, null);
        }

        if (json.has("taskFolders")) {
            final OutlookTaskFolderCollectionResponse response = new OutlookTaskFolderCollectionResponse();
            if (json.has("taskFolders@odata.nextLink")) {
                response.nextLink = json.get("taskFolders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("taskFolders").toString(), JsonObject[].class);
            final OutlookTaskFolder[] array = new OutlookTaskFolder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OutlookTaskFolder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            taskFolders = new OutlookTaskFolderCollectionPage(response, null);
        }

        if (json.has("taskGroups")) {
            final OutlookTaskGroupCollectionResponse response = new OutlookTaskGroupCollectionResponse();
            if (json.has("taskGroups@odata.nextLink")) {
                response.nextLink = json.get("taskGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("taskGroups").toString(), JsonObject[].class);
            final OutlookTaskGroup[] array = new OutlookTaskGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OutlookTaskGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            taskGroups = new OutlookTaskGroupCollectionPage(response, null);
        }

        if (json.has("tasks")) {
            final OutlookTaskCollectionResponse response = new OutlookTaskCollectionResponse();
            if (json.has("tasks@odata.nextLink")) {
                response.nextLink = json.get("tasks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tasks").toString(), JsonObject[].class);
            final OutlookTask[] array = new OutlookTask[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OutlookTask.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tasks = new OutlookTaskCollectionPage(response, null);
        }
    }
}
