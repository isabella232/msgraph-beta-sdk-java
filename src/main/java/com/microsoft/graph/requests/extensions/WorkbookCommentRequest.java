// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookComment;
import com.microsoft.graph.requests.extensions.IWorkbookCommentReplyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCommentReplyRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookCommentReplyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookCommentReplyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Comment Request.
 */
public class WorkbookCommentRequest extends BaseRequest implements IWorkbookCommentRequest {
	
    /**
     * The request for the WorkbookComment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookCommentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookComment.class);
    }

    /**
     * Gets the WorkbookComment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookComment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookComment from the service
     *
     * @return the WorkbookComment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookComment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WorkbookComment> callback) {
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
     * Patches this WorkbookComment with a source
     *
     * @param sourceWorkbookComment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookComment sourceWorkbookComment, final ICallback<WorkbookComment> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookComment);
    }

    /**
     * Patches this WorkbookComment with a source
     *
     * @param sourceWorkbookComment the source object with updates
     * @return the updated WorkbookComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookComment patch(final WorkbookComment sourceWorkbookComment) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookComment);
    }

    /**
     * Creates a WorkbookComment with a new object
     *
     * @param newWorkbookComment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookComment newWorkbookComment, final ICallback<WorkbookComment> callback) {
        send(HttpMethod.POST, callback, newWorkbookComment);
    }

    /**
     * Creates a WorkbookComment with a new object
     *
     * @param newWorkbookComment the new object to create
     * @return the created WorkbookComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookComment post(final WorkbookComment newWorkbookComment) throws ClientException {
        return send(HttpMethod.POST, newWorkbookComment);
    }

    /**
     * Creates a WorkbookComment with a new object
     *
     * @param newWorkbookComment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookComment newWorkbookComment, final ICallback<WorkbookComment> callback) {
        send(HttpMethod.PUT, callback, newWorkbookComment);
    }

    /**
     * Creates a WorkbookComment with a new object
     *
     * @param newWorkbookComment the object to create/update
     * @return the created WorkbookComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookComment put(final WorkbookComment newWorkbookComment) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookComment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookCommentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookCommentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookCommentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookCommentRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWorkbookCommentRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WorkbookCommentRequest)this;
     }

}

