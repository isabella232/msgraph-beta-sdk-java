// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InformationProtection;
import com.microsoft.graph.models.extensions.DataLossPreventionPolicy;
import com.microsoft.graph.models.extensions.DlpEvaluationInput;
import com.microsoft.graph.models.extensions.DlpNotification;
import com.microsoft.graph.models.extensions.DlpEvaluatePoliciesJobResponse;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Data Loss Prevention Policy Collection Request.
 */
public interface IDataLossPreventionPolicyCollectionRequest extends IHttpRequest {

    void get(final ICallback<IDataLossPreventionPolicyCollectionPage> callback);

    IDataLossPreventionPolicyCollectionPage get() throws ClientException;

    void post(final DataLossPreventionPolicy newDataLossPreventionPolicy, final ICallback<DataLossPreventionPolicy> callback);

    DataLossPreventionPolicy post(final DataLossPreventionPolicy newDataLossPreventionPolicy) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDataLossPreventionPolicyCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IDataLossPreventionPolicyCollectionRequest filter(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDataLossPreventionPolicyCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDataLossPreventionPolicyCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IDataLossPreventionPolicyCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IDataLossPreventionPolicyCollectionRequest skipToken(String skipToken);
}
