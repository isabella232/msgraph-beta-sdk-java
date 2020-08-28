// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ManagedAppDataTransferLevel;
import com.microsoft.graph.models.generated.ManagedAppClipboardSharingLevel;
import com.microsoft.graph.models.generated.ManagedAppPinCharacterSet;
import com.microsoft.graph.models.generated.ManagedAppDataStorageLocation;
import com.microsoft.graph.models.generated.ManagedAppRemediationAction;
import com.microsoft.graph.models.generated.ManagedAppNotificationRestriction;
import com.microsoft.graph.models.generated.ManagedBrowserType;
import com.microsoft.graph.models.generated.ManagedAppDeviceThreatLevel;
import com.microsoft.graph.models.generated.ManagedAppDataIngestionLocation;
import com.microsoft.graph.models.generated.ManagedAppPhoneNumberRedirectLevel;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Protection.
 */
public class ManagedAppProtection extends ManagedAppPolicy implements IJsonBackedObject {


    /**
     * The Period Offline Before Access Check.
     * The period after which access is checked when the device is not connected to the internet.
     */
    @SerializedName("periodOfflineBeforeAccessCheck")
    @Expose
    public javax.xml.datatype.Duration periodOfflineBeforeAccessCheck;

    /**
     * The Period Online Before Access Check.
     * The period after which access is checked when the device is connected to the internet.
     */
    @SerializedName("periodOnlineBeforeAccessCheck")
    @Expose
    public javax.xml.datatype.Duration periodOnlineBeforeAccessCheck;

    /**
     * The Allowed Inbound Data Transfer Sources.
     * Sources from which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
     */
    @SerializedName("allowedInboundDataTransferSources")
    @Expose
    public ManagedAppDataTransferLevel allowedInboundDataTransferSources;

    /**
     * The Allowed Outbound Data Transfer Destinations.
     * Destinations to which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
     */
    @SerializedName("allowedOutboundDataTransferDestinations")
    @Expose
    public ManagedAppDataTransferLevel allowedOutboundDataTransferDestinations;

    /**
     * The Organizational Credentials Required.
     * Indicates whether organizational credentials are required for app use.
     */
    @SerializedName("organizationalCredentialsRequired")
    @Expose
    public Boolean organizationalCredentialsRequired;

    /**
     * The Allowed Outbound Clipboard Sharing Level.
     * The level to which the clipboard may be shared between apps on the managed device. Possible values are: allApps, managedAppsWithPasteIn, managedApps, blocked.
     */
    @SerializedName("allowedOutboundClipboardSharingLevel")
    @Expose
    public ManagedAppClipboardSharingLevel allowedOutboundClipboardSharingLevel;

    /**
     * The Data Backup Blocked.
     * Indicates whether the backup of a managed app's data is blocked.
     */
    @SerializedName("dataBackupBlocked")
    @Expose
    public Boolean dataBackupBlocked;

    /**
     * The Device Compliance Required.
     * Indicates whether device compliance is required.
     */
    @SerializedName("deviceComplianceRequired")
    @Expose
    public Boolean deviceComplianceRequired;

    /**
     * The Managed Browser To Open Links Required.
     * Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     */
    @SerializedName("managedBrowserToOpenLinksRequired")
    @Expose
    public Boolean managedBrowserToOpenLinksRequired;

    /**
     * The Save As Blocked.
     * Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     */
    @SerializedName("saveAsBlocked")
    @Expose
    public Boolean saveAsBlocked;

    /**
     * The Period Offline Before Wipe Is Enforced.
     * The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     */
    @SerializedName("periodOfflineBeforeWipeIsEnforced")
    @Expose
    public javax.xml.datatype.Duration periodOfflineBeforeWipeIsEnforced;

    /**
     * The Pin Required.
     * Indicates whether an app-level pin is required.
     */
    @SerializedName("pinRequired")
    @Expose
    public Boolean pinRequired;

    /**
     * The Maximum Pin Retries.
     * Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     */
    @SerializedName("maximumPinRetries")
    @Expose
    public Integer maximumPinRetries;

    /**
     * The Simple Pin Blocked.
     * Indicates whether simplePin is blocked.
     */
    @SerializedName("simplePinBlocked")
    @Expose
    public Boolean simplePinBlocked;

    /**
     * The Minimum Pin Length.
     * Minimum pin length required for an app-level pin if PinRequired is set to True
     */
    @SerializedName("minimumPinLength")
    @Expose
    public Integer minimumPinLength;

    /**
     * The Pin Character Set.
     * Character set which may be used for an app-level pin if PinRequired is set to True. Possible values are: numeric, alphanumericAndSymbol.
     */
    @SerializedName("pinCharacterSet")
    @Expose
    public ManagedAppPinCharacterSet pinCharacterSet;

    /**
     * The Period Before Pin Reset.
     * TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     */
    @SerializedName("periodBeforePinReset")
    @Expose
    public javax.xml.datatype.Duration periodBeforePinReset;

    /**
     * The Allowed Data Storage Locations.
     * Data storage locations where a user may store managed data.
     */
    @SerializedName("allowedDataStorageLocations")
    @Expose
    public java.util.List<ManagedAppDataStorageLocation> allowedDataStorageLocations;

    /**
     * The Contact Sync Blocked.
     * Indicates whether contacts can be synced to the user's device.
     */
    @SerializedName("contactSyncBlocked")
    @Expose
    public Boolean contactSyncBlocked;

