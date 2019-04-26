package ch1.strategyPattern.actionGame.character;

import ch1.strategyPattern.actionGame.behavior.SwordBehavior;

public class Knight extends Character {

    @Override
    public void fight() {
        setWeapon(new SwordBehavior());
        weapon.useWeapon();
    }
}
