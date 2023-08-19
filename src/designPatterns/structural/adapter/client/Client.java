package designPatterns.structural.adapter.client;
import designPatterns.structural.adapter.legacy.Rectangle;
import designPatterns.structural.adapter.rectangleadapter.RectangleShapesAdapter;
import designPatterns.structural.adapter.shapes.Shapes;
import designPatterns.structural.adapter.shapes.Square;

public class Client {
    public void printShapeDetails(Shapes shape) {
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }

    public static void main(String[] args) {
        Client client = new Client();
        //Print Square's Area & Perimeter
        Shapes square = new Square(50.00);
        client.printShapeDetails(square);
        //Print Rectangles Area & Perimeter
        Rectangle legacyRectangle = new Rectangle(49.00,51.00);
        Shapes adaptedRectangle = new RectangleShapesAdapter(legacyRectangle);
        client.printShapeDetails(adaptedRectangle);
    }
}
