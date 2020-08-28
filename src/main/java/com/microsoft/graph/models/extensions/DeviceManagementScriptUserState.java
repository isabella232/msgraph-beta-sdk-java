// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementScriptDeviceState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script User State.
 */
public class DeviceManagementScriptUserState extends Entity implements IJsonBackedObject {


    /**
     * The Success Device Count.
     * Success device count for specific user.
     */
    @SerializedName("successDeviceCount")
    @Expose
    public Integer successDeviceCount;

    /**
     * The Error Device Count.
     * Error device count for specific user.
     */
    @SerializedName("errorDeviceCount")
    @Expose
    public Integer errorDeviceCount;

    /**
     * The User Principal Name.
     * User principle name of specific user.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Device Run States.
     * List of run states for this script across all devices of specific user.
     */
    public DeviceManagementScriptDeviceStateCollectionPage deviceRunStates;


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


        if (json.has("deviceRunStates")) {
            final DeviceManagementScriptDeviceStateCollectionResponse response = new DeviceManagementScriptDeviceStateCollectionResponse();
            if (json.has("deviceRunStates@odata.nextLink")) {
                response.nextLink = json.get("deviceRunStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceRunStates").toString(), JsonObject[].class);
            final DeviceManagementScriptDeviceState[] array = new DeviceManagementScriptDeviceState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementScriptDeviceState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceRunStates = new DeviceManagementScriptDeviceStateCollectionPage(response, null);
        }
    }
}
