// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MicrosoftTunnelConfiguration;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Configuration Collection Page.
 */
public class MicrosoftTunnelConfigurationCollectionPage extends BaseCollectionPage<MicrosoftTunnelConfiguration, IMicrosoftTunnelConfigurationCollectionRequestBuilder> implements IMicrosoftTunnelConfigurationCollectionPage {

    /**
     * A collection page for MicrosoftTunnelConfiguration
     *
     * @param response the serialized MicrosoftTunnelConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MicrosoftTunnelConfigurationCollectionPage(final MicrosoftTunnelConfigurationCollectionResponse response, final IMicrosoftTunnelConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
