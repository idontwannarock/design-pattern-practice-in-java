package designPattern.ch1.strategy.adventureGame.character;

import designPattern.ch1.strategy.adventureGame.behavior.AxeBehavior;

public class King extends Character {

    @Override
    public void fight() {
        setWeapon(new AxeBehavior());
        weapon.useWeapon();
    }
}
