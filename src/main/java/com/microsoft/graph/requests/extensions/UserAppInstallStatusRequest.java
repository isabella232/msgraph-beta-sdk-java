// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserAppInstallStatus;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User App Install Status Request.
 */
public class UserAppInstallStatusRequest extends BaseRequest implements IUserAppInstallStatusRequest {
	
    /**
     * The request for the UserAppInstallStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserAppInstallStatusRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserAppInstallStatus.class);
    }

    /**
     * Gets the UserAppInstallStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UserAppInstallStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserAppInstallStatus from the service
     *
     * @return the UserAppInstallStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserAppInstallStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UserAppInstallStatus> callback) {
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
     * Patches this UserAppInstallStatus with a source
     *
     * @param sourceUserAppInstallStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserAppInstallStatus sourceUserAppInstallStatus, final ICallback<UserAppInstallStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceUserAppInstallStatus);
    }

    /**
     * Patches this UserAppInstallStatus with a source
     *
     * @param sourceUserAppInstallStatus the source object with updates
     * @return the updated UserAppInstallStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserAppInstallStatus patch(final UserAppInstallStatus sourceUserAppInstallStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserAppInstallStatus);
    }

    /**
     * Creates a UserAppInstallStatus with a new object
     *
     * @param newUserAppInstallStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserAppInstallStatus newUserAppInstallStatus, final ICallback<UserAppInstallStatus> callback) {
        send(HttpMethod.POST, callback, newUserAppInstallStatus);
    }

    /**
     * Creates a UserAppInstallStatus with a new object
     *
     * @param newUserAppInstallStatus the new object to create
     * @return the created UserAppInstallStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserAppInstallStatus post(final UserAppInstallStatus newUserAppInstallStatus) throws ClientException {
        return send(HttpMethod.POST, newUserAppInstallStatus);
    }

    /**
     * Creates a UserAppInstallStatus with a new object
     *
     * @param newUserAppInstallStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserAppInstallStatus newUserAppInstallStatus, final ICallback<UserAppInstallStatus> callback) {
        send(HttpMethod.PUT, callback, newUserAppInstallStatus);
    }

    /**
     * Creates a UserAppInstallStatus with a new object
     *
     * @param newUserAppInstallStatus the object to create/update
     * @return the created UserAppInstallStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserAppInstallStatus put(final UserAppInstallStatus newUserAppInstallStatus) throws ClientException {
        return send(HttpMethod.PUT, newUserAppInstallStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserAppInstallStatusRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserAppInstallStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserAppInstallStatusRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserAppInstallStatusRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IUserAppInstallStatusRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (UserAppInstallStatusRequest)this;
     }

}

