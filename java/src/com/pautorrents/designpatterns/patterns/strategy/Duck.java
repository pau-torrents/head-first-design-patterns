package com.pautorrents.designpatterns.patterns.strategy;

import com.pautorrents.designpatterns.patterns.strategy.display.IDisplayBehaviour;
import com.pautorrents.designpatterns.patterns.strategy.fly.IFlyBehaviour;
import com.pautorrents.designpatterns.patterns.strategy.quack.IQuackBehaviour;

public abstract class Duck {

    private String name;
    private IQuackBehaviour iQuackBehaviour;
    private IFlyBehaviour iFlyBehaviour;
    private IDisplayBehaviour iDisplayBehaviour;

    protected Duck(String name,
                   IQuackBehaviour iQuackBehaviour,
                   IFlyBehaviour iFlyBehaviour,
                   IDisplayBehaviour iDisplayBehaviour) {
        this.name = name;
        this.iQuackBehaviour = iQuackBehaviour;
        this.iFlyBehaviour = iFlyBehaviour;
        this.iDisplayBehaviour = iDisplayBehaviour;
    }

    public String getName() {
        return this.name;
    }

    public void quack() {
        this.iQuackBehaviour.quack();
    }

    public void fly() {
        this.iFlyBehaviour.fly();
    }

    public void display() {
        this.iDisplayBehaviour.display();
    }
}
