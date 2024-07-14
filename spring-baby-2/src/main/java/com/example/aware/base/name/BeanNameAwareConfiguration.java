package com.example.aware.base.name;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanNameAwareConfiguration {
    @Bean
    public Person john() {
        return new Person();
    }

    @Bean
    public Person doe() {
        return new Person();
    }
}
