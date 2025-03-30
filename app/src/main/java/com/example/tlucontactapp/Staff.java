package com.example.tlucontactapp;

public class Staff {
    private String name, position, phone, email, unit;

    public Staff(String name, String position, String phone, String email, String unit) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.email = email;
        this.unit = unit;
    }

    public String getName() { return name; }
    public String getPosition() { return position; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getUnit() { return unit; }
}