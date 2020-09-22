// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10EnrollmentCompletionPageConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Enrollment Completion Page Configuration Request.
 */
public class Windows10EnrollmentCompletionPageConfigurationRequest extends BaseRequest implements IWindows10EnrollmentCompletionPageConfigurationRequest {
	
    /**
     * The request for the Windows10EnrollmentCompletionPageConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10EnrollmentCompletionPageConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10EnrollmentCompletionPageConfiguration.class);
    }

    /**
     * Gets the Windows10EnrollmentCompletionPageConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows10EnrollmentCompletionPageConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10EnrollmentCompletionPageConfiguration from the service
     *
     * @return the Windows10EnrollmentCompletionPageConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnrollmentCompletionPageConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Windows10EnrollmentCompletionPageConfiguration> callback) {
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
     * Patches this Windows10EnrollmentCompletionPageConfiguration with a source
     *
     * @param sourceWindows10EnrollmentCompletionPageConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10EnrollmentCompletionPageConfiguration sourceWindows10EnrollmentCompletionPageConfiguration, final ICallback<Windows10EnrollmentCompletionPageConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Patches this Windows10EnrollmentCompletionPageConfiguration with a source
     *
     * @param sourceWindows10EnrollmentCompletionPageConfiguration the source object with updates
     * @return the updated Windows10EnrollmentCompletionPageConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnrollmentCompletionPageConfiguration patch(final Windows10EnrollmentCompletionPageConfiguration sourceWindows10EnrollmentCompletionPageConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfiguration with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10EnrollmentCompletionPageConfiguration newWindows10EnrollmentCompletionPageConfiguration, final ICallback<Windows10EnrollmentCompletionPageConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfiguration with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfiguration the new object to create
     * @return the created Windows10EnrollmentCompletionPageConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnrollmentCompletionPageConfiguration post(final Windows10EnrollmentCompletionPageConfiguration newWindows10EnrollmentCompletionPageConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfiguration with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Windows10EnrollmentCompletionPageConfiguration newWindows10EnrollmentCompletionPageConfiguration, final ICallback<Windows10EnrollmentCompletionPageConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfiguration with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfiguration the object to create/update
     * @return the created Windows10EnrollmentCompletionPageConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnrollmentCompletionPageConfiguration put(final Windows10EnrollmentCompletionPageConfiguration newWindows10EnrollmentCompletionPageConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10EnrollmentCompletionPageConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows10EnrollmentCompletionPageConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10EnrollmentCompletionPageConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows10EnrollmentCompletionPageConfigurationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWindows10EnrollmentCompletionPageConfigurationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (Windows10EnrollmentCompletionPageConfigurationRequest)this;
     }

}

