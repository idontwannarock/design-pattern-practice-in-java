package designPattern.ch2.observer.adventureGame.character;

import designPattern.ch2.observer.adventureGame.behavior.WeaponBehavior;

public class Knight extends Character {

    public Knight(String characterName, WeaponBehavior weaponBehavior) {
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
