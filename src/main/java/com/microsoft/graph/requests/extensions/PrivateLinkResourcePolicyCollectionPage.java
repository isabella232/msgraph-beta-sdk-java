// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrivateLinkResourcePolicy;
import com.microsoft.graph.requests.extensions.IPrivateLinkResourcePolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrivateLinkResourcePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.PrivateLinkResourcePolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Private Link Resource Policy Collection Page.
 */
public class PrivateLinkResourcePolicyCollectionPage extends BaseCollectionPage<PrivateLinkResourcePolicy, IPrivateLinkResourcePolicyCollectionRequestBuilder> implements IPrivateLinkResourcePolicyCollectionPage {

    /**
     * A collection page for PrivateLinkResourcePolicy
     *
     * @param response the serialized PrivateLinkResourcePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivateLinkResourcePolicyCollectionPage(final PrivateLinkResourcePolicyCollectionResponse response, final IPrivateLinkResourcePolicyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}