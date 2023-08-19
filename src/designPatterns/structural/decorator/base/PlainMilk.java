package designPatterns.structural.decorator.base;

public class PlainMilk implements Milk{

    @Override
    public double getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Simple Milk";
    }
}
