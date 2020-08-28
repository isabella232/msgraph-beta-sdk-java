// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementIntentDeviceState;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceStateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Device State Collection Page.
 */
public class DeviceManagementIntentDeviceStateCollectionPage extends BaseCollectionPage<DeviceManagementIntentDeviceState, IDeviceManagementIntentDeviceStateCollectionRequestBuilder> implements IDeviceManagementIntentDeviceStateCollectionPage {

    /**
     * A collection page for DeviceManagementIntentDeviceState
     *
     * @param response the serialized DeviceManagementIntentDeviceStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementIntentDeviceStateCollectionPage(final DeviceManagementIntentDeviceStateCollectionResponse response, final IDeviceManagementIntentDeviceStateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
