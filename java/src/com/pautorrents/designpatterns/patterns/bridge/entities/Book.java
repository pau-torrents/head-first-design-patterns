package com.pautorrents.designpatterns.patterns.bridge.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book implements IEntity {
    private String title;
    private String author;
    private Date publicationDate;
    private String summary;

    public Book(String title, String author, String publicationDateStr, String summary) {
        this.title = title;
        this.author = author;
        this.summary = summary;

        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
            this.publicationDate = dateFormat.parse(publicationDateStr);
        } catch (Exception ex) {
            this.publicationDate = new Date();
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getSummary() {
        return summary;
    }
}
