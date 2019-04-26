package ch1.strategyPattern.actionGame.character;

import ch1.strategyPattern.actionGame.behavior.AxeBehavior;

public class King extends Character {

    @Override
    public void fight() {
        setWeapon(new AxeBehavior());
        weapon.useWeapon();
    }
}
