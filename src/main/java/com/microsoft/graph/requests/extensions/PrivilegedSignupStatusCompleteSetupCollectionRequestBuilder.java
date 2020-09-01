// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TenantSetupInfo;
import com.microsoft.graph.models.extensions.RoleSuccessStatistics;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCompleteSetupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCompleteSetupCollectionRequest;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCompleteSetupCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Signup Status Complete Setup Collection Request Builder.
 */
public class PrivilegedSignupStatusCompleteSetupCollectionRequestBuilder extends BaseActionRequestBuilder implements IPrivilegedSignupStatusCompleteSetupCollectionRequestBuilder {

    /**
     * The request builder for this collection of PrivilegedSignupStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param tenantSetupInfo the tenantSetupInfo
     */
    public PrivilegedSignupStatusCompleteSetupCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final TenantSetupInfo tenantSetupInfo) {
        super(requestUrl, client, requestOptions);
  	 if(tenantSetupInfo!=null){
			bodyParams.put("tenantSetupInfo", tenantSetupInfo);
		}
      }

    public IPrivilegedSignupStatusCompleteSetupCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPrivilegedSignupStatusCompleteSetupCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrivilegedSignupStatusCompleteSetupCollectionRequest request = new PrivilegedSignupStatusCompleteSetupCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("tenantSetupInfo")) {
            request.body.tenantSetupInfo = getParameter("tenantSetupInfo");
        }
  
        return request;
    }
}