// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Program;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Program Request.
 */
public interface IProgramRequest extends IHttpRequest {

    /**
     * Gets the Program from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Program> callback);

    /**
     * Gets the Program from the service
     *
     * @return the Program from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Program get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Program> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Program with a source
     *
     * @param sourceProgram the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Program sourceProgram, final ICallback<? super Program> callback);

    /**
     * Patches this Program with a source
     *
     * @param sourceProgram the source object with updates
     * @return the updated Program
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Program patch(final Program sourceProgram) throws ClientException;

    /**
     * Posts a Program with a new object
     *
     * @param newProgram the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Program newProgram, final ICallback<? super Program> callback);

    /**
     * Posts a Program with a new object
     *
     * @param newProgram the new object to create
     * @return the created Program
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Program post(final Program newProgram) throws ClientException;

    /**
     * Posts a Program with a new object
     *
     * @param newProgram the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Program newProgram, final ICallback<? super Program> callback);

    /**
     * Posts a Program with a new object
     *
     * @param newProgram the object to create/update
     * @return the created Program
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Program put(final Program newProgram) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IProgramRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IProgramRequest expand(final String value);

}

