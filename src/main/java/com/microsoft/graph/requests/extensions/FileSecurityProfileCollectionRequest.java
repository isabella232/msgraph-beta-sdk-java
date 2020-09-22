// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.FileSecurityProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.FileSecurityProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileCollectionRequest;
import com.microsoft.graph.requests.extensions.FileSecurityProfileCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Security Profile Collection Request.
 */
public class FileSecurityProfileCollectionRequest extends BaseCollectionRequest<FileSecurityProfileCollectionResponse, IFileSecurityProfileCollectionPage> implements IFileSecurityProfileCollectionRequest {

    /**
     * The request builder for this collection of FileSecurityProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FileSecurityProfileCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, FileSecurityProfileCollectionResponse.class, IFileSecurityProfileCollectionPage.class);
    }

    public void get(final ICallback<IFileSecurityProfileCollectionPage> callback) {
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

    public IFileSecurityProfileCollectionPage get() throws ClientException {
        final FileSecurityProfileCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final FileSecurityProfile newFileSecurityProfile, final ICallback<FileSecurityProfile> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new FileSecurityProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newFileSecurityProfile, callback);
    }

    public FileSecurityProfile post(final FileSecurityProfile newFileSecurityProfile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new FileSecurityProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newFileSecurityProfile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IFileSecurityProfileCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (FileSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IFileSecurityProfileCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (FileSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IFileSecurityProfileCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (FileSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IFileSecurityProfileCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (FileSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IFileSecurityProfileCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (FileSecurityProfileCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IFileSecurityProfileCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IFileSecurityProfileCollectionRequest)this;
    }
    public IFileSecurityProfileCollectionPage buildFromResponse(final FileSecurityProfileCollectionResponse response) {
        final IFileSecurityProfileCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new FileSecurityProfileCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final FileSecurityProfileCollectionPage page = new FileSecurityProfileCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
