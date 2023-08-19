package designPatterns.structural.adapter.legacy;

public class Rectangle {
    public double length, breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;

    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);

    }
}
