// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmailAppUsageUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email App Usage User Detail Request.
 */
public class EmailAppUsageUserDetailRequest extends BaseRequest implements IEmailAppUsageUserDetailRequest {
	
    /**
     * The request for the EmailAppUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmailAppUsageUserDetailRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmailAppUsageUserDetail.class);
    }

    /**
     * Gets the EmailAppUsageUserDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EmailAppUsageUserDetail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EmailAppUsageUserDetail from the service
     *
     * @return the EmailAppUsageUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailAppUsageUserDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EmailAppUsageUserDetail> callback) {
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
     * Patches this EmailAppUsageUserDetail with a source
     *
     * @param sourceEmailAppUsageUserDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EmailAppUsageUserDetail sourceEmailAppUsageUserDetail, final ICallback<EmailAppUsageUserDetail> callback) {
        send(HttpMethod.PATCH, callback, sourceEmailAppUsageUserDetail);
    }

    /**
     * Patches this EmailAppUsageUserDetail with a source
     *
     * @param sourceEmailAppUsageUserDetail the source object with updates
     * @return the updated EmailAppUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailAppUsageUserDetail patch(final EmailAppUsageUserDetail sourceEmailAppUsageUserDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceEmailAppUsageUserDetail);
    }

    /**
     * Creates a EmailAppUsageUserDetail with a new object
     *
     * @param newEmailAppUsageUserDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EmailAppUsageUserDetail newEmailAppUsageUserDetail, final ICallback<EmailAppUsageUserDetail> callback) {
        send(HttpMethod.POST, callback, newEmailAppUsageUserDetail);
    }

    /**
     * Creates a EmailAppUsageUserDetail with a new object
     *
     * @param newEmailAppUsageUserDetail the new object to create
     * @return the created EmailAppUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailAppUsageUserDetail post(final EmailAppUsageUserDetail newEmailAppUsageUserDetail) throws ClientException {
        return send(HttpMethod.POST, newEmailAppUsageUserDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEmailAppUsageUserDetailRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EmailAppUsageUserDetailRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEmailAppUsageUserDetailRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EmailAppUsageUserDetailRequest)this;
     }

}

