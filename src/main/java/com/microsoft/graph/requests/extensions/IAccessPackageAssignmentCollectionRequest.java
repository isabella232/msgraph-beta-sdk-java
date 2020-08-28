// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentResourceRole;
import com.microsoft.graph.models.extensions.AccessPackageAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Assignment Collection Request.
 */
public interface IAccessPackageAssignmentCollectionRequest {

    void get(final ICallback<IAccessPackageAssignmentCollectionPage> callback);

    IAccessPackageAssignmentCollectionPage get() throws ClientException;

    void post(final AccessPackageAssignment newAccessPackageAssignment, final ICallback<AccessPackageAssignment> callback);

    AccessPackageAssignment post(final AccessPackageAssignment newAccessPackageAssignment) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageAssignmentCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageAssignmentCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IAccessPackageAssignmentCollectionRequest top(final int value);

}
