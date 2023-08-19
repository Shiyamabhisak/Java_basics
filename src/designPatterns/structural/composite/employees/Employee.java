package designPatterns.structural.composite.employees;

public interface Employee {
    void add(Employee employee);
    void remove(Employee employee);
    String getName();
    double getSalary();
    void print();
}
