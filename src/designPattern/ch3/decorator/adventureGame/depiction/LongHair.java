package designPattern.ch3.decorator.adventureGame.depiction;

import designPattern.ch3.decorator.adventureGame.character.Character;

public class LongHair extends DipictionDecorator {

    Character character;

    public LongHair(Character character) {
        this.character = character;
    }

    @Override
    public String getDepiction() {
        return this.character.getDepiction() + " with long hair";
    }

    @Override
    public void fight() {
        this.character.fight();
    }
}
