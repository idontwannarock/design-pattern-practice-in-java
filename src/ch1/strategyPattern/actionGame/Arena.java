package ch1.strategyPattern.actionGame;

import ch1.strategyPattern.actionGame.character.Character;
import ch1.strategyPattern.actionGame.character.King;

public class Arena {

    public static void main(String[] args) {
        Character character = new King();
        character.fight();
    }
}
