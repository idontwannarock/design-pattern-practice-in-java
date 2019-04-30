package designPattern.ch3.decorator.adventureGame.character;

import designPattern.ch1.strategy.adventureGame.behavior.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    private String depiction = "Adventurer";

    void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public String getDepiction() {
        return depiction;
    }

    public void selfIntroduction() {
        System.out.println("Hi! I am a " + this.getDepiction() + ".");
    }

    public abstract void fight();
}
