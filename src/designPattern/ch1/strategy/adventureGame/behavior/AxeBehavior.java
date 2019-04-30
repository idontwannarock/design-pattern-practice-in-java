package designPattern.ch1.strategy.adventureGame.behavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("chopping with an axe.");
    }
}
