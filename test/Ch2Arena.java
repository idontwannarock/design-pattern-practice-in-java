import ch2.observerPattern.actionGame.behavior.SwordBehavior;
import ch2.observerPattern.actionGame.character.Character;
import ch2.observerPattern.actionGame.character.King;
import ch2.observerPattern.actionGame.character.Knight;
import ch2.observerPattern.actionGame.display.WeaponUsageRankDisplay;
import org.junit.Test;

public class Ch2Arena {

    @Test
    public void main() {
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
