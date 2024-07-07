package com.example.colours.services.impl;

import com.example.colours.services.BluePrinter;
import com.example.colours.services.ColourPrinter;
import com.example.colours.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {
    private final BluePrinter bluePrinter;
    private final RedPrinter redPrinter;

    public ColourPrinterImpl(BluePrinter bluePrinter, RedPrinter redPrinter) {
         this.bluePrinter = bluePrinter;
        this.redPrinter = redPrinter;
    }

    @Override
    public String print() {

        return bluePrinter.run() + "======"+ redPrinter.run();
    }
}
