package designPattern.ch1.strategy.adventureGame;

import designPattern.ch1.strategy.adventureGame.character.Character;
import designPattern.ch1.strategy.adventureGame.character.King;

public class Area {

    public static void main(String[] args) {
        Character character = new King();
        character.fight();
    }
}
