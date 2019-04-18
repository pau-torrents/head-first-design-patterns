package com.pautorrents.designpatterns.patterns.proxy;

import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.IPatternManager;
import com.pautorrents.designpatterns.patterns.proxy.helpers.Operation;
import com.pautorrents.designpatterns.patterns.proxy.helpers.OperationType;
import com.pautorrents.designpatterns.patterns.proxy.services.Calculator;
import com.pautorrents.designpatterns.patterns.proxy.services.ICalculator;

import java.util.Arrays;
import java.util.List;

public class ProxyPatternManager implements IPatternManager {

    OutputWriter outputWriter = new OutputWriter();

    @Override
    public void execute() {
        List<Operation> operations = Arrays.asList(
                new Operation(4, 4.5, OperationType.Add),
                new Operation(8, 4.5, OperationType.Sub),
                new Operation(-0.5, 0.7, OperationType.Add),
                new Operation(8, 4.5, OperationType.Sub),       // Repeated
                new Operation(1, 3, OperationType.Add),
                new Operation(2, 4.5, OperationType.Sub),
                new Operation(-0.5, 0.7, OperationType.Add),    // Repeated
                new Operation(8, 4.5, OperationType.Sub),       // Repeated
                new Operation(-0.5, 0.7, OperationType.Add)     // Repeated
        );

        this.outputWriter.printSlowLn("Here we have a normal calculator. It is a little bit old, so it takes" +
                " so long to do a simple sum...", 30);
        this.executeOperations(new Calculator(), operations);

        this.outputWriter.print("There you are!! a pretty new calculator, with a cache included!!");
        this.executeOperations(new CalculatorProxy(), operations);
    }

    private void executeOperations(ICalculator iCalculator, List<Operation> operations) {
        this.outputWriter.printSlowLn("Starting calculations...", 30);

        long startTime = System.currentTimeMillis();

        for (Operation operation : operations) {
            this.executeOperation(iCalculator, operation);
        }

        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;

        this.outputWriter.printSlowLn("Finished calculations. It took " + timeElapsed + " ms to calculate everything", 30);
        this.outputWriter.printSlowLn("", 1000);
    }

    private void executeOperation(ICalculator iCalculator, Operation operation) {
        double a = operation.getFirstNumber();
        double b = operation.getSecondNumber();
        OperationType operationType = operation.getOperationType();

        long startTime = System.currentTimeMillis();

        double result;
        if (operationType == OperationType.Add) {
            this.outputWriter.print(a + " + " + b + " = ");
            result = iCalculator.add(a, b);
        } else {
            this.outputWriter.print(a + " - " + b + " = ");
            result = iCalculator.sub(a, b);
        }
        this.outputWriter.print(String.valueOf(result));

        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;

        this.outputWriter.print(" (" + timeElapsed + " ms)");
        this.outputWriter.printSlowLn("", 500);
    }
}
