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
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerDeltaRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner User Request Builder.
 */
public interface IPlannerUserRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IPlannerUserRequest instance
     */
    IPlannerUserRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPlannerUserRequest instance
     */
    IPlannerUserRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IPlannerTaskCollectionRequestBuilder tasks();

    IPlannerTaskRequestBuilder tasks(final String id);

    IPlannerPlanCollectionRequestBuilder plans();

    IPlannerPlanRequestBuilder plans(final String id);

    IPlannerPlanCollectionWithReferencesRequestBuilder favoritePlans();

    IPlannerPlanWithReferenceRequestBuilder favoritePlans(final String id);

    IPlannerPlanCollectionWithReferencesRequestBuilder recentPlans();

    IPlannerPlanWithReferenceRequestBuilder recentPlans(final String id);

    IPlannerDeltaCollectionRequestBuilder all();

    IPlannerDeltaRequestBuilder all(final String id);

}