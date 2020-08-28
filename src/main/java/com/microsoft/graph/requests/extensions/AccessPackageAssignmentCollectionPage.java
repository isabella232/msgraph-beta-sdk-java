// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageAssignment;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Collection Page.
 */
public class AccessPackageAssignmentCollectionPage extends BaseCollectionPage<AccessPackageAssignment, IAccessPackageAssignmentCollectionRequestBuilder> implements IAccessPackageAssignmentCollectionPage {

    /**
     * A collection page for AccessPackageAssignment
     *
     * @param response the serialized AccessPackageAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessPackageAssignmentCollectionPage(final AccessPackageAssignmentCollectionResponse response, final IAccessPackageAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
