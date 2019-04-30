package designPattern.ch1.strategy.adventureGame.character;

import designPattern.ch1.strategy.adventureGame.behavior.KnifeBehavior;

public class Troll extends Character {

    @Override
    public void fight() {
        setWeapon(new KnifeBehavior());
        weapon.useWeapon();
    }
}
