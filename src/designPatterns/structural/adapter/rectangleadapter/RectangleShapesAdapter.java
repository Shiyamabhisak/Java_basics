package designPatterns.structural.adapter.rectangleadapter;

import designPatterns.structural.adapter.legacy.Rectangle;
import designPatterns.structural.adapter.shapes.Shapes;

public class RectangleShapesAdapter implements Shapes {
    private Rectangle legacyRectangle;

    public RectangleShapesAdapter(Rectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    public double calculateArea() {
        return legacyRectangle.calculateArea();
    }

    public double calculatePerimeter() {
        return legacyRectangle.calculatePerimeter();
    }
}
