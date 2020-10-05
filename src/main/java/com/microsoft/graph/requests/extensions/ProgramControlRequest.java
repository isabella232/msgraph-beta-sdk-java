// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ProgramControl;
import com.microsoft.graph.requests.extensions.IProgramRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Program Control Request.
 */
public class ProgramControlRequest extends BaseRequest implements IProgramControlRequest {
	
    /**
     * The request for the ProgramControl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProgramControlRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ProgramControl.class);
    }

    /**
     * Gets the ProgramControl from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ProgramControl> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ProgramControl from the service
     *
     * @return the ProgramControl from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProgramControl get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ProgramControl> callback) {
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
     * Patches this ProgramControl with a source
     *
     * @param sourceProgramControl the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ProgramControl sourceProgramControl, final ICallback<? super ProgramControl> callback) {
        send(HttpMethod.PATCH, callback, sourceProgramControl);
    }

    /**
     * Patches this ProgramControl with a source
     *
     * @param sourceProgramControl the source object with updates
     * @return the updated ProgramControl
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProgramControl patch(final ProgramControl sourceProgramControl) throws ClientException {
        return send(HttpMethod.PATCH, sourceProgramControl);
    }

    /**
     * Creates a ProgramControl with a new object
     *
     * @param newProgramControl the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ProgramControl newProgramControl, final ICallback<? super ProgramControl> callback) {
        send(HttpMethod.POST, callback, newProgramControl);
    }

    /**
     * Creates a ProgramControl with a new object
     *
     * @param newProgramControl the new object to create
     * @return the created ProgramControl
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProgramControl post(final ProgramControl newProgramControl) throws ClientException {
        return send(HttpMethod.POST, newProgramControl);
    }

    /**
     * Creates a ProgramControl with a new object
     *
     * @param newProgramControl the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ProgramControl newProgramControl, final ICallback<? super ProgramControl> callback) {
        send(HttpMethod.PUT, callback, newProgramControl);
    }

    /**
     * Creates a ProgramControl with a new object
     *
     * @param newProgramControl the object to create/update
     * @return the created ProgramControl
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProgramControl put(final ProgramControl newProgramControl) throws ClientException {
        return send(HttpMethod.PUT, newProgramControl);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IProgramControlRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ProgramControlRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IProgramControlRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ProgramControlRequest)this;
     }

}

