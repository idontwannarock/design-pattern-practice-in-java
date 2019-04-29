import ch1.strategyPattern.actionGame.character.Character;
import ch1.strategyPattern.actionGame.character.King;
import org.junit.Test;

public class Ch1Arena {

    @Test
    public void main() {
        Character character = new King();
        character.fight();
    }
}
