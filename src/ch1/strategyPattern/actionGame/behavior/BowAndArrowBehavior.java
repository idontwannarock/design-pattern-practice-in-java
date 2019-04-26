package ch1.strategyPattern.actionGame.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("shooting an arrow with a bow.");
    }
}
