package designPattern.ch2.observer.adventureGame.character;

import designPattern.ch2.observer.adventureGame.behavior.WeaponBehavior;

public class King extends Character {

    public King(String characterName, WeaponBehavior weaponBehavior) {
        super(characterName, weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.print(getCharacterName() + " moves: ");
        useWeaponOnce();
        System.out.println();
        setChanged();
        notifyObservers();
    }
}
