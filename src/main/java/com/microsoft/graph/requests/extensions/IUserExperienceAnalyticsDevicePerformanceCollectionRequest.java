// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDevicePerformance;
import com.microsoft.graph.models.generated.UserExperienceAnalyticsSummarizedBy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Device Performance Collection Request.
 */
public interface IUserExperienceAnalyticsDevicePerformanceCollectionRequest extends IHttpRequest {

    void get(final ICallback<IUserExperienceAnalyticsDevicePerformanceCollectionPage> callback);

    IUserExperienceAnalyticsDevicePerformanceCollectionPage get() throws ClientException;

    void post(final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance, final ICallback<UserExperienceAnalyticsDevicePerformance> callback);

    UserExperienceAnalyticsDevicePerformance post(final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDevicePerformanceCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDevicePerformanceCollectionRequest filter(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDevicePerformanceCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IUserExperienceAnalyticsDevicePerformanceCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IUserExperienceAnalyticsDevicePerformanceCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IUserExperienceAnalyticsDevicePerformanceCollectionRequest skipToken(String skipToken);
}
