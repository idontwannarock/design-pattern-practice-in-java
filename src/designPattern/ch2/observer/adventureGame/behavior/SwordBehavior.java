package designPattern.ch2.observer.adventureGame.behavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public Integer useWeapon() {
        System.out.println("Swinging a sword.");
        return 1;
    }
}
