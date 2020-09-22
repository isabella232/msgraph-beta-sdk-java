// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Enrollment Completion Page Configuration.
 */
public class Windows10EnrollmentCompletionPageConfiguration extends DeviceEnrollmentConfiguration implements IJsonBackedObject {


    /**
     * The Allow Device Reset On Install Failure.
     * Allow or block device reset on installation failure
     */
    @SerializedName("allowDeviceResetOnInstallFailure")
    @Expose
    public Boolean allowDeviceResetOnInstallFailure;

    /**
     * The Allow Device Use On Install Failure.
     * Allow the user to continue using the device on installation failure
     */
    @SerializedName("allowDeviceUseOnInstallFailure")
    @Expose
    public Boolean allowDeviceUseOnInstallFailure;

    /**
     * The Allow Log Collection On Install Failure.
     * Allow or block log collection on installation failure
     */
    @SerializedName("allowLogCollectionOnInstallFailure")
    @Expose
    public Boolean allowLogCollectionOnInstallFailure;

    /**
     * The Block Device Setup Retry By User.
     * Allow the user to retry the setup on installation failure
     */
    @SerializedName("blockDeviceSetupRetryByUser")
    @Expose
    public Boolean blockDeviceSetupRetryByUser;

    /**
     * The Custom Error Message.
     * Set custom error message to show upon installation failure
     */
    @SerializedName("customErrorMessage")
    @Expose
    public String customErrorMessage;

    /**
     * The Disable User Status Tracking After First User.
     * Only show installation progress for first user post enrollment
     */
    @SerializedName("disableUserStatusTrackingAfterFirstUser")
    @Expose
    public Boolean disableUserStatusTrackingAfterFirstUser;

    /**
     * The Install Progress Timeout In Minutes.
     * Set installation progress timeout in minutes
     */
    @SerializedName("installProgressTimeoutInMinutes")
    @Expose
    public Integer installProgressTimeoutInMinutes;

    /**
     * The Selected Mobile App Ids.
     * Selected applications to track the installation status
     */
    @SerializedName("selectedMobileAppIds")
    @Expose
    public java.util.List<String> selectedMobileAppIds;

    /**
     * The Show Installation Progress.
     * Show or hide installation progress to user
     */
    @SerializedName("showInstallationProgress")
    @Expose
    public Boolean showInstallationProgress;

    /**
     * The Track Install Progress For Autopilot Only.
     * Only show installation progress for Autopilot enrollment scenarios
     */
    @SerializedName("trackInstallProgressForAutopilotOnly")
    @Expose
    public Boolean trackInstallProgressForAutopilotOnly;


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
