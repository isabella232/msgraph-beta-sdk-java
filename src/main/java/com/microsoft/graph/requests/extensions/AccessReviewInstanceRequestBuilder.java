// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReviewInstance;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceDecisionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceDecisionItemRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceDecisionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceDecisionItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewScheduleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewScheduleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Request Builder.
 */
public class AccessReviewInstanceRequestBuilder extends BaseRequestBuilder implements IAccessReviewInstanceRequestBuilder {

    /**
     * The request builder for the AccessReviewInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAccessReviewInstanceRequest instance
     */
    public IAccessReviewInstanceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAccessReviewInstanceRequest instance
     */
    public IAccessReviewInstanceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AccessReviewInstanceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAccessReviewInstanceDecisionItemCollectionRequestBuilder decisions() {
        return new AccessReviewInstanceDecisionItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("decisions"), getClient(), null);
    }

    public IAccessReviewInstanceDecisionItemRequestBuilder decisions(final String id) {
        return new AccessReviewInstanceDecisionItemRequestBuilder(getRequestUrlWithAdditionalSegment("decisions") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AccessReviewScheduleDefinition
     *
     * @return the IAccessReviewScheduleDefinitionWithReferenceRequestBuilder instance
     */
    public IAccessReviewScheduleDefinitionWithReferenceRequestBuilder definition() {
        return new AccessReviewScheduleDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("definition"), getClient(), null);
    }

    public IAccessReviewInstanceStopRequestBuilder stop() {
        return new AccessReviewInstanceStopRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stop"), getClient(), null);
    }

    public IAccessReviewInstanceAcceptRecommendationsRequestBuilder acceptRecommendations() {
        return new AccessReviewInstanceAcceptRecommendationsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acceptRecommendations"), getClient(), null);
    }

    public IAccessReviewInstanceApplyDecisionsRequestBuilder applyDecisions() {
        return new AccessReviewInstanceApplyDecisionsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyDecisions"), getClient(), null);
    }

    public IAccessReviewInstanceResetDecisionsRequestBuilder resetDecisions() {
        return new AccessReviewInstanceResetDecisionsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resetDecisions"), getClient(), null);
    }

    public IAccessReviewInstanceSendReminderRequestBuilder sendReminder() {
        return new AccessReviewInstanceSendReminderRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendReminder"), getClient(), null);
    }
}
