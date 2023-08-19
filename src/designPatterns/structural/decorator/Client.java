package designPatterns.structural.decorator;

import designPatterns.structural.decorator.base.Milk;
import designPatterns.structural.decorator.base.PlainMilk;
import designPatterns.structural.decorator.decorators.CaramelDecorator;
import designPatterns.structural.decorator.decorators.CoffeeDecorator;
import designPatterns.structural.decorator.decorators.WhippedCreamDecorator;

public class Client {
    public static void main(String[] args) {
        Milk milk = new PlainMilk();
        System.out.println("Cost: " + milk.getCost() + ", Description: " + milk.getDescription());

        milk = new CoffeeDecorator(milk);
        System.out.println("Cost: " + milk.getCost() + ", Description: " + milk.getDescription());

        milk = new CaramelDecorator(milk);
        System.out.println("Cost: " + milk.getCost() + ", Description: " + milk.getDescription());

        milk = new WhippedCreamDecorator(milk);
        System.out.println("Cost: " + milk.getCost() + ", Description: " + milk.getDescription());
    }
}
