package com.pautorrents.designpatterns.patterns.decorator;

import com.pautorrents.designpatterns.patterns.decorator.components.FileStreamReader;
import com.pautorrents.designpatterns.helpers.InputReader;
import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.helpers.Pair;
import com.pautorrents.designpatterns.patterns.IPatternManager;
import com.pautorrents.designpatterns.patterns.decorator.components.ConsoleStreamReader;
import com.pautorrents.designpatterns.patterns.decorator.decorators.Base64StreamReader;
import com.pautorrents.designpatterns.patterns.decorator.decorators.ReverseStreamReader;

import java.util.ArrayList;

public class DecoratorPatternManager implements IPatternManager {

    private InputReader inputReader = new InputReader();
    private OutputWriter outputWriter = new OutputWriter();

    @Override
    public void execute() {
        ArrayList<Pair<String, Object>> options = this.getOptions();
        StringStreamReader streamReader =
                (StringStreamReader) this.inputReader.getOption("How are you going to introduce the input?",
                        options);

        StringStreamReader finalReader = new ReverseStreamReader(new Base64StreamReader(streamReader));

        String fileContent;

        try {
            fileContent = finalReader.read();
        } catch (Exception ex) {
            fileContent = null;
        }

        this.outputWriter.printLn("File content:");
        this.outputWriter.printLn("");
        this.outputWriter.printLn(fileContent);
    }

    private ArrayList<Pair<String, Object>> getOptions() {
        ArrayList<Pair<String, Object>> result = new ArrayList<>();

        result.add(new Pair<>("file", new FileStreamReader()));
        result.add(new Pair<>("console", new ConsoleStreamReader()));

        return result;
    }
}
