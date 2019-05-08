package com.pautorrents.designpatterns.patterns.composite;

import com.pautorrents.designpatterns.patterns.IPatternManager;

public class CompositePatternManager implements IPatternManager {

    @Override
    public void execute() {
        Directory documents = new Directory("Documents");


        Directory music = new Directory("Music");

        File unknownMusic = new File("Unknown.mp3");

        Directory greenDay = new Directory("Green Day");
        File holiday = new File("holiday-GreenDay.mp3");
        File americanIdiot = new File("AmericanIdiot_GreenDay.mp3");

        Directory metallica = new Directory("Metallica");
        File nothingElseMatters = new File("NothingElseMatters.mp3");


        Directory movies = new Directory("Movies");

        File pulpFiction = new File("pulp_fiction.avi");
        File twelveMonkeys = new File("twelve_monkeys.mp4");



        documents.add(music);
        documents.add(movies);

        music.add(greenDay);
        greenDay.add(holiday);
        greenDay.add(americanIdiot);

        music.add(metallica);
        metallica.add(nothingElseMatters);

        music.add(unknownMusic);

        movies.add(pulpFiction);
        movies.add(twelveMonkeys);


        documents.ls();
    }
}
