package com.example.lifecyclingbeans;
public class FileContext {
    public void intro()  {
        System.out.println("intro called");
    }
    public void kill() {
        System.out.println("killed called");
    }
    public void readFile() {
        System.out.println("we are able to read from the file buddy!");
    }
    public void writeFile() {
        System.out.println("writing to file");
    }
}
