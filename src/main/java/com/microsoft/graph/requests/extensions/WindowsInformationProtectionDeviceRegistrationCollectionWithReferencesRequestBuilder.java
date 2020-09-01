// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration Collection With References Request Builder.
 */
public class WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindowsInformationProtectionDeviceRegistrationWithReferenceRequestBuilder byId(final String id) {
        return new WindowsInformationProtectionDeviceRegistrationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IWindowsInformationProtectionDeviceRegistrationCollectionReferenceRequestBuilder references(){
        return new WindowsInformationProtectionDeviceRegistrationCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}