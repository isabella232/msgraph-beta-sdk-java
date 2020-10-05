// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Operation Request.
 */
public class PrintOperationRequest extends BaseRequest implements IPrintOperationRequest {
	
    /**
     * The request for the PrintOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public PrintOperationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends PrintOperation> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the PrintOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintOperation.class);
    }

    /**
     * Gets the PrintOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PrintOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrintOperation from the service
     *
     * @return the PrintOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PrintOperation> callback) {
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
     * Patches this PrintOperation with a source
     *
     * @param sourcePrintOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrintOperation sourcePrintOperation, final ICallback<? super PrintOperation> callback) {
        send(HttpMethod.PATCH, callback, sourcePrintOperation);
    }

    /**
     * Patches this PrintOperation with a source
     *
     * @param sourcePrintOperation the source object with updates
     * @return the updated PrintOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintOperation patch(final PrintOperation sourcePrintOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrintOperation);
    }

    /**
     * Creates a PrintOperation with a new object
     *
     * @param newPrintOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrintOperation newPrintOperation, final ICallback<? super PrintOperation> callback) {
        send(HttpMethod.POST, callback, newPrintOperation);
    }

    /**
     * Creates a PrintOperation with a new object
     *
     * @param newPrintOperation the new object to create
     * @return the created PrintOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintOperation post(final PrintOperation newPrintOperation) throws ClientException {
        return send(HttpMethod.POST, newPrintOperation);
    }

    /**
     * Creates a PrintOperation with a new object
     *
     * @param newPrintOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrintOperation newPrintOperation, final ICallback<? super PrintOperation> callback) {
        send(HttpMethod.PUT, callback, newPrintOperation);
    }

    /**
     * Creates a PrintOperation with a new object
     *
     * @param newPrintOperation the object to create/update
     * @return the created PrintOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintOperation put(final PrintOperation newPrintOperation) throws ClientException {
        return send(HttpMethod.PUT, newPrintOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrintOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrintOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrintOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrintOperationRequest)this;
     }

}

