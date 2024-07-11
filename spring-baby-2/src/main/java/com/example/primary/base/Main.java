package com.example.primary.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(VehicleConfiguration.class);
        ctx.getBean(Person.class).driveVehicle();
    }
}
