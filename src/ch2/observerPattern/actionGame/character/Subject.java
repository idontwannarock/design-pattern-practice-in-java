package ch2.observerPattern.actionGame.character;

import ch2.observerPattern.actionGame.display.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

    void setChanged();
}
