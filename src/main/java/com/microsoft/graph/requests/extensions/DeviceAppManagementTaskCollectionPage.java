// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceAppManagementTask;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementTaskCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management Task Collection Page.
 */
public class DeviceAppManagementTaskCollectionPage extends BaseCollectionPage<DeviceAppManagementTask, IDeviceAppManagementTaskCollectionRequestBuilder> implements IDeviceAppManagementTaskCollectionPage {

    /**
     * A collection page for DeviceAppManagementTask
     *
     * @param response the serialized DeviceAppManagementTaskCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceAppManagementTaskCollectionPage(final DeviceAppManagementTaskCollectionResponse response, final IDeviceAppManagementTaskCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
