// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedSignupStatus;
import com.microsoft.graph.models.extensions.TenantSetupInfo;
import com.microsoft.graph.models.extensions.RoleSuccessStatistics;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Signup Status Request.
 */
public class PrivilegedSignupStatusRequest extends BaseRequest implements IPrivilegedSignupStatusRequest {
	
    /**
     * The request for the PrivilegedSignupStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedSignupStatusRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedSignupStatus.class);
    }

    /**
     * Gets the PrivilegedSignupStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PrivilegedSignupStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrivilegedSignupStatus from the service
     *
     * @return the PrivilegedSignupStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedSignupStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PrivilegedSignupStatus> callback) {
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
     * Patches this PrivilegedSignupStatus with a source
     *
     * @param sourcePrivilegedSignupStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrivilegedSignupStatus sourcePrivilegedSignupStatus, final ICallback<PrivilegedSignupStatus> callback) {
        send(HttpMethod.PATCH, callback, sourcePrivilegedSignupStatus);
    }

    /**
     * Patches this PrivilegedSignupStatus with a source
     *
     * @param sourcePrivilegedSignupStatus the source object with updates
     * @return the updated PrivilegedSignupStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedSignupStatus patch(final PrivilegedSignupStatus sourcePrivilegedSignupStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedSignupStatus);
    }

    /**
     * Creates a PrivilegedSignupStatus with a new object
     *
     * @param newPrivilegedSignupStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrivilegedSignupStatus newPrivilegedSignupStatus, final ICallback<PrivilegedSignupStatus> callback) {
        send(HttpMethod.POST, callback, newPrivilegedSignupStatus);
    }

    /**
     * Creates a PrivilegedSignupStatus with a new object
     *
     * @param newPrivilegedSignupStatus the new object to create
     * @return the created PrivilegedSignupStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedSignupStatus post(final PrivilegedSignupStatus newPrivilegedSignupStatus) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedSignupStatus);
    }

    /**
     * Creates a PrivilegedSignupStatus with a new object
     *
     * @param newPrivilegedSignupStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrivilegedSignupStatus newPrivilegedSignupStatus, final ICallback<PrivilegedSignupStatus> callback) {
        send(HttpMethod.PUT, callback, newPrivilegedSignupStatus);
    }

    /**
     * Creates a PrivilegedSignupStatus with a new object
     *
     * @param newPrivilegedSignupStatus the object to create/update
     * @return the created PrivilegedSignupStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedSignupStatus put(final PrivilegedSignupStatus newPrivilegedSignupStatus) throws ClientException {
        return send(HttpMethod.PUT, newPrivilegedSignupStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrivilegedSignupStatusRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrivilegedSignupStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrivilegedSignupStatusRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrivilegedSignupStatusRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IPrivilegedSignupStatusRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (PrivilegedSignupStatusRequest)this;
     }

}

