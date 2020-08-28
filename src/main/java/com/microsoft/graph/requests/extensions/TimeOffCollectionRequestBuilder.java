// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.models.extensions.TimeOff;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITimeOffCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Off Collection Request Builder.
 */
public class TimeOffCollectionRequestBuilder extends BaseRequestBuilder implements ITimeOffCollectionRequestBuilder {

    /**
     * The request builder for this collection of Schedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TimeOffCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ITimeOffCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ITimeOffCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TimeOffCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITimeOffRequestBuilder byId(final String id) {
        return new TimeOffRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
