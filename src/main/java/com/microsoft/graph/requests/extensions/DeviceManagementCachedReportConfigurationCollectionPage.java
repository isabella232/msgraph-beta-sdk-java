// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementCachedReportConfiguration;
import com.microsoft.graph.requests.extensions.IDeviceManagementCachedReportConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementCachedReportConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementCachedReportConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Cached Report Configuration Collection Page.
 */
public class DeviceManagementCachedReportConfigurationCollectionPage extends BaseCollectionPage<DeviceManagementCachedReportConfiguration, IDeviceManagementCachedReportConfigurationCollectionRequestBuilder> implements IDeviceManagementCachedReportConfigurationCollectionPage {

    /**
     * A collection page for DeviceManagementCachedReportConfiguration
     *
     * @param response the serialized DeviceManagementCachedReportConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementCachedReportConfigurationCollectionPage(final DeviceManagementCachedReportConfigurationCollectionResponse response, final IDeviceManagementCachedReportConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
