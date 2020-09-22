// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkCertificateProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidForWorkTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Certificate Profile Base Request.
 */
public class AndroidForWorkCertificateProfileBaseRequest extends BaseRequest implements IAndroidForWorkCertificateProfileBaseRequest {
	
    /**
     * The request for the AndroidForWorkCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AndroidForWorkCertificateProfileBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends AndroidForWorkCertificateProfileBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AndroidForWorkCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkCertificateProfileBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkCertificateProfileBase.class);
    }

    /**
     * Gets the AndroidForWorkCertificateProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidForWorkCertificateProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkCertificateProfileBase from the service
     *
     * @return the AndroidForWorkCertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkCertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidForWorkCertificateProfileBase> callback) {
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
     * Patches this AndroidForWorkCertificateProfileBase with a source
     *
     * @param sourceAndroidForWorkCertificateProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkCertificateProfileBase sourceAndroidForWorkCertificateProfileBase, final ICallback<AndroidForWorkCertificateProfileBase> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkCertificateProfileBase);
    }

    /**
     * Patches this AndroidForWorkCertificateProfileBase with a source
     *
     * @param sourceAndroidForWorkCertificateProfileBase the source object with updates
     * @return the updated AndroidForWorkCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkCertificateProfileBase patch(final AndroidForWorkCertificateProfileBase sourceAndroidForWorkCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkCertificateProfileBase);
    }

    /**
     * Creates a AndroidForWorkCertificateProfileBase with a new object
     *
     * @param newAndroidForWorkCertificateProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkCertificateProfileBase newAndroidForWorkCertificateProfileBase, final ICallback<AndroidForWorkCertificateProfileBase> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkCertificateProfileBase);
    }

    /**
     * Creates a AndroidForWorkCertificateProfileBase with a new object
     *
     * @param newAndroidForWorkCertificateProfileBase the new object to create
     * @return the created AndroidForWorkCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkCertificateProfileBase post(final AndroidForWorkCertificateProfileBase newAndroidForWorkCertificateProfileBase) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkCertificateProfileBase);
    }

    /**
     * Creates a AndroidForWorkCertificateProfileBase with a new object
     *
     * @param newAndroidForWorkCertificateProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidForWorkCertificateProfileBase newAndroidForWorkCertificateProfileBase, final ICallback<AndroidForWorkCertificateProfileBase> callback) {
        send(HttpMethod.PUT, callback, newAndroidForWorkCertificateProfileBase);
    }

    /**
     * Creates a AndroidForWorkCertificateProfileBase with a new object
     *
     * @param newAndroidForWorkCertificateProfileBase the object to create/update
     * @return the created AndroidForWorkCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkCertificateProfileBase put(final AndroidForWorkCertificateProfileBase newAndroidForWorkCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkCertificateProfileBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkCertificateProfileBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidForWorkCertificateProfileBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkCertificateProfileBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidForWorkCertificateProfileBaseRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IAndroidForWorkCertificateProfileBaseRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (AndroidForWorkCertificateProfileBaseRequest)this;
     }

}

