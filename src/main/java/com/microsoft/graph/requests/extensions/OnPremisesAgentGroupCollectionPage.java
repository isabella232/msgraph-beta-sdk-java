// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnPremisesAgentGroup;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentGroupCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OnPremisesAgentGroupCollectionPage;
import com.microsoft.graph.requests.extensions.OnPremisesAgentGroupCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Agent Group Collection Page.
 */
public class OnPremisesAgentGroupCollectionPage extends BaseCollectionPage<OnPremisesAgentGroup, IOnPremisesAgentGroupCollectionRequestBuilder> implements IOnPremisesAgentGroupCollectionPage {

    /**
     * A collection page for OnPremisesAgentGroup
     *
     * @param response the serialized OnPremisesAgentGroupCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OnPremisesAgentGroupCollectionPage(final OnPremisesAgentGroupCollectionResponse response, final IOnPremisesAgentGroupCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
