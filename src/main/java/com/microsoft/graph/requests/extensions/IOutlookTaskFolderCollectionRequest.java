// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookTaskGroup;
import com.microsoft.graph.models.extensions.OutlookTaskFolder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Outlook Task Folder Collection Request.
 */
public interface IOutlookTaskFolderCollectionRequest {

    void get(final ICallback<IOutlookTaskFolderCollectionPage> callback);

    IOutlookTaskFolderCollectionPage get() throws ClientException;

    void post(final OutlookTaskFolder newOutlookTaskFolder, final ICallback<OutlookTaskFolder> callback);

    OutlookTaskFolder post(final OutlookTaskFolder newOutlookTaskFolder) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOutlookTaskFolderCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOutlookTaskFolderCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IOutlookTaskFolderCollectionRequest top(final int value);

}
