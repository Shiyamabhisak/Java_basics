package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.base.Milk;

public class CaramelDecorator extends MilkDecorator {
    public CaramelDecorator(Milk decoratedMilk) {
        super(decoratedMilk);
    }

    @Override
    public double getCost() {
        return super.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Caramel";
    }
}
