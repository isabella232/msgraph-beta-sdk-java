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
 * The interface for the Android Work Profile Certificate Profile Base Reference Request.
 */
public interface IAndroidWorkProfileCertificateProfileBaseReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback);

    AndroidWorkProfileCertificateProfileBase delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidWorkProfileCertificateProfileBaseReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidWorkProfileCertificateProfileBaseReferenceRequest expand(final String value);

    /**
     * Puts the AndroidWorkProfileCertificateProfileBase
     *
     * @param srcAndroidWorkProfileCertificateProfileBase the AndroidWorkProfileCertificateProfileBase to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(AndroidWorkProfileCertificateProfileBase srcAndroidWorkProfileCertificateProfileBase, final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback);

    /**
     * Puts the AndroidWorkProfileCertificateProfileBase
     *
     * @param srcAndroidWorkProfileCertificateProfileBase the AndroidWorkProfileCertificateProfileBase to PUT
     * @return the AndroidWorkProfileCertificateProfileBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    AndroidWorkProfileCertificateProfileBase put(AndroidWorkProfileCertificateProfileBase srcAndroidWorkProfileCertificateProfileBase) throws ClientException;
}
