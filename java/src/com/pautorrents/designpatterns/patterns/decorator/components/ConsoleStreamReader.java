package com.pautorrents.designpatterns.patterns.decorator.components;

import com.pautorrents.designpatterns.helpers.InputReader;
import com.pautorrents.designpatterns.patterns.decorator.StringStreamReader;

public class ConsoleStreamReader extends StringStreamReader {

    InputReader inputReader = new InputReader();

    @Override
    public String read() {
        String answer = inputReader.getAnswer("Please, write the input of the program:");
        return answer;
    }
}
