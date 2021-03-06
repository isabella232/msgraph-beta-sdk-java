// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EasEmailProfileConfigurationBase;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Eas Email Profile Configuration Base Request.
 */
public class EasEmailProfileConfigurationBaseRequest extends BaseRequest implements IEasEmailProfileConfigurationBaseRequest {
	
    /**
     * The request for the EasEmailProfileConfigurationBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public EasEmailProfileConfigurationBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends EasEmailProfileConfigurationBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the EasEmailProfileConfigurationBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EasEmailProfileConfigurationBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EasEmailProfileConfigurationBase.class);
    }

    /**
     * Gets the EasEmailProfileConfigurationBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EasEmailProfileConfigurationBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EasEmailProfileConfigurationBase from the service
     *
     * @return the EasEmailProfileConfigurationBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EasEmailProfileConfigurationBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EasEmailProfileConfigurationBase> callback) {
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
     * Patches this EasEmailProfileConfigurationBase with a source
     *
     * @param sourceEasEmailProfileConfigurationBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EasEmailProfileConfigurationBase sourceEasEmailProfileConfigurationBase, final ICallback<? super EasEmailProfileConfigurationBase> callback) {
        send(HttpMethod.PATCH, callback, sourceEasEmailProfileConfigurationBase);
    }

    /**
     * Patches this EasEmailProfileConfigurationBase with a source
     *
     * @param sourceEasEmailProfileConfigurationBase the source object with updates
     * @return the updated EasEmailProfileConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EasEmailProfileConfigurationBase patch(final EasEmailProfileConfigurationBase sourceEasEmailProfileConfigurationBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceEasEmailProfileConfigurationBase);
    }

    /**
     * Creates a EasEmailProfileConfigurationBase with a new object
     *
     * @param newEasEmailProfileConfigurationBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EasEmailProfileConfigurationBase newEasEmailProfileConfigurationBase, final ICallback<? super EasEmailProfileConfigurationBase> callback) {
        send(HttpMethod.POST, callback, newEasEmailProfileConfigurationBase);
    }

    /**
     * Creates a EasEmailProfileConfigurationBase with a new object
     *
     * @param newEasEmailProfileConfigurationBase the new object to create
     * @return the created EasEmailProfileConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EasEmailProfileConfigurationBase post(final EasEmailProfileConfigurationBase newEasEmailProfileConfigurationBase) throws ClientException {
        return send(HttpMethod.POST, newEasEmailProfileConfigurationBase);
    }

    /**
     * Creates a EasEmailProfileConfigurationBase with a new object
     *
     * @param newEasEmailProfileConfigurationBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EasEmailProfileConfigurationBase newEasEmailProfileConfigurationBase, final ICallback<? super EasEmailProfileConfigurationBase> callback) {
        send(HttpMethod.PUT, callback, newEasEmailProfileConfigurationBase);
    }

    /**
     * Creates a EasEmailProfileConfigurationBase with a new object
     *
     * @param newEasEmailProfileConfigurationBase the object to create/update
     * @return the created EasEmailProfileConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EasEmailProfileConfigurationBase put(final EasEmailProfileConfigurationBase newEasEmailProfileConfigurationBase) throws ClientException {
        return send(HttpMethod.PUT, newEasEmailProfileConfigurationBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEasEmailProfileConfigurationBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EasEmailProfileConfigurationBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEasEmailProfileConfigurationBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EasEmailProfileConfigurationBaseRequest)this;
     }

}

