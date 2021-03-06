// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsOfUseContainer;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms Of Use Container Request.
 */
public class TermsOfUseContainerRequest extends BaseRequest implements ITermsOfUseContainerRequest {
	
    /**
     * The request for the TermsOfUseContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsOfUseContainerRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TermsOfUseContainer.class);
    }

    /**
     * Gets the TermsOfUseContainer from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TermsOfUseContainer> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TermsOfUseContainer from the service
     *
     * @return the TermsOfUseContainer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsOfUseContainer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TermsOfUseContainer> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TermsOfUseContainer with a source
     *
     * @param sourceTermsOfUseContainer the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TermsOfUseContainer sourceTermsOfUseContainer, final ICallback<? super TermsOfUseContainer> callback) {
        send(HttpMethod.PATCH, callback, sourceTermsOfUseContainer);
    }

    /**
     * Patches this TermsOfUseContainer with a source
     *
     * @param sourceTermsOfUseContainer the source object with updates
     * @return the updated TermsOfUseContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsOfUseContainer patch(final TermsOfUseContainer sourceTermsOfUseContainer) throws ClientException {
        return send(HttpMethod.PATCH, sourceTermsOfUseContainer);
    }

    /**
     * Creates a TermsOfUseContainer with a new object
     *
     * @param newTermsOfUseContainer the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TermsOfUseContainer newTermsOfUseContainer, final ICallback<? super TermsOfUseContainer> callback) {
        send(HttpMethod.POST, callback, newTermsOfUseContainer);
    }

    /**
     * Creates a TermsOfUseContainer with a new object
     *
     * @param newTermsOfUseContainer the new object to create
     * @return the created TermsOfUseContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsOfUseContainer post(final TermsOfUseContainer newTermsOfUseContainer) throws ClientException {
        return send(HttpMethod.POST, newTermsOfUseContainer);
    }

    /**
     * Creates a TermsOfUseContainer with a new object
     *
     * @param newTermsOfUseContainer the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TermsOfUseContainer newTermsOfUseContainer, final ICallback<? super TermsOfUseContainer> callback) {
        send(HttpMethod.PUT, callback, newTermsOfUseContainer);
    }

    /**
     * Creates a TermsOfUseContainer with a new object
     *
     * @param newTermsOfUseContainer the object to create/update
     * @return the created TermsOfUseContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsOfUseContainer put(final TermsOfUseContainer newTermsOfUseContainer) throws ClientException {
        return send(HttpMethod.PUT, newTermsOfUseContainer);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITermsOfUseContainerRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TermsOfUseContainerRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITermsOfUseContainerRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TermsOfUseContainerRequest)this;
     }

}

