// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentMyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentMyCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentMyCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment My Collection Page.
 */
public class AccessPackageAssignmentMyCollectionPage extends BaseCollectionPage<AccessPackageAssignment, IAccessPackageAssignmentMyCollectionRequestBuilder> implements IAccessPackageAssignmentMyCollectionPage {

    /**
     * A collection page for AccessPackageAssignment.
     *
     * @param response The serialized AccessPackageAssignmentMyCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public AccessPackageAssignmentMyCollectionPage(final AccessPackageAssignmentMyCollectionResponse response, final IAccessPackageAssignmentMyCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}
