// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GovernanceSubject;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GovernanceSubjectCollectionPage;
import com.microsoft.graph.requests.extensions.GovernanceSubjectCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Subject Collection Page.
 */
public class GovernanceSubjectCollectionPage extends BaseCollectionPage<GovernanceSubject, IGovernanceSubjectCollectionRequestBuilder> implements IGovernanceSubjectCollectionPage {

    /**
     * A collection page for GovernanceSubject
     *
     * @param response the serialized GovernanceSubjectCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GovernanceSubjectCollectionPage(final GovernanceSubjectCollectionResponse response, final IGovernanceSubjectCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
