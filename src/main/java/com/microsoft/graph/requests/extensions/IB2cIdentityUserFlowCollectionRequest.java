// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityContainer;
import com.microsoft.graph.models.extensions.B2cIdentityUserFlow;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the B2c Identity User Flow Collection Request.
 */
public interface IB2cIdentityUserFlowCollectionRequest {

    void get(final ICallback<IB2cIdentityUserFlowCollectionPage> callback);

    IB2cIdentityUserFlowCollectionPage get() throws ClientException;

    void post(final B2cIdentityUserFlow newB2cIdentityUserFlow, final ICallback<B2cIdentityUserFlow> callback);

    B2cIdentityUserFlow post(final B2cIdentityUserFlow newB2cIdentityUserFlow) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IB2cIdentityUserFlowCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IB2cIdentityUserFlowCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IB2cIdentityUserFlowCollectionRequest top(final int value);

}
