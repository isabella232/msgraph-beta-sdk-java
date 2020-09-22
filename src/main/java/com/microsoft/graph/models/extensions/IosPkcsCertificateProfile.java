// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CertificateStore;
import com.microsoft.graph.models.extensions.CustomSubjectAlternativeName;
import com.microsoft.graph.models.extensions.ManagedDeviceCertificateState;
import com.microsoft.graph.models.extensions.IosCertificateProfileBase;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Pkcs Certificate Profile.
 */
public class IosPkcsCertificateProfile extends IosCertificateProfileBase implements IJsonBackedObject {


    /**
     * The Certificate Store.
     * Target store certificate
     */
    @SerializedName("certificateStore")
    @Expose
    public CertificateStore certificateStore;

    /**
     * The Certificate Template Name.
     * PKCS Certificate Template Name.
     */
    @SerializedName("certificateTemplateName")
    @Expose
    public String certificateTemplateName;

    /**
     * The Certification Authority.
     * PKCS Certification Authority.
     */
    @SerializedName("certificationAuthority")
    @Expose
    public String certificationAuthority;

    /**
     * The Certification Authority Name.
     * PKCS Certification Authority Name.
     */
    @SerializedName("certificationAuthorityName")
    @Expose
    public String certificationAuthorityName;

    /**
     * The Custom Subject Alternative Names.
     * Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("customSubjectAlternativeNames")
    @Expose
    public java.util.List<CustomSubjectAlternativeName> customSubjectAlternativeNames;

    /**
     * The Subject Alternative Name Format String.
     * Custom String that defines the AAD Attribute.
     */
    @SerializedName("subjectAlternativeNameFormatString")
    @Expose
    public String subjectAlternativeNameFormatString;

    /**
     * The Subject Name Format String.
     * Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     */
    @SerializedName("subjectNameFormatString")
    @Expose
    public String subjectNameFormatString;

    /**
     * The Managed Device Certificate States.
     * Certificate state for devices
     */
    @SerializedName("managedDeviceCertificateStates")
    @Expose
    public ManagedDeviceCertificateStateCollectionPage managedDeviceCertificateStates;


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


        if (json.has("managedDeviceCertificateStates")) {
            final ManagedDeviceCertificateStateCollectionResponse response = new ManagedDeviceCertificateStateCollectionResponse();
            if (json.has("managedDeviceCertificateStates@odata.nextLink")) {
                response.nextLink = json.get("managedDeviceCertificateStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedDeviceCertificateStates").toString(), JsonObject[].class);
            final ManagedDeviceCertificateState[] array = new ManagedDeviceCertificateState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDeviceCertificateState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedDeviceCertificateStates = new ManagedDeviceCertificateStateCollectionPage(response, null);
        }
    }
}
