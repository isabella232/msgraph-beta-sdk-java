// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PersonName;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Name Request.
 */
public class PersonNameRequest extends BaseRequest implements IPersonNameRequest {
	
    /**
     * The request for the PersonName
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonNameRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonName.class);
    }

    /**
     * Gets the PersonName from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PersonName> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PersonName from the service
     *
     * @return the PersonName from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonName get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PersonName> callback) {
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
     * Patches this PersonName with a source
     *
     * @param sourcePersonName the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PersonName sourcePersonName, final ICallback<PersonName> callback) {
        send(HttpMethod.PATCH, callback, sourcePersonName);
    }

    /**
     * Patches this PersonName with a source
     *
     * @param sourcePersonName the source object with updates
     * @return the updated PersonName
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonName patch(final PersonName sourcePersonName) throws ClientException {
        return send(HttpMethod.PATCH, sourcePersonName);
    }

    /**
     * Creates a PersonName with a new object
     *
     * @param newPersonName the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PersonName newPersonName, final ICallback<PersonName> callback) {
        send(HttpMethod.POST, callback, newPersonName);
    }

    /**
     * Creates a PersonName with a new object
     *
     * @param newPersonName the new object to create
     * @return the created PersonName
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonName post(final PersonName newPersonName) throws ClientException {
        return send(HttpMethod.POST, newPersonName);
    }

    /**
     * Creates a PersonName with a new object
     *
     * @param newPersonName the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PersonName newPersonName, final ICallback<PersonName> callback) {
        send(HttpMethod.PUT, callback, newPersonName);
    }

    /**
     * Creates a PersonName with a new object
     *
     * @param newPersonName the object to create/update
     * @return the created PersonName
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonName put(final PersonName newPersonName) throws ClientException {
        return send(HttpMethod.PUT, newPersonName);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPersonNameRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PersonNameRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPersonNameRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PersonNameRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IPersonNameRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (PersonNameRequest)this;
     }

}

