// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Note;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Note Request.
 */
public class NoteRequest extends BaseRequest implements INoteRequest {
	
    /**
     * The request for the Note
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NoteRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Note.class);
    }

    /**
     * Gets the Note from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Note> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Note from the service
     *
     * @return the Note from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Note get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Note> callback) {
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
     * Patches this Note with a source
     *
     * @param sourceNote the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Note sourceNote, final ICallback<? super Note> callback) {
        send(HttpMethod.PATCH, callback, sourceNote);
    }

    /**
     * Patches this Note with a source
     *
     * @param sourceNote the source object with updates
     * @return the updated Note
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Note patch(final Note sourceNote) throws ClientException {
        return send(HttpMethod.PATCH, sourceNote);
    }

    /**
     * Creates a Note with a new object
     *
     * @param newNote the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Note newNote, final ICallback<? super Note> callback) {
        send(HttpMethod.POST, callback, newNote);
    }

    /**
     * Creates a Note with a new object
     *
     * @param newNote the new object to create
     * @return the created Note
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Note post(final Note newNote) throws ClientException {
        return send(HttpMethod.POST, newNote);
    }

    /**
     * Creates a Note with a new object
     *
     * @param newNote the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Note newNote, final ICallback<? super Note> callback) {
        send(HttpMethod.PUT, callback, newNote);
    }

    /**
     * Creates a Note with a new object
     *
     * @param newNote the object to create/update
     * @return the created Note
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Note put(final Note newNote) throws ClientException {
        return send(HttpMethod.PUT, newNote);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public INoteRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (NoteRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public INoteRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (NoteRequest)this;
     }

}

