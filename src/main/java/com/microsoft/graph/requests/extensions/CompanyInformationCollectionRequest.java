// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.CompanyInformation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ICompanyInformationCollectionPage;
import com.microsoft.graph.requests.extensions.CompanyInformationCollectionResponse;
import com.microsoft.graph.requests.extensions.ICompanyInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICompanyInformationCollectionRequest;
import com.microsoft.graph.requests.extensions.CompanyInformationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company Information Collection Request.
 */
public class CompanyInformationCollectionRequest extends BaseCollectionRequest<CompanyInformationCollectionResponse, ICompanyInformationCollectionPage> implements ICompanyInformationCollectionRequest {

    /**
     * The request builder for this collection of CompanyInformation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CompanyInformationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CompanyInformationCollectionResponse.class, ICompanyInformationCollectionPage.class);
    }

    public void get(final ICallback<ICompanyInformationCollectionPage> callback) {
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

    public ICompanyInformationCollectionPage get() throws ClientException {
        final CompanyInformationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final CompanyInformation newCompanyInformation, final ICallback<CompanyInformation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CompanyInformationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newCompanyInformation, callback);
    }

    public CompanyInformation post(final CompanyInformation newCompanyInformation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CompanyInformationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newCompanyInformation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICompanyInformationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CompanyInformationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICompanyInformationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CompanyInformationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICompanyInformationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (CompanyInformationCollectionRequest)this;
    }

    public ICompanyInformationCollectionPage buildFromResponse(final CompanyInformationCollectionResponse response) {
        final ICompanyInformationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CompanyInformationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final CompanyInformationCollectionPage page = new CompanyInformationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}