// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAccessReviewScheduleDefinitionStopRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Review Schedule Definition Stop Request Builder.
 */
public interface IAccessReviewScheduleDefinitionStopRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IAccessReviewScheduleDefinitionStopRequest
     *
     * @return the IAccessReviewScheduleDefinitionStopRequest instance
     */
    IAccessReviewScheduleDefinitionStopRequest buildRequest();

    /**
     * Creates the IAccessReviewScheduleDefinitionStopRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IAccessReviewScheduleDefinitionStopRequest instance
     */
    IAccessReviewScheduleDefinitionStopRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}