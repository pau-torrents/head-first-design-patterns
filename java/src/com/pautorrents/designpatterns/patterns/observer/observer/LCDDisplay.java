package com.pautorrents.designpatterns.patterns.observer.observer;

import com.pautorrents.designpatterns.patterns.observer.observable.WeatherStationNotifier;
import com.pautorrents.designpatterns.helpers.OutputWriter;

public class LCDDisplay implements IObserver, IDisplay {

    private String ownerName;
    private WeatherStationNotifier station;
    private OutputWriter writer = new OutputWriter();

    public LCDDisplay(String ownerName, WeatherStationNotifier station) {
        this.ownerName = ownerName;
        this.station = station;
    }

    @Override
    public void display() {
        writer.printLn(this.ownerName + "'s display temperature: " + this.station.getTemperature());
    }

    @Override
    public void update() {
        this.display();
    }
}
