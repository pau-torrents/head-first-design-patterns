package com.pautorrents.designpatterns.patterns.proxy.helpers;

public class Operation {

    private double firstNumber;
    private double secondNumber;

    private OperationType operationType;

    public Operation(double firstNumber, double secondNumber, OperationType operationType) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operationType = operationType;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public OperationType getOperationType() {
        return operationType;
    }
}
