// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.SecurityBaselineState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Security Baseline State Collection Request.
 */
public interface ISecurityBaselineStateCollectionRequest {

    void get(final ICallback<ISecurityBaselineStateCollectionPage> callback);

    ISecurityBaselineStateCollectionPage get() throws ClientException;

    void post(final SecurityBaselineState newSecurityBaselineState, final ICallback<SecurityBaselineState> callback);

    SecurityBaselineState post(final SecurityBaselineState newSecurityBaselineState) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISecurityBaselineStateCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISecurityBaselineStateCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ISecurityBaselineStateCollectionRequest top(final int value);

}