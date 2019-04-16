package com.pautorrents.designpatterns.patterns.abstractFactory.entitites.text;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class IosText implements Text {

    private OutputWriter outputWriter = new OutputWriter();

    private String text;

    public IosText(String text) {
        this.text = text;
    }

    public void display() {
        // TODO
        this.outputWriter.printLn("IosText: " + this.text);
    }
}
