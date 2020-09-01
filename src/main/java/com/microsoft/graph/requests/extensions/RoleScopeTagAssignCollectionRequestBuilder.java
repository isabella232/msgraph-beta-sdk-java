// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IRoleScopeTagAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagAssignCollectionRequest;
import com.microsoft.graph.requests.extensions.RoleScopeTagAssignCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Assign Collection Request Builder.
 */
public class RoleScopeTagAssignCollectionRequestBuilder extends BaseActionRequestBuilder implements IRoleScopeTagAssignCollectionRequestBuilder {

    /**
     * The request builder for this collection of RoleScopeTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public RoleScopeTagAssignCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<RoleScopeTagAutoAssignment> assignments) {
        super(requestUrl, client, requestOptions);
  	 if(assignments!=null){
			bodyParams.put("assignments", assignments);
		}
      }

    public IRoleScopeTagAssignCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IRoleScopeTagAssignCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        RoleScopeTagAssignCollectionRequest request = new RoleScopeTagAssignCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("assignments")) {
            request.body.assignments = getParameter("assignments");
        }
  
        return request;
    }
}