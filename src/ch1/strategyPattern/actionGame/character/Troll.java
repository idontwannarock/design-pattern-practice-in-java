package ch1.strategyPattern.actionGame.character;

import ch1.strategyPattern.actionGame.behavior.KnifeBehavior;

public class Troll extends Character {

    @Override
    public void fight() {
        setWeapon(new KnifeBehavior());
        weapon.useWeapon();
    }
}
