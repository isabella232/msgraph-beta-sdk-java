// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceManagementTemplateType;
import com.microsoft.graph.models.generated.PolicyPlatformType;
import com.microsoft.graph.models.generated.DeviceManagementTemplateSubtype;
import com.microsoft.graph.models.extensions.DeviceManagementSettingInstance;
import com.microsoft.graph.models.extensions.DeviceManagementTemplateSettingCategory;
import com.microsoft.graph.models.extensions.DeviceManagementTemplate;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateSettingCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateSettingCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Template.
 */
public class DeviceManagementTemplate extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The template's display name
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Description.
     * The template's description
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Version Info.
     * The template's version information
     */
    @SerializedName("versionInfo")
    @Expose
    public String versionInfo;

    /**
     * The Is Deprecated.
     * The template is deprecated or not. Intents cannot be created from a deprecated template.
     */
    @SerializedName("isDeprecated")
    @Expose
    public Boolean isDeprecated;

    /**
     * The Intent Count.
     * Number of Intents created from this template.
     */
    @SerializedName("intentCount")
    @Expose
    public Integer intentCount;

    /**
     * The Template Type.
     * The template's type.
     */
    @SerializedName("templateType")
    @Expose
    public DeviceManagementTemplateType templateType;

    /**
     * The Platform Type.
     * The template's platform.
     */
    @SerializedName("platformType")
    @Expose
    public PolicyPlatformType platformType;

    /**
     * The Template Subtype.
     * The template's subtype.
     */
    @SerializedName("templateSubtype")
    @Expose
    public DeviceManagementTemplateSubtype templateSubtype;

    /**
     * The Published Date Time.
     * When the template was published
     */
    @SerializedName("publishedDateTime")
    @Expose
    public java.util.Calendar publishedDateTime;

    /**
     * The Settings.
     * Collection of all settings this template has
     */
    public DeviceManagementSettingInstanceCollectionPage settings;

    /**
     * The Categories.
     * Collection of setting categories within the template
     */
    public DeviceManagementTemplateSettingCategoryCollectionPage categories;

    /**
     * The Migratable To.
     * Collection of templates this template can migrate to
     */
    public DeviceManagementTemplateCollectionPage migratableTo;


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


        if (json.has("settings")) {
            final DeviceManagementSettingInstanceCollectionResponse response = new DeviceManagementSettingInstanceCollectionResponse();
            if (json.has("settings@odata.nextLink")) {
                response.nextLink = json.get("settings@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("settings").toString(), JsonObject[].class);
            final DeviceManagementSettingInstance[] array = new DeviceManagementSettingInstance[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementSettingInstance.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            settings = new DeviceManagementSettingInstanceCollectionPage(response, null);
        }

        if (json.has("categories")) {
            final DeviceManagementTemplateSettingCategoryCollectionResponse response = new DeviceManagementTemplateSettingCategoryCollectionResponse();
            if (json.has("categories@odata.nextLink")) {
                response.nextLink = json.get("categories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("categories").toString(), JsonObject[].class);
            final DeviceManagementTemplateSettingCategory[] array = new DeviceManagementTemplateSettingCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementTemplateSettingCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            categories = new DeviceManagementTemplateSettingCategoryCollectionPage(response, null);
        }

        if (json.has("migratableTo")) {
            final DeviceManagementTemplateCollectionResponse response = new DeviceManagementTemplateCollectionResponse();
            if (json.has("migratableTo@odata.nextLink")) {
                response.nextLink = json.get("migratableTo@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("migratableTo").toString(), JsonObject[].class);
            final DeviceManagementTemplate[] array = new DeviceManagementTemplate[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementTemplate.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            migratableTo = new DeviceManagementTemplateCollectionPage(response, null);
        }
    }
}