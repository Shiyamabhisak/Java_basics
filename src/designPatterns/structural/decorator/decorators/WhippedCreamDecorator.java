package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.base.Milk;

public class WhippedCreamDecorator extends MilkDecorator{
    public WhippedCreamDecorator(Milk decoratedMilk) {
        super(decoratedMilk);
    }

    @Override
    public double getCost() {
        return super.getCost() + 75;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whipped Cream";
    }
}
