package com.pautorrents.designpatterns.patterns.singleton;

import java.util.concurrent.ThreadLocalRandom;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    private int id;

    private Singleton() {
        this.id = ThreadLocalRandom.current().nextInt(0, 10000);
    }

    public int getId() {
        return this.id;
    }
}
