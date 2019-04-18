package com.pautorrents.designpatterns.patterns.bridge.pattern.resources;

import com.pautorrents.designpatterns.patterns.bridge.entities.Author;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AuthorResource implements IMediaResource {

    private Author author;

    public AuthorResource(Author author) {
        this.author = author;
    }

    @Override
    public String getTitle() {
        return this.author.getName();
    }

    @Override
    public String getSubtitle() {
        Date dateOfBirth = this.author.getDateOfBirth();
        DateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
        return dateFormat.format(dateOfBirth);
    }

    @Override
    public String getSnippet() {
        return this.author.getBiography();
    }
}
