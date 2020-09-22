// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.RankedEmailAddress;
import com.microsoft.graph.models.extensions.Phone;
import com.microsoft.graph.models.extensions.Location;
import com.microsoft.graph.models.extensions.PersonDataSource;
import com.microsoft.graph.models.extensions.Website;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person.
 */
public class Person extends Entity implements IJsonBackedObject {


    /**
     * The Birthday.
     * The person's birthday.
     */
    @SerializedName("birthday")
    @Expose
    public String birthday;

    /**
     * The Company Name.
     * The name of the person's company.
     */
    @SerializedName("companyName")
    @Expose
    public String companyName;

    /**
     * The Department.
     * The person's department.
     */
    @SerializedName("department")
    @Expose
    public String department;

    /**
     * The Display Name.
     * The person's display name.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Email Addresses.
     * 
     */
    @SerializedName("emailAddresses")
    @Expose
    public java.util.List<RankedEmailAddress> emailAddresses;

    /**
     * The Given Name.
     * The person's given name.
     */
    @SerializedName("givenName")
    @Expose
    public String givenName;

    /**
     * The Is Favorite.
     * true if the user has flagged this person as a favorite.
     */
    @SerializedName("isFavorite")
    @Expose
    public Boolean isFavorite;

    /**
     * The Mailbox Type.
     * 
     */
    @SerializedName("mailboxType")
    @Expose
    public String mailboxType;

    /**
     * The Office Location.
     * The location of the person's office.
     */
    @SerializedName("officeLocation")
    @Expose
    public String officeLocation;

    /**
     * The Person Notes.
     * Free-form notes that the user has taken about this person.
     */
    @SerializedName("personNotes")
    @Expose
    public String personNotes;

    /**
     * The Person Type.
     * The type of person.
     */
    @SerializedName("personType")
    @Expose
    public String personType;

    /**
     * The Phones.
     * The person's phone numbers.
     */
    @SerializedName("phones")
    @Expose
    public java.util.List<Phone> phones;

    /**
     * The Postal Addresses.
     * The person's addresses.
     */
    @SerializedName("postalAddresses")
    @Expose
    public java.util.List<Location> postalAddresses;

    /**
     * The Profession.
     * The person's profession.
     */
    @SerializedName("profession")
    @Expose
    public String profession;

    /**
     * The Sources.
     * 
     */
    @SerializedName("sources")
    @Expose
    public java.util.List<PersonDataSource> sources;

    /**
     * The Surname.
     * The person's surname.
     */
    @SerializedName("surname")
    @Expose
    public String surname;

    /**
     * The Title.
     * 
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the Internet standard RFC 822. By convention, this should map to the person's email name. The general format is alias@domain.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Websites.
     * The person's websites.
     */
    @SerializedName("websites")
    @Expose
    public java.util.List<Website> websites;

    /**
     * The Yomi Company.
     * The phonetic Japanese name of the person's company.
     */
    @SerializedName("yomiCompany")
    @Expose
    public String yomiCompany;


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

    }
}
