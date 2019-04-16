package com.pautorrents.designpatterns.patterns.factoryMethod.entities;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}
