// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosVpnConfiguration;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosCertificateProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.IosCertificateProfileBaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpn Configuration Request.
 */
public class IosVpnConfigurationRequest extends BaseRequest implements IIosVpnConfigurationRequest {
	
    /**
     * The request for the IosVpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public IosVpnConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends IosVpnConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the IosVpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosVpnConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosVpnConfiguration.class);
    }

    /**
     * Gets the IosVpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IosVpnConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosVpnConfiguration from the service
     *
     * @return the IosVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IosVpnConfiguration> callback) {
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
     * Patches this IosVpnConfiguration with a source
     *
     * @param sourceIosVpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosVpnConfiguration sourceIosVpnConfiguration, final ICallback<? super IosVpnConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosVpnConfiguration);
    }

    /**
     * Patches this IosVpnConfiguration with a source
     *
     * @param sourceIosVpnConfiguration the source object with updates
     * @return the updated IosVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVpnConfiguration patch(final IosVpnConfiguration sourceIosVpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosVpnConfiguration);
    }

    /**
     * Creates a IosVpnConfiguration with a new object
     *
     * @param newIosVpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosVpnConfiguration newIosVpnConfiguration, final ICallback<? super IosVpnConfiguration> callback) {
        send(HttpMethod.POST, callback, newIosVpnConfiguration);
    }

    /**
     * Creates a IosVpnConfiguration with a new object
     *
     * @param newIosVpnConfiguration the new object to create
     * @return the created IosVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVpnConfiguration post(final IosVpnConfiguration newIosVpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosVpnConfiguration);
    }

    /**
     * Creates a IosVpnConfiguration with a new object
     *
     * @param newIosVpnConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosVpnConfiguration newIosVpnConfiguration, final ICallback<? super IosVpnConfiguration> callback) {
        send(HttpMethod.PUT, callback, newIosVpnConfiguration);
    }

    /**
     * Creates a IosVpnConfiguration with a new object
     *
     * @param newIosVpnConfiguration the object to create/update
     * @return the created IosVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVpnConfiguration put(final IosVpnConfiguration newIosVpnConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosVpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosVpnConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosVpnConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosVpnConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosVpnConfigurationRequest)this;
     }

}

