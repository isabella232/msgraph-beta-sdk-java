// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerUser;
import com.microsoft.graph.models.extensions.PlannerPlan;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionResponse;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan Collection With References Page.
 */
public class PlannerPlanCollectionWithReferencesPage extends BaseCollectionPage<PlannerPlan, IPlannerPlanCollectionWithReferencesRequestBuilder> implements IPlannerPlanCollectionWithReferencesPage {

    /**
     * A collection page for PlannerPlan
     *
     * @param response the serialized PlannerPlanCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PlannerPlanCollectionWithReferencesPage(final PlannerPlanCollectionResponse response, final IPlannerPlanCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
