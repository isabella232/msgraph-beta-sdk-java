// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Assignment Collection Request.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequest extends BaseCollectionRequest<WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse, IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage> implements IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequest {

    /**
     * The request builder for this collection of WindowsDefenderApplicationControlSupplementalPolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse.class, IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage.class);
    }

    public void get(final ICallback<IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage get() throws ClientException {
        final WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WindowsDefenderApplicationControlSupplementalPolicyAssignment newWindowsDefenderApplicationControlSupplementalPolicyAssignment, final ICallback<WindowsDefenderApplicationControlSupplementalPolicyAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsDefenderApplicationControlSupplementalPolicyAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsDefenderApplicationControlSupplementalPolicyAssignment, callback);
    }

    public WindowsDefenderApplicationControlSupplementalPolicyAssignment post(final WindowsDefenderApplicationControlSupplementalPolicyAssignment newWindowsDefenderApplicationControlSupplementalPolicyAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsDefenderApplicationControlSupplementalPolicyAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsDefenderApplicationControlSupplementalPolicyAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequest)this;
    }

    public IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage buildFromResponse(final WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse response) {
        final IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage page = new WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
