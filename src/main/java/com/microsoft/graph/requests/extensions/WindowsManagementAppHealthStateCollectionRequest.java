// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsManagementApp;
import com.microsoft.graph.models.extensions.WindowsManagementAppHealthState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWindowsManagementAppHealthStateCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsManagementAppHealthStateCollectionResponse;
import com.microsoft.graph.requests.extensions.IWindowsManagementAppHealthStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsManagementAppHealthStateCollectionRequest;
import com.microsoft.graph.requests.extensions.WindowsManagementAppHealthStateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Management App Health State Collection Request.
 */
public class WindowsManagementAppHealthStateCollectionRequest extends BaseCollectionRequest<WindowsManagementAppHealthStateCollectionResponse, IWindowsManagementAppHealthStateCollectionPage> implements IWindowsManagementAppHealthStateCollectionRequest {

    /**
     * The request builder for this collection of WindowsManagementAppHealthState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsManagementAppHealthStateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsManagementAppHealthStateCollectionResponse.class, IWindowsManagementAppHealthStateCollectionPage.class);
    }

    public void get(final ICallback<IWindowsManagementAppHealthStateCollectionPage> callback) {
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

    public IWindowsManagementAppHealthStateCollectionPage get() throws ClientException {
        final WindowsManagementAppHealthStateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WindowsManagementAppHealthState newWindowsManagementAppHealthState, final ICallback<WindowsManagementAppHealthState> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsManagementAppHealthStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindowsManagementAppHealthState, callback);
    }

    public WindowsManagementAppHealthState post(final WindowsManagementAppHealthState newWindowsManagementAppHealthState) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsManagementAppHealthStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindowsManagementAppHealthState);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsManagementAppHealthStateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsManagementAppHealthStateCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IWindowsManagementAppHealthStateCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WindowsManagementAppHealthStateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsManagementAppHealthStateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WindowsManagementAppHealthStateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindowsManagementAppHealthStateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WindowsManagementAppHealthStateCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWindowsManagementAppHealthStateCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WindowsManagementAppHealthStateCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWindowsManagementAppHealthStateCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWindowsManagementAppHealthStateCollectionRequest)this;
    }
    public IWindowsManagementAppHealthStateCollectionPage buildFromResponse(final WindowsManagementAppHealthStateCollectionResponse response) {
        final IWindowsManagementAppHealthStateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsManagementAppHealthStateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsManagementAppHealthStateCollectionPage page = new WindowsManagementAppHealthStateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
