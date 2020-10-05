// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.SecureAssessmentAccountType;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Secure Assessment Configuration.
 */
public class Windows10SecureAssessmentConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Allow Printing.
     * Indicates whether or not to allow the app from printing during the test.
     */
    @SerializedName("allowPrinting")
    @Expose
    public Boolean allowPrinting;

    /**
     * The Allow Screen Capture.
     * Indicates whether or not to allow screen capture capability during a test.
     */
    @SerializedName("allowScreenCapture")
    @Expose
    public Boolean allowScreenCapture;

    /**
     * The Allow Text Suggestion.
     * Indicates whether or not to allow text suggestions during the test.
     */
    @SerializedName("allowTextSuggestion")
    @Expose
    public Boolean allowTextSuggestion;

    /**
     * The Assessment App User Model Id.
     * Specifies the application user model ID of the assessment app launched when a user signs in to a secure assessment with a local guest account. Important notice: this property must be set with localGuestAccountName in order to make the local guest account sign-in experience work properly for secure assessments.
     */
    @SerializedName("assessmentAppUserModelId")
    @Expose
    public String assessmentAppUserModelId;

    /**
     * The Configuration Account.
     * The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username).
     */
    @SerializedName("configurationAccount")
    @Expose
    public String configurationAccount;

    /**
     * The Configuration Account Type.
     * The account type used to by ConfigurationAccount.
     */
    @SerializedName("configurationAccountType")
    @Expose
    public SecureAssessmentAccountType configurationAccountType;

    /**
     * The Launch Uri.
     * Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/).
     */
    @SerializedName("launchUri")
    @Expose
    public String launchUri;

    /**
     * The Local Guest Account Name.
     * Specifies the display text for the local guest account shown on the sign-in screen. Typically is the name of an assessment. When the user clicks the local guest account on the sign-in screen, an assessment app is launched with a specified assessment URL. Secure assessments can only be configured with local guest account sign-in on devices running Windows 10, version 1903 or later. Important notice: this property must be set with assessmentAppUserModelID in order to make the local guest account sign-in experience work properly for secure assessments.
     */
    @SerializedName("localGuestAccountName")
    @Expose
    public String localGuestAccountName;


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
