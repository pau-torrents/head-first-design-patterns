package com.pautorrents.designpatterns.patterns.template.algorithm;

import com.pautorrents.designpatterns.helpers.OutputWriter;

public class Post extends Record {

    private OutputWriter outputWriter = new OutputWriter();

    private String title;
    private String content;

    public Post(String title, String content) {
        super();

        this.title = title;
        this.content = content;
    }

    @Override
    protected boolean validate() {
        return this.title != null
                && this.content != null;
    }

    @Override
    protected void failedValidation() {
        this.outputWriter.printLn("[ERROR] Failed saving Post to database with the following errors:");

        if (this.title == null) {
            this.outputWriter.printLn("\t- 'title' property cannot be null");
        }

        if (this.content == null) {
            this.outputWriter.printLn("\t- 'content' property cannot be null");
        }
    }
}
