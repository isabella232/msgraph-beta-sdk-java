// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationDeviceStatus;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Device Status Collection Page.
 */
public class ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage extends BaseCollectionPage<ManagedDeviceMobileAppConfigurationDeviceStatus, IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder> implements IManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage {

    /**
     * A collection page for ManagedDeviceMobileAppConfigurationDeviceStatus
     *
     * @param response the serialized ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage(final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse response, final IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
