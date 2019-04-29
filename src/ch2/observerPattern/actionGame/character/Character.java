package ch2.observerPattern.actionGame.character;

import ch2.observerPattern.actionGame.behavior.WeaponBehavior;
import ch2.observerPattern.actionGame.display.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Character implements Subject {

    List<Observer> displays;

    private String characterName;

    private Long weaponUsedCount;

    private Boolean isStatusChanged = false;

    private WeaponBehavior weapon;

    public Character(String characterName, WeaponBehavior weaponBehavior) {
        this.characterName = characterName;
        this.setWeaponUsedCount(0L);
        this.setWeapon(weaponBehavior);
        this.displays = new ArrayList<>();
        this.setChanged();
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Long getWeaponUsedCount() {
        return weaponUsedCount;
    }

    public void setWeaponUsedCount(Long weaponUsedCount) {
        this.weaponUsedCount = weaponUsedCount;
    }

    @Override
    public void setChanged() {
        this.isStatusChanged = true;
    }

    void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    void useWeaponOnce() {
        weaponUsedCount += this.weapon.useWeapon();
    }

    public abstract void fight();

    @Override
    public void registerObserver(Observer o) {
        displays.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        displays.remove(o);
    }

    @Override
    public void notifyObservers() {
        if (isStatusChanged) {
            displays.forEach(display -> display.update(this));
            isStatusChanged = false;
        }
    }

    @Override
    public String toString() {
        return "{characterName='" + characterName + "', weaponUsedCount=" + weaponUsedCount + '}';
    }
}
