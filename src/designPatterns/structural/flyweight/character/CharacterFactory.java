package designPatterns.structural.flyweight.character;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<java.lang.Character, Character> characters = new HashMap<>();

    public Character getCharacter(char c) {
        if (characters.containsKey(c)) {
            return characters.get(c);
        } else {
            Character character = new ConcreteCharacter(c);
            characters.put(c, character);
            return character;
        }
    }
}
