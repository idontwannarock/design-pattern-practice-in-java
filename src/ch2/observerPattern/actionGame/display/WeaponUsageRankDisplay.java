package ch2.observerPattern.actionGame.display;

import ch2.observerPattern.actionGame.character.Character;
import ch2.observerPattern.actionGame.character.Subject;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class WeaponUsageRankDisplay implements Observer, DisplayElement {

    private Set<Character> rankedCharacters;

    public WeaponUsageRankDisplay() {
        rankedCharacters = new TreeSet<>(Comparator.comparing(Character::getCharacterName));
    }

    @Override
    public void update(Subject subject) {
        Character character = (Character) subject;
        rankedCharacters.add(character);
        display();
    }

    @Override
    public void subscribe(Subject subject) {
        Character character = (Character) subject;
        rankedCharacters.add(character);
        character.registerObserver(this);
    }

    @Override
    public void unsubscribe(Subject subject) {
        Character character = (Character) subject;
        rankedCharacters.remove(character);
        character.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Weapon Usage Rank:");
        System.out.println(rankedCharacters.stream()
                .sorted(Comparator.comparingLong(Character::getWeaponUsedCount).reversed())
                .collect(Collectors.toList()));
        System.out.println();
    }
}
