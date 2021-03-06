// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GovernanceResourceRegisterBody;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRegisterRequest;
import com.microsoft.graph.requests.extensions.GovernanceResourceRegisterRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Resource Register Request.
 */
public class GovernanceResourceRegisterRequest extends BaseRequest implements IGovernanceResourceRegisterRequest {
    protected final GovernanceResourceRegisterBody body;

    /**
     * The request for this GovernanceResourceRegister
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceResourceRegisterRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        body = new GovernanceResourceRegisterBody();
    }

    public void post(final ICallback<? super Void> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGovernanceResourceRegisterRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GovernanceResourceRegisterRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGovernanceResourceRegisterRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (GovernanceResourceRegisterRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGovernanceResourceRegisterRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GovernanceResourceRegisterRequest)this;
    }

}
