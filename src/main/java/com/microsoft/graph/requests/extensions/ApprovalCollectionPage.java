// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Approval;
import com.microsoft.graph.requests.extensions.IApprovalCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ApprovalCollectionPage;
import com.microsoft.graph.requests.extensions.ApprovalCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Collection Page.
 */
public class ApprovalCollectionPage extends BaseCollectionPage<Approval, IApprovalCollectionRequestBuilder> implements IApprovalCollectionPage {

    /**
     * A collection page for Approval
     *
     * @param response the serialized ApprovalCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ApprovalCollectionPage(final ApprovalCollectionResponse response, final IApprovalCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
