// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosCertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.IosCertificateProfileBase;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Certificate Profile Base Reference Request.
 */
public interface IIosCertificateProfileBaseReferenceRequest extends IHttpRequest {

    void delete(final ICallback<IosCertificateProfileBase> callback);

    IosCertificateProfileBase delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIosCertificateProfileBaseReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIosCertificateProfileBaseReferenceRequest expand(final String value);

    /**
     * Puts the IosCertificateProfileBase
     *
     * @param srcIosCertificateProfileBase the IosCertificateProfileBase to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(IosCertificateProfileBase srcIosCertificateProfileBase, final ICallback<IosCertificateProfileBase> callback);

    /**
     * Puts the IosCertificateProfileBase
     *
     * @param srcIosCertificateProfileBase the IosCertificateProfileBase to PUT
     * @return the IosCertificateProfileBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    IosCertificateProfileBase put(IosCertificateProfileBase srcIosCertificateProfileBase) throws ClientException;
}