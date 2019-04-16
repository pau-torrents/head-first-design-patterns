package com.pautorrents.designpatterns.patterns.abstractFactory.entitites.buttons;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class AndroidButton implements Button {

    private OutputWriter outputWriter = new OutputWriter();

    private String text;

    public AndroidButton(String text) {
        this.text = text;
    }

    public void display() {
        outputWriter.printSlow("Android Button:", 300);
        outputWriter.printSlowLn("", 1000);

        int textSize = this.text.length();

        outputWriter.printLn(" ____" + this.fillWithCharacter(textSize, '_') + "_____");
        outputWriter.printLn("|    " + this.fillWithCharacter(textSize, ' ') + "     |");
        outputWriter.printLn("|    " + this.text + "     |");
        outputWriter.printLn("|____" + this.fillWithCharacter(textSize, '_') + "_____|");

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
