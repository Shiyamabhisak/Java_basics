package designPatterns.structural.bridge.implementation;

public class DrawingAPI1 implements DrawingAPI{
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing Circle [API 1] at (" + x + ", " + y + ") with radius " + radius);
    }

    public void drawSquare(double x, double y, double sideLength) {
        System.out.println("Drawing Square [API 1] at (" + x + ", " + y + ") with side length " + sideLength);
    }
}
