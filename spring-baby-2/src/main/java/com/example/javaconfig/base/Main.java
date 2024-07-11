package com.example.javaconfig.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // note the new implementing class of the applicationContext
        // AnnotationConfigApplicationContext()
        // let us FIGHT!!!!!

        ApplicationContext ctx = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        System.out.println(ctx.getBean(Product.class).toString());
        System.out.println("addy "+ctx.getBean(Address.class).toString());


    }
}
