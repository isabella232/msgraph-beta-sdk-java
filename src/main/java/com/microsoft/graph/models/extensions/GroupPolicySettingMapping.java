// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.MdmSupportedState;
import com.microsoft.graph.models.generated.GroupPolicySettingScope;
import com.microsoft.graph.models.generated.GroupPolicySettingType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Setting Mapping.
 */
public class GroupPolicySettingMapping extends Entity implements IJsonBackedObject {


    /**
     * The Admx Setting Definition Id.
     * Admx Group Policy Id
     */
    @SerializedName("admxSettingDefinitionId")
    @Expose
    public String admxSettingDefinitionId;

    /**
     * The Child Id List.
     * List of Child Ids of the group policy setting.
     */
    @SerializedName("childIdList")
    @Expose
    public java.util.List<String> childIdList;

    /**
     * The Intune Setting Definition Id.
     * The Intune Setting Definition Id
     */
    @SerializedName("intuneSettingDefinitionId")
    @Expose
    public String intuneSettingDefinitionId;

    /**
     * The Intune Setting Uri List.
     * The list of Intune Setting URIs this group policy setting maps to
     */
    @SerializedName("intuneSettingUriList")
    @Expose
    public java.util.List<String> intuneSettingUriList;

    /**
     * The Is Mdm Supported.
     * Indicates if the setting is supported by Intune or not
     */
    @SerializedName("isMdmSupported")
    @Expose
    public Boolean isMdmSupported;

    /**
     * The Mdm Csp Name.
     * The CSP name this group policy setting maps to.
     */
    @SerializedName("mdmCspName")
    @Expose
    public String mdmCspName;

    /**
     * The Mdm Minimum OSVersion.
     * The minimum OS version this mdm setting supports.
     */
    @SerializedName("mdmMinimumOSVersion")
    @Expose
    public Integer mdmMinimumOSVersion;

    /**
     * The Mdm Setting Uri.
     * The MDM CSP URI this group policy setting maps to.
     */
    @SerializedName("mdmSettingUri")
    @Expose
    public String mdmSettingUri;

    /**
     * The Mdm Supported State.
     * Indicates if the setting is supported in Mdm or not
     */
    @SerializedName("mdmSupportedState")
    @Expose
    public MdmSupportedState mdmSupportedState;

    /**
     * The Parent Id.
     * Parent Id of the group policy setting.
     */
    @SerializedName("parentId")
    @Expose
    public String parentId;

    /**
     * The Setting Category.
     * The category the group policy setting is in.
     */
    @SerializedName("settingCategory")
    @Expose
    public String settingCategory;

    /**
     * The Setting Display Name.
     * The display name of this group policy setting.
     */
    @SerializedName("settingDisplayName")
    @Expose
    public String settingDisplayName;

    /**
     * The Setting Display Value.
     * The display value of this group policy setting.
     */
    @SerializedName("settingDisplayValue")
    @Expose
    public String settingDisplayValue;

    /**
     * The Setting Display Value Type.
     * The display value type of this group policy setting.
     */
    @SerializedName("settingDisplayValueType")
    @Expose
    public String settingDisplayValueType;

    /**
     * The Setting Name.
     * The name of this group policy setting.
     */
    @SerializedName("settingName")
    @Expose
    public String settingName;

    /**
     * The Setting Scope.
     * The scope of the setting
     */
    @SerializedName("settingScope")
    @Expose
    public GroupPolicySettingScope settingScope;

    /**
     * The Setting Type.
     * The setting type (security or admx) of the Group Policy.
     */
    @SerializedName("settingType")
    @Expose
    public GroupPolicySettingType settingType;

    /**
     * The Setting Value.
     * The value of this group policy setting.
     */
    @SerializedName("settingValue")
    @Expose
    public String settingValue;

    /**
     * The Setting Value Display Units.
     * The display units of this group policy setting value
     */
    @SerializedName("settingValueDisplayUnits")
    @Expose
    public String settingValueDisplayUnits;

    /**
     * The Setting Value Type.
     * The value type of this group policy setting.
     */
    @SerializedName("settingValueType")
    @Expose
    public String settingValueType;


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
