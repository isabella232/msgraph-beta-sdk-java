// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SensitivityLabel;
import com.microsoft.graph.models.extensions.DiscoveredSensitiveType;
import com.microsoft.graph.models.extensions.CurrentLabel;
import com.microsoft.graph.models.extensions.EvaluateLabelJobResponse;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISensitivityLabelCollectionPage;
import com.microsoft.graph.requests.extensions.SensitivityLabelCollectionResponse;
import com.microsoft.graph.requests.extensions.ISensitivityLabelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitivityLabelCollectionRequest;
import com.microsoft.graph.requests.extensions.SensitivityLabelCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitivity Label Collection Request.
 */
public class SensitivityLabelCollectionRequest extends BaseCollectionRequest<SensitivityLabelCollectionResponse, ISensitivityLabelCollectionPage> implements ISensitivityLabelCollectionRequest {

    /**
     * The request builder for this collection of SensitivityLabel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SensitivityLabelCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SensitivityLabelCollectionResponse.class, ISensitivityLabelCollectionPage.class);
    }

    public void get(final ICallback<ISensitivityLabelCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ISensitivityLabelCollectionPage get() throws ClientException {
        final SensitivityLabelCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SensitivityLabel newSensitivityLabel, final ICallback<SensitivityLabel> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SensitivityLabelRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSensitivityLabel, callback);
    }

    public SensitivityLabel post(final SensitivityLabel newSensitivityLabel) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SensitivityLabelRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSensitivityLabel);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISensitivityLabelCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SensitivityLabelCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISensitivityLabelCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SensitivityLabelCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISensitivityLabelCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SensitivityLabelCollectionRequest)this;
    }

    public ISensitivityLabelCollectionPage buildFromResponse(final SensitivityLabelCollectionResponse response) {
        final ISensitivityLabelCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SensitivityLabelCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SensitivityLabelCollectionPage page = new SensitivityLabelCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}