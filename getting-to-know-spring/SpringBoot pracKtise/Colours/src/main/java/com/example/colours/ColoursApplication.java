package com.example.colours;

import com.example.colours.services.ColourPrinter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class ColoursApplication implements CommandLineRunner {

    ColourPrinter colourPrinter;

    public static void main(String[] args) {
        SpringApplication.run(ColoursApplication.class, args);
    }

    public ColoursApplication(ColourPrinter colourPrinter) {
        this.colourPrinter = colourPrinter;
    }

    @Override
    public void run(final String... args) {
        log.info(colourPrinter.print());
    }
}
