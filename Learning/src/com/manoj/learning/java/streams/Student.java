package com.manoj.learning.java.streams;

import java.util.List;

class Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Studentssss{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address.toString() +
                ", mobileNumbers=" + mobileNumbers.toString() +
                '}';
    }

    public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    private Address address;
    private List<MobileNumber> mobileNumbers;
}
