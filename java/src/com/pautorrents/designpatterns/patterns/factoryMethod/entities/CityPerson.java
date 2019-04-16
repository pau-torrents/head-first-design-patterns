package com.pautorrents.designpatterns.patterns.factoryMethod.entities;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class CityPerson extends Person {

    private OutputWriter outputWriter = new OutputWriter();

    public CityPerson(String name) {
        super(name);
    }

    @Override
    public void display() {
        this.outputWriter.printLn("Hi! I'm " + this.getName() + ", from the city, and I don't like bugs :(");
    }
}
