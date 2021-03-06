// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetric;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Metric With Reference Request.
 */
public class UserExperienceAnalyticsMetricWithReferenceRequest extends BaseRequest implements IUserExperienceAnalyticsMetricWithReferenceRequest {

    /**
     * The request for the UserExperienceAnalyticsMetric
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsMetricWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsMetric.class);
    }

    public void post(final UserExperienceAnalyticsMetric newUserExperienceAnalyticsMetric, final IJsonBackedObject payload, final ICallback<? super UserExperienceAnalyticsMetric> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public UserExperienceAnalyticsMetric post(final UserExperienceAnalyticsMetric newUserExperienceAnalyticsMetric, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newUserExperienceAnalyticsMetric;
        }
        return null;
    }

    public void get(final ICallback<? super UserExperienceAnalyticsMetric> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public UserExperienceAnalyticsMetric get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super UserExperienceAnalyticsMetric> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final UserExperienceAnalyticsMetric sourceUserExperienceAnalyticsMetric, final ICallback<? super UserExperienceAnalyticsMetric> callback) {
		send(HttpMethod.PATCH, callback, sourceUserExperienceAnalyticsMetric);
	}

	public UserExperienceAnalyticsMetric patch(final UserExperienceAnalyticsMetric sourceUserExperienceAnalyticsMetric) throws ClientException {
		return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsMetric);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IUserExperienceAnalyticsMetricWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserExperienceAnalyticsMetricWithReferenceRequest)this;
    }
}
