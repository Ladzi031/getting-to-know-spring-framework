package com.example.javaconfig.base;


public class Address {

    private String street;
    public String getStreet() {
        return street;
    }

    public Address() {
    }

    public Address(String street) {
        this.street = street;
    }



    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }

}
