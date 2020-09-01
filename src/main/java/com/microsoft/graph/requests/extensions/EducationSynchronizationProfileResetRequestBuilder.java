// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEducationSynchronizationProfileResetRequest;
import com.microsoft.graph.requests.extensions.EducationSynchronizationProfileResetRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Synchronization Profile Reset Request Builder.
 */
public class EducationSynchronizationProfileResetRequestBuilder extends BaseActionRequestBuilder implements IEducationSynchronizationProfileResetRequestBuilder {

    /**
     * The request builder for this EducationSynchronizationProfileReset
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSynchronizationProfileResetRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IEducationSynchronizationProfileResetRequest
     *
     * @return the IEducationSynchronizationProfileResetRequest instance
     */
    public IEducationSynchronizationProfileResetRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEducationSynchronizationProfileResetRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEducationSynchronizationProfileResetRequest instance
     */
    public IEducationSynchronizationProfileResetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EducationSynchronizationProfileResetRequest request = new EducationSynchronizationProfileResetRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}