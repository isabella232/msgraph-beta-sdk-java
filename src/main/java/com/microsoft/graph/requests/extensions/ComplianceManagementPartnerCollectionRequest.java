// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.ComplianceManagementPartner;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerCollectionRequest;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Compliance Management Partner Collection Request.
 */
public class ComplianceManagementPartnerCollectionRequest extends BaseCollectionRequest<ComplianceManagementPartnerCollectionResponse, IComplianceManagementPartnerCollectionPage> implements IComplianceManagementPartnerCollectionRequest {

    /**
     * The request builder for this collection of ComplianceManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ComplianceManagementPartnerCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ComplianceManagementPartnerCollectionResponse.class, IComplianceManagementPartnerCollectionPage.class);
    }

    public void get(final ICallback<? super IComplianceManagementPartnerCollectionPage> callback) {
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

    public IComplianceManagementPartnerCollectionPage get() throws ClientException {
        final ComplianceManagementPartnerCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ComplianceManagementPartner newComplianceManagementPartner, final ICallback<? super ComplianceManagementPartner> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ComplianceManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newComplianceManagementPartner, callback);
    }

    public ComplianceManagementPartner post(final ComplianceManagementPartner newComplianceManagementPartner) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ComplianceManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newComplianceManagementPartner);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IComplianceManagementPartnerCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ComplianceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IComplianceManagementPartnerCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ComplianceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IComplianceManagementPartnerCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ComplianceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IComplianceManagementPartnerCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ComplianceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IComplianceManagementPartnerCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ComplianceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IComplianceManagementPartnerCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ComplianceManagementPartnerCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IComplianceManagementPartnerCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IComplianceManagementPartnerCollectionRequest)this;
    }
    public IComplianceManagementPartnerCollectionPage buildFromResponse(final ComplianceManagementPartnerCollectionResponse response) {
        final IComplianceManagementPartnerCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ComplianceManagementPartnerCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ComplianceManagementPartnerCollectionPage page = new ComplianceManagementPartnerCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
