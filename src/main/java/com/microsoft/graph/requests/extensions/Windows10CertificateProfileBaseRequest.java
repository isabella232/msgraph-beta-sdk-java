// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10CertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Certificate Profile Base Request.
 */
public class Windows10CertificateProfileBaseRequest extends BaseRequest implements IWindows10CertificateProfileBaseRequest {
	
    /**
     * The request for the Windows10CertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public Windows10CertificateProfileBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends Windows10CertificateProfileBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Windows10CertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10CertificateProfileBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10CertificateProfileBase.class);
    }

    /**
     * Gets the Windows10CertificateProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows10CertificateProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10CertificateProfileBase from the service
     *
     * @return the Windows10CertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10CertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Windows10CertificateProfileBase> callback) {
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
     * Patches this Windows10CertificateProfileBase with a source
     *
     * @param sourceWindows10CertificateProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10CertificateProfileBase sourceWindows10CertificateProfileBase, final ICallback<Windows10CertificateProfileBase> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10CertificateProfileBase);
    }

    /**
     * Patches this Windows10CertificateProfileBase with a source
     *
     * @param sourceWindows10CertificateProfileBase the source object with updates
     * @return the updated Windows10CertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10CertificateProfileBase patch(final Windows10CertificateProfileBase sourceWindows10CertificateProfileBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10CertificateProfileBase);
    }

    /**
     * Creates a Windows10CertificateProfileBase with a new object
     *
     * @param newWindows10CertificateProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10CertificateProfileBase newWindows10CertificateProfileBase, final ICallback<Windows10CertificateProfileBase> callback) {
        send(HttpMethod.POST, callback, newWindows10CertificateProfileBase);
    }

    /**
     * Creates a Windows10CertificateProfileBase with a new object
     *
     * @param newWindows10CertificateProfileBase the new object to create
     * @return the created Windows10CertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10CertificateProfileBase post(final Windows10CertificateProfileBase newWindows10CertificateProfileBase) throws ClientException {
        return send(HttpMethod.POST, newWindows10CertificateProfileBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10CertificateProfileBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows10CertificateProfileBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10CertificateProfileBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows10CertificateProfileBaseRequest)this;
     }

}

