// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyDefinition;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Collection Page.
 */
public class GroupPolicyDefinitionCollectionPage extends BaseCollectionPage<GroupPolicyDefinition, IGroupPolicyDefinitionCollectionRequestBuilder> implements IGroupPolicyDefinitionCollectionPage {

    /**
     * A collection page for GroupPolicyDefinition
     *
     * @param response the serialized GroupPolicyDefinitionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyDefinitionCollectionPage(final GroupPolicyDefinitionCollectionResponse response, final IGroupPolicyDefinitionCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
