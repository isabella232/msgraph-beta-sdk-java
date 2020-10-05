// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Operation Request.
 */
public class WorkbookOperationRequest extends BaseRequest implements IWorkbookOperationRequest {
	
    /**
     * The request for the WorkbookOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookOperation.class);
    }

    /**
     * Gets the WorkbookOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookOperation from the service
     *
     * @return the WorkbookOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookOperation> callback) {
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
     * Patches this WorkbookOperation with a source
     *
     * @param sourceWorkbookOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookOperation sourceWorkbookOperation, final ICallback<? super WorkbookOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookOperation);
    }

    /**
     * Patches this WorkbookOperation with a source
     *
     * @param sourceWorkbookOperation the source object with updates
     * @return the updated WorkbookOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookOperation patch(final WorkbookOperation sourceWorkbookOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookOperation);
    }

    /**
     * Creates a WorkbookOperation with a new object
     *
     * @param newWorkbookOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookOperation newWorkbookOperation, final ICallback<? super WorkbookOperation> callback) {
        send(HttpMethod.POST, callback, newWorkbookOperation);
    }

    /**
     * Creates a WorkbookOperation with a new object
     *
     * @param newWorkbookOperation the new object to create
     * @return the created WorkbookOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookOperation post(final WorkbookOperation newWorkbookOperation) throws ClientException {
        return send(HttpMethod.POST, newWorkbookOperation);
    }

    /**
     * Creates a WorkbookOperation with a new object
     *
     * @param newWorkbookOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookOperation newWorkbookOperation, final ICallback<? super WorkbookOperation> callback) {
        send(HttpMethod.PUT, callback, newWorkbookOperation);
    }

    /**
     * Creates a WorkbookOperation with a new object
     *
     * @param newWorkbookOperation the object to create/update
     * @return the created WorkbookOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookOperation put(final WorkbookOperation newWorkbookOperation) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookOperationRequest)this;
     }

}