    /**
     * The Print Blocked.
     * Indicates whether printing is allowed from managed apps.
     */
    @SerializedName("printBlocked")
    @Expose
    public Boolean printBlocked;

    /**
     * The Fingerprint Blocked.
     * Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     */
    @SerializedName("fingerprintBlocked")
    @Expose
    public Boolean fingerprintBlocked;

    /**
     * The Disable App Pin If Device Pin Is Set.
     * Indicates whether use of the app pin is required if the device pin is set.
     */
    @SerializedName("disableAppPinIfDevicePinIsSet")
    @Expose
    public Boolean disableAppPinIfDevicePinIsSet;

    /**
     * The Minimum Required Os Version.
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    @SerializedName("minimumRequiredOsVersion")
    @Expose
    public String minimumRequiredOsVersion;

    /**
     * The Minimum Warning Os Version.
     * Versions less than the specified version will result in warning message on the managed app from accessing company data.
     */
    @SerializedName("minimumWarningOsVersion")
    @Expose
    public String minimumWarningOsVersion;

    /**
     * The Minimum Required App Version.
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    @SerializedName("minimumRequiredAppVersion")
    @Expose
    public String minimumRequiredAppVersion;

    /**
     * The Minimum Warning App Version.
     * Versions less than the specified version will result in warning message on the managed app.
     */
    @SerializedName("minimumWarningAppVersion")
    @Expose
    public String minimumWarningAppVersion;

    /**
     * The Minimum Wipe Os Version.
     * Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     */
    @SerializedName("minimumWipeOsVersion")
    @Expose
    public String minimumWipeOsVersion;

    /**
     * The Minimum Wipe App Version.
     * Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     */
    @SerializedName("minimumWipeAppVersion")
    @Expose
    public String minimumWipeAppVersion;

    /**
     * The App Action If Device Compliance Required.
     * Defines a managed app behavior, either block or wipe, when the device is either rooted or jailbroken, if DeviceComplianceRequired is set to true.
     */
    @SerializedName("appActionIfDeviceComplianceRequired")
    @Expose
    public ManagedAppRemediationAction appActionIfDeviceComplianceRequired;

    /**
     * The App Action If Maximum Pin Retries Exceeded.
     * Defines a managed app behavior, either block or wipe, based on maximum number of incorrect pin retry attempts.
     */
    @SerializedName("appActionIfMaximumPinRetriesExceeded")
    @Expose
    public ManagedAppRemediationAction appActionIfMaximumPinRetriesExceeded;

    /**
     * The Pin Required Instead Of Biometric Timeout.
     * Timeout in minutes for an app pin instead of non biometrics passcode
     */
    @SerializedName("pinRequiredInsteadOfBiometricTimeout")
    @Expose
    public javax.xml.datatype.Duration pinRequiredInsteadOfBiometricTimeout;

    /**
     * The Allowed Outbound Clipboard Sharing Exception Length.
     * Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed.
     */
    @SerializedName("allowedOutboundClipboardSharingExceptionLength")
    @Expose
    public Integer allowedOutboundClipboardSharingExceptionLength;

    /**
     * The Notification Restriction.
     * Specify app notification restriction
     */
    @SerializedName("notificationRestriction")
    @Expose
    public ManagedAppNotificationRestriction notificationRestriction;

    /**
     * The Previous Pin Block Count.
     * Requires a pin to be unique from the number specified in this property.
     */
    @SerializedName("previousPinBlockCount")
    @Expose
    public Integer previousPinBlockCount;

    /**
     * The Managed Browser.
     * Indicates in which managed browser(s) that internet links should be opened. When this property is configured, ManagedBrowserToOpenLinksRequired should be true. Possible values are: notConfigured, microsoftEdge.
     */
    @SerializedName("managedBrowser")
    @Expose
    public EnumSet<ManagedBrowserType> managedBrowser;

    /**
     * The Maximum Allowed Device Threat Level.
     * Maximum allowed device threat level, as reported by the MTD app
     */
    @SerializedName("maximumAllowedDeviceThreatLevel")
    @Expose
    public ManagedAppDeviceThreatLevel maximumAllowedDeviceThreatLevel;

    /**
     * The Mobile Threat Defense Remediation Action.
     * Determines what action to take if the mobile threat defense threat threshold isn't met. Warn isn't a supported value for this property
     */
    @SerializedName("mobileThreatDefenseRemediationAction")
    @Expose
    public ManagedAppRemediationAction mobileThreatDefenseRemediationAction;

    /**
     * The Block Data Ingestion Into Organization Documents.
     * Indicates whether a user can bring data into org documents.
     */
    @SerializedName("blockDataIngestionIntoOrganizationDocuments")
    @Expose
    public Boolean blockDataIngestionIntoOrganizationDocuments;

    /**
     * The Allowed Data Ingestion Locations.
     * Data storage locations where a user may store managed data.
     */
    @SerializedName("allowedDataIngestionLocations")
    @Expose
    public java.util.List<ManagedAppDataIngestionLocation> allowedDataIngestionLocations;

    /**
     * The App Action If Unable To Authenticate User.
     * If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD.
     */
    @SerializedName("appActionIfUnableToAuthenticateUser")
    @Expose
    public ManagedAppRemediationAction appActionIfUnableToAuthenticateUser;

    /**
     * The Dialer Restriction Level.
     * The classes of dialer apps that are allowed to click-to-open a phone number.
     */
    @SerializedName("dialerRestrictionLevel")
    @Expose
    public ManagedAppPhoneNumberRedirectLevel dialerRestrictionLevel;


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
