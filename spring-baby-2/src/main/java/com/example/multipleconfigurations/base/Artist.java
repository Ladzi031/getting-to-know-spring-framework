package com.example.multipleconfigurations.base;

import org.springframework.beans.factory.annotation.Autowired;

public class Artist {
    private String name;

    private Instrument instrument;

    public Artist(String name, Instrument instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", instrument=" + instrument.getInstrumentName() +
                '}';
    }
}
