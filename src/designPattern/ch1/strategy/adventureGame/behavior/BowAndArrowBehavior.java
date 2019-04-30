package designPattern.ch1.strategy.adventureGame.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("shooting an arrow with a bow.");
    }
}
