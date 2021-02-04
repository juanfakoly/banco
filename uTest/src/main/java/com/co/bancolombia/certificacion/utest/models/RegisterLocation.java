package com.co.bancolombia.certificacion.utest.models;

public class RegisterLocation {

    private String city;
    private String zip;
    private String country;

    public RegisterLocation(String city, String zip, String country) {
        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
