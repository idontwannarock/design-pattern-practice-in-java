package ch2.observerPattern.actionGame.character;

import ch2.observerPattern.actionGame.behavior.WeaponBehavior;

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
