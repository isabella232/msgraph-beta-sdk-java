// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AndroidForWorkRequiredPasswordType;
import com.microsoft.graph.models.generated.AndroidForWorkCrossProfileDataSharingType;
import com.microsoft.graph.models.generated.AndroidForWorkDefaultAppPermissionPolicyType;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work General Device Configuration.
 */
public class AndroidForWorkGeneralDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Password Block Face Unlock.
     * Indicates whether or not to block face unlock.
     */
    @SerializedName("passwordBlockFaceUnlock")
    @Expose
    public Boolean passwordBlockFaceUnlock;

    /**
     * The Password Block Fingerprint Unlock.
     * Indicates whether or not to block fingerprint unlock.
     */
    @SerializedName("passwordBlockFingerprintUnlock")
    @Expose
    public Boolean passwordBlockFingerprintUnlock;

    /**
     * The Password Block Iris Unlock.
     * Indicates whether or not to block iris unlock.
     */
    @SerializedName("passwordBlockIrisUnlock")
    @Expose
    public Boolean passwordBlockIrisUnlock;

    /**
     * The Password Block Trust Agents.
     * Indicates whether or not to block Smart Lock and other trust agents.
     */
    @SerializedName("passwordBlockTrustAgents")
    @Expose
    public Boolean passwordBlockTrustAgents;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires. Valid values 1 to 365
     */
    @SerializedName("passwordExpirationDays")
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Length.
     * Minimum length of passwords. Valid values 4 to 16
     */
    @SerializedName("passwordMinimumLength")
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before the screen times out.
     */
    @SerializedName("passwordMinutesOfInactivityBeforeScreenTimeout")
    @Expose
    public Integer passwordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 0 to 24
     */
    @SerializedName("passwordPreviousPasswordBlockCount")
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required Type.
     * Type of password that is required.
     */
    @SerializedName("passwordRequiredType")
    @Expose
    public AndroidForWorkRequiredPasswordType passwordRequiredType;

    /**
     * The Password Sign In Failure Count Before Factory Reset.
     * Number of sign in failures allowed before factory reset. Valid values 1 to 16
     */
    @SerializedName("passwordSignInFailureCountBeforeFactoryReset")
    @Expose
    public Integer passwordSignInFailureCountBeforeFactoryReset;

    /**
     * The Security Require Verify Apps.
     * Require the Android Verify apps feature is turned on.
     */
    @SerializedName("securityRequireVerifyApps")
    @Expose
    public Boolean securityRequireVerifyApps;

    /**
     * The Vpn Always On Package Identifier.
     * Enable lockdown mode for always-on VPN.
     */
    @SerializedName("vpnAlwaysOnPackageIdentifier")
    @Expose
    public String vpnAlwaysOnPackageIdentifier;

    /**
     * The Vpn Enable Always On Lockdown Mode.
     * Enable lockdown mode for always-on VPN.
     */
    @SerializedName("vpnEnableAlwaysOnLockdownMode")
    @Expose
    public Boolean vpnEnableAlwaysOnLockdownMode;

    /**
     * The Work Profile Allow Widgets.
     * Allow widgets from work profile apps.
     */
    @SerializedName("workProfileAllowWidgets")
    @Expose
    public Boolean workProfileAllowWidgets;

    /**
     * The Work Profile Block Adding Accounts.
     * Block users from adding/removing accounts in work profile.
     */
    @SerializedName("workProfileBlockAddingAccounts")
    @Expose
    public Boolean workProfileBlockAddingAccounts;

    /**
     * The Work Profile Block Camera.
     * Block work profile camera.
     */
    @SerializedName("workProfileBlockCamera")
    @Expose
    public Boolean workProfileBlockCamera;

    /**
     * The Work Profile Block Cross Profile Caller Id.
     * Block display work profile caller ID in personal profile.
     */
    @SerializedName("workProfileBlockCrossProfileCallerId")
    @Expose
    public Boolean workProfileBlockCrossProfileCallerId;

    /**
     * The Work Profile Block Cross Profile Contacts Search.
     * Block work profile contacts availability in personal profile.
     */
    @SerializedName("workProfileBlockCrossProfileContactsSearch")
    @Expose
    public Boolean workProfileBlockCrossProfileContactsSearch;

    /**
     * The Work Profile Block Cross Profile Copy Paste.
     * Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
     */
    @SerializedName("workProfileBlockCrossProfileCopyPaste")
    @Expose
    public Boolean workProfileBlockCrossProfileCopyPaste;

    /**
     * The Work Profile Block Notifications While Device Locked.
     * Indicates whether or not to block notifications while device locked.
     */
    @SerializedName("workProfileBlockNotificationsWhileDeviceLocked")
    @Expose
    public Boolean workProfileBlockNotificationsWhileDeviceLocked;

    /**
     * The Work Profile Block Personal App Installs From Unknown Sources.
     * Prevent app installations from unknown sources in the personal profile.
     */
    @SerializedName("workProfileBlockPersonalAppInstallsFromUnknownSources")
    @Expose
    public Boolean workProfileBlockPersonalAppInstallsFromUnknownSources;

    /**
     * The Work Profile Block Screen Capture.
     * Block screen capture in work profile.
     */
    @SerializedName("workProfileBlockScreenCapture")
    @Expose
    public Boolean workProfileBlockScreenCapture;

    /**
     * The Work Profile Bluetooth Enable Contact Sharing.
     * Allow bluetooth devices to access enterprise contacts.
     */
    @SerializedName("workProfileBluetoothEnableContactSharing")
    @Expose
    public Boolean workProfileBluetoothEnableContactSharing;

    /**
     * The Work Profile Data Sharing Type.
     * Type of data sharing that is allowed.
     */
    @SerializedName("workProfileDataSharingType")
    @Expose
    public AndroidForWorkCrossProfileDataSharingType workProfileDataSharingType;

    /**
     * The Work Profile Default App Permission Policy.
     * Type of password that is required.
     */
    @SerializedName("workProfileDefaultAppPermissionPolicy")
    @Expose
    public AndroidForWorkDefaultAppPermissionPolicyType workProfileDefaultAppPermissionPolicy;

    /**
     * The Work Profile Password Block Face Unlock.
     * Indicates whether or not to block face unlock for work profile.
     */
    @SerializedName("workProfilePasswordBlockFaceUnlock")
    @Expose
    public Boolean workProfilePasswordBlockFaceUnlock;

    /**
     * The Work Profile Password Block Fingerprint Unlock.
     * Indicates whether or not to block fingerprint unlock for work profile.
     */
    @SerializedName("workProfilePasswordBlockFingerprintUnlock")
    @Expose
    public Boolean workProfilePasswordBlockFingerprintUnlock;

    /**
     * The Work Profile Password Block Iris Unlock.
     * Indicates whether or not to block iris unlock for work profile.
     */
    @SerializedName("workProfilePasswordBlockIrisUnlock")
    @Expose
    public Boolean workProfilePasswordBlockIrisUnlock;

    /**
     * The Work Profile Password Block Trust Agents.
     * Indicates whether or not to block Smart Lock and other trust agents for work profile.
     */
    @SerializedName("workProfilePasswordBlockTrustAgents")
    @Expose
    public Boolean workProfilePasswordBlockTrustAgents;

    /**
     * The Work Profile Password Expiration Days.
     * Number of days before the work profile password expires. Valid values 1 to 365
     */
    @SerializedName("workProfilePasswordExpirationDays")
    @Expose
    public Integer workProfilePasswordExpirationDays;

    /**
     * The Work Profile Password Minimum Length.
     * Minimum length of work profile password. Valid values 4 to 16
     */
    @SerializedName("workProfilePasswordMinimumLength")
    @Expose
    public Integer workProfilePasswordMinimumLength;

    /**
     * The Work Profile Password Min Letter Characters.
     * Minimum # of letter characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinLetterCharacters")
    @Expose
    public Integer workProfilePasswordMinLetterCharacters;

    /**
     * The Work Profile Password Min Lower Case Characters.
     * Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinLowerCaseCharacters")
    @Expose
    public Integer workProfilePasswordMinLowerCaseCharacters;

    /**
     * The Work Profile Password Min Non Letter Characters.
     * Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinNonLetterCharacters")
    @Expose
    public Integer workProfilePasswordMinNonLetterCharacters;

    /**
     * The Work Profile Password Min Numeric Characters.
     * Minimum # of numeric characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinNumericCharacters")
    @Expose
    public Integer workProfilePasswordMinNumericCharacters;

    /**
     * The Work Profile Password Min Symbol Characters.
     * Minimum # of symbols required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinSymbolCharacters")
    @Expose
    public Integer workProfilePasswordMinSymbolCharacters;

    /**
     * The Work Profile Password Min Upper Case Characters.
     * Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinUpperCaseCharacters")
    @Expose
    public Integer workProfilePasswordMinUpperCaseCharacters;

    /**
     * The Work Profile Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before the screen times out.
     */
    @SerializedName("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout")
    @Expose
    public Integer workProfilePasswordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Work Profile Password Previous Password Block Count.
     * Number of previous work profile passwords to block. Valid values 0 to 24
     */
    @SerializedName("workProfilePasswordPreviousPasswordBlockCount")
    @Expose
    public Integer workProfilePasswordPreviousPasswordBlockCount;

    /**
     * The Work Profile Password Required Type.
     * Type of work profile password that is required.
     */
    @SerializedName("workProfilePasswordRequiredType")
    @Expose
    public AndroidForWorkRequiredPasswordType workProfilePasswordRequiredType;

    /**
     * The Work Profile Password Sign In Failure Count Before Factory Reset.
     * Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
     */
    @SerializedName("workProfilePasswordSignInFailureCountBeforeFactoryReset")
    @Expose
    public Integer workProfilePasswordSignInFailureCountBeforeFactoryReset;

    /**
     * The Work Profile Require Password.
     * Password is required or not for work profile
     */
    @SerializedName("workProfileRequirePassword")
    @Expose
    public Boolean workProfileRequirePassword;


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
