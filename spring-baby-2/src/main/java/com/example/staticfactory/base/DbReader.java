package com.example.staticfactory.base;

public class DbReader implements Reader {


    @Override
    public void read() {
        System.out.println("DATABASE reader READS");
    }
}
