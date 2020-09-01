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
import com.microsoft.graph.requests.extensions.EducationAssignmentResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationAssignmentResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSubmissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSubmissionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSubmissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSubmissionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRubricRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationRubricRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Request Builder.
 */
public class EducationAssignmentRequestBuilder extends BaseRequestBuilder implements IEducationAssignmentRequestBuilder {

    /**
     * The request builder for the EducationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationAssignmentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEducationAssignmentRequest instance
     */
    public IEducationAssignmentRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IEducationAssignmentRequest instance
     */
    public IEducationAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.EducationAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IEducationAssignmentResourceCollectionRequestBuilder resources() {
        return new EducationAssignmentResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resources"), getClient(), null);
    }

    public IEducationAssignmentResourceRequestBuilder resources(final String id) {
        return new EducationAssignmentResourceRequestBuilder(getRequestUrlWithAdditionalSegment("resources") + "/" + id, getClient(), null);
    }
    public IEducationSubmissionCollectionRequestBuilder submissions() {
        return new EducationSubmissionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("submissions"), getClient(), null);
    }

    public IEducationSubmissionRequestBuilder submissions(final String id) {
        return new EducationSubmissionRequestBuilder(getRequestUrlWithAdditionalSegment("submissions") + "/" + id, getClient(), null);
    }
    public IEducationCategoryCollectionRequestBuilder categories() {
        return new EducationCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    public IEducationCategoryRequestBuilder categories(final String id) {
        return new EducationCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EducationRubric
     *
     * @return the IEducationRubricRequestBuilder instance
     */
    public IEducationRubricRequestBuilder rubric() {
        return new EducationRubricRequestBuilder(getRequestUrlWithAdditionalSegment("rubric"), getClient(), null);
    }

    public IEducationAssignmentPublishRequestBuilder publish() {
        return new EducationAssignmentPublishRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.publish"), getClient(), null);
    }

    public IEducationAssignmentGetResourcesFolderUrlRequestBuilder getResourcesFolderUrl() {
        return new EducationAssignmentGetResourcesFolderUrlRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getResourcesFolderUrl"), getClient(), null);
    }
}