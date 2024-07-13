package com.example.lifecyclingbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FileContextConfiguration.class);
        applicationContext.getBean(FileContext.class).readFile();
        // unable to applaicationContext.close() for some reason...
        // we are unable to see the code in the kill()  method be called because now we can't call close() in the applicationContext object
    }
}
