// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidCertificateProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Certificate Profile Base With Reference Request.
 */
public class AndroidCertificateProfileBaseWithReferenceRequest extends BaseRequest implements IAndroidCertificateProfileBaseWithReferenceRequest {

    /**
     * The request for the AndroidCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidCertificateProfileBaseWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidCertificateProfileBase.class);
    }

    public void post(final AndroidCertificateProfileBase newAndroidCertificateProfileBase, final IJsonBackedObject payload, final ICallback<AndroidCertificateProfileBase> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public AndroidCertificateProfileBase post(final AndroidCertificateProfileBase newAndroidCertificateProfileBase, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newAndroidCertificateProfileBase;
        }
        return null;
    }

    public void get(final ICallback<AndroidCertificateProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public AndroidCertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<AndroidCertificateProfileBase> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final AndroidCertificateProfileBase sourceAndroidCertificateProfileBase, final ICallback<AndroidCertificateProfileBase> callback) {
		send(HttpMethod.PATCH, callback, sourceAndroidCertificateProfileBase);
	}

	public AndroidCertificateProfileBase patch(final AndroidCertificateProfileBase sourceAndroidCertificateProfileBase) throws ClientException {
		return send(HttpMethod.PATCH, sourceAndroidCertificateProfileBase);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidCertificateProfileBaseWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAndroidCertificateProfileBaseWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidCertificateProfileBaseWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AndroidCertificateProfileBaseWithReferenceRequest)this;
    }
}
