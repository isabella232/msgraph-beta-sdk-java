// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Synchronization;
import com.microsoft.graph.models.extensions.SynchronizationJob;
import com.microsoft.graph.models.extensions.SynchronizationJobApplicationParameters;
import com.microsoft.graph.models.extensions.StringKeyStringValuePair;
import com.microsoft.graph.models.extensions.SynchronizationJobRestartCriteria;
import com.microsoft.graph.models.extensions.SynchronizationSecretKeyStringValuePair;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISynchronizationJobCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISynchronizationJobRequestBuilder;
import com.microsoft.graph.requests.extensions.ISynchronizationJobCollectionRequest;
import com.microsoft.graph.requests.extensions.ISynchronizationJobValidateCredentialsRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Job Collection Request Builder.
 */
public class SynchronizationJobCollectionRequestBuilder extends BaseRequestBuilder implements ISynchronizationJobCollectionRequestBuilder {

    /**
     * The request builder for this collection of Synchronization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationJobCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISynchronizationJobCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISynchronizationJobCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SynchronizationJobCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISynchronizationJobRequestBuilder byId(final String id) {
        return new SynchronizationJobRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public ISynchronizationJobValidateCredentialsRequestBuilder validateCredentials(final String applicationIdentifier, final String templateId, final Boolean useSavedCredentials, final java.util.List<SynchronizationSecretKeyStringValuePair> credentials) {
        return new SynchronizationJobValidateCredentialsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validateCredentials"), getClient(), null, applicationIdentifier, templateId, useSavedCredentials, credentials);
    }
}
