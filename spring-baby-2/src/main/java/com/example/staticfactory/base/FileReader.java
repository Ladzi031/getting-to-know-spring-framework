package com.example.staticfactory.base;

public class FileReader implements  Reader{
    @Override
    public void read() {
        System.out.println("FILE reader READS");
    }
}
