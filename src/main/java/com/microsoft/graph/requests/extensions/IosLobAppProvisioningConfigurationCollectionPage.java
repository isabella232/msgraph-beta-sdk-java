// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfiguration;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Provisioning Configuration Collection Page.
 */
public class IosLobAppProvisioningConfigurationCollectionPage extends BaseCollectionPage<IosLobAppProvisioningConfiguration, IIosLobAppProvisioningConfigurationCollectionRequestBuilder> implements IIosLobAppProvisioningConfigurationCollectionPage {

    /**
     * A collection page for IosLobAppProvisioningConfiguration
     *
     * @param response the serialized IosLobAppProvisioningConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IosLobAppProvisioningConfigurationCollectionPage(final IosLobAppProvisioningConfigurationCollectionResponse response, final IIosLobAppProvisioningConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
