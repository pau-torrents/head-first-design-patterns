package com.pautorrents.designpatterns.patterns.observer;

import com.pautorrents.designpatterns.patterns.observer.observer.IObserver;
import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.IPatternManager;
import com.pautorrents.designpatterns.patterns.observer.observable.WeatherStationNotifier;
import com.pautorrents.designpatterns.patterns.observer.observer.LCDDisplay;
import com.pautorrents.designpatterns.patterns.observer.observer.PhoneDisplay;

import java.util.ArrayList;

public class ObserverPatternManager implements IPatternManager {

    OutputWriter writer = new OutputWriter();

    @Override
    public void execute() {
        WeatherStationNotifier station = new WeatherStationNotifier();

        ArrayList<IObserver> displays = new ArrayList<>();

        writer.printSlowLn("Registering Paul's phone...", 10);
        displays.add(new PhoneDisplay("Paul", station));

        writer.printSlowLn("Registering Marks's phone...", 10);
        displays.add(new PhoneDisplay("Mark", station));

        writer.printSlowLn("Registering Mimi's phone...", 10);
        displays.add(new PhoneDisplay("Mimi", station));


        writer.printSlowLn("Registering Door display...", 10);
        displays.add(new LCDDisplay("Door", station));

        writer.printSlowLn("Registering Roof display...", 10);
        displays.add(new LCDDisplay("Roof", station));

        for (IObserver observer : displays) {
            station.add(observer);
        }

        writer.printLn("");
        writer.printSlowLn("Waiting for new weather data...", 100);
        writer.printSlow("...", 1000);
        writer.print(" 34.0");
        writer.printSlowLn("", 1000);

        station.setTemperature(34.0);
        station.notifyUpdate();

        writer.printLn("");
        writer.printSlowLn("Waiting for new weather data...", 100);
        writer.printSlow("...", 1000);
        writer.print(" 35.0");
        writer.printSlowLn("", 1000);

        station.setTemperature(35.0);
        station.notifyUpdate();

        writer.printLn("");
        writer.printSlowLn("Waiting for new weather data...", 100);
        writer.printSlow("...", 1000);
        writer.print(" 34.8");
        writer.printSlowLn("", 1000);

        station.setTemperature(34.8);
        station.notifyUpdate();
    }
}
