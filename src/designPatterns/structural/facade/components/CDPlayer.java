package designPatterns.structural.facade.components;

public class CDPlayer {
    public void load(String audio) {
        System.out.println("CD loaded with: " + audio);
    }

    public void play() {
        System.out.println("CD playing");
    }

    public void stop() {
        System.out.println("CD stopped");
    }

    public void eject() {
        System.out.println("CD ejected");
    }
}
