package com.example.instancefactory.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ReaderConfiguration {

    @Bean
    public ReaderFactory reader() {
        Map<ReaderType, Reader> readers = new LinkedHashMap<>();
        readers.put(ReaderType.FILE_READER, new FileReader());
        readers.put(ReaderType.DB_READER, new DbReader());
        readers.put(ReaderType.SOCKET_READER, new SocketReader());
        ReaderFactory readerFactory = new ReaderFactory();
        readerFactory.setReaders(readers);
        return readerFactory;
    }
    @Bean
    public Reader fileReader() {
        return reader().createReader(ReaderType.FILE_READER);
    }
}
