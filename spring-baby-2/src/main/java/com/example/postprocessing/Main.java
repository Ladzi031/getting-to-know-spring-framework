package com.example.postprocessing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskConfiguration.class);
        Task task = applicationContext.getBean(Task.class);
        task.carryOutTask(); //  prints "carrying out task for:  mastering spring boot"
    }
}
