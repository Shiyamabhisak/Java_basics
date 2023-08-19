package designPatterns.creational.prototype;

import designPatterns.creational.prototype.shapes.Shape;
import designPatterns.creational.prototype.shapes.Circle;
import designPatterns.creational.prototype.shapes.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "red";
        shapes.add(rectangle);

        Rectangle anotherRectangle = (Rectangle) rectangle.clone();
        shapes.add(anotherRectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(shapes.get(i) + " & " +  shapesCopy.get(i)+ " are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(shapes.get(i) + " & " +  shapesCopy.get(i)+ " are identical objects because they are cloned objects.");
                } else {
                    System.out.println(shapes.get(i) + " & " +  shapesCopy.get(i)+ " are not identical objects.");
                }
            } else {
                System.out.println(shapes.get(i) + " & " +  shapesCopy.get(i)+ " are the same Objects.");
            }
        }
    }
}
