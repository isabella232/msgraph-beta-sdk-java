// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsCertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WindowsCertificateProfileBase;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Certificate Profile Base Reference Request.
 */
public interface IWindowsCertificateProfileBaseReferenceRequest extends IHttpRequest {

    void delete(final ICallback<WindowsCertificateProfileBase> callback);

    WindowsCertificateProfileBase delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsCertificateProfileBaseReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsCertificateProfileBaseReferenceRequest expand(final String value);

    /**
     * Puts the WindowsCertificateProfileBase
     *
     * @param srcWindowsCertificateProfileBase the WindowsCertificateProfileBase to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WindowsCertificateProfileBase srcWindowsCertificateProfileBase, final ICallback<WindowsCertificateProfileBase> callback);

    /**
     * Puts the WindowsCertificateProfileBase
     *
     * @param srcWindowsCertificateProfileBase the WindowsCertificateProfileBase to PUT
     * @return the WindowsCertificateProfileBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WindowsCertificateProfileBase put(WindowsCertificateProfileBase srcWindowsCertificateProfileBase) throws ClientException;
}
