package com.example.staticfactory.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ReaderConfiguration.class);
        applicationContext.getBean("fileReader", Reader.class).read();
        applicationContext.getBean("dbReader", Reader.class).read();
        applicationContext.getBean("socketReader", Reader.class).read();
    }
}
