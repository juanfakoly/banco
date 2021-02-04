package com.co.bancolombia.certificacion.utest.models;

public class RegisterDevices {

    private String brand;
    private String devices;
    private String os;
    private String password;

    public RegisterDevices(String brand, String devices, String os, String password) {
        this.brand = brand;
        this.devices = devices;
        this.os = os;
        this.password = password;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDevices() {
        return devices;
    }

    public void setDevices(String devices) {
        this.devices = devices;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
