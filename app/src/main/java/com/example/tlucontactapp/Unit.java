package com.example.tlucontactapp;

public class Unit {
    private String name, phone, address;

    public Unit(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
}
