// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows81TrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Trusted Root Certificate With Reference Request.
 */
public class Windows81TrustedRootCertificateWithReferenceRequest extends BaseRequest implements IWindows81TrustedRootCertificateWithReferenceRequest {

    /**
     * The request for the Windows81TrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81TrustedRootCertificateWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows81TrustedRootCertificate.class);
    }

    public void post(final Windows81TrustedRootCertificate newWindows81TrustedRootCertificate, final IJsonBackedObject payload, final ICallback<Windows81TrustedRootCertificate> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public Windows81TrustedRootCertificate post(final Windows81TrustedRootCertificate newWindows81TrustedRootCertificate, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newWindows81TrustedRootCertificate;
        }
        return null;
    }

    public void get(final ICallback<Windows81TrustedRootCertificate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public Windows81TrustedRootCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<Windows81TrustedRootCertificate> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final Windows81TrustedRootCertificate sourceWindows81TrustedRootCertificate, final ICallback<Windows81TrustedRootCertificate> callback) {
		send(HttpMethod.PATCH, callback, sourceWindows81TrustedRootCertificate);
	}

	public Windows81TrustedRootCertificate patch(final Windows81TrustedRootCertificate sourceWindows81TrustedRootCertificate) throws ClientException {
		return send(HttpMethod.PATCH, sourceWindows81TrustedRootCertificate);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindows81TrustedRootCertificateWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IWindows81TrustedRootCertificateWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindows81TrustedRootCertificateWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (Windows81TrustedRootCertificateWithReferenceRequest)this;
    }
}