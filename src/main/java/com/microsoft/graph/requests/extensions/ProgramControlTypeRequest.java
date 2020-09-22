// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ProgramControlType;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Program Control Type Request.
 */
public class ProgramControlTypeRequest extends BaseRequest implements IProgramControlTypeRequest {
	
    /**
     * The request for the ProgramControlType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProgramControlTypeRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ProgramControlType.class);
    }

    /**
     * Gets the ProgramControlType from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ProgramControlType> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ProgramControlType from the service
     *
     * @return the ProgramControlType from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProgramControlType get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ProgramControlType> callback) {
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
     * Patches this ProgramControlType with a source
     *
     * @param sourceProgramControlType the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ProgramControlType sourceProgramControlType, final ICallback<ProgramControlType> callback) {
        send(HttpMethod.PATCH, callback, sourceProgramControlType);
    }

    /**
     * Patches this ProgramControlType with a source
     *
     * @param sourceProgramControlType the source object with updates
     * @return the updated ProgramControlType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProgramControlType patch(final ProgramControlType sourceProgramControlType) throws ClientException {
        return send(HttpMethod.PATCH, sourceProgramControlType);
    }

    /**
     * Creates a ProgramControlType with a new object
     *
     * @param newProgramControlType the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ProgramControlType newProgramControlType, final ICallback<ProgramControlType> callback) {
        send(HttpMethod.POST, callback, newProgramControlType);
    }

    /**
     * Creates a ProgramControlType with a new object
     *
     * @param newProgramControlType the new object to create
     * @return the created ProgramControlType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProgramControlType post(final ProgramControlType newProgramControlType) throws ClientException {
        return send(HttpMethod.POST, newProgramControlType);
    }

    /**
     * Creates a ProgramControlType with a new object
     *
     * @param newProgramControlType the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ProgramControlType newProgramControlType, final ICallback<ProgramControlType> callback) {
        send(HttpMethod.PUT, callback, newProgramControlType);
    }

    /**
     * Creates a ProgramControlType with a new object
     *
     * @param newProgramControlType the object to create/update
     * @return the created ProgramControlType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProgramControlType put(final ProgramControlType newProgramControlType) throws ClientException {
        return send(HttpMethod.PUT, newProgramControlType);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IProgramControlTypeRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ProgramControlTypeRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IProgramControlTypeRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ProgramControlTypeRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IProgramControlTypeRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (ProgramControlTypeRequest)this;
     }

}

