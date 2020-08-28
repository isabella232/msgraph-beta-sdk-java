// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ApiApplication;
import com.microsoft.graph.models.extensions.AppRole;
import com.microsoft.graph.models.extensions.InformationalUrl;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.OptionalClaims;
import com.microsoft.graph.models.extensions.ParentalControlSettings;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.models.extensions.PublicClientApplication;
import com.microsoft.graph.models.extensions.RequiredResourceAccess;
import com.microsoft.graph.models.extensions.WebApplication;
import com.microsoft.graph.models.extensions.OnPremisesPublishing;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.models.extensions.Synchronization;
import com.microsoft.graph.requests.extensions.ExtensionPropertyCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application.
 */
public class Application extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Api.
     * Specifies settings for an application that implements a web API.
     */
    @SerializedName("api")
    @Expose
    public ApiApplication api;

    /**
     * The App Id.
     * The unique identifier for the application that is assigned to an application by Azure AD. Not nullable. Read-only.
     */
    @SerializedName("appId")
    @Expose
    public String appId;

    /**
     * The App Roles.
     * The collection of roles the application declares. With app role assignments, these roles can be assigned to users, groups, or other applications' service principals. Not nullable.
     */
    @SerializedName("appRoles")
    @Expose
    public java.util.List<AppRole> appRoles;

    /**
     * The Created Date Time.
     * The date and time the application was registered. Read-only.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Is Fallback Public Client.
     * Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false which means the fallback application type is confidential client such as web app. There are certain scenarios where Azure AD cannot determine the client application type (e.g. ROPC flow where it is configured without specifying a redirect URI). In those cases Azure AD will interpret the application type based on the value of this property.
     */
    @SerializedName("isFallbackPublicClient")
    @Expose
    public Boolean isFallbackPublicClient;

    /**
     * The Identifier Uris.
     * The URIs that identify the application within its Azure AD tenant, or within a verified custom domain if the application is multi-tenant. For more information see Application Objects and Service Principal Objects. The any operator is required for filter expressions on multi-valued properties. Not nullable.
     */
    @SerializedName("identifierUris")
    @Expose
    public java.util.List<String> identifierUris;

    /**
     * The Display Name.
     * The display name for the application.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Group Membership Claims.
     * Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following valid string values:NoneSecurityGroup: For security groups and Azure AD rolesAll: This will get all of the security groups, distribution groups, and Azure AD directory roles that the signed-in user is a member of
     */
    @SerializedName("groupMembershipClaims")
    @Expose
    public String groupMembershipClaims;

    /**
     * The Info.
     * Basic profile information of the application such as  app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps.
     */
    @SerializedName("info")
    @Expose
    public InformationalUrl info;

    /**
     * The Is Device Only Auth Supported.
     * 
     */
    @SerializedName("isDeviceOnlyAuthSupported")
    @Expose
    public Boolean isDeviceOnlyAuthSupported;

    /**
     * The Key Credentials.
     * The collection of key credentials associated with the application Not nullable.
     */
    @SerializedName("keyCredentials")
    @Expose
    public java.util.List<KeyCredential> keyCredentials;

    /**
     * The Notes.
     * 
     */
    @SerializedName("notes")
    @Expose
    public String notes;

    /**
     * The Optional Claims.
     * Application developers can configure optional claims in their Azure AD apps to specify which claims they want in tokens sent to their application by the Microsoft security token service. See provide optional claims to your Azure AD app for more information.
     */
    @SerializedName("optionalClaims")
    @Expose
    public OptionalClaims optionalClaims;

    /**
     * The Parental Control Settings.
     * Specifies parental control settings for an application.
     */
    @SerializedName("parentalControlSettings")
    @Expose
    public ParentalControlSettings parentalControlSettings;

    /**
     * The Password Credentials.
     * The collection of password credentials associated with the application. Not nullable.
     */
    @SerializedName("passwordCredentials")
    @Expose
    public java.util.List<PasswordCredential> passwordCredentials;

    /**
     * The Public Client.
     * Specifies settings for installed clients such as desktop or mobile devices.
     */
    @SerializedName("publicClient")
    @Expose
    public PublicClientApplication publicClient;

    /**
     * The Publisher Domain.
     * The verified publisher domain for the application. Read-only.
     */
    @SerializedName("publisherDomain")
    @Expose
    public String publisherDomain;

    /**
     * The Required Resource Access.
     * Specifies resources that this application requires access to and the set of OAuth permission scopes and application roles that it needs under each of those resources. This pre-configuration of required resource access drives the consent experience. Not nullable.
     */
    @SerializedName("requiredResourceAccess")
    @Expose
    public java.util.List<RequiredResourceAccess> requiredResourceAccess;

    /**
     * The Sign In Audience.
     * Specifies what Microsoft accounts are supported for the current application. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization’s Azure AD tenant (i.e. single tenant)AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization’s Azure AD tenant (i.e. multi-tenant) AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization’s Azure AD tenant
     */
    @SerializedName("signInAudience")
    @Expose
    public String signInAudience;

    /**
     * The Tags.
     * Custom strings that can be used to categorize and identify the application. Not nullable.
     */
    @SerializedName("tags")
    @Expose
    public java.util.List<String> tags;

    /**
     * The Token Encryption Key Id.
     * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     */
    @SerializedName("tokenEncryptionKeyId")
    @Expose
    public java.util.UUID tokenEncryptionKeyId;

    /**
     * The Unique Name.
     * 
     */
    @SerializedName("uniqueName")
    @Expose
    public String uniqueName;

    /**
     * The Web.
     * Specifies settings for a web application.
     */
    @SerializedName("web")
    @Expose
    public WebApplication web;

    /**
     * The On Premises Publishing.
     * 
     */
    @SerializedName("onPremisesPublishing")
    @Expose
    public OnPremisesPublishing onPremisesPublishing;

    /**
     * The Extension Properties.
     * Read-only. Nullable.
     */
    public ExtensionPropertyCollectionPage extensionProperties;

    /**
     * The Created On Behalf Of.
     * Read-only.
     */
    @SerializedName("createdOnBehalfOf")
    @Expose
    public DirectoryObject createdOnBehalfOf;

    /**
     * The Owners.
     * Directory objects that are owners of the application. The owners are a set of non-admin users who are allowed to modify this object. Requires version 2013-11-08 or newer. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage owners;

    /**
     * The Home Realm Discovery Policies.
     * 
     */
    public HomeRealmDiscoveryPolicyCollectionPage homeRealmDiscoveryPolicies;

    /**
     * The Token Issuance Policies.
     * 
     */
    public TokenIssuancePolicyCollectionPage tokenIssuancePolicies;

    /**
     * The Token Lifetime Policies.
     * 
     */
    public TokenLifetimePolicyCollectionPage tokenLifetimePolicies;

    /**
     * The Connector Group.
     * 
     */
    @SerializedName("connectorGroup")
    @Expose
    public ConnectorGroup connectorGroup;

    /**
     * The Synchronization.
     * 
     */
    @SerializedName("synchronization")
    @Expose
    public Synchronization synchronization;


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


        if (json.has("extensionProperties")) {
            final ExtensionPropertyCollectionResponse response = new ExtensionPropertyCollectionResponse();
            if (json.has("extensionProperties@odata.nextLink")) {
                response.nextLink = json.get("extensionProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensionProperties").toString(), JsonObject[].class);
            final ExtensionProperty[] array = new ExtensionProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ExtensionProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensionProperties = new ExtensionPropertyCollectionPage(response, null);
        }

        if (json.has("owners")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("owners@odata.nextLink")) {
                response.nextLink = json.get("owners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("owners").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            owners = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("homeRealmDiscoveryPolicies")) {
            final HomeRealmDiscoveryPolicyCollectionResponse response = new HomeRealmDiscoveryPolicyCollectionResponse();
            if (json.has("homeRealmDiscoveryPolicies@odata.nextLink")) {
                response.nextLink = json.get("homeRealmDiscoveryPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("homeRealmDiscoveryPolicies").toString(), JsonObject[].class);
            final HomeRealmDiscoveryPolicy[] array = new HomeRealmDiscoveryPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), HomeRealmDiscoveryPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            homeRealmDiscoveryPolicies = new HomeRealmDiscoveryPolicyCollectionPage(response, null);
        }

        if (json.has("tokenIssuancePolicies")) {
            final TokenIssuancePolicyCollectionResponse response = new TokenIssuancePolicyCollectionResponse();
            if (json.has("tokenIssuancePolicies@odata.nextLink")) {
                response.nextLink = json.get("tokenIssuancePolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tokenIssuancePolicies").toString(), JsonObject[].class);
            final TokenIssuancePolicy[] array = new TokenIssuancePolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TokenIssuancePolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tokenIssuancePolicies = new TokenIssuancePolicyCollectionPage(response, null);
        }

        if (json.has("tokenLifetimePolicies")) {
            final TokenLifetimePolicyCollectionResponse response = new TokenLifetimePolicyCollectionResponse();
            if (json.has("tokenLifetimePolicies@odata.nextLink")) {
                response.nextLink = json.get("tokenLifetimePolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tokenLifetimePolicies").toString(), JsonObject[].class);
            final TokenLifetimePolicy[] array = new TokenLifetimePolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TokenLifetimePolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tokenLifetimePolicies = new TokenLifetimePolicyCollectionPage(response, null);
        }
    }
}
