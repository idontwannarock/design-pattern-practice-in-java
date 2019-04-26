package ch1.strategyPattern.actionGame.behavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("cutting with a knife.");
    }
}
