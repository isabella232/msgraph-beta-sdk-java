// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSTrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSTrusted Root Certificate Request.
 */
public class MacOSTrustedRootCertificateRequest extends BaseRequest implements IMacOSTrustedRootCertificateRequest {
	
    /**
     * The request for the MacOSTrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSTrustedRootCertificateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSTrustedRootCertificate.class);
    }

    /**
     * Gets the MacOSTrustedRootCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MacOSTrustedRootCertificate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSTrustedRootCertificate from the service
     *
     * @return the MacOSTrustedRootCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSTrustedRootCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MacOSTrustedRootCertificate> callback) {
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
     * Patches this MacOSTrustedRootCertificate with a source
     *
     * @param sourceMacOSTrustedRootCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSTrustedRootCertificate sourceMacOSTrustedRootCertificate, final ICallback<MacOSTrustedRootCertificate> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSTrustedRootCertificate);
    }

    /**
     * Patches this MacOSTrustedRootCertificate with a source
     *
     * @param sourceMacOSTrustedRootCertificate the source object with updates
     * @return the updated MacOSTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSTrustedRootCertificate patch(final MacOSTrustedRootCertificate sourceMacOSTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSTrustedRootCertificate);
    }

    /**
     * Creates a MacOSTrustedRootCertificate with a new object
     *
     * @param newMacOSTrustedRootCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSTrustedRootCertificate newMacOSTrustedRootCertificate, final ICallback<MacOSTrustedRootCertificate> callback) {
        send(HttpMethod.POST, callback, newMacOSTrustedRootCertificate);
    }

    /**
     * Creates a MacOSTrustedRootCertificate with a new object
     *
     * @param newMacOSTrustedRootCertificate the new object to create
     * @return the created MacOSTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSTrustedRootCertificate post(final MacOSTrustedRootCertificate newMacOSTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.POST, newMacOSTrustedRootCertificate);
    }

    /**
     * Creates a MacOSTrustedRootCertificate with a new object
     *
     * @param newMacOSTrustedRootCertificate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MacOSTrustedRootCertificate newMacOSTrustedRootCertificate, final ICallback<MacOSTrustedRootCertificate> callback) {
        send(HttpMethod.PUT, callback, newMacOSTrustedRootCertificate);
    }

    /**
     * Creates a MacOSTrustedRootCertificate with a new object
     *
     * @param newMacOSTrustedRootCertificate the object to create/update
     * @return the created MacOSTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSTrustedRootCertificate put(final MacOSTrustedRootCertificate newMacOSTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.PUT, newMacOSTrustedRootCertificate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSTrustedRootCertificateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSTrustedRootCertificateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSTrustedRootCertificateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSTrustedRootCertificateRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IMacOSTrustedRootCertificateRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (MacOSTrustedRootCertificateRequest)this;
     }

}

