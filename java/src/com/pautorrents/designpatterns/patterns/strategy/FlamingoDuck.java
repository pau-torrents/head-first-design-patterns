package com.pautorrents.designpatterns.patterns.strategy;

import com.pautorrents.designpatterns.patterns.strategy.display.FlamingoDisplayingBehaviour;
import com.pautorrents.designpatterns.patterns.strategy.fly.WaterKindOfFlyingBehaviour;
import com.pautorrents.designpatterns.patterns.strategy.quack.LittleQuackingBehaviour;

public class FlamingoDuck extends Duck {
    protected FlamingoDuck() {
        super("Flamingo",
                new LittleQuackingBehaviour(),
                new WaterKindOfFlyingBehaviour(),
                new FlamingoDisplayingBehaviour());
    }
}
