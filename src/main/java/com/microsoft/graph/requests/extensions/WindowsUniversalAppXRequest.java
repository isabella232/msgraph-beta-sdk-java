// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsUniversalAppX;
import com.microsoft.graph.requests.extensions.IMobileContainedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileContainedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileContainedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileContainedAppRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Universal App XRequest.
 */
public class WindowsUniversalAppXRequest extends BaseRequest implements IWindowsUniversalAppXRequest {
	
    /**
     * The request for the WindowsUniversalAppX
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsUniversalAppXRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsUniversalAppX.class);
    }

    /**
     * Gets the WindowsUniversalAppX from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsUniversalAppX> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsUniversalAppX from the service
     *
     * @return the WindowsUniversalAppX from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUniversalAppX get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsUniversalAppX> callback) {
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
     * Patches this WindowsUniversalAppX with a source
     *
     * @param sourceWindowsUniversalAppX the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsUniversalAppX sourceWindowsUniversalAppX, final ICallback<WindowsUniversalAppX> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsUniversalAppX);
    }

    /**
     * Patches this WindowsUniversalAppX with a source
     *
     * @param sourceWindowsUniversalAppX the source object with updates
     * @return the updated WindowsUniversalAppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUniversalAppX patch(final WindowsUniversalAppX sourceWindowsUniversalAppX) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsUniversalAppX);
    }

    /**
     * Creates a WindowsUniversalAppX with a new object
     *
     * @param newWindowsUniversalAppX the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsUniversalAppX newWindowsUniversalAppX, final ICallback<WindowsUniversalAppX> callback) {
        send(HttpMethod.POST, callback, newWindowsUniversalAppX);
    }

    /**
     * Creates a WindowsUniversalAppX with a new object
     *
     * @param newWindowsUniversalAppX the new object to create
     * @return the created WindowsUniversalAppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUniversalAppX post(final WindowsUniversalAppX newWindowsUniversalAppX) throws ClientException {
        return send(HttpMethod.POST, newWindowsUniversalAppX);
    }

    /**
     * Creates a WindowsUniversalAppX with a new object
     *
     * @param newWindowsUniversalAppX the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsUniversalAppX newWindowsUniversalAppX, final ICallback<WindowsUniversalAppX> callback) {
        send(HttpMethod.PUT, callback, newWindowsUniversalAppX);
    }

    /**
     * Creates a WindowsUniversalAppX with a new object
     *
     * @param newWindowsUniversalAppX the object to create/update
     * @return the created WindowsUniversalAppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUniversalAppX put(final WindowsUniversalAppX newWindowsUniversalAppX) throws ClientException {
        return send(HttpMethod.PUT, newWindowsUniversalAppX);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsUniversalAppXRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsUniversalAppXRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsUniversalAppXRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsUniversalAppXRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWindowsUniversalAppXRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WindowsUniversalAppXRequest)this;
     }

}

