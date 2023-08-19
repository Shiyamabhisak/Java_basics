package designPatterns.structural.facade.components;

public class Speakers {
    public void on() {
        System.out.println("Speakers turned on");
    }

    public void off() {
        System.out.println("Speakers turned off");
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to: " + volume);
    }
}
