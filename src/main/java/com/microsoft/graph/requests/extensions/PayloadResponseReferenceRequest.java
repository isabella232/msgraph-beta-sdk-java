// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PayloadResponse;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Payload Response Reference Request.
 */
public class PayloadResponseReferenceRequest extends BaseRequest implements IPayloadResponseReferenceRequest {

    /**
     * The request for the PayloadResponse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PayloadResponseReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PayloadResponse.class);
    }

    public void delete(final ICallback<? super PayloadResponse> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public PayloadResponse delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPayloadResponseReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PayloadResponseReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPayloadResponseReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PayloadResponseReferenceRequest)this;
    }
    /**
     * Puts the PayloadResponse
     *
     * @param srcPayloadResponse the PayloadResponse reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(PayloadResponse srcPayloadResponse, final ICallback<? super PayloadResponse> callback) {
        send(HttpMethod.PUT, callback, srcPayloadResponse);
    }

    /**
     * Puts the PayloadResponse
     *
     * @param srcPayloadResponse the PayloadResponse reference to PUT
     * @return the PayloadResponse
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public PayloadResponse put(PayloadResponse srcPayloadResponse) throws ClientException {
        return send(HttpMethod.PUT, srcPayloadResponse);
    }
}
