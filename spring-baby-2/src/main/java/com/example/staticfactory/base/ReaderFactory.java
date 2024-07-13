package com.example.staticfactory.base;

public class ReaderFactory {
    public static Reader getReader(ReaderType readerType) {
        switch (readerType) {
            case FILE_READER:
                return new FileReader();
            case DATABASE_READER:
                return new DbReader();
            case SOCKET_READER:
                return new SocketReader();
            default:
                throw new IllegalArgumentException("invalid reader type");
        }
    }
}
