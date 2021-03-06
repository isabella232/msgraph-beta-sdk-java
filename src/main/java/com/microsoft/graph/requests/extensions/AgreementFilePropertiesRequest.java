// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AgreementFileProperties;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement File Properties Request.
 */
public class AgreementFilePropertiesRequest extends BaseRequest implements IAgreementFilePropertiesRequest {
	
    /**
     * The request for the AgreementFileProperties
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AgreementFilePropertiesRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends AgreementFileProperties> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AgreementFileProperties
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgreementFilePropertiesRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AgreementFileProperties.class);
    }

    /**
     * Gets the AgreementFileProperties from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AgreementFileProperties> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AgreementFileProperties from the service
     *
     * @return the AgreementFileProperties from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgreementFileProperties get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AgreementFileProperties> callback) {
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
     * Patches this AgreementFileProperties with a source
     *
     * @param sourceAgreementFileProperties the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AgreementFileProperties sourceAgreementFileProperties, final ICallback<? super AgreementFileProperties> callback) {
        send(HttpMethod.PATCH, callback, sourceAgreementFileProperties);
    }

    /**
     * Patches this AgreementFileProperties with a source
     *
     * @param sourceAgreementFileProperties the source object with updates
     * @return the updated AgreementFileProperties
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgreementFileProperties patch(final AgreementFileProperties sourceAgreementFileProperties) throws ClientException {
        return send(HttpMethod.PATCH, sourceAgreementFileProperties);
    }

    /**
     * Creates a AgreementFileProperties with a new object
     *
     * @param newAgreementFileProperties the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AgreementFileProperties newAgreementFileProperties, final ICallback<? super AgreementFileProperties> callback) {
        send(HttpMethod.POST, callback, newAgreementFileProperties);
    }

    /**
     * Creates a AgreementFileProperties with a new object
     *
     * @param newAgreementFileProperties the new object to create
     * @return the created AgreementFileProperties
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgreementFileProperties post(final AgreementFileProperties newAgreementFileProperties) throws ClientException {
        return send(HttpMethod.POST, newAgreementFileProperties);
    }

    /**
     * Creates a AgreementFileProperties with a new object
     *
     * @param newAgreementFileProperties the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AgreementFileProperties newAgreementFileProperties, final ICallback<? super AgreementFileProperties> callback) {
        send(HttpMethod.PUT, callback, newAgreementFileProperties);
    }

    /**
     * Creates a AgreementFileProperties with a new object
     *
     * @param newAgreementFileProperties the object to create/update
     * @return the created AgreementFileProperties
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgreementFileProperties put(final AgreementFileProperties newAgreementFileProperties) throws ClientException {
        return send(HttpMethod.PUT, newAgreementFileProperties);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAgreementFilePropertiesRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AgreementFilePropertiesRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAgreementFilePropertiesRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AgreementFilePropertiesRequest)this;
     }

}

