package designPattern.ch2.observer.adventureGame.display;

import designPattern.ch2.observer.adventureGame.character.Subject;

public interface Observer {

    void update(Subject subject);

    void subscribe(Subject subject);

    void unsubscribe(Subject subject);
}
