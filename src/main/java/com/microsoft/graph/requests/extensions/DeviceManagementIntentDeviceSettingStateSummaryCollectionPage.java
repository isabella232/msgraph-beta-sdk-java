// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementIntentDeviceSettingStateSummary;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceSettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceSettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceSettingStateSummaryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Device Setting State Summary Collection Page.
 */
public class DeviceManagementIntentDeviceSettingStateSummaryCollectionPage extends BaseCollectionPage<DeviceManagementIntentDeviceSettingStateSummary, IDeviceManagementIntentDeviceSettingStateSummaryCollectionRequestBuilder> implements IDeviceManagementIntentDeviceSettingStateSummaryCollectionPage {

    /**
     * A collection page for DeviceManagementIntentDeviceSettingStateSummary
     *
     * @param response the serialized DeviceManagementIntentDeviceSettingStateSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementIntentDeviceSettingStateSummaryCollectionPage(final DeviceManagementIntentDeviceSettingStateSummaryCollectionResponse response, final IDeviceManagementIntentDeviceSettingStateSummaryCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
