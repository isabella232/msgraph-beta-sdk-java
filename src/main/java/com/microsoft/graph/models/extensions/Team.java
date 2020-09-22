// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TeamDiscoverySettings;
import com.microsoft.graph.models.extensions.TeamFunSettings;
import com.microsoft.graph.models.extensions.TeamGuestSettings;
import com.microsoft.graph.models.extensions.TeamMemberSettings;
import com.microsoft.graph.models.extensions.TeamMessagingSettings;
import com.microsoft.graph.models.generated.TeamSpecialization;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.models.extensions.Channel;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.TeamsAppInstallation;
import com.microsoft.graph.models.extensions.ConversationMember;
import com.microsoft.graph.models.extensions.TeamsAsyncOperation;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.TeamsTemplate;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ChannelCollectionResponse;
import com.microsoft.graph.requests.extensions.ChannelCollectionPage;
import com.microsoft.graph.requests.extensions.TeamsAppInstallationCollectionResponse;
import com.microsoft.graph.requests.extensions.TeamsAppInstallationCollectionPage;
import com.microsoft.graph.requests.extensions.ConversationMemberCollectionResponse;
import com.microsoft.graph.requests.extensions.ConversationMemberCollectionPage;
import com.microsoft.graph.requests.extensions.TeamsAsyncOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.TeamsAsyncOperationCollectionPage;
import com.microsoft.graph.requests.extensions.UserCollectionResponse;
import com.microsoft.graph.requests.extensions.UserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team.
 */
public class Team extends Entity implements IJsonBackedObject {


    /**
     * The Classification.
     * An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured set in the tenant's directory.
     */
    @SerializedName("classification")
    @Expose
    public String classification;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * An optional description for the team.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Discovery Settings.
     * 
     */
    @SerializedName("discoverySettings")
    @Expose
    public TeamDiscoverySettings discoverySettings;

    /**
     * The Display Name.
     * The name of the team.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Fun Settings.
     * Settings to configure use of Giphy, memes, and stickers in the team.
     */
    @SerializedName("funSettings")
    @Expose
    public TeamFunSettings funSettings;

    /**
     * The Guest Settings.
     * Settings to configure whether guests can create, update, or delete channels in the team.
     */
    @SerializedName("guestSettings")
    @Expose
    public TeamGuestSettings guestSettings;

    /**
     * The Internal Id.
     * A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity API.
     */
    @SerializedName("internalId")
    @Expose
    public String internalId;

    /**
     * The Is Archived.
     * Whether this team is in read-only mode.
     */
    @SerializedName("isArchived")
    @Expose
    public Boolean isArchived;

    /**
     * The Is Membership Limited To Owners.
     * 
     */
    @SerializedName("isMembershipLimitedToOwners")
    @Expose
    public Boolean isMembershipLimitedToOwners;

    /**
     * The Member Settings.
     * Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the team.
     */
    @SerializedName("memberSettings")
    @Expose
    public TeamMemberSettings memberSettings;

    /**
     * The Messaging Settings.
     * Settings to configure messaging and mentions in the team.
     */
    @SerializedName("messagingSettings")
    @Expose
    public TeamMessagingSettings messagingSettings;

    /**
     * The Specialization.
     * Optional. Indicates whether the team is intended for a particular use case.  Each team specialization has access to unique behaviors and experiences targeted to its use case.
     */
    @SerializedName("specialization")
    @Expose
    public TeamSpecialization specialization;

    /**
     * The Visibility.
     * The visibility of the group and team. Defaults to Public.
     */
    @SerializedName("visibility")
    @Expose
    public TeamVisibilityType visibility;

    /**
     * The Web Url.
     * A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not parsed.
     */
    @SerializedName("webUrl")
    @Expose
    public String webUrl;

    /**
     * The Schedule.
     * The schedule of shifts for this team.
     */
    @SerializedName("schedule")
    @Expose
    public Schedule schedule;

    /**
     * The Channels.
     * The collection of channels &amp; messages associated with the team.
     */
    @SerializedName("channels")
    @Expose
    public ChannelCollectionPage channels;

    /**
     * The Group.
     * 
     */
    @SerializedName("group")
    @Expose
    public Group group;

    /**
     * The Installed Apps.
     * The apps installed in this team.
     */
    @SerializedName("installedApps")
    @Expose
    public TeamsAppInstallationCollectionPage installedApps;

    /**
     * The Members.
     * Members and owners of the team.
     */
    @SerializedName("members")
    @Expose
    public ConversationMemberCollectionPage members;

    /**
     * The Operations.
     * The async operations that ran or are running on this team.
     */
    @SerializedName("operations")
    @Expose
    public TeamsAsyncOperationCollectionPage operations;

    /**
     * The Owners.
     * 
     */
    public UserCollectionPage owners;

    /**
     * The Photo.
     * 
     */
    @SerializedName("photo")
    @Expose
    public ProfilePhoto photo;

    /**
     * The Primary Channel.
     * The general channel for the team.
     */
    @SerializedName("primaryChannel")
    @Expose
    public Channel primaryChannel;

    /**
     * The Template.
     * The template this team was created from. See available templates.
     */
    @SerializedName("template")
    @Expose
    public TeamsTemplate template;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("channels")) {
            final ChannelCollectionResponse response = new ChannelCollectionResponse();
            if (json.has("channels@odata.nextLink")) {
                response.nextLink = json.get("channels@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("channels").toString(), JsonObject[].class);
            final Channel[] array = new Channel[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Channel.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            channels = new ChannelCollectionPage(response, null);
        }

        if (json.has("installedApps")) {
            final TeamsAppInstallationCollectionResponse response = new TeamsAppInstallationCollectionResponse();
            if (json.has("installedApps@odata.nextLink")) {
                response.nextLink = json.get("installedApps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("installedApps").toString(), JsonObject[].class);
            final TeamsAppInstallation[] array = new TeamsAppInstallation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TeamsAppInstallation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            installedApps = new TeamsAppInstallationCollectionPage(response, null);
        }

        if (json.has("members")) {
            final ConversationMemberCollectionResponse response = new ConversationMemberCollectionResponse();
            if (json.has("members@odata.nextLink")) {
                response.nextLink = json.get("members@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("members").toString(), JsonObject[].class);
            final ConversationMember[] array = new ConversationMember[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ConversationMember.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            members = new ConversationMemberCollectionPage(response, null);
        }

        if (json.has("operations")) {
            final TeamsAsyncOperationCollectionResponse response = new TeamsAsyncOperationCollectionResponse();
            if (json.has("operations@odata.nextLink")) {
                response.nextLink = json.get("operations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("operations").toString(), JsonObject[].class);
            final TeamsAsyncOperation[] array = new TeamsAsyncOperation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TeamsAsyncOperation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            operations = new TeamsAsyncOperationCollectionPage(response, null);
        }

        if (json.has("owners")) {
            final UserCollectionResponse response = new UserCollectionResponse();
            if (json.has("owners@odata.nextLink")) {
                response.nextLink = json.get("owners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("owners").toString(), JsonObject[].class);
            final User[] array = new User[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), User.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            owners = new UserCollectionPage(response, null);
        }
    }
}
