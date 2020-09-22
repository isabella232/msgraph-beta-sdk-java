// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request With Reference Request.
 */
public class PrivilegedRoleAssignmentRequestWithReferenceRequest extends BaseRequest implements IPrivilegedRoleAssignmentRequestWithReferenceRequest {

    /**
     * The request for the PrivilegedRoleAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentRequestWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleAssignmentRequest.class);
    }

    public void post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, final IJsonBackedObject payload, final ICallback<PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public PrivilegedRoleAssignmentRequest post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newPrivilegedRoleAssignmentRequest;
        }
        return null;
    }

    public void get(final ICallback<PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public PrivilegedRoleAssignmentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<PrivilegedRoleAssignmentRequest> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest, final ICallback<PrivilegedRoleAssignmentRequest> callback) {
		send(HttpMethod.PATCH, callback, sourcePrivilegedRoleAssignmentRequest);
	}

	public PrivilegedRoleAssignmentRequest patch(final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest) throws ClientException {
		return send(HttpMethod.PATCH, sourcePrivilegedRoleAssignmentRequest);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentRequestWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IPrivilegedRoleAssignmentRequestWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentRequestWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrivilegedRoleAssignmentRequestWithReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentRequestWithReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PrivilegedRoleAssignmentRequestWithReferenceRequest)this;
    }
}
