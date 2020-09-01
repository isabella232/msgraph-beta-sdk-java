
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81CertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Certificate Profile Base Reference Request Builder.
 */
public class WindowsPhone81CertificateProfileBaseReferenceRequestBuilder extends BaseRequestBuilder implements IWindowsPhone81CertificateProfileBaseReferenceRequestBuilder {

    /**
     * The request builder for the WindowsPhone81CertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81CertificateProfileBaseReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return The IWindowsPhone81CertificateProfileBaseReferenceRequest instance
     */
    public IWindowsPhone81CertificateProfileBaseReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsPhone81CertificateProfileBaseReferenceRequest instance
     */
    public IWindowsPhone81CertificateProfileBaseReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WindowsPhone81CertificateProfileBaseReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}