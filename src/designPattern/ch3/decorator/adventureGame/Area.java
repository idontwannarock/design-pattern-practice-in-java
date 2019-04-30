package designPattern.ch3.decorator.adventureGame;

import designPattern.ch3.decorator.adventureGame.character.Character;
import designPattern.ch3.decorator.adventureGame.character.Knight;
import designPattern.ch3.decorator.adventureGame.depiction.LongHair;

public class Area {

    public static void main(String[] args) {
        Character knight = new Knight();
        knight.selfIntroduction();
        knight.fight();
        Character longHairedKnight = new LongHair(knight);
        longHairedKnight.selfIntroduction();
        longHairedKnight.fight();
    }
}
