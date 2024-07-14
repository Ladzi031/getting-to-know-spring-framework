package com.example.profilesbaby;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Test")
public class TestDatabaseConfiguration implements DatabaseConfiguration{
    @Override
    public void doSetup() {
        System.out.println("|TEST| database configuration is done!");
    }
}
