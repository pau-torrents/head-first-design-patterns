package com.pautorrents.designpatterns.patterns.strategy;

import com.pautorrents.designpatterns.patterns.strategy.display.SwanDisplayingBehaviour;
import com.pautorrents.designpatterns.patterns.strategy.fly.WaterKindOfFlyingBehaviour;
import com.pautorrents.designpatterns.patterns.strategy.quack.RoyalQuackingBehaviour;

public class SwanDuck extends Duck {
    protected SwanDuck() {
        super("Swan",
                new RoyalQuackingBehaviour(),
                new WaterKindOfFlyingBehaviour(),
                new SwanDisplayingBehaviour());
    }
}
