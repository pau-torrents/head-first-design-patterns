package com.pautorrents.designpatterns.patterns.strategy.quack;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class RoyalQuackingBehaviour implements IQuackBehaviour {

    private OutputWriter writer = new OutputWriter();

    @Override
    public void quack() {
        writer.printSlowLn("QUACK, QUACK, QUACK", 200);
    }
}
