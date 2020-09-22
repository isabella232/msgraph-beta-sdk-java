// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10EasEmailProfileConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Eas Email Profile Configuration Request.
 */
public class Windows10EasEmailProfileConfigurationRequest extends BaseRequest implements IWindows10EasEmailProfileConfigurationRequest {
	
    /**
     * The request for the Windows10EasEmailProfileConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10EasEmailProfileConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10EasEmailProfileConfiguration.class);
    }

    /**
     * Gets the Windows10EasEmailProfileConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows10EasEmailProfileConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10EasEmailProfileConfiguration from the service
     *
     * @return the Windows10EasEmailProfileConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EasEmailProfileConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Windows10EasEmailProfileConfiguration> callback) {
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
     * Patches this Windows10EasEmailProfileConfiguration with a source
     *
     * @param sourceWindows10EasEmailProfileConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10EasEmailProfileConfiguration sourceWindows10EasEmailProfileConfiguration, final ICallback<Windows10EasEmailProfileConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10EasEmailProfileConfiguration);
    }

    /**
     * Patches this Windows10EasEmailProfileConfiguration with a source
     *
     * @param sourceWindows10EasEmailProfileConfiguration the source object with updates
     * @return the updated Windows10EasEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EasEmailProfileConfiguration patch(final Windows10EasEmailProfileConfiguration sourceWindows10EasEmailProfileConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10EasEmailProfileConfiguration);
    }

    /**
     * Creates a Windows10EasEmailProfileConfiguration with a new object
     *
     * @param newWindows10EasEmailProfileConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10EasEmailProfileConfiguration newWindows10EasEmailProfileConfiguration, final ICallback<Windows10EasEmailProfileConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows10EasEmailProfileConfiguration);
    }

    /**
     * Creates a Windows10EasEmailProfileConfiguration with a new object
     *
     * @param newWindows10EasEmailProfileConfiguration the new object to create
     * @return the created Windows10EasEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EasEmailProfileConfiguration post(final Windows10EasEmailProfileConfiguration newWindows10EasEmailProfileConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10EasEmailProfileConfiguration);
    }

    /**
     * Creates a Windows10EasEmailProfileConfiguration with a new object
     *
     * @param newWindows10EasEmailProfileConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Windows10EasEmailProfileConfiguration newWindows10EasEmailProfileConfiguration, final ICallback<Windows10EasEmailProfileConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindows10EasEmailProfileConfiguration);
    }

    /**
     * Creates a Windows10EasEmailProfileConfiguration with a new object
     *
     * @param newWindows10EasEmailProfileConfiguration the object to create/update
     * @return the created Windows10EasEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EasEmailProfileConfiguration put(final Windows10EasEmailProfileConfiguration newWindows10EasEmailProfileConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10EasEmailProfileConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10EasEmailProfileConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows10EasEmailProfileConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10EasEmailProfileConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows10EasEmailProfileConfigurationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWindows10EasEmailProfileConfigurationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (Windows10EasEmailProfileConfigurationRequest)this;
     }

}

