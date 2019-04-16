package com.pautorrents.designpatterns.patterns.singleton;

import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.IPatternManager;

public class SingletonPatternManager implements IPatternManager {

    OutputWriter outputWriter = new OutputWriter();

    @Override
    public void execute() {
        this.outputWriter.printSlowLn("Calling singleton for the first time...", 20);

        int id = Singleton.getInstance().getId();
        this.outputWriter.printLn("Id: " + id);

        this.outputWriter.printSlowLn("Calling singleton for the second time...", 20);

        id = Singleton.getInstance().getId();
        this.outputWriter.printLn("Id: " + id);

        this.outputWriter.printSlowLn("See? Same id, means that the constructor is only run once, so just one" +
                " instance of the Singleton :)", 30);
    }
}
