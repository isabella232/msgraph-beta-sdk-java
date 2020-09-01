// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.requests.extensions.IRoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionPage;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Collection Page.
 */
public class RoleScopeTagCollectionPage extends BaseCollectionPage<RoleScopeTag, IRoleScopeTagCollectionRequestBuilder> implements IRoleScopeTagCollectionPage {

    /**
     * A collection page for RoleScopeTag
     *
     * @param response the serialized RoleScopeTagCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RoleScopeTagCollectionPage(final RoleScopeTagCollectionResponse response, final IRoleScopeTagCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}