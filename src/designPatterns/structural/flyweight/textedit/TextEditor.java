package designPatterns.structural.flyweight.textedit;

import designPatterns.structural.flyweight.character.Character;
import designPatterns.structural.flyweight.character.CharacterFactory;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private CharacterFactory characterFactory = new CharacterFactory();
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(char c) {
        Character character = characterFactory.getCharacter(c);
        characters.add(character);
    }

    public void displayCharacters() {
        for (Character character : characters) {
            character.display();
        }
    }
}
