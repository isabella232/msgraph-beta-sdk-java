// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RemoteActionAudit;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Remote Action Audit Collection Page.
 */
public class RemoteActionAuditCollectionPage extends BaseCollectionPage<RemoteActionAudit, IRemoteActionAuditCollectionRequestBuilder> implements IRemoteActionAuditCollectionPage {

    /**
     * A collection page for RemoteActionAudit
     *
     * @param response the serialized RemoteActionAuditCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RemoteActionAuditCollectionPage(final RemoteActionAuditCollectionResponse response, final IRemoteActionAuditCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
