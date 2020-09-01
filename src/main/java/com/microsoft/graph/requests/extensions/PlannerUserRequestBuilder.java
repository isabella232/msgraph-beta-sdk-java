// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerUser;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerDeltaRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerDeltaRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner User Request Builder.
 */
public class PlannerUserRequestBuilder extends BaseRequestBuilder implements IPlannerUserRequestBuilder {

    /**
     * The request builder for the PlannerUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerUserRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IPlannerUserRequest instance
     */
    public IPlannerUserRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPlannerUserRequest instance
     */
    public IPlannerUserRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PlannerUserRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IPlannerTaskCollectionRequestBuilder tasks() {
        return new PlannerTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tasks"), getClient(), null);
    }

    public IPlannerTaskRequestBuilder tasks(final String id) {
        return new PlannerTaskRequestBuilder(getRequestUrlWithAdditionalSegment("tasks") + "/" + id, getClient(), null);
    }
    public IPlannerPlanCollectionRequestBuilder plans() {
        return new PlannerPlanCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("plans"), getClient(), null);
    }

    public IPlannerPlanRequestBuilder plans(final String id) {
        return new PlannerPlanRequestBuilder(getRequestUrlWithAdditionalSegment("plans") + "/" + id, getClient(), null);
    }
    public IPlannerPlanCollectionWithReferencesRequestBuilder favoritePlans() {
        return new PlannerPlanCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("favoritePlans"), getClient(), null);
    }

    public IPlannerPlanWithReferenceRequestBuilder favoritePlans(final String id) {
        return new PlannerPlanWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("favoritePlans") + "/" + id, getClient(), null);
    }
    public IPlannerPlanCollectionWithReferencesRequestBuilder recentPlans() {
        return new PlannerPlanCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("recentPlans"), getClient(), null);
    }

    public IPlannerPlanWithReferenceRequestBuilder recentPlans(final String id) {
        return new PlannerPlanWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("recentPlans") + "/" + id, getClient(), null);
    }
    public IPlannerDeltaCollectionRequestBuilder all() {
        return new PlannerDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("all"), getClient(), null);
    }

    public IPlannerDeltaRequestBuilder all(final String id) {
        return new PlannerDeltaRequestBuilder(getRequestUrlWithAdditionalSegment("all") + "/" + id, getClient(), null);
    }
}