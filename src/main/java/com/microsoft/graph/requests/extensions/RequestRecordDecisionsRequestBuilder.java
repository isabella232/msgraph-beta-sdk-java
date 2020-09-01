// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IRequestRecordDecisionsRequest;
import com.microsoft.graph.requests.extensions.RequestRecordDecisionsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Request Record Decisions Request Builder.
 */
public class RequestRecordDecisionsRequestBuilder extends BaseActionRequestBuilder implements IRequestRecordDecisionsRequestBuilder {

    /**
     * The request builder for this RequestRecordDecisions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param reviewResult the reviewResult
     * @param justification the justification
     */
    public RequestRecordDecisionsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String reviewResult, final String justification) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("reviewResult", reviewResult);
        bodyParams.put("justification", justification);
    }

    /**
     * Creates the IRequestRecordDecisionsRequest
     *
     * @return the IRequestRecordDecisionsRequest instance
     */
    public IRequestRecordDecisionsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IRequestRecordDecisionsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IRequestRecordDecisionsRequest instance
     */
    public IRequestRecordDecisionsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        RequestRecordDecisionsRequest request = new RequestRecordDecisionsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("reviewResult")) {
            request.body.reviewResult = getParameter("reviewResult");
        }

        if (hasParameter("justification")) {
            request.body.justification = getParameter("justification");
        }

        return request;
    }
}