package ch1.strategyPattern.actionGame.character;

import ch1.strategyPattern.actionGame.behavior.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    public abstract void fight();

    void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
