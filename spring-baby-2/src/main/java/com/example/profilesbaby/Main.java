package com.example.profilesbaby;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        new AnnotationConfigApplicationContext().getEnvironment();
        applicationContext.getBean("databaseConfigurationHandler", DatabaseConfigurationHandler.class).print();
    }
}
// incomplete, this profiles don't work on my machine properly for some reason man :(