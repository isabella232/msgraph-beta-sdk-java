// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppInstallStatus;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User App Install Status.
 */
public class UserAppInstallStatus extends Entity implements IJsonBackedObject {


    /**
     * The User Name.
     * User name.
     */
    @SerializedName("userName")
    @Expose
    public String userName;

    /**
     * The User Principal Name.
     * User Principal Name.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Installed Device Count.
     * Installed Device Count.
     */
    @SerializedName("installedDeviceCount")
    @Expose
    public Integer installedDeviceCount;

    /**
     * The Failed Device Count.
     * Failed Device Count.
     */
    @SerializedName("failedDeviceCount")
    @Expose
    public Integer failedDeviceCount;

    /**
     * The Not Installed Device Count.
     * Not installed device count.
     */
    @SerializedName("notInstalledDeviceCount")
    @Expose
    public Integer notInstalledDeviceCount;

    /**
     * The App.
     * The navigation link to the mobile app.
     */
    @SerializedName("app")
    @Expose
    public MobileApp app;

    /**
     * The Device Statuses.
     * The install state of the app on devices.
     */
    public MobileAppInstallStatusCollectionPage deviceStatuses;


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


        if (json.has("deviceStatuses")) {
            final MobileAppInstallStatusCollectionResponse response = new MobileAppInstallStatusCollectionResponse();
            if (json.has("deviceStatuses@odata.nextLink")) {
                response.nextLink = json.get("deviceStatuses@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceStatuses").toString(), JsonObject[].class);
            final MobileAppInstallStatus[] array = new MobileAppInstallStatus[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileAppInstallStatus.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceStatuses = new MobileAppInstallStatusCollectionPage(response, null);
        }
    }
}
