package com.example.autowired.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(UsersConfiguration.class);
        ctx.getBean(UserService.class).save();
    }
}
