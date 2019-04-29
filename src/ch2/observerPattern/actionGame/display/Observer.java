package ch2.observerPattern.actionGame.display;

import ch2.observerPattern.actionGame.character.Subject;

public interface Observer {

    void update(Subject subject);

    void subscribe(Subject subject);

    void unsubscribe(Subject subject);
}
