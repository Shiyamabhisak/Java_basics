package designPatterns.structural.bridge.abstraction;
import designPatterns.structural.bridge.implementation.DrawingAPI;

public class Square extends Shape {

    private double x, y, sideLength;

    public Square(double x, double y, double sideLength, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    public void draw() {
        drawingAPI.drawSquare(x, y, sideLength);
    }
}
