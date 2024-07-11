package com.example.multipleconfigurations.base;

public class Instrument {
    private String instrumentName;

    public Instrument(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public Instrument(){}

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentName='" + instrumentName + '\'' +
                '}';
    }
}
