package designPattern.ch2.observer.adventureGame;

import designPattern.ch2.observer.adventureGame.behavior.SwordBehavior;
import designPattern.ch2.observer.adventureGame.character.Character;
import designPattern.ch2.observer.adventureGame.character.King;
import designPattern.ch2.observer.adventureGame.character.Knight;
import designPattern.ch2.observer.adventureGame.display.WeaponUsageRankDisplay;

public class Area {

    public static void main(String[] args) {
        Character arthur = new King("Arthur", new SwordBehavior());
        Character lancelot = new Knight("Lancelot", new SwordBehavior());
        Character galahad = new Knight("Galahad", new SwordBehavior());

        WeaponUsageRankDisplay weaponUsageRankDisplay = new WeaponUsageRankDisplay();
        weaponUsageRankDisplay.subscribe(arthur);
        weaponUsageRankDisplay.subscribe(lancelot);
        weaponUsageRankDisplay.subscribe(galahad);

        weaponUsageRankDisplay.display();

        arthur.fight();
        arthur.fight();
        arthur.fight();
        lancelot.fight();
        lancelot.fight();
        lancelot.fight();
        lancelot.fight();

        weaponUsageRankDisplay.unsubscribe(arthur);

        arthur.fight();

        weaponUsageRankDisplay.display();
    }
}
