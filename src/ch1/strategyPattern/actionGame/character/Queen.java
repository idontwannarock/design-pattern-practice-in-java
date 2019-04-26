package ch1.strategyPattern.actionGame.character;

import ch1.strategyPattern.actionGame.behavior.BowAndArrowBehavior;

public class Queen extends Character {

    @Override
    public void fight() {
        setWeapon(new BowAndArrowBehavior());
        weapon.useWeapon();
    }
}
