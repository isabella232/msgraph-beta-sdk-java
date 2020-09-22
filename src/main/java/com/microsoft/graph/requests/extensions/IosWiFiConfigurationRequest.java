// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosWiFiConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Wi Fi Configuration Request.
 */
public class IosWiFiConfigurationRequest extends BaseRequest implements IIosWiFiConfigurationRequest {
	
    /**
     * The request for the IosWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public IosWiFiConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends IosWiFiConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the IosWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosWiFiConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosWiFiConfiguration.class);
    }

    /**
     * Gets the IosWiFiConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosWiFiConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosWiFiConfiguration from the service
     *
     * @return the IosWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosWiFiConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosWiFiConfiguration> callback) {
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
     * Patches this IosWiFiConfiguration with a source
     *
     * @param sourceIosWiFiConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosWiFiConfiguration sourceIosWiFiConfiguration, final ICallback<IosWiFiConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosWiFiConfiguration);
    }

    /**
     * Patches this IosWiFiConfiguration with a source
     *
     * @param sourceIosWiFiConfiguration the source object with updates
     * @return the updated IosWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosWiFiConfiguration patch(final IosWiFiConfiguration sourceIosWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosWiFiConfiguration);
    }

    /**
     * Creates a IosWiFiConfiguration with a new object
     *
     * @param newIosWiFiConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosWiFiConfiguration newIosWiFiConfiguration, final ICallback<IosWiFiConfiguration> callback) {
        send(HttpMethod.POST, callback, newIosWiFiConfiguration);
    }

    /**
     * Creates a IosWiFiConfiguration with a new object
     *
     * @param newIosWiFiConfiguration the new object to create
     * @return the created IosWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosWiFiConfiguration post(final IosWiFiConfiguration newIosWiFiConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosWiFiConfiguration);
    }

    /**
     * Creates a IosWiFiConfiguration with a new object
     *
     * @param newIosWiFiConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosWiFiConfiguration newIosWiFiConfiguration, final ICallback<IosWiFiConfiguration> callback) {
        send(HttpMethod.PUT, callback, newIosWiFiConfiguration);
    }

    /**
     * Creates a IosWiFiConfiguration with a new object
     *
     * @param newIosWiFiConfiguration the object to create/update
     * @return the created IosWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosWiFiConfiguration put(final IosWiFiConfiguration newIosWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosWiFiConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosWiFiConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosWiFiConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosWiFiConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosWiFiConfigurationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IIosWiFiConfigurationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (IosWiFiConfigurationRequest)this;
     }

}

