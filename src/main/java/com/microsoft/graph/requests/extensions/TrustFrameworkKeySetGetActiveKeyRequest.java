// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TrustFrameworkKey;
import com.microsoft.graph.requests.extensions.ITrustFrameworkKeySetGetActiveKeyRequest;
import com.microsoft.graph.requests.extensions.TrustFrameworkKeySetGetActiveKeyRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Key Set Get Active Key Request.
 */
public class TrustFrameworkKeySetGetActiveKeyRequest extends BaseRequest implements ITrustFrameworkKeySetGetActiveKeyRequest {

    /**
     * The request for this TrustFrameworkKeySetGetActiveKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrustFrameworkKeySetGetActiveKeyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TrustFrameworkKey.class);
    }

    /**
     * Gets the TrustFrameworkKey
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TrustFrameworkKey> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TrustFrameworkKey
     *
     * @return the TrustFrameworkKey
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public TrustFrameworkKey get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITrustFrameworkKeySetGetActiveKeyRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TrustFrameworkKeySetGetActiveKeyRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITrustFrameworkKeySetGetActiveKeyRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TrustFrameworkKeySetGetActiveKeyRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITrustFrameworkKeySetGetActiveKeyRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (TrustFrameworkKeySetGetActiveKeyRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ITrustFrameworkKeySetGetActiveKeyRequest orderBy(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (TrustFrameworkKeySetGetActiveKeyRequest)this;
    }

}
