package designPattern.ch1.strategy.adventureGame.character;

import designPattern.ch1.strategy.adventureGame.behavior.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    public abstract void fight();

    void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
