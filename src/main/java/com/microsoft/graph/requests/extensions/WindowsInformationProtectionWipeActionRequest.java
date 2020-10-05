// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionWipeAction;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Wipe Action Request.
 */
public class WindowsInformationProtectionWipeActionRequest extends BaseRequest implements IWindowsInformationProtectionWipeActionRequest {
	
    /**
     * The request for the WindowsInformationProtectionWipeAction
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionWipeActionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionWipeAction.class);
    }

    /**
     * Gets the WindowsInformationProtectionWipeAction from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsInformationProtectionWipeAction> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsInformationProtectionWipeAction from the service
     *
     * @return the WindowsInformationProtectionWipeAction from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionWipeAction get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsInformationProtectionWipeAction> callback) {
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
     * Patches this WindowsInformationProtectionWipeAction with a source
     *
     * @param sourceWindowsInformationProtectionWipeAction the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsInformationProtectionWipeAction sourceWindowsInformationProtectionWipeAction, final ICallback<? super WindowsInformationProtectionWipeAction> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsInformationProtectionWipeAction);
    }

    /**
     * Patches this WindowsInformationProtectionWipeAction with a source
     *
     * @param sourceWindowsInformationProtectionWipeAction the source object with updates
     * @return the updated WindowsInformationProtectionWipeAction
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionWipeAction patch(final WindowsInformationProtectionWipeAction sourceWindowsInformationProtectionWipeAction) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsInformationProtectionWipeAction);
    }

    /**
     * Creates a WindowsInformationProtectionWipeAction with a new object
     *
     * @param newWindowsInformationProtectionWipeAction the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsInformationProtectionWipeAction newWindowsInformationProtectionWipeAction, final ICallback<? super WindowsInformationProtectionWipeAction> callback) {
        send(HttpMethod.POST, callback, newWindowsInformationProtectionWipeAction);
    }

    /**
     * Creates a WindowsInformationProtectionWipeAction with a new object
     *
     * @param newWindowsInformationProtectionWipeAction the new object to create
     * @return the created WindowsInformationProtectionWipeAction
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionWipeAction post(final WindowsInformationProtectionWipeAction newWindowsInformationProtectionWipeAction) throws ClientException {
        return send(HttpMethod.POST, newWindowsInformationProtectionWipeAction);
    }

    /**
     * Creates a WindowsInformationProtectionWipeAction with a new object
     *
     * @param newWindowsInformationProtectionWipeAction the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsInformationProtectionWipeAction newWindowsInformationProtectionWipeAction, final ICallback<? super WindowsInformationProtectionWipeAction> callback) {
        send(HttpMethod.PUT, callback, newWindowsInformationProtectionWipeAction);
    }

    /**
     * Creates a WindowsInformationProtectionWipeAction with a new object
     *
     * @param newWindowsInformationProtectionWipeAction the object to create/update
     * @return the created WindowsInformationProtectionWipeAction
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionWipeAction put(final WindowsInformationProtectionWipeAction newWindowsInformationProtectionWipeAction) throws ClientException {
        return send(HttpMethod.PUT, newWindowsInformationProtectionWipeAction);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsInformationProtectionWipeActionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsInformationProtectionWipeActionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsInformationProtectionWipeActionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsInformationProtectionWipeActionRequest)this;
     }

}

