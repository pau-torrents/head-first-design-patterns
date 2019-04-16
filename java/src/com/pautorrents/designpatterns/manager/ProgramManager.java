package com.pautorrents.designpatterns.manager;

import com.pautorrents.designpatterns.patterns.abstractFactory.AbstractFactoryPatternManager;
import com.pautorrents.designpatterns.patterns.decorator.DecoratorPatternManager;
import com.pautorrents.designpatterns.patterns.observer.ObserverPatternManager;
import com.pautorrents.designpatterns.patterns.strategy.StrategyPatternManager;
import com.pautorrents.designpatterns.helpers.InputReader;
import com.pautorrents.designpatterns.helpers.Pair;
import com.pautorrents.designpatterns.patterns.IPatternManager;
import com.pautorrents.designpatterns.patterns.factoryMethod.FactoryMethodPatternManager;

import java.util.ArrayList;

public class ProgramManager {

    private InputReader inputReader;

    public ProgramManager() {
        this.inputReader = new InputReader();
    }

    public void execute() {
        ArrayList<Pair<String, Object>> options = this.getOptions();
        IPatternManager patternManager;

        do {
            Object option = this.inputReader.getOption("Select which pattern do you want to execute (or empty to exit):", options);
            patternManager = (option instanceof IPatternManager ? (IPatternManager) option : null);
            if (patternManager != null) {
                patternManager.execute();
            }
        } while (patternManager != null);

        System.out.println("Exiting program...");
        System.out.println();
        System.out.println("     _____  ___    ___  ______      ");
        System.out.println("    /  _  \\ \\  \\  /  / /  ___/   ");
        System.out.println("   /  //  /  \\  \\/  / /  /_       ");
        System.out.println("  /   __  \\   \\_   / /  __/       ");
        System.out.println(" /  /__/  /    /  / /  /___         ");
        System.out.println("/________/    /__/ /______/         ");
    }

    private ArrayList<Pair<String, Object>> getOptions() {
        ArrayList<Pair<String, Object>> result = new ArrayList<>();

        result.add(new Pair<>("strategy", new StrategyPatternManager()));
        result.add(new Pair<>("observer", new ObserverPatternManager()));
        result.add(new Pair<>("decorator", new DecoratorPatternManager()));
        result.add(new Pair<>("factory-method", new FactoryMethodPatternManager()));
        result.add(new Pair<>("abstract-factory", new AbstractFactoryPatternManager()));

        return result;
    }
}
