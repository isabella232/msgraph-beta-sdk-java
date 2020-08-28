// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAppLogCollectionRequestCreateDownloadUrlRequest;
import com.microsoft.graph.requests.extensions.AppLogCollectionRequestCreateDownloadUrlRequest;
import com.microsoft.graph.models.extensions.AppLogCollectionDownloadDetails;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Log Collection Request Create Download Url Request Builder.
 */
public class AppLogCollectionRequestCreateDownloadUrlRequestBuilder extends BaseActionRequestBuilder implements IAppLogCollectionRequestCreateDownloadUrlRequestBuilder {

    /**
     * The request builder for this AppLogCollectionRequestCreateDownloadUrl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppLogCollectionRequestCreateDownloadUrlRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IAppLogCollectionRequestCreateDownloadUrlRequest
     *
     * @return the IAppLogCollectionRequestCreateDownloadUrlRequest instance
     */
    public IAppLogCollectionRequestCreateDownloadUrlRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IAppLogCollectionRequestCreateDownloadUrlRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IAppLogCollectionRequestCreateDownloadUrlRequest instance
     */
    public IAppLogCollectionRequestCreateDownloadUrlRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AppLogCollectionRequestCreateDownloadUrlRequest request = new AppLogCollectionRequestCreateDownloadUrlRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
