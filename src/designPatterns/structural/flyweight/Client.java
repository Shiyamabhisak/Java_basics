package designPatterns.structural.flyweight;

import designPatterns.structural.flyweight.textedit.TextEditor;

public class Client {
    public static void main(String[] args) {
        TextEditor text = new TextEditor();
        text.addCharacter('a');
        text.addCharacter('b');
        text.addCharacter('c');
        text.addCharacter('a');
        text.addCharacter('b');
        text.addCharacter('c');
        text.addCharacter('a');
        text.addCharacter('d');

        text.displayCharacters();
    }
}
