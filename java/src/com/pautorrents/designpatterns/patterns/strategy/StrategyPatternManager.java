package com.pautorrents.designpatterns.patterns.strategy;

import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.IPatternManager;

import java.util.ArrayList;

public class StrategyPatternManager implements IPatternManager {

    private final int ONE_SECOND = 1000;

    private OutputWriter writer = new OutputWriter();

    @Override
    public void execute() {
        System.out.print("Executing strategy pattern");
        writer.printSlow( "... ", ONE_SECOND);
        writer.printSlow("Let's talk about ", 30);
        writer.printSlowLn(" D U C K S ", 100);

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new AlbatrossDuck());
        ducks.add(new SwanDuck());
        ducks.add(new FlamingoDuck());

        for(Duck duck : ducks) {
            writer.printLn("");
            writer.printLn("");
            writer.printLn("Here! Do you see the " + duck.getName() + "?");
            writer.printSlow("...", 400);
            duck.quack();
            writer.printLn("");
            duck.display();
            writer.printLn("");
            duck.fly();
        }

        writer.printLn("");
        writer.printLn("");
    }
}
