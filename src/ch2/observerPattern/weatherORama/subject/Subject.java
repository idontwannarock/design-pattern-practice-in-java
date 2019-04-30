package ch2.observerPattern.weatherORama.subject;

import ch2.observerPattern.weatherORama.observer.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
