package com.pautorrents.designpatterns.patterns.observer.observable;

import com.pautorrents.designpatterns.patterns.observer.observer.IObserver;

import java.util.HashSet;
import java.util.Set;

public class WeatherStationNotifier implements IObservable {

    private double temperature = 0.0d;
    private Set<IObserver> observers = new HashSet<>();

    @Override
    public void add(IObserver observer) {
        if (!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    public void remove(IObserver observer) {
        if (this.observers.contains(observer)) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyUpdate() {
        for (IObserver observer : this.observers) {
            observer.update();
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return this.temperature;
    }
}
