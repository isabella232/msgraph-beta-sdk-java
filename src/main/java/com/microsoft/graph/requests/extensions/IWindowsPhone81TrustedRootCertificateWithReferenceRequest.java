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

import com.microsoft.graph.models.extensions.WindowsPhone81TrustedRootCertificate;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone81Trusted Root Certificate With Reference Request.
 */
public interface IWindowsPhone81TrustedRootCertificateWithReferenceRequest extends IHttpRequest {

    void post(final WindowsPhone81TrustedRootCertificate newWindowsPhone81TrustedRootCertificate, final IJsonBackedObject payload, final ICallback<WindowsPhone81TrustedRootCertificate> callback);

    WindowsPhone81TrustedRootCertificate post(final WindowsPhone81TrustedRootCertificate newWindowsPhone81TrustedRootCertificate, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<WindowsPhone81TrustedRootCertificate> callback);

    WindowsPhone81TrustedRootCertificate get() throws ClientException;

	void delete(final ICallback<WindowsPhone81TrustedRootCertificate> callback);

	void delete() throws ClientException;

	void patch(final WindowsPhone81TrustedRootCertificate sourceWindowsPhone81TrustedRootCertificate, final ICallback<WindowsPhone81TrustedRootCertificate> callback);

	WindowsPhone81TrustedRootCertificate patch(final WindowsPhone81TrustedRootCertificate sourceWindowsPhone81TrustedRootCertificate) throws ClientException;

    IWindowsPhone81TrustedRootCertificateWithReferenceRequest select(final String value);

    IWindowsPhone81TrustedRootCertificateWithReferenceRequest expand(final String value);

}
