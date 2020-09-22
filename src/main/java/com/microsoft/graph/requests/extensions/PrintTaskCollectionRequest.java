// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintJob;
import com.microsoft.graph.models.extensions.PrintTask;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPrintTaskCollectionPage;
import com.microsoft.graph.requests.extensions.PrintTaskCollectionResponse;
import com.microsoft.graph.requests.extensions.IPrintTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskCollectionRequest;
import com.microsoft.graph.requests.extensions.PrintTaskCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task Collection Request.
 */
public class PrintTaskCollectionRequest extends BaseCollectionRequest<PrintTaskCollectionResponse, IPrintTaskCollectionPage> implements IPrintTaskCollectionRequest {

    /**
     * The request builder for this collection of PrintTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintTaskCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintTaskCollectionResponse.class, IPrintTaskCollectionPage.class);
    }

    public void get(final ICallback<IPrintTaskCollectionPage> callback) {
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

    public IPrintTaskCollectionPage get() throws ClientException {
        final PrintTaskCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PrintTask newPrintTask, final ICallback<PrintTask> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrintTaskRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrintTask, callback);
    }

    public PrintTask post(final PrintTask newPrintTask) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrintTaskRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrintTask);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrintTaskCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrintTaskCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPrintTaskCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PrintTaskCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrintTaskCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrintTaskCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrintTaskCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PrintTaskCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPrintTaskCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PrintTaskCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPrintTaskCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPrintTaskCollectionRequest)this;
    }
    public IPrintTaskCollectionPage buildFromResponse(final PrintTaskCollectionResponse response) {
        final IPrintTaskCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrintTaskCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrintTaskCollectionPage page = new PrintTaskCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
