// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookUser;
import com.microsoft.graph.models.extensions.OutlookTaskGroup;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Outlook Task Group Collection Request.
 */
public interface IOutlookTaskGroupCollectionRequest {

    void get(final ICallback<IOutlookTaskGroupCollectionPage> callback);

    IOutlookTaskGroupCollectionPage get() throws ClientException;

    void post(final OutlookTaskGroup newOutlookTaskGroup, final ICallback<OutlookTaskGroup> callback);

    OutlookTaskGroup post(final OutlookTaskGroup newOutlookTaskGroup) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOutlookTaskGroupCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOutlookTaskGroupCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IOutlookTaskGroupCollectionRequest top(final int value);

}