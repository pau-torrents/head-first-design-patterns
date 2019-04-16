package com.pautorrents.designpatterns.patterns.abstractFactory.entitites.text;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class AndroidText implements Text {

    private OutputWriter outputWriter = new OutputWriter();

    private String text;

    public AndroidText(String text) {
        this.text = text;
    }

    public void display() {
        // TODO
        this.outputWriter.printLn("AndroidText: " + this.text);
    }
}
