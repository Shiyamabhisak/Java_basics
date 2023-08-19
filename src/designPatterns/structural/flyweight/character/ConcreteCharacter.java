package designPatterns.structural.flyweight.character;

public class ConcreteCharacter implements Character{
    private char character;

    public ConcreteCharacter(char character) {
        this.character = character;
    }

    public void display() {
        System.out.println("Character: " + character);
    }
}
