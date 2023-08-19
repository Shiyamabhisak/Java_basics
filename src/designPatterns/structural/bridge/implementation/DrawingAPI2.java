package designPatterns.structural.bridge.implementation;

public class DrawingAPI2 implements DrawingAPI{
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing Circle [API 2] at (" + x + ", " + y + ") with radius " + radius);
    }

    public void drawSquare(double x, double y, double sideLength) {
        System.out.println("Drawing Square [API 2] at (" + x + ", " + y + ") with side length " + sideLength);
    }
}
