// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsArchitecture;
import com.microsoft.graph.models.extensions.WindowsMinimumOperatingSystem;
import com.microsoft.graph.models.extensions.Win32LobAppDetection;
import com.microsoft.graph.models.extensions.Win32LobAppRequirement;
import com.microsoft.graph.models.extensions.Win32LobAppRule;
import com.microsoft.graph.models.extensions.Win32LobAppInstallExperience;
import com.microsoft.graph.models.extensions.Win32LobAppReturnCode;
import com.microsoft.graph.models.extensions.Win32LobAppMsiInformation;
import com.microsoft.graph.models.extensions.MobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App.
 */
public class Win32LobApp extends MobileLobApp implements IJsonBackedObject {


    /**
     * The Install Command Line.
     * The command line to install this app
     */
    @SerializedName("installCommandLine")
    @Expose
    public String installCommandLine;

    /**
     * The Uninstall Command Line.
     * The command line to uninstall this app
     */
    @SerializedName("uninstallCommandLine")
    @Expose
    public String uninstallCommandLine;

    /**
     * The Applicable Architectures.
     * The Windows architecture(s) for which this app can run on.
     */
    @SerializedName("applicableArchitectures")
    @Expose
    public EnumSet<WindowsArchitecture> applicableArchitectures;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum applicable operating system.
     */
    @SerializedName("minimumSupportedOperatingSystem")
    @Expose
    public WindowsMinimumOperatingSystem minimumSupportedOperatingSystem;

    /**
     * The Minimum Free Disk Space In MB.
     * The value for the minimum free disk space which is required to install this app.
     */
    @SerializedName("minimumFreeDiskSpaceInMB")
    @Expose
    public Integer minimumFreeDiskSpaceInMB;

    /**
     * The Minimum Memory In MB.
     * The value for the minimum physical memory which is required to install this app.
     */
    @SerializedName("minimumMemoryInMB")
    @Expose
    public Integer minimumMemoryInMB;

    /**
     * The Minimum Number Of Processors.
     * The value for the minimum number of processors which is required to install this app.
     */
    @SerializedName("minimumNumberOfProcessors")
    @Expose
    public Integer minimumNumberOfProcessors;

    /**
     * The Minimum Cpu Speed In MHz.
     * The value for the minimum CPU speed which is required to install this app.
     */
    @SerializedName("minimumCpuSpeedInMHz")
    @Expose
    public Integer minimumCpuSpeedInMHz;

    /**
     * The Detection Rules.
     * The detection rules to detect Win32 Line of Business (LoB) app.
     */
    @SerializedName("detectionRules")
    @Expose
    public java.util.List<Win32LobAppDetection> detectionRules;

    /**
     * The Requirement Rules.
     * The requirement rules to detect Win32 Line of Business (LoB) app.
     */
    @SerializedName("requirementRules")
    @Expose
    public java.util.List<Win32LobAppRequirement> requirementRules;

    /**
     * The Rules.
     * The detection and requirement rules for this app.
     */
    @SerializedName("rules")
    @Expose
    public java.util.List<Win32LobAppRule> rules;

    /**
     * The Install Experience.
     * The install experience for this app.
     */
    @SerializedName("installExperience")
    @Expose
    public Win32LobAppInstallExperience installExperience;

    /**
     * The Return Codes.
     * The return codes for post installation behavior.
     */
    @SerializedName("returnCodes")
    @Expose
    public java.util.List<Win32LobAppReturnCode> returnCodes;

    /**
     * The Msi Information.
     * The MSI details if this Win32 app is an MSI app.
     */
    @SerializedName("msiInformation")
    @Expose
    public Win32LobAppMsiInformation msiInformation;

    /**
     * The Setup File Path.
     * The relative path of the setup file in the encrypted Win32LobApp package.
     */
    @SerializedName("setupFilePath")
    @Expose
    public String setupFilePath;

    /**
     * The Install Language.
     * 
     */
    @SerializedName("installLanguage")
    @Expose
    public String installLanguage;

    /**
     * The Minimum Supported Windows Release.
     * The value for the minimum supported windows release.
     */
    @SerializedName("minimumSupportedWindowsRelease")
    @Expose
    public String minimumSupportedWindowsRelease;


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
