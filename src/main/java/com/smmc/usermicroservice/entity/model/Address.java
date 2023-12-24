package com.smmc.usermicroservice.entity.model;

public class Address {

    // variables in use

    private String street;
    private String city;
    private String pincode;
    private String country;

    // toString method

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    // getters and setters to set and retrieve the private variables.

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // args constructor

    public Address(String street, String city, String pincode, String country) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
        this.country = country;
    }

}
