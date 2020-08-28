// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountDetail;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the One Drive Usage Account Detail Request.
 */
public class OneDriveUsageAccountDetailRequest extends BaseRequest implements IOneDriveUsageAccountDetailRequest {
	
    /**
     * The request for the OneDriveUsageAccountDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OneDriveUsageAccountDetailRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OneDriveUsageAccountDetail.class);
    }

    /**
     * Gets the OneDriveUsageAccountDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<OneDriveUsageAccountDetail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OneDriveUsageAccountDetail from the service
     *
     * @return the OneDriveUsageAccountDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OneDriveUsageAccountDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<OneDriveUsageAccountDetail> callback) {
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
     * Patches this OneDriveUsageAccountDetail with a source
     *
     * @param sourceOneDriveUsageAccountDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OneDriveUsageAccountDetail sourceOneDriveUsageAccountDetail, final ICallback<OneDriveUsageAccountDetail> callback) {
        send(HttpMethod.PATCH, callback, sourceOneDriveUsageAccountDetail);
    }

    /**
     * Patches this OneDriveUsageAccountDetail with a source
     *
     * @param sourceOneDriveUsageAccountDetail the source object with updates
     * @return the updated OneDriveUsageAccountDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OneDriveUsageAccountDetail patch(final OneDriveUsageAccountDetail sourceOneDriveUsageAccountDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceOneDriveUsageAccountDetail);
    }

    /**
     * Creates a OneDriveUsageAccountDetail with a new object
     *
     * @param newOneDriveUsageAccountDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final OneDriveUsageAccountDetail newOneDriveUsageAccountDetail, final ICallback<OneDriveUsageAccountDetail> callback) {
        send(HttpMethod.POST, callback, newOneDriveUsageAccountDetail);
    }

    /**
     * Creates a OneDriveUsageAccountDetail with a new object
     *
     * @param newOneDriveUsageAccountDetail the new object to create
     * @return the created OneDriveUsageAccountDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OneDriveUsageAccountDetail post(final OneDriveUsageAccountDetail newOneDriveUsageAccountDetail) throws ClientException {
        return send(HttpMethod.POST, newOneDriveUsageAccountDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOneDriveUsageAccountDetailRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OneDriveUsageAccountDetailRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOneDriveUsageAccountDetailRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OneDriveUsageAccountDetailRequest)this;
     }

}

