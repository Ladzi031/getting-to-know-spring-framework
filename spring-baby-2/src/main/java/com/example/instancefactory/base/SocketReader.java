package com.example.instancefactory.base;

public class SocketReader implements Reader{
    @Override
    public void read() {
        System.out.println("SOCKET Reader READS");
    }
}
