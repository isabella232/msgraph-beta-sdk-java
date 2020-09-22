// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.DowngradeJustification;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IInformationProtectionLabelEvaluateRemovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInformationProtectionLabelEvaluateRemovalCollectionRequest;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelEvaluateRemovalCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Evaluate Removal Collection Request Builder.
 */
public class InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder extends BaseActionRequestBuilder implements IInformationProtectionLabelEvaluateRemovalCollectionRequestBuilder {

    /**
     * The request builder for this collection of InformationProtectionLabel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param contentInfo the contentInfo
     * @param downgradeJustification the downgradeJustification
     */
    public InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final ContentInfo contentInfo, final DowngradeJustification downgradeJustification) {
        super(requestUrl, client, requestOptions);
  	 if(contentInfo!=null){
			bodyParams.put("contentInfo", contentInfo);
		}
    	 if(downgradeJustification!=null){
			bodyParams.put("downgradeJustification", downgradeJustification);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IInformationProtectionLabelEvaluateRemovalCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IInformationProtectionLabelEvaluateRemovalCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        InformationProtectionLabelEvaluateRemovalCollectionRequest request = new InformationProtectionLabelEvaluateRemovalCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("contentInfo")) {
            request.body.contentInfo = getParameter("contentInfo");
        }
        if (hasParameter("downgradeJustification")) {
            request.body.downgradeJustification = getParameter("downgradeJustification");
        }
  
        return request;
    }
}
