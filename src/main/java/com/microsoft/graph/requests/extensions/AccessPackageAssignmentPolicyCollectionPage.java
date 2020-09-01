// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentPolicy;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Policy Collection Page.
 */
public class AccessPackageAssignmentPolicyCollectionPage extends BaseCollectionPage<AccessPackageAssignmentPolicy, IAccessPackageAssignmentPolicyCollectionRequestBuilder> implements IAccessPackageAssignmentPolicyCollectionPage {

    /**
     * A collection page for AccessPackageAssignmentPolicy
     *
     * @param response the serialized AccessPackageAssignmentPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessPackageAssignmentPolicyCollectionPage(final AccessPackageAssignmentPolicyCollectionResponse response, final IAccessPackageAssignmentPolicyCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}