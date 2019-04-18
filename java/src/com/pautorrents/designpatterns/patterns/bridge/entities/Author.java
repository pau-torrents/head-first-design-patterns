package com.pautorrents.designpatterns.patterns.bridge.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Author implements IEntity {
    private String name;
    private Date dateOfBirth;
    private String biography;

    public Author(String name, String dateOfBirthStr, String biography) {
        this.name = name;
        this.biography = biography;

        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
            this.dateOfBirth = dateFormat.parse(dateOfBirthStr);
        } catch (Exception ex) {
            this.dateOfBirth = new Date();
        }
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBiography() {
        return biography;
    }
}
