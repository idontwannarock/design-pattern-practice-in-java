package designPattern.ch1.strategy.adventureGame.character;

import designPattern.ch1.strategy.adventureGame.behavior.SwordBehavior;

public class Knight extends Character {

    @Override
    public void fight() {
        setWeapon(new SwordBehavior());
        weapon.useWeapon();
    }
}
