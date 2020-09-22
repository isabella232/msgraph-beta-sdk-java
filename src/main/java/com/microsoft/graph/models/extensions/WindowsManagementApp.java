// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WindowsManagementAppHealthState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.WindowsManagementAppHealthStateCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsManagementAppHealthStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Management App.
 */
public class WindowsManagementApp extends Entity implements IJsonBackedObject {


    /**
     * The Available Version.
     * Windows management app available version.
     */
    @SerializedName("availableVersion")
    @Expose
    public String availableVersion;

    /**
     * The Health States.
     * The list of health states for installed Windows management app.
     */
    @SerializedName("healthStates")
    @Expose
    public WindowsManagementAppHealthStateCollectionPage healthStates;


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


        if (json.has("healthStates")) {
            final WindowsManagementAppHealthStateCollectionResponse response = new WindowsManagementAppHealthStateCollectionResponse();
            if (json.has("healthStates@odata.nextLink")) {
                response.nextLink = json.get("healthStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("healthStates").toString(), JsonObject[].class);
            final WindowsManagementAppHealthState[] array = new WindowsManagementAppHealthState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsManagementAppHealthState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            healthStates = new WindowsManagementAppHealthStateCollectionPage(response, null);
        }
    }
}
