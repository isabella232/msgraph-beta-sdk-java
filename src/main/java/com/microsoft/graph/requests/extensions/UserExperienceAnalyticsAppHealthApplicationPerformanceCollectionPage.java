// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthApplicationPerformance;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Application Performance Collection Page.
 */
public class UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsAppHealthApplicationPerformance, IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder> implements IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage {

    /**
     * A collection page for UserExperienceAnalyticsAppHealthApplicationPerformance
     *
     * @param response the serialized UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage(final UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse response, final IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}