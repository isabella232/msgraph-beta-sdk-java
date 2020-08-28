// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementDomainJoinConnector;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Domain Join Connector Collection Page.
 */
public class DeviceManagementDomainJoinConnectorCollectionPage extends BaseCollectionPage<DeviceManagementDomainJoinConnector, IDeviceManagementDomainJoinConnectorCollectionRequestBuilder> implements IDeviceManagementDomainJoinConnectorCollectionPage {

    /**
     * A collection page for DeviceManagementDomainJoinConnector
     *
     * @param response the serialized DeviceManagementDomainJoinConnectorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementDomainJoinConnectorCollectionPage(final DeviceManagementDomainJoinConnectorCollectionResponse response, final IDeviceManagementDomainJoinConnectorCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
