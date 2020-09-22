// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEducationAssignmentGetResourcesFolderUrlRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Assignment Get Resources Folder Url Request Builder.
 */
public interface IEducationAssignmentGetResourcesFolderUrlRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEducationAssignmentGetResourcesFolderUrlRequest
     *
     * @param requestOptions the options for the request
     * @return the IEducationAssignmentGetResourcesFolderUrlRequest instance
     */
    IEducationAssignmentGetResourcesFolderUrlRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IEducationAssignmentGetResourcesFolderUrlRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEducationAssignmentGetResourcesFolderUrlRequest instance
     */
    IEducationAssignmentGetResourcesFolderUrlRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
