// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationAssignment;
import com.microsoft.graph.requests.extensions.IEducationAssignmentPublishRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Assignment Publish Request.
 */
public interface IEducationAssignmentPublishRequest {

    /**
     * Creates the EducationAssignmentPublish
     *
     * @param callback the callback to be called after success or failure
     */
    void post(final ICallback<EducationAssignment> callback);

    /**
     * Creates the EducationAssignmentPublish
     *
     * @return the EducationAssignment
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    EducationAssignment post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationAssignmentPublishRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationAssignmentPublishRequest expand(final String value);

}
