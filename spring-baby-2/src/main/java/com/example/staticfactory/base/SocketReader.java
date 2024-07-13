package com.example.staticfactory.base;

public class SocketReader implements Reader{
    @Override
    public void read() {
        System.out.println("SOCKET Reader READS");
    }
}
