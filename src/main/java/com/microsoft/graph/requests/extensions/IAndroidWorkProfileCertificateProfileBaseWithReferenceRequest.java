// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfileCertificateProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidWorkProfileTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AndroidWorkProfileCertificateProfileBase;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Work Profile Certificate Profile Base With Reference Request.
 */
public interface IAndroidWorkProfileCertificateProfileBaseWithReferenceRequest extends IHttpRequest {

    void post(final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase, final IJsonBackedObject payload, final ICallback<AndroidWorkProfileCertificateProfileBase> callback);

    AndroidWorkProfileCertificateProfileBase post(final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<AndroidWorkProfileCertificateProfileBase> callback);

    AndroidWorkProfileCertificateProfileBase get() throws ClientException;

	void delete(final ICallback<AndroidWorkProfileCertificateProfileBase> callback);

	void delete() throws ClientException;

	void patch(final AndroidWorkProfileCertificateProfileBase sourceAndroidWorkProfileCertificateProfileBase, final ICallback<AndroidWorkProfileCertificateProfileBase> callback);

	AndroidWorkProfileCertificateProfileBase patch(final AndroidWorkProfileCertificateProfileBase sourceAndroidWorkProfileCertificateProfileBase) throws ClientException;

    IAndroidWorkProfileCertificateProfileBaseWithReferenceRequest select(final String value);

    IAndroidWorkProfileCertificateProfileBaseWithReferenceRequest expand(final String value);

}