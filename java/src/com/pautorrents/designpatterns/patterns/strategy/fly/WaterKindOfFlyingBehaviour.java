package com.pautorrents.designpatterns.patterns.strategy.fly;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class WaterKindOfFlyingBehaviour implements IFlyBehaviour {

    OutputWriter writer = new OutputWriter();

    @Override
    public void fly() {
        writer.printSlowLn("\"And it tried to fly away... But no luck, so it wen't swimming!\"", 100);
    }
}
