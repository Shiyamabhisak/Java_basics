package designPatterns.structural.composite.employees;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private double salary;
    private List<Employee> subordinates;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void print() {
        System.out.println("Manager: " + getName() + ", Salary: " + getSalary());
        for (Employee subordinate : subordinates) {
            subordinate.print();
        }
    }
}
