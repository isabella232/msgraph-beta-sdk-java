// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerTrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Trusted Root Certificate With Reference Request.
 */
public class AndroidDeviceOwnerTrustedRootCertificateWithReferenceRequest extends BaseRequest implements IAndroidDeviceOwnerTrustedRootCertificateWithReferenceRequest {

    /**
     * The request for the AndroidDeviceOwnerTrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerTrustedRootCertificateWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceOwnerTrustedRootCertificate.class);
    }

    public void post(final AndroidDeviceOwnerTrustedRootCertificate newAndroidDeviceOwnerTrustedRootCertificate, final IJsonBackedObject payload, final ICallback<AndroidDeviceOwnerTrustedRootCertificate> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public AndroidDeviceOwnerTrustedRootCertificate post(final AndroidDeviceOwnerTrustedRootCertificate newAndroidDeviceOwnerTrustedRootCertificate, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newAndroidDeviceOwnerTrustedRootCertificate;
        }
        return null;
    }

    public void get(final ICallback<AndroidDeviceOwnerTrustedRootCertificate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public AndroidDeviceOwnerTrustedRootCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<AndroidDeviceOwnerTrustedRootCertificate> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final AndroidDeviceOwnerTrustedRootCertificate sourceAndroidDeviceOwnerTrustedRootCertificate, final ICallback<AndroidDeviceOwnerTrustedRootCertificate> callback) {
		send(HttpMethod.PATCH, callback, sourceAndroidDeviceOwnerTrustedRootCertificate);
	}

	public AndroidDeviceOwnerTrustedRootCertificate patch(final AndroidDeviceOwnerTrustedRootCertificate sourceAndroidDeviceOwnerTrustedRootCertificate) throws ClientException {
		return send(HttpMethod.PATCH, sourceAndroidDeviceOwnerTrustedRootCertificate);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidDeviceOwnerTrustedRootCertificateWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAndroidDeviceOwnerTrustedRootCertificateWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidDeviceOwnerTrustedRootCertificateWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AndroidDeviceOwnerTrustedRootCertificateWithReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAndroidDeviceOwnerTrustedRootCertificateWithReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AndroidDeviceOwnerTrustedRootCertificateWithReferenceRequest)this;
    }
}
