// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsCertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Certificate Profile Base Request.
 */
public class WindowsCertificateProfileBaseRequest extends BaseRequest implements IWindowsCertificateProfileBaseRequest {
	
    /**
     * The request for the WindowsCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public WindowsCertificateProfileBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends WindowsCertificateProfileBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the WindowsCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsCertificateProfileBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsCertificateProfileBase.class);
    }

    /**
     * Gets the WindowsCertificateProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsCertificateProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsCertificateProfileBase from the service
     *
     * @return the WindowsCertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsCertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsCertificateProfileBase> callback) {
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
     * Patches this WindowsCertificateProfileBase with a source
     *
     * @param sourceWindowsCertificateProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsCertificateProfileBase sourceWindowsCertificateProfileBase, final ICallback<WindowsCertificateProfileBase> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsCertificateProfileBase);
    }

    /**
     * Patches this WindowsCertificateProfileBase with a source
     *
     * @param sourceWindowsCertificateProfileBase the source object with updates
     * @return the updated WindowsCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsCertificateProfileBase patch(final WindowsCertificateProfileBase sourceWindowsCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsCertificateProfileBase);
    }

    /**
     * Creates a WindowsCertificateProfileBase with a new object
     *
     * @param newWindowsCertificateProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsCertificateProfileBase newWindowsCertificateProfileBase, final ICallback<WindowsCertificateProfileBase> callback) {
        send(HttpMethod.POST, callback, newWindowsCertificateProfileBase);
    }

    /**
     * Creates a WindowsCertificateProfileBase with a new object
     *
     * @param newWindowsCertificateProfileBase the new object to create
     * @return the created WindowsCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsCertificateProfileBase post(final WindowsCertificateProfileBase newWindowsCertificateProfileBase) throws ClientException {
        return send(HttpMethod.POST, newWindowsCertificateProfileBase);
    }

    /**
     * Creates a WindowsCertificateProfileBase with a new object
     *
     * @param newWindowsCertificateProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsCertificateProfileBase newWindowsCertificateProfileBase, final ICallback<WindowsCertificateProfileBase> callback) {
        send(HttpMethod.PUT, callback, newWindowsCertificateProfileBase);
    }

    /**
     * Creates a WindowsCertificateProfileBase with a new object
     *
     * @param newWindowsCertificateProfileBase the object to create/update
     * @return the created WindowsCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsCertificateProfileBase put(final WindowsCertificateProfileBase newWindowsCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, newWindowsCertificateProfileBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsCertificateProfileBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsCertificateProfileBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsCertificateProfileBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsCertificateProfileBaseRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWindowsCertificateProfileBaseRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WindowsCertificateProfileBaseRequest)this;
     }

}

