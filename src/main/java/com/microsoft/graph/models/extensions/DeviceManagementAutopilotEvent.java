// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsAutopilotEnrollmentType;
import com.microsoft.graph.models.generated.EnrollmentState;
import com.microsoft.graph.models.generated.WindowsAutopilotDeploymentState;
import com.microsoft.graph.models.extensions.DeviceManagementAutopilotPolicyStatusDetail;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotPolicyStatusDetailCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotPolicyStatusDetailCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Autopilot Event.
 */
public class DeviceManagementAutopilotEvent extends Entity implements IJsonBackedObject {


    /**
     * The Device Id.
     * Device id associated with the object
     */
    @SerializedName("deviceId")
    @Expose
    public String deviceId;

    /**
     * The Event Date Time.
     * Time when the event occurred .
     */
    @SerializedName("eventDateTime")
    @Expose
    public java.util.Calendar eventDateTime;

    /**
     * The Device Registered Date Time.
     * Device registration date.
     */
    @SerializedName("deviceRegisteredDateTime")
    @Expose
    public java.util.Calendar deviceRegisteredDateTime;

    /**
     * The Enrollment Start Date Time.
     * Device enrollment start date.
     */
    @SerializedName("enrollmentStartDateTime")
    @Expose
    public java.util.Calendar enrollmentStartDateTime;

    /**
     * The Enrollment Type.
     * Enrollment type.
     */
    @SerializedName("enrollmentType")
    @Expose
    public WindowsAutopilotEnrollmentType enrollmentType;

    /**
     * The Device Serial Number.
     * Device serial number.
     */
    @SerializedName("deviceSerialNumber")
    @Expose
    public String deviceSerialNumber;

    /**
     * The Managed Device Name.
     * Managed device name.
     */
    @SerializedName("managedDeviceName")
    @Expose
    public String managedDeviceName;

    /**
     * The User Principal Name.
     * User principal name used to enroll the device.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Windows Autopilot Deployment Profile Display Name.
     * Autopilot profile name.
     */
    @SerializedName("windowsAutopilotDeploymentProfileDisplayName")
    @Expose
    public String windowsAutopilotDeploymentProfileDisplayName;

    /**
     * The Enrollment State.
     * Enrollment state like Enrolled, Failed.
     */
    @SerializedName("enrollmentState")
    @Expose
    public EnrollmentState enrollmentState;

    /**
     * The Windows10Enrollment Completion Page Configuration Display Name.
     * Enrollment Status Page profile name
     */
    @SerializedName("windows10EnrollmentCompletionPageConfigurationDisplayName")
    @Expose
    public String windows10EnrollmentCompletionPageConfigurationDisplayName;

    /**
     * The Deployment State.
     * Deployment state like Success, Failure, InProgress, SuccessWithTimeout.
     */
    @SerializedName("deploymentState")
    @Expose
    public WindowsAutopilotDeploymentState deploymentState;

    /**
     * The Os Version.
     * Device operating system version.
     */
    @SerializedName("osVersion")
    @Expose
    public String osVersion;

    /**
     * The Deployment Duration.
     * Autopilot deployment duration including enrollment.
     */
    @SerializedName("deploymentDuration")
    @Expose
    public javax.xml.datatype.Duration deploymentDuration;

    /**
     * The Deployment Total Duration.
     * Total deployment duration from enrollment to Desktop screen.
     */
    @SerializedName("deploymentTotalDuration")
    @Expose
    public javax.xml.datatype.Duration deploymentTotalDuration;

    /**
     * The Device Preparation Duration.
     * Time spent in device enrollment.
     */
    @SerializedName("devicePreparationDuration")
    @Expose
    public javax.xml.datatype.Duration devicePreparationDuration;

    /**
     * The Device Setup Duration.
     * Time spent in device ESP.
     */
    @SerializedName("deviceSetupDuration")
    @Expose
    public javax.xml.datatype.Duration deviceSetupDuration;

    /**
     * The Account Setup Duration.
     * Time spent in user ESP.
     */
    @SerializedName("accountSetupDuration")
    @Expose
    public javax.xml.datatype.Duration accountSetupDuration;

    /**
     * The Deployment Start Date Time.
     * Deployment start time.
     */
    @SerializedName("deploymentStartDateTime")
    @Expose
    public java.util.Calendar deploymentStartDateTime;

    /**
     * The Deployment End Date Time.
     * Deployment end time.
     */
    @SerializedName("deploymentEndDateTime")
    @Expose
    public java.util.Calendar deploymentEndDateTime;

    /**
     * The Targeted App Count.
     * Count of applications targeted.
     */
    @SerializedName("targetedAppCount")
    @Expose
    public Integer targetedAppCount;

    /**
     * The Targeted Policy Count.
     * Count of policies targeted.
     */
    @SerializedName("targetedPolicyCount")
    @Expose
    public Integer targetedPolicyCount;

    /**
     * The Enrollment Failure Details.
     * Enrollment failure details.
     */
    @SerializedName("enrollmentFailureDetails")
    @Expose
    public String enrollmentFailureDetails;

    /**
     * The Policy Status Details.
     * Policy and application status details for this device.
     */
    public DeviceManagementAutopilotPolicyStatusDetailCollectionPage policyStatusDetails;


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


        if (json.has("policyStatusDetails")) {
            final DeviceManagementAutopilotPolicyStatusDetailCollectionResponse response = new DeviceManagementAutopilotPolicyStatusDetailCollectionResponse();
            if (json.has("policyStatusDetails@odata.nextLink")) {
                response.nextLink = json.get("policyStatusDetails@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("policyStatusDetails").toString(), JsonObject[].class);
            final DeviceManagementAutopilotPolicyStatusDetail[] array = new DeviceManagementAutopilotPolicyStatusDetail[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementAutopilotPolicyStatusDetail.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            policyStatusDetails = new DeviceManagementAutopilotPolicyStatusDetailCollectionPage(response, null);
        }
    }
}
