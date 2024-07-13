package com.example.multipleconfigurations.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
        System.out.println(ctx.getBean(Artist.class).toString());
    }

    // the @Value can be used to join beans declared in a two different configuration files
    //   also note that AnnotationConfigApplicationApplicationContext takes varArgs...
}
