package com.pautorrents.designpatterns.patterns.template.algorithm;

import com.pautorrents.designpatterns.helpers.OutputWriter;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Record {

    private OutputWriter outputWriter = new OutputWriter();

    private int id;

    protected Record() {
        this.id = ThreadLocalRandom.current().nextInt(0, 10000);
    }

    public void save() {
        boolean isValid = this.validate();
        if (isValid) {
            this.beforeSave();
            this.saveToDatabase();
            this.afterSave();
        } else {
            this.failedValidation();
        }
    }

    protected abstract boolean validate();
    protected void beforeSave() {
        this.outputWriter.printLn("[LOG] About to save record with id " + this.id);
    }
    protected void afterSave() {
        this.outputWriter.printLn("[LOG] Record with id " + this.id + " successfully saved");
    }

    protected void failedValidation() {
        this.outputWriter.printLn("[ERROR] Record with id " + this.id + " is not valid");
    }

    private void saveToDatabase() {
        this.outputWriter.printLn("[LOG] Saving record with id = " + this.id + " to database...");
    }
}
