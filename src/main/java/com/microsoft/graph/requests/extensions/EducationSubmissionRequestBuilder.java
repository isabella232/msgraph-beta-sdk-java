// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSubmission;
import com.microsoft.graph.requests.extensions.IEducationOutcomeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationOutcomeRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationOutcomeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationOutcomeRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSubmissionResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSubmissionResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSubmissionResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSubmissionResourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Submission Request Builder.
 */
public class EducationSubmissionRequestBuilder extends BaseRequestBuilder implements IEducationSubmissionRequestBuilder {

    /**
     * The request builder for the EducationSubmission
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSubmissionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IEducationSubmissionRequest instance
     */
    public IEducationSubmissionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IEducationSubmissionRequest instance
     */
    public IEducationSubmissionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.EducationSubmissionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IEducationOutcomeCollectionRequestBuilder outcomes() {
        return new EducationOutcomeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("outcomes"), getClient(), null);
    }

    public IEducationOutcomeRequestBuilder outcomes(final String id) {
        return new EducationOutcomeRequestBuilder(getRequestUrlWithAdditionalSegment("outcomes") + "/" + id, getClient(), null);
    }
    public IEducationSubmissionResourceCollectionRequestBuilder resources() {
        return new EducationSubmissionResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resources"), getClient(), null);
    }

    public IEducationSubmissionResourceRequestBuilder resources(final String id) {
        return new EducationSubmissionResourceRequestBuilder(getRequestUrlWithAdditionalSegment("resources") + "/" + id, getClient(), null);
    }
    public IEducationSubmissionResourceCollectionRequestBuilder submittedResources() {
        return new EducationSubmissionResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("submittedResources"), getClient(), null);
    }

    public IEducationSubmissionResourceRequestBuilder submittedResources(final String id) {
        return new EducationSubmissionResourceRequestBuilder(getRequestUrlWithAdditionalSegment("submittedResources") + "/" + id, getClient(), null);
    }

    public IEducationSubmissionReturnRequestBuilder msgraphReturn() {
        return new EducationSubmissionReturnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.return"), getClient(), null);
    }

    public IEducationSubmissionSubmitRequestBuilder submit() {
        return new EducationSubmissionSubmitRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.submit"), getClient(), null);
    }

    public IEducationSubmissionUnsubmitRequestBuilder unsubmit() {
        return new EducationSubmissionUnsubmitRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unsubmit"), getClient(), null);
    }
}
