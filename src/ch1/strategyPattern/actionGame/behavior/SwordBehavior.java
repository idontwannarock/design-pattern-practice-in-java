package ch1.strategyPattern.actionGame.behavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("swinging a sword.");
    }
}