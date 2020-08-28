// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkEasEmailProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidForWorkCertificateProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkCertificateProfileBaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Eas Email Profile Base Request.
 */
public class AndroidForWorkEasEmailProfileBaseRequest extends BaseRequest implements IAndroidForWorkEasEmailProfileBaseRequest {
	
    /**
     * The request for the AndroidForWorkEasEmailProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AndroidForWorkEasEmailProfileBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends AndroidForWorkEasEmailProfileBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AndroidForWorkEasEmailProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkEasEmailProfileBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkEasEmailProfileBase.class);
    }

    /**
     * Gets the AndroidForWorkEasEmailProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidForWorkEasEmailProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkEasEmailProfileBase from the service
     *
     * @return the AndroidForWorkEasEmailProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkEasEmailProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidForWorkEasEmailProfileBase> callback) {
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
     * Patches this AndroidForWorkEasEmailProfileBase with a source
     *
     * @param sourceAndroidForWorkEasEmailProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkEasEmailProfileBase sourceAndroidForWorkEasEmailProfileBase, final ICallback<AndroidForWorkEasEmailProfileBase> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkEasEmailProfileBase);
    }

    /**
     * Patches this AndroidForWorkEasEmailProfileBase with a source
     *
     * @param sourceAndroidForWorkEasEmailProfileBase the source object with updates
     * @return the updated AndroidForWorkEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkEasEmailProfileBase patch(final AndroidForWorkEasEmailProfileBase sourceAndroidForWorkEasEmailProfileBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkEasEmailProfileBase);
    }

    /**
     * Creates a AndroidForWorkEasEmailProfileBase with a new object
     *
     * @param newAndroidForWorkEasEmailProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkEasEmailProfileBase newAndroidForWorkEasEmailProfileBase, final ICallback<AndroidForWorkEasEmailProfileBase> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkEasEmailProfileBase);
    }

    /**
     * Creates a AndroidForWorkEasEmailProfileBase with a new object
     *
     * @param newAndroidForWorkEasEmailProfileBase the new object to create
     * @return the created AndroidForWorkEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkEasEmailProfileBase post(final AndroidForWorkEasEmailProfileBase newAndroidForWorkEasEmailProfileBase) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkEasEmailProfileBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkEasEmailProfileBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidForWorkEasEmailProfileBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkEasEmailProfileBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidForWorkEasEmailProfileBaseRequest)this;
     }

}

