package designPattern.ch1.strategy.adventureGame.behavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("cutting with a knife.");
    }
}
