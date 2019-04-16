package com.pautorrents.designpatterns.patterns.strategy;

import com.pautorrents.designpatterns.patterns.strategy.display.AlbatrossDisplayingBehaviour;
import com.pautorrents.designpatterns.patterns.strategy.fly.CloudFlyingBehaviour;
import com.pautorrents.designpatterns.patterns.strategy.quack.RoyalQuackingBehaviour;

public class AlbatrossDuck extends Duck {
    protected AlbatrossDuck() {
        super("Albatross",
                new RoyalQuackingBehaviour(),
                new CloudFlyingBehaviour(),
                new AlbatrossDisplayingBehaviour());
    }
}
