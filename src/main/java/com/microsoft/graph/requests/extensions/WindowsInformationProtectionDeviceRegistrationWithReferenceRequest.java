// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration With Reference Request.
 */
public class WindowsInformationProtectionDeviceRegistrationWithReferenceRequest extends BaseRequest implements IWindowsInformationProtectionDeviceRegistrationWithReferenceRequest {

    /**
     * The request for the WindowsInformationProtectionDeviceRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionDeviceRegistrationWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionDeviceRegistration.class);
    }

    public void post(final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration, final IJsonBackedObject payload, final ICallback<? super WindowsInformationProtectionDeviceRegistration> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public WindowsInformationProtectionDeviceRegistration post(final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newWindowsInformationProtectionDeviceRegistration;
        }
        return null;
    }

    public void get(final ICallback<? super WindowsInformationProtectionDeviceRegistration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public WindowsInformationProtectionDeviceRegistration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super WindowsInformationProtectionDeviceRegistration> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final WindowsInformationProtectionDeviceRegistration sourceWindowsInformationProtectionDeviceRegistration, final ICallback<? super WindowsInformationProtectionDeviceRegistration> callback) {
		send(HttpMethod.PATCH, callback, sourceWindowsInformationProtectionDeviceRegistration);
	}

	public WindowsInformationProtectionDeviceRegistration patch(final WindowsInformationProtectionDeviceRegistration sourceWindowsInformationProtectionDeviceRegistration) throws ClientException {
		return send(HttpMethod.PATCH, sourceWindowsInformationProtectionDeviceRegistration);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsInformationProtectionDeviceRegistrationWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IWindowsInformationProtectionDeviceRegistrationWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsInformationProtectionDeviceRegistrationWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsInformationProtectionDeviceRegistrationWithReferenceRequest)this;
    }
}
