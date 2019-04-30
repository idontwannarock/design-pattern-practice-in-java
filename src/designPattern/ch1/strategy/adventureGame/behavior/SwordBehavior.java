package designPattern.ch1.strategy.adventureGame.behavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("swinging a sword.");
    }
}
