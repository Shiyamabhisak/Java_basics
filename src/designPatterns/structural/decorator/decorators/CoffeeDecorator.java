package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.base.Milk;

public class CoffeeDecorator extends MilkDecorator{
    public CoffeeDecorator(Milk decoratedMilk) {
        super(decoratedMilk);
    }

    @Override
    public double getCost() {
        return super.getCost() + 25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Coffee";
    }
}
