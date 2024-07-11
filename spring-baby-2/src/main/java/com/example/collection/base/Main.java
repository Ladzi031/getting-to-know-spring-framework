package com.example.collection.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        ctx.getBean(ProductViewer.class).viewProduct();
    }
}
