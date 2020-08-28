// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSExtensionsConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSExtensions Configuration Request.
 */
public class MacOSExtensionsConfigurationRequest extends BaseRequest implements IMacOSExtensionsConfigurationRequest {
	
    /**
     * The request for the MacOSExtensionsConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSExtensionsConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSExtensionsConfiguration.class);
    }

    /**
     * Gets the MacOSExtensionsConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MacOSExtensionsConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSExtensionsConfiguration from the service
     *
     * @return the MacOSExtensionsConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSExtensionsConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MacOSExtensionsConfiguration> callback) {
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
     * Patches this MacOSExtensionsConfiguration with a source
     *
     * @param sourceMacOSExtensionsConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSExtensionsConfiguration sourceMacOSExtensionsConfiguration, final ICallback<MacOSExtensionsConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSExtensionsConfiguration);
    }

    /**
     * Patches this MacOSExtensionsConfiguration with a source
     *
     * @param sourceMacOSExtensionsConfiguration the source object with updates
     * @return the updated MacOSExtensionsConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSExtensionsConfiguration patch(final MacOSExtensionsConfiguration sourceMacOSExtensionsConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSExtensionsConfiguration);
    }

    /**
     * Creates a MacOSExtensionsConfiguration with a new object
     *
     * @param newMacOSExtensionsConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSExtensionsConfiguration newMacOSExtensionsConfiguration, final ICallback<MacOSExtensionsConfiguration> callback) {
        send(HttpMethod.POST, callback, newMacOSExtensionsConfiguration);
    }

    /**
     * Creates a MacOSExtensionsConfiguration with a new object
     *
     * @param newMacOSExtensionsConfiguration the new object to create
     * @return the created MacOSExtensionsConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSExtensionsConfiguration post(final MacOSExtensionsConfiguration newMacOSExtensionsConfiguration) throws ClientException {
        return send(HttpMethod.POST, newMacOSExtensionsConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSExtensionsConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSExtensionsConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSExtensionsConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSExtensionsConfigurationRequest)this;
     }

}

