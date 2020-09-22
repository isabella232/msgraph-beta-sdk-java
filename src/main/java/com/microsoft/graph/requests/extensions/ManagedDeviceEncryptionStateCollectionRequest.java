// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.ManagedDeviceEncryptionState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateCollectionResponse;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateCollectionRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Encryption State Collection Request.
 */
public class ManagedDeviceEncryptionStateCollectionRequest extends BaseCollectionRequest<ManagedDeviceEncryptionStateCollectionResponse, IManagedDeviceEncryptionStateCollectionPage> implements IManagedDeviceEncryptionStateCollectionRequest {

    /**
     * The request builder for this collection of ManagedDeviceEncryptionState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceEncryptionStateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceEncryptionStateCollectionResponse.class, IManagedDeviceEncryptionStateCollectionPage.class);
    }

    public void get(final ICallback<IManagedDeviceEncryptionStateCollectionPage> callback) {
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

    public IManagedDeviceEncryptionStateCollectionPage get() throws ClientException {
        final ManagedDeviceEncryptionStateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ManagedDeviceEncryptionState newManagedDeviceEncryptionState, final ICallback<ManagedDeviceEncryptionState> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagedDeviceEncryptionStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceEncryptionState, callback);
    }

    public ManagedDeviceEncryptionState post(final ManagedDeviceEncryptionState newManagedDeviceEncryptionState) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedDeviceEncryptionStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceEncryptionState);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceEncryptionStateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceEncryptionStateCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IManagedDeviceEncryptionStateCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ManagedDeviceEncryptionStateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceEncryptionStateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedDeviceEncryptionStateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedDeviceEncryptionStateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ManagedDeviceEncryptionStateCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IManagedDeviceEncryptionStateCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ManagedDeviceEncryptionStateCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IManagedDeviceEncryptionStateCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IManagedDeviceEncryptionStateCollectionRequest)this;
    }
    public IManagedDeviceEncryptionStateCollectionPage buildFromResponse(final ManagedDeviceEncryptionStateCollectionResponse response) {
        final IManagedDeviceEncryptionStateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedDeviceEncryptionStateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedDeviceEncryptionStateCollectionPage page = new ManagedDeviceEncryptionStateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
