package com.pautorrents.designpatterns.patterns.strategy.quack;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class LittleQuackingBehaviour implements IQuackBehaviour {

    private OutputWriter writer = new OutputWriter();

    @Override
    public void quack() {
        writer.printSlow("Quack", 20);
        writer.printSlow(",", 200);
        writer.printSlow("Quack, Quack", 200);
    }
}
