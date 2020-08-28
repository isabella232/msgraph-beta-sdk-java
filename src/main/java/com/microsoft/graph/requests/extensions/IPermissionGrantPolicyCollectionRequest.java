// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.models.extensions.PermissionGrantPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Permission Grant Policy Collection Request.
 */
public interface IPermissionGrantPolicyCollectionRequest {

    void get(final ICallback<IPermissionGrantPolicyCollectionPage> callback);

    IPermissionGrantPolicyCollectionPage get() throws ClientException;

    void post(final PermissionGrantPolicy newPermissionGrantPolicy, final ICallback<PermissionGrantPolicy> callback);

    PermissionGrantPolicy post(final PermissionGrantPolicy newPermissionGrantPolicy) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPermissionGrantPolicyCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPermissionGrantPolicyCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IPermissionGrantPolicyCollectionRequest top(final int value);

}
