// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerCertificateProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Certificate Profile Base With Reference Request.
 */
public class AndroidDeviceOwnerCertificateProfileBaseWithReferenceRequest extends BaseRequest implements IAndroidDeviceOwnerCertificateProfileBaseWithReferenceRequest {

    /**
     * The request for the AndroidDeviceOwnerCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerCertificateProfileBaseWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceOwnerCertificateProfileBase.class);
    }

    public void post(final AndroidDeviceOwnerCertificateProfileBase newAndroidDeviceOwnerCertificateProfileBase, final IJsonBackedObject payload, final ICallback<? super AndroidDeviceOwnerCertificateProfileBase> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public AndroidDeviceOwnerCertificateProfileBase post(final AndroidDeviceOwnerCertificateProfileBase newAndroidDeviceOwnerCertificateProfileBase, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newAndroidDeviceOwnerCertificateProfileBase;
        }
        return null;
    }

    public void get(final ICallback<? super AndroidDeviceOwnerCertificateProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public AndroidDeviceOwnerCertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super AndroidDeviceOwnerCertificateProfileBase> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final AndroidDeviceOwnerCertificateProfileBase sourceAndroidDeviceOwnerCertificateProfileBase, final ICallback<? super AndroidDeviceOwnerCertificateProfileBase> callback) {
		send(HttpMethod.PATCH, callback, sourceAndroidDeviceOwnerCertificateProfileBase);
	}

	public AndroidDeviceOwnerCertificateProfileBase patch(final AndroidDeviceOwnerCertificateProfileBase sourceAndroidDeviceOwnerCertificateProfileBase) throws ClientException {
		return send(HttpMethod.PATCH, sourceAndroidDeviceOwnerCertificateProfileBase);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidDeviceOwnerCertificateProfileBaseWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAndroidDeviceOwnerCertificateProfileBaseWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidDeviceOwnerCertificateProfileBaseWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AndroidDeviceOwnerCertificateProfileBaseWithReferenceRequest)this;
    }
}
