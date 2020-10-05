// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkMobileAppConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Mobile App Configuration Request.
 */
public class AndroidForWorkMobileAppConfigurationRequest extends BaseRequest implements IAndroidForWorkMobileAppConfigurationRequest {
	
    /**
     * The request for the AndroidForWorkMobileAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkMobileAppConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkMobileAppConfiguration.class);
    }

    /**
     * Gets the AndroidForWorkMobileAppConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidForWorkMobileAppConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkMobileAppConfiguration from the service
     *
     * @return the AndroidForWorkMobileAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkMobileAppConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidForWorkMobileAppConfiguration> callback) {
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
     * Patches this AndroidForWorkMobileAppConfiguration with a source
     *
     * @param sourceAndroidForWorkMobileAppConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkMobileAppConfiguration sourceAndroidForWorkMobileAppConfiguration, final ICallback<? super AndroidForWorkMobileAppConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkMobileAppConfiguration);
    }

    /**
     * Patches this AndroidForWorkMobileAppConfiguration with a source
     *
     * @param sourceAndroidForWorkMobileAppConfiguration the source object with updates
     * @return the updated AndroidForWorkMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkMobileAppConfiguration patch(final AndroidForWorkMobileAppConfiguration sourceAndroidForWorkMobileAppConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkMobileAppConfiguration);
    }

    /**
     * Creates a AndroidForWorkMobileAppConfiguration with a new object
     *
     * @param newAndroidForWorkMobileAppConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkMobileAppConfiguration newAndroidForWorkMobileAppConfiguration, final ICallback<? super AndroidForWorkMobileAppConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkMobileAppConfiguration);
    }

    /**
     * Creates a AndroidForWorkMobileAppConfiguration with a new object
     *
     * @param newAndroidForWorkMobileAppConfiguration the new object to create
     * @return the created AndroidForWorkMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkMobileAppConfiguration post(final AndroidForWorkMobileAppConfiguration newAndroidForWorkMobileAppConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkMobileAppConfiguration);
    }

    /**
     * Creates a AndroidForWorkMobileAppConfiguration with a new object
     *
     * @param newAndroidForWorkMobileAppConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidForWorkMobileAppConfiguration newAndroidForWorkMobileAppConfiguration, final ICallback<? super AndroidForWorkMobileAppConfiguration> callback) {
        send(HttpMethod.PUT, callback, newAndroidForWorkMobileAppConfiguration);
    }

    /**
     * Creates a AndroidForWorkMobileAppConfiguration with a new object
     *
     * @param newAndroidForWorkMobileAppConfiguration the object to create/update
     * @return the created AndroidForWorkMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkMobileAppConfiguration put(final AndroidForWorkMobileAppConfiguration newAndroidForWorkMobileAppConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkMobileAppConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkMobileAppConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidForWorkMobileAppConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkMobileAppConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidForWorkMobileAppConfigurationRequest)this;
     }

}

