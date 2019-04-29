package ch2.observerPattern.actionGame.character;

import ch2.observerPattern.actionGame.behavior.WeaponBehavior;

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
