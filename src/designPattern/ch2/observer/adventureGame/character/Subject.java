package designPattern.ch2.observer.adventureGame.character;

import designPattern.ch2.observer.adventureGame.display.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

    void setChanged();
}
