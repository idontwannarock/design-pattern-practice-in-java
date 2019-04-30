package designPattern.ch1.strategy.adventureGame.character;

import designPattern.ch1.strategy.adventureGame.behavior.BowAndArrowBehavior;

public class Queen extends Character {

    @Override
    public void fight() {
        setWeapon(new BowAndArrowBehavior());
        weapon.useWeapon();
    }
}
