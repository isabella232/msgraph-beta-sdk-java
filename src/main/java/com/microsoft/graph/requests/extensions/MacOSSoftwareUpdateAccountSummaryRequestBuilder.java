// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateAccountSummary;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateCategorySummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateCategorySummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update Account Summary Request Builder.
 */
public class MacOSSoftwareUpdateAccountSummaryRequestBuilder extends BaseRequestBuilder implements IMacOSSoftwareUpdateAccountSummaryRequestBuilder {

    /**
     * The request builder for the MacOSSoftwareUpdateAccountSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSSoftwareUpdateAccountSummaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IMacOSSoftwareUpdateAccountSummaryRequest instance
     */
    public IMacOSSoftwareUpdateAccountSummaryRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IMacOSSoftwareUpdateAccountSummaryRequest instance
     */
    public IMacOSSoftwareUpdateAccountSummaryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateAccountSummaryRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IMacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder categorySummaries() {
        return new MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categorySummaries"), getClient(), null);
    }

    public IMacOSSoftwareUpdateCategorySummaryRequestBuilder categorySummaries(final String id) {
        return new MacOSSoftwareUpdateCategorySummaryRequestBuilder(getRequestUrlWithAdditionalSegment("categorySummaries") + "/" + id, getClient(), null);
    }
}
