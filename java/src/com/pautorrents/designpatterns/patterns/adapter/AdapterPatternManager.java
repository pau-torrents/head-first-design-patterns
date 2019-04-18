package com.pautorrents.designpatterns.patterns.adapter;

import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.IPatternManager;

public class AdapterPatternManager implements IPatternManager {

    OutputWriter outputWriter = new OutputWriter();

    @Override
    public void execute() {
        this.outputWriter.printSlowLn("Executing Adapter pattern...", 30);

        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();

        float addResult = calculatorAdapter.add(3f, 4.5f);
        this.outputWriter.printLn("Add (3f + 4.5f): " + addResult);
        this.outputWriter.printSlowLn("", 1000);

        float subResult = calculatorAdapter.subtract(5f, 4.5f);
        this.outputWriter.printLn("Subtract (5f + 4.5f): " + subResult);
        this.outputWriter.printSlowLn("", 1000);
    }
}
