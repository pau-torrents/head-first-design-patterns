package com.pautorrents.designpatterns.patterns.factoryMethod.entities;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class VillagePerson extends Person {

    private OutputWriter outputWriter = new OutputWriter();

    public VillagePerson(String name) {
        super(name);
    }

    @Override
    public void display() {
        this.outputWriter.printLn("Hi! I'm " + this.getName() + ", a very very very happy village person! :) :( :/");
    }
}
