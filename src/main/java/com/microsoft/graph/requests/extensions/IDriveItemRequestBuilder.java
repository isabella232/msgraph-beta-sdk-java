// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.models.extensions.ItemPreviewInfo;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.IItemActivityOLDCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemActivityOLDRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Drive Item Request Builder.
 */
public interface IDriveItemRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDriveItemRequest instance
     */
    IDriveItemRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDriveItemRequest instance
     */
    IDriveItemRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    /**
     * Gets the item request builder for the specified item path
     * @param path The path to the item
     * @return The request builder for the specified item
     */
    IDriveItemRequestBuilder itemWithPath(final String path);

    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    IUserWithReferenceRequestBuilder createdByUser();

    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    IUserWithReferenceRequestBuilder lastModifiedByUser();

    /**
     * Gets the request builder for Workbook
     *
     * @return the IWorkbookRequestBuilder instance
     */
    IWorkbookRequestBuilder workbook();

    IItemActivityOLDCollectionRequestBuilder activities();

    IItemActivityOLDRequestBuilder activities(final String id);

    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the IItemAnalyticsWithReferenceRequestBuilder instance
     */
    IItemAnalyticsWithReferenceRequestBuilder analytics();

    IDriveItemCollectionRequestBuilder children();

    IDriveItemRequestBuilder children(final String id);

    /**
     * Gets the request builder for ListItem
     *
     * @return the IListItemRequestBuilder instance
     */
    IListItemRequestBuilder listItem();

    IPermissionCollectionRequestBuilder permissions();

    IPermissionRequestBuilder permissions(final String id);

    ISubscriptionCollectionRequestBuilder subscriptions();

    ISubscriptionRequestBuilder subscriptions(final String id);

    IThumbnailSetCollectionRequestBuilder thumbnails();

    IThumbnailSetRequestBuilder thumbnails(final String id);

    IDriveItemVersionCollectionRequestBuilder versions();

    IDriveItemVersionRequestBuilder versions(final String id);

    IDriveItemContentStreamRequestBuilder content();
    IDriveItemRestoreRequestBuilder restore(final ItemReference parentReference, final String name);
    IDriveItemCopyRequestBuilder copy(final String name, final ItemReference parentReference);
    IDriveItemCreateUploadSessionRequestBuilder createUploadSession(final DriveItemUploadableProperties item);
    IDriveItemCheckinRequestBuilder checkin(final String checkInAs, final String comment);
    IDriveItemCheckoutRequestBuilder checkout();
    IDriveItemCreateLinkRequestBuilder createLink(final String type, final String scope, final java.util.Calendar expirationDateTime, final String password, final String message, final java.util.List<DriveRecipient> recipients);
    IDriveItemFollowRequestBuilder follow();

    IDriveItemInviteCollectionRequestBuilder invite(final Boolean requireSignIn, final java.util.List<String> roles, final Boolean sendInvitation, final String message, final java.util.List<DriveRecipient> recipients, final String expirationDateTime, final String password);
    IDriveItemPreviewRequestBuilder preview(final String viewer, final Boolean chromeless, final Boolean allowEdit, final String page, final Double zoom);
    IDriveItemUnfollowRequestBuilder unfollow();
    IDriveItemValidatePermissionRequestBuilder validatePermission(final String challengeToken, final String password);

    IDriveItemDeltaCollectionRequestBuilder delta();

    IDriveItemDeltaCollectionRequestBuilder delta(final String token);

    IDriveItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval(final String startDateTime, final String endDateTime, final String interval);

    IDriveItemSearchCollectionRequestBuilder search(final String q);

}