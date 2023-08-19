package designPatterns.structural.composite.employees;

public class IndividualEmployee implements Employee{
    private String name;
    private double salary;

    public IndividualEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
        // Individual employees do not have subordinates, so this operation is not applicable.
    }

    public void remove(Employee employee) {
        // Individual employees do not have subordinates, so this operation is not applicable.
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void print() {
        System.out.println("Employee: " + getName() + ", Salary: " + getSalary());
    }
}
