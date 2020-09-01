// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.models.extensions.ColumnLink;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Column Link Collection Request.
 */
public interface IColumnLinkCollectionRequest {

    void get(final ICallback<IColumnLinkCollectionPage> callback);

    IColumnLinkCollectionPage get() throws ClientException;

    void post(final ColumnLink newColumnLink, final ICallback<ColumnLink> callback);

    ColumnLink post(final ColumnLink newColumnLink) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IColumnLinkCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IColumnLinkCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IColumnLinkCollectionRequest top(final int value);

}