// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeliveryOptimizationBandwidth;
import com.microsoft.graph.models.generated.WindowsDeliveryOptimizationMode;
import com.microsoft.graph.models.extensions.DeliveryOptimizationGroupIdSource;
import com.microsoft.graph.models.extensions.DeliveryOptimizationMaxCacheSize;
import com.microsoft.graph.models.generated.DeliveryOptimizationRestrictPeerSelectionByOptions;
import com.microsoft.graph.models.generated.Enablement;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Delivery Optimization Configuration.
 */
public class WindowsDeliveryOptimizationConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Background Download From Http Delay In Seconds.
     * Specifies number of seconds to delay an HTTP source in a background download that is allowed to use peer-to-peer. Valid values 0 to 4294967295
     */
    @SerializedName("backgroundDownloadFromHttpDelayInSeconds")
    @Expose
    public Long backgroundDownloadFromHttpDelayInSeconds;

    /**
     * The Bandwidth Mode.
     * Specifies foreground and background bandwidth usage using percentages, absolutes, or hours.
     */
    @SerializedName("bandwidthMode")
    @Expose
    public DeliveryOptimizationBandwidth bandwidthMode;

    /**
     * The Cache Server Background Download Fallback To Http Delay In Seconds.
     * Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a background download. Valid values 0 to 2592000.
     */
    @SerializedName("cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds")
    @Expose
    public Integer cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds;

    /**
     * The Cache Server Foreground Download Fallback To Http Delay In Seconds.
     * Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a foreground download. Valid values 0 to 2592000.???
     */
    @SerializedName("cacheServerForegroundDownloadFallbackToHttpDelayInSeconds")
    @Expose
    public Integer cacheServerForegroundDownloadFallbackToHttpDelayInSeconds;

    /**
     * The Cache Server Host Names.
     * Specifies cache servers host names.
     */
    @SerializedName("cacheServerHostNames")
    @Expose
    public java.util.List<String> cacheServerHostNames;

    /**
     * The Delivery Optimization Mode.
     * Specifies the download method that delivery optimization can use to manage network bandwidth consumption for large content distribution scenarios.
     */
    @SerializedName("deliveryOptimizationMode")
    @Expose
    public WindowsDeliveryOptimizationMode deliveryOptimizationMode;

    /**
     * The Foreground Download From Http Delay In Seconds.
     * Specifying 0 sets Delivery Optimization to manage this setting using the cloud service. Valid values 0 to 86400
     */
    @SerializedName("foregroundDownloadFromHttpDelayInSeconds")
    @Expose
    public Long foregroundDownloadFromHttpDelayInSeconds;

    /**
     * The Group Id Source.
     * The options set in this policy only apply to Delivery Optimization mode Group (2) download mode. If Group (2) isn't set as Download mode, this policy will be ignored. For option 3 - DHCP Option ID, the client will query DHCP Option ID 234 and use the returned GUID value as the Group ID.
     */
    @SerializedName("groupIdSource")
    @Expose
    public DeliveryOptimizationGroupIdSource groupIdSource;

    /**
     * The Maximum Cache Age In Days.
     * Specifies the maximum time in days that each file is held in the Delivery Optimization cache after downloading successfully (0-3650). Valid values 0 to 3650
     */
    @SerializedName("maximumCacheAgeInDays")
    @Expose
    public Integer maximumCacheAgeInDays;

    /**
     * The Maximum Cache Size.
     * Specifies the maximum cache size that Delivery Optimization either as a percentage or in GB.
     */
    @SerializedName("maximumCacheSize")
    @Expose
    public DeliveryOptimizationMaxCacheSize maximumCacheSize;

    /**
     * The Minimum Battery Percentage Allowed To Upload.
     * The default value is 0. The value 0 (zero) means "not limited" and the cloud service default value will be used. Valid values 0 to 100
     */
    @SerializedName("minimumBatteryPercentageAllowedToUpload")
    @Expose
    public Integer minimumBatteryPercentageAllowedToUpload;

    /**
     * The Minimum Disk Size Allowed To Peer In Gigabytes.
     * Recommended values: 64 GB to 256 GB. Valid values 1 to 100000
     */
    @SerializedName("minimumDiskSizeAllowedToPeerInGigabytes")
    @Expose
    public Integer minimumDiskSizeAllowedToPeerInGigabytes;

    /**
     * The Minimum File Size To Cache In Megabytes.
     * Recommended values: 1 MB to 100,000 MB. Valid values 1 to 100000
     */
    @SerializedName("minimumFileSizeToCacheInMegabytes")
    @Expose
    public Integer minimumFileSizeToCacheInMegabytes;

    /**
     * The Minimum Ram Allowed To Peer In Gigabytes.
     * Specifies the minimum RAM size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
     */
    @SerializedName("minimumRamAllowedToPeerInGigabytes")
    @Expose
    public Integer minimumRamAllowedToPeerInGigabytes;

    /**
     * The Modify Cache Location.
     * Specifies the drive that Delivery Optimization should use for its cache.
     */
    @SerializedName("modifyCacheLocation")
    @Expose
    public String modifyCacheLocation;

    /**
     * The Restrict Peer Selection By.
     * Option 1 (Subnet mask) only applies to Delivery Optimization modes Download Mode LAN (1) and Group (2).
     */
    @SerializedName("restrictPeerSelectionBy")
    @Expose
    public DeliveryOptimizationRestrictPeerSelectionByOptions restrictPeerSelectionBy;

    /**
     * The Vpn Peer Caching.
     * Specifies whether the device is allowed to participate in Peer Caching while connected via VPN to the domain network.
     */
    @SerializedName("vpnPeerCaching")
    @Expose
    public Enablement vpnPeerCaching;


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
