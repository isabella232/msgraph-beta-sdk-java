// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationAssignment;
import com.microsoft.graph.requests.extensions.IEducationAssignmentResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSubmissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSubmissionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRubricRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Assignment Request Builder.
 */
public interface IEducationAssignmentRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IEducationAssignmentRequest instance
     */
    IEducationAssignmentRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IEducationAssignmentRequest instance
     */
    IEducationAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IEducationAssignmentResourceCollectionRequestBuilder resources();

    IEducationAssignmentResourceRequestBuilder resources(final String id);

    IEducationSubmissionCollectionRequestBuilder submissions();

    IEducationSubmissionRequestBuilder submissions(final String id);

    IEducationCategoryCollectionRequestBuilder categories();

    IEducationCategoryRequestBuilder categories(final String id);

    /**
     * Gets the request builder for EducationRubric
     *
     * @return the IEducationRubricRequestBuilder instance
     */
    IEducationRubricRequestBuilder rubric();
    IEducationAssignmentPublishRequestBuilder publish();
    IEducationAssignmentGetResourcesFolderUrlRequestBuilder getResourcesFolderUrl();

}