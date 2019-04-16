package com.pautorrents.designpatterns.patterns.abstractFactory.entitites.buttons;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class IosButton implements Button {

    private OutputWriter outputWriter = new OutputWriter();

    private String text;

    public IosButton(String text) {
        this.text = text;
    }

    public void display() {
        outputWriter.printSlow("iOS Button:", 300);
        outputWriter.printSlowLn("", 1000);

        int textSize = this.text.length();

        outputWriter.printLn("  ___" + this.fillWithCharacter(textSize, '_') + "___  ");
        outputWriter.printLn(" /   " + this.fillWithCharacter(textSize, ' ') + "   \\ ");
        outputWriter.printLn("(    " + this.text + "    )");
        outputWriter.printLn(" \\__" + this.fillWithCharacter(textSize, '_') + "____/ ");

        outputWriter.printSlowLn("", 1000);
    }

    private String fillWithCharacter(int length, char character) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length; i++) {
            sb.append(character);
        }

        return sb.toString();
    }
}
