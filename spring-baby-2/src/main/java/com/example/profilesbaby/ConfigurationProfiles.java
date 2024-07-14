package com.example.profilesbaby;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.profilesbaby")
public class ConfigurationProfiles {

    @Bean
    public DatabaseConfigurationHandler databaseConfigurationHandler() {
        return new DatabaseConfigurationHandler();
    }
}
