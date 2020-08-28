// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OfficeClientConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Client Configuration Assignment Collection Page.
 */
public class OfficeClientConfigurationAssignmentCollectionPage extends BaseCollectionPage<OfficeClientConfigurationAssignment, IOfficeClientConfigurationAssignmentCollectionRequestBuilder> implements IOfficeClientConfigurationAssignmentCollectionPage {

    /**
     * A collection page for OfficeClientConfigurationAssignment
     *
     * @param response the serialized OfficeClientConfigurationAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OfficeClientConfigurationAssignmentCollectionPage(final OfficeClientConfigurationAssignmentCollectionResponse response, final IOfficeClientConfigurationAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
