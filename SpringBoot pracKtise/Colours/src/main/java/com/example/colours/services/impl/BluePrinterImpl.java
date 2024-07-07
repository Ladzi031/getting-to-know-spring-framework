package com.example.colours.services.impl;

import com.example.colours.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class BluePrinterImpl implements BluePrinter {

    @Override
    public String run() {
        return "Blue Printer here!";
    }
}
