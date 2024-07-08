package com.example.colours.services.impl;

import com.example.colours.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class RedPrinterImpl implements RedPrinter {

    @Override
    public String run() {
        return "Red Printer here!";
    }
}
