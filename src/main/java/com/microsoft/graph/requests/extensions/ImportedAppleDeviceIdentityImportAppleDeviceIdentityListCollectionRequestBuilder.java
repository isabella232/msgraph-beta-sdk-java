// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ImportedAppleDeviceIdentity;
import com.microsoft.graph.models.extensions.ImportedAppleDeviceIdentityResult;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest;
import com.microsoft.graph.requests.extensions.ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Apple Device Identity Import Apple Device Identity List Collection Request Builder.
 */
public class ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder extends BaseActionRequestBuilder implements IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder {

    /**
     * The request builder for this collection of ImportedAppleDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param importedAppleDeviceIdentities the importedAppleDeviceIdentities
     * @param overwriteImportedDeviceIdentities the overwriteImportedDeviceIdentities
     */
    public ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<ImportedAppleDeviceIdentity> importedAppleDeviceIdentities, final Boolean overwriteImportedDeviceIdentities) {
        super(requestUrl, client, requestOptions);
  	 if(importedAppleDeviceIdentities!=null){
			bodyParams.put("importedAppleDeviceIdentities", importedAppleDeviceIdentities);
		}
    	 if(overwriteImportedDeviceIdentities!=null){
			bodyParams.put("overwriteImportedDeviceIdentities", overwriteImportedDeviceIdentities);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest request = new ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("importedAppleDeviceIdentities")) {
            request.body.importedAppleDeviceIdentities = getParameter("importedAppleDeviceIdentities");
        }
        if (hasParameter("overwriteImportedDeviceIdentities")) {
            request.body.overwriteImportedDeviceIdentities = getParameter("overwriteImportedDeviceIdentities");
        }
  
        return request;
    }
}
