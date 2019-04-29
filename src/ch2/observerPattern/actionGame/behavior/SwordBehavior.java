package ch2.observerPattern.actionGame.behavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public Integer useWeapon() {
        System.out.println("Swinging a sword.");
        return 1;
    }
}
