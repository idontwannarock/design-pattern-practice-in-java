package designPattern.ch3.decorator.adventureGame.character;

import designPattern.ch1.strategy.adventureGame.behavior.SwordBehavior;

public class Knight extends Character {

    @Override
    public void fight() {
        setWeapon(new SwordBehavior());
        this.weapon.useWeapon();
    }
}
