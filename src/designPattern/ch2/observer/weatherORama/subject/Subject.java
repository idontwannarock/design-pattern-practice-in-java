package designPattern.ch2.observer.weatherORama.subject;

import designPattern.ch2.observer.weatherORama.observer.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
