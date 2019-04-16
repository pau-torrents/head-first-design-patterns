package com.pautorrents.designpatterns.patterns.strategy.fly;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class CloudFlyingBehaviour implements IFlyBehaviour {

    private OutputWriter writer = new OutputWriter();

    @Override
    public void fly() {
        writer.printSlowLn("\"And it flied away, crossing through the clouds...\"", 100);
    }
}
