// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyObjectFile;
import com.microsoft.graph.requests.extensions.IGroupPolicyObjectFileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Object File Collection Page.
 */
public class GroupPolicyObjectFileCollectionPage extends BaseCollectionPage<GroupPolicyObjectFile, IGroupPolicyObjectFileCollectionRequestBuilder> implements IGroupPolicyObjectFileCollectionPage {

    /**
     * A collection page for GroupPolicyObjectFile
     *
     * @param response the serialized GroupPolicyObjectFileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyObjectFileCollectionPage(final GroupPolicyObjectFileCollectionResponse response, final IGroupPolicyObjectFileCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}