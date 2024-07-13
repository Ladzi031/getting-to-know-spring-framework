package com.example.lifecyclingbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class FileContextConfiguration {
    @Bean(initMethod = "intro", destroyMethod = "kill")
    public FileContext fileContext() {
        return new FileContext();
    }
    // this is an alternative to @PostConstruct and @PreDestroy of a bean's lifeCycle
    // the names intro and kill refer to method names inside the fileContext object that are to be called at different lifeCycle of this bean
    // the initMethod and destroyMethod are used when you want the container to call some methods at different lifeCycle of the container, when it is "initialising" or "destroying" beans
}
