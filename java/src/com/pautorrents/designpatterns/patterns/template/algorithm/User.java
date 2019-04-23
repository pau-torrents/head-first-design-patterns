package com.pautorrents.designpatterns.patterns.template.algorithm;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class User extends Record {

    private OutputWriter outputWriter = new OutputWriter();

    private String username;

    public User(String username) {
        super();

        this.username = username;
    }

    @Override
    protected boolean validate() {
        return this.username != null;
    }

    @Override
    protected void beforeSave() {
        this.outputWriter.printLn("[LOG] about to save user with username " + this.username + "");
    }

    @Override
    protected void afterSave() {
        this.outputWriter.printLn("[LOG] User with username " + this.username + " successfully saved");
    }
}
