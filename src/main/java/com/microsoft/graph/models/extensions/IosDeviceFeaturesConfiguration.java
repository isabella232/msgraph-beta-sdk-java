// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IosWebContentFilterBase;
import com.microsoft.graph.models.extensions.IosHomeScreenItem;
import com.microsoft.graph.models.extensions.IosHomeScreenPage;
import com.microsoft.graph.models.extensions.IosSingleSignOnExtension;
import com.microsoft.graph.models.extensions.IosNotificationSettings;
import com.microsoft.graph.models.extensions.SingleSignOnExtension;
import com.microsoft.graph.models.extensions.IosSingleSignOnSettings;
import com.microsoft.graph.models.generated.IosWallpaperDisplayLocation;
import com.microsoft.graph.models.extensions.MimeContent;
import com.microsoft.graph.models.extensions.IosCertificateProfileBase;
import com.microsoft.graph.models.extensions.AppleDeviceFeaturesConfigurationBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Device Features Configuration.
 */
public class IosDeviceFeaturesConfiguration extends AppleDeviceFeaturesConfigurationBase implements IJsonBackedObject {


    /**
     * The Asset Tag Template.
     * Asset tag information for the device, displayed on the login window and lock screen.
     */
    @SerializedName("assetTagTemplate")
    @Expose
    public String assetTagTemplate;

    /**
     * The Content Filter Settings.
     * Gets or sets iOS Web Content Filter settings, supervised mode only
     */
    @SerializedName("contentFilterSettings")
    @Expose
    public IosWebContentFilterBase contentFilterSettings;

    /**
     * The Home Screen Dock Icons.
     * A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("homeScreenDockIcons")
    @Expose
    public java.util.List<IosHomeScreenItem> homeScreenDockIcons;

    /**
     * The Home Screen Pages.
     * A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("homeScreenPages")
    @Expose
    public java.util.List<IosHomeScreenPage> homeScreenPages;

    /**
     * The Ios Single Sign On Extension.
     * Gets or sets a single sign-on extension profile.
     */
    @SerializedName("iosSingleSignOnExtension")
    @Expose
    public IosSingleSignOnExtension iosSingleSignOnExtension;

    /**
     * The Lock Screen Footnote.
     * A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
     */
    @SerializedName("lockScreenFootnote")
    @Expose
    public String lockScreenFootnote;

    /**
     * The Notification Settings.
     * Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.
     */
    @SerializedName("notificationSettings")
    @Expose
    public java.util.List<IosNotificationSettings> notificationSettings;

    /**
     * The Single Sign On Extension.
     * Gets or sets a single sign-on extension profile. Deprecated: use IOSSingleSignOnExtension instead.
     */
    @SerializedName("singleSignOnExtension")
    @Expose
    public SingleSignOnExtension singleSignOnExtension;

    /**
     * The Single Sign On Settings.
     * The Kerberos login settings that enable apps on receiving devices to authenticate smoothly.
     */
    @SerializedName("singleSignOnSettings")
    @Expose
    public IosSingleSignOnSettings singleSignOnSettings;

    /**
     * The Wallpaper Display Location.
     * A wallpaper display location specifier.
     */
    @SerializedName("wallpaperDisplayLocation")
    @Expose
    public IosWallpaperDisplayLocation wallpaperDisplayLocation;

    /**
     * The Wallpaper Image.
     * A wallpaper image must be in either PNG or JPEG format. It requires a supervised device with iOS 8 or later version.
     */
    @SerializedName("wallpaperImage")
    @Expose
    public MimeContent wallpaperImage;

    /**
     * The Identity Certificate For Client Authentication.
     * Identity Certificate for the renewal of Kerberos ticket used in single sign-on settings.
     */
    @SerializedName("identityCertificateForClientAuthentication")
    @Expose
    public IosCertificateProfileBase identityCertificateForClientAuthentication;

    /**
     * The Single Sign On Extension Pkinit Certificate.
     * PKINIT Certificate for the authentication with single sign-on extension settings.
     */
    @SerializedName("singleSignOnExtensionPkinitCertificate")
    @Expose
    public IosCertificateProfileBase singleSignOnExtensionPkinitCertificate;


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
