package com.pautorrents.designpatterns.patterns.template;

import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.IPatternManager;
import com.pautorrents.designpatterns.patterns.template.algorithm.Post;
import com.pautorrents.designpatterns.patterns.template.algorithm.User;

public class TemplatePatternManager implements IPatternManager {

    private OutputWriter outputWriter = new OutputWriter();

    @Override
    public void execute() {
        this.outputWriter.printLn("VALID USER\n");
        User validUser = new User("pau-valid");
        validUser.save();

        this.outputWriter.printLn("");
        this.outputWriter.printLn("");

        this.outputWriter.printLn("INVALID USER\n");
        User invalidUser = new User(null);
        invalidUser.save();

        this.outputWriter.printLn("");
        this.outputWriter.printLn("");
        this.outputWriter.printLn("");

        this.outputWriter.printLn("VALID POST\n");
        Post validPost = new Post("Valid title", "Lorem ipsum dolor sit amet.");
        validPost.save();

        this.outputWriter.printLn("");
        this.outputWriter.printLn("");

        this.outputWriter.printLn("INVALID POST WITH INVALID TITLE\n");
        Post invalidPostWithInvalidTitle = new Post(null, "Lorem ipsum dolor sit amet.");
        invalidPostWithInvalidTitle.save();

        this.outputWriter.printLn("");
        this.outputWriter.printLn("");

        this.outputWriter.printLn("INVALID POST WITH INVALID CONTENT\n");
        Post invalidPostWithInvalidContent = new Post("Invalid post", null);
        invalidPostWithInvalidContent.save();

        this.outputWriter.printLn("");
        this.outputWriter.printLn("");

        this.outputWriter.printLn("INVALID POST WITH INVALID TITLE AND CONTENT\n");
        Post invalidPostWithInvalidTitleAndContent = new Post(null, null);
        invalidPostWithInvalidTitleAndContent.save();

        this.outputWriter.printLn("");
        this.outputWriter.printLn("");
    }
}
