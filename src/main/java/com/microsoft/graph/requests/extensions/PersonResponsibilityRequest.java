// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PersonResponsibility;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Responsibility Request.
 */
public class PersonResponsibilityRequest extends BaseRequest implements IPersonResponsibilityRequest {
	
    /**
     * The request for the PersonResponsibility
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonResponsibilityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonResponsibility.class);
    }

    /**
     * Gets the PersonResponsibility from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PersonResponsibility> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PersonResponsibility from the service
     *
     * @return the PersonResponsibility from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonResponsibility get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PersonResponsibility> callback) {
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
     * Patches this PersonResponsibility with a source
     *
     * @param sourcePersonResponsibility the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PersonResponsibility sourcePersonResponsibility, final ICallback<? super PersonResponsibility> callback) {
        send(HttpMethod.PATCH, callback, sourcePersonResponsibility);
    }

    /**
     * Patches this PersonResponsibility with a source
     *
     * @param sourcePersonResponsibility the source object with updates
     * @return the updated PersonResponsibility
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonResponsibility patch(final PersonResponsibility sourcePersonResponsibility) throws ClientException {
        return send(HttpMethod.PATCH, sourcePersonResponsibility);
    }

    /**
     * Creates a PersonResponsibility with a new object
     *
     * @param newPersonResponsibility the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PersonResponsibility newPersonResponsibility, final ICallback<? super PersonResponsibility> callback) {
        send(HttpMethod.POST, callback, newPersonResponsibility);
    }

    /**
     * Creates a PersonResponsibility with a new object
     *
     * @param newPersonResponsibility the new object to create
     * @return the created PersonResponsibility
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonResponsibility post(final PersonResponsibility newPersonResponsibility) throws ClientException {
        return send(HttpMethod.POST, newPersonResponsibility);
    }

    /**
     * Creates a PersonResponsibility with a new object
     *
     * @param newPersonResponsibility the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PersonResponsibility newPersonResponsibility, final ICallback<? super PersonResponsibility> callback) {
        send(HttpMethod.PUT, callback, newPersonResponsibility);
    }

    /**
     * Creates a PersonResponsibility with a new object
     *
     * @param newPersonResponsibility the object to create/update
     * @return the created PersonResponsibility
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonResponsibility put(final PersonResponsibility newPersonResponsibility) throws ClientException {
        return send(HttpMethod.PUT, newPersonResponsibility);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPersonResponsibilityRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PersonResponsibilityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPersonResponsibilityRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PersonResponsibilityRequest)this;
     }

}

