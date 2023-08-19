package designPatterns.structural.bridge.implementation;

public interface DrawingAPI {
    void drawCircle(double x, double y, double radius);
    void drawSquare(double x, double y, double sideLength);
}
