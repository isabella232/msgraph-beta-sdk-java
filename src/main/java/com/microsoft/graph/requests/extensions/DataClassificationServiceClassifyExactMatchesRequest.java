// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DataClassificationServiceClassifyExactMatchesBody;
import com.microsoft.graph.models.extensions.ExactMatchClassificationResult;
import com.microsoft.graph.requests.extensions.IDataClassificationServiceClassifyExactMatchesRequest;
import com.microsoft.graph.requests.extensions.DataClassificationServiceClassifyExactMatchesRequest;

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
 * The class for the Data Classification Service Classify Exact Matches Request.
 */
public class DataClassificationServiceClassifyExactMatchesRequest extends BaseRequest implements IDataClassificationServiceClassifyExactMatchesRequest {
    protected final DataClassificationServiceClassifyExactMatchesBody body;

    /**
     * The request for this DataClassificationServiceClassifyExactMatches
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataClassificationServiceClassifyExactMatchesRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExactMatchClassificationResult.class);
        body = new DataClassificationServiceClassifyExactMatchesBody();
    }

    public void post(final ICallback<ExactMatchClassificationResult> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public ExactMatchClassificationResult post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDataClassificationServiceClassifyExactMatchesRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DataClassificationServiceClassifyExactMatchesRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDataClassificationServiceClassifyExactMatchesRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (DataClassificationServiceClassifyExactMatchesRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDataClassificationServiceClassifyExactMatchesRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DataClassificationServiceClassifyExactMatchesRequest)this;
    }

}