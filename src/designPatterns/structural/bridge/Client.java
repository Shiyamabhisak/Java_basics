package designPatterns.structural.bridge;

import designPatterns.structural.bridge.abstraction.Circle;
import designPatterns.structural.bridge.abstraction.Shape;
import designPatterns.structural.bridge.abstraction.Square;
import designPatterns.structural.bridge.implementation.DrawingAPI;
import designPatterns.structural.bridge.implementation.DrawingAPI1;
import designPatterns.structural.bridge.implementation.DrawingAPI2;

public class Client {
    public static void main(String[] args) {
        DrawingAPI drawingAPI1 = new DrawingAPI1();
        Shape circle = new Circle(1, 2, 3, drawingAPI1);
        circle.draw();

        DrawingAPI drawingAPI2 = new DrawingAPI2();
        Shape square = new Square(4, 5, 6, drawingAPI2);
        square.draw();
    }
}
