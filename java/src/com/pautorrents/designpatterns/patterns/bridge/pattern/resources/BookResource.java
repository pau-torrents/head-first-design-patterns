package com.pautorrents.designpatterns.patterns.bridge.pattern.resources;

import com.pautorrents.designpatterns.patterns.bridge.entities.Book;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookResource implements IMediaResource {

    private Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String getTitle() {
        return this.book.getTitle();
    }

    @Override
    public String getSubtitle() {
        Date publicationDate = this.book.getPublicationDate();
        DateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
        String publicationDateFormatted = dateFormat.format(publicationDate);

        return this.book.getAuthor() + " | " + publicationDateFormatted;
    }

    @Override
    public String getSnippet() {
        return this.book.getSummary();
    }
}
