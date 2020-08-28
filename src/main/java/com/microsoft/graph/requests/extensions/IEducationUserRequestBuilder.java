// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.requests.extensions.IEducationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRubricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRubricRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education User Request Builder.
 */
public interface IEducationUserRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IEducationUserRequest instance
     */
    IEducationUserRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IEducationUserRequest instance
     */
    IEducationUserRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IEducationAssignmentCollectionRequestBuilder assignments();

    IEducationAssignmentRequestBuilder assignments(final String id);

    IEducationRubricCollectionRequestBuilder rubrics();

    IEducationRubricRequestBuilder rubrics(final String id);

    IEducationClassCollectionWithReferencesRequestBuilder classes();

    IEducationClassWithReferenceRequestBuilder classes(final String id);

    IEducationClassCollectionWithReferencesRequestBuilder taughtClasses();

    IEducationClassWithReferenceRequestBuilder taughtClasses(final String id);

    IEducationSchoolCollectionWithReferencesRequestBuilder schools();

    IEducationSchoolWithReferenceRequestBuilder schools(final String id);

    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    IUserWithReferenceRequestBuilder user();

}