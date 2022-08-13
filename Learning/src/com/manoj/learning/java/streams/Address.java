package com.manoj.learning.java.streams;

public class Address {
    private String zipcode;

    public String getZipcode() {
        return zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipcode='" + zipcode + '\'' +
                '}';
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Address(String zipcode) {
        this.zipcode = zipcode;
    }
}
