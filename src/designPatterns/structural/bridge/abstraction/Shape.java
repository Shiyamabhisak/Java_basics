package designPatterns.structural.bridge.abstraction;

import designPatterns.structural.bridge.implementation.DrawingAPI;

public abstract class Shape {
    protected DrawingAPI drawingAPI;

    public Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
}