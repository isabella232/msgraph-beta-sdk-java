// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReviewScheduleDefinition;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Schedule Definition Request Builder.
 */
public class AccessReviewScheduleDefinitionRequestBuilder extends BaseRequestBuilder implements IAccessReviewScheduleDefinitionRequestBuilder {

    /**
     * The request builder for the AccessReviewScheduleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewScheduleDefinitionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAccessReviewScheduleDefinitionRequest instance
     */
    public IAccessReviewScheduleDefinitionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAccessReviewScheduleDefinitionRequest instance
     */
    public IAccessReviewScheduleDefinitionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AccessReviewScheduleDefinitionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAccessReviewInstanceCollectionRequestBuilder instances() {
        return new AccessReviewInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("instances"), getClient(), null);
    }

    public IAccessReviewInstanceRequestBuilder instances(final String id) {
        return new AccessReviewInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("instances") + "/" + id, getClient(), null);
    }

    public IAccessReviewScheduleDefinitionStopRequestBuilder stop() {
        return new AccessReviewScheduleDefinitionStopRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stop"), getClient(), null);
    }
}
