package com.pautorrents.designpatterns.patterns.observer.observable;

import com.pautorrents.designpatterns.patterns.observer.observer.IObserver;

public interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyUpdate();
}
