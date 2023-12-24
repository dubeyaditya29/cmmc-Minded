package com.smmc.usermicroservice.dto;

import com.smmc.usermicroservice.entity.enums.Role;
import com.smmc.usermicroservice.entity.enums.Status;
import com.smmc.usermicroservice.entity.model.Address;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

public class UserDetailsDTO {
    private ObjectId _id;
    private Role role;
    private String email;
    private Status status;
    private String name;
    private Long phone;
    private List<String> services;
    private List<String> languages;
    private List<String> locations;
    private String companyName;
    private String instralink;
    private String websitelink;
    private String about;
    private String profile_pic_url;
    private String public_name;
    private Address address;


    // toString method

    @Override
    public String toString() {
        return "UserDetailsDto{" +
                "userID=" + _id +
                ", role=" + role +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", services=" + services +
                ", languages=" + languages +
                ", locations=" + locations +
                ", companyName='" + companyName + '\'' +
                ", instralink='" + instralink + '\'' +
                ", websitelink='" + websitelink + '\'' +
                ", about='" + about + '\'' +
                ", profile_pic_url='" + profile_pic_url + '\'' +
                ", public_name='" + public_name + '\'' +
                ", address=" + address +
                '}';
    }

    // args constructor
    public UserDetailsDTO() {
        this._id = _id;
        this.role = role;
        this.email = email;
        this.status = status;
        this.name = name;
        this.phone = phone;
        this.services = services;
        this.languages = languages;
        this.locations = locations;
        this.companyName = companyName;
        this.instralink = instralink;
        this.websitelink = websitelink;
        this.about = about;
        this.profile_pic_url = profile_pic_url;
        this.public_name = public_name;
        this.address = address;
    }

    // all getters and setters to retrieve the private variables.

    public ObjectId  getUserID() {
        return _id;
    }

    public void setUserID(ObjectId  _id) {
        this._id = _id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInstralink() {
        return instralink;
    }

    public void setInstralink(String instralink) {
        this.instralink = instralink;
    }

    public String getWebsitelink() {
        return websitelink;
    }

    public void setWebsitelink(String websitelink) {
        this.websitelink = websitelink;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getProfile_pic_url() {
        return profile_pic_url;
    }

    public void setProfile_pic_url(String profile_pic_url) {
        this.profile_pic_url = profile_pic_url;
    }

    public String getPublic_name() {
        return public_name;
    }

    public void setPublic_name(String public_name) {
        this.public_name = public_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
