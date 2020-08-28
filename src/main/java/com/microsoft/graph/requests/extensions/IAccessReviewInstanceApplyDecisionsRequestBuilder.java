// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceApplyDecisionsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Review Instance Apply Decisions Request Builder.
 */
public interface IAccessReviewInstanceApplyDecisionsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IAccessReviewInstanceApplyDecisionsRequest
     *
     * @return the IAccessReviewInstanceApplyDecisionsRequest instance
     */
    IAccessReviewInstanceApplyDecisionsRequest buildRequest();

    /**
     * Creates the IAccessReviewInstanceApplyDecisionsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IAccessReviewInstanceApplyDecisionsRequest instance
     */
    IAccessReviewInstanceApplyDecisionsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
