package com.example.profilesbaby;

import org.springframework.beans.factory.annotation.Autowired;

public class DatabaseConfigurationHandler {
    @Autowired
    private DatabaseConfiguration databaseConfiguration;

    public void print() {
        databaseConfiguration.doSetup();
    }
}
