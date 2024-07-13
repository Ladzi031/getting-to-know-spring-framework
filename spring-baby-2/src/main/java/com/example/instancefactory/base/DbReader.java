package com.example.instancefactory.base;

public class DbReader implements Reader{
    @Override
    public void read() {
        System.out.println("DB_READER  READS");
    }
}
