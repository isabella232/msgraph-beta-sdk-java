// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10CustomConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Custom Configuration Request.
 */
public class Windows10CustomConfigurationRequest extends BaseRequest implements IWindows10CustomConfigurationRequest {
	
    /**
     * The request for the Windows10CustomConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10CustomConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10CustomConfiguration.class);
    }

    /**
     * Gets the Windows10CustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows10CustomConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10CustomConfiguration from the service
     *
     * @return the Windows10CustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10CustomConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Windows10CustomConfiguration> callback) {
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
     * Patches this Windows10CustomConfiguration with a source
     *
     * @param sourceWindows10CustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10CustomConfiguration sourceWindows10CustomConfiguration, final ICallback<Windows10CustomConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10CustomConfiguration);
    }

    /**
     * Patches this Windows10CustomConfiguration with a source
     *
     * @param sourceWindows10CustomConfiguration the source object with updates
     * @return the updated Windows10CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10CustomConfiguration patch(final Windows10CustomConfiguration sourceWindows10CustomConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10CustomConfiguration);
    }

    /**
     * Creates a Windows10CustomConfiguration with a new object
     *
     * @param newWindows10CustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10CustomConfiguration newWindows10CustomConfiguration, final ICallback<Windows10CustomConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows10CustomConfiguration);
    }

    /**
     * Creates a Windows10CustomConfiguration with a new object
     *
     * @param newWindows10CustomConfiguration the new object to create
     * @return the created Windows10CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10CustomConfiguration post(final Windows10CustomConfiguration newWindows10CustomConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10CustomConfiguration);
    }

    /**
     * Creates a Windows10CustomConfiguration with a new object
     *
     * @param newWindows10CustomConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Windows10CustomConfiguration newWindows10CustomConfiguration, final ICallback<Windows10CustomConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindows10CustomConfiguration);
    }

    /**
     * Creates a Windows10CustomConfiguration with a new object
     *
     * @param newWindows10CustomConfiguration the object to create/update
     * @return the created Windows10CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10CustomConfiguration put(final Windows10CustomConfiguration newWindows10CustomConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10CustomConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10CustomConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows10CustomConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10CustomConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows10CustomConfigurationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWindows10CustomConfigurationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (Windows10CustomConfigurationRequest)this;
     }

}

