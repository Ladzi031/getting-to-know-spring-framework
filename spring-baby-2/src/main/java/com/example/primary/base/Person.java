package com.example.primary.base;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    @Autowired
    private Vehicle vehicle;

    public void driveVehicle() {
        vehicle.drive();
    }
}
