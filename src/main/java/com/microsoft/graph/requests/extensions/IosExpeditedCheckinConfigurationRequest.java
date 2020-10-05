// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosExpeditedCheckinConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Expedited Checkin Configuration Request.
 */
public class IosExpeditedCheckinConfigurationRequest extends BaseRequest implements IIosExpeditedCheckinConfigurationRequest {
	
    /**
     * The request for the IosExpeditedCheckinConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosExpeditedCheckinConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosExpeditedCheckinConfiguration.class);
    }

    /**
     * Gets the IosExpeditedCheckinConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IosExpeditedCheckinConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosExpeditedCheckinConfiguration from the service
     *
     * @return the IosExpeditedCheckinConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosExpeditedCheckinConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IosExpeditedCheckinConfiguration> callback) {
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
     * Patches this IosExpeditedCheckinConfiguration with a source
     *
     * @param sourceIosExpeditedCheckinConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosExpeditedCheckinConfiguration sourceIosExpeditedCheckinConfiguration, final ICallback<? super IosExpeditedCheckinConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosExpeditedCheckinConfiguration);
    }

    /**
     * Patches this IosExpeditedCheckinConfiguration with a source
     *
     * @param sourceIosExpeditedCheckinConfiguration the source object with updates
     * @return the updated IosExpeditedCheckinConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosExpeditedCheckinConfiguration patch(final IosExpeditedCheckinConfiguration sourceIosExpeditedCheckinConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosExpeditedCheckinConfiguration);
    }

    /**
     * Creates a IosExpeditedCheckinConfiguration with a new object
     *
     * @param newIosExpeditedCheckinConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosExpeditedCheckinConfiguration newIosExpeditedCheckinConfiguration, final ICallback<? super IosExpeditedCheckinConfiguration> callback) {
        send(HttpMethod.POST, callback, newIosExpeditedCheckinConfiguration);
    }

    /**
     * Creates a IosExpeditedCheckinConfiguration with a new object
     *
     * @param newIosExpeditedCheckinConfiguration the new object to create
     * @return the created IosExpeditedCheckinConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosExpeditedCheckinConfiguration post(final IosExpeditedCheckinConfiguration newIosExpeditedCheckinConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosExpeditedCheckinConfiguration);
    }

    /**
     * Creates a IosExpeditedCheckinConfiguration with a new object
     *
     * @param newIosExpeditedCheckinConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosExpeditedCheckinConfiguration newIosExpeditedCheckinConfiguration, final ICallback<? super IosExpeditedCheckinConfiguration> callback) {
        send(HttpMethod.PUT, callback, newIosExpeditedCheckinConfiguration);
    }

    /**
     * Creates a IosExpeditedCheckinConfiguration with a new object
     *
     * @param newIosExpeditedCheckinConfiguration the object to create/update
     * @return the created IosExpeditedCheckinConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosExpeditedCheckinConfiguration put(final IosExpeditedCheckinConfiguration newIosExpeditedCheckinConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosExpeditedCheckinConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosExpeditedCheckinConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosExpeditedCheckinConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosExpeditedCheckinConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosExpeditedCheckinConfigurationRequest)this;
     }

}

