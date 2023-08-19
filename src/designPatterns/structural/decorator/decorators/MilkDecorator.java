package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.base.Milk;

public abstract class MilkDecorator implements Milk{
    protected Milk decoratedMilk;

    public MilkDecorator(Milk decoratedCoffee) {
        this.decoratedMilk = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return decoratedMilk.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedMilk.getDescription();
    }
}
