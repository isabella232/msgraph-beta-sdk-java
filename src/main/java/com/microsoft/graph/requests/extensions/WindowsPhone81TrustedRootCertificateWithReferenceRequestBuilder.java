// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81TrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Trusted Root Certificate With Reference Request Builder.
 */
public class WindowsPhone81TrustedRootCertificateWithReferenceRequestBuilder extends BaseRequestBuilder implements IWindowsPhone81TrustedRootCertificateWithReferenceRequestBuilder {

    /**
     * The request builder for the WindowsPhone81TrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81TrustedRootCertificateWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsPhone81TrustedRootCertificateWithReferenceRequest instance
     */
    public IWindowsPhone81TrustedRootCertificateWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IWindowsPhone81TrustedRootCertificateWithReferenceRequest instance
     */
    public IWindowsPhone81TrustedRootCertificateWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WindowsPhone81TrustedRootCertificateWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindowsPhone81TrustedRootCertificateReferenceRequestBuilder reference(){
        return new WindowsPhone81TrustedRootCertificateReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
