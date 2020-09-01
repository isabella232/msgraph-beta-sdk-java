// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConnectedOrganization;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connected Organization Reference Request.
 */
public class ConnectedOrganizationReferenceRequest extends BaseRequest implements IConnectedOrganizationReferenceRequest {

    /**
     * The request for the ConnectedOrganization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConnectedOrganizationReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConnectedOrganization.class);
    }

    public void delete(final ICallback<ConnectedOrganization> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ConnectedOrganization delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IConnectedOrganizationReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ConnectedOrganizationReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IConnectedOrganizationReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ConnectedOrganizationReferenceRequest)this;
    }
    /**
     * Puts the ConnectedOrganization
     *
     * @param srcConnectedOrganization the ConnectedOrganization reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ConnectedOrganization srcConnectedOrganization, final ICallback<ConnectedOrganization> callback) {
        send(HttpMethod.PUT, callback, srcConnectedOrganization);
    }

    /**
     * Puts the ConnectedOrganization
     *
     * @param srcConnectedOrganization the ConnectedOrganization reference to PUT
     * @return the ConnectedOrganization
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ConnectedOrganization put(ConnectedOrganization srcConnectedOrganization) throws ClientException {
        return send(HttpMethod.PUT, srcConnectedOrganization);
    }
}