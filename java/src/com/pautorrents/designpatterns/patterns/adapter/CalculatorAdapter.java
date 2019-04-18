package com.pautorrents.designpatterns.patterns.adapter;

import com.pautorrents.designpatterns.patterns.adapter.services.ExistingCalculator;

public class CalculatorAdapter {

    private ExistingCalculator calculator = new ExistingCalculator();

    public float add(float a, float b) {
        return (float) calculator.add((double) a, (double) b);
    }

    public float subtract(float a, float b) {
        return (float) calculator.sub((double) a, (double) b);
    }
}
