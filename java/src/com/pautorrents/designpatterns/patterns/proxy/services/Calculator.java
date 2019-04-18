package com.pautorrents.designpatterns.patterns.proxy.services;

public class Calculator implements ICalculator {

    @Override
    public double add(double a, double b) {
        this.sleep();
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        this.sleep();
        return a - b;
    }

    private void sleep() {
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            // ignore
        }
    }
}
