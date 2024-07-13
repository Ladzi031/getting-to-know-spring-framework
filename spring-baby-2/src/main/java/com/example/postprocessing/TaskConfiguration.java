package com.example.postprocessing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.postprocessing")
public class TaskConfiguration {
    @Bean(initMethod = "init")
    public Task task() {
        return new Task();
    }
}
