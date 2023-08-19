package designPatterns.structural.composite.org;

import designPatterns.structural.composite.employees.Employee;
import designPatterns.structural.composite.employees.IndividualEmployee;
import designPatterns.structural.composite.employees.Manager;

public class Organization {
    public static void main(String[] args) {
        Employee john = new IndividualEmployee("John", 5000);
        Employee alice = new IndividualEmployee("Alice", 4000);
        Employee bob = new IndividualEmployee("Bob", 4500);

        Manager manager = new Manager("Mike", 8000);
        manager.add(john);
        manager.add(alice);

        Manager seniorManager = new Manager("Julia", 10000);
        seniorManager.add(manager);
        seniorManager.add(bob);

        seniorManager.print();
    }
}
